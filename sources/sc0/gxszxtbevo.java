package sc0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.promo.Promotion;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f105981dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f105982eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Promotion.zoijcleaow f105983gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f105984iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f105985lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f105986nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f105987ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f105988wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f105989zoijcleaow;

    public gxszxtbevo(String promoHeaderText, int i13, String stickersPlural, boolean z13, String promoStickers, Promotion.zoijcleaow type, List products, boolean z14, String promotionCatalogBalanceCount) {
        zdlpuopuiu.btonecajqb(promoHeaderText, "promoHeaderText");
        zdlpuopuiu.btonecajqb(stickersPlural, "stickersPlural");
        zdlpuopuiu.btonecajqb(promoStickers, "promoStickers");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(promotionCatalogBalanceCount, "promotionCatalogBalanceCount");
        this.f105984iobyxmoadg = promoHeaderText;
        this.f105989zoijcleaow = i13;
        this.f105987ppxfxbqfkf = stickersPlural;
        this.f105988wkgbmnqykc = z13;
        this.f105982eablkybsjg = promoStickers;
        this.f105983gxszxtbevo = type;
        this.f105985lqeggnwhkg = products;
        this.f105986nufgyqmvbu = z14;
        this.f105981dxjokdxxww = promotionCatalogBalanceCount;
    }

    public final boolean eablkybsjg() {
        return this.f105988wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f105984iobyxmoadg, gxszxtbevoVar.f105984iobyxmoadg) && this.f105989zoijcleaow == gxszxtbevoVar.f105989zoijcleaow && zdlpuopuiu.eablkybsjg(this.f105987ppxfxbqfkf, gxszxtbevoVar.f105987ppxfxbqfkf) && this.f105988wkgbmnqykc == gxszxtbevoVar.f105988wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f105982eablkybsjg, gxszxtbevoVar.f105982eablkybsjg) && this.f105983gxszxtbevo == gxszxtbevoVar.f105983gxszxtbevo && zdlpuopuiu.eablkybsjg(this.f105985lqeggnwhkg, gxszxtbevoVar.f105985lqeggnwhkg) && this.f105986nufgyqmvbu == gxszxtbevoVar.f105986nufgyqmvbu && zdlpuopuiu.eablkybsjg(this.f105981dxjokdxxww, gxszxtbevoVar.f105981dxjokdxxww);
    }

    public final boolean gxszxtbevo() {
        return this.f105986nufgyqmvbu;
    }

    public int hashCode() {
        return (((((((((((((((this.f105984iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f105989zoijcleaow)) * 31) + this.f105987ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f105988wkgbmnqykc)) * 31) + this.f105982eablkybsjg.hashCode()) * 31) + this.f105983gxszxtbevo.hashCode()) * 31) + this.f105985lqeggnwhkg.hashCode()) * 31) + Boolean.hashCode(this.f105986nufgyqmvbu)) * 31) + this.f105981dxjokdxxww.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f105985lqeggnwhkg;
    }

    public final String ppxfxbqfkf() {
        return this.f105982eablkybsjg;
    }

    public String toString() {
        return "Model(promoHeaderText=" + this.f105984iobyxmoadg + ", totalStickers=" + this.f105989zoijcleaow + ", stickersPlural=" + this.f105987ppxfxbqfkf + ", showBalance=" + this.f105988wkgbmnqykc + ", promoStickers=" + this.f105982eablkybsjg + ", type=" + this.f105983gxszxtbevo + ", products=" + this.f105985lqeggnwhkg + ", isLoading=" + this.f105986nufgyqmvbu + ", promotionCatalogBalanceCount=" + this.f105981dxjokdxxww + ")";
    }

    public final String wkgbmnqykc() {
        return this.f105981dxjokdxxww;
    }

    public final String zoijcleaow() {
        return this.f105984iobyxmoadg;
    }
}
