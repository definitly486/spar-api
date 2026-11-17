package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class ylkuphrtab {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f19048eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f19049iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f19050ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final f40.zoijcleaow f19051wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f19052zoijcleaow;

    public ylkuphrtab(String title, String colorButton, String colorText, f40.zoijcleaow navLink, String reference) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorButton, "colorButton");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorText, "colorText");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
        this.f19049iobyxmoadg = title;
        this.f19052zoijcleaow = colorButton;
        this.f19050ppxfxbqfkf = colorText;
        this.f19051wkgbmnqykc = navLink;
        this.f19048eablkybsjg = reference;
    }

    public final String eablkybsjg() {
        return this.f19049iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylkuphrtab)) {
            return false;
        }
        ylkuphrtab ylkuphrtabVar = (ylkuphrtab) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19049iobyxmoadg, ylkuphrtabVar.f19049iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19052zoijcleaow, ylkuphrtabVar.f19052zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19050ppxfxbqfkf, ylkuphrtabVar.f19050ppxfxbqfkf) && this.f19051wkgbmnqykc == ylkuphrtabVar.f19051wkgbmnqykc && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19048eablkybsjg, ylkuphrtabVar.f19048eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f19049iobyxmoadg.hashCode() * 31) + this.f19052zoijcleaow.hashCode()) * 31) + this.f19050ppxfxbqfkf.hashCode()) * 31) + this.f19051wkgbmnqykc.hashCode()) * 31) + this.f19048eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f19052zoijcleaow;
    }

    public final f40.zoijcleaow ppxfxbqfkf() {
        return this.f19051wkgbmnqykc;
    }

    public String toString() {
        return "SpecialBannerPromoButton(title=" + this.f19049iobyxmoadg + ", colorButton=" + this.f19052zoijcleaow + ", colorText=" + this.f19050ppxfxbqfkf + ", navLink=" + this.f19051wkgbmnqykc + ", reference=" + this.f19048eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f19048eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f19050ppxfxbqfkf;
    }

    public /* synthetic */ ylkuphrtab(String str, String str2, String str3, f40.zoijcleaow zoijcleaowVar, String str4, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? f40.zoijcleaow.NONE : zoijcleaowVar, (i13 & 16) != 0 ? "" : str4);
    }
}
