package aj0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f2085iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f2086ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final c10.gxszxtbevo f2087zoijcleaow;

    public gxszxtbevo(boolean z13, c10.gxszxtbevo orderStatus, lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(orderStatus, "orderStatus");
        this.f2085iobyxmoadg = z13;
        this.f2087zoijcleaow = orderStatus;
        this.f2086ppxfxbqfkf = lqeggnwhkgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f2085iobyxmoadg == gxszxtbevoVar.f2085iobyxmoadg && this.f2087zoijcleaow == gxszxtbevoVar.f2087zoijcleaow && zdlpuopuiu.eablkybsjg(this.f2086ppxfxbqfkf, gxszxtbevoVar.f2086ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f2085iobyxmoadg) * 31) + this.f2087zoijcleaow.hashCode()) * 31;
        lqeggnwhkg lqeggnwhkgVar = this.f2086ppxfxbqfkf;
        return iHashCode + (lqeggnwhkgVar == null ? 0 : lqeggnwhkgVar.hashCode());
    }

    public final lqeggnwhkg iobyxmoadg() {
        return this.f2086ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f2085iobyxmoadg;
    }

    public String toString() {
        return "Model(isLoading=" + this.f2085iobyxmoadg + ", orderStatus=" + this.f2087zoijcleaow + ", orderItems=" + this.f2086ppxfxbqfkf + ")";
    }

    public final c10.gxszxtbevo zoijcleaow() {
        return this.f2087zoijcleaow;
    }
}
