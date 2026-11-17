package zr1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f131085iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ColorsUiModel f131086jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f131087yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f131088zdlpuopuiu;

    public eablkybsjg(String itemId, String title, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f131088zdlpuopuiu = itemId;
        this.f131087yggfygwlhe = title;
        this.f131086jyumaefscl = colorsUiModel;
        this.f131085iwizpuwonk = z13;
    }

    public final boolean eablkybsjg() {
        return this.f131085iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f131088zdlpuopuiu, eablkybsjgVar.f131088zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f131087yggfygwlhe, eablkybsjgVar.f131087yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f131086jyumaefscl, eablkybsjgVar.f131086jyumaefscl) && this.f131085iwizpuwonk == eablkybsjgVar.f131085iwizpuwonk;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f131088zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((this.f131088zdlpuopuiu.hashCode() * 31) + this.f131087yggfygwlhe.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f131086jyumaefscl;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f131085iwizpuwonk);
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f131086jyumaefscl;
    }

    public String toString() {
        return "HeaderTwoSpecialBannerUiModel(itemId=" + this.f131088zdlpuopuiu + ", title=" + this.f131087yggfygwlhe + ", colorsUiModel=" + this.f131086jyumaefscl + ", isNeededPainting=" + this.f131085iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f131087yggfygwlhe;
    }
}
