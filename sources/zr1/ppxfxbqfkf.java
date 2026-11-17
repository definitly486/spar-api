package zr1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f131096iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ColorsUiModel f131097jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f131098yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f131099zdlpuopuiu;

    public ppxfxbqfkf(String itemId, String title, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f131099zdlpuopuiu = itemId;
        this.f131098yggfygwlhe = title;
        this.f131097jyumaefscl = colorsUiModel;
        this.f131096iwizpuwonk = z13;
    }

    public final boolean eablkybsjg() {
        return this.f131096iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f131099zdlpuopuiu, ppxfxbqfkfVar.f131099zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f131098yggfygwlhe, ppxfxbqfkfVar.f131098yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f131097jyumaefscl, ppxfxbqfkfVar.f131097jyumaefscl) && this.f131096iwizpuwonk == ppxfxbqfkfVar.f131096iwizpuwonk;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f131099zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((this.f131099zdlpuopuiu.hashCode() * 31) + this.f131098yggfygwlhe.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f131097jyumaefscl;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f131096iwizpuwonk);
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f131097jyumaefscl;
    }

    public String toString() {
        return "HeaderSixSpecialBannerUiModel(itemId=" + this.f131099zdlpuopuiu + ", title=" + this.f131098yggfygwlhe + ", colorsUiModel=" + this.f131097jyumaefscl + ", isNeededPainting=" + this.f131096iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f131098yggfygwlhe;
    }
}
