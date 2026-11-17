package ag1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f1796iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f1797ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f1798zoijcleaow;

    public lqeggnwhkg(List orders, boolean z13, int i13) {
        zdlpuopuiu.btonecajqb(orders, "orders");
        this.f1796iobyxmoadg = orders;
        this.f1798zoijcleaow = z13;
        this.f1797ppxfxbqfkf = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f1796iobyxmoadg, lqeggnwhkgVar.f1796iobyxmoadg) && this.f1798zoijcleaow == lqeggnwhkgVar.f1798zoijcleaow && this.f1797ppxfxbqfkf == lqeggnwhkgVar.f1797ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f1796iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f1798zoijcleaow)) * 31) + Integer.hashCode(this.f1797ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f1797ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f1798zoijcleaow;
    }

    public String toString() {
        return "OrderItems(orders=" + this.f1796iobyxmoadg + ", isPageLoading=" + this.f1798zoijcleaow + ", currentPage=" + this.f1797ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f1796iobyxmoadg;
    }
}
