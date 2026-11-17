package a5;

/* JADX INFO: loaded from: classes.dex */
public abstract class hkdspvbjdz {
    public static int iobyxmoadg(byte[] bArr, int i13, int i14) {
        while (i13 < i14 && bArr[i13] != 71) {
            i13++;
        }
        return i13;
    }

    public static long ppxfxbqfkf(y2.yadqdtsiqt yadqdtsiqtVar, int i13, int i14) {
        yadqdtsiqtVar.sopmlzcsov(i13);
        if (yadqdtsiqtVar.iobyxmoadg() < 5) {
            return -9223372036854775807L;
        }
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        if ((8388608 & iVdvldrhtss) != 0 || ((2096896 & iVdvldrhtss) >> 8) != i14 || (iVdvldrhtss & 32) == 0 || yadqdtsiqtVar.wwaezpbzkn() < 7 || yadqdtsiqtVar.iobyxmoadg() < 7 || (yadqdtsiqtVar.wwaezpbzkn() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, 6);
        return wkgbmnqykc(bArr);
    }

    private static long wkgbmnqykc(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    public static boolean zoijcleaow(byte[] bArr, int i13, int i14, int i15) {
        int i16 = 0;
        for (int i17 = -4; i17 <= 4; i17++) {
            int i18 = (i17 * 188) + i15;
            if (i18 < i13 || i18 >= i14 || bArr[i18] != 71) {
                i16 = 0;
            } else {
                i16++;
                if (i16 == 5) {
                    return true;
                }
            }
        }
        return false;
    }
}
