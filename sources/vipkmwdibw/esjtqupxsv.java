package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class esjtqupxsv implements yadqdtsiqt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f117081eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final float f117082gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f117083iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f117084ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f117085wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f117086zoijcleaow;

    public esjtqupxsv(float f13, float f14, float f15, float f16) {
        this.f117083iobyxmoadg = f13;
        this.f117086zoijcleaow = f14;
        this.f117084ppxfxbqfkf = f15;
        this.f117085wkgbmnqykc = f16;
        if (!((Float.isNaN(f13) || Float.isNaN(f14) || Float.isNaN(f15) || Float.isNaN(f16)) ? false : true)) {
            ikoacuggdj.iobyxmoadg("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f13 + ", " + f14 + ", " + f15 + ", " + f16 + '.');
        }
        long jZoijcleaow = h.jlmebxxoox.zoijcleaow(0.0f, f14, f16, 1.0f, new float[5], 0);
        this.f117081eablkybsjg = Float.intBitsToFloat((int) (jZoijcleaow >> 32));
        this.f117082gxszxtbevo = Float.intBitsToFloat((int) (jZoijcleaow & 4294967295L));
    }

    private final void zoijcleaow(float f13) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f117083iobyxmoadg + ", " + this.f117086zoijcleaow + ", " + this.f117084ppxfxbqfkf + ", " + this.f117085wkgbmnqykc + ") has no solution at " + f13);
    }

    public boolean equals(Object obj) {
        if (obj instanceof esjtqupxsv) {
            esjtqupxsv esjtqupxsvVar = (esjtqupxsv) obj;
            if (this.f117083iobyxmoadg == esjtqupxsvVar.f117083iobyxmoadg && this.f117086zoijcleaow == esjtqupxsvVar.f117086zoijcleaow && this.f117084ppxfxbqfkf == esjtqupxsvVar.f117084ppxfxbqfkf && this.f117085wkgbmnqykc == esjtqupxsvVar.f117085wkgbmnqykc) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f117083iobyxmoadg) * 31) + Float.hashCode(this.f117086zoijcleaow)) * 31) + Float.hashCode(this.f117084ppxfxbqfkf)) * 31) + Float.hashCode(this.f117085wkgbmnqykc);
    }

    @Override // vipkmwdibw.yadqdtsiqt
    public float iobyxmoadg(float f13) {
        if (f13 <= 0.0f || f13 >= 1.0f) {
            return f13;
        }
        float fMax = Math.max(f13, 1.1920929E-7f);
        float fEablkybsjg = h.jlmebxxoox.eablkybsjg(0.0f - fMax, this.f117083iobyxmoadg - fMax, this.f117084ppxfxbqfkf - fMax, 1.0f - fMax);
        if (Float.isNaN(fEablkybsjg)) {
            zoijcleaow(f13);
        }
        float fPpxfxbqfkf = h.jlmebxxoox.ppxfxbqfkf(this.f117086zoijcleaow, this.f117085wkgbmnqykc, fEablkybsjg);
        float f14 = this.f117081eablkybsjg;
        float f15 = this.f117082gxszxtbevo;
        if (fPpxfxbqfkf < f14) {
            fPpxfxbqfkf = f14;
        }
        return fPpxfxbqfkf > f15 ? f15 : fPpxfxbqfkf;
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f117083iobyxmoadg + ", b=" + this.f117086zoijcleaow + ", c=" + this.f117084ppxfxbqfkf + ", d=" + this.f117085wkgbmnqykc + ')';
    }
}
