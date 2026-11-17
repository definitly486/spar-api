package db;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {
    private static void eablkybsjg(byte[] bArr, long j13, int i13) {
        int i14 = 0;
        while (i14 < 4) {
            bArr[i13 + i14] = (byte) (255 & j13);
            i14++;
            j13 >>= 8;
        }
    }

    public static void gxszxtbevo(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!ob.gxszxtbevo.zoijcleaow(iobyxmoadg(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public static byte[] iobyxmoadg(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        int i13 = 0;
        long jPpxfxbqfkf = ppxfxbqfkf(bArr, 0, 0) & 67108863;
        int i14 = 3;
        long jPpxfxbqfkf2 = ppxfxbqfkf(bArr, 3, 2) & 67108611;
        long jPpxfxbqfkf3 = ppxfxbqfkf(bArr, 6, 4) & 67092735;
        long jPpxfxbqfkf4 = ppxfxbqfkf(bArr, 9, 6) & 66076671;
        long jPpxfxbqfkf5 = ppxfxbqfkf(bArr, 12, 8) & 1048575;
        long j13 = jPpxfxbqfkf2 * 5;
        long j14 = jPpxfxbqfkf3 * 5;
        long j15 = jPpxfxbqfkf4 * 5;
        long j16 = jPpxfxbqfkf5 * 5;
        byte[] bArr3 = new byte[17];
        long j17 = 0;
        int i15 = 0;
        long j18 = 0;
        long j19 = 0;
        long j23 = 0;
        long j24 = 0;
        while (i15 < bArr2.length) {
            zoijcleaow(bArr3, bArr2, i15);
            long jPpxfxbqfkf6 = j24 + ppxfxbqfkf(bArr3, i13, i13);
            long jPpxfxbqfkf7 = j17 + ppxfxbqfkf(bArr3, i14, 2);
            long jPpxfxbqfkf8 = j18 + ppxfxbqfkf(bArr3, 6, 4);
            long jPpxfxbqfkf9 = j19 + ppxfxbqfkf(bArr3, 9, 6);
            long jPpxfxbqfkf10 = j23 + (ppxfxbqfkf(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j25 = (jPpxfxbqfkf6 * jPpxfxbqfkf) + (jPpxfxbqfkf7 * j16) + (jPpxfxbqfkf8 * j15) + (jPpxfxbqfkf9 * j14) + (jPpxfxbqfkf10 * j13);
            long j26 = (jPpxfxbqfkf6 * jPpxfxbqfkf2) + (jPpxfxbqfkf7 * jPpxfxbqfkf) + (jPpxfxbqfkf8 * j16) + (jPpxfxbqfkf9 * j15) + (jPpxfxbqfkf10 * j14);
            long j27 = (jPpxfxbqfkf6 * jPpxfxbqfkf3) + (jPpxfxbqfkf7 * jPpxfxbqfkf2) + (jPpxfxbqfkf8 * jPpxfxbqfkf) + (jPpxfxbqfkf9 * j16) + (jPpxfxbqfkf10 * j15);
            long j28 = (jPpxfxbqfkf6 * jPpxfxbqfkf4) + (jPpxfxbqfkf7 * jPpxfxbqfkf3) + (jPpxfxbqfkf8 * jPpxfxbqfkf2) + (jPpxfxbqfkf9 * jPpxfxbqfkf) + (jPpxfxbqfkf10 * j16);
            long j29 = j26 + (j25 >> 26);
            long j33 = j27 + (j29 >> 26);
            long j34 = j28 + (j33 >> 26);
            long j35 = (jPpxfxbqfkf6 * jPpxfxbqfkf5) + (jPpxfxbqfkf7 * jPpxfxbqfkf4) + (jPpxfxbqfkf8 * jPpxfxbqfkf3) + (jPpxfxbqfkf9 * jPpxfxbqfkf2) + (jPpxfxbqfkf10 * jPpxfxbqfkf) + (j34 >> 26);
            long j36 = (j25 & 67108863) + ((j35 >> 26) * 5);
            j17 = (j29 & 67108863) + (j36 >> 26);
            i15 += 16;
            j18 = j33 & 67108863;
            j19 = j34 & 67108863;
            j23 = j35 & 67108863;
            i14 = 3;
            j24 = j36 & 67108863;
            i13 = 0;
        }
        long j37 = j18 + (j17 >> 26);
        long j38 = j37 & 67108863;
        long j39 = j19 + (j37 >> 26);
        long j43 = j39 & 67108863;
        long j44 = j23 + (j39 >> 26);
        long j45 = j44 & 67108863;
        long j46 = j24 + ((j44 >> 26) * 5);
        long j47 = j46 & 67108863;
        long j48 = (j17 & 67108863) + (j46 >> 26);
        long j49 = j47 + 5;
        long j53 = j49 & 67108863;
        long j54 = (j49 >> 26) + j48;
        long j55 = j38 + (j54 >> 26);
        long j56 = j43 + (j55 >> 26);
        long j57 = (j45 + (j56 >> 26)) - 67108864;
        long j58 = j57 >> 63;
        long j59 = j47 & j58;
        long j63 = j48 & j58;
        long j64 = j38 & j58;
        long j65 = j43 & j58;
        long j66 = j45 & j58;
        long j67 = ~j58;
        long j68 = (j54 & 67108863 & j67) | j63;
        long j69 = (j55 & 67108863 & j67) | j64;
        long j73 = (j56 & 67108863 & j67) | j65;
        long j74 = (j57 & j67) | j66;
        long j75 = (j59 | (j53 & j67) | (j68 << 26)) & 4294967295L;
        long j76 = ((j68 >> 6) | (j69 << 20)) & 4294967295L;
        long j77 = ((j69 >> 12) | (j73 << 14)) & 4294967295L;
        long j78 = ((j73 >> 18) | (j74 << 8)) & 4294967295L;
        long jWkgbmnqykc = j75 + wkgbmnqykc(bArr, 16);
        long j79 = jWkgbmnqykc & 4294967295L;
        long jWkgbmnqykc2 = j76 + wkgbmnqykc(bArr, 20) + (jWkgbmnqykc >> 32);
        long j83 = jWkgbmnqykc2 & 4294967295L;
        long jWkgbmnqykc3 = j77 + wkgbmnqykc(bArr, 24) + (jWkgbmnqykc2 >> 32);
        long j84 = jWkgbmnqykc3 & 4294967295L;
        long jWkgbmnqykc4 = (j78 + wkgbmnqykc(bArr, 28) + (jWkgbmnqykc3 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        eablkybsjg(bArr4, j79, 0);
        eablkybsjg(bArr4, j83, 4);
        eablkybsjg(bArr4, j84, 8);
        eablkybsjg(bArr4, jWkgbmnqykc4, 12);
        return bArr4;
    }

    private static long ppxfxbqfkf(byte[] bArr, int i13, int i14) {
        return (wkgbmnqykc(bArr, i13) >> i14) & 67108863;
    }

    private static long wkgbmnqykc(byte[] bArr, int i13) {
        return ((long) (((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16))) & 4294967295L;
    }

    private static void zoijcleaow(byte[] bArr, byte[] bArr2, int i13) {
        int iMin = Math.min(16, bArr2.length - i13);
        System.arraycopy(bArr2, i13, bArr, 0, iMin);
        bArr[iMin] = 1;
        if (iMin != 16) {
            Arrays.fill(bArr, iMin + 1, bArr.length, (byte) 0);
        }
    }
}
