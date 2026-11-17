package ix1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.promo_collection.api.models.PromoCollectionInfo;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ColorsUiModel f49970eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f49971iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final PromoCollectionInfo f49972ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f49973wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f49974zoijcleaow;

    public lqeggnwhkg(boolean z13, String specialBannerId, PromoCollectionInfo promoCollectionInfo, List promoCollectionItems, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(specialBannerId, "specialBannerId");
        zdlpuopuiu.btonecajqb(promoCollectionInfo, "promoCollectionInfo");
        zdlpuopuiu.btonecajqb(promoCollectionItems, "promoCollectionItems");
        this.f49971iobyxmoadg = z13;
        this.f49974zoijcleaow = specialBannerId;
        this.f49972ppxfxbqfkf = promoCollectionInfo;
        this.f49973wkgbmnqykc = promoCollectionItems;
        this.f49970eablkybsjg = colorsUiModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f49971iobyxmoadg == lqeggnwhkgVar.f49971iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f49974zoijcleaow, lqeggnwhkgVar.f49974zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f49972ppxfxbqfkf, lqeggnwhkgVar.f49972ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f49973wkgbmnqykc, lqeggnwhkgVar.f49973wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f49970eablkybsjg, lqeggnwhkgVar.f49970eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f49971iobyxmoadg) * 31) + this.f49974zoijcleaow.hashCode()) * 31) + this.f49972ppxfxbqfkf.hashCode()) * 31) + this.f49973wkgbmnqykc.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f49970eablkybsjg;
        return iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode());
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f49970eablkybsjg;
    }

    public final List ppxfxbqfkf() {
        return this.f49973wkgbmnqykc;
    }

    public String toString() {
        return "Model(isLoading=" + this.f49971iobyxmoadg + ", specialBannerId=" + this.f49974zoijcleaow + ", promoCollectionInfo=" + this.f49972ppxfxbqfkf + ", promoCollectionItems=" + this.f49973wkgbmnqykc + ", colorUiModel=" + this.f49970eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f49971iobyxmoadg;
    }

    public final PromoCollectionInfo zoijcleaow() {
        return this.f49972ppxfxbqfkf;
    }
}
