package ux1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f114649iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f114650zoijcleaow;

    public lqeggnwhkg(boolean z13, nufgyqmvbu nufgyqmvbuVar) {
        this.f114649iobyxmoadg = z13;
        this.f114650zoijcleaow = nufgyqmvbuVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f114649iobyxmoadg == lqeggnwhkgVar.f114649iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f114650zoijcleaow, lqeggnwhkgVar.f114650zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f114649iobyxmoadg) * 31;
        nufgyqmvbu nufgyqmvbuVar = this.f114650zoijcleaow;
        return iHashCode + (nufgyqmvbuVar == null ? 0 : nufgyqmvbuVar.hashCode());
    }

    public final nufgyqmvbu iobyxmoadg() {
        return this.f114650zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f114649iobyxmoadg + ", purchaseItems=" + this.f114650zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f114649iobyxmoadg;
    }
}
