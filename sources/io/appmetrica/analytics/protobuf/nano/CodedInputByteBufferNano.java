package io.appmetrica.analytics.protobuf.nano;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class CodedInputByteBufferNano {
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int lastTag;
    private int recursionDepth;
    private int currentLimit = Integer.MAX_VALUE;
    private int recursionLimit = 64;
    private int sizeLimit = DEFAULT_SIZE_LIMIT;

    private CodedInputByteBufferNano(byte[] bArr, int i13, int i14) {
        this.buffer = bArr;
        this.bufferStart = i13;
        this.bufferSize = i14 + i13;
        this.bufferPos = i13;
    }

    public static int decodeZigZag32(int i13) {
        return (-(i13 & 1)) ^ (i13 >>> 1);
    }

    public static long decodeZigZag64(long j13) {
        return (-(j13 & 1)) ^ (j13 >>> 1);
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    private void recomputeBufferSizeAfterLimit() {
        int i13 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i13;
        int i14 = this.currentLimit;
        if (i13 <= i14) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i15 = i13 - i14;
        this.bufferSizeAfterLimit = i15;
        this.bufferSize = i13 - i15;
    }

    public void checkLastTagWas(int i13) throws InvalidProtocolBufferNanoException {
        if (this.lastTag != i13) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i13 = this.currentLimit;
        if (i13 == Integer.MAX_VALUE) {
            return -1;
        }
        return i13 - this.bufferPos;
    }

    public byte[] getData(int i13, int i14) {
        if (i14 == 0) {
            return WireFormatNano.EMPTY_BYTES;
        }
        byte[] bArr = new byte[i14];
        System.arraycopy(this.buffer, this.bufferStart + i13, bArr, 0, i14);
        return bArr;
    }

    public int getPosition() {
        return this.bufferPos - this.bufferStart;
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize;
    }

    public void popLimit(int i13) {
        this.currentLimit = i13;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i13) throws InvalidProtocolBufferNanoException {
        if (i13 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i14 = i13 + this.bufferPos;
        int i15 = this.currentLimit;
        if (i14 > i15) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.currentLimit = i14;
        recomputeBufferSizeAfterLimit();
        return i15;
    }

    public boolean readBool() throws IOException {
        return readRawVarint32() != 0;
    }

    public byte[] readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i13 = this.bufferSize;
        int i14 = this.bufferPos;
        if (rawVarint32 > i13 - i14 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? WireFormatNano.EMPTY_BYTES : readRawBytes(rawVarint32);
        }
        byte[] bArr = new byte[rawVarint32];
        System.arraycopy(this.buffer, i14, bArr, 0, rawVarint32);
        this.bufferPos += rawVarint32;
        return bArr;
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(MessageNano messageNano, int i13) throws IOException {
        int i14 = this.recursionDepth;
        if (i14 >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        this.recursionDepth = i14 + 1;
        messageNano.mergeFrom(this);
        checkLastTagWas(WireFormatNano.makeTag(i13, 4));
        this.recursionDepth--;
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public void readMessage(MessageNano messageNano) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        messageNano.mergeFrom(this);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
    }

    Object readPrimitiveField(int i13) throws IOException {
        switch (i13) {
            case 1:
                return Double.valueOf(readDouble());
            case 2:
                return Float.valueOf(readFloat());
            case 3:
                return Long.valueOf(readInt64());
            case 4:
                return Long.valueOf(readUInt64());
            case 5:
                return Integer.valueOf(readInt32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Integer.valueOf(readFixed32());
            case 8:
                return Boolean.valueOf(readBool());
            case 9:
                return readString();
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException("Unknown type " + i13);
            case 12:
                return readBytes();
            case 13:
                return Integer.valueOf(readUInt32());
            case 14:
                return Integer.valueOf(readEnum());
            case 15:
                return Integer.valueOf(readSFixed32());
            case 16:
                return Long.valueOf(readSFixed64());
            case 17:
                return Integer.valueOf(readSInt32());
            case 18:
                return Long.valueOf(readSInt64());
        }
    }

    public byte readRawByte() throws IOException {
        int i13 = this.bufferPos;
        if (i13 == this.bufferSize) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i13 + 1;
        return bArr[i13];
    }

    public byte[] readRawBytes(int i13) throws IOException {
        if (i13 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i14 = this.bufferPos;
        int i15 = i14 + i13;
        int i16 = this.currentLimit;
        if (i15 > i16) {
            skipRawBytes(i16 - i14);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i13 > this.bufferSize - i14) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = new byte[i13];
        System.arraycopy(this.buffer, i14, bArr, 0, i13);
        this.bufferPos += i13;
        return bArr;
    }

    public int readRawLittleEndian32() throws IOException {
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
    }

    public long readRawLittleEndian64() throws IOException {
        byte rawByte = readRawByte();
        return ((((long) readRawByte()) & 255) << 8) | (((long) rawByte) & 255) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48) | ((((long) readRawByte()) & 255) << 56);
    }

    public int readRawVarint32() throws IOException {
        int i13;
        byte rawByte = readRawByte();
        if (rawByte >= 0) {
            return rawByte;
        }
        int i14 = rawByte & 127;
        byte rawByte2 = readRawByte();
        if (rawByte2 >= 0) {
            i13 = rawByte2 << 7;
        } else {
            i14 |= (rawByte2 & 127) << 7;
            byte rawByte3 = readRawByte();
            if (rawByte3 >= 0) {
                i13 = rawByte3 << 14;
            } else {
                i14 |= (rawByte3 & 127) << 14;
                byte rawByte4 = readRawByte();
                if (rawByte4 < 0) {
                    int i15 = i14 | ((rawByte4 & 127) << 21);
                    byte rawByte5 = readRawByte();
                    int i16 = i15 | (rawByte5 << 28);
                    if (rawByte5 >= 0) {
                        return i16;
                    }
                    for (int i17 = 0; i17 < 5; i17++) {
                        if (readRawByte() >= 0) {
                            return i16;
                        }
                    }
                    throw InvalidProtocolBufferNanoException.malformedVarint();
                }
                i13 = rawByte4 << 21;
            }
        }
        return i14 | i13;
    }

    public long readRawVarint64() throws IOException {
        long j13 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            byte rawByte = readRawByte();
            j13 |= ((long) (rawByte & 127)) << i13;
            if ((rawByte & 128) == 0) {
                return j13;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i13 = this.bufferSize;
        int i14 = this.bufferPos;
        if (rawVarint32 > i13 - i14 || rawVarint32 <= 0) {
            return new String(readRawBytes(rawVarint32), InternalNano.UTF_8);
        }
        String str = new String(this.buffer, i14, rawVarint32, InternalNano.UTF_8);
        this.bufferPos += rawVarint32;
        return str;
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.lastTag = rawVarint32;
        if (rawVarint32 != 0) {
            return rawVarint32;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public void resetSizeCounter() {
    }

    public void rewindToPosition(int i13) {
        int i14 = this.bufferPos;
        int i15 = this.bufferStart;
        if (i13 > i14 - i15) {
            throw new IllegalArgumentException("Position " + i13 + " is beyond current " + (this.bufferPos - this.bufferStart));
        }
        if (i13 >= 0) {
            this.bufferPos = i15 + i13;
        } else {
            throw new IllegalArgumentException("Bad position " + i13);
        }
    }

    public int setRecursionLimit(int i13) {
        if (i13 >= 0) {
            int i14 = this.recursionLimit;
            this.recursionLimit = i13;
            return i14;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i13);
    }

    public int setSizeLimit(int i13) {
        if (i13 >= 0) {
            int i14 = this.sizeLimit;
            this.sizeLimit = i13;
            return i14;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i13);
    }

    public boolean skipField(int i13) throws IOException {
        int tagWireType = WireFormatNano.getTagWireType(i13);
        if (tagWireType == 0) {
            readInt32();
            return true;
        }
        if (tagWireType == 1) {
            readRawLittleEndian64();
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(i13), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferNanoException.invalidWireType();
        }
        readRawLittleEndian32();
        return true;
    }

    public void skipMessage() throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag));
    }

    public void skipRawBytes(int i13) throws IOException {
        if (i13 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i14 = this.bufferPos;
        int i15 = i14 + i13;
        int i16 = this.currentLimit;
        if (i15 > i16) {
            skipRawBytes(i16 - i14);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i13 > this.bufferSize - i14) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.bufferPos = i15;
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr, int i13, int i14) {
        return new CodedInputByteBufferNano(bArr, i13, i14);
    }
}
