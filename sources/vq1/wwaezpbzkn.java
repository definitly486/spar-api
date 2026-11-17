package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class wwaezpbzkn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f117946eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f117947iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f117948ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f117949wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f117950zoijcleaow;

    public wwaezpbzkn(String title, String colorButton, String colorText, String navLink, String reference) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorButton, "colorButton");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorText, "colorText");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
        this.f117947iobyxmoadg = title;
        this.f117950zoijcleaow = colorButton;
        this.f117948ppxfxbqfkf = colorText;
        this.f117949wkgbmnqykc = navLink;
        this.f117946eablkybsjg = reference;
    }

    public final String eablkybsjg() {
        return this.f117947iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwaezpbzkn)) {
            return false;
        }
        wwaezpbzkn wwaezpbzknVar = (wwaezpbzkn) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117947iobyxmoadg, wwaezpbzknVar.f117947iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117950zoijcleaow, wwaezpbzknVar.f117950zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117948ppxfxbqfkf, wwaezpbzknVar.f117948ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117949wkgbmnqykc, wwaezpbzknVar.f117949wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117946eablkybsjg, wwaezpbzknVar.f117946eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f117947iobyxmoadg.hashCode() * 31) + this.f117950zoijcleaow.hashCode()) * 31) + this.f117948ppxfxbqfkf.hashCode()) * 31) + this.f117949wkgbmnqykc.hashCode()) * 31) + this.f117946eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f117950zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f117949wkgbmnqykc;
    }

    public String toString() {
        return "SpecialBannerPopupButton(title=" + this.f117947iobyxmoadg + ", colorButton=" + this.f117950zoijcleaow + ", colorText=" + this.f117948ppxfxbqfkf + ", navLink=" + this.f117949wkgbmnqykc + ", reference=" + this.f117946eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f117946eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f117948ppxfxbqfkf;
    }
}
