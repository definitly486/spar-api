package i1;

/* JADX INFO: loaded from: classes.dex */
final class draadjrbmk {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    static final draadjrbmk f41632gtknphoqwx = gtknphoqwx(zoijcleaow.f41684ppxfxbqfkf, (float) ((((double) zoijcleaow.nufgyqmvbu(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final float f41633btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final float f41634dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f41635eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final float f41636gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f41637iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final float[] f41638lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final float f41639nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f41640ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f41641wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f41642zoijcleaow;

    private draadjrbmk(float f13, float f14, float f15, float f16, float f17, float f18, float[] fArr, float f19, float f23, float f24) {
        this.f41636gxszxtbevo = f13;
        this.f41637iobyxmoadg = f14;
        this.f41642zoijcleaow = f15;
        this.f41640ppxfxbqfkf = f16;
        this.f41641wkgbmnqykc = f17;
        this.f41635eablkybsjg = f18;
        this.f41638lqeggnwhkg = fArr;
        this.f41639nufgyqmvbu = f19;
        this.f41634dxjokdxxww = f23;
        this.f41633btonecajqb = f24;
    }

    static draadjrbmk gtknphoqwx(float[] fArr, float f13, float f14, float f15, boolean z13) {
        float[][] fArr2 = zoijcleaow.f41683iobyxmoadg;
        float f16 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f17 = fArr3[0] * f16;
        float f18 = fArr[1];
        float f19 = f17 + (fArr3[1] * f18);
        float f23 = fArr[2];
        float f24 = f19 + (fArr3[2] * f23);
        float[] fArr4 = fArr2[1];
        float f25 = (fArr4[0] * f16) + (fArr4[1] * f18) + (fArr4[2] * f23);
        float[] fArr5 = fArr2[2];
        float f26 = (f16 * fArr5[0]) + (f18 * fArr5[1]) + (f23 * fArr5[2]);
        float f27 = (f15 / 10.0f) + 0.8f;
        float fWkgbmnqykc = ((double) f27) >= 0.9d ? zoijcleaow.wkgbmnqykc(0.59f, 0.69f, (f27 - 0.9f) * 10.0f) : zoijcleaow.wkgbmnqykc(0.525f, 0.59f, (f27 - 0.8f) * 10.0f);
        float fExp = z13 ? 1.0f : (1.0f - (((float) Math.exp(((-f13) - 42.0f) / 92.0f)) * 0.2777778f)) * f27;
        double d13 = fExp;
        if (d13 > 1.0d) {
            fExp = 1.0f;
        } else if (d13 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f24) * fExp) + 1.0f) - fExp, (((100.0f / f25) * fExp) + 1.0f) - fExp, (((100.0f / f26) * fExp) + 1.0f) - fExp};
        float f28 = 1.0f / ((5.0f * f13) + 1.0f);
        float f29 = f28 * f28 * f28 * f28;
        float f33 = 1.0f - f29;
        float fCbrt = (f29 * f13) + (0.1f * f33 * f33 * ((float) Math.cbrt(((double) f13) * 5.0d)));
        float fNufgyqmvbu = zoijcleaow.nufgyqmvbu(f14) / fArr[1];
        double d14 = fNufgyqmvbu;
        float fSqrt = ((float) Math.sqrt(d14)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d14, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f24)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f25)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f26)) / 100.0d, 0.42d)};
        float f34 = fArr7[0];
        float f35 = (f34 * 400.0f) / (f34 + 27.13f);
        float f36 = fArr7[1];
        float f37 = (f36 * 400.0f) / (f36 + 27.13f);
        float f38 = fArr7[2];
        float[] fArr8 = {f35, f37, (400.0f * f38) / (f38 + 27.13f)};
        return new draadjrbmk(fNufgyqmvbu, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fWkgbmnqykc, f27, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float btonecajqb() {
        return this.f41633btonecajqb;
    }

    float[] dxjokdxxww() {
        return this.f41638lqeggnwhkg;
    }

    float eablkybsjg() {
        return this.f41636gxszxtbevo;
    }

    float gxszxtbevo() {
        return this.f41642zoijcleaow;
    }

    float iobyxmoadg() {
        return this.f41637iobyxmoadg;
    }

    float lqeggnwhkg() {
        return this.f41635eablkybsjg;
    }

    float nufgyqmvbu() {
        return this.f41640ppxfxbqfkf;
    }

    float ppxfxbqfkf() {
        return this.f41639nufgyqmvbu;
    }

    float wkgbmnqykc() {
        return this.f41634dxjokdxxww;
    }

    float zoijcleaow() {
        return this.f41641wkgbmnqykc;
    }
}
