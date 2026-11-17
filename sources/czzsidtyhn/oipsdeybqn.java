package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
final class oipsdeybqn implements lxfrhoxuzk {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ydmasvzmpa f26434zoijcleaow;

    public oipsdeybqn(ydmasvzmpa ydmasvzmpaVar) {
        this.f26434zoijcleaow = ydmasvzmpaVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oipsdeybqn) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((oipsdeybqn) obj).f26434zoijcleaow, this.f26434zoijcleaow);
        }
        return false;
    }

    public int hashCode() {
        return this.f26434zoijcleaow.hashCode();
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return wkgbmnqykcVar.hszhottldk(this.f26434zoijcleaow.ppxfxbqfkf(zdlpuopuiuVar));
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return wkgbmnqykcVar.hszhottldk(this.f26434zoijcleaow.zoijcleaow(zdlpuopuiuVar));
    }

    public String toString() {
        w0.zdlpuopuiu zdlpuopuiuVar = w0.zdlpuopuiu.Ltr;
        return "PaddingValues(" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26434zoijcleaow.ppxfxbqfkf(zdlpuopuiuVar))) + ", " + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26434zoijcleaow.wkgbmnqykc())) + ", " + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26434zoijcleaow.zoijcleaow(zdlpuopuiuVar))) + ", " + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f26434zoijcleaow.iobyxmoadg())) + ')';
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int wkgbmnqykc(w0.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.hszhottldk(this.f26434zoijcleaow.wkgbmnqykc());
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.hszhottldk(this.f26434zoijcleaow.iobyxmoadg());
    }
}
