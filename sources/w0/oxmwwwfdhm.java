package w0;

/* JADX INFO: loaded from: classes.dex */
public final class oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f118271iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f118270zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final long f118269ppxfxbqfkf = ppxfxbqfkf(0);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return oxmwwwfdhm.f118269ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ oxmwwwfdhm(long j13) {
        this.f118271iobyxmoadg = j13;
    }

    public static String dxjokdxxww(long j13) {
        return ((int) (j13 >> 32)) + " x " + ((int) (j13 & 4294967295L));
    }

    public static final boolean eablkybsjg(long j13, long j14) {
        return j13 == j14;
    }

    public static final int gxszxtbevo(long j13) {
        return (int) (j13 & 4294967295L);
    }

    public static final int lqeggnwhkg(long j13) {
        return (int) (j13 >> 32);
    }

    public static int nufgyqmvbu(long j13) {
        return Long.hashCode(j13);
    }

    public static long ppxfxbqfkf(long j13) {
        return j13;
    }

    public static boolean wkgbmnqykc(long j13, Object obj) {
        return (obj instanceof oxmwwwfdhm) && j13 == ((oxmwwwfdhm) obj).btonecajqb();
    }

    public static final /* synthetic */ oxmwwwfdhm zoijcleaow(long j13) {
        return new oxmwwwfdhm(j13);
    }

    public final /* synthetic */ long btonecajqb() {
        return this.f118271iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return wkgbmnqykc(this.f118271iobyxmoadg, obj);
    }

    public int hashCode() {
        return nufgyqmvbu(this.f118271iobyxmoadg);
    }

    public String toString() {
        return dxjokdxxww(this.f118271iobyxmoadg);
    }
}
