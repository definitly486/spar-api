package g62;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f36549iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ColorsUiModel f36550jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f36551yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f36552zdlpuopuiu;

    public zoijcleaow(String itemId, String title, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f36552zdlpuopuiu = itemId;
        this.f36551yggfygwlhe = title;
        this.f36550jyumaefscl = colorsUiModel;
        this.f36549iwizpuwonk = z13;
    }

    public final boolean eablkybsjg() {
        return this.f36549iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f36552zdlpuopuiu, zoijcleaowVar.f36552zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f36551yggfygwlhe, zoijcleaowVar.f36551yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f36550jyumaefscl, zoijcleaowVar.f36550jyumaefscl) && this.f36549iwizpuwonk == zoijcleaowVar.f36549iwizpuwonk;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f36552zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((this.f36552zdlpuopuiu.hashCode() * 31) + this.f36551yggfygwlhe.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f36550jyumaefscl;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f36549iwizpuwonk);
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f36550jyumaefscl;
    }

    public String toString() {
        return "HeaderOneSpecialBannerUiModel(itemId=" + this.f36552zdlpuopuiu + ", title=" + this.f36551yggfygwlhe + ", colorsUiModel=" + this.f36550jyumaefscl + ", isNeededPainting=" + this.f36549iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f36551yggfygwlhe;
    }
}
