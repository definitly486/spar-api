package j0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f50290iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f50289zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final long f50288ppxfxbqfkf = m.iobyxmoadg(0);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return l.f50288ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ l(long j13) {
        this.f50290iobyxmoadg = j13;
    }

    public static final int agtfadlqog(long j13) {
        return (int) (j13 >> 32);
    }

    public static final int btonecajqb(long j13) {
        return gtknphoqwx(j13) - draadjrbmk(j13);
    }

    public static final int draadjrbmk(long j13) {
        return Math.min(agtfadlqog(j13), dxjokdxxww(j13));
    }

    public static final int dxjokdxxww(long j13) {
        return (int) (j13 & 4294967295L);
    }

    public static final boolean eablkybsjg(long j13, int i13) {
        return i13 < gtknphoqwx(j13) && draadjrbmk(j13) <= i13;
    }

    public static final int gtknphoqwx(long j13) {
        return Math.max(agtfadlqog(j13), dxjokdxxww(j13));
    }

    public static boolean gxszxtbevo(long j13, Object obj) {
        return (obj instanceof l) && j13 == ((l) obj).oxmwwwfdhm();
    }

    public static final boolean lqeggnwhkg(long j13, long j14) {
        return j13 == j14;
    }

    public static final boolean nufgyqmvbu(long j13) {
        return agtfadlqog(j13) == dxjokdxxww(j13);
    }

    public static int ojitshcjhn(long j13) {
        return Long.hashCode(j13);
    }

    public static long ppxfxbqfkf(long j13) {
        return j13;
    }

    public static final boolean rgvfuqvkyq(long j13, long j14) {
        return (draadjrbmk(j13) < gtknphoqwx(j14)) & (draadjrbmk(j14) < gtknphoqwx(j13));
    }

    public static String vdvldrhtss(long j13) {
        return "TextRange(" + agtfadlqog(j13) + ", " + dxjokdxxww(j13) + ')';
    }

    public static final boolean wflxmlrfwp(long j13) {
        return agtfadlqog(j13) > dxjokdxxww(j13);
    }

    public static final boolean wkgbmnqykc(long j13, long j14) {
        return (draadjrbmk(j13) <= draadjrbmk(j14)) & (gtknphoqwx(j14) <= gtknphoqwx(j13));
    }

    public static final /* synthetic */ l zoijcleaow(long j13) {
        return new l(j13);
    }

    public boolean equals(Object obj) {
        return gxszxtbevo(this.f50290iobyxmoadg, obj);
    }

    public int hashCode() {
        return ojitshcjhn(this.f50290iobyxmoadg);
    }

    public final /* synthetic */ long oxmwwwfdhm() {
        return this.f50290iobyxmoadg;
    }

    public String toString() {
        return vdvldrhtss(this.f50290iobyxmoadg);
    }
}
