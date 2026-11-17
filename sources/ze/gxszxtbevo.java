package ze;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.zxing.WriterException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Charset f129773eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final byte[] f129775ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final byte[] f129776wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final byte[] f129774iobyxmoadg = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final byte[] f129777zoijcleaow = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f129778iobyxmoadg;

        static {
            int[] iArr = new int[ppxfxbqfkf.values().length];
            f129778iobyxmoadg = iArr;
            try {
                iArr[ppxfxbqfkf.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f129778iobyxmoadg[ppxfxbqfkf.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f129778iobyxmoadg[ppxfxbqfkf.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        int i13 = 0;
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        f129775ppxfxbqfkf = bArr;
        f129776wkgbmnqykc = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        f129773eablkybsjg = StandardCharsets.ISO_8859_1;
        Arrays.fill(bArr, (byte) -1);
        int i14 = 0;
        while (true) {
            byte[] bArr2 = f129774iobyxmoadg;
            if (i14 >= bArr2.length) {
                break;
            }
            byte b13 = bArr2[i14];
            if (b13 > 0) {
                f129775ppxfxbqfkf[b13] = (byte) i14;
            }
            i14++;
        }
        Arrays.fill(f129776wkgbmnqykc, (byte) -1);
        while (true) {
            byte[] bArr3 = f129777zoijcleaow;
            if (i13 >= bArr3.length) {
                return;
            }
            byte b14 = bArr3[i13];
            if (b14 > 0) {
                f129776wkgbmnqykc[b14] = (byte) i13;
            }
            i13++;
        }
    }

    private static boolean agtfadlqog(char c13) {
        if (c13 == '\t' || c13 == '\n' || c13 == '\r') {
            return true;
        }
        return c13 >= ' ' && c13 <= '~';
    }

    private static boolean btonecajqb(char c13) {
        if (c13 != ' ') {
            return c13 >= 'A' && c13 <= 'Z';
        }
        return true;
    }

    private static boolean draadjrbmk(char c13) {
        return f129775ppxfxbqfkf[c13] != -1;
    }

    private static boolean dxjokdxxww(char c13) {
        if (c13 != ' ') {
            return c13 >= 'a' && c13 <= 'z';
        }
        return true;
    }

    static String eablkybsjg(String str, ppxfxbqfkf ppxfxbqfkfVar, Charset charset) throws WriterException {
        te.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg;
        StringBuilder sb3 = new StringBuilder(str.length());
        if (charset == null) {
            charset = f129773eablkybsjg;
        } else if (!f129773eablkybsjg.equals(charset) && (ppxfxbqfkfVarIobyxmoadg = te.ppxfxbqfkf.iobyxmoadg(charset.name())) != null) {
            nufgyqmvbu(ppxfxbqfkfVarIobyxmoadg.wkgbmnqykc(), sb3);
        }
        int length = str.length();
        int i13 = iobyxmoadg.f129778iobyxmoadg[ppxfxbqfkfVar.ordinal()];
        if (i13 == 1) {
            lqeggnwhkg(str, 0, length, sb3, 0);
        } else if (i13 == 2) {
            byte[] bytes = str.getBytes(charset);
            wkgbmnqykc(bytes, 0, bytes.length, 1, sb3);
        } else if (i13 != 3) {
            int i14 = 0;
            int iLqeggnwhkg = 0;
            int i15 = 0;
            while (i14 < length) {
                int iZoijcleaow = zoijcleaow(str, i14);
                if (iZoijcleaow >= 13) {
                    sb3.append((char) 902);
                    gxszxtbevo(str, i14, iZoijcleaow, sb3);
                    i14 += iZoijcleaow;
                    iLqeggnwhkg = 0;
                    i15 = 2;
                } else {
                    int iPpxfxbqfkf = ppxfxbqfkf(str, i14);
                    if (iPpxfxbqfkf >= 5 || iZoijcleaow == length) {
                        if (i15 != 0) {
                            sb3.append((char) 900);
                            iLqeggnwhkg = 0;
                            i15 = 0;
                        }
                        iLqeggnwhkg = lqeggnwhkg(str, i14, iPpxfxbqfkf, sb3, iLqeggnwhkg);
                        i14 += iPpxfxbqfkf;
                    } else {
                        int iIobyxmoadg = iobyxmoadg(str, i14, charset);
                        if (iIobyxmoadg == 0) {
                            iIobyxmoadg = 1;
                        }
                        int i16 = iIobyxmoadg + i14;
                        byte[] bytes2 = str.substring(i14, i16).getBytes(charset);
                        if (bytes2.length == 1 && i15 == 0) {
                            wkgbmnqykc(bytes2, 0, 1, 0, sb3);
                        } else {
                            wkgbmnqykc(bytes2, 0, bytes2.length, i15, sb3);
                            i15 = 1;
                            iLqeggnwhkg = 0;
                        }
                        i14 = i16;
                    }
                }
            }
        } else {
            sb3.append((char) 902);
            gxszxtbevo(str, 0, length, sb3);
        }
        return sb3.toString();
    }

    private static boolean gtknphoqwx(char c13) {
        return c13 >= '0' && c13 <= '9';
    }

    private static void gxszxtbevo(String str, int i13, int i14, StringBuilder sb3) {
        StringBuilder sb4 = new StringBuilder((i14 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i15 = 0;
        while (i15 < i14) {
            sb4.setLength(0);
            int iMin = Math.min(44, i14 - i15);
            StringBuilder sb5 = new StringBuilder("1");
            int i16 = i13 + i15;
            sb5.append(str.substring(i16, i16 + iMin));
            BigInteger bigInteger = new BigInteger(sb5.toString());
            do {
                sb4.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb4.length() - 1; length >= 0; length--) {
                sb3.append(sb4.charAt(length));
            }
            i15 += iMin;
        }
    }

    private static int iobyxmoadg(String str, int i13, Charset charset) throws WriterException {
        int i14;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        int length = str.length();
        int i15 = i13;
        while (i15 < length) {
            char cCharAt = str.charAt(i15);
            int i16 = 0;
            while (i16 < 13 && gtknphoqwx(cCharAt) && (i14 = i15 + (i16 = i16 + 1)) < length) {
                cCharAt = str.charAt(i14);
            }
            if (i16 >= 13) {
                return i15 - i13;
            }
            char cCharAt2 = str.charAt(i15);
            if (!charsetEncoderNewEncoder.canEncode(cCharAt2)) {
                throw new WriterException("Non-encodable character detected: " + cCharAt2 + " (Unicode: " + ((int) cCharAt2) + ')');
            }
            i15++;
        }
        return i15 - i13;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00f4 A[EDGE_INSN: B:73:0x00f4->B:55:0x00f4 BREAK  A[LOOP:0: B:3:0x000f->B:90:0x000f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x000f A[SYNTHETIC] */
    private static int lqeggnwhkg(CharSequence charSequence, int i13, int i14, StringBuilder sb3, int i15) {
        StringBuilder sb4 = new StringBuilder(i14);
        int i16 = i15;
        int i17 = 0;
        while (true) {
            int i18 = i13 + i17;
            char cCharAt = charSequence.charAt(i18);
            if (i16 == 0) {
                if (btonecajqb(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb4.append((char) 26);
                    } else {
                        sb4.append((char) (cCharAt - 'A'));
                    }
                } else if (dxjokdxxww(cCharAt)) {
                    sb4.append((char) 27);
                    i16 = 1;
                } else if (draadjrbmk(cCharAt)) {
                    sb4.append((char) 28);
                    i16 = 2;
                } else {
                    sb4.append((char) 29);
                    sb4.append((char) f129776wkgbmnqykc[cCharAt]);
                }
                i17++;
                if (i17 >= i14) {
                    break;
                    break;
                }
            } else {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (wflxmlrfwp(cCharAt)) {
                            sb4.append((char) f129776wkgbmnqykc[cCharAt]);
                        } else {
                            sb4.append((char) 29);
                            i16 = 0;
                        }
                    } else if (draadjrbmk(cCharAt)) {
                        sb4.append((char) f129775ppxfxbqfkf[cCharAt]);
                    } else if (btonecajqb(cCharAt)) {
                        sb4.append((char) 28);
                        i16 = 0;
                    } else if (dxjokdxxww(cCharAt)) {
                        sb4.append((char) 27);
                        i16 = 1;
                    } else {
                        int i19 = i18 + 1;
                        if (i19 >= i14 || !wflxmlrfwp(charSequence.charAt(i19))) {
                            sb4.append((char) 29);
                            sb4.append((char) f129776wkgbmnqykc[cCharAt]);
                        } else {
                            sb4.append((char) 25);
                            i16 = 3;
                        }
                    }
                } else if (dxjokdxxww(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb4.append((char) 26);
                    } else {
                        sb4.append((char) (cCharAt - 'a'));
                    }
                } else if (btonecajqb(cCharAt)) {
                    sb4.append((char) 27);
                    sb4.append((char) (cCharAt - 'A'));
                } else if (draadjrbmk(cCharAt)) {
                    sb4.append((char) 28);
                    i16 = 2;
                } else {
                    sb4.append((char) 29);
                    sb4.append((char) f129776wkgbmnqykc[cCharAt]);
                }
                i17++;
                if (i17 >= i14) {
                    break;
                }
            }
        }
        int length = sb4.length();
        char cCharAt2 = 0;
        for (int i23 = 0; i23 < length; i23++) {
            if (i23 % 2 != 0) {
                cCharAt2 = (char) ((cCharAt2 * 30) + sb4.charAt(i23));
                sb3.append(cCharAt2);
            } else {
                cCharAt2 = sb4.charAt(i23);
            }
        }
        if (length % 2 != 0) {
            sb3.append((char) ((cCharAt2 * 30) + 29));
        }
        return i16;
    }

    private static void nufgyqmvbu(int i13, StringBuilder sb3) throws WriterException {
        if (i13 >= 0 && i13 < 900) {
            sb3.append((char) 927);
            sb3.append((char) i13);
        } else if (i13 < 810900) {
            sb3.append((char) 926);
            sb3.append((char) ((i13 / 900) - 1));
            sb3.append((char) (i13 % 900));
        } else {
            if (i13 >= 811800) {
                throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i13)));
            }
            sb3.append((char) 925);
            sb3.append((char) (810900 - i13));
        }
    }

    private static int ppxfxbqfkf(CharSequence charSequence, int i13) {
        int length = charSequence.length();
        int i14 = i13;
        while (i14 < length) {
            char cCharAt = charSequence.charAt(i14);
            int i15 = 0;
            while (i15 < 13 && gtknphoqwx(cCharAt) && i14 < length) {
                i15++;
                i14++;
                if (i14 < length) {
                    cCharAt = charSequence.charAt(i14);
                }
            }
            if (i15 < 13) {
                if (i15 <= 0) {
                    if (!agtfadlqog(charSequence.charAt(i14))) {
                        break;
                    }
                    i14++;
                }
            } else {
                return (i14 - i13) - i15;
            }
        }
        return i14 - i13;
    }

    private static boolean wflxmlrfwp(char c13) {
        return f129776wkgbmnqykc[c13] != -1;
    }

    private static void wkgbmnqykc(byte[] bArr, int i13, int i14, int i15, StringBuilder sb3) {
        int i16;
        if (i14 == 1 && i15 == 0) {
            sb3.append((char) 913);
        } else if (i14 % 6 == 0) {
            sb3.append((char) 924);
        } else {
            sb3.append((char) 901);
        }
        if (i14 >= 6) {
            char[] cArr = new char[5];
            i16 = i13;
            while ((i13 + i14) - i16 >= 6) {
                long j13 = 0;
                for (int i17 = 0; i17 < 6; i17++) {
                    j13 = (j13 << 8) + ((long) (bArr[i16 + i17] & 255));
                }
                for (int i18 = 0; i18 < 5; i18++) {
                    cArr[i18] = (char) (j13 % 900);
                    j13 /= 900;
                }
                for (int i19 = 4; i19 >= 0; i19--) {
                    sb3.append(cArr[i19]);
                }
                i16 += 6;
            }
        } else {
            i16 = i13;
        }
        while (i16 < i13 + i14) {
            sb3.append((char) (bArr[i16] & 255));
            i16++;
        }
    }

    private static int zoijcleaow(CharSequence charSequence, int i13) {
        int length = charSequence.length();
        int i14 = 0;
        if (i13 < length) {
            char cCharAt = charSequence.charAt(i13);
            while (gtknphoqwx(cCharAt) && i13 < length) {
                i14++;
                i13++;
                if (i13 < length) {
                    cCharAt = charSequence.charAt(i13);
                }
            }
        }
        return i14;
    }
}
