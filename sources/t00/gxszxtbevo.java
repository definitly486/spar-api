package t00;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f109222iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f109223ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f109224wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f109225zoijcleaow;

    public gxszxtbevo(List cartProducts, double d13, List warnings, List limitedProductsIds) {
        zdlpuopuiu.btonecajqb(cartProducts, "cartProducts");
        zdlpuopuiu.btonecajqb(warnings, "warnings");
        zdlpuopuiu.btonecajqb(limitedProductsIds, "limitedProductsIds");
        this.f109222iobyxmoadg = cartProducts;
        this.f109225zoijcleaow = d13;
        this.f109223ppxfxbqfkf = warnings;
        this.f109224wkgbmnqykc = limitedProductsIds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f109222iobyxmoadg, gxszxtbevoVar.f109222iobyxmoadg) && Double.compare(this.f109225zoijcleaow, gxszxtbevoVar.f109225zoijcleaow) == 0 && zdlpuopuiu.eablkybsjg(this.f109223ppxfxbqfkf, gxszxtbevoVar.f109223ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f109224wkgbmnqykc, gxszxtbevoVar.f109224wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f109222iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f109225zoijcleaow)) * 31) + this.f109223ppxfxbqfkf.hashCode()) * 31) + this.f109224wkgbmnqykc.hashCode();
    }

    public final double iobyxmoadg() {
        return this.f109225zoijcleaow;
    }

    public final List ppxfxbqfkf() {
        return this.f109224wkgbmnqykc;
    }

    public String toString() {
        return "ChangeProductsResult(cartProducts=" + this.f109222iobyxmoadg + ", basketSum=" + this.f109225zoijcleaow + ", warnings=" + this.f109223ppxfxbqfkf + ", limitedProductsIds=" + this.f109224wkgbmnqykc + ")";
    }

    public final List wkgbmnqykc() {
        return this.f109223ppxfxbqfkf;
    }

    public final List zoijcleaow() {
        return this.f109222iobyxmoadg;
    }
}
