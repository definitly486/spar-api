package yu;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f126642lqeggnwhkg = 0;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f126643eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f126644gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f126645iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f126646ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f126647wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f126648zoijcleaow;

    public wkgbmnqykc(String price, String priceDecimal, String priceWithoutDiscount, boolean z13, String errorMessage, boolean z14) {
        zdlpuopuiu.btonecajqb(price, "price");
        zdlpuopuiu.btonecajqb(priceDecimal, "priceDecimal");
        zdlpuopuiu.btonecajqb(priceWithoutDiscount, "priceWithoutDiscount");
        zdlpuopuiu.btonecajqb(errorMessage, "errorMessage");
        this.f126645iobyxmoadg = price;
        this.f126648zoijcleaow = priceDecimal;
        this.f126646ppxfxbqfkf = priceWithoutDiscount;
        this.f126647wkgbmnqykc = z13;
        this.f126643eablkybsjg = errorMessage;
        this.f126644gxszxtbevo = z14;
    }

    public final String eablkybsjg() {
        return this.f126646ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f126645iobyxmoadg, wkgbmnqykcVar.f126645iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f126648zoijcleaow, wkgbmnqykcVar.f126648zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f126646ppxfxbqfkf, wkgbmnqykcVar.f126646ppxfxbqfkf) && this.f126647wkgbmnqykc == wkgbmnqykcVar.f126647wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f126643eablkybsjg, wkgbmnqykcVar.f126643eablkybsjg) && this.f126644gxszxtbevo == wkgbmnqykcVar.f126644gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f126647wkgbmnqykc;
    }

    public int hashCode() {
        return (((((((((this.f126645iobyxmoadg.hashCode() * 31) + this.f126648zoijcleaow.hashCode()) * 31) + this.f126646ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f126647wkgbmnqykc)) * 31) + this.f126643eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f126644gxszxtbevo);
    }

    public final String iobyxmoadg() {
        return this.f126643eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f126645iobyxmoadg;
    }

    public String toString() {
        return "TotalPriceComponentUiModel(price=" + this.f126645iobyxmoadg + ", priceDecimal=" + this.f126648zoijcleaow + ", priceWithoutDiscount=" + this.f126646ppxfxbqfkf + ", isButtonEnabled=" + this.f126647wkgbmnqykc + ", errorMessage=" + this.f126643eablkybsjg + ", orderButtonProgressVisible=" + this.f126644gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f126648zoijcleaow;
    }

    public final boolean zoijcleaow() {
        return this.f126644gxszxtbevo;
    }
}
