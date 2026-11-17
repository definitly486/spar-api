package com.google.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
abstract class BinaryWriter extends ByteOutput implements Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final BufferAllocator alloc;
    final ArrayDeque<AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    /* JADX INFO: renamed from: com.google.protobuf.BinaryWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private static final class SafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        SafeDirectWriter(BufferAllocator bufferAllocator, int i13) {
            super(bufferAllocator, i13, null);
            nextBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private int spaceLeft() {
            return this.pos + 1;
        }

        private void writeVarint32FiveBytes(int i13) {
            ByteBuffer byteBuffer = this.buffer;
            int i14 = this.pos;
            this.pos = i14 - 1;
            byteBuffer.put(i14, (byte) (i13 >>> 28));
            int i15 = this.pos;
            this.pos = i15 - 4;
            this.buffer.putInt(i15 - 3, (i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN | ((((i13 >>> 21) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN) << 24) | ((((i13 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN) << 16) | ((((i13 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN) << 8));
        }

        private void writeVarint32FourBytes(int i13) {
            int i14 = this.pos;
            this.pos = i14 - 4;
            this.buffer.putInt(i14 - 3, (i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN | ((266338304 & i13) << 3) | (((2080768 & i13) | 2097152) << 2) | (((i13 & 16256) | 16384) << 1));
        }

        private void writeVarint32OneByte(int i13) {
            ByteBuffer byteBuffer = this.buffer;
            int i14 = this.pos;
            this.pos = i14 - 1;
            byteBuffer.put(i14, (byte) i13);
        }

        private void writeVarint32ThreeBytes(int i13) {
            int i14 = this.pos - 3;
            this.pos = i14;
            this.buffer.putInt(i14, (((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN) << 8) | ((2080768 & i13) << 10) | (((i13 & 16256) | 16384) << 9));
        }

        private void writeVarint32TwoBytes(int i13) {
            int i14 = this.pos;
            this.pos = i14 - 2;
            this.buffer.putShort(i14 - 1, (short) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN | ((i13 & 16256) << 1)));
        }

        private void writeVarint64EightBytes(long j13) {
            int i13 = this.pos;
            this.pos = i13 - 8;
            this.buffer.putLong(i13 - 7, (j13 & 127) | 128 | ((71494644084506624L & j13) << 7) | (((558551906910208L & j13) | 562949953421312L) << 6) | (((4363686772736L & j13) | 4398046511104L) << 5) | (((34091302912L & j13) | 34359738368L) << 4) | (((266338304 & j13) | 268435456) << 3) | (((2080768 & j13) | 2097152) << 2) | (((16256 & j13) | 16384) << 1));
        }

        private void writeVarint64EightBytesWithSign(long j13) {
            int i13 = this.pos;
            this.pos = i13 - 8;
            this.buffer.putLong(i13 - 7, (j13 & 127) | 128 | (((71494644084506624L & j13) | 72057594037927936L) << 7) | (((558551906910208L & j13) | 562949953421312L) << 6) | (((4363686772736L & j13) | 4398046511104L) << 5) | (((34091302912L & j13) | 34359738368L) << 4) | (((266338304 & j13) | 268435456) << 3) | (((2080768 & j13) | 2097152) << 2) | (((16256 & j13) | 16384) << 1));
        }

        private void writeVarint64FiveBytes(long j13) {
            int i13 = this.pos;
            this.pos = i13 - 5;
            this.buffer.putLong(i13 - 7, (((j13 & 127) | 128) << 24) | ((34091302912L & j13) << 28) | (((266338304 & j13) | 268435456) << 27) | (((2080768 & j13) | 2097152) << 26) | (((16256 & j13) | 16384) << 25));
        }

        private void writeVarint64FourBytes(long j13) {
            writeVarint32FourBytes((int) j13);
        }

        private void writeVarint64NineBytes(long j13) {
            ByteBuffer byteBuffer = this.buffer;
            int i13 = this.pos;
            this.pos = i13 - 1;
            byteBuffer.put(i13, (byte) (j13 >>> 56));
            writeVarint64EightBytesWithSign(j13 & 72057594037927935L);
        }

        private void writeVarint64OneByte(long j13) {
            writeVarint32OneByte((int) j13);
        }

        private void writeVarint64SevenBytes(long j13) {
            int i13 = this.pos - 7;
            this.pos = i13;
            this.buffer.putLong(i13, (((j13 & 127) | 128) << 8) | ((558551906910208L & j13) << 14) | (((4363686772736L & j13) | 4398046511104L) << 13) | (((34091302912L & j13) | 34359738368L) << 12) | (((266338304 & j13) | 268435456) << 11) | (((2080768 & j13) | 2097152) << 10) | (((16256 & j13) | 16384) << 9));
        }

        private void writeVarint64SixBytes(long j13) {
            int i13 = this.pos;
            this.pos = i13 - 6;
            this.buffer.putLong(i13 - 7, (((j13 & 127) | 128) << 16) | ((4363686772736L & j13) << 21) | (((34091302912L & j13) | 34359738368L) << 20) | (((266338304 & j13) | 268435456) << 19) | (((2080768 & j13) | 2097152) << 18) | (((16256 & j13) | 16384) << 17));
        }

        private void writeVarint64TenBytes(long j13) {
            ByteBuffer byteBuffer = this.buffer;
            int i13 = this.pos;
            this.pos = i13 - 1;
            byteBuffer.put(i13, (byte) (j13 >>> 63));
            ByteBuffer byteBuffer2 = this.buffer;
            int i14 = this.pos;
            this.pos = i14 - 1;
            byteBuffer2.put(i14, (byte) (((j13 >>> 56) & 127) | 128));
            writeVarint64EightBytesWithSign(j13 & 72057594037927935L);
        }

        private void writeVarint64ThreeBytes(long j13) {
            writeVarint32ThreeBytes((int) j13);
        }

        private void writeVarint64TwoBytes(long j13) {
            writeVarint32TwoBytes((int) j13);
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                Java8Compatibility.position(this.buffer, this.pos + 1);
                this.buffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i13) {
            if (spaceLeft() < i13) {
                nextBuffer(i13);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte b13) {
            ByteBuffer byteBuffer = this.buffer;
            int i13 = this.pos;
            this.pos = i13 - 1;
            byteBuffer.put(i13, b13);
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i13, boolean z13) {
            requireSpace(6);
            write(z13 ? (byte) 1 : (byte) 0);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int i13, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i13, 2);
            } catch (IOException e13) {
                throw new RuntimeException(e13);
            }
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public void writeEndGroup(int i13) {
            writeTag(i13, 4);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int i13, int i14) {
            requireSpace(9);
            writeFixed32(i14);
            writeTag(i13, 5);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int i13, long j13) {
            requireSpace(13);
            writeFixed64(j13);
            writeTag(i13, 1);
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public void writeGroup(int i13, Object obj) throws IOException {
            writeTag(i13, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i13, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int i13, int i14) {
            requireSpace(15);
            writeInt32(i14);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i13, int i14) {
            if (spaceLeft() < i14) {
                this.totalDoneBytes += i14;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i13, i14));
                nextBuffer();
            } else {
                int i15 = this.pos - i14;
                this.pos = i15;
                Java8Compatibility.position(this.buffer, i15 + 1);
                this.buffer.put(bArr, i13, i14);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i13, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i13, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int i13, int i14) {
            requireSpace(10);
            writeSInt32(i14);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int i13, long j13) {
            requireSpace(15);
            writeSInt64(j13);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public void writeStartGroup(int i13) {
            writeTag(i13, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int i13, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i13, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i13, int i14) {
            writeVarint32(WireFormat.makeTag(i13, i14));
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int i13, int i14) {
            requireSpace(10);
            writeVarint32(i14);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int i13, long j13) {
            requireSpace(15);
            writeVarint64(j13);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i13) {
            if ((i13 & (-128)) == 0) {
                writeVarint32OneByte(i13);
                return;
            }
            if ((i13 & (-16384)) == 0) {
                writeVarint32TwoBytes(i13);
                return;
            }
            if (((-2097152) & i13) == 0) {
                writeVarint32ThreeBytes(i13);
            } else if (((-268435456) & i13) == 0) {
                writeVarint32FourBytes(i13);
            } else {
                writeVarint32FiveBytes(i13);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j13) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j13)) {
                case 1:
                    writeVarint64OneByte(j13);
                    break;
                case 2:
                    writeVarint64TwoBytes(j13);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j13);
                    break;
                case 4:
                    writeVarint64FourBytes(j13);
                    break;
                case 5:
                    writeVarint64FiveBytes(j13);
                    break;
                case 6:
                    writeVarint64SixBytes(j13);
                    break;
                case 7:
                    writeVarint64SevenBytes(j13);
                    break;
                case 8:
                    writeVarint64EightBytes(j13);
                    break;
                case 9:
                    writeVarint64NineBytes(j13);
                    break;
                case 10:
                    writeVarint64TenBytes(j13);
                    break;
            }
        }

        private void nextBuffer(int i13) {
            nextBuffer(newDirectBuffer(i13));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i13, int i14) {
            if (spaceLeft() < i14) {
                nextBuffer(i14);
            }
            int i15 = this.pos - i14;
            this.pos = i15;
            Java8Compatibility.position(this.buffer, i15 + 1);
            this.buffer.put(bArr, i13, i14);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer byteBufferNioBuffer = allocatedBuffer.nioBuffer();
                if (byteBufferNioBuffer.isDirect()) {
                    finishCurrentBuffer();
                    this.buffers.addFirst(allocatedBuffer);
                    this.buffer = byteBufferNioBuffer;
                    Java8Compatibility.limit(byteBufferNioBuffer, byteBufferNioBuffer.capacity());
                    Java8Compatibility.position(this.buffer, 0);
                    this.buffer.order(ByteOrder.LITTLE_ENDIAN);
                    int iLimit = this.buffer.limit() - 1;
                    this.limitMinusOne = iLimit;
                    this.pos = iLimit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z13) {
            write(z13 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i13) {
            int i14 = this.pos;
            this.pos = i14 - 4;
            this.buffer.putInt(i14 - 3, i13);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j13) {
            int i13 = this.pos;
            this.pos = i13 - 8;
            this.buffer.putLong(i13 - 7, j13);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i13, Object obj, Schema schema) throws IOException {
            writeTag(i13, 4);
            schema.writeTo(obj, this);
            writeTag(i13, 3);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i13) {
            if (i13 >= 0) {
                writeVarint32(i13);
            } else {
                writeVarint64(i13);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i13) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i13));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j13) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j13));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i13 = this.pos - iRemaining;
            this.pos = i13;
            Java8Compatibility.position(this.buffer, i13 + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i13, Object obj, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i13, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
            int i13;
            int i14;
            int i15;
            char cCharAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.buffer.put(this.pos + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 < 128 && (i15 = this.pos) >= 0) {
                    ByteBuffer byteBuffer = this.buffer;
                    this.pos = i15 - 1;
                    byteBuffer.put(i15, (byte) cCharAt2);
                } else if (cCharAt2 < 2048 && (i14 = this.pos) > 0) {
                    ByteBuffer byteBuffer2 = this.buffer;
                    this.pos = i14 - 1;
                    byteBuffer2.put(i14, (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    ByteBuffer byteBuffer3 = this.buffer;
                    int i16 = this.pos;
                    this.pos = i16 - 1;
                    byteBuffer3.put(i16, (byte) ((cCharAt2 >>> 6) | 960));
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i13 = this.pos) > 1) {
                    ByteBuffer byteBuffer4 = this.buffer;
                    this.pos = i13 - 1;
                    byteBuffer4.put(i13, (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    ByteBuffer byteBuffer5 = this.buffer;
                    int i17 = this.pos;
                    this.pos = i17 - 1;
                    byteBuffer5.put(i17, (byte) (((cCharAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    ByteBuffer byteBuffer6 = this.buffer;
                    int i18 = this.pos;
                    this.pos = i18 - 1;
                    byteBuffer6.put(i18, (byte) ((cCharAt2 >>> '\f') | 480));
                } else {
                    if (this.pos > 2) {
                        if (length != 0) {
                            char cCharAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                ByteBuffer byteBuffer7 = this.buffer;
                                int i19 = this.pos;
                                this.pos = i19 - 1;
                                byteBuffer7.put(i19, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                ByteBuffer byteBuffer8 = this.buffer;
                                int i23 = this.pos;
                                this.pos = i23 - 1;
                                byteBuffer8.put(i23, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                ByteBuffer byteBuffer9 = this.buffer;
                                int i24 = this.pos;
                                this.pos = i24 - 1;
                                byteBuffer9.put(i24, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                ByteBuffer byteBuffer10 = this.buffer;
                                int i25 = this.pos;
                                this.pos = i25 - 1;
                                byteBuffer10.put(i25, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                int i13 = this.pos - iRemaining;
                this.pos = i13;
                Java8Compatibility.position(this.buffer, i13 + 1);
                this.buffer.put(byteBuffer);
            }
        }
    }

    private static final class SafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        SafeHeapWriter(BufferAllocator bufferAllocator, int i13) {
            super(bufferAllocator, i13, null);
            nextBuffer();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void writeVarint32FiveBytes(int i13) {
            byte[] bArr = this.buffer;
            int i14 = this.pos;
            int i15 = i14 - 1;
            this.pos = i15;
            bArr[i14] = (byte) (i13 >>> 28);
            int i16 = i14 - 2;
            this.pos = i16;
            bArr[i15] = (byte) (((i13 >>> 21) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            int i17 = i14 - 3;
            this.pos = i17;
            bArr[i16] = (byte) (((i13 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            int i18 = i14 - 4;
            this.pos = i18;
            bArr[i17] = (byte) (((i13 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            this.pos = i14 - 5;
            bArr[i18] = (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
        }

        private void writeVarint32FourBytes(int i13) {
            byte[] bArr = this.buffer;
            int i14 = this.pos;
            int i15 = i14 - 1;
            this.pos = i15;
            bArr[i14] = (byte) (i13 >>> 21);
            int i16 = i14 - 2;
            this.pos = i16;
            bArr[i15] = (byte) (((i13 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            int i17 = i14 - 3;
            this.pos = i17;
            bArr[i16] = (byte) (((i13 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            this.pos = i14 - 4;
            bArr[i17] = (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
        }

        private void writeVarint32OneByte(int i13) {
            byte[] bArr = this.buffer;
            int i14 = this.pos;
            this.pos = i14 - 1;
            bArr[i14] = (byte) i13;
        }

        private void writeVarint32ThreeBytes(int i13) {
            byte[] bArr = this.buffer;
            int i14 = this.pos;
            int i15 = i14 - 1;
            this.pos = i15;
            bArr[i14] = (byte) (i13 >>> 14);
            int i16 = i14 - 2;
            this.pos = i16;
            bArr[i15] = (byte) (((i13 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            this.pos = i14 - 3;
            bArr[i16] = (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
        }

        private void writeVarint32TwoBytes(int i13) {
            byte[] bArr = this.buffer;
            int i14 = this.pos;
            int i15 = i14 - 1;
            this.pos = i15;
            bArr[i14] = (byte) (i13 >>> 7);
            this.pos = i14 - 2;
            bArr[i15] = (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
        }

        private void writeVarint64EightBytes(long j13) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (j13 >>> 49);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) (((j13 >>> 42) & 127) | 128);
            int i16 = i13 - 3;
            this.pos = i16;
            bArr[i15] = (byte) (((j13 >>> 35) & 127) | 128);
            int i17 = i13 - 4;
            this.pos = i17;
            bArr[i16] = (byte) (((j13 >>> 28) & 127) | 128);
            int i18 = i13 - 5;
            this.pos = i18;
            bArr[i17] = (byte) (((j13 >>> 21) & 127) | 128);
            int i19 = i13 - 6;
            this.pos = i19;
            bArr[i18] = (byte) (((j13 >>> 14) & 127) | 128);
            int i23 = i13 - 7;
            this.pos = i23;
            bArr[i19] = (byte) (((j13 >>> 7) & 127) | 128);
            this.pos = i13 - 8;
            bArr[i23] = (byte) ((j13 & 127) | 128);
        }

        private void writeVarint64FiveBytes(long j13) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (j13 >>> 28);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) (((j13 >>> 21) & 127) | 128);
            int i16 = i13 - 3;
            this.pos = i16;
            bArr[i15] = (byte) (((j13 >>> 14) & 127) | 128);
            int i17 = i13 - 4;
            this.pos = i17;
            bArr[i16] = (byte) (((j13 >>> 7) & 127) | 128);
            this.pos = i13 - 5;
            bArr[i17] = (byte) ((j13 & 127) | 128);
        }

        private void writeVarint64FourBytes(long j13) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (j13 >>> 21);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) (((j13 >>> 14) & 127) | 128);
            int i16 = i13 - 3;
            this.pos = i16;
            bArr[i15] = (byte) (((j13 >>> 7) & 127) | 128);
            this.pos = i13 - 4;
            bArr[i16] = (byte) ((j13 & 127) | 128);
        }

        private void writeVarint64NineBytes(long j13) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (j13 >>> 56);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) (((j13 >>> 49) & 127) | 128);
            int i16 = i13 - 3;
            this.pos = i16;
            bArr[i15] = (byte) (((j13 >>> 42) & 127) | 128);
            int i17 = i13 - 4;
            this.pos = i17;
            bArr[i16] = (byte) (((j13 >>> 35) & 127) | 128);
            int i18 = i13 - 5;
            this.pos = i18;
            bArr[i17] = (byte) (((j13 >>> 28) & 127) | 128);
            int i19 = i13 - 6;
            this.pos = i19;
            bArr[i18] = (byte) (((j13 >>> 21) & 127) | 128);
            int i23 = i13 - 7;
            this.pos = i23;
            bArr[i19] = (byte) (((j13 >>> 14) & 127) | 128);
            int i24 = i13 - 8;
            this.pos = i24;
            bArr[i23] = (byte) (((j13 >>> 7) & 127) | 128);
            this.pos = i13 - 9;
            bArr[i24] = (byte) ((j13 & 127) | 128);
        }

        private void writeVarint64OneByte(long j13) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            this.pos = i13 - 1;
            bArr[i13] = (byte) j13;
        }

        private void writeVarint64SevenBytes(long j13) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (j13 >>> 42);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) (((j13 >>> 35) & 127) | 128);
            int i16 = i13 - 3;
            this.pos = i16;
            bArr[i15] = (byte) (((j13 >>> 28) & 127) | 128);
            int i17 = i13 - 4;
            this.pos = i17;
            bArr[i16] = (byte) (((j13 >>> 21) & 127) | 128);
            int i18 = i13 - 5;
            this.pos = i18;
            bArr[i17] = (byte) (((j13 >>> 14) & 127) | 128);
            int i19 = i13 - 6;
            this.pos = i19;
            bArr[i18] = (byte) (((j13 >>> 7) & 127) | 128);
            this.pos = i13 - 7;
            bArr[i19] = (byte) ((j13 & 127) | 128);
        }

        private void writeVarint64SixBytes(long j13) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (j13 >>> 35);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) (((j13 >>> 28) & 127) | 128);
            int i16 = i13 - 3;
            this.pos = i16;
            bArr[i15] = (byte) (((j13 >>> 21) & 127) | 128);
            int i17 = i13 - 4;
            this.pos = i17;
            bArr[i16] = (byte) (((j13 >>> 14) & 127) | 128);
            int i18 = i13 - 5;
            this.pos = i18;
            bArr[i17] = (byte) (((j13 >>> 7) & 127) | 128);
            this.pos = i13 - 6;
            bArr[i18] = (byte) ((j13 & 127) | 128);
        }

        private void writeVarint64TenBytes(long j13) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (j13 >>> 63);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) (((j13 >>> 56) & 127) | 128);
            int i16 = i13 - 3;
            this.pos = i16;
            bArr[i15] = (byte) (((j13 >>> 49) & 127) | 128);
            int i17 = i13 - 4;
            this.pos = i17;
            bArr[i16] = (byte) (((j13 >>> 42) & 127) | 128);
            int i18 = i13 - 5;
            this.pos = i18;
            bArr[i17] = (byte) (((j13 >>> 35) & 127) | 128);
            int i19 = i13 - 6;
            this.pos = i19;
            bArr[i18] = (byte) (((j13 >>> 28) & 127) | 128);
            int i23 = i13 - 7;
            this.pos = i23;
            bArr[i19] = (byte) (((j13 >>> 21) & 127) | 128);
            int i24 = i13 - 8;
            this.pos = i24;
            bArr[i23] = (byte) (((j13 >>> 14) & 127) | 128);
            int i25 = i13 - 9;
            this.pos = i25;
            bArr[i24] = (byte) (((j13 >>> 7) & 127) | 128);
            this.pos = i13 - 10;
            bArr[i25] = (byte) ((j13 & 127) | 128);
        }

        private void writeVarint64ThreeBytes(long j13) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (((int) j13) >>> 14);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) (((j13 >>> 7) & 127) | 128);
            this.pos = i13 - 3;
            bArr[i15] = (byte) ((j13 & 127) | 128);
        }

        private void writeVarint64TwoBytes(long j13) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (j13 >>> 7);
            this.pos = i13 - 2;
            bArr[i14] = (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
        }

        int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
                allocatedBuffer.position((this.pos - allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i13) {
            if (spaceLeft() < i13) {
                nextBuffer(i13);
            }
        }

        int spaceLeft() {
            return this.pos - this.offsetMinusOne;
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte b13) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            this.pos = i13 - 1;
            bArr[i13] = b13;
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i13, boolean z13) throws IOException {
            requireSpace(6);
            write(z13 ? (byte) 1 : (byte) 0);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int i13, ByteString byteString) throws IOException {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i13, 2);
            } catch (IOException e13) {
                throw new RuntimeException(e13);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeEndGroup(int i13) {
            writeTag(i13, 4);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int i13, int i14) throws IOException {
            requireSpace(9);
            writeFixed32(i14);
            writeTag(i13, 5);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int i13, long j13) throws IOException {
            requireSpace(13);
            writeFixed64(j13);
            writeTag(i13, 1);
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public void writeGroup(int i13, Object obj) throws IOException {
            writeTag(i13, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i13, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int i13, int i14) throws IOException {
            requireSpace(15);
            writeInt32(i14);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i13, int i14) {
            if (spaceLeft() < i14) {
                this.totalDoneBytes += i14;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i13, i14));
                nextBuffer();
            } else {
                int i15 = this.pos - i14;
                this.pos = i15;
                System.arraycopy(bArr, i13, this.buffer, i15 + 1, i14);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i13, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i13, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int i13, int i14) throws IOException {
            requireSpace(10);
            writeSInt32(i14);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int i13, long j13) throws IOException {
            requireSpace(15);
            writeSInt64(j13);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeStartGroup(int i13) {
            writeTag(i13, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int i13, String str) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i13, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i13, int i14) {
            writeVarint32(WireFormat.makeTag(i13, i14));
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int i13, int i14) throws IOException {
            requireSpace(10);
            writeVarint32(i14);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int i13, long j13) throws IOException {
            requireSpace(15);
            writeVarint64(j13);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i13) {
            if ((i13 & (-128)) == 0) {
                writeVarint32OneByte(i13);
                return;
            }
            if ((i13 & (-16384)) == 0) {
                writeVarint32TwoBytes(i13);
                return;
            }
            if (((-2097152) & i13) == 0) {
                writeVarint32ThreeBytes(i13);
            } else if (((-268435456) & i13) == 0) {
                writeVarint32FourBytes(i13);
            } else {
                writeVarint32FiveBytes(i13);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j13) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j13)) {
                case 1:
                    writeVarint64OneByte(j13);
                    break;
                case 2:
                    writeVarint64TwoBytes(j13);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j13);
                    break;
                case 4:
                    writeVarint64FourBytes(j13);
                    break;
                case 5:
                    writeVarint64FiveBytes(j13);
                    break;
                case 6:
                    writeVarint64SixBytes(j13);
                    break;
                case 7:
                    writeVarint64SevenBytes(j13);
                    break;
                case 8:
                    writeVarint64EightBytes(j13);
                    break;
                case 9:
                    writeVarint64NineBytes(j13);
                    break;
                case 10:
                    writeVarint64TenBytes(j13);
                    break;
            }
        }

        private void nextBuffer(int i13) {
            nextBuffer(newHeapBuffer(i13));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i13, int i14) {
            if (spaceLeft() < i14) {
                nextBuffer(i14);
            }
            int i15 = this.pos - i14;
            this.pos = i15;
            System.arraycopy(bArr, i13, this.buffer, i15 + 1, i14);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                finishCurrentBuffer();
                this.buffers.addFirst(allocatedBuffer);
                this.allocatedBuffer = allocatedBuffer;
                this.buffer = allocatedBuffer.array();
                int iArrayOffset = allocatedBuffer.arrayOffset();
                this.limit = allocatedBuffer.limit() + iArrayOffset;
                int iPosition = iArrayOffset + allocatedBuffer.position();
                this.offset = iPosition;
                this.offsetMinusOne = iPosition - 1;
                int i13 = this.limit - 1;
                this.limitMinusOne = i13;
                this.pos = i13;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z13) {
            write(z13 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i13) {
            byte[] bArr = this.buffer;
            int i14 = this.pos;
            int i15 = i14 - 1;
            this.pos = i15;
            bArr[i14] = (byte) ((i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i16 = i14 - 2;
            this.pos = i16;
            bArr[i15] = (byte) ((i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i17 = i14 - 3;
            this.pos = i17;
            bArr[i16] = (byte) ((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.pos = i14 - 4;
            bArr[i17] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j13) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (((int) (j13 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) (((int) (j13 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i16 = i13 - 3;
            this.pos = i16;
            bArr[i15] = (byte) (((int) (j13 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i17 = i13 - 4;
            this.pos = i17;
            bArr[i16] = (byte) (((int) (j13 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i18 = i13 - 5;
            this.pos = i18;
            bArr[i17] = (byte) (((int) (j13 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i19 = i13 - 6;
            this.pos = i19;
            bArr[i18] = (byte) (((int) (j13 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i23 = i13 - 7;
            this.pos = i23;
            bArr[i19] = (byte) (((int) (j13 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.pos = i13 - 8;
            bArr[i23] = (byte) (((int) j13) & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i13, Object obj, Schema schema) throws IOException {
            writeTag(i13, 4);
            schema.writeTo(obj, this);
            writeTag(i13, 3);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i13) {
            if (i13 >= 0) {
                writeVarint32(i13);
            } else {
                writeVarint64(i13);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i13) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i13));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j13) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j13));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i13 = this.pos - iRemaining;
            this.pos = i13;
            byteBuffer.get(this.buffer, i13 + 1, iRemaining);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            int i13 = this.pos - iRemaining;
            this.pos = i13;
            byteBuffer.get(this.buffer, i13 + 1, iRemaining);
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i13, Object obj, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i13, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
            int i13;
            int i14;
            int i15;
            char cCharAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.buffer[this.pos + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 < 128 && (i15 = this.pos) > this.offsetMinusOne) {
                    byte[] bArr = this.buffer;
                    this.pos = i15 - 1;
                    bArr[i15] = (byte) cCharAt2;
                } else if (cCharAt2 < 2048 && (i14 = this.pos) > this.offset) {
                    byte[] bArr2 = this.buffer;
                    int i16 = i14 - 1;
                    this.pos = i16;
                    bArr2[i14] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.pos = i14 - 2;
                    bArr2[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i13 = this.pos) > this.offset + 1) {
                    byte[] bArr3 = this.buffer;
                    int i17 = i13 - 1;
                    this.pos = i17;
                    bArr3[i13] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                    int i18 = i13 - 2;
                    this.pos = i18;
                    bArr3[i17] = (byte) (((cCharAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.pos = i13 - 3;
                    bArr3[i18] = (byte) ((cCharAt2 >>> '\f') | 480);
                } else {
                    if (this.pos > this.offset + 2) {
                        if (length != 0) {
                            char cCharAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                byte[] bArr4 = this.buffer;
                                int i19 = this.pos;
                                int i23 = i19 - 1;
                                this.pos = i23;
                                bArr4[i19] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                int i24 = i19 - 2;
                                this.pos = i24;
                                bArr4[i23] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                int i25 = i19 - 3;
                                this.pos = i25;
                                bArr4[i24] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                this.pos = i19 - 4;
                                bArr4[i25] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }
    }

    private static final class UnsafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        UnsafeDirectWriter(BufferAllocator bufferAllocator, int i13) {
            super(bufferAllocator, i13, null);
            nextBuffer();
        }

        private int bufferPos() {
            return (int) (this.pos - this.bufferOffset);
        }

        private int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private int spaceLeft() {
            return bufferPos() + 1;
        }

        private void writeVarint32FiveBytes(int i13) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (i13 >>> 28));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((i13 >>> 21) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((i13 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((i13 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint32FourBytes(int i13) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (i13 >>> 21));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((i13 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((i13 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint32OneByte(int i13) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) i13);
        }

        private void writeVarint32ThreeBytes(int i13) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (i13 >>> 14));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((i13 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint32TwoBytes(int i13) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (i13 >>> 7));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint64EightBytes(long j13) {
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (j13 >>> 49));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j13 >>> 42) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j13 >>> 35) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j13 >>> 28) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((j13 >>> 21) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((j13 >>> 14) & 127) | 128));
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(j23, (byte) (((j13 >>> 7) & 127) | 128));
            long j24 = this.pos;
            this.pos = j24 - 1;
            UnsafeUtil.putByte(j24, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64FiveBytes(long j13) {
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (j13 >>> 28));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j13 >>> 21) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j13 >>> 14) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j13 >>> 7) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64FourBytes(long j13) {
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (j13 >>> 21));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j13 >>> 14) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j13 >>> 7) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64NineBytes(long j13) {
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (j13 >>> 56));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j13 >>> 49) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j13 >>> 42) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j13 >>> 35) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((j13 >>> 28) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((j13 >>> 21) & 127) | 128));
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(j23, (byte) (((j13 >>> 14) & 127) | 128));
            long j24 = this.pos;
            this.pos = j24 - 1;
            UnsafeUtil.putByte(j24, (byte) (((j13 >>> 7) & 127) | 128));
            long j25 = this.pos;
            this.pos = j25 - 1;
            UnsafeUtil.putByte(j25, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64OneByte(long j13) {
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) j13);
        }

        private void writeVarint64SevenBytes(long j13) {
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (j13 >>> 42));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j13 >>> 35) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j13 >>> 28) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j13 >>> 21) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((j13 >>> 14) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((j13 >>> 7) & 127) | 128));
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(j23, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64SixBytes(long j13) {
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (j13 >>> 35));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j13 >>> 28) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j13 >>> 21) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j13 >>> 14) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((j13 >>> 7) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64TenBytes(long j13) {
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (j13 >>> 63));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j13 >>> 56) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j13 >>> 49) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j13 >>> 42) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((j13 >>> 35) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((j13 >>> 28) & 127) | 128));
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(j23, (byte) (((j13 >>> 21) & 127) | 128));
            long j24 = this.pos;
            this.pos = j24 - 1;
            UnsafeUtil.putByte(j24, (byte) (((j13 >>> 14) & 127) | 128));
            long j25 = this.pos;
            this.pos = j25 - 1;
            UnsafeUtil.putByte(j25, (byte) (((j13 >>> 7) & 127) | 128));
            long j26 = this.pos;
            this.pos = j26 - 1;
            UnsafeUtil.putByte(j26, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long j13) {
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((int) j13) >>> 14));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j13 >>> 7) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64TwoBytes(long j13) {
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (j13 >>> 7));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i13) {
            if (spaceLeft() < i13) {
                nextBuffer(i13);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte b13) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, b13);
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i13, boolean z13) {
            requireSpace(6);
            write(z13 ? (byte) 1 : (byte) 0);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int i13, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i13, 2);
            } catch (IOException e13) {
                throw new RuntimeException(e13);
            }
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public void writeEndGroup(int i13) {
            writeTag(i13, 4);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int i13, int i14) {
            requireSpace(9);
            writeFixed32(i14);
            writeTag(i13, 5);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int i13, long j13) {
            requireSpace(13);
            writeFixed64(j13);
            writeTag(i13, 1);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i13, Object obj) throws IOException {
            writeTag(i13, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i13, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int i13, int i14) {
            requireSpace(15);
            writeInt32(i14);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i13, int i14) {
            if (spaceLeft() < i14) {
                this.totalDoneBytes += i14;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i13, i14));
                nextBuffer();
            } else {
                this.pos -= (long) i14;
                Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer.put(bArr, i13, i14);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i13, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i13, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int i13, int i14) {
            requireSpace(10);
            writeSInt32(i14);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int i13, long j13) {
            requireSpace(15);
            writeSInt64(j13);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public void writeStartGroup(int i13) {
            writeTag(i13, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int i13, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i13, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i13, int i14) {
            writeVarint32(WireFormat.makeTag(i13, i14));
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int i13, int i14) {
            requireSpace(10);
            writeVarint32(i14);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int i13, long j13) {
            requireSpace(15);
            writeVarint64(j13);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i13) {
            if ((i13 & (-128)) == 0) {
                writeVarint32OneByte(i13);
                return;
            }
            if ((i13 & (-16384)) == 0) {
                writeVarint32TwoBytes(i13);
                return;
            }
            if (((-2097152) & i13) == 0) {
                writeVarint32ThreeBytes(i13);
            } else if (((-268435456) & i13) == 0) {
                writeVarint32FourBytes(i13);
            } else {
                writeVarint32FiveBytes(i13);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j13) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j13)) {
                case 1:
                    writeVarint64OneByte(j13);
                    break;
                case 2:
                    writeVarint64TwoBytes(j13);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j13);
                    break;
                case 4:
                    writeVarint64FourBytes(j13);
                    break;
                case 5:
                    writeVarint64FiveBytes(j13);
                    break;
                case 6:
                    writeVarint64SixBytes(j13);
                    break;
                case 7:
                    writeVarint64SevenBytes(j13);
                    break;
                case 8:
                    writeVarint64EightBytes(j13);
                    break;
                case 9:
                    writeVarint64NineBytes(j13);
                    break;
                case 10:
                    writeVarint64TenBytes(j13);
                    break;
            }
        }

        private void nextBuffer(int i13) {
            nextBuffer(newDirectBuffer(i13));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i13, int i14) {
            if (spaceLeft() < i14) {
                nextBuffer(i14);
            }
            this.pos -= (long) i14;
            Java8Compatibility.position(this.buffer, bufferPos() + 1);
            this.buffer.put(bArr, i13, i14);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer byteBufferNioBuffer = allocatedBuffer.nioBuffer();
                if (byteBufferNioBuffer.isDirect()) {
                    finishCurrentBuffer();
                    this.buffers.addFirst(allocatedBuffer);
                    this.buffer = byteBufferNioBuffer;
                    Java8Compatibility.limit(byteBufferNioBuffer, byteBufferNioBuffer.capacity());
                    Java8Compatibility.position(this.buffer, 0);
                    long jAddressOffset = UnsafeUtil.addressOffset(this.buffer);
                    this.bufferOffset = jAddressOffset;
                    long jLimit = jAddressOffset + ((long) (this.buffer.limit() - 1));
                    this.limitMinusOne = jLimit;
                    this.pos = jLimit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z13) {
            write(z13 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i13) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) ((i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) ((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j13) {
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((int) (j13 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((int) (j13 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((int) (j13 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((int) (j13 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((int) (j13 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((int) (j13 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(j23, (byte) (((int) (j13 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j24 = this.pos;
            this.pos = j24 - 1;
            UnsafeUtil.putByte(j24, (byte) (((int) j13) & KotlinVersion.MAX_COMPONENT_VALUE));
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i13, Object obj, Schema schema) throws IOException {
            writeTag(i13, 4);
            schema.writeTo(obj, this);
            writeTag(i13, 3);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i13) {
            if (i13 >= 0) {
                writeVarint32(i13);
            } else {
                writeVarint64(i13);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i13) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i13));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j13) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j13));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            this.pos -= (long) iRemaining;
            Java8Compatibility.position(this.buffer, bufferPos() + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i13, Object obj, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i13, 2);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0044  */
        /* JADX WARN: Code duplicated, block: B:19:0x0048  */
        /* JADX WARN: Code duplicated, block: B:21:0x0050  */
        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        /* JADX WARN: Code duplicated, block: B:24:0x0070  */
        /* JADX WARN: Code duplicated, block: B:26:0x0075  */
        /* JADX WARN: Code duplicated, block: B:28:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:37:0x0108  */
        /* JADX WARN: Code duplicated, block: B:43:0x0100 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x0100 A[SYNTHETIC] */
        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
            long j13;
            char cCharAt;
            long j14;
            char cCharAt2;
            requireSpace(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (cCharAt2 = str.charAt(length)) >= 128) {
                    break;
                }
                long j15 = this.pos;
                this.pos = j15 - 1;
                UnsafeUtil.putByte(j15, (byte) cCharAt2);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char cCharAt3 = str.charAt(length);
                if (cCharAt3 < 128) {
                    long j16 = this.pos;
                    if (j16 >= this.bufferOffset) {
                        this.pos = j16 - 1;
                        UnsafeUtil.putByte(j16, (byte) cCharAt3);
                    } else if (cCharAt3 < 2048) {
                        j14 = this.pos;
                        if (j14 > this.bufferOffset) {
                            this.pos = j14 - 1;
                            UnsafeUtil.putByte(j14, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                            long j17 = this.pos;
                            this.pos = j17 - 1;
                            UnsafeUtil.putByte(j17, (byte) ((cCharAt3 >>> 6) | 960));
                        } else if (cCharAt3 >= 55296 || 57343 < cCharAt3) {
                            j13 = this.pos;
                            if (j13 > this.bufferOffset + 1) {
                                this.pos = j13 - 1;
                                UnsafeUtil.putByte(j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                                long j18 = this.pos;
                                this.pos = j18 - 1;
                                UnsafeUtil.putByte(j18, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                long j19 = this.pos;
                                this.pos = j19 - 1;
                                UnsafeUtil.putByte(j19, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.pos > this.bufferOffset + 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j23 = this.pos;
                                            this.pos = j23 - 1;
                                            UnsafeUtil.putByte(j23, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                            long j24 = this.pos;
                                            this.pos = j24 - 1;
                                            UnsafeUtil.putByte(j24, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                            long j25 = this.pos;
                                            this.pos = j25 - 1;
                                            UnsafeUtil.putByte(j25, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                            long j26 = this.pos;
                                            this.pos = j26 - 1;
                                            UnsafeUtil.putByte(j26, (byte) ((codePoint >>> 18) | 240));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                requireSpace(length);
                                length++;
                            }
                        } else {
                            if (this.pos > this.bufferOffset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint2 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j27 = this.pos;
                                        this.pos = j27 - 1;
                                        UnsafeUtil.putByte(j27, (byte) ((codePoint2 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j28 = this.pos;
                                        this.pos = j28 - 1;
                                        UnsafeUtil.putByte(j28, (byte) (((codePoint2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j29 = this.pos;
                                        this.pos = j29 - 1;
                                        UnsafeUtil.putByte(j29, (byte) (((codePoint2 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j210 = this.pos;
                                        this.pos = j210 - 1;
                                        UnsafeUtil.putByte(j210, (byte) ((codePoint2 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    } else if (cCharAt3 >= 55296) {
                        j13 = this.pos;
                        if (j13 > this.bufferOffset + 1) {
                            this.pos = j13 - 1;
                            UnsafeUtil.putByte(j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                            long j110 = this.pos;
                            this.pos = j110 - 1;
                            UnsafeUtil.putByte(j110, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            long j111 = this.pos;
                            this.pos = j111 - 1;
                            UnsafeUtil.putByte(j111, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.bufferOffset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint3 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j211 = this.pos;
                                        this.pos = j211 - 1;
                                        UnsafeUtil.putByte(j211, (byte) ((codePoint3 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j212 = this.pos;
                                        this.pos = j212 - 1;
                                        UnsafeUtil.putByte(j212, (byte) (((codePoint3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j213 = this.pos;
                                        this.pos = j213 - 1;
                                        UnsafeUtil.putByte(j213, (byte) (((codePoint3 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j214 = this.pos;
                                        this.pos = j214 - 1;
                                        UnsafeUtil.putByte(j214, (byte) ((codePoint3 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    } else {
                        j13 = this.pos;
                        if (j13 > this.bufferOffset + 1) {
                            this.pos = j13 - 1;
                            UnsafeUtil.putByte(j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                            long j112 = this.pos;
                            this.pos = j112 - 1;
                            UnsafeUtil.putByte(j112, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            long j113 = this.pos;
                            this.pos = j113 - 1;
                            UnsafeUtil.putByte(j113, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.bufferOffset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint4 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j215 = this.pos;
                                        this.pos = j215 - 1;
                                        UnsafeUtil.putByte(j215, (byte) ((codePoint4 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j216 = this.pos;
                                        this.pos = j216 - 1;
                                        UnsafeUtil.putByte(j216, (byte) (((codePoint4 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j217 = this.pos;
                                        this.pos = j217 - 1;
                                        UnsafeUtil.putByte(j217, (byte) (((codePoint4 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j218 = this.pos;
                                        this.pos = j218 - 1;
                                        UnsafeUtil.putByte(j218, (byte) ((codePoint4 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 < 2048) {
                    j14 = this.pos;
                    if (j14 > this.bufferOffset) {
                        this.pos = j14 - 1;
                        UnsafeUtil.putByte(j14, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                        long j114 = this.pos;
                        this.pos = j114 - 1;
                        UnsafeUtil.putByte(j114, (byte) ((cCharAt3 >>> 6) | 960));
                    } else if (cCharAt3 >= 55296) {
                        j13 = this.pos;
                        if (j13 > this.bufferOffset + 1) {
                            this.pos = j13 - 1;
                            UnsafeUtil.putByte(j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                            long j115 = this.pos;
                            this.pos = j115 - 1;
                            UnsafeUtil.putByte(j115, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            long j116 = this.pos;
                            this.pos = j116 - 1;
                            UnsafeUtil.putByte(j116, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.bufferOffset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint5 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j219 = this.pos;
                                        this.pos = j219 - 1;
                                        UnsafeUtil.putByte(j219, (byte) ((codePoint5 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j2110 = this.pos;
                                        this.pos = j2110 - 1;
                                        UnsafeUtil.putByte(j2110, (byte) (((codePoint5 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j2111 = this.pos;
                                        this.pos = j2111 - 1;
                                        UnsafeUtil.putByte(j2111, (byte) (((codePoint5 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j2112 = this.pos;
                                        this.pos = j2112 - 1;
                                        UnsafeUtil.putByte(j2112, (byte) ((codePoint5 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    } else {
                        j13 = this.pos;
                        if (j13 > this.bufferOffset + 1) {
                            this.pos = j13 - 1;
                            UnsafeUtil.putByte(j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                            long j117 = this.pos;
                            this.pos = j117 - 1;
                            UnsafeUtil.putByte(j117, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            long j118 = this.pos;
                            this.pos = j118 - 1;
                            UnsafeUtil.putByte(j118, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.bufferOffset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint6 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j2113 = this.pos;
                                        this.pos = j2113 - 1;
                                        UnsafeUtil.putByte(j2113, (byte) ((codePoint6 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j2114 = this.pos;
                                        this.pos = j2114 - 1;
                                        UnsafeUtil.putByte(j2114, (byte) (((codePoint6 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j2115 = this.pos;
                                        this.pos = j2115 - 1;
                                        UnsafeUtil.putByte(j2115, (byte) (((codePoint6 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        long j2116 = this.pos;
                                        this.pos = j2116 - 1;
                                        UnsafeUtil.putByte(j2116, (byte) ((codePoint6 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 >= 55296) {
                    j13 = this.pos;
                    if (j13 > this.bufferOffset + 1) {
                        this.pos = j13 - 1;
                        UnsafeUtil.putByte(j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                        long j119 = this.pos;
                        this.pos = j119 - 1;
                        UnsafeUtil.putByte(j119, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                        long j1110 = this.pos;
                        this.pos = j1110 - 1;
                        UnsafeUtil.putByte(j1110, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.pos > this.bufferOffset + 2) {
                            if (length != 0) {
                                cCharAt = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint7 = Character.toCodePoint(cCharAt, cCharAt3);
                                    long j2117 = this.pos;
                                    this.pos = j2117 - 1;
                                    UnsafeUtil.putByte(j2117, (byte) ((codePoint7 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    long j2118 = this.pos;
                                    this.pos = j2118 - 1;
                                    UnsafeUtil.putByte(j2118, (byte) (((codePoint7 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    long j2119 = this.pos;
                                    this.pos = j2119 - 1;
                                    UnsafeUtil.putByte(j2119, (byte) (((codePoint7 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    long j21110 = this.pos;
                                    this.pos = j21110 - 1;
                                    UnsafeUtil.putByte(j21110, (byte) ((codePoint7 >>> 18) | 240));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        requireSpace(length);
                        length++;
                    }
                } else {
                    j13 = this.pos;
                    if (j13 > this.bufferOffset + 1) {
                        this.pos = j13 - 1;
                        UnsafeUtil.putByte(j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                        long j1111 = this.pos;
                        this.pos = j1111 - 1;
                        UnsafeUtil.putByte(j1111, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                        long j1112 = this.pos;
                        this.pos = j1112 - 1;
                        UnsafeUtil.putByte(j1112, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.pos > this.bufferOffset + 2) {
                            if (length != 0) {
                                cCharAt = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint8 = Character.toCodePoint(cCharAt, cCharAt3);
                                    long j21111 = this.pos;
                                    this.pos = j21111 - 1;
                                    UnsafeUtil.putByte(j21111, (byte) ((codePoint8 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    long j21112 = this.pos;
                                    this.pos = j21112 - 1;
                                    UnsafeUtil.putByte(j21112, (byte) (((codePoint8 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    long j21113 = this.pos;
                                    this.pos = j21113 - 1;
                                    UnsafeUtil.putByte(j21113, (byte) (((codePoint8 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    long j21114 = this.pos;
                                    this.pos = j21114 - 1;
                                    UnsafeUtil.putByte(j21114, (byte) ((codePoint8 >>> 18) | 240));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        requireSpace(length);
                        length++;
                    }
                }
                length--;
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                this.pos -= (long) iRemaining;
                Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer.put(byteBuffer);
            }
        }
    }

    private static final class UnsafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        UnsafeHeapWriter(BufferAllocator bufferAllocator, int i13) {
            super(bufferAllocator, i13, null);
            nextBuffer();
        }

        private int arrayPos() {
            return (int) this.pos;
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeArrayOperations();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void writeVarint32FiveBytes(int i13) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (i13 >>> 28));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) (((i13 >>> 21) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) (((i13 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            byte[] bArr4 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr4, j16, (byte) (((i13 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            byte[] bArr5 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr5, j17, (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint32FourBytes(int i13) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (i13 >>> 21));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) (((i13 >>> 14) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) (((i13 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            byte[] bArr4 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr4, j16, (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint32OneByte(int i13) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) i13);
        }

        private void writeVarint32ThreeBytes(int i13) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (i13 >>> 14));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) (((i13 >>> 7) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint32TwoBytes(int i13) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (i13 >>> 7));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        private void writeVarint64EightBytes(long j13) {
            byte[] bArr = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr, j14, (byte) (j13 >>> 49));
            byte[] bArr2 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr2, j15, (byte) (((j13 >>> 42) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr3, j16, (byte) (((j13 >>> 35) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr4, j17, (byte) (((j13 >>> 28) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr5, j18, (byte) (((j13 >>> 21) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr6, j19, (byte) (((j13 >>> 14) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(bArr7, j23, (byte) (((j13 >>> 7) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j24 = this.pos;
            this.pos = j24 - 1;
            UnsafeUtil.putByte(bArr8, j24, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64FiveBytes(long j13) {
            byte[] bArr = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr, j14, (byte) (j13 >>> 28));
            byte[] bArr2 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr2, j15, (byte) (((j13 >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr3, j16, (byte) (((j13 >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr4, j17, (byte) (((j13 >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr5, j18, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64FourBytes(long j13) {
            byte[] bArr = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr, j14, (byte) (j13 >>> 21));
            byte[] bArr2 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr2, j15, (byte) (((j13 >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr3, j16, (byte) (((j13 >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr4, j17, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64NineBytes(long j13) {
            byte[] bArr = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr, j14, (byte) (j13 >>> 56));
            byte[] bArr2 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr2, j15, (byte) (((j13 >>> 49) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr3, j16, (byte) (((j13 >>> 42) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr4, j17, (byte) (((j13 >>> 35) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr5, j18, (byte) (((j13 >>> 28) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr6, j19, (byte) (((j13 >>> 21) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(bArr7, j23, (byte) (((j13 >>> 14) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j24 = this.pos;
            this.pos = j24 - 1;
            UnsafeUtil.putByte(bArr8, j24, (byte) (((j13 >>> 7) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j25 = this.pos;
            this.pos = j25 - 1;
            UnsafeUtil.putByte(bArr9, j25, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64OneByte(long j13) {
            byte[] bArr = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr, j14, (byte) j13);
        }

        private void writeVarint64SevenBytes(long j13) {
            byte[] bArr = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr, j14, (byte) (j13 >>> 42));
            byte[] bArr2 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr2, j15, (byte) (((j13 >>> 35) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr3, j16, (byte) (((j13 >>> 28) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr4, j17, (byte) (((j13 >>> 21) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr5, j18, (byte) (((j13 >>> 14) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr6, j19, (byte) (((j13 >>> 7) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(bArr7, j23, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64SixBytes(long j13) {
            byte[] bArr = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr, j14, (byte) (j13 >>> 35));
            byte[] bArr2 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr2, j15, (byte) (((j13 >>> 28) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr3, j16, (byte) (((j13 >>> 21) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr4, j17, (byte) (((j13 >>> 14) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr5, j18, (byte) (((j13 >>> 7) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr6, j19, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64TenBytes(long j13) {
            byte[] bArr = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr, j14, (byte) (j13 >>> 63));
            byte[] bArr2 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr2, j15, (byte) (((j13 >>> 56) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr3, j16, (byte) (((j13 >>> 49) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr4, j17, (byte) (((j13 >>> 42) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr5, j18, (byte) (((j13 >>> 35) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr6, j19, (byte) (((j13 >>> 28) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(bArr7, j23, (byte) (((j13 >>> 21) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j24 = this.pos;
            this.pos = j24 - 1;
            UnsafeUtil.putByte(bArr8, j24, (byte) (((j13 >>> 14) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j25 = this.pos;
            this.pos = j25 - 1;
            UnsafeUtil.putByte(bArr9, j25, (byte) (((j13 >>> 7) & 127) | 128));
            byte[] bArr10 = this.buffer;
            long j26 = this.pos;
            this.pos = j26 - 1;
            UnsafeUtil.putByte(bArr10, j26, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long j13) {
            byte[] bArr = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr, j14, (byte) (((int) j13) >>> 14));
            byte[] bArr2 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr2, j15, (byte) (((j13 >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr3, j16, (byte) ((j13 & 127) | 128));
        }

        private void writeVarint64TwoBytes(long j13) {
            byte[] bArr = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr, j14, (byte) (j13 >>> 7));
            byte[] bArr2 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr2, j15, (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
        }

        int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.allocatedBuffer.position((arrayPos() - this.allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i13) {
            if (spaceLeft() < i13) {
                nextBuffer(i13);
            }
        }

        int spaceLeft() {
            return (int) (this.pos - this.offsetMinusOne);
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte b13) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, b13);
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i13, boolean z13) {
            requireSpace(6);
            write(z13 ? (byte) 1 : (byte) 0);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int i13, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i13, 2);
            } catch (IOException e13) {
                throw new RuntimeException(e13);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeEndGroup(int i13) {
            writeTag(i13, 4);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int i13, int i14) {
            requireSpace(9);
            writeFixed32(i14);
            writeTag(i13, 5);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int i13, long j13) {
            requireSpace(13);
            writeFixed64(j13);
            writeTag(i13, 1);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i13, Object obj) throws IOException {
            writeTag(i13, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i13, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int i13, int i14) {
            requireSpace(15);
            writeInt32(i14);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i13, int i14) {
            if (i13 < 0 || i13 + i14 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i14)));
            }
            if (spaceLeft() >= i14) {
                this.pos -= (long) i14;
                System.arraycopy(bArr, i13, this.buffer, arrayPos() + 1, i14);
            } else {
                this.totalDoneBytes += i14;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i13, i14));
                nextBuffer();
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i13, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i13, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int i13, int i14) {
            requireSpace(10);
            writeSInt32(i14);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int i13, long j13) {
            requireSpace(15);
            writeSInt64(j13);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeStartGroup(int i13) {
            writeTag(i13, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int i13, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i13, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i13, int i14) {
            writeVarint32(WireFormat.makeTag(i13, i14));
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int i13, int i14) {
            requireSpace(10);
            writeVarint32(i14);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int i13, long j13) {
            requireSpace(15);
            writeVarint64(j13);
            writeTag(i13, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i13) {
            if ((i13 & (-128)) == 0) {
                writeVarint32OneByte(i13);
                return;
            }
            if ((i13 & (-16384)) == 0) {
                writeVarint32TwoBytes(i13);
                return;
            }
            if (((-2097152) & i13) == 0) {
                writeVarint32ThreeBytes(i13);
            } else if (((-268435456) & i13) == 0) {
                writeVarint32FourBytes(i13);
            } else {
                writeVarint32FiveBytes(i13);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j13) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j13)) {
                case 1:
                    writeVarint64OneByte(j13);
                    break;
                case 2:
                    writeVarint64TwoBytes(j13);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j13);
                    break;
                case 4:
                    writeVarint64FourBytes(j13);
                    break;
                case 5:
                    writeVarint64FiveBytes(j13);
                    break;
                case 6:
                    writeVarint64SixBytes(j13);
                    break;
                case 7:
                    writeVarint64SevenBytes(j13);
                    break;
                case 8:
                    writeVarint64EightBytes(j13);
                    break;
                case 9:
                    writeVarint64NineBytes(j13);
                    break;
                case 10:
                    writeVarint64TenBytes(j13);
                    break;
            }
        }

        private void nextBuffer(int i13) {
            nextBuffer(newHeapBuffer(i13));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i13, int i14) {
            if (i13 < 0 || i13 + i14 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i14)));
            }
            requireSpace(i14);
            this.pos -= (long) i14;
            System.arraycopy(bArr, i13, this.buffer, arrayPos() + 1, i14);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                finishCurrentBuffer();
                this.buffers.addFirst(allocatedBuffer);
                this.allocatedBuffer = allocatedBuffer;
                this.buffer = allocatedBuffer.array();
                long jArrayOffset = allocatedBuffer.arrayOffset();
                this.limit = ((long) allocatedBuffer.limit()) + jArrayOffset;
                long jPosition = jArrayOffset + ((long) allocatedBuffer.position());
                this.offset = jPosition;
                this.offsetMinusOne = jPosition - 1;
                long j13 = this.limit - 1;
                this.limitMinusOne = j13;
                this.pos = j13;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z13) {
            write(z13 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i13) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) ((i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) ((i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) ((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
            byte[] bArr4 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr4, j16, (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j13) {
            byte[] bArr = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr, j14, (byte) (((int) (j13 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE));
            byte[] bArr2 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr2, j15, (byte) (((int) (j13 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE));
            byte[] bArr3 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr3, j16, (byte) (((int) (j13 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE));
            byte[] bArr4 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr4, j17, (byte) (((int) (j13 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE));
            byte[] bArr5 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr5, j18, (byte) (((int) (j13 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE));
            byte[] bArr6 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr6, j19, (byte) (((int) (j13 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE));
            byte[] bArr7 = this.buffer;
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(bArr7, j23, (byte) (((int) (j13 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE));
            byte[] bArr8 = this.buffer;
            long j24 = this.pos;
            this.pos = j24 - 1;
            UnsafeUtil.putByte(bArr8, j24, (byte) (((int) j13) & KotlinVersion.MAX_COMPONENT_VALUE));
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i13, Object obj, Schema schema) throws IOException {
            writeTag(i13, 4);
            schema.writeTo(obj, this);
            writeTag(i13, 3);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i13) {
            if (i13 >= 0) {
                writeVarint32(i13);
            } else {
                writeVarint64(i13);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i13) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i13));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j13) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j13));
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i13, Object obj, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i13, 2);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0048  */
        /* JADX WARN: Code duplicated, block: B:19:0x004c  */
        /* JADX WARN: Code duplicated, block: B:21:0x0054  */
        /* JADX WARN: Code duplicated, block: B:22:0x0073  */
        /* JADX WARN: Code duplicated, block: B:24:0x0078  */
        /* JADX WARN: Code duplicated, block: B:26:0x007d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0086  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:37:0x011e  */
        /* JADX WARN: Code duplicated, block: B:43:0x0116 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x0116 A[SYNTHETIC] */
        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
            long j13;
            char cCharAt;
            long j14;
            char cCharAt2;
            requireSpace(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (cCharAt2 = str.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.buffer;
                long j15 = this.pos;
                this.pos = j15 - 1;
                UnsafeUtil.putByte(bArr, j15, (byte) cCharAt2);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char cCharAt3 = str.charAt(length);
                if (cCharAt3 < 128) {
                    long j16 = this.pos;
                    if (j16 > this.offsetMinusOne) {
                        byte[] bArr2 = this.buffer;
                        this.pos = j16 - 1;
                        UnsafeUtil.putByte(bArr2, j16, (byte) cCharAt3);
                    } else if (cCharAt3 < 2048) {
                        j14 = this.pos;
                        if (j14 > this.offset) {
                            byte[] bArr3 = this.buffer;
                            this.pos = j14 - 1;
                            UnsafeUtil.putByte(bArr3, j14, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr4 = this.buffer;
                            long j17 = this.pos;
                            this.pos = j17 - 1;
                            UnsafeUtil.putByte(bArr4, j17, (byte) ((cCharAt3 >>> 6) | 960));
                        } else if (cCharAt3 >= 55296 || 57343 < cCharAt3) {
                            j13 = this.pos;
                            if (j13 > this.offset + 1) {
                                byte[] bArr5 = this.buffer;
                                this.pos = j13 - 1;
                                UnsafeUtil.putByte(bArr5, j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                                byte[] bArr6 = this.buffer;
                                long j18 = this.pos;
                                this.pos = j18 - 1;
                                UnsafeUtil.putByte(bArr6, j18, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                byte[] bArr7 = this.buffer;
                                long j19 = this.pos;
                                this.pos = j19 - 1;
                                UnsafeUtil.putByte(bArr7, j19, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.pos > this.offset + 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt3);
                                            byte[] bArr8 = this.buffer;
                                            long j23 = this.pos;
                                            this.pos = j23 - 1;
                                            UnsafeUtil.putByte(bArr8, j23, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                            byte[] bArr9 = this.buffer;
                                            long j24 = this.pos;
                                            this.pos = j24 - 1;
                                            UnsafeUtil.putByte(bArr9, j24, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                            byte[] bArr10 = this.buffer;
                                            long j25 = this.pos;
                                            this.pos = j25 - 1;
                                            UnsafeUtil.putByte(bArr10, j25, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                            byte[] bArr11 = this.buffer;
                                            long j26 = this.pos;
                                            this.pos = j26 - 1;
                                            UnsafeUtil.putByte(bArr11, j26, (byte) ((codePoint >>> 18) | 240));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                requireSpace(length);
                                length++;
                            }
                        } else {
                            if (this.pos > this.offset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint2 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr12 = this.buffer;
                                        long j27 = this.pos;
                                        this.pos = j27 - 1;
                                        UnsafeUtil.putByte(bArr12, j27, (byte) ((codePoint2 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr13 = this.buffer;
                                        long j28 = this.pos;
                                        this.pos = j28 - 1;
                                        UnsafeUtil.putByte(bArr13, j28, (byte) (((codePoint2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr14 = this.buffer;
                                        long j29 = this.pos;
                                        this.pos = j29 - 1;
                                        UnsafeUtil.putByte(bArr14, j29, (byte) (((codePoint2 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr15 = this.buffer;
                                        long j210 = this.pos;
                                        this.pos = j210 - 1;
                                        UnsafeUtil.putByte(bArr15, j210, (byte) ((codePoint2 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    } else if (cCharAt3 >= 55296) {
                        j13 = this.pos;
                        if (j13 > this.offset + 1) {
                            byte[] bArr16 = this.buffer;
                            this.pos = j13 - 1;
                            UnsafeUtil.putByte(bArr16, j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr17 = this.buffer;
                            long j110 = this.pos;
                            this.pos = j110 - 1;
                            UnsafeUtil.putByte(bArr17, j110, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr18 = this.buffer;
                            long j111 = this.pos;
                            this.pos = j111 - 1;
                            UnsafeUtil.putByte(bArr18, j111, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.offset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint3 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr19 = this.buffer;
                                        long j211 = this.pos;
                                        this.pos = j211 - 1;
                                        UnsafeUtil.putByte(bArr19, j211, (byte) ((codePoint3 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr110 = this.buffer;
                                        long j212 = this.pos;
                                        this.pos = j212 - 1;
                                        UnsafeUtil.putByte(bArr110, j212, (byte) (((codePoint3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr111 = this.buffer;
                                        long j213 = this.pos;
                                        this.pos = j213 - 1;
                                        UnsafeUtil.putByte(bArr111, j213, (byte) (((codePoint3 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr112 = this.buffer;
                                        long j214 = this.pos;
                                        this.pos = j214 - 1;
                                        UnsafeUtil.putByte(bArr112, j214, (byte) ((codePoint3 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    } else {
                        j13 = this.pos;
                        if (j13 > this.offset + 1) {
                            byte[] bArr113 = this.buffer;
                            this.pos = j13 - 1;
                            UnsafeUtil.putByte(bArr113, j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr114 = this.buffer;
                            long j112 = this.pos;
                            this.pos = j112 - 1;
                            UnsafeUtil.putByte(bArr114, j112, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr115 = this.buffer;
                            long j113 = this.pos;
                            this.pos = j113 - 1;
                            UnsafeUtil.putByte(bArr115, j113, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.offset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint4 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr116 = this.buffer;
                                        long j215 = this.pos;
                                        this.pos = j215 - 1;
                                        UnsafeUtil.putByte(bArr116, j215, (byte) ((codePoint4 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr117 = this.buffer;
                                        long j216 = this.pos;
                                        this.pos = j216 - 1;
                                        UnsafeUtil.putByte(bArr117, j216, (byte) (((codePoint4 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr118 = this.buffer;
                                        long j217 = this.pos;
                                        this.pos = j217 - 1;
                                        UnsafeUtil.putByte(bArr118, j217, (byte) (((codePoint4 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr119 = this.buffer;
                                        long j218 = this.pos;
                                        this.pos = j218 - 1;
                                        UnsafeUtil.putByte(bArr119, j218, (byte) ((codePoint4 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 < 2048) {
                    j14 = this.pos;
                    if (j14 > this.offset) {
                        byte[] bArr20 = this.buffer;
                        this.pos = j14 - 1;
                        UnsafeUtil.putByte(bArr20, j14, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                        byte[] bArr21 = this.buffer;
                        long j114 = this.pos;
                        this.pos = j114 - 1;
                        UnsafeUtil.putByte(bArr21, j114, (byte) ((cCharAt3 >>> 6) | 960));
                    } else if (cCharAt3 >= 55296) {
                        j13 = this.pos;
                        if (j13 > this.offset + 1) {
                            byte[] bArr1110 = this.buffer;
                            this.pos = j13 - 1;
                            UnsafeUtil.putByte(bArr1110, j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr1111 = this.buffer;
                            long j115 = this.pos;
                            this.pos = j115 - 1;
                            UnsafeUtil.putByte(bArr1111, j115, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr1112 = this.buffer;
                            long j116 = this.pos;
                            this.pos = j116 - 1;
                            UnsafeUtil.putByte(bArr1112, j116, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.offset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint5 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr1113 = this.buffer;
                                        long j219 = this.pos;
                                        this.pos = j219 - 1;
                                        UnsafeUtil.putByte(bArr1113, j219, (byte) ((codePoint5 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr1114 = this.buffer;
                                        long j2110 = this.pos;
                                        this.pos = j2110 - 1;
                                        UnsafeUtil.putByte(bArr1114, j2110, (byte) (((codePoint5 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr1115 = this.buffer;
                                        long j2111 = this.pos;
                                        this.pos = j2111 - 1;
                                        UnsafeUtil.putByte(bArr1115, j2111, (byte) (((codePoint5 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr1116 = this.buffer;
                                        long j2112 = this.pos;
                                        this.pos = j2112 - 1;
                                        UnsafeUtil.putByte(bArr1116, j2112, (byte) ((codePoint5 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    } else {
                        j13 = this.pos;
                        if (j13 > this.offset + 1) {
                            byte[] bArr1117 = this.buffer;
                            this.pos = j13 - 1;
                            UnsafeUtil.putByte(bArr1117, j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr1118 = this.buffer;
                            long j117 = this.pos;
                            this.pos = j117 - 1;
                            UnsafeUtil.putByte(bArr1118, j117, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr1119 = this.buffer;
                            long j118 = this.pos;
                            this.pos = j118 - 1;
                            UnsafeUtil.putByte(bArr1119, j118, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.offset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint6 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr11110 = this.buffer;
                                        long j2113 = this.pos;
                                        this.pos = j2113 - 1;
                                        UnsafeUtil.putByte(bArr11110, j2113, (byte) ((codePoint6 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr11111 = this.buffer;
                                        long j2114 = this.pos;
                                        this.pos = j2114 - 1;
                                        UnsafeUtil.putByte(bArr11111, j2114, (byte) (((codePoint6 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr11112 = this.buffer;
                                        long j2115 = this.pos;
                                        this.pos = j2115 - 1;
                                        UnsafeUtil.putByte(bArr11112, j2115, (byte) (((codePoint6 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                        byte[] bArr11113 = this.buffer;
                                        long j2116 = this.pos;
                                        this.pos = j2116 - 1;
                                        UnsafeUtil.putByte(bArr11113, j2116, (byte) ((codePoint6 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 >= 55296) {
                    j13 = this.pos;
                    if (j13 > this.offset + 1) {
                        byte[] bArr11114 = this.buffer;
                        this.pos = j13 - 1;
                        UnsafeUtil.putByte(bArr11114, j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                        byte[] bArr11115 = this.buffer;
                        long j119 = this.pos;
                        this.pos = j119 - 1;
                        UnsafeUtil.putByte(bArr11115, j119, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                        byte[] bArr11116 = this.buffer;
                        long j1110 = this.pos;
                        this.pos = j1110 - 1;
                        UnsafeUtil.putByte(bArr11116, j1110, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.pos > this.offset + 2) {
                            if (length != 0) {
                                cCharAt = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint7 = Character.toCodePoint(cCharAt, cCharAt3);
                                    byte[] bArr11117 = this.buffer;
                                    long j2117 = this.pos;
                                    this.pos = j2117 - 1;
                                    UnsafeUtil.putByte(bArr11117, j2117, (byte) ((codePoint7 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    byte[] bArr11118 = this.buffer;
                                    long j2118 = this.pos;
                                    this.pos = j2118 - 1;
                                    UnsafeUtil.putByte(bArr11118, j2118, (byte) (((codePoint7 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    byte[] bArr11119 = this.buffer;
                                    long j2119 = this.pos;
                                    this.pos = j2119 - 1;
                                    UnsafeUtil.putByte(bArr11119, j2119, (byte) (((codePoint7 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    byte[] bArr111110 = this.buffer;
                                    long j21110 = this.pos;
                                    this.pos = j21110 - 1;
                                    UnsafeUtil.putByte(bArr111110, j21110, (byte) ((codePoint7 >>> 18) | 240));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        requireSpace(length);
                        length++;
                    }
                } else {
                    j13 = this.pos;
                    if (j13 > this.offset + 1) {
                        byte[] bArr111111 = this.buffer;
                        this.pos = j13 - 1;
                        UnsafeUtil.putByte(bArr111111, j13, (byte) ((cCharAt3 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                        byte[] bArr111112 = this.buffer;
                        long j1111 = this.pos;
                        this.pos = j1111 - 1;
                        UnsafeUtil.putByte(bArr111112, j1111, (byte) (((cCharAt3 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                        byte[] bArr111113 = this.buffer;
                        long j1112 = this.pos;
                        this.pos = j1112 - 1;
                        UnsafeUtil.putByte(bArr111113, j1112, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.pos > this.offset + 2) {
                            if (length != 0) {
                                cCharAt = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint8 = Character.toCodePoint(cCharAt, cCharAt3);
                                    byte[] bArr111114 = this.buffer;
                                    long j21111 = this.pos;
                                    this.pos = j21111 - 1;
                                    UnsafeUtil.putByte(bArr111114, j21111, (byte) ((codePoint8 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    byte[] bArr111115 = this.buffer;
                                    long j21112 = this.pos;
                                    this.pos = j21112 - 1;
                                    UnsafeUtil.putByte(bArr111115, j21112, (byte) (((codePoint8 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    byte[] bArr111116 = this.buffer;
                                    long j21113 = this.pos;
                                    this.pos = j21113 - 1;
                                    UnsafeUtil.putByte(bArr111116, j21113, (byte) (((codePoint8 >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    byte[] bArr111117 = this.buffer;
                                    long j21114 = this.pos;
                                    this.pos = j21114 - 1;
                                    UnsafeUtil.putByte(bArr111117, j21114, (byte) ((codePoint8 >>> 18) | 240));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        requireSpace(length);
                        length++;
                    }
                }
                length--;
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            requireSpace(iRemaining);
            this.pos -= (long) iRemaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, iRemaining);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            this.pos -= (long) iRemaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, iRemaining);
        }
    }

    /* synthetic */ BinaryWriter(BufferAllocator bufferAllocator, int i13, AnonymousClass1 anonymousClass1) {
        this(bufferAllocator, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte computeUInt64SizeNoTag(long j13) {
        byte b13;
        if (((-128) & j13) == 0) {
            return (byte) 1;
        }
        if (j13 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j13) != 0) {
            b13 = (byte) 6;
            j13 >>>= 28;
        } else {
            b13 = 2;
        }
        if (((-2097152) & j13) != 0) {
            b13 = (byte) (b13 + 2);
            j13 >>>= 14;
        }
        return (j13 & (-16384)) != 0 ? (byte) (b13 + 1) : b13;
    }

    static boolean isUnsafeDirectSupported() {
        return UnsafeDirectWriter.isSupported();
    }

    static boolean isUnsafeHeapSupported() {
        return UnsafeHeapWriter.isSupported();
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator) {
        return newDirectInstance(bufferAllocator, 4096);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator) {
        return newHeapInstance(bufferAllocator, 4096);
    }

    static BinaryWriter newSafeDirectInstance(BufferAllocator bufferAllocator, int i13) {
        return new SafeDirectWriter(bufferAllocator, i13);
    }

    static BinaryWriter newSafeHeapInstance(BufferAllocator bufferAllocator, int i13) {
        return new SafeHeapWriter(bufferAllocator, i13);
    }

    static BinaryWriter newUnsafeDirectInstance(BufferAllocator bufferAllocator, int i13) {
        if (isUnsafeDirectSupported()) {
            return new UnsafeDirectWriter(bufferAllocator, i13);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    static BinaryWriter newUnsafeHeapInstance(BufferAllocator bufferAllocator, int i13) {
        if (isUnsafeHeapSupported()) {
            return new UnsafeHeapWriter(bufferAllocator, i13);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    private void writeBoolList_Internal(int i13, List<Boolean> list, boolean z13) throws IOException {
        if (!z13) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(i13, list.get(size).booleanValue());
            }
            return;
        }
        requireSpace(list.size() + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(list.get(size2).booleanValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i13, 2);
    }

    private void writeDoubleList_Internal(int i13, List<Double> list, boolean z13) throws IOException {
        if (!z13) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeDouble(i13, list.get(size).doubleValue());
            }
            return;
        }
        requireSpace((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i13, 2);
    }

    private void writeFixed32List_Internal(int i13, List<Integer> list, boolean z13) throws IOException {
        if (!z13) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(i13, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i13, 2);
    }

    private void writeFixed64List_Internal(int i13, List<Long> list, boolean z13) throws IOException {
        if (!z13) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(i13, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i13, 2);
    }

    private void writeFloatList_Internal(int i13, List<Float> list, boolean z13) throws IOException {
        if (!z13) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFloat(i13, list.get(size).floatValue());
            }
            return;
        }
        requireSpace((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i13, 2);
    }

    private void writeInt32List_Internal(int i13, List<Integer> list, boolean z13) throws IOException {
        if (!z13) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(i13, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i13, 2);
    }

    private void writeLazyString(int i13, Object obj) throws IOException {
        if (obj instanceof String) {
            writeString(i13, (String) obj);
        } else {
            writeBytes(i13, (ByteString) obj);
        }
    }

    static final void writeMapEntryField(Writer writer, int i13, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                writer.writeBool(i13, ((Boolean) obj).booleanValue());
                return;
            case 2:
                writer.writeFixed32(i13, ((Integer) obj).intValue());
                return;
            case 3:
                writer.writeFixed64(i13, ((Long) obj).longValue());
                return;
            case 4:
                writer.writeInt32(i13, ((Integer) obj).intValue());
                return;
            case 5:
                writer.writeInt64(i13, ((Long) obj).longValue());
                return;
            case 6:
                writer.writeSFixed32(i13, ((Integer) obj).intValue());
                return;
            case 7:
                writer.writeSFixed64(i13, ((Long) obj).longValue());
                return;
            case 8:
                writer.writeSInt32(i13, ((Integer) obj).intValue());
                return;
            case 9:
                writer.writeSInt64(i13, ((Long) obj).longValue());
                return;
            case 10:
                writer.writeString(i13, (String) obj);
                return;
            case 11:
                writer.writeUInt32(i13, ((Integer) obj).intValue());
                return;
            case 12:
                writer.writeUInt64(i13, ((Long) obj).longValue());
                return;
            case 13:
                writer.writeFloat(i13, ((Float) obj).floatValue());
                return;
            case 14:
                writer.writeDouble(i13, ((Double) obj).doubleValue());
                return;
            case 15:
                writer.writeMessage(i13, obj);
                return;
            case 16:
                writer.writeBytes(i13, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof Internal.EnumLite) {
                    writer.writeEnum(i13, ((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    writer.writeEnum(i13, ((Integer) obj).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    private void writeSInt32List_Internal(int i13, List<Integer> list, boolean z13) throws IOException {
        if (!z13) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(i13, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i13, 2);
    }

    private void writeSInt64List_Internal(int i13, List<Long> list, boolean z13) throws IOException {
        if (!z13) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(i13, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i13, 2);
    }

    private void writeUInt32List_Internal(int i13, List<Integer> list, boolean z13) throws IOException {
        if (!z13) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt32(i13, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i13, 2);
    }

    private void writeUInt64List_Internal(int i13, List<Long> list, boolean z13) throws IOException {
        if (!z13) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt64(i13, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i13, 2);
    }

    @CanIgnoreReturnValue
    public final Queue<AllocatedBuffer> complete() {
        finishCurrentBuffer();
        return this.buffers;
    }

    @Override // com.google.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.DESCENDING;
    }

    abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    final AllocatedBuffer newDirectBuffer() {
        return this.alloc.allocateDirectBuffer(this.chunkSize);
    }

    final AllocatedBuffer newHeapBuffer() {
        return this.alloc.allocateHeapBuffer(this.chunkSize);
    }

    abstract void requireSpace(int i13);

    abstract void writeBool(boolean z13);

    @Override // com.google.protobuf.Writer
    public final void writeBoolList(int i13, List<Boolean> list, boolean z13) throws IOException {
        if (list instanceof BooleanArrayList) {
            writeBoolList_Internal(i13, (BooleanArrayList) list, z13);
        } else {
            writeBoolList_Internal(i13, list, z13);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeBytesList(int i13, List<ByteString> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeBytes(i13, list.get(size));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeDouble(int i13, double d13) throws IOException {
        writeFixed64(i13, Double.doubleToRawLongBits(d13));
    }

    @Override // com.google.protobuf.Writer
    public final void writeDoubleList(int i13, List<Double> list, boolean z13) throws IOException {
        if (list instanceof DoubleArrayList) {
            writeDoubleList_Internal(i13, (DoubleArrayList) list, z13);
        } else {
            writeDoubleList_Internal(i13, list, z13);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnum(int i13, int i14) throws IOException {
        writeInt32(i13, i14);
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnumList(int i13, List<Integer> list, boolean z13) throws IOException {
        writeInt32List(i13, list, z13);
    }

    abstract void writeFixed32(int i13);

    @Override // com.google.protobuf.Writer
    public final void writeFixed32List(int i13, List<Integer> list, boolean z13) throws IOException {
        if (list instanceof IntArrayList) {
            writeFixed32List_Internal(i13, (IntArrayList) list, z13);
        } else {
            writeFixed32List_Internal(i13, list, z13);
        }
    }

    abstract void writeFixed64(long j13);

    @Override // com.google.protobuf.Writer
    public final void writeFixed64List(int i13, List<Long> list, boolean z13) throws IOException {
        if (list instanceof LongArrayList) {
            writeFixed64List_Internal(i13, (LongArrayList) list, z13);
        } else {
            writeFixed64List_Internal(i13, list, z13);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloat(int i13, float f13) throws IOException {
        writeFixed32(i13, Float.floatToRawIntBits(f13));
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloatList(int i13, List<Float> list, boolean z13) throws IOException {
        if (list instanceof FloatArrayList) {
            writeFloatList_Internal(i13, (FloatArrayList) list, z13);
        } else {
            writeFloatList_Internal(i13, list, z13);
        }
    }

    @Override // com.google.protobuf.Writer
    @Deprecated
    public final void writeGroupList(int i13, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i13, list.get(size));
        }
    }

    abstract void writeInt32(int i13);

    @Override // com.google.protobuf.Writer
    public final void writeInt32List(int i13, List<Integer> list, boolean z13) throws IOException {
        if (list instanceof IntArrayList) {
            writeInt32List_Internal(i13, (IntArrayList) list, z13);
        } else {
            writeInt32List_Internal(i13, list, z13);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64(int i13, long j13) throws IOException {
        writeUInt64(i13, j13);
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64List(int i13, List<Long> list, boolean z13) throws IOException {
        writeUInt64List(i13, list, z13);
    }

    @Override // com.google.protobuf.Writer
    public <K, V> void writeMap(int i13, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int totalBytesWritten = getTotalBytesWritten();
            writeMapEntryField(this, 2, metadata.valueType, entry.getValue());
            writeMapEntryField(this, 1, metadata.keyType, entry.getKey());
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i13, 2);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageList(int i13, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i13, list.get(size));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageSetItem(int i13, Object obj) throws IOException {
        writeTag(1, 4);
        if (obj instanceof ByteString) {
            writeBytes(3, (ByteString) obj);
        } else {
            writeMessage(3, obj);
        }
        writeUInt32(2, i13);
        writeTag(1, 3);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32(int i13, int i14) throws IOException {
        writeFixed32(i13, i14);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32List(int i13, List<Integer> list, boolean z13) throws IOException {
        writeFixed32List(i13, list, z13);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64(int i13, long j13) throws IOException {
        writeFixed64(i13, j13);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64List(int i13, List<Long> list, boolean z13) throws IOException {
        writeFixed64List(i13, list, z13);
    }

    abstract void writeSInt32(int i13);

    @Override // com.google.protobuf.Writer
    public final void writeSInt32List(int i13, List<Integer> list, boolean z13) throws IOException {
        if (list instanceof IntArrayList) {
            writeSInt32List_Internal(i13, (IntArrayList) list, z13);
        } else {
            writeSInt32List_Internal(i13, list, z13);
        }
    }

    abstract void writeSInt64(long j13);

    @Override // com.google.protobuf.Writer
    public final void writeSInt64List(int i13, List<Long> list, boolean z13) throws IOException {
        if (list instanceof LongArrayList) {
            writeSInt64List_Internal(i13, (LongArrayList) list, z13);
        } else {
            writeSInt64List_Internal(i13, list, z13);
        }
    }

    abstract void writeString(String str);

    @Override // com.google.protobuf.Writer
    public final void writeStringList(int i13, List<String> list) throws IOException {
        if (!(list instanceof LazyStringList)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeString(i13, list.get(size));
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeLazyString(i13, lazyStringList.getRaw(size2));
        }
    }

    abstract void writeTag(int i13, int i14);

    @Override // com.google.protobuf.Writer
    public final void writeUInt32List(int i13, List<Integer> list, boolean z13) throws IOException {
        if (list instanceof IntArrayList) {
            writeUInt32List_Internal(i13, (IntArrayList) list, z13);
        } else {
            writeUInt32List_Internal(i13, list, z13);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt64List(int i13, List<Long> list, boolean z13) throws IOException {
        if (list instanceof LongArrayList) {
            writeUInt64List_Internal(i13, (LongArrayList) list, z13);
        } else {
            writeUInt64List_Internal(i13, list, z13);
        }
    }

    abstract void writeVarint32(int i13);

    abstract void writeVarint64(long j13);

    private BinaryWriter(BufferAllocator bufferAllocator, int i13) {
        this.buffers = new ArrayDeque<>(4);
        if (i13 <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.alloc = (BufferAllocator) Internal.checkNotNull(bufferAllocator, "alloc");
        this.chunkSize = i13;
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator, int i13) {
        return isUnsafeDirectSupported() ? newUnsafeDirectInstance(bufferAllocator, i13) : newSafeDirectInstance(bufferAllocator, i13);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator, int i13) {
        return isUnsafeHeapSupported() ? newUnsafeHeapInstance(bufferAllocator, i13) : newSafeHeapInstance(bufferAllocator, i13);
    }

    final AllocatedBuffer newDirectBuffer(int i13) {
        return this.alloc.allocateDirectBuffer(Math.max(i13, this.chunkSize));
    }

    final AllocatedBuffer newHeapBuffer(int i13) {
        return this.alloc.allocateHeapBuffer(Math.max(i13, this.chunkSize));
    }

    @Override // com.google.protobuf.Writer
    @Deprecated
    public final void writeGroupList(int i13, List<?> list, Schema schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i13, list.get(size), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageList(int i13, List<?> list, Schema schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i13, list.get(size), schema);
        }
    }

    private void writeBoolList_Internal(int i13, BooleanArrayList booleanArrayList, boolean z13) throws IOException {
        if (z13) {
            requireSpace(booleanArrayList.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = booleanArrayList.size() - 1; size >= 0; size--) {
                writeBool(booleanArrayList.getBoolean(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i13, 2);
            return;
        }
        for (int size2 = booleanArrayList.size() - 1; size2 >= 0; size2--) {
            writeBool(i13, booleanArrayList.getBoolean(size2));
        }
    }

    private void writeDoubleList_Internal(int i13, DoubleArrayList doubleArrayList, boolean z13) throws IOException {
        if (z13) {
            requireSpace((doubleArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = doubleArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(Double.doubleToRawLongBits(doubleArrayList.getDouble(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i13, 2);
            return;
        }
        for (int size2 = doubleArrayList.size() - 1; size2 >= 0; size2--) {
            writeDouble(i13, doubleArrayList.getDouble(size2));
        }
    }

    private void writeFixed32List_Internal(int i13, IntArrayList intArrayList, boolean z13) throws IOException {
        if (z13) {
            requireSpace((intArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i13, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed32(i13, intArrayList.getInt(size2));
        }
    }

    private void writeFixed64List_Internal(int i13, LongArrayList longArrayList, boolean z13) throws IOException {
        if (z13) {
            requireSpace((longArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i13, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed64(i13, longArrayList.getLong(size2));
        }
    }

    private void writeFloatList_Internal(int i13, FloatArrayList floatArrayList, boolean z13) throws IOException {
        if (z13) {
            requireSpace((floatArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = floatArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(Float.floatToRawIntBits(floatArrayList.getFloat(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i13, 2);
            return;
        }
        for (int size2 = floatArrayList.size() - 1; size2 >= 0; size2--) {
            writeFloat(i13, floatArrayList.getFloat(size2));
        }
    }

    private void writeInt32List_Internal(int i13, IntArrayList intArrayList, boolean z13) throws IOException {
        if (z13) {
            requireSpace((intArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i13, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeInt32(i13, intArrayList.getInt(size2));
        }
    }

    private void writeSInt32List_Internal(int i13, IntArrayList intArrayList, boolean z13) throws IOException {
        if (z13) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeSInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i13, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt32(i13, intArrayList.getInt(size2));
        }
    }

    private void writeSInt64List_Internal(int i13, LongArrayList longArrayList, boolean z13) throws IOException {
        if (z13) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeSInt64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i13, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt64(i13, longArrayList.getLong(size2));
        }
    }

    private void writeUInt32List_Internal(int i13, IntArrayList intArrayList, boolean z13) throws IOException {
        if (z13) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeVarint32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i13, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt32(i13, intArrayList.getInt(size2));
        }
    }

    private void writeUInt64List_Internal(int i13, LongArrayList longArrayList, boolean z13) throws IOException {
        if (z13) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeVarint64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i13, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt64(i13, longArrayList.getLong(size2));
        }
    }
}
