package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class gtknphoqwx {
    static int btonecajqb(int i13) {
        return Math.max(4, vdvldrhtss.iobyxmoadg(i13 + 1, 1.0d));
    }

    static void dxjokdxxww(Object obj, int i13, int i14) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i13] = (byte) i14;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i13] = (short) i14;
        } else {
            ((int[]) obj)[i13] = i14;
        }
    }

    static int eablkybsjg(int i13) {
        return (i13 < 32 ? 4 : 2) * (i13 + 1);
    }

    static int gxszxtbevo(Object obj, Object obj2, int i13, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iPpxfxbqfkf = vdvldrhtss.ppxfxbqfkf(obj);
        int i14 = iPpxfxbqfkf & i13;
        int iNufgyqmvbu = nufgyqmvbu(obj3, i14);
        if (iNufgyqmvbu == 0) {
            return -1;
        }
        int iZoijcleaow = zoijcleaow(iPpxfxbqfkf, i13);
        int i15 = -1;
        while (true) {
            int i16 = iNufgyqmvbu - 1;
            int i17 = iArr[i16];
            if (zoijcleaow(i17, i13) == iZoijcleaow && xa.dxjokdxxww.iobyxmoadg(obj, objArr[i16]) && (objArr2 == null || xa.dxjokdxxww.iobyxmoadg(obj2, objArr2[i16]))) {
                int iPpxfxbqfkf2 = ppxfxbqfkf(i17, i13);
                if (i15 == -1) {
                    dxjokdxxww(obj3, i14, iPpxfxbqfkf2);
                } else {
                    iArr[i15] = wkgbmnqykc(iArr[i15], iPpxfxbqfkf2, i13);
                }
                return i16;
            }
            int iPpxfxbqfkf3 = ppxfxbqfkf(i17, i13);
            if (iPpxfxbqfkf3 == 0) {
                return -1;
            }
            i15 = i16;
            iNufgyqmvbu = iPpxfxbqfkf3;
        }
    }

    static Object iobyxmoadg(int i13) {
        if (i13 >= 2 && i13 <= 1073741824 && Integer.highestOneBit(i13) == i13) {
            if (i13 <= 256) {
                return new byte[i13];
            }
            return i13 <= 65536 ? new short[i13] : new int[i13];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i13);
    }

    static void lqeggnwhkg(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static int nufgyqmvbu(Object obj, int i13) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i13] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i13] & 65535 : ((int[]) obj)[i13];
    }

    static int ppxfxbqfkf(int i13, int i14) {
        return i13 & i14;
    }

    static int wkgbmnqykc(int i13, int i14, int i15) {
        return (i13 & (~i15)) | (i14 & i15);
    }

    static int zoijcleaow(int i13, int i14) {
        return i13 & (~i14);
    }
}
