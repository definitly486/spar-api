package bs1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f17037cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ColorsUiModel f17038esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f17039iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f17040jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final boolean f17041lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f17042yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f17043zdlpuopuiu;

    public iobyxmoadg(String itemId, String icon, String title, String description, String adv, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f17043zdlpuopuiu = itemId;
        this.f17042yggfygwlhe = icon;
        this.f17040jyumaefscl = title;
        this.f17039iwizpuwonk = description;
        this.f17037cqumvgiudr = adv;
        this.f17038esjtqupxsv = colorsUiModel;
        this.f17041lereixgezr = z13;
    }

    public final String eablkybsjg() {
        return this.f17042yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f17043zdlpuopuiu, iobyxmoadgVar.f17043zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f17042yggfygwlhe, iobyxmoadgVar.f17042yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f17040jyumaefscl, iobyxmoadgVar.f17040jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f17039iwizpuwonk, iobyxmoadgVar.f17039iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f17037cqumvgiudr, iobyxmoadgVar.f17037cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f17038esjtqupxsv, iobyxmoadgVar.f17038esjtqupxsv) && this.f17041lereixgezr == iobyxmoadgVar.f17041lereixgezr;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f17043zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f17043zdlpuopuiu.hashCode() * 31) + this.f17042yggfygwlhe.hashCode()) * 31) + this.f17040jyumaefscl.hashCode()) * 31) + this.f17039iwizpuwonk.hashCode()) * 31) + this.f17037cqumvgiudr.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f17038esjtqupxsv;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f17041lereixgezr);
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f17038esjtqupxsv;
    }

    public final String lqeggnwhkg() {
        return this.f17040jyumaefscl;
    }

    public final boolean nufgyqmvbu() {
        return this.f17041lereixgezr;
    }

    public String toString() {
        return "IconTwoUiModel(itemId=" + this.f17043zdlpuopuiu + ", icon=" + this.f17042yggfygwlhe + ", title=" + this.f17040jyumaefscl + ", description=" + this.f17039iwizpuwonk + ", adv=" + this.f17037cqumvgiudr + ", colorsUiModel=" + this.f17038esjtqupxsv + ", isNeededPainting=" + this.f17041lereixgezr + ")";
    }

    public final String wkgbmnqykc() {
        return this.f17039iwizpuwonk;
    }
}
