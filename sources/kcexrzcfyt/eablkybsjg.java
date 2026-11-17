package kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg extends d.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f54675iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f54676ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f54677wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f54678zoijcleaow;

    eablkybsjg(int i13, int i14, boolean z13, boolean z14) {
        this.f54675iobyxmoadg = i13;
        this.f54678zoijcleaow = i14;
        this.f54676ppxfxbqfkf = z13;
        this.f54677wkgbmnqykc = z14;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d.zoijcleaow)) {
            return false;
        }
        d.zoijcleaow zoijcleaowVar = (d.zoijcleaow) obj;
        return this.f54675iobyxmoadg == zoijcleaowVar.iobyxmoadg() && this.f54678zoijcleaow == zoijcleaowVar.zoijcleaow() && this.f54676ppxfxbqfkf == zoijcleaowVar.ppxfxbqfkf() && this.f54677wkgbmnqykc == zoijcleaowVar.wkgbmnqykc();
    }

    public int hashCode() {
        return ((((((this.f54675iobyxmoadg ^ 1000003) * 1000003) ^ this.f54678zoijcleaow) * 1000003) ^ (this.f54676ppxfxbqfkf ? 1231 : 1237)) * 1000003) ^ (this.f54677wkgbmnqykc ? 1231 : 1237);
    }

    @Override // kcexrzcfyt.d.zoijcleaow
    int iobyxmoadg() {
        return this.f54675iobyxmoadg;
    }

    @Override // kcexrzcfyt.d.zoijcleaow
    boolean ppxfxbqfkf() {
        return this.f54676ppxfxbqfkf;
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f54675iobyxmoadg + ", requiredMaxBitDepth=" + this.f54678zoijcleaow + ", previewStabilizationOn=" + this.f54676ppxfxbqfkf + ", ultraHdrOn=" + this.f54677wkgbmnqykc + "}";
    }

    @Override // kcexrzcfyt.d.zoijcleaow
    boolean wkgbmnqykc() {
        return this.f54677wkgbmnqykc;
    }

    @Override // kcexrzcfyt.d.zoijcleaow
    int zoijcleaow() {
        return this.f54678zoijcleaow;
    }
}
