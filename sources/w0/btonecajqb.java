package w0;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f118242iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f118241zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final long f118239ppxfxbqfkf = zoijcleaow(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final long f118240wkgbmnqykc = zoijcleaow(9205357640488583168L);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ btonecajqb(long j13) {
        this.f118242iobyxmoadg = j13;
    }

    public static final float eablkybsjg(long j13) {
        return nufgyqmvbu.lqeggnwhkg(Float.intBitsToFloat((int) (j13 & 4294967295L)));
    }

    public static int gxszxtbevo(long j13) {
        return Long.hashCode(j13);
    }

    public static final /* synthetic */ btonecajqb iobyxmoadg(long j13) {
        return new btonecajqb(j13);
    }

    public static String lqeggnwhkg(long j13) {
        if (j13 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) nufgyqmvbu.gtknphoqwx(wkgbmnqykc(j13))) + ", " + ((Object) nufgyqmvbu.gtknphoqwx(eablkybsjg(j13))) + ')';
    }

    public static boolean ppxfxbqfkf(long j13, Object obj) {
        return (obj instanceof btonecajqb) && j13 == ((btonecajqb) obj).nufgyqmvbu();
    }

    public static final float wkgbmnqykc(long j13) {
        return nufgyqmvbu.lqeggnwhkg(Float.intBitsToFloat((int) (j13 >> 32)));
    }

    public static long zoijcleaow(long j13) {
        return j13;
    }

    public boolean equals(Object obj) {
        return ppxfxbqfkf(this.f118242iobyxmoadg, obj);
    }

    public int hashCode() {
        return gxszxtbevo(this.f118242iobyxmoadg);
    }

    public final /* synthetic */ long nufgyqmvbu() {
        return this.f118242iobyxmoadg;
    }

    public String toString() {
        return lqeggnwhkg(this.f118242iobyxmoadg);
    }
}
