package g62;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements o00.iobyxmoadg, t40.wkgbmnqykc {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f36545iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ColorsUiModel f36546jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f36547yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f36548zdlpuopuiu;

    public wkgbmnqykc(String itemId, String title, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f36548zdlpuopuiu = itemId;
        this.f36547yggfygwlhe = title;
        this.f36546jyumaefscl = colorsUiModel;
        this.f36545iwizpuwonk = z13;
    }

    public final boolean eablkybsjg() {
        return this.f36545iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f36548zdlpuopuiu, wkgbmnqykcVar.f36548zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f36547yggfygwlhe, wkgbmnqykcVar.f36547yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f36546jyumaefscl, wkgbmnqykcVar.f36546jyumaefscl) && this.f36545iwizpuwonk == wkgbmnqykcVar.f36545iwizpuwonk;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f36548zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((this.f36548zdlpuopuiu.hashCode() * 31) + this.f36547yggfygwlhe.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f36546jyumaefscl;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f36545iwizpuwonk);
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f36546jyumaefscl;
    }

    public String toString() {
        return "HeaderThreeSpecialBannerUiModel(itemId=" + this.f36548zdlpuopuiu + ", title=" + this.f36547yggfygwlhe + ", colorsUiModel=" + this.f36546jyumaefscl + ", isNeededPainting=" + this.f36545iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f36547yggfygwlhe;
    }
}
