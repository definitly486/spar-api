package w0;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f118283zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f118284iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long eablkybsjg(int i13) {
            if (!(i13 >= 0)) {
                wflxmlrfwp.iobyxmoadg("width must be >= 0");
            }
            return ppxfxbqfkf.nufgyqmvbu(i13, i13, 0, Integer.MAX_VALUE);
        }

        public final long iobyxmoadg(int i13, int i14, int i15, int i16) {
            int i17 = 262142;
            int iMin = Math.min(i15, 262142);
            int iMin2 = i16 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i16, 262142);
            int i18 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i18 >= 8191) {
                if (i18 < 32767) {
                    i17 = 65534;
                } else if (i18 < 65535) {
                    i17 = 32766;
                } else {
                    if (i18 >= 262143) {
                        ppxfxbqfkf.draadjrbmk(i18);
                        throw new KotlinNothingValueException();
                    }
                    i17 = 8190;
                }
            }
            return ppxfxbqfkf.iobyxmoadg(Math.min(i17, i13), i14 != Integer.MAX_VALUE ? Math.min(i17, i14) : Integer.MAX_VALUE, iMin, iMin2);
        }

        public final long ppxfxbqfkf(int i13, int i14) {
            if (!((i14 >= 0) & (i13 >= 0))) {
                wflxmlrfwp.iobyxmoadg("width and height must be >= 0");
            }
            return ppxfxbqfkf.nufgyqmvbu(i13, i13, i14, i14);
        }

        public final long wkgbmnqykc(int i13) {
            if (!(i13 >= 0)) {
                wflxmlrfwp.iobyxmoadg("height must be >= 0");
            }
            return ppxfxbqfkf.nufgyqmvbu(0, Integer.MAX_VALUE, i13, i13);
        }

        public final long zoijcleaow(int i13, int i14, int i15, int i16) {
            int i17 = 262142;
            int iMin = Math.min(i13, 262142);
            int iMin2 = i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i14, 262142);
            int i18 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i18 >= 8191) {
                if (i18 < 32767) {
                    i17 = 65534;
                } else if (i18 < 65535) {
                    i17 = 32766;
                } else {
                    if (i18 >= 262143) {
                        ppxfxbqfkf.draadjrbmk(i18);
                        throw new KotlinNothingValueException();
                    }
                    i17 = 8190;
                }
            }
            return ppxfxbqfkf.iobyxmoadg(iMin, iMin2, Math.min(i17, i15), i16 != Integer.MAX_VALUE ? Math.min(i17, i16) : Integer.MAX_VALUE);
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ zoijcleaow(long j13) {
        this.f118284iobyxmoadg = j13;
    }

    public static final int agtfadlqog(long j13) {
        int i13 = (int) (3 & j13);
        return ((int) (j13 >> 2)) & ((1 << ((((i13 & 1) << 1) + (((i13 & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static final boolean btonecajqb(long j13) {
        int i13 = (int) (3 & j13);
        int i14 = (1 << ((((i13 & 1) << 1) + (((i13 & 2) >> 1) * 3)) + 13)) - 1;
        int i15 = ((int) (j13 >> 2)) & i14;
        int i16 = ((int) (j13 >> 33)) & i14;
        return i15 == (i16 == 0 ? Integer.MAX_VALUE : i16 - 1);
    }

    public static final int draadjrbmk(long j13) {
        int i13 = (int) (3 & j13);
        int i14 = ((int) (j13 >> 33)) & ((1 << ((((i13 & 1) << 1) + (((i13 & 2) >> 1) * 3)) + 13)) - 1);
        if (i14 == 0) {
            return Integer.MAX_VALUE;
        }
        return i14 - 1;
    }

    public static final boolean dxjokdxxww(long j13) {
        int i13 = (int) (3 & j13);
        int i14 = ((i13 & 1) << 1) + (((i13 & 2) >> 1) * 3);
        int i15 = (1 << (18 - i14)) - 1;
        int i16 = ((int) (j13 >> (i14 + 15))) & i15;
        int i17 = ((int) (j13 >> (i14 + 46))) & i15;
        return i16 == (i17 == 0 ? Integer.MAX_VALUE : i17 - 1);
    }

    public static boolean eablkybsjg(long j13, Object obj) {
        return (obj instanceof zoijcleaow) && j13 == ((zoijcleaow) obj).vdvldrhtss();
    }

    public static final int gtknphoqwx(long j13) {
        int i13 = (int) (3 & j13);
        int i14 = ((i13 & 1) << 1) + (((i13 & 2) >> 1) * 3);
        int i15 = ((int) (j13 >> (i14 + 46))) & ((1 << (18 - i14)) - 1);
        if (i15 == 0) {
            return Integer.MAX_VALUE;
        }
        return i15 - 1;
    }

    public static final boolean gxszxtbevo(long j13, long j14) {
        return j13 == j14;
    }

    public static final /* synthetic */ zoijcleaow iobyxmoadg(long j13) {
        return new zoijcleaow(j13);
    }

    public static final boolean lqeggnwhkg(long j13) {
        int i13 = (int) (3 & j13);
        int i14 = ((i13 & 1) << 1) + (((i13 & 2) >> 1) * 3);
        return (((int) (j13 >> (i14 + 46))) & ((1 << (18 - i14)) - 1)) != 0;
    }

    public static final boolean nufgyqmvbu(long j13) {
        int i13 = (int) (3 & j13);
        return (((int) (j13 >> 33)) & ((1 << ((((i13 & 1) << 1) + (((i13 & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static int ojitshcjhn(long j13) {
        return Long.hashCode(j13);
    }

    public static final long ppxfxbqfkf(long j13, int i13, int i14, int i15, int i16) {
        if (!(i14 >= i13 && i16 >= i15 && i13 >= 0 && i15 >= 0)) {
            wflxmlrfwp.iobyxmoadg("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ppxfxbqfkf.nufgyqmvbu(i13, i14, i15, i16);
    }

    public static String rgvfuqvkyq(long j13) {
        int iDraadjrbmk = draadjrbmk(j13);
        String strValueOf = iDraadjrbmk == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iDraadjrbmk);
        int iGtknphoqwx = gtknphoqwx(j13);
        return "Constraints(minWidth = " + agtfadlqog(j13) + ", maxWidth = " + strValueOf + ", minHeight = " + wflxmlrfwp(j13) + ", maxHeight = " + (iGtknphoqwx != Integer.MAX_VALUE ? String.valueOf(iGtknphoqwx) : "Infinity") + ')';
    }

    public static final int wflxmlrfwp(long j13) {
        int i13 = (int) (3 & j13);
        int i14 = ((i13 & 1) << 1) + (((i13 & 2) >> 1) * 3);
        return ((int) (j13 >> (i14 + 15))) & ((1 << (18 - i14)) - 1);
    }

    public static /* synthetic */ long wkgbmnqykc(long j13, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = agtfadlqog(j13);
        }
        int i18 = i13;
        if ((i17 & 2) != 0) {
            i14 = draadjrbmk(j13);
        }
        int i19 = i14;
        if ((i17 & 4) != 0) {
            i15 = wflxmlrfwp(j13);
        }
        int i23 = i15;
        if ((i17 & 8) != 0) {
            i16 = gtknphoqwx(j13);
        }
        return ppxfxbqfkf(j13, i18, i19, i23, i16);
    }

    public static long zoijcleaow(long j13) {
        return j13;
    }

    public boolean equals(Object obj) {
        return eablkybsjg(this.f118284iobyxmoadg, obj);
    }

    public int hashCode() {
        return ojitshcjhn(this.f118284iobyxmoadg);
    }

    public String toString() {
        return rgvfuqvkyq(this.f118284iobyxmoadg);
    }

    public final /* synthetic */ long vdvldrhtss() {
        return this.f118284iobyxmoadg;
    }
}
