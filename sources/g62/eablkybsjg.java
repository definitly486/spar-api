package g62;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f36530iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ColorsUiModel f36531jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f36532yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f36533zdlpuopuiu;

    public eablkybsjg(String itemId, String title, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f36533zdlpuopuiu = itemId;
        this.f36532yggfygwlhe = title;
        this.f36531jyumaefscl = colorsUiModel;
        this.f36530iwizpuwonk = z13;
    }

    public final boolean eablkybsjg() {
        return this.f36530iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f36533zdlpuopuiu, eablkybsjgVar.f36533zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f36532yggfygwlhe, eablkybsjgVar.f36532yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f36531jyumaefscl, eablkybsjgVar.f36531jyumaefscl) && this.f36530iwizpuwonk == eablkybsjgVar.f36530iwizpuwonk;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f36533zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((this.f36533zdlpuopuiu.hashCode() * 31) + this.f36532yggfygwlhe.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f36531jyumaefscl;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f36530iwizpuwonk);
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f36531jyumaefscl;
    }

    public String toString() {
        return "HeaderTwoSpecialBannerUiModel(itemId=" + this.f36533zdlpuopuiu + ", title=" + this.f36532yggfygwlhe + ", colorsUiModel=" + this.f36531jyumaefscl + ", isNeededPainting=" + this.f36530iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f36532yggfygwlhe;
    }
}
