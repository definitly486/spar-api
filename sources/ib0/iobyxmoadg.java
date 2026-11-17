package ib0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f42326eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f42327iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f42328ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f42329wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f42330zoijcleaow;

    public iobyxmoadg(String image, String title, String oldPriceTitle, String priceTitle, boolean z13) {
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(oldPriceTitle, "oldPriceTitle");
        zdlpuopuiu.btonecajqb(priceTitle, "priceTitle");
        this.f42327iobyxmoadg = image;
        this.f42330zoijcleaow = title;
        this.f42328ppxfxbqfkf = oldPriceTitle;
        this.f42329wkgbmnqykc = priceTitle;
        this.f42326eablkybsjg = z13;
    }

    public final String eablkybsjg() {
        return this.f42330zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f42327iobyxmoadg, iobyxmoadgVar.f42327iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f42330zoijcleaow, iobyxmoadgVar.f42330zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f42328ppxfxbqfkf, iobyxmoadgVar.f42328ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f42329wkgbmnqykc, iobyxmoadgVar.f42329wkgbmnqykc) && this.f42326eablkybsjg == iobyxmoadgVar.f42326eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f42327iobyxmoadg.hashCode() * 31) + this.f42330zoijcleaow.hashCode()) * 31) + this.f42328ppxfxbqfkf.hashCode()) * 31) + this.f42329wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f42326eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f42327iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f42328ppxfxbqfkf;
    }

    public String toString() {
        return "PromotionProductUiModel(image=" + this.f42327iobyxmoadg + ", title=" + this.f42330zoijcleaow + ", oldPriceTitle=" + this.f42328ppxfxbqfkf + ", priceTitle=" + this.f42329wkgbmnqykc + ", oldPriceIsVisible=" + this.f42326eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f42329wkgbmnqykc;
    }

    public final boolean zoijcleaow() {
        return this.f42326eablkybsjg;
    }
}
