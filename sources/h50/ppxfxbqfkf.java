package h50;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f39471eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f39473iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private g.lqeggnwhkg f39474lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private g.lqeggnwhkg f39475nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private g.lqeggnwhkg f39476ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f39478zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f39477wkgbmnqykc = g.gtknphoqwx.f35588zoijcleaow.zoijcleaow();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f39472gxszxtbevo = g.eablkybsjg.f35584zoijcleaow.zoijcleaow();

    public ppxfxbqfkf(float f13, float f14) {
        this.f39473iobyxmoadg = f13;
        this.f39478zoijcleaow = dxjokdxxww(lqeggnwhkg(f14));
        g.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = g.lqeggnwhkg.f35592eablkybsjg;
        this.f39474lqeggnwhkg = iobyxmoadgVar.iobyxmoadg();
        this.f39475nufgyqmvbu = iobyxmoadgVar.iobyxmoadg();
    }

    private final float dxjokdxxww(float f13) {
        return (f13 / 180) * 3.1415927f;
    }

    private final void iobyxmoadg() {
        if (this.f39475nufgyqmvbu.ojitshcjhn()) {
            return;
        }
        g.lqeggnwhkg lqeggnwhkgVar = this.f39476ppxfxbqfkf;
        if (lqeggnwhkgVar == null) {
            lqeggnwhkgVar = this.f39475nufgyqmvbu;
        }
        this.f39474lqeggnwhkg = lqeggnwhkgVar;
        this.f39472gxszxtbevo = g.eablkybsjg.vdvldrhtss(g.eablkybsjg.eablkybsjg(this.f39475nufgyqmvbu.draadjrbmk() ^ (-9223372034707292160L)), this.f39474lqeggnwhkg.lqeggnwhkg());
        long jBtonecajqb = this.f39474lqeggnwhkg.btonecajqb();
        if (g.gtknphoqwx.nufgyqmvbu(this.f39477wkgbmnqykc, jBtonecajqb)) {
            return;
        }
        this.f39477wkgbmnqykc = jBtonecajqb;
        zoijcleaow();
    }

    private final float lqeggnwhkg(float f13) {
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("The shimmer's rotation must be a positive number");
        }
        float f14 = 90;
        return (-Math.abs((f13 % 180) - f14)) + f14;
    }

    private final void zoijcleaow() {
        float f13 = 2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f39477wkgbmnqykc >> 32)) / f13;
        double d13 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(fIntBitsToFloat, d13)) + ((float) Math.pow(Float.intBitsToFloat((int) (this.f39477wkgbmnqykc & 4294967295L)) / f13, d13)));
        this.f39471eablkybsjg = (((float) Math.cos(((float) Math.acos(fIntBitsToFloat / fSqrt)) - this.f39478zoijcleaow)) * fSqrt * f13) + this.f39473iobyxmoadg;
    }

    public final void btonecajqb(g.lqeggnwhkg lqeggnwhkgVar) {
        if (zdlpuopuiu.eablkybsjg(this.f39476ppxfxbqfkf, lqeggnwhkgVar)) {
            return;
        }
        this.f39476ppxfxbqfkf = lqeggnwhkgVar;
        iobyxmoadg();
    }

    public final float eablkybsjg() {
        return this.f39471eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ppxfxbqfkf.class == obj.getClass()) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            if (this.f39473iobyxmoadg == ppxfxbqfkfVar.f39473iobyxmoadg && this.f39478zoijcleaow == ppxfxbqfkfVar.f39478zoijcleaow) {
                return true;
            }
        }
        return false;
    }

    public final g.lqeggnwhkg gxszxtbevo() {
        return this.f39475nufgyqmvbu;
    }

    public int hashCode() {
        return (Float.hashCode(this.f39473iobyxmoadg) * 31) + Float.hashCode(this.f39478zoijcleaow);
    }

    public final void nufgyqmvbu(g.lqeggnwhkg value) {
        zdlpuopuiu.btonecajqb(value, "value");
        if (zdlpuopuiu.eablkybsjg(value, this.f39475nufgyqmvbu)) {
            return;
        }
        this.f39475nufgyqmvbu = value;
        iobyxmoadg();
    }

    public final long ppxfxbqfkf() {
        return this.f39472gxszxtbevo;
    }

    public final g.lqeggnwhkg wkgbmnqykc() {
        return this.f39474lqeggnwhkg;
    }
}
