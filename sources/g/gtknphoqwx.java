package g;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f35589iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f35588zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final long f35586ppxfxbqfkf = wkgbmnqykc(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final long f35587wkgbmnqykc = wkgbmnqykc(9205357640488583168L);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return gtknphoqwx.f35587wkgbmnqykc;
        }

        public final long zoijcleaow() {
            return gtknphoqwx.f35586ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ gtknphoqwx(long j13) {
        this.f35589iobyxmoadg = j13;
    }

    public static String agtfadlqog(long j13) {
        if (j13 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + zoijcleaow.iobyxmoadg(Float.intBitsToFloat((int) (j13 >> 32)), 1) + ", " + zoijcleaow.iobyxmoadg(Float.intBitsToFloat((int) (j13 & 4294967295L)), 1) + ')';
    }

    public static final float btonecajqb(long j13) {
        return Math.min(Float.intBitsToFloat((int) ((j13 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j13 & 2147483647L)));
    }

    public static int draadjrbmk(long j13) {
        return Long.hashCode(j13);
    }

    public static final float dxjokdxxww(long j13) {
        return Float.intBitsToFloat((int) (j13 & 4294967295L));
    }

    public static final long eablkybsjg(long j13, float f13, float f14) {
        return wkgbmnqykc((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
    }

    public static final float gtknphoqwx(long j13) {
        return Float.intBitsToFloat((int) (j13 >> 32));
    }

    public static /* synthetic */ long gxszxtbevo(long j13, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = Float.intBitsToFloat((int) (j13 >> 32));
        }
        if ((i13 & 2) != 0) {
            f14 = Float.intBitsToFloat((int) (4294967295L & j13));
        }
        return eablkybsjg(j13, f13, f14);
    }

    public static boolean lqeggnwhkg(long j13, Object obj) {
        return (obj instanceof gtknphoqwx) && j13 == ((gtknphoqwx) obj).ojitshcjhn();
    }

    public static final boolean nufgyqmvbu(long j13, long j14) {
        return j13 == j14;
    }

    public static final /* synthetic */ gtknphoqwx ppxfxbqfkf(long j13) {
        return new gtknphoqwx(j13);
    }

    public static final boolean wflxmlrfwp(long j13) {
        return (j13 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j13 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j13 & 4294967295L)) <= 0.0f);
    }

    public static long wkgbmnqykc(long j13) {
        return j13;
    }

    public boolean equals(Object obj) {
        return lqeggnwhkg(this.f35589iobyxmoadg, obj);
    }

    public int hashCode() {
        return draadjrbmk(this.f35589iobyxmoadg);
    }

    public final /* synthetic */ long ojitshcjhn() {
        return this.f35589iobyxmoadg;
    }

    public String toString() {
        return agtfadlqog(this.f35589iobyxmoadg);
    }
}
