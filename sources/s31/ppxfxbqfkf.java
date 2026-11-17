package s31;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f105388eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f105390iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private g.lqeggnwhkg f105391lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private g.lqeggnwhkg f105392nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private g.lqeggnwhkg f105393ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f105395zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f105394wkgbmnqykc = g.gtknphoqwx.f35588zoijcleaow.zoijcleaow();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f105389gxszxtbevo = g.eablkybsjg.f35584zoijcleaow.zoijcleaow();

    public ppxfxbqfkf(float f13, float f14) {
        this.f105390iobyxmoadg = f13;
        this.f105395zoijcleaow = dxjokdxxww(lqeggnwhkg(f14));
        g.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = g.lqeggnwhkg.f35592eablkybsjg;
        this.f105391lqeggnwhkg = iobyxmoadgVar.iobyxmoadg();
        this.f105392nufgyqmvbu = iobyxmoadgVar.iobyxmoadg();
    }

    private final float dxjokdxxww(float f13) {
        return (f13 / 180) * 3.1415927f;
    }

    private final void iobyxmoadg() {
        if (this.f105392nufgyqmvbu.ojitshcjhn()) {
            return;
        }
        g.lqeggnwhkg lqeggnwhkgVar = this.f105393ppxfxbqfkf;
        if (lqeggnwhkgVar == null) {
            lqeggnwhkgVar = this.f105392nufgyqmvbu;
        }
        this.f105391lqeggnwhkg = lqeggnwhkgVar;
        this.f105389gxszxtbevo = g.eablkybsjg.vdvldrhtss(g.eablkybsjg.eablkybsjg(this.f105392nufgyqmvbu.draadjrbmk() ^ (-9223372034707292160L)), this.f105391lqeggnwhkg.lqeggnwhkg());
        long jBtonecajqb = this.f105391lqeggnwhkg.btonecajqb();
        if (g.gtknphoqwx.nufgyqmvbu(this.f105394wkgbmnqykc, jBtonecajqb)) {
            return;
        }
        this.f105394wkgbmnqykc = jBtonecajqb;
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
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f105394wkgbmnqykc >> 32)) / f13;
        double d13 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(fIntBitsToFloat, d13)) + ((float) Math.pow(Float.intBitsToFloat((int) (this.f105394wkgbmnqykc & 4294967295L)) / f13, d13)));
        this.f105388eablkybsjg = (((float) Math.cos(((float) Math.acos(fIntBitsToFloat / fSqrt)) - this.f105395zoijcleaow)) * fSqrt * f13) + this.f105390iobyxmoadg;
    }

    public final void btonecajqb(g.lqeggnwhkg lqeggnwhkgVar) {
        if (zdlpuopuiu.eablkybsjg(this.f105393ppxfxbqfkf, lqeggnwhkgVar)) {
            return;
        }
        this.f105393ppxfxbqfkf = lqeggnwhkgVar;
        iobyxmoadg();
    }

    public final float eablkybsjg() {
        return this.f105388eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ppxfxbqfkf.class == obj.getClass()) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            if (this.f105390iobyxmoadg == ppxfxbqfkfVar.f105390iobyxmoadg && this.f105395zoijcleaow == ppxfxbqfkfVar.f105395zoijcleaow) {
                return true;
            }
        }
        return false;
    }

    public final g.lqeggnwhkg gxszxtbevo() {
        return this.f105392nufgyqmvbu;
    }

    public int hashCode() {
        return (Float.hashCode(this.f105390iobyxmoadg) * 31) + Float.hashCode(this.f105395zoijcleaow);
    }

    public final void nufgyqmvbu(g.lqeggnwhkg value) {
        zdlpuopuiu.btonecajqb(value, "value");
        if (zdlpuopuiu.eablkybsjg(value, this.f105392nufgyqmvbu)) {
            return;
        }
        this.f105392nufgyqmvbu = value;
        iobyxmoadg();
    }

    public final long ppxfxbqfkf() {
        return this.f105389gxszxtbevo;
    }

    public final g.lqeggnwhkg wkgbmnqykc() {
        return this.f105391lqeggnwhkg;
    }
}
