package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
final class jlmebxxoox implements ydmasvzmpa {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lxfrhoxuzk f26394iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w0.wkgbmnqykc f26395zoijcleaow;

    public jlmebxxoox(lxfrhoxuzk lxfrhoxuzkVar, w0.wkgbmnqykc wkgbmnqykcVar) {
        this.f26394iobyxmoadg = lxfrhoxuzkVar;
        this.f26395zoijcleaow = wkgbmnqykcVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlmebxxoox)) {
            return false;
        }
        jlmebxxoox jlmebxxooxVar = (jlmebxxoox) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f26394iobyxmoadg, jlmebxxooxVar.f26394iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f26395zoijcleaow, jlmebxxooxVar.f26395zoijcleaow);
    }

    public int hashCode() {
        return (this.f26394iobyxmoadg.hashCode() * 31) + this.f26395zoijcleaow.hashCode();
    }

    @Override // czzsidtyhn.ydmasvzmpa
    public float iobyxmoadg() {
        w0.wkgbmnqykc wkgbmnqykcVar = this.f26395zoijcleaow;
        return wkgbmnqykcVar.x(this.f26394iobyxmoadg.zoijcleaow(wkgbmnqykcVar));
    }

    @Override // czzsidtyhn.ydmasvzmpa
    public float ppxfxbqfkf(w0.zdlpuopuiu zdlpuopuiuVar) {
        w0.wkgbmnqykc wkgbmnqykcVar = this.f26395zoijcleaow;
        return wkgbmnqykcVar.x(this.f26394iobyxmoadg.iobyxmoadg(wkgbmnqykcVar, zdlpuopuiuVar));
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f26394iobyxmoadg + ", density=" + this.f26395zoijcleaow + ')';
    }

    @Override // czzsidtyhn.ydmasvzmpa
    public float wkgbmnqykc() {
        w0.wkgbmnqykc wkgbmnqykcVar = this.f26395zoijcleaow;
        return wkgbmnqykcVar.x(this.f26394iobyxmoadg.wkgbmnqykc(wkgbmnqykcVar));
    }

    @Override // czzsidtyhn.ydmasvzmpa
    public float zoijcleaow(w0.zdlpuopuiu zdlpuopuiuVar) {
        w0.wkgbmnqykc wkgbmnqykcVar = this.f26395zoijcleaow;
        return wkgbmnqykcVar.x(this.f26394iobyxmoadg.ppxfxbqfkf(wkgbmnqykcVar, zdlpuopuiuVar));
    }
}
