package kz0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f61164iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f61165ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f61166wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f61167zoijcleaow;

    public gxszxtbevo(List cartProducts, double d13, List warnings, List limitedProductsIds) {
        zdlpuopuiu.btonecajqb(cartProducts, "cartProducts");
        zdlpuopuiu.btonecajqb(warnings, "warnings");
        zdlpuopuiu.btonecajqb(limitedProductsIds, "limitedProductsIds");
        this.f61164iobyxmoadg = cartProducts;
        this.f61167zoijcleaow = d13;
        this.f61165ppxfxbqfkf = warnings;
        this.f61166wkgbmnqykc = limitedProductsIds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f61164iobyxmoadg, gxszxtbevoVar.f61164iobyxmoadg) && Double.compare(this.f61167zoijcleaow, gxszxtbevoVar.f61167zoijcleaow) == 0 && zdlpuopuiu.eablkybsjg(this.f61165ppxfxbqfkf, gxszxtbevoVar.f61165ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f61166wkgbmnqykc, gxszxtbevoVar.f61166wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f61164iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f61167zoijcleaow)) * 31) + this.f61165ppxfxbqfkf.hashCode()) * 31) + this.f61166wkgbmnqykc.hashCode();
    }

    public final double iobyxmoadg() {
        return this.f61167zoijcleaow;
    }

    public final List ppxfxbqfkf() {
        return this.f61166wkgbmnqykc;
    }

    public String toString() {
        return "ChangeProductsResult(cartProducts=" + this.f61164iobyxmoadg + ", basketSum=" + this.f61167zoijcleaow + ", warnings=" + this.f61165ppxfxbqfkf + ", limitedProductsIds=" + this.f61166wkgbmnqykc + ")";
    }

    public final List wkgbmnqykc() {
        return this.f61165ppxfxbqfkf;
    }

    public final List zoijcleaow() {
        return this.f61164iobyxmoadg;
    }
}
