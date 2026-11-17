package zr1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f131104iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ColorsUiModel f131105jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f131106yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f131107zdlpuopuiu;

    public zoijcleaow(String itemId, String title, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f131107zdlpuopuiu = itemId;
        this.f131106yggfygwlhe = title;
        this.f131105jyumaefscl = colorsUiModel;
        this.f131104iwizpuwonk = z13;
    }

    public final boolean eablkybsjg() {
        return this.f131104iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f131107zdlpuopuiu, zoijcleaowVar.f131107zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f131106yggfygwlhe, zoijcleaowVar.f131106yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f131105jyumaefscl, zoijcleaowVar.f131105jyumaefscl) && this.f131104iwizpuwonk == zoijcleaowVar.f131104iwizpuwonk;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f131107zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((this.f131107zdlpuopuiu.hashCode() * 31) + this.f131106yggfygwlhe.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f131105jyumaefscl;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f131104iwizpuwonk);
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f131105jyumaefscl;
    }

    public String toString() {
        return "HeaderOneSpecialBannerUiModel(itemId=" + this.f131107zdlpuopuiu + ", title=" + this.f131106yggfygwlhe + ", colorsUiModel=" + this.f131105jyumaefscl + ", isNeededPainting=" + this.f131104iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f131106yggfygwlhe;
    }
}
