package d10;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f26681iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f26682ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f26683zoijcleaow;

    public iobyxmoadg(List orderProducts, List warnings, List limitedProductsIds) {
        zdlpuopuiu.btonecajqb(orderProducts, "orderProducts");
        zdlpuopuiu.btonecajqb(warnings, "warnings");
        zdlpuopuiu.btonecajqb(limitedProductsIds, "limitedProductsIds");
        this.f26681iobyxmoadg = orderProducts;
        this.f26683zoijcleaow = warnings;
        this.f26682ppxfxbqfkf = limitedProductsIds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f26681iobyxmoadg, iobyxmoadgVar.f26681iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f26683zoijcleaow, iobyxmoadgVar.f26683zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f26682ppxfxbqfkf, iobyxmoadgVar.f26682ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f26681iobyxmoadg.hashCode() * 31) + this.f26683zoijcleaow.hashCode()) * 31) + this.f26682ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f26682ppxfxbqfkf;
    }

    public final List ppxfxbqfkf() {
        return this.f26683zoijcleaow;
    }

    public String toString() {
        return "ChangeOrderProductsResult(orderProducts=" + this.f26681iobyxmoadg + ", warnings=" + this.f26683zoijcleaow + ", limitedProductsIds=" + this.f26682ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f26681iobyxmoadg;
    }
}
