package tb0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f110196iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ec0.eablkybsjg f110197ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f110198zoijcleaow;

    public nufgyqmvbu(boolean z13, List coupons, ec0.eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(coupons, "coupons");
        this.f110196iobyxmoadg = z13;
        this.f110198zoijcleaow = coupons;
        this.f110197ppxfxbqfkf = eablkybsjgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f110196iobyxmoadg == nufgyqmvbuVar.f110196iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f110198zoijcleaow, nufgyqmvbuVar.f110198zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f110197ppxfxbqfkf, nufgyqmvbuVar.f110197ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f110196iobyxmoadg) * 31) + this.f110198zoijcleaow.hashCode()) * 31;
        ec0.eablkybsjg eablkybsjgVar = this.f110197ppxfxbqfkf;
        return iHashCode + (eablkybsjgVar == null ? 0 : eablkybsjgVar.hashCode());
    }

    public final ec0.eablkybsjg iobyxmoadg() {
        return this.f110197ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f110196iobyxmoadg;
    }

    public String toString() {
        return "Model(isLoading=" + this.f110196iobyxmoadg + ", coupons=" + this.f110198zoijcleaow + ", couponDialogData=" + this.f110197ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f110198zoijcleaow;
    }
}
