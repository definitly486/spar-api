package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
final class cqumvgiudr implements lxfrhoxuzk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f26269eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f26270ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f26271wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f26272zoijcleaow;

    public cqumvgiudr(int i13, int i14, int i15, int i16) {
        this.f26272zoijcleaow = i13;
        this.f26270ppxfxbqfkf = i14;
        this.f26271wkgbmnqykc = i15;
        this.f26269eablkybsjg = i16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqumvgiudr)) {
            return false;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) obj;
        return this.f26272zoijcleaow == cqumvgiudrVar.f26272zoijcleaow && this.f26270ppxfxbqfkf == cqumvgiudrVar.f26270ppxfxbqfkf && this.f26271wkgbmnqykc == cqumvgiudrVar.f26271wkgbmnqykc && this.f26269eablkybsjg == cqumvgiudrVar.f26269eablkybsjg;
    }

    public int hashCode() {
        return (((((this.f26272zoijcleaow * 31) + this.f26270ppxfxbqfkf) * 31) + this.f26271wkgbmnqykc) * 31) + this.f26269eablkybsjg;
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return this.f26272zoijcleaow;
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar) {
        return this.f26271wkgbmnqykc;
    }

    public String toString() {
        return "Insets(left=" + this.f26272zoijcleaow + ", top=" + this.f26270ppxfxbqfkf + ", right=" + this.f26271wkgbmnqykc + ", bottom=" + this.f26269eablkybsjg + ')';
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int wkgbmnqykc(w0.wkgbmnqykc wkgbmnqykcVar) {
        return this.f26270ppxfxbqfkf;
    }

    @Override // czzsidtyhn.lxfrhoxuzk
    public int zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar) {
        return this.f26269eablkybsjg;
    }
}
