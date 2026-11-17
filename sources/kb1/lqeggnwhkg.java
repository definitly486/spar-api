package kb1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f54400iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f54401zoijcleaow;

    public lqeggnwhkg(List filterValues, boolean z13) {
        zdlpuopuiu.btonecajqb(filterValues, "filterValues");
        this.f54400iobyxmoadg = filterValues;
        this.f54401zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f54400iobyxmoadg, lqeggnwhkgVar.f54400iobyxmoadg) && this.f54401zoijcleaow == lqeggnwhkgVar.f54401zoijcleaow;
    }

    public int hashCode() {
        return (this.f54400iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f54401zoijcleaow);
    }

    public final List iobyxmoadg() {
        return this.f54400iobyxmoadg;
    }

    public String toString() {
        return "Model(filterValues=" + this.f54400iobyxmoadg + ", isLoading=" + this.f54401zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f54401zoijcleaow;
    }
}
