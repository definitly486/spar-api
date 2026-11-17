package od0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f72622iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f72623zoijcleaow;

    public lqeggnwhkg(List filterValues, boolean z13) {
        zdlpuopuiu.btonecajqb(filterValues, "filterValues");
        this.f72622iobyxmoadg = filterValues;
        this.f72623zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f72622iobyxmoadg, lqeggnwhkgVar.f72622iobyxmoadg) && this.f72623zoijcleaow == lqeggnwhkgVar.f72623zoijcleaow;
    }

    public int hashCode() {
        return (this.f72622iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f72623zoijcleaow);
    }

    public final List iobyxmoadg() {
        return this.f72622iobyxmoadg;
    }

    public String toString() {
        return "Model(filterValues=" + this.f72622iobyxmoadg + ", isLoading=" + this.f72623zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f72623zoijcleaow;
    }
}
