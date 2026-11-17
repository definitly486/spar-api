package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
final class jyumaefscl implements lxfrhoxuzk {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lxfrhoxuzk f26407ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lxfrhoxuzk f26408zoijcleaow;

    public jyumaefscl(lxfrhoxuzk lxfrhoxuzkVar, lxfrhoxuzk lxfrhoxuzkVar2) {
        this.f26408zoijcleaow = lxfrhoxuzkVar;
        this.f26407ppxfxbqfkf = lxfrhoxuzkVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyumaefscl)) {
            return false;
        }
        jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jyumaefsclVar.f26408zoijcleaow, this.f26408zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jyumaefsclVar.f26407ppxfxbqfkf, this.f26407ppxfxbqfkf);
    }

    public int hashCode() {
        return (this.f26408zoijcleaow.hashCode() * 31) + this.f26407ppxfxbqfkf.hashCode();
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return zg.gtknphoqwx.gxszxtbevo(this.f26408zoijcleaow.iobyxmoadg(wkgbmnqykcVar, zdlpuopuiuVar) - this.f26407ppxfxbqfkf.iobyxmoadg(wkgbmnqykcVar, zdlpuopuiuVar), 0);
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return zg.gtknphoqwx.gxszxtbevo(this.f26408zoijcleaow.ppxfxbqfkf(wkgbmnqykcVar, zdlpuopuiuVar) - this.f26407ppxfxbqfkf.ppxfxbqfkf(wkgbmnqykcVar, zdlpuopuiuVar), 0);
    }

    public String toString() {
        return '(' + this.f26408zoijcleaow + " - " + this.f26407ppxfxbqfkf + ')';
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int wkgbmnqykc(w0.wkgbmnqykc wkgbmnqykcVar) {
        return zg.gtknphoqwx.gxszxtbevo(this.f26408zoijcleaow.wkgbmnqykc(wkgbmnqykcVar) - this.f26407ppxfxbqfkf.wkgbmnqykc(wkgbmnqykcVar), 0);
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar) {
        return zg.gtknphoqwx.gxszxtbevo(this.f26408zoijcleaow.zoijcleaow(wkgbmnqykcVar) - this.f26407ppxfxbqfkf.zoijcleaow(wkgbmnqykcVar), 0);
    }
}
