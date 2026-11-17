package ja1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f50939eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ColorsUiModel f50940iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f50941ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f50942wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f50943zoijcleaow;

    public nufgyqmvbu(ColorsUiModel colorsUiModel, List filterSections, List filterValues, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(colorsUiModel, "colorsUiModel");
        zdlpuopuiu.btonecajqb(filterSections, "filterSections");
        zdlpuopuiu.btonecajqb(filterValues, "filterValues");
        this.f50940iobyxmoadg = colorsUiModel;
        this.f50943zoijcleaow = filterSections;
        this.f50941ppxfxbqfkf = filterValues;
        this.f50942wkgbmnqykc = i13;
        this.f50939eablkybsjg = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f50940iobyxmoadg, nufgyqmvbuVar.f50940iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f50943zoijcleaow, nufgyqmvbuVar.f50943zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f50941ppxfxbqfkf, nufgyqmvbuVar.f50941ppxfxbqfkf) && this.f50942wkgbmnqykc == nufgyqmvbuVar.f50942wkgbmnqykc && this.f50939eablkybsjg == nufgyqmvbuVar.f50939eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f50940iobyxmoadg.hashCode() * 31) + this.f50943zoijcleaow.hashCode()) * 31) + this.f50941ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f50942wkgbmnqykc)) * 31) + Boolean.hashCode(this.f50939eablkybsjg);
    }

    public final int iobyxmoadg() {
        return this.f50942wkgbmnqykc;
    }

    public final List ppxfxbqfkf() {
        return this.f50941ppxfxbqfkf;
    }

    public String toString() {
        return "Model(colorsUiModel=" + this.f50940iobyxmoadg + ", filterSections=" + this.f50943zoijcleaow + ", filterValues=" + this.f50941ppxfxbqfkf + ", amountProducts=" + this.f50942wkgbmnqykc + ", isLoading=" + this.f50939eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f50939eablkybsjg;
    }

    public final ColorsUiModel zoijcleaow() {
        return this.f50940iobyxmoadg;
    }
}
