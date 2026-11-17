package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class wwaezpbzkn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f19026eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f19027iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f19028ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f19029wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f19030zoijcleaow;

    public wwaezpbzkn(String title, String colorButton, String colorText, String navLink, String reference) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorButton, "colorButton");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorText, "colorText");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
        this.f19027iobyxmoadg = title;
        this.f19030zoijcleaow = colorButton;
        this.f19028ppxfxbqfkf = colorText;
        this.f19029wkgbmnqykc = navLink;
        this.f19026eablkybsjg = reference;
    }

    public final String eablkybsjg() {
        return this.f19027iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwaezpbzkn)) {
            return false;
        }
        wwaezpbzkn wwaezpbzknVar = (wwaezpbzkn) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19027iobyxmoadg, wwaezpbzknVar.f19027iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19030zoijcleaow, wwaezpbzknVar.f19030zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19028ppxfxbqfkf, wwaezpbzknVar.f19028ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19029wkgbmnqykc, wwaezpbzknVar.f19029wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19026eablkybsjg, wwaezpbzknVar.f19026eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f19027iobyxmoadg.hashCode() * 31) + this.f19030zoijcleaow.hashCode()) * 31) + this.f19028ppxfxbqfkf.hashCode()) * 31) + this.f19029wkgbmnqykc.hashCode()) * 31) + this.f19026eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f19030zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f19029wkgbmnqykc;
    }

    public String toString() {
        return "SpecialBannerPopupButton(title=" + this.f19027iobyxmoadg + ", colorButton=" + this.f19030zoijcleaow + ", colorText=" + this.f19028ppxfxbqfkf + ", navLink=" + this.f19029wkgbmnqykc + ", reference=" + this.f19026eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f19026eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f19028ppxfxbqfkf;
    }
}
