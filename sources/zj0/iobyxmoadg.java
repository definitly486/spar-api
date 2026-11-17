package zj0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f130276iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f130277zoijcleaow;

    public iobyxmoadg(List warnings, List limitedProducts) {
        zdlpuopuiu.btonecajqb(warnings, "warnings");
        zdlpuopuiu.btonecajqb(limitedProducts, "limitedProducts");
        this.f130276iobyxmoadg = warnings;
        this.f130277zoijcleaow = limitedProducts;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f130276iobyxmoadg, iobyxmoadgVar.f130276iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f130277zoijcleaow, iobyxmoadgVar.f130277zoijcleaow);
    }

    public int hashCode() {
        return (this.f130276iobyxmoadg.hashCode() * 31) + this.f130277zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f130277zoijcleaow;
    }

    public String toString() {
        return "AddProductsFromBannerResult(warnings=" + this.f130276iobyxmoadg + ", limitedProducts=" + this.f130277zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f130276iobyxmoadg;
    }
}
