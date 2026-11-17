package g62;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f36541iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ColorsUiModel f36542jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f36543yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f36544zdlpuopuiu;

    public ppxfxbqfkf(String itemId, String title, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f36544zdlpuopuiu = itemId;
        this.f36543yggfygwlhe = title;
        this.f36542jyumaefscl = colorsUiModel;
        this.f36541iwizpuwonk = z13;
    }

    public final boolean eablkybsjg() {
        return this.f36541iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f36544zdlpuopuiu, ppxfxbqfkfVar.f36544zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f36543yggfygwlhe, ppxfxbqfkfVar.f36543yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f36542jyumaefscl, ppxfxbqfkfVar.f36542jyumaefscl) && this.f36541iwizpuwonk == ppxfxbqfkfVar.f36541iwizpuwonk;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f36544zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((this.f36544zdlpuopuiu.hashCode() * 31) + this.f36543yggfygwlhe.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f36542jyumaefscl;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f36541iwizpuwonk);
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f36542jyumaefscl;
    }

    public String toString() {
        return "HeaderSixSpecialBannerUiModel(itemId=" + this.f36544zdlpuopuiu + ", title=" + this.f36543yggfygwlhe + ", colorsUiModel=" + this.f36542jyumaefscl + ", isNeededPainting=" + this.f36541iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f36543yggfygwlhe;
    }
}
