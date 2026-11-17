package zr1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements gz0.iobyxmoadg, c31.wkgbmnqykc {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f131100iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ColorsUiModel f131101jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f131102yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f131103zdlpuopuiu;

    public wkgbmnqykc(String itemId, String title, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f131103zdlpuopuiu = itemId;
        this.f131102yggfygwlhe = title;
        this.f131101jyumaefscl = colorsUiModel;
        this.f131100iwizpuwonk = z13;
    }

    public final boolean eablkybsjg() {
        return this.f131100iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f131103zdlpuopuiu, wkgbmnqykcVar.f131103zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f131102yggfygwlhe, wkgbmnqykcVar.f131102yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f131101jyumaefscl, wkgbmnqykcVar.f131101jyumaefscl) && this.f131100iwizpuwonk == wkgbmnqykcVar.f131100iwizpuwonk;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f131103zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((this.f131103zdlpuopuiu.hashCode() * 31) + this.f131102yggfygwlhe.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f131101jyumaefscl;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f131100iwizpuwonk);
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f131101jyumaefscl;
    }

    public String toString() {
        return "HeaderThreeSpecialBannerUiModel(itemId=" + this.f131103zdlpuopuiu + ", title=" + this.f131102yggfygwlhe + ", colorsUiModel=" + this.f131101jyumaefscl + ", isNeededPainting=" + this.f131100iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f131102yggfygwlhe;
    }
}
