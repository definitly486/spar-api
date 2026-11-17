package j62;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f50813iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ColorsUiModel f50814jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f50815yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f50816zdlpuopuiu;

    public iobyxmoadg(String text, String itemId, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        this.f50816zdlpuopuiu = text;
        this.f50815yggfygwlhe = itemId;
        this.f50814jyumaefscl = colorsUiModel;
        this.f50813iwizpuwonk = z13;
    }

    public final boolean eablkybsjg() {
        return this.f50813iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f50816zdlpuopuiu, iobyxmoadgVar.f50816zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f50815yggfygwlhe, iobyxmoadgVar.f50815yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f50814jyumaefscl, iobyxmoadgVar.f50814jyumaefscl) && this.f50813iwizpuwonk == iobyxmoadgVar.f50813iwizpuwonk;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f50815yggfygwlhe;
    }

    public int hashCode() {
        int iHashCode = ((this.f50816zdlpuopuiu.hashCode() * 31) + this.f50815yggfygwlhe.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f50814jyumaefscl;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f50813iwizpuwonk);
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f50814jyumaefscl;
    }

    public String toString() {
        return "MainTextSpecialBannerUiModel(text=" + this.f50816zdlpuopuiu + ", itemId=" + this.f50815yggfygwlhe + ", colorsUiModel=" + this.f50814jyumaefscl + ", isNeededPainting=" + this.f50813iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f50816zdlpuopuiu;
    }
}
