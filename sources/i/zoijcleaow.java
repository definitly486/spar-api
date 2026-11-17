package i;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final long f41584eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f41585iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final long f41586ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final long f41587wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final long f41588zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return zoijcleaow.f41587wkgbmnqykc;
        }

        public final long ppxfxbqfkf() {
            return zoijcleaow.f41586ppxfxbqfkf;
        }

        public final long zoijcleaow() {
            return zoijcleaow.f41588zoijcleaow;
        }

        private iobyxmoadg() {
        }
    }

    static {
        long j13 = 3;
        long j14 = j13 << 32;
        f41588zoijcleaow = wkgbmnqykc((((long) 0) & 4294967295L) | j14);
        f41586ppxfxbqfkf = wkgbmnqykc((((long) 1) & 4294967295L) | j14);
        f41587wkgbmnqykc = wkgbmnqykc(j14 | (((long) 2) & 4294967295L));
        f41584eablkybsjg = wkgbmnqykc((j13 & 4294967295L) | (((long) 4) << 32));
    }

    public static final boolean eablkybsjg(long j13, long j14) {
        return j13 == j14;
    }

    public static final int gxszxtbevo(long j13) {
        return (int) (j13 >> 32);
    }

    public static int lqeggnwhkg(long j13) {
        return Long.hashCode(j13);
    }

    public static String nufgyqmvbu(long j13) {
        if (eablkybsjg(j13, f41588zoijcleaow)) {
            return "Rgb";
        }
        if (eablkybsjg(j13, f41586ppxfxbqfkf)) {
            return "Xyz";
        }
        if (eablkybsjg(j13, f41587wkgbmnqykc)) {
            return "Lab";
        }
        return eablkybsjg(j13, f41584eablkybsjg) ? "Cmyk" : "Unknown";
    }

    public static long wkgbmnqykc(long j13) {
        return j13;
    }
}
