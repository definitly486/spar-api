package oq;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f74108iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f74109zoijcleaow;

    public zoijcleaow(iobyxmoadg iobyxmoadgVar, List subCatalogs) {
        zdlpuopuiu.btonecajqb(subCatalogs, "subCatalogs");
        this.f74108iobyxmoadg = iobyxmoadgVar;
        this.f74109zoijcleaow = subCatalogs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f74108iobyxmoadg, zoijcleaowVar.f74108iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f74109zoijcleaow, zoijcleaowVar.f74109zoijcleaow);
    }

    public int hashCode() {
        iobyxmoadg iobyxmoadgVar = this.f74108iobyxmoadg;
        return ((iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode()) * 31) + this.f74109zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f74109zoijcleaow;
    }

    public String toString() {
        return "CatalogWithSubCatalogsUiModel(rootCatalog=" + this.f74108iobyxmoadg + ", subCatalogs=" + this.f74109zoijcleaow + ")";
    }
}
