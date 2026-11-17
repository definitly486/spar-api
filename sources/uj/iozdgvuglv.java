package uj;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class iozdgvuglv {
    public static /* synthetic */ int eablkybsjg(String str, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            i14 = 1;
        }
        if ((i16 & 8) != 0) {
            i15 = Integer.MAX_VALUE;
        }
        return cdpycssgdh.zoijcleaow(str, i13, i14, i15);
    }

    public static /* synthetic */ long gxszxtbevo(String str, long j13, long j14, long j15, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            j14 = 1;
        }
        long j16 = j14;
        if ((i13 & 8) != 0) {
            j15 = Long.MAX_VALUE;
        }
        return cdpycssgdh.ppxfxbqfkf(str, j13, j16, j15);
    }

    public static final int iobyxmoadg(String str, int i13, int i14, int i15) {
        return (int) cdpycssgdh.ppxfxbqfkf(str, i13, i14, i15);
    }

    public static final String ppxfxbqfkf(String str, String str2) {
        String strWkgbmnqykc = cdpycssgdh.wkgbmnqykc(str);
        return strWkgbmnqykc == null ? str2 : strWkgbmnqykc;
    }

    public static final boolean wkgbmnqykc(String str, boolean z13) {
        String strWkgbmnqykc = cdpycssgdh.wkgbmnqykc(str);
        return strWkgbmnqykc != null ? Boolean.parseBoolean(strWkgbmnqykc) : z13;
    }

    public static final long zoijcleaow(String str, long j13, long j14, long j15) {
        String strWkgbmnqykc = cdpycssgdh.wkgbmnqykc(str);
        if (strWkgbmnqykc == null) {
            return j13;
        }
        Long lKcexrzcfyt = mj.kcexrzcfyt.kcexrzcfyt(strWkgbmnqykc);
        if (lKcexrzcfyt == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strWkgbmnqykc + '\'').toString());
        }
        long jLongValue = lKcexrzcfyt.longValue();
        if (j14 <= jLongValue && jLongValue <= j15) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j14 + ".." + j15 + ", but is '" + jLongValue + '\'').toString());
    }
}
