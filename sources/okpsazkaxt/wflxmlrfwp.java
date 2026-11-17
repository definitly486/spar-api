package okpsazkaxt;

/* JADX INFO: loaded from: classes.dex */
public abstract class wflxmlrfwp {
    private static final int eablkybsjg(int i13, int i14, boolean z13) {
        return z13 ? i13 : i13 - i14;
    }

    private static final int gxszxtbevo(int i13, int i14, boolean z13) {
        if (z13) {
            return 0;
        }
        return i14 - i13;
    }

    private static final int iobyxmoadg(int i13, int i14, boolean z13) {
        return gxszxtbevo(i13, i14, !z13);
    }

    private static final boolean lqeggnwhkg(int i13, int i14, int i15, boolean z13) {
        return nufgyqmvbu(i13, i14, i15, !z13);
    }

    private static final boolean nufgyqmvbu(int i13, int i14, int i15, boolean z13) {
        if (z13) {
            if (i14 > i13) {
                return false;
            }
        } else if (i15 - i14 <= i13) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ int ppxfxbqfkf(int i13, int i14, int i15, boolean z13, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            z13 = true;
        }
        return zoijcleaow(i13, i14, i15, z13);
    }

    private static final int wkgbmnqykc(int i13, int i14, boolean z13) {
        return eablkybsjg(i13, i14, !z13);
    }

    public static final int zoijcleaow(int i13, int i14, int i15, boolean z13) {
        if (i14 >= i15) {
            return gxszxtbevo(i14, i15, z13);
        }
        if (lqeggnwhkg(i13, i14, i15, z13)) {
            return eablkybsjg(i13, i14, z13);
        }
        return nufgyqmvbu(i13, i14, i15, z13) ? wkgbmnqykc(i13, i14, z13) : iobyxmoadg(i14, i15, z13);
    }
}
