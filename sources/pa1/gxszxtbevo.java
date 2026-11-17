package pa1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f76269dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f76270eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Promotion.zoijcleaow f76271gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f76272iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f76273lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f76274nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f76275ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f76276wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f76277zoijcleaow;

    public gxszxtbevo(String promoHeaderText, int i13, String stickersPlural, boolean z13, String promoStickers, Promotion.zoijcleaow type, List products, boolean z14, String promotionCatalogBalanceCount) {
        zdlpuopuiu.btonecajqb(promoHeaderText, "promoHeaderText");
        zdlpuopuiu.btonecajqb(stickersPlural, "stickersPlural");
        zdlpuopuiu.btonecajqb(promoStickers, "promoStickers");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(promotionCatalogBalanceCount, "promotionCatalogBalanceCount");
        this.f76272iobyxmoadg = promoHeaderText;
        this.f76277zoijcleaow = i13;
        this.f76275ppxfxbqfkf = stickersPlural;
        this.f76276wkgbmnqykc = z13;
        this.f76270eablkybsjg = promoStickers;
        this.f76271gxszxtbevo = type;
        this.f76273lqeggnwhkg = products;
        this.f76274nufgyqmvbu = z14;
        this.f76269dxjokdxxww = promotionCatalogBalanceCount;
    }

    public final boolean eablkybsjg() {
        return this.f76276wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f76272iobyxmoadg, gxszxtbevoVar.f76272iobyxmoadg) && this.f76277zoijcleaow == gxszxtbevoVar.f76277zoijcleaow && zdlpuopuiu.eablkybsjg(this.f76275ppxfxbqfkf, gxszxtbevoVar.f76275ppxfxbqfkf) && this.f76276wkgbmnqykc == gxszxtbevoVar.f76276wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f76270eablkybsjg, gxszxtbevoVar.f76270eablkybsjg) && this.f76271gxszxtbevo == gxszxtbevoVar.f76271gxszxtbevo && zdlpuopuiu.eablkybsjg(this.f76273lqeggnwhkg, gxszxtbevoVar.f76273lqeggnwhkg) && this.f76274nufgyqmvbu == gxszxtbevoVar.f76274nufgyqmvbu && zdlpuopuiu.eablkybsjg(this.f76269dxjokdxxww, gxszxtbevoVar.f76269dxjokdxxww);
    }

    public final boolean gxszxtbevo() {
        return this.f76274nufgyqmvbu;
    }

    public int hashCode() {
        return (((((((((((((((this.f76272iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f76277zoijcleaow)) * 31) + this.f76275ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f76276wkgbmnqykc)) * 31) + this.f76270eablkybsjg.hashCode()) * 31) + this.f76271gxszxtbevo.hashCode()) * 31) + this.f76273lqeggnwhkg.hashCode()) * 31) + Boolean.hashCode(this.f76274nufgyqmvbu)) * 31) + this.f76269dxjokdxxww.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f76273lqeggnwhkg;
    }

    public final String ppxfxbqfkf() {
        return this.f76270eablkybsjg;
    }

    public String toString() {
        return "Model(promoHeaderText=" + this.f76272iobyxmoadg + ", totalStickers=" + this.f76277zoijcleaow + ", stickersPlural=" + this.f76275ppxfxbqfkf + ", showBalance=" + this.f76276wkgbmnqykc + ", promoStickers=" + this.f76270eablkybsjg + ", type=" + this.f76271gxszxtbevo + ", products=" + this.f76273lqeggnwhkg + ", isLoading=" + this.f76274nufgyqmvbu + ", promotionCatalogBalanceCount=" + this.f76269dxjokdxxww + ")";
    }

    public final String wkgbmnqykc() {
        return this.f76269dxjokdxxww;
    }

    public final String zoijcleaow() {
        return this.f76272iobyxmoadg;
    }
}
