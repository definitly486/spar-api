package ax;

import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f14674iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f14675ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f14676zoijcleaow;

    public zoijcleaow(Map products, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(products, "products");
        this.f14674iobyxmoadg = products;
        this.f14676zoijcleaow = z13;
        this.f14675ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f14674iobyxmoadg, zoijcleaowVar.f14674iobyxmoadg) && this.f14676zoijcleaow == zoijcleaowVar.f14676zoijcleaow && this.f14675ppxfxbqfkf == zoijcleaowVar.f14675ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f14674iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f14676zoijcleaow)) * 31) + Boolean.hashCode(this.f14675ppxfxbqfkf);
    }

    public final Map iobyxmoadg() {
        return this.f14674iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f14676zoijcleaow;
    }

    public String toString() {
        return "SpecialProductsInfo(products=" + this.f14674iobyxmoadg + ", isRatingEnabled=" + this.f14676zoijcleaow + ", isPurchaseListsEnabled=" + this.f14675ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f14675ppxfxbqfkf;
    }
}
