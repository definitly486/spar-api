package ka1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f54361iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f54362ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ColorsUiModel f54363wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f54364zoijcleaow;

    public dxjokdxxww(String titleFilterSection, boolean z13, List filterValueModels, ColorsUiModel colorsModel) {
        zdlpuopuiu.btonecajqb(titleFilterSection, "titleFilterSection");
        zdlpuopuiu.btonecajqb(filterValueModels, "filterValueModels");
        zdlpuopuiu.btonecajqb(colorsModel, "colorsModel");
        this.f54361iobyxmoadg = titleFilterSection;
        this.f54364zoijcleaow = z13;
        this.f54362ppxfxbqfkf = filterValueModels;
        this.f54363wkgbmnqykc = colorsModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f54361iobyxmoadg, dxjokdxxwwVar.f54361iobyxmoadg) && this.f54364zoijcleaow == dxjokdxxwwVar.f54364zoijcleaow && zdlpuopuiu.eablkybsjg(this.f54362ppxfxbqfkf, dxjokdxxwwVar.f54362ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f54363wkgbmnqykc, dxjokdxxwwVar.f54363wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f54361iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f54364zoijcleaow)) * 31) + this.f54362ppxfxbqfkf.hashCode()) * 31) + this.f54363wkgbmnqykc.hashCode();
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f54363wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f54361iobyxmoadg;
    }

    public String toString() {
        return "Model(titleFilterSection=" + this.f54361iobyxmoadg + ", isEnableApplyButton=" + this.f54364zoijcleaow + ", filterValueModels=" + this.f54362ppxfxbqfkf + ", colorsModel=" + this.f54363wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f54364zoijcleaow;
    }

    public final List zoijcleaow() {
        return this.f54362ppxfxbqfkf;
    }
}
