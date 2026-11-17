package pr;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f77166eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f77167iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f77168ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final f40.zoijcleaow f77169wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f77170zoijcleaow;

    public iobyxmoadg(String id2, String title, String image, f40.zoijcleaow navlink, String reference) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.f77167iobyxmoadg = id2;
        this.f77170zoijcleaow = title;
        this.f77168ppxfxbqfkf = image;
        this.f77169wkgbmnqykc = navlink;
        this.f77166eablkybsjg = reference;
    }

    public final String eablkybsjg() {
        return this.f77170zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f77167iobyxmoadg, iobyxmoadgVar.f77167iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f77170zoijcleaow, iobyxmoadgVar.f77170zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f77168ppxfxbqfkf, iobyxmoadgVar.f77168ppxfxbqfkf) && this.f77169wkgbmnqykc == iobyxmoadgVar.f77169wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f77166eablkybsjg, iobyxmoadgVar.f77166eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f77167iobyxmoadg.hashCode() * 31) + this.f77170zoijcleaow.hashCode()) * 31) + this.f77168ppxfxbqfkf.hashCode()) * 31) + this.f77169wkgbmnqykc.hashCode()) * 31) + this.f77166eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f77167iobyxmoadg;
    }

    public final f40.zoijcleaow ppxfxbqfkf() {
        return this.f77169wkgbmnqykc;
    }

    public String toString() {
        return "SearchFeatureUiModel(id=" + this.f77167iobyxmoadg + ", title=" + this.f77170zoijcleaow + ", image=" + this.f77168ppxfxbqfkf + ", navlink=" + this.f77169wkgbmnqykc + ", reference=" + this.f77166eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f77166eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f77168ppxfxbqfkf;
    }
}
