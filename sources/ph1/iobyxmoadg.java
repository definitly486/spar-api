package ph1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f76636iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f76637zoijcleaow;

    public iobyxmoadg(List warnings, List limitedProducts) {
        zdlpuopuiu.btonecajqb(warnings, "warnings");
        zdlpuopuiu.btonecajqb(limitedProducts, "limitedProducts");
        this.f76636iobyxmoadg = warnings;
        this.f76637zoijcleaow = limitedProducts;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f76636iobyxmoadg, iobyxmoadgVar.f76636iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f76637zoijcleaow, iobyxmoadgVar.f76637zoijcleaow);
    }

    public int hashCode() {
        return (this.f76636iobyxmoadg.hashCode() * 31) + this.f76637zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f76637zoijcleaow;
    }

    public String toString() {
        return "AddProductsFromBannerResult(warnings=" + this.f76636iobyxmoadg + ", limitedProducts=" + this.f76637zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f76636iobyxmoadg;
    }
}
