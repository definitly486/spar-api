package ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f82731iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final float[] f82732ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f82733wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final float[] f82734zoijcleaow;

    /* JADX INFO: renamed from: ribwqtqdhb.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1853iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f82735iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final float f82736zoijcleaow;

        public C1853iobyxmoadg(float f13, float f14) {
            this.f82735iobyxmoadg = f13;
            this.f82736zoijcleaow = f14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1853iobyxmoadg)) {
                return false;
            }
            C1853iobyxmoadg c1853iobyxmoadg = (C1853iobyxmoadg) obj;
            return Float.compare(this.f82735iobyxmoadg, c1853iobyxmoadg.f82735iobyxmoadg) == 0 && Float.compare(this.f82736zoijcleaow, c1853iobyxmoadg.f82736zoijcleaow) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f82735iobyxmoadg) * 31) + Float.hashCode(this.f82736zoijcleaow);
        }

        public final float iobyxmoadg() {
            return this.f82735iobyxmoadg;
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f82735iobyxmoadg + ", velocityCoefficient=" + this.f82736zoijcleaow + ')';
        }

        public final float zoijcleaow() {
            return this.f82736zoijcleaow;
        }
    }

    static {
        float[] fArr = new float[101];
        f82734zoijcleaow = fArr;
        float[] fArr2 = new float[101];
        f82732ppxfxbqfkf = fArr2;
        zdlpuopuiu.zoijcleaow(fArr, fArr2, 100);
        f82733wkgbmnqykc = 8;
    }

    private iobyxmoadg() {
    }

    public final double iobyxmoadg(float f13, float f14) {
        return Math.log(((double) (Math.abs(f13) * 0.35f)) / ((double) f14));
    }

    public final C1853iobyxmoadg zoijcleaow(float f13) {
        float f14 = 0.0f;
        float f15 = 1.0f;
        float fWflxmlrfwp = zg.gtknphoqwx.wflxmlrfwp(f13, 0.0f, 1.0f);
        float f16 = 100;
        int i13 = (int) (f16 * fWflxmlrfwp);
        if (i13 < 100) {
            float f17 = i13 / f16;
            int i14 = i13 + 1;
            float f18 = i14 / f16;
            float[] fArr = f82734zoijcleaow;
            float f19 = fArr[i13];
            float f23 = (fArr[i14] - f19) / (f18 - f17);
            float f24 = ((fWflxmlrfwp - f17) * f23) + f19;
            f14 = f23;
            f15 = f24;
        }
        return new C1853iobyxmoadg(f15, f14);
    }
}
