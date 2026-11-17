package g62;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f36534cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final f40.zoijcleaow f36535esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ColorsUiModel f36536iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f36537jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final String f36538lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f36539yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f36540zdlpuopuiu;

    public iobyxmoadg(String itemId, String title, boolean z13, ColorsUiModel colorsUiModel, boolean z14, f40.zoijcleaow navlink, String reference) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.f36540zdlpuopuiu = itemId;
        this.f36539yggfygwlhe = title;
        this.f36537jyumaefscl = z13;
        this.f36536iwizpuwonk = colorsUiModel;
        this.f36534cqumvgiudr = z14;
        this.f36535esjtqupxsv = navlink;
        this.f36538lereixgezr = reference;
    }

    public final boolean eablkybsjg() {
        return this.f36537jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f36540zdlpuopuiu, iobyxmoadgVar.f36540zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f36539yggfygwlhe, iobyxmoadgVar.f36539yggfygwlhe) && this.f36537jyumaefscl == iobyxmoadgVar.f36537jyumaefscl && zdlpuopuiu.eablkybsjg(this.f36536iwizpuwonk, iobyxmoadgVar.f36536iwizpuwonk) && this.f36534cqumvgiudr == iobyxmoadgVar.f36534cqumvgiudr && this.f36535esjtqupxsv == iobyxmoadgVar.f36535esjtqupxsv && zdlpuopuiu.eablkybsjg(this.f36538lereixgezr, iobyxmoadgVar.f36538lereixgezr);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f36540zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((((this.f36540zdlpuopuiu.hashCode() * 31) + this.f36539yggfygwlhe.hashCode()) * 31) + Boolean.hashCode(this.f36537jyumaefscl)) * 31;
        ColorsUiModel colorsUiModel = this.f36536iwizpuwonk;
        return ((((((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f36534cqumvgiudr)) * 31) + this.f36535esjtqupxsv.hashCode()) * 31) + this.f36538lereixgezr.hashCode();
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f36536iwizpuwonk;
    }

    public final boolean lqeggnwhkg() {
        return this.f36534cqumvgiudr;
    }

    public String toString() {
        return "HeaderFiveSpecialBannerUiModel(itemId=" + this.f36540zdlpuopuiu + ", title=" + this.f36539yggfygwlhe + ", isMoreButtonVisible=" + this.f36537jyumaefscl + ", colorsUiModel=" + this.f36536iwizpuwonk + ", isNeededPainting=" + this.f36534cqumvgiudr + ", navlink=" + this.f36535esjtqupxsv + ", reference=" + this.f36538lereixgezr + ")";
    }

    public final String wkgbmnqykc() {
        return this.f36539yggfygwlhe;
    }
}
