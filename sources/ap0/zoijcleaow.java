package ap0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f14070iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f14071zoijcleaow;

    public zoijcleaow(iobyxmoadg iobyxmoadgVar, List subCatalogs) {
        zdlpuopuiu.btonecajqb(subCatalogs, "subCatalogs");
        this.f14070iobyxmoadg = iobyxmoadgVar;
        this.f14071zoijcleaow = subCatalogs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f14070iobyxmoadg, zoijcleaowVar.f14070iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14071zoijcleaow, zoijcleaowVar.f14071zoijcleaow);
    }

    public int hashCode() {
        iobyxmoadg iobyxmoadgVar = this.f14070iobyxmoadg;
        return ((iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode()) * 31) + this.f14071zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f14071zoijcleaow;
    }

    public String toString() {
        return "CatalogWithSubCatalogsUiModel(rootCatalog=" + this.f14070iobyxmoadg + ", subCatalogs=" + this.f14071zoijcleaow + ")";
    }
}
