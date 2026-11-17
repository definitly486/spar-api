package ca0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ColorsUiModel f19374eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f19375iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f19376ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f19377wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f19378zoijcleaow;

    public gtknphoqwx(boolean z13, List items, String str, String str2, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(colorsUiModel, "colorsUiModel");
        this.f19375iobyxmoadg = z13;
        this.f19378zoijcleaow = items;
        this.f19376ppxfxbqfkf = str;
        this.f19377wkgbmnqykc = str2;
        this.f19374eablkybsjg = colorsUiModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtknphoqwx)) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        return this.f19375iobyxmoadg == gtknphoqwxVar.f19375iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f19378zoijcleaow, gtknphoqwxVar.f19378zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f19376ppxfxbqfkf, gtknphoqwxVar.f19376ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f19377wkgbmnqykc, gtknphoqwxVar.f19377wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f19374eablkybsjg, gtknphoqwxVar.f19374eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f19375iobyxmoadg) * 31) + this.f19378zoijcleaow.hashCode()) * 31;
        String str = this.f19376ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19377wkgbmnqykc;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f19374eablkybsjg.hashCode();
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f19374eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f19376ppxfxbqfkf;
    }

    public String toString() {
        return "Model(isLoading=" + this.f19375iobyxmoadg + ", items=" + this.f19378zoijcleaow + ", primaryButtonText=" + this.f19376ppxfxbqfkf + ", secondaryButtonText=" + this.f19377wkgbmnqykc + ", colorsUiModel=" + this.f19374eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f19377wkgbmnqykc;
    }

    public final List zoijcleaow() {
        return this.f19378zoijcleaow;
    }
}
