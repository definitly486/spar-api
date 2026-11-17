package g;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f35598iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f35599ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float f35600wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private float f35601zoijcleaow;

    public ppxfxbqfkf(float f13, float f14, float f15, float f16) {
        this.f35598iobyxmoadg = f13;
        this.f35601zoijcleaow = f14;
        this.f35599ppxfxbqfkf = f15;
        this.f35600wkgbmnqykc = f16;
    }

    public final void btonecajqb(float f13) {
        this.f35599ppxfxbqfkf = f13;
    }

    public final void draadjrbmk(float f13, float f14) {
        this.f35598iobyxmoadg += f13;
        this.f35601zoijcleaow += f14;
        this.f35599ppxfxbqfkf += f13;
        this.f35600wkgbmnqykc += f14;
    }

    public final void dxjokdxxww(float f13) {
        this.f35598iobyxmoadg = f13;
    }

    public final void eablkybsjg(float f13, float f14, float f15, float f16) {
        this.f35598iobyxmoadg = Math.max(f13, this.f35598iobyxmoadg);
        this.f35601zoijcleaow = Math.max(f14, this.f35601zoijcleaow);
        this.f35599ppxfxbqfkf = Math.min(f15, this.f35599ppxfxbqfkf);
        this.f35600wkgbmnqykc = Math.min(f16, this.f35600wkgbmnqykc);
    }

    public final void gtknphoqwx(float f13) {
        this.f35601zoijcleaow = f13;
    }

    public final boolean gxszxtbevo() {
        return (this.f35598iobyxmoadg >= this.f35599ppxfxbqfkf) | (this.f35601zoijcleaow >= this.f35600wkgbmnqykc);
    }

    public final float iobyxmoadg() {
        return this.f35600wkgbmnqykc;
    }

    public final void lqeggnwhkg(float f13, float f14, float f15, float f16) {
        this.f35598iobyxmoadg = f13;
        this.f35601zoijcleaow = f14;
        this.f35599ppxfxbqfkf = f15;
        this.f35600wkgbmnqykc = f16;
    }

    public final void nufgyqmvbu(float f13) {
        this.f35600wkgbmnqykc = f13;
    }

    public final float ppxfxbqfkf() {
        return this.f35599ppxfxbqfkf;
    }

    public String toString() {
        return "MutableRect(" + zoijcleaow.iobyxmoadg(this.f35598iobyxmoadg, 1) + ", " + zoijcleaow.iobyxmoadg(this.f35601zoijcleaow, 1) + ", " + zoijcleaow.iobyxmoadg(this.f35599ppxfxbqfkf, 1) + ", " + zoijcleaow.iobyxmoadg(this.f35600wkgbmnqykc, 1) + ')';
    }

    public final void wflxmlrfwp(long j13) {
        draadjrbmk(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
    }

    public final float wkgbmnqykc() {
        return this.f35601zoijcleaow;
    }

    public final float zoijcleaow() {
        return this.f35598iobyxmoadg;
    }
}
