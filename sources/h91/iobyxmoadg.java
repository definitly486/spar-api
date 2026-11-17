package h91;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f39928eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f39929iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f39930ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f39931wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f39932zoijcleaow;

    public iobyxmoadg(String image, String title, String oldPriceTitle, String priceTitle, boolean z13) {
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(oldPriceTitle, "oldPriceTitle");
        zdlpuopuiu.btonecajqb(priceTitle, "priceTitle");
        this.f39929iobyxmoadg = image;
        this.f39932zoijcleaow = title;
        this.f39930ppxfxbqfkf = oldPriceTitle;
        this.f39931wkgbmnqykc = priceTitle;
        this.f39928eablkybsjg = z13;
    }

    public final String eablkybsjg() {
        return this.f39932zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f39929iobyxmoadg, iobyxmoadgVar.f39929iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39932zoijcleaow, iobyxmoadgVar.f39932zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f39930ppxfxbqfkf, iobyxmoadgVar.f39930ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f39931wkgbmnqykc, iobyxmoadgVar.f39931wkgbmnqykc) && this.f39928eablkybsjg == iobyxmoadgVar.f39928eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f39929iobyxmoadg.hashCode() * 31) + this.f39932zoijcleaow.hashCode()) * 31) + this.f39930ppxfxbqfkf.hashCode()) * 31) + this.f39931wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f39928eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f39929iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f39930ppxfxbqfkf;
    }

    public String toString() {
        return "PromotionProductUiModel(image=" + this.f39929iobyxmoadg + ", title=" + this.f39932zoijcleaow + ", oldPriceTitle=" + this.f39930ppxfxbqfkf + ", priceTitle=" + this.f39931wkgbmnqykc + ", oldPriceIsVisible=" + this.f39928eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f39931wkgbmnqykc;
    }

    public final boolean zoijcleaow() {
        return this.f39928eablkybsjg;
    }
}
