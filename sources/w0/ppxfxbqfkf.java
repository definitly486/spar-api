package w0;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {
    public static /* synthetic */ long btonecajqb(long j13, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        return dxjokdxxww(j13, i13, i14);
    }

    public static final Void draadjrbmk(int i13) {
        throw new IllegalArgumentException("Can't represent a size of " + i13 + " in Constraints");
    }

    public static final long dxjokdxxww(long j13, int i13, int i14) {
        int iAgtfadlqog = zoijcleaow.agtfadlqog(j13) + i13;
        if (iAgtfadlqog < 0) {
            iAgtfadlqog = 0;
        }
        int iDraadjrbmk = zoijcleaow.draadjrbmk(j13);
        if (iDraadjrbmk != Integer.MAX_VALUE && (iDraadjrbmk = iDraadjrbmk + i13) < 0) {
            iDraadjrbmk = 0;
        }
        int iWflxmlrfwp = zoijcleaow.wflxmlrfwp(j13) + i14;
        if (iWflxmlrfwp < 0) {
            iWflxmlrfwp = 0;
        }
        int iGtknphoqwx = zoijcleaow.gtknphoqwx(j13);
        return iobyxmoadg(iAgtfadlqog, iDraadjrbmk, iWflxmlrfwp, (iGtknphoqwx == Integer.MAX_VALUE || (iGtknphoqwx = iGtknphoqwx + i14) >= 0) ? iGtknphoqwx : 0);
    }

    public static final long eablkybsjg(long j13, long j14) {
        int iAgtfadlqog = zoijcleaow.agtfadlqog(j13);
        int iDraadjrbmk = zoijcleaow.draadjrbmk(j13);
        int iWflxmlrfwp = zoijcleaow.wflxmlrfwp(j13);
        int iGtknphoqwx = zoijcleaow.gtknphoqwx(j13);
        int iAgtfadlqog2 = zoijcleaow.agtfadlqog(j14);
        if (iAgtfadlqog2 < iAgtfadlqog) {
            iAgtfadlqog2 = iAgtfadlqog;
        }
        if (iAgtfadlqog2 > iDraadjrbmk) {
            iAgtfadlqog2 = iDraadjrbmk;
        }
        int iDraadjrbmk2 = zoijcleaow.draadjrbmk(j14);
        if (iDraadjrbmk2 >= iAgtfadlqog) {
            iAgtfadlqog = iDraadjrbmk2;
        }
        if (iAgtfadlqog <= iDraadjrbmk) {
            iDraadjrbmk = iAgtfadlqog;
        }
        int iWflxmlrfwp2 = zoijcleaow.wflxmlrfwp(j14);
        if (iWflxmlrfwp2 < iWflxmlrfwp) {
            iWflxmlrfwp2 = iWflxmlrfwp;
        }
        if (iWflxmlrfwp2 > iGtknphoqwx) {
            iWflxmlrfwp2 = iGtknphoqwx;
        }
        int iGtknphoqwx2 = zoijcleaow.gtknphoqwx(j14);
        if (iGtknphoqwx2 >= iWflxmlrfwp) {
            iWflxmlrfwp = iGtknphoqwx2;
        }
        if (iWflxmlrfwp <= iGtknphoqwx) {
            iGtknphoqwx = iWflxmlrfwp;
        }
        return iobyxmoadg(iAgtfadlqog2, iDraadjrbmk, iWflxmlrfwp2, iGtknphoqwx);
    }

    public static final void gtknphoqwx(int i13, int i14) {
        throw new IllegalArgumentException("Can't represent a width of " + i13 + " and height of " + i14 + " in Constraints");
    }

    public static final int gxszxtbevo(long j13, int i13) {
        int iWflxmlrfwp = zoijcleaow.wflxmlrfwp(j13);
        int iGtknphoqwx = zoijcleaow.gtknphoqwx(j13);
        if (i13 < iWflxmlrfwp) {
            i13 = iWflxmlrfwp;
        }
        return i13 > iGtknphoqwx ? iGtknphoqwx : i13;
    }

    public static final long iobyxmoadg(int i13, int i14, int i15, int i16) {
        if (!((i15 >= 0) & (i14 >= i13) & (i16 >= i15) & (i13 >= 0))) {
            wflxmlrfwp.iobyxmoadg("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return nufgyqmvbu(i13, i14, i15, i16);
    }

    public static final int lqeggnwhkg(long j13, int i13) {
        int iAgtfadlqog = zoijcleaow.agtfadlqog(j13);
        int iDraadjrbmk = zoijcleaow.draadjrbmk(j13);
        if (i13 < iAgtfadlqog) {
            i13 = iAgtfadlqog;
        }
        return i13 > iDraadjrbmk ? iDraadjrbmk : i13;
    }

    public static final long nufgyqmvbu(int i13, int i14, int i15, int i16) {
        int i17 = i16 == Integer.MAX_VALUE ? i15 : i16;
        int iPpxfxbqfkf = ppxfxbqfkf(i17);
        int i18 = i14 == Integer.MAX_VALUE ? i13 : i14;
        int iPpxfxbqfkf2 = ppxfxbqfkf(i18);
        if (iPpxfxbqfkf + iPpxfxbqfkf2 > 31) {
            gtknphoqwx(i18, i17);
        }
        int i19 = i14 + 1;
        int i23 = i16 + 1;
        int i24 = iPpxfxbqfkf2 - 13;
        return zoijcleaow.zoijcleaow((((long) (i19 & (~(i19 >> 31)))) << 33) | ((long) ((i24 >> 1) + (i24 & 1))) | (((long) i13) << 2) | (((long) i15) << (iPpxfxbqfkf2 + 2)) | (((long) (i23 & (~(i23 >> 31)))) << (iPpxfxbqfkf2 + 33)));
    }

    public static final int ppxfxbqfkf(int i13) {
        if (i13 < 8191) {
            return 13;
        }
        if (i13 < 32767) {
            return 15;
        }
        if (i13 < 65535) {
            return 16;
        }
        if (i13 < 262143) {
            return 18;
        }
        return KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static final long wkgbmnqykc(long j13, long j14) {
        int i13 = (int) (j14 >> 32);
        int iAgtfadlqog = zoijcleaow.agtfadlqog(j13);
        int iDraadjrbmk = zoijcleaow.draadjrbmk(j13);
        if (i13 < iAgtfadlqog) {
            i13 = iAgtfadlqog;
        }
        if (i13 <= iDraadjrbmk) {
            iDraadjrbmk = i13;
        }
        int i14 = (int) (j14 & 4294967295L);
        int iWflxmlrfwp = zoijcleaow.wflxmlrfwp(j13);
        int iGtknphoqwx = zoijcleaow.gtknphoqwx(j13);
        if (i14 < iWflxmlrfwp) {
            i14 = iWflxmlrfwp;
        }
        if (i14 <= iGtknphoqwx) {
            iGtknphoqwx = i14;
        }
        return oxmwwwfdhm.ppxfxbqfkf((((long) iDraadjrbmk) << 32) | (((long) iGtknphoqwx) & 4294967295L));
    }

    public static /* synthetic */ long zoijcleaow(int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = 0;
        }
        if ((i17 & 2) != 0) {
            i14 = Integer.MAX_VALUE;
        }
        if ((i17 & 4) != 0) {
            i15 = 0;
        }
        if ((i17 & 8) != 0) {
            i16 = Integer.MAX_VALUE;
        }
        return iobyxmoadg(i13, i14, i15, i16);
    }
}
