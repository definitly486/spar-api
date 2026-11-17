package istkbnxepw;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc extends ribwqtqdhb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jlmebxxoox f49435iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jlmebxxoox f49436ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jlmebxxoox f49437wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jlmebxxoox f49438zoijcleaow;

    wkgbmnqykc(jlmebxxoox jlmebxxooxVar, jlmebxxoox jlmebxxooxVar2, jlmebxxoox jlmebxxooxVar3, jlmebxxoox jlmebxxooxVar4) {
        if (jlmebxxooxVar == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.f49435iobyxmoadg = jlmebxxooxVar;
        if (jlmebxxooxVar2 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.f49438zoijcleaow = jlmebxxooxVar2;
        this.f49436ppxfxbqfkf = jlmebxxooxVar3;
        this.f49437wkgbmnqykc = jlmebxxooxVar4;
    }

    @Override // istkbnxepw.ribwqtqdhb
    public jlmebxxoox eablkybsjg() {
        return this.f49435iobyxmoadg;
    }

    public boolean equals(Object obj) {
        jlmebxxoox jlmebxxooxVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ribwqtqdhb)) {
            return false;
        }
        ribwqtqdhb ribwqtqdhbVar = (ribwqtqdhb) obj;
        if (this.f49435iobyxmoadg.equals(ribwqtqdhbVar.eablkybsjg()) && this.f49438zoijcleaow.equals(ribwqtqdhbVar.ppxfxbqfkf()) && ((jlmebxxooxVar = this.f49436ppxfxbqfkf) != null ? jlmebxxooxVar.equals(ribwqtqdhbVar.zoijcleaow()) : ribwqtqdhbVar.zoijcleaow() == null)) {
            jlmebxxoox jlmebxxooxVar2 = this.f49437wkgbmnqykc;
            if (jlmebxxooxVar2 == null) {
                if (ribwqtqdhbVar.wkgbmnqykc() == null) {
                    return true;
                }
            } else if (jlmebxxooxVar2.equals(ribwqtqdhbVar.wkgbmnqykc())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f49435iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f49438zoijcleaow.hashCode()) * 1000003;
        jlmebxxoox jlmebxxooxVar = this.f49436ppxfxbqfkf;
        int iHashCode2 = (iHashCode ^ (jlmebxxooxVar == null ? 0 : jlmebxxooxVar.hashCode())) * 1000003;
        jlmebxxoox jlmebxxooxVar2 = this.f49437wkgbmnqykc;
        return iHashCode2 ^ (jlmebxxooxVar2 != null ? jlmebxxooxVar2.hashCode() : 0);
    }

    @Override // istkbnxepw.ribwqtqdhb
    public jlmebxxoox ppxfxbqfkf() {
        return this.f49438zoijcleaow;
    }

    public String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f49435iobyxmoadg + ", imageCaptureOutputSurface=" + this.f49438zoijcleaow + ", imageAnalysisOutputSurface=" + this.f49436ppxfxbqfkf + ", postviewOutputSurface=" + this.f49437wkgbmnqykc + "}";
    }

    @Override // istkbnxepw.ribwqtqdhb
    public jlmebxxoox wkgbmnqykc() {
        return this.f49437wkgbmnqykc;
    }

    @Override // istkbnxepw.ribwqtqdhb
    public jlmebxxoox zoijcleaow() {
        return this.f49436ppxfxbqfkf;
    }
}
