package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class ylkuphrtab {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f117968eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f117969iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f117970ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final k21.ojitshcjhn f117971wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f117972zoijcleaow;

    public ylkuphrtab(String title, String colorButton, String colorText, k21.ojitshcjhn navLink, String reference) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorButton, "colorButton");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorText, "colorText");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
        this.f117969iobyxmoadg = title;
        this.f117972zoijcleaow = colorButton;
        this.f117970ppxfxbqfkf = colorText;
        this.f117971wkgbmnqykc = navLink;
        this.f117968eablkybsjg = reference;
    }

    public final String eablkybsjg() {
        return this.f117969iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylkuphrtab)) {
            return false;
        }
        ylkuphrtab ylkuphrtabVar = (ylkuphrtab) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117969iobyxmoadg, ylkuphrtabVar.f117969iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117972zoijcleaow, ylkuphrtabVar.f117972zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117970ppxfxbqfkf, ylkuphrtabVar.f117970ppxfxbqfkf) && this.f117971wkgbmnqykc == ylkuphrtabVar.f117971wkgbmnqykc && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117968eablkybsjg, ylkuphrtabVar.f117968eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f117969iobyxmoadg.hashCode() * 31) + this.f117972zoijcleaow.hashCode()) * 31) + this.f117970ppxfxbqfkf.hashCode()) * 31) + this.f117971wkgbmnqykc.hashCode()) * 31) + this.f117968eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f117972zoijcleaow;
    }

    public final k21.ojitshcjhn ppxfxbqfkf() {
        return this.f117971wkgbmnqykc;
    }

    public String toString() {
        return "SpecialBannerPromoButton(title=" + this.f117969iobyxmoadg + ", colorButton=" + this.f117972zoijcleaow + ", colorText=" + this.f117970ppxfxbqfkf + ", navLink=" + this.f117971wkgbmnqykc + ", reference=" + this.f117968eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f117968eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f117970ppxfxbqfkf;
    }

    public /* synthetic */ ylkuphrtab(String str, String str2, String str3, k21.ojitshcjhn ojitshcjhnVar, String str4, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? k21.ojitshcjhn.NONE : ojitshcjhnVar, (i13 & 16) != 0 ? "" : str4);
    }
}
