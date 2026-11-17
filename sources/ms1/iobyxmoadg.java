package ms1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f67885iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ColorsUiModel f67886ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f67887wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f67888zoijcleaow;

    public iobyxmoadg(String previewUrl, String videoUrl, ColorsUiModel colorsUiModel, String adv) {
        zdlpuopuiu.btonecajqb(previewUrl, "previewUrl");
        zdlpuopuiu.btonecajqb(videoUrl, "videoUrl");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f67885iobyxmoadg = previewUrl;
        this.f67888zoijcleaow = videoUrl;
        this.f67886ppxfxbqfkf = colorsUiModel;
        this.f67887wkgbmnqykc = adv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f67885iobyxmoadg, iobyxmoadgVar.f67885iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67888zoijcleaow, iobyxmoadgVar.f67888zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f67886ppxfxbqfkf, iobyxmoadgVar.f67886ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f67887wkgbmnqykc, iobyxmoadgVar.f67887wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((this.f67885iobyxmoadg.hashCode() * 31) + this.f67888zoijcleaow.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f67886ppxfxbqfkf;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + this.f67887wkgbmnqykc.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f67887wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f67885iobyxmoadg;
    }

    public String toString() {
        return "VideoSpecialBannerUIModel(previewUrl=" + this.f67885iobyxmoadg + ", videoUrl=" + this.f67888zoijcleaow + ", colorsModel=" + this.f67886ppxfxbqfkf + ", adv=" + this.f67887wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f67888zoijcleaow;
    }

    public final ColorsUiModel zoijcleaow() {
        return this.f67886ppxfxbqfkf;
    }
}
