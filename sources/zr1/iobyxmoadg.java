package zr1;

import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f131089cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ojitshcjhn f131090esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ColorsUiModel f131091iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f131092jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final String f131093lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f131094yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f131095zdlpuopuiu;

    public iobyxmoadg(String itemId, String title, boolean z13, ColorsUiModel colorsUiModel, boolean z14, ojitshcjhn navlink, String reference) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.f131095zdlpuopuiu = itemId;
        this.f131094yggfygwlhe = title;
        this.f131092jyumaefscl = z13;
        this.f131091iwizpuwonk = colorsUiModel;
        this.f131089cqumvgiudr = z14;
        this.f131090esjtqupxsv = navlink;
        this.f131093lereixgezr = reference;
    }

    public final boolean eablkybsjg() {
        return this.f131092jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f131095zdlpuopuiu, iobyxmoadgVar.f131095zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f131094yggfygwlhe, iobyxmoadgVar.f131094yggfygwlhe) && this.f131092jyumaefscl == iobyxmoadgVar.f131092jyumaefscl && zdlpuopuiu.eablkybsjg(this.f131091iwizpuwonk, iobyxmoadgVar.f131091iwizpuwonk) && this.f131089cqumvgiudr == iobyxmoadgVar.f131089cqumvgiudr && this.f131090esjtqupxsv == iobyxmoadgVar.f131090esjtqupxsv && zdlpuopuiu.eablkybsjg(this.f131093lereixgezr, iobyxmoadgVar.f131093lereixgezr);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f131095zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((((this.f131095zdlpuopuiu.hashCode() * 31) + this.f131094yggfygwlhe.hashCode()) * 31) + Boolean.hashCode(this.f131092jyumaefscl)) * 31;
        ColorsUiModel colorsUiModel = this.f131091iwizpuwonk;
        return ((((((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f131089cqumvgiudr)) * 31) + this.f131090esjtqupxsv.hashCode()) * 31) + this.f131093lereixgezr.hashCode();
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f131091iwizpuwonk;
    }

    public final boolean lqeggnwhkg() {
        return this.f131089cqumvgiudr;
    }

    public String toString() {
        return "HeaderFiveSpecialBannerUiModel(itemId=" + this.f131095zdlpuopuiu + ", title=" + this.f131094yggfygwlhe + ", isMoreButtonVisible=" + this.f131092jyumaefscl + ", colorsUiModel=" + this.f131091iwizpuwonk + ", isNeededPainting=" + this.f131089cqumvgiudr + ", navlink=" + this.f131090esjtqupxsv + ", reference=" + this.f131093lereixgezr + ")";
    }

    public final String wkgbmnqykc() {
        return this.f131094yggfygwlhe;
    }
}
