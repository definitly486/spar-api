package aj1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f2094iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f2095zoijcleaow;

    public lqeggnwhkg(boolean z13, nufgyqmvbu nufgyqmvbuVar) {
        this.f2094iobyxmoadg = z13;
        this.f2095zoijcleaow = nufgyqmvbuVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f2094iobyxmoadg == lqeggnwhkgVar.f2094iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f2095zoijcleaow, lqeggnwhkgVar.f2095zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f2094iobyxmoadg) * 31;
        nufgyqmvbu nufgyqmvbuVar = this.f2095zoijcleaow;
        return iHashCode + (nufgyqmvbuVar == null ? 0 : nufgyqmvbuVar.hashCode());
    }

    public final nufgyqmvbu iobyxmoadg() {
        return this.f2095zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f2094iobyxmoadg + ", purchaseItems=" + this.f2095zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f2094iobyxmoadg;
    }
}
