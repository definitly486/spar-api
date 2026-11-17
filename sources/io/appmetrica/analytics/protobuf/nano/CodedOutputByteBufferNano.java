package io.appmetrica.analytics.protobuf.nano;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private static final int MAX_UTF8_EXPANSION = 3;
    private final ByteBuffer buffer;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException(int i13, int i14) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i13 + " limit " + i14 + ").");
        }
    }

    private CodedOutputByteBufferNano(byte[] bArr, int i13, int i14) {
        this(ByteBuffer.wrap(bArr, i13, i14));
    }

    public static int computeBoolSize(int i13, boolean z13) {
        return computeBoolSizeNoTag(z13) + computeTagSize(i13);
    }

    public static int computeBoolSizeNoTag(boolean z13) {
        return 1;
    }

    public static int computeBytesSize(int i13, byte[] bArr) {
        return computeBytesSizeNoTag(bArr) + computeTagSize(i13);
    }

    public static int computeBytesSizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeDoubleSize(int i13, double d13) {
        return computeDoubleSizeNoTag(d13) + computeTagSize(i13);
    }

    public static int computeDoubleSizeNoTag(double d13) {
        return 8;
    }

    public static int computeEnumSize(int i13, int i14) {
        return computeEnumSizeNoTag(i14) + computeTagSize(i13);
    }

    public static int computeEnumSizeNoTag(int i13) {
        return computeRawVarint32Size(i13);
    }

    static int computeFieldSize(int i13, int i14, Object obj) {
        switch (i14) {
            case 1:
                return computeDoubleSize(i13, ((Double) obj).doubleValue());
            case 2:
                return computeFloatSize(i13, ((Float) obj).floatValue());
            case 3:
                return computeInt64Size(i13, ((Long) obj).longValue());
            case 4:
                return computeUInt64Size(i13, ((Long) obj).longValue());
            case 5:
                return computeInt32Size(i13, ((Integer) obj).intValue());
            case 6:
                return computeFixed64Size(i13, ((Long) obj).longValue());
            case 7:
                return computeFixed32Size(i13, ((Integer) obj).intValue());
            case 8:
                return computeBoolSize(i13, ((Boolean) obj).booleanValue());
            case 9:
                return computeStringSize(i13, (String) obj);
            case 10:
                return computeGroupSize(i13, (MessageNano) obj);
            case 11:
                return computeMessageSize(i13, (MessageNano) obj);
            case 12:
                return computeBytesSize(i13, (byte[]) obj);
            case 13:
                return computeUInt32Size(i13, ((Integer) obj).intValue());
            case 14:
                return computeEnumSize(i13, ((Integer) obj).intValue());
            case 15:
                return computeSFixed32Size(i13, ((Integer) obj).intValue());
            case 16:
                return computeSFixed64Size(i13, ((Long) obj).longValue());
            case 17:
                return computeSInt32Size(i13, ((Integer) obj).intValue());
            case 18:
                return computeSInt64Size(i13, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException("Unknown type: " + i14);
        }
    }

    public static int computeFixed32Size(int i13, int i14) {
        return computeFixed32SizeNoTag(i14) + computeTagSize(i13);
    }

    public static int computeFixed32SizeNoTag(int i13) {
        return 4;
    }

    public static int computeFixed64Size(int i13, long j13) {
        return computeFixed64SizeNoTag(j13) + computeTagSize(i13);
    }

    public static int computeFixed64SizeNoTag(long j13) {
        return 8;
    }

    public static int computeFloatSize(int i13, float f13) {
        return computeFloatSizeNoTag(f13) + computeTagSize(i13);
    }

    public static int computeFloatSizeNoTag(float f13) {
        return 4;
    }

    public static int computeGroupSize(int i13, MessageNano messageNano) {
        return computeGroupSizeNoTag(messageNano) + (computeTagSize(i13) * 2);
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeInt32Size(int i13, int i14) {
        return computeInt32SizeNoTag(i14) + computeTagSize(i13);
    }

    public static int computeInt32SizeNoTag(int i13) {
        if (i13 >= 0) {
            return computeRawVarint32Size(i13);
        }
        return 10;
    }

    public static int computeInt64Size(int i13, long j13) {
        return computeInt64SizeNoTag(j13) + computeTagSize(i13);
    }

    public static int computeInt64SizeNoTag(long j13) {
        return computeRawVarint64Size(j13);
    }

    public static int computeMessageSize(int i13, MessageNano messageNano) {
        return computeMessageSizeNoTag(messageNano) + computeTagSize(i13);
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i13) {
        if ((i13 & (-128)) == 0) {
            return 1;
        }
        if ((i13 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i13) == 0) {
            return 3;
        }
        return (i13 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j13) {
        if (((-128) & j13) == 0) {
            return 1;
        }
        if (((-16384) & j13) == 0) {
            return 2;
        }
        if (((-2097152) & j13) == 0) {
            return 3;
        }
        if (((-268435456) & j13) == 0) {
            return 4;
        }
        if (((-34359738368L) & j13) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j13) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j13) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j13) == 0) {
            return 8;
        }
        return (j13 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32Size(int i13, int i14) {
        return computeSFixed32SizeNoTag(i14) + computeTagSize(i13);
    }

    public static int computeSFixed32SizeNoTag(int i13) {
        return 4;
    }

    public static int computeSFixed64Size(int i13, long j13) {
        return computeSFixed64SizeNoTag(j13) + computeTagSize(i13);
    }

    public static int computeSFixed64SizeNoTag(long j13) {
        return 8;
    }

    public static int computeSInt32Size(int i13, int i14) {
        return computeSInt32SizeNoTag(i14) + computeTagSize(i13);
    }

    public static int computeSInt32SizeNoTag(int i13) {
        return computeRawVarint32Size(encodeZigZag32(i13));
    }

    public static int computeSInt64Size(int i13, long j13) {
        return computeSInt64SizeNoTag(j13) + computeTagSize(i13);
    }

    public static int computeSInt64SizeNoTag(long j13) {
        return computeRawVarint64Size(encodeZigZag64(j13));
    }

    public static int computeStringSize(int i13, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i13);
    }

    public static int computeStringSizeNoTag(String str) {
        int iEncodedLength = encodedLength(str);
        return computeRawVarint32Size(iEncodedLength) + iEncodedLength;
    }

    public static int computeTagSize(int i13) {
        return computeRawVarint32Size(WireFormatNano.makeTag(i13, 0));
    }

    public static int computeUInt32Size(int i13, int i14) {
        return computeUInt32SizeNoTag(i14) + computeTagSize(i13);
    }

    public static int computeUInt32SizeNoTag(int i13) {
        return computeRawVarint32Size(i13);
    }

    public static int computeUInt64Size(int i13, long j13) {
        return computeUInt64SizeNoTag(j13) + computeTagSize(i13);
    }

    public static int computeUInt64SizeNoTag(long j13) {
        return computeRawVarint64Size(j13);
    }

    private static void encode(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            encodeDirect(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(encode(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e13) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e13);
            throw bufferOverflowException;
        }
    }

    private static void encodeDirect(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i13 = 0;
        while (i13 < length) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt < 128) {
                byteBuffer.put((byte) cCharAt);
            } else if (cCharAt < 2048) {
                byteBuffer.put((byte) ((cCharAt >>> 6) | 960));
                byteBuffer.put((byte) ((cCharAt & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
            } else {
                if (cCharAt >= 55296 && 57343 >= cCharAt) {
                    int i14 = i13 + 1;
                    if (i14 != charSequence.length()) {
                        char cCharAt2 = charSequence.charAt(i14);
                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            byteBuffer.put((byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            i13 = i14;
                        } else {
                            i13 = i14;
                        }
                    }
                    StringBuilder sb3 = new StringBuilder("Unpaired surrogate at index ");
                    sb3.append(i13 - 1);
                    throw new IllegalArgumentException(sb3.toString());
                }
                byteBuffer.put((byte) ((cCharAt >>> '\f') | 480));
                byteBuffer.put((byte) (((cCharAt >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                byteBuffer.put((byte) ((cCharAt & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
            }
            i13++;
        }
    }

    public static int encodeZigZag32(int i13) {
        return (i13 >> 31) ^ (i13 << 1);
    }

    public static long encodeZigZag64(long j13) {
        return (j13 >> 63) ^ (j13 << 1);
    }

    private static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i13 = 0;
        while (i13 < length && charSequence.charAt(i13) < 128) {
            i13++;
        }
        int iEncodedLengthGeneral = length;
        while (i13 < length) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt >= 2048) {
                iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i13);
                break;
            }
            iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
            i13++;
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i13) {
        int length = charSequence.length();
        int i14 = 0;
        while (i13 < length) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt < 2048) {
                i14 += (127 - cCharAt) >>> 31;
            } else {
                i14 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i13) < 65536) {
                        throw new IllegalArgumentException("Unpaired surrogate at index " + i13);
                    }
                    i13++;
                }
            }
            i13++;
        }
        return i14;
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public int position() {
        return this.buffer.position();
    }

    public void reset() {
        this.buffer.clear();
    }

    public int spaceLeft() {
        return this.buffer.remaining();
    }

    public void writeBool(int i13, boolean z13) throws IOException {
        writeTag(i13, 0);
        writeBoolNoTag(z13);
    }

    public void writeBoolNoTag(boolean z13) throws IOException {
        writeRawByte(z13 ? 1 : 0);
    }

    public void writeBytes(int i13, byte[] bArr) throws IOException {
        writeTag(i13, 2);
        writeBytesNoTag(bArr);
    }

    public void writeBytesNoTag(byte[] bArr) throws IOException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeDouble(int i13, double d13) throws IOException {
        writeTag(i13, 1);
        writeDoubleNoTag(d13);
    }

    public void writeDoubleNoTag(double d13) throws IOException {
        writeRawLittleEndian64(Double.doubleToLongBits(d13));
    }

    public void writeEnum(int i13, int i14) throws IOException {
        writeTag(i13, 0);
        writeEnumNoTag(i14);
    }

    public void writeEnumNoTag(int i13) throws IOException {
        writeRawVarint32(i13);
    }

    void writeField(int i13, int i14, Object obj) throws IOException {
        switch (i14) {
            case 1:
                writeDouble(i13, ((Double) obj).doubleValue());
                return;
            case 2:
                writeFloat(i13, ((Float) obj).floatValue());
                return;
            case 3:
                writeInt64(i13, ((Long) obj).longValue());
                return;
            case 4:
                writeUInt64(i13, ((Long) obj).longValue());
                return;
            case 5:
                writeInt32(i13, ((Integer) obj).intValue());
                return;
            case 6:
                writeFixed64(i13, ((Long) obj).longValue());
                return;
            case 7:
                writeFixed32(i13, ((Integer) obj).intValue());
                return;
            case 8:
                writeBool(i13, ((Boolean) obj).booleanValue());
                return;
            case 9:
                writeString(i13, (String) obj);
                return;
            case 10:
                writeGroup(i13, (MessageNano) obj);
                return;
            case 11:
                writeMessage(i13, (MessageNano) obj);
                return;
            case 12:
                writeBytes(i13, (byte[]) obj);
                return;
            case 13:
                writeUInt32(i13, ((Integer) obj).intValue());
                return;
            case 14:
                writeEnum(i13, ((Integer) obj).intValue());
                return;
            case 15:
                writeSFixed32(i13, ((Integer) obj).intValue());
                return;
            case 16:
                writeSFixed64(i13, ((Long) obj).longValue());
                return;
            case 17:
                writeSInt32(i13, ((Integer) obj).intValue());
                return;
            case 18:
                writeSInt64(i13, ((Long) obj).longValue());
                return;
            default:
                throw new IOException("Unknown type: " + i14);
        }
    }

    public void writeFixed32(int i13, int i14) throws IOException {
        writeTag(i13, 5);
        writeFixed32NoTag(i14);
    }

    public void writeFixed32NoTag(int i13) throws IOException {
        writeRawLittleEndian32(i13);
    }

    public void writeFixed64(int i13, long j13) throws IOException {
        writeTag(i13, 1);
        writeFixed64NoTag(j13);
    }

    public void writeFixed64NoTag(long j13) throws IOException {
        writeRawLittleEndian64(j13);
    }

    public void writeFloat(int i13, float f13) throws IOException {
        writeTag(i13, 5);
        writeFloatNoTag(f13);
    }

    public void writeFloatNoTag(float f13) throws IOException {
        writeRawLittleEndian32(Float.floatToIntBits(f13));
    }

    public void writeGroup(int i13, MessageNano messageNano) throws IOException {
        writeTag(i13, 3);
        writeGroupNoTag(messageNano);
        writeTag(i13, 4);
    }

    public void writeGroupNoTag(MessageNano messageNano) throws IOException {
        messageNano.writeTo(this);
    }

    public void writeInt32(int i13, int i14) throws IOException {
        writeTag(i13, 0);
        writeInt32NoTag(i14);
    }

    public void writeInt32NoTag(int i13) throws IOException {
        if (i13 >= 0) {
            writeRawVarint32(i13);
        } else {
            writeRawVarint64(i13);
        }
    }

    public void writeInt64(int i13, long j13) throws IOException {
        writeTag(i13, 0);
        writeInt64NoTag(j13);
    }

    public void writeInt64NoTag(long j13) throws IOException {
        writeRawVarint64(j13);
    }

    public void writeMessage(int i13, MessageNano messageNano) throws IOException {
        writeTag(i13, 2);
        writeMessageNoTag(messageNano);
    }

    public void writeMessageNoTag(MessageNano messageNano) throws IOException {
        writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void writeRawByte(byte b13) throws IOException {
        if (!this.buffer.hasRemaining()) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(b13);
    }

    public void writeRawBytes(byte[] bArr) throws IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawLittleEndian32(int i13) throws IOException {
        if (this.buffer.remaining() < 4) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putInt(i13);
    }

    public void writeRawLittleEndian64(long j13) throws IOException {
        if (this.buffer.remaining() < 8) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putLong(j13);
    }

    public void writeRawVarint32(int i13) throws IOException {
        while ((i13 & (-128)) != 0) {
            writeRawByte((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i13 >>>= 7;
        }
        writeRawByte(i13);
    }

    public void writeRawVarint64(long j13) throws IOException {
        while (((-128) & j13) != 0) {
            writeRawByte((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j13 >>>= 7;
        }
        writeRawByte((int) j13);
    }

    public void writeSFixed32(int i13, int i14) throws IOException {
        writeTag(i13, 5);
        writeSFixed32NoTag(i14);
    }

    public void writeSFixed32NoTag(int i13) throws IOException {
        writeRawLittleEndian32(i13);
    }

    public void writeSFixed64(int i13, long j13) throws IOException {
        writeTag(i13, 1);
        writeSFixed64NoTag(j13);
    }

    public void writeSFixed64NoTag(long j13) throws IOException {
        writeRawLittleEndian64(j13);
    }

    public void writeSInt32(int i13, int i14) throws IOException {
        writeTag(i13, 0);
        writeSInt32NoTag(i14);
    }

    public void writeSInt32NoTag(int i13) throws IOException {
        writeRawVarint32(encodeZigZag32(i13));
    }

    public void writeSInt64(int i13, long j13) throws IOException {
        writeTag(i13, 0);
        writeSInt64NoTag(j13);
    }

    public void writeSInt64NoTag(long j13) throws IOException {
        writeRawVarint64(encodeZigZag64(j13));
    }

    public void writeString(int i13, String str) throws IOException {
        writeTag(i13, 2);
        writeStringNoTag(str);
    }

    public void writeStringNoTag(String str) throws IOException {
        try {
            int iComputeRawVarint32Size = computeRawVarint32Size(str.length());
            if (iComputeRawVarint32Size != computeRawVarint32Size(str.length() * 3)) {
                writeRawVarint32(encodedLength(str));
                encode(str, this.buffer);
                return;
            }
            int iPosition = this.buffer.position();
            if (this.buffer.remaining() < iComputeRawVarint32Size) {
                throw new OutOfSpaceException(iPosition + iComputeRawVarint32Size, this.buffer.limit());
            }
            this.buffer.position(iPosition + iComputeRawVarint32Size);
            encode(str, this.buffer);
            int iPosition2 = this.buffer.position();
            this.buffer.position(iPosition);
            writeRawVarint32((iPosition2 - iPosition) - iComputeRawVarint32Size);
            this.buffer.position(iPosition2);
        } catch (BufferOverflowException e13) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
            outOfSpaceException.initCause(e13);
            throw outOfSpaceException;
        }
    }

    public void writeTag(int i13, int i14) throws IOException {
        writeRawVarint32(WireFormatNano.makeTag(i13, i14));
    }

    public void writeUInt32(int i13, int i14) throws IOException {
        writeTag(i13, 0);
        writeUInt32NoTag(i14);
    }

    public void writeUInt32NoTag(int i13) throws IOException {
        writeRawVarint32(i13);
    }

    public void writeUInt64(int i13, long j13) throws IOException {
        writeTag(i13, 0);
        writeUInt64NoTag(j13);
    }

    public void writeUInt64NoTag(long j13) throws IOException {
        writeRawVarint64(j13);
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr, int i13, int i14) {
        return new CodedOutputByteBufferNano(bArr, i13, i14);
    }

    public void writeRawBytes(byte[] bArr, int i13, int i14) throws IOException {
        if (this.buffer.remaining() < i14) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(bArr, i13, i14);
    }

    public void writeRawByte(int i13) throws IOException {
        writeRawByte((byte) i13);
    }

    private static int encode(CharSequence charSequence, byte[] bArr, int i13, int i14) {
        int i15;
        char cCharAt;
        int length = charSequence.length();
        int i16 = i14 + i13;
        int i17 = 0;
        while (i17 < length && (i15 = i17 + i13) < i16 && (cCharAt = charSequence.charAt(i17)) < 128) {
            bArr[i15] = (byte) cCharAt;
            i17++;
        }
        if (i17 == length) {
            return i13 + length;
        }
        int i18 = i13 + i17;
        while (i17 < length) {
            char cCharAt2 = charSequence.charAt(i17);
            if (cCharAt2 < 128 && i18 < i16) {
                bArr[i18] = (byte) cCharAt2;
                i18++;
            } else if (cCharAt2 < 2048 && i18 <= i16 - 2) {
                int i19 = i18 + 1;
                bArr[i18] = (byte) ((cCharAt2 >>> 6) | 960);
                i18 += 2;
                bArr[i19] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i18 > i16 - 3) {
                    if (i18 <= i16 - 4) {
                        int i23 = i17 + 1;
                        if (i23 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i23);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i18] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i18 + 1] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                int i24 = i18 + 3;
                                bArr[i18 + 2] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i18 += 4;
                                bArr[i24] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i17 = i23;
                            } else {
                                i17 = i23;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder("Unpaired surrogate at index ");
                        sb3.append(i17 - 1);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i18);
                }
                bArr[i18] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i25 = i18 + 2;
                bArr[i18 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                i18 += 3;
                bArr[i25] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
            }
            i17++;
        }
        return i18;
    }
}
