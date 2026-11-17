package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
final class dvvnrvtcbc implements lxfrhoxuzk {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lxfrhoxuzk f26281ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lxfrhoxuzk f26282zoijcleaow;

    public dvvnrvtcbc(lxfrhoxuzk lxfrhoxuzkVar, lxfrhoxuzk lxfrhoxuzkVar2) {
        this.f26282zoijcleaow = lxfrhoxuzkVar;
        this.f26281ppxfxbqfkf = lxfrhoxuzkVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvvnrvtcbc)) {
            return false;
        }
        dvvnrvtcbc dvvnrvtcbcVar = (dvvnrvtcbc) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dvvnrvtcbcVar.f26282zoijcleaow, this.f26282zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dvvnrvtcbcVar.f26281ppxfxbqfkf, this.f26281ppxfxbqfkf);
    }

    public int hashCode() {
        return this.f26282zoijcleaow.hashCode() + (this.f26281ppxfxbqfkf.hashCode() * 31);
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return Math.max(this.f26282zoijcleaow.iobyxmoadg(wkgbmnqykcVar, zdlpuopuiuVar), this.f26281ppxfxbqfkf.iobyxmoadg(wkgbmnqykcVar, zdlpuopuiuVar));
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return Math.max(this.f26282zoijcleaow.ppxfxbqfkf(wkgbmnqykcVar, zdlpuopuiuVar), this.f26281ppxfxbqfkf.ppxfxbqfkf(wkgbmnqykcVar, zdlpuopuiuVar));
    }

    public String toString() {
        return '(' + this.f26282zoijcleaow + " ∪ " + this.f26281ppxfxbqfkf + ')';
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int wkgbmnqykc(w0.wkgbmnqykc wkgbmnqykcVar) {
        return Math.max(this.f26282zoijcleaow.wkgbmnqykc(wkgbmnqykcVar), this.f26281ppxfxbqfkf.wkgbmnqykc(wkgbmnqykcVar));
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar) {
        return Math.max(this.f26282zoijcleaow.zoijcleaow(wkgbmnqykcVar), this.f26281ppxfxbqfkf.zoijcleaow(wkgbmnqykcVar));
    }
}
