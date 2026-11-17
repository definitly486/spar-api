package w0;

/* JADX INFO: loaded from: classes.dex */
public final class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f118252iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f118251zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final long f118250ppxfxbqfkf = ppxfxbqfkf(0);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return esjtqupxsv.f118250ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ esjtqupxsv(long j13) {
        this.f118252iobyxmoadg = j13;
    }

    public static String agtfadlqog(long j13) {
        return '(' + nufgyqmvbu(j13) + ", " + dxjokdxxww(j13) + ") px/sec";
    }

    public static int btonecajqb(long j13) {
        return Long.hashCode(j13);
    }

    public static final long draadjrbmk(long j13, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat((int) (j14 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat((int) (j14 & 4294967295L));
        return ppxfxbqfkf((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final float dxjokdxxww(long j13) {
        return Float.intBitsToFloat((int) (j13 & 4294967295L));
    }

    public static /* synthetic */ long eablkybsjg(long j13, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = Float.intBitsToFloat((int) (j13 >> 32));
        }
        if ((i13 & 2) != 0) {
            f14 = Float.intBitsToFloat((int) (4294967295L & j13));
        }
        return wkgbmnqykc(j13, f13, f14);
    }

    public static final long gtknphoqwx(long j13, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) - Float.intBitsToFloat((int) (j14 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) - Float.intBitsToFloat((int) (j14 & 4294967295L));
        return ppxfxbqfkf((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static boolean gxszxtbevo(long j13, Object obj) {
        return (obj instanceof esjtqupxsv) && j13 == ((esjtqupxsv) obj).ojitshcjhn();
    }

    public static final boolean lqeggnwhkg(long j13, long j14) {
        return j13 == j14;
    }

    public static final float nufgyqmvbu(long j13) {
        return Float.intBitsToFloat((int) (j13 >> 32));
    }

    public static long ppxfxbqfkf(long j13) {
        return j13;
    }

    public static final long wflxmlrfwp(long j13, float f13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) * f13;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) * f13;
        return ppxfxbqfkf((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long wkgbmnqykc(long j13, float f13, float f14) {
        return ppxfxbqfkf((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
    }

    public static final /* synthetic */ esjtqupxsv zoijcleaow(long j13) {
        return new esjtqupxsv(j13);
    }

    public boolean equals(Object obj) {
        return gxszxtbevo(this.f118252iobyxmoadg, obj);
    }

    public int hashCode() {
        return btonecajqb(this.f118252iobyxmoadg);
    }

    public final /* synthetic */ long ojitshcjhn() {
        return this.f118252iobyxmoadg;
    }

    public String toString() {
        return agtfadlqog(this.f118252iobyxmoadg);
    }
}
