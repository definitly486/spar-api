package lk0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final String f63272btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final boolean f63273draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f63274dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Boolean f63275eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final boolean f63276gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f63277gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f63278iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f63279lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f63280nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f63281ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final boolean f63282wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f63283wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f63284zoijcleaow;

    public dxjokdxxww(boolean z13, String productListTitle, String str, String str2, Boolean bool, List products, String totalPrice, String totalPriceFractional, String oldTotalPrice, String btnText, boolean z14, boolean z15, boolean z16) {
        zdlpuopuiu.btonecajqb(productListTitle, "productListTitle");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(totalPrice, "totalPrice");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        zdlpuopuiu.btonecajqb(oldTotalPrice, "oldTotalPrice");
        zdlpuopuiu.btonecajqb(btnText, "btnText");
        this.f63278iobyxmoadg = z13;
        this.f63284zoijcleaow = productListTitle;
        this.f63281ppxfxbqfkf = str;
        this.f63283wkgbmnqykc = str2;
        this.f63275eablkybsjg = bool;
        this.f63277gxszxtbevo = products;
        this.f63279lqeggnwhkg = totalPrice;
        this.f63280nufgyqmvbu = totalPriceFractional;
        this.f63274dxjokdxxww = oldTotalPrice;
        this.f63272btonecajqb = btnText;
        this.f63276gtknphoqwx = z14;
        this.f63273draadjrbmk = z15;
        this.f63282wflxmlrfwp = z16;
    }

    public final boolean btonecajqb() {
        return this.f63278iobyxmoadg;
    }

    public final Boolean draadjrbmk() {
        return this.f63275eablkybsjg;
    }

    public final boolean dxjokdxxww() {
        return this.f63276gtknphoqwx;
    }

    public final List eablkybsjg() {
        return this.f63277gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return this.f63278iobyxmoadg == dxjokdxxwwVar.f63278iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f63284zoijcleaow, dxjokdxxwwVar.f63284zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f63281ppxfxbqfkf, dxjokdxxwwVar.f63281ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f63283wkgbmnqykc, dxjokdxxwwVar.f63283wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f63275eablkybsjg, dxjokdxxwwVar.f63275eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f63277gxszxtbevo, dxjokdxxwwVar.f63277gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f63279lqeggnwhkg, dxjokdxxwwVar.f63279lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f63280nufgyqmvbu, dxjokdxxwwVar.f63280nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f63274dxjokdxxww, dxjokdxxwwVar.f63274dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f63272btonecajqb, dxjokdxxwwVar.f63272btonecajqb) && this.f63276gtknphoqwx == dxjokdxxwwVar.f63276gtknphoqwx && this.f63273draadjrbmk == dxjokdxxwwVar.f63273draadjrbmk && this.f63282wflxmlrfwp == dxjokdxxwwVar.f63282wflxmlrfwp;
    }

    public final boolean gtknphoqwx() {
        return this.f63282wflxmlrfwp;
    }

    public final String gxszxtbevo() {
        return this.f63283wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f63278iobyxmoadg) * 31) + this.f63284zoijcleaow.hashCode()) * 31;
        String str = this.f63281ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63283wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f63275eablkybsjg;
        return ((((((((((((((((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + this.f63277gxszxtbevo.hashCode()) * 31) + this.f63279lqeggnwhkg.hashCode()) * 31) + this.f63280nufgyqmvbu.hashCode()) * 31) + this.f63274dxjokdxxww.hashCode()) * 31) + this.f63272btonecajqb.hashCode()) * 31) + Boolean.hashCode(this.f63276gtknphoqwx)) * 31) + Boolean.hashCode(this.f63273draadjrbmk)) * 31) + Boolean.hashCode(this.f63282wflxmlrfwp);
    }

    public final String iobyxmoadg() {
        return this.f63272btonecajqb;
    }

    public final String lqeggnwhkg() {
        return this.f63279lqeggnwhkg;
    }

    public final String nufgyqmvbu() {
        return this.f63280nufgyqmvbu;
    }

    public final String ppxfxbqfkf() {
        return this.f63274dxjokdxxww;
    }

    public String toString() {
        return "Model(isLoading=" + this.f63278iobyxmoadg + ", productListTitle=" + this.f63284zoijcleaow + ", imageBannerUrl=" + this.f63281ppxfxbqfkf + ", totalCountText=" + this.f63283wkgbmnqykc + ", isSelected=" + this.f63275eablkybsjg + ", products=" + this.f63277gxszxtbevo + ", totalPrice=" + this.f63279lqeggnwhkg + ", totalPriceFractional=" + this.f63280nufgyqmvbu + ", oldTotalPrice=" + this.f63274dxjokdxxww + ", btnText=" + this.f63272btonecajqb + ", isBtnEnabled=" + this.f63276gtknphoqwx + ", isShareBtnVisible=" + this.f63273draadjrbmk + ", isPurchaseListBtnVisible=" + this.f63282wflxmlrfwp + ")";
    }

    public final String wkgbmnqykc() {
        return this.f63284zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f63281ppxfxbqfkf;
    }
}
