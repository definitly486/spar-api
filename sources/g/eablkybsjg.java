package g;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f35585iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f35584zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final long f35582ppxfxbqfkf = eablkybsjg(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final long f35583wkgbmnqykc = eablkybsjg(9187343241974906880L);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final long f35581eablkybsjg = eablkybsjg(9205357640488583168L);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return eablkybsjg.f35583wkgbmnqykc;
        }

        public final long ppxfxbqfkf() {
            return eablkybsjg.f35582ppxfxbqfkf;
        }

        public final long zoijcleaow() {
            return eablkybsjg.f35581eablkybsjg;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ eablkybsjg(long j13) {
        this.f35585iobyxmoadg = j13;
    }

    public static final float agtfadlqog(long j13) {
        return Float.intBitsToFloat((int) (j13 & 4294967295L));
    }

    public static final boolean btonecajqb(long j13, long j14) {
        return j13 == j14;
    }

    public static final float draadjrbmk(long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    public static boolean dxjokdxxww(long j13, Object obj) {
        return (obj instanceof eablkybsjg) && j13 == ((eablkybsjg) obj).zdlpuopuiu();
    }

    public static long eablkybsjg(long j13) {
        return j13;
    }

    public static final float gtknphoqwx(long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    public static final long gxszxtbevo(long j13, float f13, float f14) {
        return eablkybsjg((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
    }

    public static String kcexrzcfyt(long j13) {
        if ((9223372034707292159L & j13) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + zoijcleaow.iobyxmoadg(Float.intBitsToFloat((int) (j13 >> 32)), 1) + ", " + zoijcleaow.iobyxmoadg(Float.intBitsToFloat((int) (j13 & 4294967295L)), 1) + ')';
    }

    public static /* synthetic */ long lqeggnwhkg(long j13, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = Float.intBitsToFloat((int) (j13 >> 32));
        }
        if ((i13 & 2) != 0) {
            f14 = Float.intBitsToFloat((int) (4294967295L & j13));
        }
        return gxszxtbevo(j13, f13, f14);
    }

    public static final long nufgyqmvbu(long j13, float f13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) / f13;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) / f13;
        return eablkybsjg((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static int ojitshcjhn(long j13) {
        return Long.hashCode(j13);
    }

    public static final long oxmwwwfdhm(long j13, float f13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) * f13;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) * f13;
        return eablkybsjg((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long rgvfuqvkyq(long j13, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) - Float.intBitsToFloat((int) (j14 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) - Float.intBitsToFloat((int) (j14 & 4294967295L));
        return eablkybsjg((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long vdvldrhtss(long j13, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat((int) (j14 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat((int) (j14 & 4294967295L));
        return eablkybsjg((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final float wflxmlrfwp(long j13) {
        return Float.intBitsToFloat((int) (j13 >> 32));
    }

    public static final /* synthetic */ eablkybsjg wkgbmnqykc(long j13) {
        return new eablkybsjg(j13);
    }

    public boolean equals(Object obj) {
        return dxjokdxxww(this.f35585iobyxmoadg, obj);
    }

    public int hashCode() {
        return ojitshcjhn(this.f35585iobyxmoadg);
    }

    public String toString() {
        return kcexrzcfyt(this.f35585iobyxmoadg);
    }

    public final /* synthetic */ long zdlpuopuiu() {
        return this.f35585iobyxmoadg;
    }
}
