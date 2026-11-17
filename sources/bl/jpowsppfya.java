package bl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jpowsppfya {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final byte[] f16708iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final byte[] f16709zoijcleaow;

    static {
        gxszxtbevo.iobyxmoadg iobyxmoadgVar = gxszxtbevo.f16674iwizpuwonk;
        f16708iobyxmoadg = iobyxmoadgVar.wkgbmnqykc("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").agtfadlqog();
        f16709zoijcleaow = iobyxmoadgVar.wkgbmnqykc("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").agtfadlqog();
    }

    public static final byte[] iobyxmoadg(String str) {
        int i13;
        char cCharAt;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i14 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i14];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            char cCharAt2 = str.charAt(i18);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i13 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i13 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i13 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i13 = 62;
            } else {
                if (cCharAt2 == '/' || cCharAt2 == '_') {
                    i13 = 63;
                } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i16 = (i16 << 6) | i13;
            i15++;
            if (i15 % 4 == 0) {
                bArr[i17] = (byte) (i16 >> 16);
                int i19 = i17 + 2;
                bArr[i17 + 1] = (byte) (i16 >> 8);
                i17 += 3;
                bArr[i19] = (byte) i16;
            }
        }
        int i23 = i15 % 4;
        if (i23 == 1) {
            return null;
        }
        if (i23 == 2) {
            bArr[i17] = (byte) ((i16 << 12) >> 16);
            i17++;
        } else if (i23 == 3) {
            int i24 = i16 << 6;
            int i25 = i17 + 1;
            bArr[i17] = (byte) (i24 >> 16);
            i17 += 2;
            bArr[i25] = (byte) (i24 >> 8);
        }
        if (i17 == i14) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i17);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    public static /* synthetic */ String ppxfxbqfkf(byte[] bArr, byte[] bArr2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bArr2 = f16708iobyxmoadg;
        }
        return zoijcleaow(bArr, bArr2);
    }

    public static final String zoijcleaow(byte[] bArr, byte[] map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            byte b13 = bArr[i13];
            int i15 = i13 + 2;
            byte b14 = bArr[i13 + 1];
            i13 += 3;
            byte b15 = bArr[i15];
            bArr2[i14] = map[(b13 & 255) >> 2];
            bArr2[i14 + 1] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            int i16 = i14 + 3;
            bArr2[i14 + 2] = map[((b14 & 15) << 2) | ((b15 & 255) >> 6)];
            i14 += 4;
            bArr2[i16] = map[b15 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b16 = bArr[i13];
            bArr2[i14] = map[(b16 & 255) >> 2];
            bArr2[i14 + 1] = map[(b16 & 3) << 4];
            bArr2[i14 + 2] = 61;
            bArr2[i14 + 3] = 61;
        } else if (length2 == 2) {
            int i17 = i13 + 1;
            byte b17 = bArr[i13];
            byte b18 = bArr[i17];
            bArr2[i14] = map[(b17 & 255) >> 2];
            bArr2[i14 + 1] = map[((b17 & 3) << 4) | ((b18 & 255) >> 4)];
            bArr2[i14 + 2] = map[(b18 & 15) << 2];
            bArr2[i14 + 3] = 61;
        }
        return hkdspvbjdz.ppxfxbqfkf(bArr2);
    }
}
