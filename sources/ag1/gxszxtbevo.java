package ag1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f1793iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f1794ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final sz0.eablkybsjg f1795zoijcleaow;

    public gxszxtbevo(boolean z13, sz0.eablkybsjg orderStatus, lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(orderStatus, "orderStatus");
        this.f1793iobyxmoadg = z13;
        this.f1795zoijcleaow = orderStatus;
        this.f1794ppxfxbqfkf = lqeggnwhkgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f1793iobyxmoadg == gxszxtbevoVar.f1793iobyxmoadg && this.f1795zoijcleaow == gxszxtbevoVar.f1795zoijcleaow && zdlpuopuiu.eablkybsjg(this.f1794ppxfxbqfkf, gxszxtbevoVar.f1794ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f1793iobyxmoadg) * 31) + this.f1795zoijcleaow.hashCode()) * 31;
        lqeggnwhkg lqeggnwhkgVar = this.f1794ppxfxbqfkf;
        return iHashCode + (lqeggnwhkgVar == null ? 0 : lqeggnwhkgVar.hashCode());
    }

    public final lqeggnwhkg iobyxmoadg() {
        return this.f1794ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f1793iobyxmoadg;
    }

    public String toString() {
        return "Model(isLoading=" + this.f1793iobyxmoadg + ", orderStatus=" + this.f1795zoijcleaow + ", orderItems=" + this.f1794ppxfxbqfkf + ")";
    }

    public final sz0.eablkybsjg zoijcleaow() {
        return this.f1795zoijcleaow;
    }
}
