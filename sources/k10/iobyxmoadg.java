package k10;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.Product;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Product f53444iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f53445zoijcleaow;

    public iobyxmoadg(Product product, boolean z13) {
        this.f53444iobyxmoadg = product;
        this.f53445zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f53444iobyxmoadg, iobyxmoadgVar.f53444iobyxmoadg) && this.f53445zoijcleaow == iobyxmoadgVar.f53445zoijcleaow;
    }

    public int hashCode() {
        Product product = this.f53444iobyxmoadg;
        return ((product == null ? 0 : product.hashCode()) * 31) + Boolean.hashCode(this.f53445zoijcleaow);
    }

    public final Product iobyxmoadg() {
        return this.f53444iobyxmoadg;
    }

    public String toString() {
        return "ProductDetails(product=" + this.f53444iobyxmoadg + ", isSectionsValid=" + this.f53445zoijcleaow + ")";
    }
}
