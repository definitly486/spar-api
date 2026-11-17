package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
final class iwizpuwonk implements lxfrhoxuzk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f26384eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f26385ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f26386wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f26387zoijcleaow;

    public /* synthetic */ iwizpuwonk(float f13, float f14, float f15, float f16, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, f15, f16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwizpuwonk)) {
            return false;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        return w0.nufgyqmvbu.dxjokdxxww(this.f26387zoijcleaow, iwizpuwonkVar.f26387zoijcleaow) && w0.nufgyqmvbu.dxjokdxxww(this.f26385ppxfxbqfkf, iwizpuwonkVar.f26385ppxfxbqfkf) && w0.nufgyqmvbu.dxjokdxxww(this.f26386wkgbmnqykc, iwizpuwonkVar.f26386wkgbmnqykc) && w0.nufgyqmvbu.dxjokdxxww(this.f26384eablkybsjg, iwizpuwonkVar.f26384eablkybsjg);
    }

    public int hashCode() {
        return (((((w0.nufgyqmvbu.btonecajqb(this.f26387zoijcleaow) * 31) + w0.nufgyqmvbu.btonecajqb(this.f26385ppxfxbqfkf)) * 31) + w0.nufgyqmvbu.btonecajqb(this.f26386wkgbmnqykc)) * 31) + w0.nufgyqmvbu.btonecajqb(this.f26384eablkybsjg);
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return wkgbmnqykcVar.hszhottldk(this.f26387zoijcleaow);
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return wkgbmnqykcVar.hszhottldk(this.f26386wkgbmnqykc);
    }

    public String toString() {
        return "Insets(left=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26387zoijcleaow)) + ", top=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26385ppxfxbqfkf)) + ", right=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26386wkgbmnqykc)) + ", bottom=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26384eablkybsjg)) + ')';
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int wkgbmnqykc(w0.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.hszhottldk(this.f26385ppxfxbqfkf);
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.hszhottldk(this.f26384eablkybsjg);
    }

    private iwizpuwonk(float f13, float f14, float f15, float f16) {
        this.f26387zoijcleaow = f13;
        this.f26385ppxfxbqfkf = f14;
        this.f26386wkgbmnqykc = f15;
        this.f26384eablkybsjg = f16;
    }
}
