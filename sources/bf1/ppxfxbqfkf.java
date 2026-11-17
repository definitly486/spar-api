package bf1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f16061eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f16062iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f16063ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f16064wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f16065zoijcleaow;

    public ppxfxbqfkf(String id2, String title, String imageUrl, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        this.f16062iobyxmoadg = id2;
        this.f16065zoijcleaow = title;
        this.f16063ppxfxbqfkf = imageUrl;
        this.f16064wkgbmnqykc = z13;
        this.f16061eablkybsjg = z14;
    }

    public final boolean eablkybsjg() {
        return this.f16064wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f16062iobyxmoadg, ppxfxbqfkfVar.f16062iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f16065zoijcleaow, ppxfxbqfkfVar.f16065zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f16063ppxfxbqfkf, ppxfxbqfkfVar.f16063ppxfxbqfkf) && this.f16064wkgbmnqykc == ppxfxbqfkfVar.f16064wkgbmnqykc && this.f16061eablkybsjg == ppxfxbqfkfVar.f16061eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f16062iobyxmoadg.hashCode() * 31) + this.f16065zoijcleaow.hashCode()) * 31) + this.f16063ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f16064wkgbmnqykc)) * 31) + Boolean.hashCode(this.f16061eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f16062iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f16065zoijcleaow;
    }

    public String toString() {
        return "StoryUiModel(id=" + this.f16062iobyxmoadg + ", title=" + this.f16065zoijcleaow + ", imageUrl=" + this.f16063ppxfxbqfkf + ", isViewed=" + this.f16064wkgbmnqykc + ", isAdult=" + this.f16061eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f16061eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f16063ppxfxbqfkf;
    }
}
