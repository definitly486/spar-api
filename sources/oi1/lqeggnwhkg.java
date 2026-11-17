package oi1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.components.promo_collection.api.models.PromoCollectionInfo;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ColorsUiModel f72966eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f72967iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final PromoCollectionInfo f72968ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f72969wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f72970zoijcleaow;

    public lqeggnwhkg(boolean z13, String specialBannerId, PromoCollectionInfo promoCollectionInfo, List promoCollectionItems, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(specialBannerId, "specialBannerId");
        zdlpuopuiu.btonecajqb(promoCollectionInfo, "promoCollectionInfo");
        zdlpuopuiu.btonecajqb(promoCollectionItems, "promoCollectionItems");
        this.f72967iobyxmoadg = z13;
        this.f72970zoijcleaow = specialBannerId;
        this.f72968ppxfxbqfkf = promoCollectionInfo;
        this.f72969wkgbmnqykc = promoCollectionItems;
        this.f72966eablkybsjg = colorsUiModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f72967iobyxmoadg == lqeggnwhkgVar.f72967iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f72970zoijcleaow, lqeggnwhkgVar.f72970zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f72968ppxfxbqfkf, lqeggnwhkgVar.f72968ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f72969wkgbmnqykc, lqeggnwhkgVar.f72969wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f72966eablkybsjg, lqeggnwhkgVar.f72966eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f72967iobyxmoadg) * 31) + this.f72970zoijcleaow.hashCode()) * 31) + this.f72968ppxfxbqfkf.hashCode()) * 31) + this.f72969wkgbmnqykc.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f72966eablkybsjg;
        return iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode());
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f72966eablkybsjg;
    }

    public final List ppxfxbqfkf() {
        return this.f72969wkgbmnqykc;
    }

    public String toString() {
        return "Model(isLoading=" + this.f72967iobyxmoadg + ", specialBannerId=" + this.f72970zoijcleaow + ", promoCollectionInfo=" + this.f72968ppxfxbqfkf + ", promoCollectionItems=" + this.f72969wkgbmnqykc + ", colorUiModel=" + this.f72966eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f72967iobyxmoadg;
    }

    public final PromoCollectionInfo zoijcleaow() {
        return this.f72968ppxfxbqfkf;
    }
}
