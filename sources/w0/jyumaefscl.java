package w0;

/* JADX INFO: loaded from: classes.dex */
public final class jyumaefscl {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final cqumvgiudr[] f118257ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final long f118258wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f118259zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f118260iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return jyumaefscl.f118258wkgbmnqykc;
        }

        private iobyxmoadg() {
        }
    }

    static {
        cqumvgiudr.iobyxmoadg iobyxmoadgVar = cqumvgiudr.f118246zoijcleaow;
        f118257ppxfxbqfkf = new cqumvgiudr[]{cqumvgiudr.wkgbmnqykc(iobyxmoadgVar.ppxfxbqfkf()), cqumvgiudr.wkgbmnqykc(iobyxmoadgVar.zoijcleaow()), cqumvgiudr.wkgbmnqykc(iobyxmoadgVar.iobyxmoadg())};
        f118258wkgbmnqykc = iwizpuwonk.gtknphoqwx(0L, Float.NaN);
    }

    private /* synthetic */ jyumaefscl(long j13) {
        this.f118260iobyxmoadg = j13;
    }

    public static String btonecajqb(long j13) {
        long jLqeggnwhkg = lqeggnwhkg(j13);
        cqumvgiudr.iobyxmoadg iobyxmoadgVar = cqumvgiudr.f118246zoijcleaow;
        if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.ppxfxbqfkf())) {
            return "Unspecified";
        }
        if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.zoijcleaow())) {
            return nufgyqmvbu(j13) + ".sp";
        }
        if (!cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.iobyxmoadg())) {
            return "Invalid";
        }
        return nufgyqmvbu(j13) + ".em";
    }

    public static int dxjokdxxww(long j13) {
        return Long.hashCode(j13);
    }

    public static final boolean eablkybsjg(long j13, long j14) {
        return j13 == j14;
    }

    public static final long gxszxtbevo(long j13) {
        return j13 & 1095216660480L;
    }

    public static final long lqeggnwhkg(long j13) {
        return f118257ppxfxbqfkf[(int) (gxszxtbevo(j13) >>> 32)].btonecajqb();
    }

    public static final float nufgyqmvbu(long j13) {
        return Float.intBitsToFloat((int) (j13 & 4294967295L));
    }

    public static long ppxfxbqfkf(long j13) {
        return j13;
    }

    public static boolean wkgbmnqykc(long j13, Object obj) {
        return (obj instanceof jyumaefscl) && j13 == ((jyumaefscl) obj).gtknphoqwx();
    }

    public static final /* synthetic */ jyumaefscl zoijcleaow(long j13) {
        return new jyumaefscl(j13);
    }

    public boolean equals(Object obj) {
        return wkgbmnqykc(this.f118260iobyxmoadg, obj);
    }

    public final /* synthetic */ long gtknphoqwx() {
        return this.f118260iobyxmoadg;
    }

    public int hashCode() {
        return dxjokdxxww(this.f118260iobyxmoadg);
    }

    public String toString() {
        return btonecajqb(this.f118260iobyxmoadg);
    }
}
