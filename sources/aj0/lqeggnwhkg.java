package aj0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f2088iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f2089ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f2090zoijcleaow;

    public lqeggnwhkg(List orders, boolean z13, int i13) {
        zdlpuopuiu.btonecajqb(orders, "orders");
        this.f2088iobyxmoadg = orders;
        this.f2090zoijcleaow = z13;
        this.f2089ppxfxbqfkf = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f2088iobyxmoadg, lqeggnwhkgVar.f2088iobyxmoadg) && this.f2090zoijcleaow == lqeggnwhkgVar.f2090zoijcleaow && this.f2089ppxfxbqfkf == lqeggnwhkgVar.f2089ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f2088iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f2090zoijcleaow)) * 31) + Integer.hashCode(this.f2089ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f2089ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f2090zoijcleaow;
    }

    public String toString() {
        return "OrderItems(orders=" + this.f2088iobyxmoadg + ", isPageLoading=" + this.f2090zoijcleaow + ", currentPage=" + this.f2089ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f2088iobyxmoadg;
    }
}
