package w0;

/* JADX INFO: loaded from: classes.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f118238iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f118237zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final long f118235ppxfxbqfkf = wkgbmnqykc(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final long f118236wkgbmnqykc = wkgbmnqykc(9223372034707292159L);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return agtfadlqog.f118236wkgbmnqykc;
        }

        public final long zoijcleaow() {
            return agtfadlqog.f118235ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ agtfadlqog(long j13) {
        this.f118238iobyxmoadg = j13;
    }

    public static String agtfadlqog(long j13) {
        return '(' + dxjokdxxww(j13) + ", " + btonecajqb(j13) + ')';
    }

    public static final int btonecajqb(long j13) {
        return (int) (j13 & 4294967295L);
    }

    public static final long draadjrbmk(long j13, long j14) {
        return wkgbmnqykc((((long) (((int) (j13 >> 32)) - ((int) (j14 >> 32)))) << 32) | (((long) (((int) (j13 & 4294967295L)) - ((int) (j14 & 4294967295L)))) & 4294967295L));
    }

    public static final int dxjokdxxww(long j13) {
        return (int) (j13 >> 32);
    }

    public static final long eablkybsjg(long j13, int i13, int i14) {
        return wkgbmnqykc((((long) i13) << 32) | (((long) i14) & 4294967295L));
    }

    public static int gtknphoqwx(long j13) {
        return Long.hashCode(j13);
    }

    public static /* synthetic */ long gxszxtbevo(long j13, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = (int) (j13 >> 32);
        }
        if ((i15 & 2) != 0) {
            i14 = (int) (4294967295L & j13);
        }
        return eablkybsjg(j13, i13, i14);
    }

    public static boolean lqeggnwhkg(long j13, Object obj) {
        return (obj instanceof agtfadlqog) && j13 == ((agtfadlqog) obj).rgvfuqvkyq();
    }

    public static final boolean nufgyqmvbu(long j13, long j14) {
        return j13 == j14;
    }

    public static final long ojitshcjhn(long j13) {
        int i13 = -((int) (j13 >> 32));
        return wkgbmnqykc((((long) (-((int) (j13 & 4294967295L)))) & 4294967295L) | (((long) i13) << 32));
    }

    public static final /* synthetic */ agtfadlqog ppxfxbqfkf(long j13) {
        return new agtfadlqog(j13);
    }

    public static final long wflxmlrfwp(long j13, long j14) {
        return wkgbmnqykc((((long) (((int) (j13 >> 32)) + ((int) (j14 >> 32)))) << 32) | (((long) (((int) (j13 & 4294967295L)) + ((int) (j14 & 4294967295L)))) & 4294967295L));
    }

    public static long wkgbmnqykc(long j13) {
        return j13;
    }

    public boolean equals(Object obj) {
        return lqeggnwhkg(this.f118238iobyxmoadg, obj);
    }

    public int hashCode() {
        return gtknphoqwx(this.f118238iobyxmoadg);
    }

    public final /* synthetic */ long rgvfuqvkyq() {
        return this.f118238iobyxmoadg;
    }

    public String toString() {
        return agtfadlqog(this.f118238iobyxmoadg);
    }
}
