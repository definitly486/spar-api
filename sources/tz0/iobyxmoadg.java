package tz0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f112322iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f112323ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f112324zoijcleaow;

    public iobyxmoadg(List orderProducts, List warnings, List limitedProductsIds) {
        zdlpuopuiu.btonecajqb(orderProducts, "orderProducts");
        zdlpuopuiu.btonecajqb(warnings, "warnings");
        zdlpuopuiu.btonecajqb(limitedProductsIds, "limitedProductsIds");
        this.f112322iobyxmoadg = orderProducts;
        this.f112324zoijcleaow = warnings;
        this.f112323ppxfxbqfkf = limitedProductsIds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f112322iobyxmoadg, iobyxmoadgVar.f112322iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112324zoijcleaow, iobyxmoadgVar.f112324zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f112323ppxfxbqfkf, iobyxmoadgVar.f112323ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f112322iobyxmoadg.hashCode() * 31) + this.f112324zoijcleaow.hashCode()) * 31) + this.f112323ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f112323ppxfxbqfkf;
    }

    public final List ppxfxbqfkf() {
        return this.f112324zoijcleaow;
    }

    public String toString() {
        return "ChangeOrderProductsResult(orderProducts=" + this.f112322iobyxmoadg + ", warnings=" + this.f112324zoijcleaow + ", limitedProductsIds=" + this.f112323ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f112322iobyxmoadg;
    }
}
