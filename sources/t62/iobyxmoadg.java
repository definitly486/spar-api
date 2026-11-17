package t62;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ColorsUiModel f109932iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f109933jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f109934yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f109935zdlpuopuiu;

    public iobyxmoadg(String itemId, String thumbnailUrl, String videoUrl, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(thumbnailUrl, "thumbnailUrl");
        zdlpuopuiu.btonecajqb(videoUrl, "videoUrl");
        this.f109935zdlpuopuiu = itemId;
        this.f109934yggfygwlhe = thumbnailUrl;
        this.f109933jyumaefscl = videoUrl;
        this.f109932iwizpuwonk = colorsUiModel;
    }

    public final String eablkybsjg() {
        return this.f109933jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f109935zdlpuopuiu, iobyxmoadgVar.f109935zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f109934yggfygwlhe, iobyxmoadgVar.f109934yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f109933jyumaefscl, iobyxmoadgVar.f109933jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f109932iwizpuwonk, iobyxmoadgVar.f109932iwizpuwonk);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f109935zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((((this.f109935zdlpuopuiu.hashCode() * 31) + this.f109934yggfygwlhe.hashCode()) * 31) + this.f109933jyumaefscl.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f109932iwizpuwonk;
        return iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode());
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f109932iwizpuwonk;
    }

    public String toString() {
        return "VideoSpecialBannerUIModel(itemId=" + this.f109935zdlpuopuiu + ", thumbnailUrl=" + this.f109934yggfygwlhe + ", videoUrl=" + this.f109933jyumaefscl + ", colorsModel=" + this.f109932iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f109934yggfygwlhe;
    }
}
