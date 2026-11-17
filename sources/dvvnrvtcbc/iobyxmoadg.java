package dvvnrvtcbc;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C0601iobyxmoadg f29659iobyxmoadg = new C0601iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final long f29660zoijcleaow = zoijcleaow(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: dvvnrvtcbc.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0601iobyxmoadg {
        public /* synthetic */ C0601iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return iobyxmoadg.f29660zoijcleaow;
        }

        private C0601iobyxmoadg() {
        }
    }

    public static final boolean eablkybsjg(long j13, long j14) {
        return j13 == j14;
    }

    public static final float gxszxtbevo(long j13) {
        return Float.intBitsToFloat((int) (j13 >> 32));
    }

    public static final float lqeggnwhkg(long j13) {
        return Float.intBitsToFloat((int) (j13 & 4294967295L));
    }

    public static String nufgyqmvbu(long j13) {
        return "InlineDensity(density=" + gxszxtbevo(j13) + ", fontScale=" + lqeggnwhkg(j13) + ')';
    }

    private static long ppxfxbqfkf(long j13) {
        return j13;
    }

    public static long wkgbmnqykc(w0.wkgbmnqykc wkgbmnqykcVar) {
        return zoijcleaow(wkgbmnqykcVar.getDensity(), wkgbmnqykcVar.F());
    }

    public static long zoijcleaow(float f13, float f14) {
        return ppxfxbqfkf((((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32));
    }
}
