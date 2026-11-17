package z;

/* JADX INFO: loaded from: classes.dex */
abstract class skhdrjzrfn {
    public static final void iobyxmoadg(int[] iArr, lereixgezr lereixgezrVar) {
        int iMin;
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (ppxfxbqfkf(iArr)) {
            iMin = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i13 += ((iArr[4] != 0 ? 1 : 0) | (wkgbmnqykc(iArr) ? 1 : 0)) ^ 1;
            i14 += ((!wkgbmnqykc(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            iMin = iArr[2] - iArr[0];
        }
        lereixgezrVar.lqeggnwhkg(i13, i14, iMin);
    }

    private static final boolean ppxfxbqfkf(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    private static final boolean wkgbmnqykc(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    public static int[] zoijcleaow(int[] iArr) {
        return iArr;
    }
}
