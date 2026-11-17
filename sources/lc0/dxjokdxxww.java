package lc0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f62053iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f62054ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ColorsUiModel f62055wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f62056zoijcleaow;

    public dxjokdxxww(String titleFilterSection, boolean z13, List filterValueModels, ColorsUiModel colorsModel) {
        zdlpuopuiu.btonecajqb(titleFilterSection, "titleFilterSection");
        zdlpuopuiu.btonecajqb(filterValueModels, "filterValueModels");
        zdlpuopuiu.btonecajqb(colorsModel, "colorsModel");
        this.f62053iobyxmoadg = titleFilterSection;
        this.f62056zoijcleaow = z13;
        this.f62054ppxfxbqfkf = filterValueModels;
        this.f62055wkgbmnqykc = colorsModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f62053iobyxmoadg, dxjokdxxwwVar.f62053iobyxmoadg) && this.f62056zoijcleaow == dxjokdxxwwVar.f62056zoijcleaow && zdlpuopuiu.eablkybsjg(this.f62054ppxfxbqfkf, dxjokdxxwwVar.f62054ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f62055wkgbmnqykc, dxjokdxxwwVar.f62055wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f62053iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f62056zoijcleaow)) * 31) + this.f62054ppxfxbqfkf.hashCode()) * 31) + this.f62055wkgbmnqykc.hashCode();
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f62055wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f62053iobyxmoadg;
    }

    public String toString() {
        return "Model(titleFilterSection=" + this.f62053iobyxmoadg + ", isEnableApplyButton=" + this.f62056zoijcleaow + ", filterValueModels=" + this.f62054ppxfxbqfkf + ", colorsModel=" + this.f62055wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f62056zoijcleaow;
    }

    public final List zoijcleaow() {
        return this.f62054ppxfxbqfkf;
    }
}
