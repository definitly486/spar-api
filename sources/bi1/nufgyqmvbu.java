package bi1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final String f16384btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final boolean f16385draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f16386dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Boolean f16387eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final boolean f16388gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f16389gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f16390iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f16391lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f16392nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f16393ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final boolean f16394wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f16395wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f16396zoijcleaow;

    public nufgyqmvbu(boolean z13, String productListTitle, String str, String str2, Boolean bool, List products, String totalPrice, String totalPriceFractional, String oldTotalPrice, String btnText, boolean z14, boolean z15, boolean z16) {
        zdlpuopuiu.btonecajqb(productListTitle, "productListTitle");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(totalPrice, "totalPrice");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        zdlpuopuiu.btonecajqb(oldTotalPrice, "oldTotalPrice");
        zdlpuopuiu.btonecajqb(btnText, "btnText");
        this.f16390iobyxmoadg = z13;
        this.f16396zoijcleaow = productListTitle;
        this.f16393ppxfxbqfkf = str;
        this.f16395wkgbmnqykc = str2;
        this.f16387eablkybsjg = bool;
        this.f16389gxszxtbevo = products;
        this.f16391lqeggnwhkg = totalPrice;
        this.f16392nufgyqmvbu = totalPriceFractional;
        this.f16386dxjokdxxww = oldTotalPrice;
        this.f16384btonecajqb = btnText;
        this.f16388gtknphoqwx = z14;
        this.f16385draadjrbmk = z15;
        this.f16394wflxmlrfwp = z16;
    }

    public final boolean btonecajqb() {
        return this.f16390iobyxmoadg;
    }

    public final Boolean draadjrbmk() {
        return this.f16387eablkybsjg;
    }

    public final boolean dxjokdxxww() {
        return this.f16388gtknphoqwx;
    }

    public final List eablkybsjg() {
        return this.f16389gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f16390iobyxmoadg == nufgyqmvbuVar.f16390iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f16396zoijcleaow, nufgyqmvbuVar.f16396zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f16393ppxfxbqfkf, nufgyqmvbuVar.f16393ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f16395wkgbmnqykc, nufgyqmvbuVar.f16395wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f16387eablkybsjg, nufgyqmvbuVar.f16387eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f16389gxszxtbevo, nufgyqmvbuVar.f16389gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f16391lqeggnwhkg, nufgyqmvbuVar.f16391lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f16392nufgyqmvbu, nufgyqmvbuVar.f16392nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f16386dxjokdxxww, nufgyqmvbuVar.f16386dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f16384btonecajqb, nufgyqmvbuVar.f16384btonecajqb) && this.f16388gtknphoqwx == nufgyqmvbuVar.f16388gtknphoqwx && this.f16385draadjrbmk == nufgyqmvbuVar.f16385draadjrbmk && this.f16394wflxmlrfwp == nufgyqmvbuVar.f16394wflxmlrfwp;
    }

    public final boolean gtknphoqwx() {
        return this.f16394wflxmlrfwp;
    }

    public final String gxszxtbevo() {
        return this.f16395wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f16390iobyxmoadg) * 31) + this.f16396zoijcleaow.hashCode()) * 31;
        String str = this.f16393ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16395wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f16387eablkybsjg;
        return ((((((((((((((((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + this.f16389gxszxtbevo.hashCode()) * 31) + this.f16391lqeggnwhkg.hashCode()) * 31) + this.f16392nufgyqmvbu.hashCode()) * 31) + this.f16386dxjokdxxww.hashCode()) * 31) + this.f16384btonecajqb.hashCode()) * 31) + Boolean.hashCode(this.f16388gtknphoqwx)) * 31) + Boolean.hashCode(this.f16385draadjrbmk)) * 31) + Boolean.hashCode(this.f16394wflxmlrfwp);
    }

    public final String iobyxmoadg() {
        return this.f16384btonecajqb;
    }

    public final String lqeggnwhkg() {
        return this.f16391lqeggnwhkg;
    }

    public final String nufgyqmvbu() {
        return this.f16392nufgyqmvbu;
    }

    public final String ppxfxbqfkf() {
        return this.f16386dxjokdxxww;
    }

    public String toString() {
        return "Model(isLoading=" + this.f16390iobyxmoadg + ", productListTitle=" + this.f16396zoijcleaow + ", imageBannerUrl=" + this.f16393ppxfxbqfkf + ", totalCountText=" + this.f16395wkgbmnqykc + ", isSelected=" + this.f16387eablkybsjg + ", products=" + this.f16389gxszxtbevo + ", totalPrice=" + this.f16391lqeggnwhkg + ", totalPriceFractional=" + this.f16392nufgyqmvbu + ", oldTotalPrice=" + this.f16386dxjokdxxww + ", btnText=" + this.f16384btonecajqb + ", isBtnEnabled=" + this.f16388gtknphoqwx + ", isShareBtnVisible=" + this.f16385draadjrbmk + ", isPurchaseListBtnVisible=" + this.f16394wflxmlrfwp + ")";
    }

    public final String wkgbmnqykc() {
        return this.f16396zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f16393ppxfxbqfkf;
    }
}
