package m62;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f66273eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f66274iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f66275ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f66276wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f66277zoijcleaow;

    public iobyxmoadg(String title, String colorButton, String colorText, String navLink, String reference) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(colorButton, "colorButton");
        zdlpuopuiu.btonecajqb(colorText, "colorText");
        zdlpuopuiu.btonecajqb(navLink, "navLink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.f66274iobyxmoadg = title;
        this.f66277zoijcleaow = colorButton;
        this.f66275ppxfxbqfkf = colorText;
        this.f66276wkgbmnqykc = navLink;
        this.f66273eablkybsjg = reference;
    }

    public final String eablkybsjg() {
        return this.f66274iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f66274iobyxmoadg, iobyxmoadgVar.f66274iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66277zoijcleaow, iobyxmoadgVar.f66277zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f66275ppxfxbqfkf, iobyxmoadgVar.f66275ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f66276wkgbmnqykc, iobyxmoadgVar.f66276wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f66273eablkybsjg, iobyxmoadgVar.f66273eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f66274iobyxmoadg.hashCode() * 31) + this.f66277zoijcleaow.hashCode()) * 31) + this.f66275ppxfxbqfkf.hashCode()) * 31) + this.f66276wkgbmnqykc.hashCode()) * 31) + this.f66273eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f66277zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f66276wkgbmnqykc;
    }

    public String toString() {
        return "PopupButtonSpecialBannerUiModel(title=" + this.f66274iobyxmoadg + ", colorButton=" + this.f66277zoijcleaow + ", colorText=" + this.f66275ppxfxbqfkf + ", navLink=" + this.f66276wkgbmnqykc + ", reference=" + this.f66273eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f66273eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f66275ppxfxbqfkf;
    }
}
