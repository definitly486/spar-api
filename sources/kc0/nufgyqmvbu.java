package kc0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f54447eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ColorsUiModel f54448iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f54449ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f54450wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f54451zoijcleaow;

    public nufgyqmvbu(ColorsUiModel colorsUiModel, List filterSections, List filterValues, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(colorsUiModel, "colorsUiModel");
        zdlpuopuiu.btonecajqb(filterSections, "filterSections");
        zdlpuopuiu.btonecajqb(filterValues, "filterValues");
        this.f54448iobyxmoadg = colorsUiModel;
        this.f54451zoijcleaow = filterSections;
        this.f54449ppxfxbqfkf = filterValues;
        this.f54450wkgbmnqykc = i13;
        this.f54447eablkybsjg = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f54448iobyxmoadg, nufgyqmvbuVar.f54448iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f54451zoijcleaow, nufgyqmvbuVar.f54451zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f54449ppxfxbqfkf, nufgyqmvbuVar.f54449ppxfxbqfkf) && this.f54450wkgbmnqykc == nufgyqmvbuVar.f54450wkgbmnqykc && this.f54447eablkybsjg == nufgyqmvbuVar.f54447eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f54448iobyxmoadg.hashCode() * 31) + this.f54451zoijcleaow.hashCode()) * 31) + this.f54449ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f54450wkgbmnqykc)) * 31) + Boolean.hashCode(this.f54447eablkybsjg);
    }

    public final int iobyxmoadg() {
        return this.f54450wkgbmnqykc;
    }

    public final List ppxfxbqfkf() {
        return this.f54449ppxfxbqfkf;
    }

    public String toString() {
        return "Model(colorsUiModel=" + this.f54448iobyxmoadg + ", filterSections=" + this.f54451zoijcleaow + ", filterValues=" + this.f54449ppxfxbqfkf + ", amountProducts=" + this.f54450wkgbmnqykc + ", isLoading=" + this.f54447eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f54447eablkybsjg;
    }

    public final ColorsUiModel zoijcleaow() {
        return this.f54448iobyxmoadg;
    }
}
