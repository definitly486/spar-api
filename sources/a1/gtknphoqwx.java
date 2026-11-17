package a1;

/* JADX INFO: loaded from: classes.dex */
public class gtknphoqwx implements wflxmlrfwp {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private float f197btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private float f198dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private double f199eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private float f201gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private float f203lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private float f204nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private double f205ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private double f206wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    double f202iobyxmoadg = 0.5d;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f207zoijcleaow = false;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f200gtknphoqwx = 0;

    private void ppxfxbqfkf(double d13) {
        if (d13 <= 0.0d) {
            return;
        }
        double d14 = this.f205ppxfxbqfkf;
        double d15 = this.f202iobyxmoadg;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d14 / ((double) this.f198dxjokdxxww)) * d13) * 4.0d)) + 1.0d);
        double d16 = d13 / ((double) iSqrt);
        int i13 = 0;
        while (i13 < iSqrt) {
            float f13 = this.f203lqeggnwhkg;
            double d17 = this.f206wkgbmnqykc;
            float f14 = this.f204nufgyqmvbu;
            double d18 = d14;
            double d19 = ((-d14) * (((double) f13) - d17)) - (((double) f14) * d15);
            float f15 = this.f198dxjokdxxww;
            double d23 = d15;
            double d24 = ((double) f14) + (((d19 / ((double) f15)) * d16) / 2.0d);
            double d25 = ((((-((((double) f13) + ((d16 * d24) / 2.0d)) - d17)) * d18) - (d24 * d23)) / ((double) f15)) * d16;
            double d26 = ((double) f14) + (d25 / 2.0d);
            float f16 = f14 + ((float) d25);
            this.f204nufgyqmvbu = f16;
            float f17 = f13 + ((float) (d26 * d16));
            this.f203lqeggnwhkg = f17;
            int i14 = this.f200gtknphoqwx;
            if (i14 > 0) {
                if (f17 < 0.0f && (i14 & 1) == 1) {
                    this.f203lqeggnwhkg = -f17;
                    this.f204nufgyqmvbu = -f16;
                }
                float f18 = this.f203lqeggnwhkg;
                if (f18 > 1.0f && (i14 & 2) == 2) {
                    this.f203lqeggnwhkg = 2.0f - f18;
                    this.f204nufgyqmvbu = -this.f204nufgyqmvbu;
                }
            }
            i13++;
            d14 = d18;
            d15 = d23;
        }
    }

    @Override // a1.wflxmlrfwp
    public float getInterpolation(float f13) {
        ppxfxbqfkf(f13 - this.f201gxszxtbevo);
        this.f201gxszxtbevo = f13;
        if (zoijcleaow()) {
            this.f203lqeggnwhkg = (float) this.f206wkgbmnqykc;
        }
        return this.f203lqeggnwhkg;
    }

    @Override // a1.wflxmlrfwp
    public float iobyxmoadg() {
        return 0.0f;
    }

    public void wkgbmnqykc(float f13, float f14, float f15, float f16, float f17, float f18, float f19, int i13) {
        this.f206wkgbmnqykc = f14;
        this.f202iobyxmoadg = f18;
        this.f207zoijcleaow = false;
        this.f203lqeggnwhkg = f13;
        this.f199eablkybsjg = f15;
        this.f205ppxfxbqfkf = f17;
        this.f198dxjokdxxww = f16;
        this.f197btonecajqb = f19;
        this.f200gtknphoqwx = i13;
        this.f201gxszxtbevo = 0.0f;
    }

    @Override // a1.wflxmlrfwp
    public boolean zoijcleaow() {
        double d13 = ((double) this.f203lqeggnwhkg) - this.f206wkgbmnqykc;
        double d14 = this.f205ppxfxbqfkf;
        double d15 = this.f204nufgyqmvbu;
        return Math.sqrt((((d15 * d15) * ((double) this.f198dxjokdxxww)) + ((d14 * d13) * d13)) / d14) <= ((double) this.f197btonecajqb);
    }
}
