package fs1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f34965eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f34966iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f34967ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f34968wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f34969zoijcleaow;

    public iobyxmoadg(String title, String colorButton, String colorText, String navLink, String reference) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(colorButton, "colorButton");
        zdlpuopuiu.btonecajqb(colorText, "colorText");
        zdlpuopuiu.btonecajqb(navLink, "navLink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.f34966iobyxmoadg = title;
        this.f34969zoijcleaow = colorButton;
        this.f34967ppxfxbqfkf = colorText;
        this.f34968wkgbmnqykc = navLink;
        this.f34965eablkybsjg = reference;
    }

    public final String eablkybsjg() {
        return this.f34966iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f34966iobyxmoadg, iobyxmoadgVar.f34966iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f34969zoijcleaow, iobyxmoadgVar.f34969zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f34967ppxfxbqfkf, iobyxmoadgVar.f34967ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f34968wkgbmnqykc, iobyxmoadgVar.f34968wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f34965eablkybsjg, iobyxmoadgVar.f34965eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f34966iobyxmoadg.hashCode() * 31) + this.f34969zoijcleaow.hashCode()) * 31) + this.f34967ppxfxbqfkf.hashCode()) * 31) + this.f34968wkgbmnqykc.hashCode()) * 31) + this.f34965eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f34969zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f34968wkgbmnqykc;
    }

    public String toString() {
        return "PopupButtonSpecialBannerUiModel(title=" + this.f34966iobyxmoadg + ", colorButton=" + this.f34969zoijcleaow + ", colorText=" + this.f34967ppxfxbqfkf + ", navLink=" + this.f34968wkgbmnqykc + ", reference=" + this.f34965eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f34965eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f34967ppxfxbqfkf;
    }
}
