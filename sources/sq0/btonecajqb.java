package sq0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ColorsUiModel f107919eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f107920iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f107921ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f107922wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f107923zoijcleaow;

    public btonecajqb(boolean z13, List items, boolean z14, boolean z15, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f107920iobyxmoadg = z13;
        this.f107923zoijcleaow = items;
        this.f107921ppxfxbqfkf = z14;
        this.f107922wkgbmnqykc = z15;
        this.f107919eablkybsjg = colorsUiModel;
    }

    public final boolean eablkybsjg() {
        return this.f107921ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return this.f107920iobyxmoadg == btonecajqbVar.f107920iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f107923zoijcleaow, btonecajqbVar.f107923zoijcleaow) && this.f107921ppxfxbqfkf == btonecajqbVar.f107921ppxfxbqfkf && this.f107922wkgbmnqykc == btonecajqbVar.f107922wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f107919eablkybsjg, btonecajqbVar.f107919eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f107920iobyxmoadg) * 31) + this.f107923zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f107921ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f107922wkgbmnqykc)) * 31;
        ColorsUiModel colorsUiModel = this.f107919eablkybsjg;
        return iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode());
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f107919eablkybsjg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f107920iobyxmoadg;
    }

    public String toString() {
        return "Model(returnOrderIsVisible=" + this.f107920iobyxmoadg + ", items=" + this.f107923zoijcleaow + ", isLoading=" + this.f107921ppxfxbqfkf + ", isInitialLoading=" + this.f107922wkgbmnqykc + ", colorsModel=" + this.f107919eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f107922wkgbmnqykc;
    }

    public final List zoijcleaow() {
        return this.f107923zoijcleaow;
    }
}
