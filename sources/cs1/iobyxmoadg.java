package cs1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f25674iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ColorsUiModel f25675jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f25676yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f25677zdlpuopuiu;

    public iobyxmoadg(String text, String itemId, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        this.f25677zdlpuopuiu = text;
        this.f25676yggfygwlhe = itemId;
        this.f25675jyumaefscl = colorsUiModel;
        this.f25674iwizpuwonk = z13;
    }

    public final boolean eablkybsjg() {
        return this.f25674iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f25677zdlpuopuiu, iobyxmoadgVar.f25677zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f25676yggfygwlhe, iobyxmoadgVar.f25676yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f25675jyumaefscl, iobyxmoadgVar.f25675jyumaefscl) && this.f25674iwizpuwonk == iobyxmoadgVar.f25674iwizpuwonk;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f25676yggfygwlhe;
    }

    public int hashCode() {
        int iHashCode = ((this.f25677zdlpuopuiu.hashCode() * 31) + this.f25676yggfygwlhe.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f25675jyumaefscl;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f25674iwizpuwonk);
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f25675jyumaefscl;
    }

    public String toString() {
        return "MainTextSpecialBannerUiModel(text=" + this.f25677zdlpuopuiu + ", itemId=" + this.f25676yggfygwlhe + ", colorsUiModel=" + this.f25675jyumaefscl + ", isNeededPainting=" + this.f25674iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f25677zdlpuopuiu;
    }
}
