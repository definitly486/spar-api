package a1;

/* JADX INFO: loaded from: classes.dex */
public class agtfadlqog implements wflxmlrfwp {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float f144agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f145btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private float f147dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f148eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private String f149gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private float f150gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f151iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private float f152lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private float f153nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private float f154ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f155ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private float f157wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float f158wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private float f159zoijcleaow;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f146draadjrbmk = false;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f156rgvfuqvkyq = false;

    private void gxszxtbevo(float f13, float f14, float f15, float f16, float f17) {
        this.f156rgvfuqvkyq = false;
        this.f147dxjokdxxww = f14;
        if (f13 == 0.0f) {
            f13 = 1.0E-4f;
        }
        float f18 = f13 / f15;
        float f19 = (f18 * f13) / 2.0f;
        if (f13 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f14 - ((((-f13) / f15) * f13) / 2.0f)) * f15);
            if (fSqrt < f16) {
                this.f149gtknphoqwx = "backward accelerate, decelerate";
                this.f145btonecajqb = 2;
                this.f151iobyxmoadg = f13;
                this.f159zoijcleaow = fSqrt;
                this.f155ppxfxbqfkf = 0.0f;
                float f23 = (fSqrt - f13) / f15;
                this.f158wkgbmnqykc = f23;
                this.f148eablkybsjg = fSqrt / f15;
                this.f152lqeggnwhkg = ((f13 + fSqrt) * f23) / 2.0f;
                this.f153nufgyqmvbu = f14;
                this.f147dxjokdxxww = f14;
                return;
            }
            this.f149gtknphoqwx = "backward accelerate cruse decelerate";
            this.f145btonecajqb = 3;
            this.f151iobyxmoadg = f13;
            this.f159zoijcleaow = f16;
            this.f155ppxfxbqfkf = f16;
            float f24 = (f16 - f13) / f15;
            this.f158wkgbmnqykc = f24;
            float f25 = f16 / f15;
            this.f150gxszxtbevo = f25;
            float f26 = ((f13 + f16) * f24) / 2.0f;
            float f27 = (f25 * f16) / 2.0f;
            this.f148eablkybsjg = ((f14 - f26) - f27) / f16;
            this.f152lqeggnwhkg = f26;
            this.f153nufgyqmvbu = f14 - f27;
            this.f147dxjokdxxww = f14;
            return;
        }
        if (f19 >= f14) {
            this.f149gtknphoqwx = "hard stop";
            this.f145btonecajqb = 1;
            this.f151iobyxmoadg = f13;
            this.f159zoijcleaow = 0.0f;
            this.f152lqeggnwhkg = f14;
            this.f158wkgbmnqykc = (2.0f * f14) / f13;
            return;
        }
        float f28 = f14 - f19;
        float f29 = f28 / f13;
        if (f29 + f18 < f17) {
            this.f149gtknphoqwx = "cruse decelerate";
            this.f145btonecajqb = 2;
            this.f151iobyxmoadg = f13;
            this.f159zoijcleaow = f13;
            this.f155ppxfxbqfkf = 0.0f;
            this.f152lqeggnwhkg = f28;
            this.f153nufgyqmvbu = f14;
            this.f158wkgbmnqykc = f29;
            this.f148eablkybsjg = f18;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f15 * f14) + ((f13 * f13) / 2.0f));
        float f33 = (fSqrt2 - f13) / f15;
        this.f158wkgbmnqykc = f33;
        float f34 = fSqrt2 / f15;
        this.f148eablkybsjg = f34;
        if (fSqrt2 < f16) {
            this.f149gtknphoqwx = "accelerate decelerate";
            this.f145btonecajqb = 2;
            this.f151iobyxmoadg = f13;
            this.f159zoijcleaow = fSqrt2;
            this.f155ppxfxbqfkf = 0.0f;
            this.f158wkgbmnqykc = f33;
            this.f148eablkybsjg = f34;
            this.f152lqeggnwhkg = ((f13 + fSqrt2) * f33) / 2.0f;
            this.f153nufgyqmvbu = f14;
            return;
        }
        this.f149gtknphoqwx = "accelerate cruse decelerate";
        this.f145btonecajqb = 3;
        this.f151iobyxmoadg = f13;
        this.f159zoijcleaow = f16;
        this.f155ppxfxbqfkf = f16;
        float f35 = (f16 - f13) / f15;
        this.f158wkgbmnqykc = f35;
        float f36 = f16 / f15;
        this.f150gxszxtbevo = f36;
        float f37 = ((f13 + f16) * f35) / 2.0f;
        float f38 = (f36 * f16) / 2.0f;
        this.f148eablkybsjg = ((f14 - f37) - f38) / f16;
        this.f152lqeggnwhkg = f37;
        this.f153nufgyqmvbu = f14 - f38;
        this.f147dxjokdxxww = f14;
    }

    private float ppxfxbqfkf(float f13) {
        this.f156rgvfuqvkyq = false;
        float f14 = this.f158wkgbmnqykc;
        if (f13 <= f14) {
            float f15 = this.f151iobyxmoadg;
            return (f15 * f13) + ((((this.f159zoijcleaow - f15) * f13) * f13) / (f14 * 2.0f));
        }
        int i13 = this.f145btonecajqb;
        if (i13 == 1) {
            return this.f152lqeggnwhkg;
        }
        float f16 = f13 - f14;
        float f17 = this.f148eablkybsjg;
        if (f16 < f17) {
            float f18 = this.f152lqeggnwhkg;
            float f19 = this.f159zoijcleaow;
            return f18 + (f19 * f16) + ((((this.f155ppxfxbqfkf - f19) * f16) * f16) / (f17 * 2.0f));
        }
        if (i13 == 2) {
            return this.f153nufgyqmvbu;
        }
        float f23 = f16 - f17;
        float f24 = this.f150gxszxtbevo;
        if (f23 > f24) {
            this.f156rgvfuqvkyq = true;
            return this.f147dxjokdxxww;
        }
        float f25 = this.f153nufgyqmvbu;
        float f26 = this.f155ppxfxbqfkf;
        return (f25 + (f26 * f23)) - (((f26 * f23) * f23) / (f24 * 2.0f));
    }

    public float eablkybsjg(float f13) {
        float f14 = this.f158wkgbmnqykc;
        if (f13 <= f14) {
            float f15 = this.f151iobyxmoadg;
            return f15 + (((this.f159zoijcleaow - f15) * f13) / f14);
        }
        int i13 = this.f145btonecajqb;
        if (i13 == 1) {
            return 0.0f;
        }
        float f16 = f13 - f14;
        float f17 = this.f148eablkybsjg;
        if (f16 < f17) {
            float f18 = this.f159zoijcleaow;
            return f18 + (((this.f155ppxfxbqfkf - f18) * f16) / f17);
        }
        if (i13 == 2) {
            return 0.0f;
        }
        float f19 = f16 - f17;
        float f23 = this.f150gxszxtbevo;
        if (f19 >= f23) {
            return 0.0f;
        }
        float f24 = this.f155ppxfxbqfkf;
        return f24 - ((f19 * f24) / f23);
    }

    @Override // a1.wflxmlrfwp
    public float getInterpolation(float f13) {
        float fPpxfxbqfkf = ppxfxbqfkf(f13);
        this.f144agtfadlqog = fPpxfxbqfkf;
        this.f154ojitshcjhn = f13;
        return this.f146draadjrbmk ? this.f157wflxmlrfwp - fPpxfxbqfkf : this.f157wflxmlrfwp + fPpxfxbqfkf;
    }

    @Override // a1.wflxmlrfwp
    public float iobyxmoadg() {
        return this.f146draadjrbmk ? -eablkybsjg(this.f154ojitshcjhn) : eablkybsjg(this.f154ojitshcjhn);
    }

    public void wkgbmnqykc(float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f156rgvfuqvkyq = false;
        this.f157wflxmlrfwp = f13;
        boolean z13 = f13 > f14;
        this.f146draadjrbmk = z13;
        if (z13) {
            gxszxtbevo(-f15, f13 - f14, f17, f18, f16);
        } else {
            gxszxtbevo(f15, f14 - f13, f17, f18, f16);
        }
    }

    @Override // a1.wflxmlrfwp
    public boolean zoijcleaow() {
        return iobyxmoadg() < 1.0E-5f && Math.abs(this.f147dxjokdxxww - this.f144agtfadlqog) < 1.0E-5f;
    }
}
