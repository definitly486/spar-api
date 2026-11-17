package kj1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f55740iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f55741zoijcleaow;

    public lqeggnwhkg(List purchaseLists, boolean z13) {
        zdlpuopuiu.btonecajqb(purchaseLists, "purchaseLists");
        this.f55740iobyxmoadg = purchaseLists;
        this.f55741zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f55740iobyxmoadg, lqeggnwhkgVar.f55740iobyxmoadg) && this.f55741zoijcleaow == lqeggnwhkgVar.f55741zoijcleaow;
    }

    public int hashCode() {
        return (this.f55740iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f55741zoijcleaow);
    }

    public final List iobyxmoadg() {
        return this.f55740iobyxmoadg;
    }

    public String toString() {
        return "Model(purchaseLists=" + this.f55740iobyxmoadg + ", isLoading=" + this.f55741zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f55741zoijcleaow;
    }
}
