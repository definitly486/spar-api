package uv0;

import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f114500iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f114501ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f114502zoijcleaow;

    public zoijcleaow(Map products, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(products, "products");
        this.f114500iobyxmoadg = products;
        this.f114502zoijcleaow = z13;
        this.f114501ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f114500iobyxmoadg, zoijcleaowVar.f114500iobyxmoadg) && this.f114502zoijcleaow == zoijcleaowVar.f114502zoijcleaow && this.f114501ppxfxbqfkf == zoijcleaowVar.f114501ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f114500iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f114502zoijcleaow)) * 31) + Boolean.hashCode(this.f114501ppxfxbqfkf);
    }

    public final Map iobyxmoadg() {
        return this.f114500iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f114502zoijcleaow;
    }

    public String toString() {
        return "SpecialProductsInfo(products=" + this.f114500iobyxmoadg + ", isRatingEnabled=" + this.f114502zoijcleaow + ", isPurchaseListsEnabled=" + this.f114501ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f114501ppxfxbqfkf;
    }
}
