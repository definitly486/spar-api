package sflfametgt;

/* JADX INFO: loaded from: classes.dex */
final class oxmwwwfdhm implements jztzpxfvev.eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jztzpxfvev.eablkybsjg f106316ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ikoacuggdj f106317zoijcleaow;

    public oxmwwwfdhm(ikoacuggdj ikoacuggdjVar, jztzpxfvev.eablkybsjg eablkybsjgVar) {
        this.f106317zoijcleaow = ikoacuggdjVar;
        this.f106316ppxfxbqfkf = eablkybsjgVar;
    }

    private final float ppxfxbqfkf(float f13) {
        float fZynmafqrjb = this.f106317zoijcleaow.zynmafqrjb() * (-1);
        while (f13 > 0.0f && fZynmafqrjb < f13) {
            fZynmafqrjb += this.f106317zoijcleaow.jpowsppfya();
        }
        while (f13 < 0.0f && fZynmafqrjb > f13) {
            fZynmafqrjb -= this.f106317zoijcleaow.jpowsppfya();
        }
        return fZynmafqrjb;
    }

    @Override // jztzpxfvev.eablkybsjg
    public float iobyxmoadg(float f13, float f14, float f15) {
        float fIobyxmoadg = this.f106316ppxfxbqfkf.iobyxmoadg(f13, f14, f15);
        boolean z13 = false;
        if (f13 <= 0.0f ? f13 + f14 <= 0.0f : f13 + f14 > f15) {
            z13 = true;
        }
        if (Math.abs(fIobyxmoadg) != 0.0f && z13) {
            return ppxfxbqfkf(fIobyxmoadg);
        }
        if (Math.abs(this.f106317zoijcleaow.zynmafqrjb()) < 1.0E-6d) {
            return 0.0f;
        }
        float fZynmafqrjb = this.f106317zoijcleaow.zynmafqrjb() * (-1.0f);
        if (this.f106317zoijcleaow.cdpycssgdh()) {
            fZynmafqrjb += this.f106317zoijcleaow.jpowsppfya();
        }
        return zg.gtknphoqwx.wflxmlrfwp(fZynmafqrjb, -f15, f15);
    }
}
