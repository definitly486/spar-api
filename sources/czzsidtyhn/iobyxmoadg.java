package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg implements lxfrhoxuzk {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lxfrhoxuzk f26369ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lxfrhoxuzk f26370zoijcleaow;

    public iobyxmoadg(lxfrhoxuzk lxfrhoxuzkVar, lxfrhoxuzk lxfrhoxuzkVar2) {
        this.f26370zoijcleaow = lxfrhoxuzkVar;
        this.f26369ppxfxbqfkf = lxfrhoxuzkVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.f26370zoijcleaow, this.f26370zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.f26369ppxfxbqfkf, this.f26369ppxfxbqfkf);
    }

    public int hashCode() {
        return this.f26370zoijcleaow.hashCode() + (this.f26369ppxfxbqfkf.hashCode() * 31);
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return this.f26370zoijcleaow.iobyxmoadg(wkgbmnqykcVar, zdlpuopuiuVar) + this.f26369ppxfxbqfkf.iobyxmoadg(wkgbmnqykcVar, zdlpuopuiuVar);
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return this.f26370zoijcleaow.ppxfxbqfkf(wkgbmnqykcVar, zdlpuopuiuVar) + this.f26369ppxfxbqfkf.ppxfxbqfkf(wkgbmnqykcVar, zdlpuopuiuVar);
    }

    public String toString() {
        return '(' + this.f26370zoijcleaow + " + " + this.f26369ppxfxbqfkf + ')';
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int wkgbmnqykc(w0.wkgbmnqykc wkgbmnqykcVar) {
        return this.f26370zoijcleaow.wkgbmnqykc(wkgbmnqykcVar) + this.f26369ppxfxbqfkf.wkgbmnqykc(wkgbmnqykcVar);
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar) {
        return this.f26370zoijcleaow.zoijcleaow(wkgbmnqykcVar) + this.f26369ppxfxbqfkf.zoijcleaow(wkgbmnqykcVar);
    }
}
