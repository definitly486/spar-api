package wh0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f119873eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f119874iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f119875ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f119876wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f119877zoijcleaow;

    public eablkybsjg(String id2, String title, String imageUrl, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        this.f119874iobyxmoadg = id2;
        this.f119877zoijcleaow = title;
        this.f119875ppxfxbqfkf = imageUrl;
        this.f119876wkgbmnqykc = z13;
        this.f119873eablkybsjg = z14;
    }

    public final boolean eablkybsjg() {
        return this.f119876wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f119874iobyxmoadg, eablkybsjgVar.f119874iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f119877zoijcleaow, eablkybsjgVar.f119877zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f119875ppxfxbqfkf, eablkybsjgVar.f119875ppxfxbqfkf) && this.f119876wkgbmnqykc == eablkybsjgVar.f119876wkgbmnqykc && this.f119873eablkybsjg == eablkybsjgVar.f119873eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f119874iobyxmoadg.hashCode() * 31) + this.f119877zoijcleaow.hashCode()) * 31) + this.f119875ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f119876wkgbmnqykc)) * 31) + Boolean.hashCode(this.f119873eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f119874iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f119877zoijcleaow;
    }

    public String toString() {
        return "StoryUiModel(id=" + this.f119874iobyxmoadg + ", title=" + this.f119877zoijcleaow + ", imageUrl=" + this.f119875ppxfxbqfkf + ", isViewed=" + this.f119876wkgbmnqykc + ", isAdult=" + this.f119873eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f119873eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f119875ppxfxbqfkf;
    }
}
