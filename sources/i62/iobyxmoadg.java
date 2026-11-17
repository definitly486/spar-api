package i62;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f42038cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ColorsUiModel f42039esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f42040iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f42041jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final boolean f42042lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f42043yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f42044zdlpuopuiu;

    public iobyxmoadg(String itemId, String icon, String title, String description, String adv, ColorsUiModel colorsUiModel, boolean z13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f42044zdlpuopuiu = itemId;
        this.f42043yggfygwlhe = icon;
        this.f42041jyumaefscl = title;
        this.f42040iwizpuwonk = description;
        this.f42038cqumvgiudr = adv;
        this.f42039esjtqupxsv = colorsUiModel;
        this.f42042lereixgezr = z13;
    }

    public final String eablkybsjg() {
        return this.f42043yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f42044zdlpuopuiu, iobyxmoadgVar.f42044zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f42043yggfygwlhe, iobyxmoadgVar.f42043yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f42041jyumaefscl, iobyxmoadgVar.f42041jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f42040iwizpuwonk, iobyxmoadgVar.f42040iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f42038cqumvgiudr, iobyxmoadgVar.f42038cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f42039esjtqupxsv, iobyxmoadgVar.f42039esjtqupxsv) && this.f42042lereixgezr == iobyxmoadgVar.f42042lereixgezr;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f42044zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f42044zdlpuopuiu.hashCode() * 31) + this.f42043yggfygwlhe.hashCode()) * 31) + this.f42041jyumaefscl.hashCode()) * 31) + this.f42040iwizpuwonk.hashCode()) * 31) + this.f42038cqumvgiudr.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f42039esjtqupxsv;
        return ((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f42042lereixgezr);
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f42039esjtqupxsv;
    }

    public final String lqeggnwhkg() {
        return this.f42041jyumaefscl;
    }

    public final boolean nufgyqmvbu() {
        return this.f42042lereixgezr;
    }

    public String toString() {
        return "IconTwoUiModel(itemId=" + this.f42044zdlpuopuiu + ", icon=" + this.f42043yggfygwlhe + ", title=" + this.f42041jyumaefscl + ", description=" + this.f42040iwizpuwonk + ", adv=" + this.f42038cqumvgiudr + ", colorsUiModel=" + this.f42039esjtqupxsv + ", isNeededPainting=" + this.f42042lereixgezr + ")";
    }

    public final String wkgbmnqykc() {
        return this.f42040iwizpuwonk;
    }
}
