package com.google.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    CodedInputStreamReader wrapper;

    private static final class ArrayDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private void recomputeBufferSizeAfterLimit() {
            int i13 = this.limit + this.bufferSizeAfterLimit;
            this.limit = i13;
            int i14 = i13 - this.startPos;
            int i15 = this.currentLimit;
            if (i14 <= i15) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i16 = i14 - i15;
            this.bufferSizeAfterLimit = i16;
            this.limit = i13 - i16;
        }

        private void skipRawVarint() throws IOException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i13 = 0; i13 < 10; i13++) {
                byte[] bArr = this.buffer;
                int i14 = this.pos;
                this.pos = i14 + 1;
                if (bArr[i14] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i13 = 0; i13 < 10; i13++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i13) throws InvalidProtocolBufferException {
            if (this.lastTag != i13) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z13) {
            this.enableAliasing = z13;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i13 = this.currentLimit;
            if (i13 == Integer.MAX_VALUE) {
                return -1;
            }
            return i13 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i13) {
            this.currentLimit = i13;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i13) throws InvalidProtocolBufferException {
            if (i13 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i13 + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i14 = this.currentLimit;
            if (totalBytesRead > i14) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i14;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i13 = this.limit;
                int i14 = this.pos;
                if (rawVarint32 <= i13 - i14) {
                    ByteBuffer byteBufferWrap = (this.immutable || !this.enableAliasing) ? ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i14, i14 + rawVarint32)) : ByteBuffer.wrap(this.buffer, i14, rawVarint32).slice();
                    this.pos += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i13 = this.limit;
                int i14 = this.pos;
                if (rawVarint32 <= i13 - i14) {
                    ByteString byteStringWrap = (this.immutable && this.enableAliasing) ? ByteString.wrap(this.buffer, i14, rawVarint32) : ByteString.copyFrom(this.buffer, i14, rawVarint32);
                    this.pos += rawVarint32;
                    return byteStringWrap;
                }
            }
            return rawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(rawVarint32));
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i13, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i13, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            int i13 = this.pos;
            if (i13 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i13 + 1;
            return bArr[i13];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i13) throws IOException {
            if (i13 > 0) {
                int i14 = this.limit;
                int i15 = this.pos;
                if (i13 <= i14 - i15) {
                    int i16 = i13 + i15;
                    this.pos = i16;
                    return Arrays.copyOfRange(this.buffer, i15, i16);
                }
            }
            if (i13 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i13 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            int i13 = this.pos;
            if (this.limit - i13 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i13 + 4;
            return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            int i13 = this.pos;
            if (this.limit - i13 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i13 + 8;
            return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
            int i13;
            int i14 = this.pos;
            int i15 = this.limit;
            if (i15 != i14) {
                byte[] bArr = this.buffer;
                int i16 = i14 + 1;
                byte b13 = bArr[i14];
                if (b13 >= 0) {
                    this.pos = i16;
                    return b13;
                }
                if (i15 - i16 >= 9) {
                    int i17 = i14 + 2;
                    int i18 = (bArr[i16] << 7) ^ b13;
                    if (i18 < 0) {
                        i13 = i18 ^ (-128);
                    } else {
                        int i19 = i14 + 3;
                        int i23 = (bArr[i17] << 14) ^ i18;
                        if (i23 >= 0) {
                            i13 = i23 ^ 16256;
                        } else {
                            int i24 = i14 + 4;
                            int i25 = i23 ^ (bArr[i19] << 21);
                            if (i25 < 0) {
                                i13 = (-2080896) ^ i25;
                            } else {
                                i19 = i14 + 5;
                                byte b14 = bArr[i24];
                                int i26 = (i25 ^ (b14 << 28)) ^ 266354560;
                                if (b14 < 0) {
                                    i24 = i14 + 6;
                                    if (bArr[i19] < 0) {
                                        i19 = i14 + 7;
                                        if (bArr[i24] < 0) {
                                            i24 = i14 + 8;
                                            if (bArr[i19] < 0) {
                                                i19 = i14 + 9;
                                                if (bArr[i24] < 0) {
                                                    int i27 = i14 + 10;
                                                    if (bArr[i19] >= 0) {
                                                        i17 = i27;
                                                        i13 = i26;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i13 = i26;
                                }
                                i13 = i26;
                            }
                            i17 = i24;
                        }
                        i17 = i19;
                    }
                    this.pos = i17;
                    return i13;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j13;
            long j14;
            long j15;
            int i13 = this.pos;
            int i14 = this.limit;
            if (i14 != i13) {
                byte[] bArr = this.buffer;
                int i15 = i13 + 1;
                byte b13 = bArr[i13];
                if (b13 >= 0) {
                    this.pos = i15;
                    return b13;
                }
                if (i14 - i15 >= 9) {
                    int i16 = i13 + 2;
                    int i17 = (bArr[i15] << 7) ^ b13;
                    if (i17 < 0) {
                        j13 = i17 ^ (-128);
                    } else {
                        int i18 = i13 + 3;
                        int i19 = (bArr[i16] << 14) ^ i17;
                        if (i19 >= 0) {
                            j13 = i19 ^ 16256;
                            i16 = i18;
                        } else {
                            int i23 = i13 + 4;
                            int i24 = i19 ^ (bArr[i18] << 21);
                            if (i24 < 0) {
                                long j16 = (-2080896) ^ i24;
                                i16 = i23;
                                j13 = j16;
                            } else {
                                long j17 = i24;
                                i16 = i13 + 5;
                                long j18 = j17 ^ (((long) bArr[i23]) << 28);
                                if (j18 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    int i25 = i13 + 6;
                                    long j19 = j18 ^ (((long) bArr[i16]) << 35);
                                    if (j19 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        i16 = i13 + 7;
                                        j18 = j19 ^ (((long) bArr[i25]) << 42);
                                        if (j18 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            i25 = i13 + 8;
                                            j19 = j18 ^ (((long) bArr[i16]) << 49);
                                            if (j19 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                i16 = i13 + 9;
                                                long j23 = (j19 ^ (((long) bArr[i25]) << 56)) ^ 71499008037633920L;
                                                if (j23 < 0) {
                                                    int i26 = i13 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i16 = i26;
                                                    }
                                                }
                                                j13 = j23;
                                            }
                                        }
                                    }
                                    j13 = j19 ^ j14;
                                    i16 = i25;
                                }
                                j13 = j18 ^ j15;
                            }
                        }
                    }
                    this.pos = i16;
                    return j13;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j13 = 0;
            for (int i13 = 0; i13 < 64; i13 += 7) {
                byte rawByte = readRawByte();
                j13 |= ((long) (rawByte & 127)) << i13;
                if ((rawByte & 128) == 0) {
                    return j13;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i13 = this.limit;
                int i14 = this.pos;
                if (rawVarint32 <= i13 - i14) {
                    String str = new String(this.buffer, i14, rawVarint32, Internal.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i13 = this.limit;
                int i14 = this.pos;
                if (rawVarint32 <= i13 - i14) {
                    String strDecodeUtf8 = Utf8.decodeUtf8(this.buffer, i14, rawVarint32);
                    this.pos += rawVarint32;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i13, MessageLite.Builder builder) throws IOException {
            readGroup(i13, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i13) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i13);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i13), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i13) throws IOException {
            if (i13 >= 0) {
                int i14 = this.limit;
                int i15 = this.pos;
                if (i13 <= i14 - i15) {
                    this.pos = i15 + i13;
                    return;
                }
            }
            if (i13 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        private ArrayDecoder(byte[] bArr, int i13, int i14, boolean z13) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.limit = i14 + i13;
            this.pos = i13;
            this.startPos = i13;
            this.immutable = z13;
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i13, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i13, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i13, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i13);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i13);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i13), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private final Iterable<ByteBuffer> input;
        private final Iterator<ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private void getNextByteBuffer() throws InvalidProtocolBufferException {
            if (!this.iterator.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            tryGetNextByteBuffer();
        }

        private void readRawBytesTo(byte[] bArr, int i13, int i14) throws IOException {
            if (i14 < 0 || i14 > remaining()) {
                if (i14 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i14 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i15 = i14;
            while (i15 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i15, (int) currentRemaining());
                long j13 = iMin;
                UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, (i14 - i15) + i13, j13);
                i15 -= iMin;
                this.currentByteBufferPos += j13;
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            int i13 = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
            this.totalBufferSize = i13;
            int i14 = i13 - this.startOffset;
            int i15 = this.currentLimit;
            if (i14 <= i15) {
                this.bufferSizeAfterCurrentLimit = 0;
                return;
            }
            int i16 = i14 - i15;
            this.bufferSizeAfterCurrentLimit = i16;
            this.totalBufferSize = i13 - i16;
        }

        private int remaining() {
            return (int) ((((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private void skipRawVarint() throws IOException {
            for (int i13 = 0; i13 < 10; i13++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(int i13, int i14) throws IOException {
            int iPosition = this.currentByteBuffer.position();
            int iLimit = this.currentByteBuffer.limit();
            ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(i13);
                    byteBuffer.limit(i14);
                    ByteBuffer byteBufferSlice = this.currentByteBuffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (Throwable th2) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th2;
            }
        }

        private void tryGetNextByteBuffer() {
            ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
            long jPosition = next.position();
            this.currentByteBufferPos = jPosition;
            this.currentByteBufferStartPos = jPosition;
            this.currentByteBufferLimit = this.currentByteBuffer.limit();
            long jAddressOffset = UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentAddress = jAddressOffset;
            this.currentByteBufferPos += jAddressOffset;
            this.currentByteBufferStartPos += jAddressOffset;
            this.currentByteBufferLimit += jAddressOffset;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i13) throws InvalidProtocolBufferException {
            if (this.lastTag != i13) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z13) {
            this.enableAliasing = z13;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i13 = this.currentLimit;
            if (i13 == Integer.MAX_VALUE) {
                return -1;
            }
            return i13 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) ((((long) (this.totalBytesRead - this.startOffset)) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i13) {
            this.currentLimit = i13;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i13) throws InvalidProtocolBufferException {
            if (i13 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i13 + getTotalBytesRead();
            int i14 = this.currentLimit;
            if (totalBytesRead > i14) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i14;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j13 = rawVarint32;
                if (j13 <= currentRemaining()) {
                    if (this.immutable || !this.enableAliasing) {
                        byte[] bArr = new byte[rawVarint32];
                        UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j13);
                        this.currentByteBufferPos += j13;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j14 = this.currentByteBufferPos + j13;
                    this.currentByteBufferPos = j14;
                    long j15 = this.currentAddress;
                    return slice((int) ((j14 - j15) - j13), (int) (j14 - j15));
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j13 = rawVarint32;
                long j14 = this.currentByteBufferLimit;
                long j15 = this.currentByteBufferPos;
                if (j13 <= j14 - j15) {
                    if (this.immutable && this.enableAliasing) {
                        int i13 = (int) (j15 - this.currentAddress);
                        ByteString byteStringWrap = ByteString.wrap(slice(i13, rawVarint32 + i13));
                        this.currentByteBufferPos += j13;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    UnsafeUtil.copyMemory(j15, bArr, 0L, j13);
                    this.currentByteBufferPos += j13;
                    return ByteString.wrap(bArr);
                }
            }
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.immutable || !this.enableAliasing) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (rawVarint32 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(rawVarint32, (int) currentRemaining());
                int i14 = (int) (this.currentByteBufferPos - this.currentAddress);
                arrayList.add(ByteString.wrap(slice(i14, i14 + iMin)));
                rawVarint32 -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
            return ByteString.copyFrom(arrayList);
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i13, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i13, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j13 = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j13;
            return UnsafeUtil.getByte(j13);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i13) throws IOException {
            if (i13 >= 0) {
                long j13 = i13;
                if (j13 <= currentRemaining()) {
                    byte[] bArr = new byte[i13];
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j13);
                    this.currentByteBufferPos += j13;
                    return bArr;
                }
            }
            if (i13 >= 0 && i13 <= remaining()) {
                byte[] bArr2 = new byte[i13];
                readRawBytesTo(bArr2, 0, i13);
                return bArr2;
            }
            if (i13 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i13 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            if (currentRemaining() < 4) {
                return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
            }
            long j13 = this.currentByteBufferPos;
            this.currentByteBufferPos = 4 + j13;
            return ((UnsafeUtil.getByte(j13 + 3) & 255) << 24) | (UnsafeUtil.getByte(j13) & 255) | ((UnsafeUtil.getByte(1 + j13) & 255) << 8) | ((UnsafeUtil.getByte(2 + j13) & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            long rawByte;
            byte rawByte2;
            if (currentRemaining() >= 8) {
                long j13 = this.currentByteBufferPos;
                this.currentByteBufferPos = 8 + j13;
                rawByte = (((long) UnsafeUtil.getByte(j13)) & 255) | ((((long) UnsafeUtil.getByte(1 + j13)) & 255) << 8) | ((((long) UnsafeUtil.getByte(2 + j13)) & 255) << 16) | ((((long) UnsafeUtil.getByte(3 + j13)) & 255) << 24) | ((((long) UnsafeUtil.getByte(4 + j13)) & 255) << 32) | ((((long) UnsafeUtil.getByte(5 + j13)) & 255) << 40) | ((((long) UnsafeUtil.getByte(6 + j13)) & 255) << 48);
                rawByte2 = UnsafeUtil.getByte(j13 + 7);
            } else {
                rawByte = (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48);
                rawByte2 = readRawByte();
            }
            return ((((long) rawByte2) & 255) << 56) | rawByte;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
            int i13;
            long j13 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j13) {
                long j14 = j13 + 1;
                byte b13 = UnsafeUtil.getByte(j13);
                if (b13 >= 0) {
                    this.currentByteBufferPos++;
                    return b13;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j15 = 2 + j13;
                    int i14 = (UnsafeUtil.getByte(j14) << 7) ^ b13;
                    if (i14 < 0) {
                        i13 = i14 ^ (-128);
                    } else {
                        long j16 = 3 + j13;
                        int i15 = (UnsafeUtil.getByte(j15) << 14) ^ i14;
                        if (i15 >= 0) {
                            i13 = i15 ^ 16256;
                        } else {
                            long j17 = 4 + j13;
                            int i16 = i15 ^ (UnsafeUtil.getByte(j16) << 21);
                            if (i16 < 0) {
                                i13 = (-2080896) ^ i16;
                            } else {
                                j16 = 5 + j13;
                                byte b14 = UnsafeUtil.getByte(j17);
                                int i17 = (i16 ^ (b14 << 28)) ^ 266354560;
                                if (b14 < 0) {
                                    j17 = 6 + j13;
                                    if (UnsafeUtil.getByte(j16) < 0) {
                                        j16 = 7 + j13;
                                        if (UnsafeUtil.getByte(j17) < 0) {
                                            j17 = 8 + j13;
                                            if (UnsafeUtil.getByte(j16) < 0) {
                                                j16 = 9 + j13;
                                                if (UnsafeUtil.getByte(j17) < 0) {
                                                    long j18 = j13 + 10;
                                                    if (UnsafeUtil.getByte(j16) >= 0) {
                                                        i13 = i17;
                                                        j15 = j18;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i13 = i17;
                                }
                                i13 = i17;
                            }
                            j15 = j17;
                        }
                        j15 = j16;
                    }
                    this.currentByteBufferPos = j15;
                    return i13;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j13;
            long j14;
            long j15;
            long j16 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j16) {
                long j17 = j16 + 1;
                byte b13 = UnsafeUtil.getByte(j16);
                if (b13 >= 0) {
                    this.currentByteBufferPos++;
                    return b13;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j18 = 2 + j16;
                    int i13 = (UnsafeUtil.getByte(j17) << 7) ^ b13;
                    if (i13 < 0) {
                        j13 = i13 ^ (-128);
                    } else {
                        long j19 = 3 + j16;
                        int i14 = (UnsafeUtil.getByte(j18) << 14) ^ i13;
                        if (i14 >= 0) {
                            j13 = i14 ^ 16256;
                            j18 = j19;
                        } else {
                            long j23 = 4 + j16;
                            int i15 = i14 ^ (UnsafeUtil.getByte(j19) << 21);
                            if (i15 < 0) {
                                j13 = (-2080896) ^ i15;
                                j18 = j23;
                            } else {
                                long j24 = 5 + j16;
                                long j25 = (((long) UnsafeUtil.getByte(j23)) << 28) ^ ((long) i15);
                                if (j25 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    long j26 = 6 + j16;
                                    long j27 = j25 ^ (((long) UnsafeUtil.getByte(j24)) << 35);
                                    if (j27 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        j24 = 7 + j16;
                                        j25 = j27 ^ (((long) UnsafeUtil.getByte(j26)) << 42);
                                        if (j25 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            j26 = 8 + j16;
                                            j27 = j25 ^ (((long) UnsafeUtil.getByte(j24)) << 49);
                                            if (j27 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                j24 = 9 + j16;
                                                long j28 = (j27 ^ (((long) UnsafeUtil.getByte(j26)) << 56)) ^ 71499008037633920L;
                                                if (j28 < 0) {
                                                    long j29 = j16 + 10;
                                                    if (UnsafeUtil.getByte(j24) >= 0) {
                                                        j13 = j28;
                                                        j18 = j29;
                                                    }
                                                } else {
                                                    j13 = j28;
                                                    j18 = j24;
                                                }
                                            }
                                        }
                                    }
                                    j13 = j14 ^ j27;
                                    j18 = j26;
                                }
                                j13 = j15 ^ j25;
                                j18 = j24;
                            }
                        }
                    }
                    this.currentByteBufferPos = j18;
                    return j13;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j13 = 0;
            for (int i13 = 0; i13 < 64; i13 += 7) {
                byte rawByte = readRawByte();
                j13 |= ((long) (rawByte & 127)) << i13;
                if ((rawByte & 128) == 0) {
                    return j13;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j13 = rawVarint32;
                long j14 = this.currentByteBufferLimit;
                long j15 = this.currentByteBufferPos;
                if (j13 <= j14 - j15) {
                    byte[] bArr = new byte[rawVarint32];
                    UnsafeUtil.copyMemory(j15, bArr, 0L, j13);
                    String str = new String(bArr, Internal.UTF_8);
                    this.currentByteBufferPos += j13;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return new String(bArr2, Internal.UTF_8);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j13 = rawVarint32;
                long j14 = this.currentByteBufferLimit;
                long j15 = this.currentByteBufferPos;
                if (j13 <= j14 - j15) {
                    String strDecodeUtf8 = Utf8.decodeUtf8(this.currentByteBuffer, (int) (j15 - this.currentByteBufferStartPos), rawVarint32);
                    this.currentByteBufferPos += j13;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                readRawBytesTo(bArr, 0, rawVarint32);
                return Utf8.decodeUtf8(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i13, MessageLite.Builder builder) throws IOException {
            readGroup(i13, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startOffset = (int) ((((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i13) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i13);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i13), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i13) throws IOException {
            if (i13 < 0 || i13 > (((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (i13 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i13 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i13, (int) currentRemaining());
                i13 -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
        }

        private IterableDirectByteBufferDecoder(Iterable<ByteBuffer> iterable, int i13, boolean z13) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = i13;
            this.input = iterable;
            this.iterator = iterable.iterator();
            this.immutable = z13;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (i13 != 0) {
                tryGetNextByteBuffer();
                return;
            }
            this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
            this.currentByteBufferPos = 0L;
            this.currentByteBufferStartPos = 0L;
            this.currentByteBufferLimit = 0L;
            this.currentAddress = 0L;
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i13, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i13, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i13, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i13);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i13);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i13), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private static final class StreamDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        private int pos;
        private RefillCallback refillCallback;
        private int totalBytesRetired;

        private interface RefillCallback {
            void onRefill();
        }

        private class SkippedDataSink implements RefillCallback {
            private ByteArrayOutputStream byteArrayStream;
            private int lastPos;

            private SkippedDataSink() {
                this.lastPos = StreamDecoder.this.pos;
            }

            ByteBuffer getSkippedData() {
                ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                }
                byteArrayOutputStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos);
                return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }

            @Override // com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new ByteArrayOutputStream();
                }
                this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }
        }

        private static int available(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e13) {
                e13.setThrownFromInputStream();
                throw e13;
            }
        }

        private static int read(InputStream inputStream, byte[] bArr, int i13, int i14) throws IOException {
            try {
                return inputStream.read(bArr, i13, i14);
            } catch (InvalidProtocolBufferException e13) {
                e13.setThrownFromInputStream();
                throw e13;
            }
        }

        private ByteString readBytesSlowPath(int i13) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i13);
            if (rawBytesSlowPathOneChunk != null) {
                return ByteString.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i14 = this.pos;
            int i15 = this.bufferSize;
            int length = i15 - i14;
            this.totalBytesRetired += i15;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i13 - length);
            byte[] bArr = new byte[i13];
            System.arraycopy(this.buffer, i14, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        private byte[] readRawBytesSlowPath(int i13, boolean z13) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i13);
            if (rawBytesSlowPathOneChunk != null) {
                return z13 ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i14 = this.pos;
            int i15 = this.bufferSize;
            int length = i15 - i14;
            this.totalBytesRetired += i15;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i13 - length);
            byte[] bArr = new byte[i13];
            System.arraycopy(this.buffer, i14, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(int i13) throws IOException {
            if (i13 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i13 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i14 = this.totalBytesRetired;
            int i15 = this.pos;
            int i16 = i14 + i15 + i13;
            if (i16 - this.sizeLimit > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i17 = this.currentLimit;
            if (i16 > i17) {
                skipRawBytes((i17 - i14) - i15);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i18 = this.bufferSize - i15;
            int i19 = i13 - i18;
            if (i19 >= 4096 && i19 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[i13];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i18);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i18 < i13) {
                int i23 = read(this.input, bArr, i18, i13 - i18);
                if (i23 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i23;
                i18 += i23;
            }
            return bArr;
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int i13) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i13 > 0) {
                int iMin = Math.min(i13, 4096);
                byte[] bArr = new byte[iMin];
                int i14 = 0;
                while (i14 < iMin) {
                    int i15 = this.input.read(bArr, i14, iMin - i14);
                    if (i15 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += i15;
                    i14 += i15;
                }
                i13 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i13 = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i13;
            int i14 = this.totalBytesRetired + i13;
            int i15 = this.currentLimit;
            if (i14 <= i15) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i16 = i14 - i15;
            this.bufferSizeAfterLimit = i16;
            this.bufferSize = i13 - i16;
        }

        private void refillBuffer(int i13) throws IOException {
            if (tryRefillBuffer(i13)) {
                return;
            }
            if (i13 <= (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        private static long skip(InputStream inputStream, long j13) throws IOException {
            try {
                return inputStream.skip(j13);
            } catch (InvalidProtocolBufferException e13) {
                e13.setThrownFromInputStream();
                throw e13;
            }
        }

        private void skipRawBytesSlowPath(int i13) throws IOException {
            if (i13 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i14 = this.totalBytesRetired;
            int i15 = this.pos;
            int i16 = i14 + i15 + i13;
            int i17 = this.currentLimit;
            if (i16 > i17) {
                skipRawBytes((i17 - i14) - i15);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i18 = 0;
            if (this.refillCallback == null) {
                this.totalBytesRetired = i14 + i15;
                int i19 = this.bufferSize - i15;
                this.bufferSize = 0;
                this.pos = 0;
                i18 = i19;
                while (i18 < i13) {
                    try {
                        long j13 = i13 - i18;
                        long jSkip = skip(this.input, j13);
                        if (jSkip < 0 || jSkip > j13) {
                            throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i18 += (int) jSkip;
                        }
                    } finally {
                        this.totalBytesRetired += i18;
                        recomputeBufferSizeAfterLimit();
                    }
                }
            }
            if (i18 >= i13) {
                return;
            }
            int i23 = this.bufferSize;
            int i24 = i23 - this.pos;
            this.pos = i23;
            refillBuffer(1);
            while (true) {
                int i25 = i13 - i24;
                int i26 = this.bufferSize;
                if (i25 <= i26) {
                    this.pos = i25;
                    return;
                } else {
                    i24 += i26;
                    this.pos = i26;
                    refillBuffer(1);
                }
            }
        }

        private void skipRawVarint() throws IOException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i13 = 0; i13 < 10; i13++) {
                byte[] bArr = this.buffer;
                int i14 = this.pos;
                this.pos = i14 + 1;
                if (bArr[i14] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i13 = 0; i13 < 10; i13++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private boolean tryRefillBuffer(int i13) throws IOException {
            int i14 = this.pos;
            if (i14 + i13 <= this.bufferSize) {
                throw new IllegalStateException("refillBuffer() called when " + i13 + " bytes were already available in buffer");
            }
            int i15 = this.sizeLimit;
            int i16 = this.totalBytesRetired;
            if (i13 > (i15 - i16) - i14 || i16 + i14 + i13 > this.currentLimit) {
                return false;
            }
            RefillCallback refillCallback = this.refillCallback;
            if (refillCallback != null) {
                refillCallback.onRefill();
            }
            int i17 = this.pos;
            if (i17 > 0) {
                int i18 = this.bufferSize;
                if (i18 > i17) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i17, bArr, 0, i18 - i17);
                }
                this.totalBytesRetired += i17;
                this.bufferSize -= i17;
                this.pos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i19 = this.bufferSize;
            int i23 = read(inputStream, bArr2, i19, Math.min(bArr2.length - i19, (this.sizeLimit - this.totalBytesRetired) - i19));
            if (i23 == 0 || i23 < -1 || i23 > this.buffer.length) {
                throw new IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + i23 + "\nThe InputStream implementation is buggy.");
            }
            if (i23 <= 0) {
                return false;
            }
            this.bufferSize += i23;
            recomputeBufferSizeAfterLimit();
            if (this.bufferSize >= i13) {
                return true;
            }
            return tryRefillBuffer(i13);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i13) throws InvalidProtocolBufferException {
            if (this.lastTag != i13) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z13) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i13 = this.currentLimit;
            if (i13 == Integer.MAX_VALUE) {
                return -1;
            }
            return i13 - (this.totalBytesRetired + this.pos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i13) {
            this.currentLimit = i13;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i13) throws InvalidProtocolBufferException {
            if (i13 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i14 = i13 + this.totalBytesRetired + this.pos;
            int i15 = this.currentLimit;
            if (i14 > i15) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i14;
            recomputeBufferSizeAfterLimit();
            return i15;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i13 = this.bufferSize;
            int i14 = this.pos;
            if (rawVarint32 > i13 - i14 || rawVarint32 <= 0) {
                if (rawVarint32 >= 0) {
                    return readRawBytesSlowPath(rawVarint32, false);
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.buffer, i14, i14 + rawVarint32);
            this.pos += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i13 = this.bufferSize;
            int i14 = this.pos;
            if (rawVarint32 <= i13 - i14 && rawVarint32 > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i14, i14 + rawVarint32));
                this.pos += rawVarint32;
                return byteBufferWrap;
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 >= 0) {
                return ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i13 = this.bufferSize;
            int i14 = this.pos;
            if (rawVarint32 <= i13 - i14 && rawVarint32 > 0) {
                ByteString byteStringCopyFrom = ByteString.copyFrom(this.buffer, i14, rawVarint32);
                this.pos += rawVarint32;
                return byteStringCopyFrom;
            }
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 >= 0) {
                return readBytesSlowPath(rawVarint32);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i13, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i13, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            this.pos = i13 + 1;
            return bArr[i13];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i13) throws IOException {
            int i14 = this.pos;
            if (i13 > this.bufferSize - i14 || i13 <= 0) {
                return readRawBytesSlowPath(i13, false);
            }
            int i15 = i13 + i14;
            this.pos = i15;
            return Arrays.copyOfRange(this.buffer, i14, i15);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            int i13 = this.pos;
            if (this.bufferSize - i13 < 4) {
                refillBuffer(4);
                i13 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i13 + 4;
            return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            int i13 = this.pos;
            if (this.bufferSize - i13 < 8) {
                refillBuffer(8);
                i13 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i13 + 8;
            return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
            int i13;
            int i14 = this.pos;
            int i15 = this.bufferSize;
            if (i15 != i14) {
                byte[] bArr = this.buffer;
                int i16 = i14 + 1;
                byte b13 = bArr[i14];
                if (b13 >= 0) {
                    this.pos = i16;
                    return b13;
                }
                if (i15 - i16 >= 9) {
                    int i17 = i14 + 2;
                    int i18 = (bArr[i16] << 7) ^ b13;
                    if (i18 < 0) {
                        i13 = i18 ^ (-128);
                    } else {
                        int i19 = i14 + 3;
                        int i23 = (bArr[i17] << 14) ^ i18;
                        if (i23 >= 0) {
                            i13 = i23 ^ 16256;
                        } else {
                            int i24 = i14 + 4;
                            int i25 = i23 ^ (bArr[i19] << 21);
                            if (i25 < 0) {
                                i13 = (-2080896) ^ i25;
                            } else {
                                i19 = i14 + 5;
                                byte b14 = bArr[i24];
                                int i26 = (i25 ^ (b14 << 28)) ^ 266354560;
                                if (b14 < 0) {
                                    i24 = i14 + 6;
                                    if (bArr[i19] < 0) {
                                        i19 = i14 + 7;
                                        if (bArr[i24] < 0) {
                                            i24 = i14 + 8;
                                            if (bArr[i19] < 0) {
                                                i19 = i14 + 9;
                                                if (bArr[i24] < 0) {
                                                    int i27 = i14 + 10;
                                                    if (bArr[i19] >= 0) {
                                                        i17 = i27;
                                                        i13 = i26;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i13 = i26;
                                }
                                i13 = i26;
                            }
                            i17 = i24;
                        }
                        i17 = i19;
                    }
                    this.pos = i17;
                    return i13;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j13;
            long j14;
            long j15;
            int i13 = this.pos;
            int i14 = this.bufferSize;
            if (i14 != i13) {
                byte[] bArr = this.buffer;
                int i15 = i13 + 1;
                byte b13 = bArr[i13];
                if (b13 >= 0) {
                    this.pos = i15;
                    return b13;
                }
                if (i14 - i15 >= 9) {
                    int i16 = i13 + 2;
                    int i17 = (bArr[i15] << 7) ^ b13;
                    if (i17 < 0) {
                        j13 = i17 ^ (-128);
                    } else {
                        int i18 = i13 + 3;
                        int i19 = (bArr[i16] << 14) ^ i17;
                        if (i19 >= 0) {
                            j13 = i19 ^ 16256;
                            i16 = i18;
                        } else {
                            int i23 = i13 + 4;
                            int i24 = i19 ^ (bArr[i18] << 21);
                            if (i24 < 0) {
                                long j16 = (-2080896) ^ i24;
                                i16 = i23;
                                j13 = j16;
                            } else {
                                long j17 = i24;
                                i16 = i13 + 5;
                                long j18 = j17 ^ (((long) bArr[i23]) << 28);
                                if (j18 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    int i25 = i13 + 6;
                                    long j19 = j18 ^ (((long) bArr[i16]) << 35);
                                    if (j19 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        i16 = i13 + 7;
                                        j18 = j19 ^ (((long) bArr[i25]) << 42);
                                        if (j18 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            i25 = i13 + 8;
                                            j19 = j18 ^ (((long) bArr[i16]) << 49);
                                            if (j19 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                i16 = i13 + 9;
                                                long j23 = (j19 ^ (((long) bArr[i25]) << 56)) ^ 71499008037633920L;
                                                if (j23 < 0) {
                                                    int i26 = i13 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i16 = i26;
                                                    }
                                                }
                                                j13 = j23;
                                            }
                                        }
                                    }
                                    j13 = j19 ^ j14;
                                    i16 = i25;
                                }
                                j13 = j18 ^ j15;
                            }
                        }
                    }
                    this.pos = i16;
                    return j13;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j13 = 0;
            for (int i13 = 0; i13 < 64; i13 += 7) {
                byte rawByte = readRawByte();
                j13 |= ((long) (rawByte & 127)) << i13;
                if ((rawByte & 128) == 0) {
                    return j13;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i13 = this.bufferSize;
                int i14 = this.pos;
                if (rawVarint32 <= i13 - i14) {
                    String str = new String(this.buffer, i14, rawVarint32, Internal.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (rawVarint32 > this.bufferSize) {
                return new String(readRawBytesSlowPath(rawVarint32, false), Internal.UTF_8);
            }
            refillBuffer(rawVarint32);
            String str2 = new String(this.buffer, this.pos, rawVarint32, Internal.UTF_8);
            this.pos += rawVarint32;
            return str2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            byte[] rawBytesSlowPath;
            int rawVarint32 = readRawVarint32();
            int i13 = this.pos;
            int i14 = this.bufferSize;
            if (rawVarint32 <= i14 - i13 && rawVarint32 > 0) {
                rawBytesSlowPath = this.buffer;
                this.pos = i13 + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                i13 = 0;
                if (rawVarint32 <= i14) {
                    refillBuffer(rawVarint32);
                    rawBytesSlowPath = this.buffer;
                    this.pos = rawVarint32;
                } else {
                    rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                }
            }
            return Utf8.decodeUtf8(rawBytesSlowPath, i13, rawVarint32);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i13, MessageLite.Builder builder) throws IOException {
            readGroup(i13, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i13) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i13);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i13), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i13) throws IOException {
            int i14 = this.bufferSize;
            int i15 = this.pos;
            if (i13 > i14 - i15 || i13 < 0) {
                skipRawBytesSlowPath(i13);
            } else {
                this.pos = i15 + i13;
            }
        }

        private StreamDecoder(InputStream inputStream, int i13) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            Internal.checkNotNull(inputStream, "input");
            this.input = inputStream;
            this.buffer = new byte[i13];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i13, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i13, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i13, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i13);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i13);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i13), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private static final class UnsafeDirectNioDecoder extends CodedInputStream {
        private final long address;
        private final ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        private int bufferPos(long j13) {
            return (int) (j13 - this.address);
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void recomputeBufferSizeAfterLimit() {
            long j13 = this.limit + ((long) this.bufferSizeAfterLimit);
            this.limit = j13;
            int i13 = (int) (j13 - this.startPos);
            int i14 = this.currentLimit;
            if (i13 <= i14) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i15 = i13 - i14;
            this.bufferSizeAfterLimit = i15;
            this.limit = j13 - ((long) i15);
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        private void skipRawVarint() throws IOException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i13 = 0; i13 < 10; i13++) {
                long j13 = this.pos;
                this.pos = 1 + j13;
                if (UnsafeUtil.getByte(j13) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i13 = 0; i13 < 10; i13++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(long j13, long j14) throws IOException {
            int iPosition = this.buffer.position();
            int iLimit = this.buffer.limit();
            ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(j13));
                    byteBuffer.limit(bufferPos(j14));
                    ByteBuffer byteBufferSlice = this.buffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException e13) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    invalidProtocolBufferExceptionTruncatedMessage.initCause(e13);
                    throw invalidProtocolBufferExceptionTruncatedMessage;
                }
            } catch (Throwable th2) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th2;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i13) throws InvalidProtocolBufferException {
            if (this.lastTag != i13) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z13) {
            this.enableAliasing = z13;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i13 = this.currentLimit;
            if (i13 == Integer.MAX_VALUE) {
                return -1;
            }
            return i13 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i13) {
            this.currentLimit = i13;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i13) throws InvalidProtocolBufferException {
            if (i13 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i13 + getTotalBytesRead();
            int i14 = this.currentLimit;
            if (totalBytesRead > i14) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i14;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable || !this.enableAliasing) {
                byte[] bArr = new byte[rawVarint32];
                long j13 = rawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0L, j13);
                this.pos += j13;
                return ByteBuffer.wrap(bArr);
            }
            long j14 = this.pos;
            long j15 = rawVarint32;
            ByteBuffer byteBufferSlice = slice(j14, j14 + j15);
            this.pos += j15;
            return byteBufferSlice;
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                long j13 = this.pos;
                long j14 = rawVarint32;
                ByteBuffer byteBufferSlice = slice(j13, j13 + j14);
                this.pos += j14;
                return ByteString.wrap(byteBufferSlice);
            }
            byte[] bArr = new byte[rawVarint32];
            long j15 = rawVarint32;
            UnsafeUtil.copyMemory(this.pos, bArr, 0L, j15);
            this.pos += j15;
            return ByteString.wrap(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i13, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i13, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            long j13 = this.pos;
            if (j13 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 1 + j13;
            return UnsafeUtil.getByte(j13);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i13) throws IOException {
            if (i13 < 0 || i13 > remaining()) {
                if (i13 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i13 == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[i13];
            long j13 = this.pos;
            long j14 = i13;
            slice(j13, j13 + j14).get(bArr);
            this.pos += j14;
            return bArr;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            long j13 = this.pos;
            if (this.limit - j13 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 4 + j13;
            return ((UnsafeUtil.getByte(j13 + 3) & 255) << 24) | (UnsafeUtil.getByte(j13) & 255) | ((UnsafeUtil.getByte(1 + j13) & 255) << 8) | ((UnsafeUtil.getByte(2 + j13) & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            long j13 = this.pos;
            if (this.limit - j13 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 8 + j13;
            return ((((long) UnsafeUtil.getByte(j13 + 7)) & 255) << 56) | (((long) UnsafeUtil.getByte(j13)) & 255) | ((((long) UnsafeUtil.getByte(1 + j13)) & 255) << 8) | ((((long) UnsafeUtil.getByte(2 + j13)) & 255) << 16) | ((((long) UnsafeUtil.getByte(3 + j13)) & 255) << 24) | ((((long) UnsafeUtil.getByte(4 + j13)) & 255) << 32) | ((((long) UnsafeUtil.getByte(5 + j13)) & 255) << 40) | ((((long) UnsafeUtil.getByte(6 + j13)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r3) < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r9 = this;
                long r0 = r9.pos
                long r2 = r9.limit
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.UnsafeUtil.getByte(r0)
                if (r4 < 0) goto L16
                r9.pos = r2
                return r4
            L16:
                long r5 = r9.limit
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.UnsafeUtil.getByte(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.UnsafeUtil.getByte(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.UnsafeUtil.getByte(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.UnsafeUtil.getByte(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.UnsafeUtil.getByte(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.UnsafeUtil.getByte(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.pos = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.readRawVarint32():int");
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j13;
            long j14;
            long j15;
            int i13;
            long j16 = this.pos;
            if (this.limit != j16) {
                long j17 = 1 + j16;
                byte b13 = UnsafeUtil.getByte(j16);
                if (b13 >= 0) {
                    this.pos = j17;
                    return b13;
                }
                if (this.limit - j17 >= 9) {
                    long j18 = 2 + j16;
                    int i14 = (UnsafeUtil.getByte(j17) << 7) ^ b13;
                    if (i14 >= 0) {
                        long j19 = 3 + j16;
                        int i15 = i14 ^ (UnsafeUtil.getByte(j18) << 14);
                        if (i15 >= 0) {
                            j13 = i15 ^ 16256;
                            j18 = j19;
                        } else {
                            j18 = 4 + j16;
                            int i16 = i15 ^ (UnsafeUtil.getByte(j19) << 21);
                            if (i16 < 0) {
                                i13 = (-2080896) ^ i16;
                            } else {
                                long j23 = 5 + j16;
                                long j24 = ((long) i16) ^ (((long) UnsafeUtil.getByte(j18)) << 28);
                                if (j24 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    long j25 = 6 + j16;
                                    long j26 = j24 ^ (((long) UnsafeUtil.getByte(j23)) << 35);
                                    if (j26 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        j23 = 7 + j16;
                                        j24 = j26 ^ (((long) UnsafeUtil.getByte(j25)) << 42);
                                        if (j24 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            j25 = 8 + j16;
                                            j26 = j24 ^ (((long) UnsafeUtil.getByte(j23)) << 49);
                                            if (j26 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                long j27 = j16 + 9;
                                                long j28 = (j26 ^ (((long) UnsafeUtil.getByte(j25)) << 56)) ^ 71499008037633920L;
                                                if (j28 < 0) {
                                                    long j29 = j16 + 10;
                                                    if (UnsafeUtil.getByte(j27) >= 0) {
                                                        j18 = j29;
                                                        j13 = j28;
                                                    }
                                                } else {
                                                    j13 = j28;
                                                    j18 = j27;
                                                }
                                            }
                                        }
                                    }
                                    j13 = j14 ^ j26;
                                    j18 = j25;
                                }
                                j13 = j15 ^ j24;
                                j18 = j23;
                            }
                        }
                        this.pos = j18;
                        return j13;
                    }
                    i13 = i14 ^ (-128);
                    j13 = i13;
                    this.pos = j18;
                    return j13;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j13 = 0;
            for (int i13 = 0; i13 < 64; i13 += 7) {
                byte rawByte = readRawByte();
                j13 |= ((long) (rawByte & 127)) << i13;
                if ((rawByte & 128) == 0) {
                    return j13;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[rawVarint32];
            long j13 = rawVarint32;
            UnsafeUtil.copyMemory(this.pos, bArr, 0L, j13);
            String str = new String(bArr, Internal.UTF_8);
            this.pos += j13;
            return str;
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                String strDecodeUtf8 = Utf8.decodeUtf8(this.buffer, bufferPos(this.pos), rawVarint32);
                this.pos += (long) rawVarint32;
                return strDecodeUtf8;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i13, MessageLite.Builder builder) throws IOException {
            readGroup(i13, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i13) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i13);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i13), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i13) throws IOException {
            if (i13 >= 0 && i13 <= remaining()) {
                this.pos += (long) i13;
            } else {
                if (i13 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        private UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z13) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = byteBuffer;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            this.limit = ((long) byteBuffer.limit()) + jAddressOffset;
            long jPosition = jAddressOffset + ((long) byteBuffer.position());
            this.pos = jPosition;
            this.startPos = jPosition;
            this.immutable = z13;
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i13, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i13, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i13, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i13);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i13);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i13), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i13);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static int decodeZigZag32(int i13) {
        return (-(i13 & 1)) ^ (i13 >>> 1);
    }

    public static long decodeZigZag64(long j13) {
        return (-(j13 & 1)) ^ (j13 >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i13, InputStream inputStream) throws IOException {
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
            return i13;
        }
        int i14 = i13 & 127;
        int i15 = 7;
        while (i15 < 32) {
            int i16 = inputStream.read();
            if (i16 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i14 |= (i16 & 127) << i15;
            if ((i16 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                return i14;
            }
            i15 += 7;
        }
        while (i15 < 64) {
            int i17 = inputStream.read();
            if (i17 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i17 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                return i14;
            }
            i15 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public abstract void checkLastTagWas(int i13) throws InvalidProtocolBufferException;

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z13);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i13);

    public abstract int pushLimit(int i13) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(int i13, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readGroup(int i13, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i13) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i13, MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i13) {
        if (i13 >= 0) {
            int i14 = this.recursionLimit;
            this.recursionLimit = i13;
            return i14;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i13);
    }

    public final int setSizeLimit(int i13) {
        if (i13 >= 0) {
            int i14 = this.sizeLimit;
            this.sizeLimit = i13;
            return i14;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i13);
    }

    final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i13) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i13, CodedOutputStream codedOutputStream) throws IOException;

    public void skipMessage() throws IOException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag);
            this.recursionDepth--;
        } while (zSkipField);
    }

    public abstract void skipRawBytes(int i13) throws IOException;

    final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i13) {
        if (i13 > 0) {
            return inputStream == null ? newInstance(Internal.EMPTY_BYTE_ARRAY) : new StreamDecoder(inputStream, i13);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
        if (!UnsafeDirectNioDecoder.isSupported()) {
            return newInstance(new IterableByteBufferInputStream(iterable));
        }
        return newInstance(iterable, false);
    }

    static int readRawVarint32(InputStream inputStream) throws IOException {
        int i13 = inputStream.read();
        if (i13 != -1) {
            return readRawVarint32(i13, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag, codedOutputStream);
            this.recursionDepth--;
        } while (zSkipField);
    }

    static CodedInputStream newInstance(Iterable<ByteBuffer> iterable, boolean z13) {
        int i13 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i13 |= 1;
            } else {
                i13 = byteBuffer.isDirect() ? i13 | 2 : i13 | 4;
            }
        }
        if (i13 == 2) {
            return new IterableDirectByteBufferDecoder(iterable, iRemaining, z13);
        }
        return newInstance(new IterableByteBufferInputStream(iterable));
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i13, int i14) {
        return newInstance(bArr, i13, i14, false);
    }

    static CodedInputStream newInstance(byte[] bArr, int i13, int i14, boolean z13) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i13, i14, z13);
        try {
            arrayDecoder.pushLimit(i14);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean z13) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z13);
        }
        if (byteBuffer.isDirect() && UnsafeDirectNioDecoder.isSupported()) {
            return new UnsafeDirectNioDecoder(byteBuffer, z13);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }
}
