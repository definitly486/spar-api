package com.google.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    private static class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b13, byte b14, byte b15, byte b16, char[] cArr, int i13) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b14) || (((b13 << 28) + (b14 + 112)) >> 30) != 0 || isNotTrailingByte(b15) || isNotTrailingByte(b16)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iTrailingByteValue = ((b13 & 7) << 18) | (trailingByteValue(b14) << 12) | (trailingByteValue(b15) << 6) | trailingByteValue(b16);
            cArr[i13] = highSurrogate(iTrailingByteValue);
            cArr[i13 + 1] = lowSurrogate(iTrailingByteValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b13, char[] cArr, int i13) {
            cArr[i13] = (char) b13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b13, byte b14, byte b15, char[] cArr, int i13) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b14) || ((b13 == -32 && b14 < -96) || ((b13 == -19 && b14 >= -96) || isNotTrailingByte(b15)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i13] = (char) (((b13 & 15) << 12) | (trailingByteValue(b14) << 6) | trailingByteValue(b15));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b13, byte b14, char[] cArr, int i13) throws InvalidProtocolBufferException {
            if (b13 < -62 || isNotTrailingByte(b14)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i13] = (char) (((b13 & 31) << 6) | trailingByteValue(b14));
        }

        private static char highSurrogate(int i13) {
            return (char) ((i13 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b13) {
            return b13 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b13) {
            return b13 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b13) {
            return b13 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b13) {
            return b13 < -32;
        }

        private static char lowSurrogate(int i13) {
            return (char) ((i13 & 1023) + 56320);
        }

        private static int trailingByteValue(byte b13) {
            return b13 & 63;
        }
    }

    static abstract class Processor {
        Processor() {
        }

        final String decodeUtf8(ByteBuffer byteBuffer, int i13, int i14) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i13, i14);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i13, i14) : decodeUtf8Default(byteBuffer, i13, i14);
        }

        abstract String decodeUtf8(byte[] bArr, int i13, int i14) throws InvalidProtocolBufferException;

        final String decodeUtf8Default(ByteBuffer byteBuffer, int i13, int i14) throws InvalidProtocolBufferException {
            if ((i13 | i14 | ((byteBuffer.limit() - i13) - i14)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i13), Integer.valueOf(i14)));
            }
            int i15 = i13 + i14;
            char[] cArr = new char[i14];
            int i16 = 0;
            while (i13 < i15) {
                byte b13 = byteBuffer.get(i13);
                if (!DecodeUtil.isOneByte(b13)) {
                    break;
                }
                i13++;
                DecodeUtil.handleOneByte(b13, cArr, i16);
                i16++;
            }
            int i17 = i16;
            while (i13 < i15) {
                int i18 = i13 + 1;
                byte b14 = byteBuffer.get(i13);
                if (DecodeUtil.isOneByte(b14)) {
                    int i19 = i17 + 1;
                    DecodeUtil.handleOneByte(b14, cArr, i17);
                    while (i18 < i15) {
                        byte b15 = byteBuffer.get(i18);
                        if (!DecodeUtil.isOneByte(b15)) {
                            break;
                        }
                        i18++;
                        DecodeUtil.handleOneByte(b15, cArr, i19);
                        i19++;
                    }
                    i17 = i19;
                    i13 = i18;
                } else if (DecodeUtil.isTwoBytes(b14)) {
                    if (i18 >= i15) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i13 += 2;
                    DecodeUtil.handleTwoBytes(b14, byteBuffer.get(i18), cArr, i17);
                    i17++;
                } else if (DecodeUtil.isThreeBytes(b14)) {
                    if (i18 >= i15 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i23 = i13 + 2;
                    i13 += 3;
                    DecodeUtil.handleThreeBytes(b14, byteBuffer.get(i18), byteBuffer.get(i23), cArr, i17);
                    i17++;
                } else {
                    if (i18 >= i15 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b16 = byteBuffer.get(i18);
                    int i24 = i13 + 3;
                    byte b17 = byteBuffer.get(i13 + 2);
                    i13 += 4;
                    DecodeUtil.handleFourBytes(b14, b16, b17, byteBuffer.get(i24), cArr, i17);
                    i17 += 2;
                }
            }
            return new String(cArr, 0, i17);
        }

        abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i13, int i14) throws InvalidProtocolBufferException;

        abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i13, int i14);

        final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i13 = 0;
            while (i13 < length) {
                try {
                    char cCharAt = charSequence.charAt(i13);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i13, (byte) cCharAt);
                    i13++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i13 == length) {
                Java8Compatibility.position(byteBuffer, iPosition + i13);
                return;
            }
            iPosition += i13;
            while (i13 < length) {
                char cCharAt2 = charSequence.charAt(i13);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i14 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i14, (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                        iPosition = i14;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i14;
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i15 = i13 + 1;
                        if (i15 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i15);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i16 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        int i17 = iPosition + 2;
                                        try {
                                            byteBuffer.put(i16, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                            iPosition += 3;
                                            byteBuffer.put(i17, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                            byteBuffer.put(iPosition, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                            i13 = i15;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i13 = i15;
                                            iPosition = i17;
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition = i16;
                                        i13 = i15;
                                    }
                                } else {
                                    i13 = i15;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                            i13 = i15;
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i13) + " at index " + (byteBuffer.position() + Math.max(i13, (iPosition - byteBuffer.position()) + 1)));
                        }
                        throw new UnpairedSurrogateException(i13, length);
                    }
                    int i18 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i18, (byte) (((cCharAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                }
                i13++;
                iPosition++;
            }
            Java8Compatibility.position(byteBuffer, iPosition);
        }

        abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        final boolean isValidUtf8(byte[] bArr, int i13, int i14) {
            return partialIsValidUtf8(0, bArr, i13, i14) == 0;
        }

        final int partialIsValidUtf8(int i13, ByteBuffer byteBuffer, int i14, int i15) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i13, byteBuffer, i14, i15) : partialIsValidUtf8Default(i13, byteBuffer, i14, i15);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i13, byteBuffer.array(), i14 + iArrayOffset, iArrayOffset + i15);
        }

        abstract int partialIsValidUtf8(int i13, byte[] bArr, int i14, int i15);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.Utf8.access$000(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.google.protobuf.Utf8.access$000(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.google.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int partialIsValidUtf8Direct(int i13, ByteBuffer byteBuffer, int i14, int i15);

        final boolean isValidUtf8(ByteBuffer byteBuffer, int i13, int i14) {
            return partialIsValidUtf8(0, byteBuffer, i13, i14) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i13, int i14) {
            int iEstimateConsecutiveAscii = i13 + Utf8.estimateConsecutiveAscii(byteBuffer, i13, i14);
            while (iEstimateConsecutiveAscii < i14) {
                int i15 = iEstimateConsecutiveAscii + 1;
                byte b13 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b13 >= 0) {
                    iEstimateConsecutiveAscii = i15;
                } else if (b13 < -32) {
                    if (i15 >= i14) {
                        return b13;
                    }
                    if (b13 < -62 || byteBuffer.get(i15) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b13 >= -16) {
                        if (i15 >= i14 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b13, i15, i14 - i15);
                        }
                        int i16 = iEstimateConsecutiveAscii + 2;
                        byte b14 = byteBuffer.get(i15);
                        if (b14 <= -65 && (((b13 << 28) + (b14 + 112)) >> 30) == 0) {
                            int i17 = iEstimateConsecutiveAscii + 3;
                            if (byteBuffer.get(i16) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (byteBuffer.get(i17) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i15 >= i14 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b13, i15, i14 - i15);
                    }
                    int i18 = iEstimateConsecutiveAscii + 2;
                    byte b15 = byteBuffer.get(i15);
                    if (b15 > -65 || ((b13 == -32 && b15 < -96) || ((b13 == -19 && b15 >= -96) || byteBuffer.get(i18) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i13, int i14) {
            super("Unpaired surrogate at index " + i13 + " of " + i14);
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    static String decodeUtf8(ByteBuffer byteBuffer, int i13, int i14) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i13, i14);
    }

    static int encode(CharSequence charSequence, byte[] bArr, int i13, int i14) {
        return processor.encodeUtf8(charSequence, bArr, i13, i14);
    }

    static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    static int encodedLength(CharSequence charSequence) {
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
                        throw new UnpairedSurrogateException(i13, length);
                    }
                    i13++;
                }
            }
            i13++;
        }
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i13, int i14) {
        int i15 = i14 - 7;
        int i16 = i13;
        while (i16 < i15 && (byteBuffer.getLong(i16) & ASCII_MASK_LONG) == 0) {
            i16 += 8;
        }
        return i16 - i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i13) {
        if (i13 > -12) {
            return -1;
        }
        return i13;
    }

    static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    static int partialIsValidUtf8(int i13, byte[] bArr, int i14, int i15) {
        return processor.partialIsValidUtf8(i13, bArr, i14, i15);
    }

    static String decodeUtf8(byte[] bArr, int i13, int i14) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i13, int i14) {
        if (i13 > -12 || i14 > -65) {
            return -1;
        }
        return i13 ^ (i14 << 8);
    }

    static boolean isValidUtf8(byte[] bArr, int i13, int i14) {
        return processor.isValidUtf8(bArr, i13, i14);
    }

    static int partialIsValidUtf8(int i13, ByteBuffer byteBuffer, int i14, int i15) {
        return processor.partialIsValidUtf8(i13, byteBuffer, i14, i15);
    }

    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j13, int i13) {
            int i14 = 0;
            if (i13 < 16) {
                return 0;
            }
            int i15 = 8 - (((int) j13) & 7);
            while (i14 < i15) {
                long j14 = 1 + j13;
                if (UnsafeUtil.getByte(bArr, j13) < 0) {
                    return i14;
                }
                i14++;
                j13 = j14;
            }
            while (true) {
                int i16 = i14 + 8;
                if (i16 > i13 || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j13) & Utf8.ASCII_MASK_LONG) != 0) {
                    break;
                }
                j13 += 8;
                i14 = i16;
            }
            while (i14 < i13) {
                long j15 = j13 + 1;
                if (UnsafeUtil.getByte(bArr, j13) < 0) {
                    return i14;
                }
                i14++;
                j13 = j15;
            }
            return i13;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i13, long j13, int i14) {
            if (i14 == 0) {
                return Utf8.incompleteStateFor(i13);
            }
            if (i14 == 1) {
                return Utf8.incompleteStateFor(i13, UnsafeUtil.getByte(bArr, j13));
            }
            if (i14 == 2) {
                return Utf8.incompleteStateFor(i13, UnsafeUtil.getByte(bArr, j13), UnsafeUtil.getByte(bArr, j13 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i13, int i14) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i13, i14, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i13, i14 + i13))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i13, int i14) throws InvalidProtocolBufferException {
            if ((i13 | i14 | ((byteBuffer.limit() - i13) - i14)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i13), Integer.valueOf(i14)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i13);
            long j13 = ((long) i14) + jAddressOffset;
            char[] cArr = new char[i14];
            int i15 = 0;
            while (jAddressOffset < j13) {
                byte b13 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b13)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b13, cArr, i15);
                i15++;
            }
            int i16 = i15;
            while (jAddressOffset < j13) {
                long j14 = jAddressOffset + 1;
                byte b14 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b14)) {
                    int i17 = i16 + 1;
                    DecodeUtil.handleOneByte(b14, cArr, i16);
                    while (j14 < j13) {
                        byte b15 = UnsafeUtil.getByte(j14);
                        if (!DecodeUtil.isOneByte(b15)) {
                            break;
                        }
                        j14++;
                        DecodeUtil.handleOneByte(b15, cArr, i17);
                        i17++;
                    }
                    i16 = i17;
                    jAddressOffset = j14;
                } else if (DecodeUtil.isTwoBytes(b14)) {
                    if (j14 >= j13) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b14, UnsafeUtil.getByte(j14), cArr, i16);
                    i16++;
                } else if (DecodeUtil.isThreeBytes(b14)) {
                    if (j14 >= j13 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j15 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b14, UnsafeUtil.getByte(j14), UnsafeUtil.getByte(j15), cArr, i16);
                    i16++;
                } else {
                    if (j14 >= j13 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b16 = UnsafeUtil.getByte(j14);
                    long j16 = 3 + jAddressOffset;
                    byte b17 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b14, b16, b17, UnsafeUtil.getByte(j16), cArr, i16);
                    i16 += 2;
                }
            }
            return new String(cArr, 0, i16);
        }

        @Override // com.google.protobuf.Utf8.Processor
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i13, int i14) {
            long j13;
            String str;
            String str2;
            int i15;
            long j14;
            char cCharAt;
            long j15 = i13;
            long j16 = ((long) i14) + j15;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i14 || bArr.length - i14 < i13) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i13 + i14));
            }
            int i16 = 0;
            while (true) {
                j13 = 1;
                if (i16 >= length || (cCharAt = charSequence.charAt(i16)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j15, (byte) cCharAt);
                i16++;
                j15 = 1 + j15;
            }
            if (i16 == length) {
                return (int) j15;
            }
            while (i16 < length) {
                char cCharAt2 = charSequence.charAt(i16);
                if (cCharAt2 >= 128 || j15 >= j16) {
                    if (cCharAt2 >= 2048 || j15 > j16 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j15 > j16 - 3) {
                            if (j15 > j16 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i15 = i16 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i15)))) {
                                    throw new UnpairedSurrogateException(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j15);
                            }
                            int i17 = i16 + 1;
                            if (i17 != length) {
                                char cCharAt3 = charSequence.charAt(i17);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j14 = 1;
                                    UnsafeUtil.putByte(bArr, j15, (byte) ((codePoint >>> 18) | 240));
                                    UnsafeUtil.putByte(bArr, j15 + 1, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    long j17 = j15 + 3;
                                    UnsafeUtil.putByte(bArr, j15 + 2, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    j15 += 4;
                                    UnsafeUtil.putByte(bArr, j17, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    i16 = i17;
                                } else {
                                    i16 = i17;
                                }
                            }
                            throw new UnpairedSurrogateException(i16 - 1, length);
                        }
                        UnsafeUtil.putByte(bArr, j15, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j18 = j15 + 2;
                        UnsafeUtil.putByte(bArr, j15 + 1, (byte) (((cCharAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                        j15 += 3;
                        UnsafeUtil.putByte(bArr, j18, (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j19 = j15 + j13;
                        UnsafeUtil.putByte(bArr, j15, (byte) ((cCharAt2 >>> 6) | 960));
                        j15 += 2;
                        UnsafeUtil.putByte(bArr, j19, (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    }
                    j14 = 1;
                } else {
                    UnsafeUtil.putByte(bArr, j15, (byte) cCharAt2);
                    str2 = str4;
                    j14 = j13;
                    j15 += j13;
                    str = str3;
                }
                i16++;
                str3 = str;
                str4 = str2;
                j13 = j14;
                j16 = j16;
            }
            return (int) j15;
        }

        @Override // com.google.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j13;
            char c13;
            long j14;
            int i13;
            int i14;
            char c14;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i15 = 0;
            while (true) {
                j13 = 1;
                c13 = 128;
                if (i15 >= length || (cCharAt = charSequence.charAt(i15)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i15++;
                jPosition = 1 + jPosition;
            }
            if (i15 == length) {
                Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i15 < length) {
                char cCharAt2 = charSequence.charAt(i15);
                if (cCharAt2 >= c13 || jPosition >= jLimit) {
                    if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                        j14 = jAddressOffset;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i15 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i13)))) {
                                    throw new UnpairedSurrogateException(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            i14 = i15 + 1;
                            if (i14 != length) {
                                char cCharAt3 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c14 = 128;
                                    UnsafeUtil.putByte(jPosition + 1, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    long j15 = jPosition + 3;
                                    UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    jPosition += 4;
                                    UnsafeUtil.putByte(j15, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                } else {
                                    i15 = i14;
                                }
                            }
                            throw new UnpairedSurrogateException(i15 - 1, length);
                        }
                        long j16 = jPosition + j13;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j17 = jPosition + 2;
                        UnsafeUtil.putByte(j16, (byte) (((cCharAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                        jPosition += 3;
                        UnsafeUtil.putByte(j17, (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    } else {
                        j14 = jAddressOffset;
                        long j18 = jPosition + j13;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        UnsafeUtil.putByte(j18, (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    }
                    i14 = i15;
                    c14 = 128;
                } else {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    j14 = jAddressOffset;
                    i14 = i15;
                    c14 = c13;
                    jPosition += j13;
                }
                c13 = c14;
                jAddressOffset = j14;
                j13 = 1;
                i15 = i14 + 1;
            }
            Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int partialIsValidUtf8(int r11, byte[] r12, int r13, int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r14
                r0 = r0 | r1
                if (r0 < 0) goto La8
                long r0 = (long) r13
                long r13 = (long) r14
                if (r11 == 0) goto La1
                int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r2 < 0) goto L10
                return r11
            L10:
                byte r2 = (byte) r11
                r3 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r2 >= r3) goto L2a
                r11 = -62
                if (r2 < r11) goto L29
                long r6 = r6 + r0
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r5) goto L26
                goto L29
            L26:
                r0 = r6
                goto La1
            L29:
                return r4
            L2a:
                r8 = -16
                if (r2 >= r8) goto L5e
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L44
                long r8 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L43
                int r11 = com.google.protobuf.Utf8.access$000(r2, r11)
                return r11
            L43:
                r0 = r8
            L44:
                if (r11 > r5) goto L5d
                r8 = -96
                if (r2 != r3) goto L4c
                if (r11 < r8) goto L5d
            L4c:
                r3 = -19
                if (r2 != r3) goto L52
                if (r11 >= r8) goto L5d
            L52:
                long r2 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r5) goto L5b
                goto L5d
            L5b:
                r0 = r2
                goto La1
            L5d:
                return r4
            L5e:
                int r3 = r11 >> 8
                int r3 = ~r3
                byte r3 = (byte) r3
                if (r3 != 0) goto L76
                long r8 = r0 + r6
                byte r3 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L73
                int r11 = com.google.protobuf.Utf8.access$000(r2, r3)
                return r11
            L73:
                r11 = 0
                r0 = r8
                goto L79
            L76:
                int r11 = r11 >> 16
                byte r11 = (byte) r11
            L79:
                if (r11 != 0) goto L8b
                long r8 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L8a
                int r11 = com.google.protobuf.Utf8.access$100(r2, r3, r11)
                return r11
            L8a:
                r0 = r8
            L8b:
                if (r3 > r5) goto La0
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r2 = r2 + r3
                int r2 = r2 >> 30
                if (r2 != 0) goto La0
                if (r11 > r5) goto La0
                long r2 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r5) goto L5b
            La0:
                return r4
            La1:
                long r13 = r13 - r0
                int r11 = (int) r13
                int r11 = partialIsValidUtf8(r12, r0, r11)
                return r11
            La8:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14}
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r13, r12)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int partialIsValidUtf8Direct(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long j13, int i13) {
            if (i13 < 16) {
                return 0;
            }
            int i14 = (int) ((-j13) & 7);
            int i15 = i14;
            while (i15 > 0) {
                long j14 = 1 + j13;
                if (UnsafeUtil.getByte(j13) < 0) {
                    return i14 - i15;
                }
                i15--;
                j13 = j14;
            }
            int i16 = i13 - i14;
            while (i16 >= 8 && (UnsafeUtil.getLong(j13) & Utf8.ASCII_MASK_LONG) == 0) {
                j13 += 8;
                i16 -= 8;
            }
            return i13 - i16;
        }

        private static int unsafeIncompleteStateFor(long j13, int i13, int i14) {
            if (i14 == 0) {
                return Utf8.incompleteStateFor(i13);
            }
            if (i14 == 1) {
                return Utf8.incompleteStateFor(i13, UnsafeUtil.getByte(j13));
            }
            if (i14 == 2) {
                return Utf8.incompleteStateFor(i13, UnsafeUtil.getByte(j13), UnsafeUtil.getByte(j13 + 1));
            }
            throw new AssertionError();
        }

        private static int partialIsValidUtf8(byte[] bArr, long j13, int i13) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j13, i13);
            int i14 = i13 - iUnsafeEstimateConsecutiveAscii;
            long j14 = j13 + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte b13 = 0;
                while (i14 > 0) {
                    long j15 = j14 + 1;
                    b13 = UnsafeUtil.getByte(bArr, j14);
                    if (b13 < 0) {
                        j14 = j15;
                        break;
                    }
                    i14--;
                    j14 = j15;
                }
                if (i14 == 0) {
                    return 0;
                }
                int i15 = i14 - 1;
                if (b13 < -32) {
                    if (i15 == 0) {
                        return b13;
                    }
                    i14 -= 2;
                    if (b13 >= -62) {
                        long j16 = 1 + j14;
                        if (UnsafeUtil.getByte(bArr, j14) <= -65) {
                            j14 = j16;
                        }
                    }
                    return -1;
                }
                if (b13 >= -16) {
                    if (i15 < 3) {
                        return unsafeIncompleteStateFor(bArr, b13, j14, i15);
                    }
                    i14 -= 4;
                    long j17 = 1 + j14;
                    byte b14 = UnsafeUtil.getByte(bArr, j14);
                    if (b14 <= -65 && (((b13 << 28) + (b14 + 112)) >> 30) == 0) {
                        long j18 = 2 + j14;
                        if (UnsafeUtil.getByte(bArr, j17) <= -65) {
                            j14 += 3;
                            if (UnsafeUtil.getByte(bArr, j18) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i15 < 2) {
                    return unsafeIncompleteStateFor(bArr, b13, j14, i15);
                }
                i14 -= 3;
                long j19 = 1 + j14;
                byte b15 = UnsafeUtil.getByte(bArr, j14);
                if (b15 <= -65 && ((b13 != -32 || b15 >= -96) && (b13 != -19 || b15 < -96))) {
                    j14 += 2;
                    if (UnsafeUtil.getByte(bArr, j19) > -65) {
                    }
                }
                return -1;
            }
        }

        private static int partialIsValidUtf8(long j13, int i13) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j13, i13);
            long j14 = j13 + ((long) iUnsafeEstimateConsecutiveAscii);
            int i14 = i13 - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte b13 = 0;
                while (i14 > 0) {
                    long j15 = j14 + 1;
                    b13 = UnsafeUtil.getByte(j14);
                    if (b13 < 0) {
                        j14 = j15;
                        break;
                    }
                    i14--;
                    j14 = j15;
                }
                if (i14 == 0) {
                    return 0;
                }
                int i15 = i14 - 1;
                if (b13 < -32) {
                    if (i15 == 0) {
                        return b13;
                    }
                    i14 -= 2;
                    if (b13 >= -62) {
                        long j16 = 1 + j14;
                        if (UnsafeUtil.getByte(j14) <= -65) {
                            j14 = j16;
                        }
                    }
                    return -1;
                }
                if (b13 >= -16) {
                    if (i15 < 3) {
                        return unsafeIncompleteStateFor(j14, b13, i15);
                    }
                    i14 -= 4;
                    long j17 = 1 + j14;
                    byte b14 = UnsafeUtil.getByte(j14);
                    if (b14 <= -65 && (((b13 << 28) + (b14 + 112)) >> 30) == 0) {
                        long j18 = 2 + j14;
                        if (UnsafeUtil.getByte(j17) <= -65) {
                            j14 += 3;
                            if (UnsafeUtil.getByte(j18) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i15 < 2) {
                    return unsafeIncompleteStateFor(j14, b13, i15);
                }
                i14 -= 3;
                long j19 = 1 + j14;
                byte b15 = UnsafeUtil.getByte(j14);
                if (b15 <= -65 && ((b13 != -32 || b15 >= -96) && (b13 != -19 || b15 < -96))) {
                    j14 += 2;
                    if (UnsafeUtil.getByte(j19) > -65) {
                    }
                }
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i13, int i14, int i15) {
        if (i13 > -12 || i14 > -65 || i15 > -65) {
            return -1;
        }
        return (i13 ^ (i14 << 8)) ^ (i15 << 16);
    }

    static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i13, int i14) {
        byte b13 = bArr[i13 - 1];
        int i15 = i14 - i13;
        if (i15 == 0) {
            return incompleteStateFor(b13);
        }
        if (i15 == 1) {
            return incompleteStateFor(b13, bArr[i13]);
        }
        if (i15 == 2) {
            return incompleteStateFor(b13, bArr[i13], bArr[i13 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i13, int i14, int i15) {
        if (i15 == 0) {
            return incompleteStateFor(i13);
        }
        if (i15 == 1) {
            return incompleteStateFor(i13, byteBuffer.get(i14));
        }
        if (i15 == 2) {
            return incompleteStateFor(i13, byteBuffer.get(i14), byteBuffer.get(i14 + 1));
        }
        throw new AssertionError();
    }

    static final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i13, int i14) {
            while (i13 < i14) {
                int i15 = i13 + 1;
                byte b13 = bArr[i13];
                if (b13 < 0) {
                    if (b13 < -32) {
                        if (i15 >= i14) {
                            return b13;
                        }
                        if (b13 >= -62) {
                            i13 += 2;
                            if (bArr[i15] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b13 >= -16) {
                        if (i15 >= i14 - 2) {
                            return Utf8.incompleteStateFor(bArr, i15, i14);
                        }
                        int i16 = i13 + 2;
                        byte b14 = bArr[i15];
                        if (b14 <= -65 && (((b13 << 28) + (b14 + 112)) >> 30) == 0) {
                            int i17 = i13 + 3;
                            if (bArr[i16] <= -65) {
                                i13 += 4;
                                if (bArr[i17] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i15 >= i14 - 1) {
                        return Utf8.incompleteStateFor(bArr, i15, i14);
                    }
                    int i18 = i13 + 2;
                    byte b15 = bArr[i15];
                    if (b15 <= -65 && ((b13 != -32 || b15 >= -96) && (b13 != -19 || b15 < -96))) {
                        i13 += 3;
                        if (bArr[i18] > -65) {
                        }
                    }
                    return -1;
                }
                i13 = i15;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i13, int i14) throws InvalidProtocolBufferException {
            if ((i13 | i14 | ((bArr.length - i13) - i14)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i14)));
            }
            int i15 = i13 + i14;
            char[] cArr = new char[i14];
            int i16 = 0;
            while (i13 < i15) {
                byte b13 = bArr[i13];
                if (!DecodeUtil.isOneByte(b13)) {
                    break;
                }
                i13++;
                DecodeUtil.handleOneByte(b13, cArr, i16);
                i16++;
            }
            int i17 = i16;
            while (i13 < i15) {
                int i18 = i13 + 1;
                byte b14 = bArr[i13];
                if (DecodeUtil.isOneByte(b14)) {
                    int i19 = i17 + 1;
                    DecodeUtil.handleOneByte(b14, cArr, i17);
                    while (i18 < i15) {
                        byte b15 = bArr[i18];
                        if (!DecodeUtil.isOneByte(b15)) {
                            break;
                        }
                        i18++;
                        DecodeUtil.handleOneByte(b15, cArr, i19);
                        i19++;
                    }
                    i17 = i19;
                    i13 = i18;
                } else if (DecodeUtil.isTwoBytes(b14)) {
                    if (i18 >= i15) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i13 += 2;
                    DecodeUtil.handleTwoBytes(b14, bArr[i18], cArr, i17);
                    i17++;
                } else if (DecodeUtil.isThreeBytes(b14)) {
                    if (i18 >= i15 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i23 = i13 + 2;
                    i13 += 3;
                    DecodeUtil.handleThreeBytes(b14, bArr[i18], bArr[i23], cArr, i17);
                    i17++;
                } else {
                    if (i18 >= i15 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b16 = bArr[i18];
                    int i24 = i13 + 3;
                    byte b17 = bArr[i13 + 2];
                    i13 += 4;
                    DecodeUtil.handleFourBytes(b14, b16, b17, bArr[i24], cArr, i17);
                    i17 += 2;
                }
            }
            return new String(cArr, 0, i17);
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i13, int i14) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i13, i14);
        }

        @Override // com.google.protobuf.Utf8.Processor
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i13, int i14) {
            int i15;
            int i16;
            char cCharAt;
            int length = charSequence.length();
            int i17 = i14 + i13;
            int i18 = 0;
            while (i18 < length && (i16 = i18 + i13) < i17 && (cCharAt = charSequence.charAt(i18)) < 128) {
                bArr[i16] = (byte) cCharAt;
                i18++;
            }
            if (i18 == length) {
                return i13 + length;
            }
            int i19 = i13 + i18;
            while (i18 < length) {
                char cCharAt2 = charSequence.charAt(i18);
                if (cCharAt2 < 128 && i19 < i17) {
                    bArr[i19] = (byte) cCharAt2;
                    i19++;
                } else if (cCharAt2 < 2048 && i19 <= i17 - 2) {
                    int i23 = i19 + 1;
                    bArr[i19] = (byte) ((cCharAt2 >>> 6) | 960);
                    i19 += 2;
                    bArr[i23] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i19 > i17 - 3) {
                        if (i19 > i17 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i15 = i18 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i15)))) {
                                throw new UnpairedSurrogateException(i18, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i19);
                        }
                        int i24 = i18 + 1;
                        if (i24 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i24);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i19] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i19 + 1] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                int i25 = i19 + 3;
                                bArr[i19 + 2] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i19 += 4;
                                bArr[i25] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i18 = i24;
                            } else {
                                i18 = i24;
                            }
                        }
                        throw new UnpairedSurrogateException(i18 - 1, length);
                    }
                    bArr[i19] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i26 = i19 + 2;
                    bArr[i19 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    i19 += 3;
                    bArr[i26] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                }
                i18++;
            }
            return i19;
        }

        @Override // com.google.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.Utf8.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.protobuf.Utf8.access$000(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int i13, ByteBuffer byteBuffer, int i14, int i15) {
            return partialIsValidUtf8Default(i13, byteBuffer, i14, i15);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i13, int i14) {
            while (i13 < i14 && bArr[i13] >= 0) {
                i13++;
            }
            if (i13 >= i14) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i13, i14);
        }
    }
}
