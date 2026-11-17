package w0;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f118256iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f118255zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final long f118253ppxfxbqfkf = wkgbmnqykc(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final long f118254wkgbmnqykc = wkgbmnqykc(9205357640488583168L);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return gtknphoqwx.f118254wkgbmnqykc;
        }

        public final long zoijcleaow() {
            return gtknphoqwx.f118253ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ gtknphoqwx(long j13) {
        this.f118256iobyxmoadg = j13;
    }

    public static String btonecajqb(long j13) {
        if (j13 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) nufgyqmvbu.gtknphoqwx(nufgyqmvbu(j13))) + " x " + ((Object) nufgyqmvbu.gtknphoqwx(lqeggnwhkg(j13)));
    }

    public static int dxjokdxxww(long j13) {
        return Long.hashCode(j13);
    }

    public static boolean eablkybsjg(long j13, Object obj) {
        return (obj instanceof gtknphoqwx) && j13 == ((gtknphoqwx) obj).gtknphoqwx();
    }

    public static final boolean gxszxtbevo(long j13, long j14) {
        return j13 == j14;
    }

    public static final float lqeggnwhkg(long j13) {
        return nufgyqmvbu.lqeggnwhkg(Float.intBitsToFloat((int) (j13 & 4294967295L)));
    }

    public static final float nufgyqmvbu(long j13) {
        return nufgyqmvbu.lqeggnwhkg(Float.intBitsToFloat((int) (j13 >> 32)));
    }

    public static final /* synthetic */ gtknphoqwx ppxfxbqfkf(long j13) {
        return new gtknphoqwx(j13);
    }

    public static long wkgbmnqykc(long j13) {
        return j13;
    }

    public boolean equals(Object obj) {
        return eablkybsjg(this.f118256iobyxmoadg, obj);
    }

    public final /* synthetic */ long gtknphoqwx() {
        return this.f118256iobyxmoadg;
    }

    public int hashCode() {
        return dxjokdxxww(this.f118256iobyxmoadg);
    }

    public String toString() {
        return btonecajqb(this.f118256iobyxmoadg);
    }
}
