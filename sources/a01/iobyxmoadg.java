package a01;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.product.Product;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Product f105iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f106zoijcleaow;

    public iobyxmoadg(Product product, boolean z13) {
        this.f105iobyxmoadg = product;
        this.f106zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f105iobyxmoadg, iobyxmoadgVar.f105iobyxmoadg) && this.f106zoijcleaow == iobyxmoadgVar.f106zoijcleaow;
    }

    public int hashCode() {
        Product product = this.f105iobyxmoadg;
        return ((product == null ? 0 : product.hashCode()) * 31) + Boolean.hashCode(this.f106zoijcleaow);
    }

    public final Product iobyxmoadg() {
        return this.f105iobyxmoadg;
    }

    public String toString() {
        return "ProductDetails(product=" + this.f105iobyxmoadg + ", isSectionsValid=" + this.f106zoijcleaow + ")";
    }
}
