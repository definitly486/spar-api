package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
abstract class vdvldrhtss {
    static int iobyxmoadg(int i13, double d13) {
        int iMax = Math.max(i13, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d13 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i14 = iHighestOneBit << 1;
        if (i14 > 0) {
            return i14;
        }
        return 1073741824;
    }

    static int ppxfxbqfkf(Object obj) {
        return zoijcleaow(obj == null ? 0 : obj.hashCode());
    }

    static int zoijcleaow(int i13) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i13) * (-862048943)), 15)) * 461845907);
    }
}
