package s91;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f105840iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final da1.eablkybsjg f105841ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f105842zoijcleaow;

    public nufgyqmvbu(boolean z13, List coupons, da1.eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(coupons, "coupons");
        this.f105840iobyxmoadg = z13;
        this.f105842zoijcleaow = coupons;
        this.f105841ppxfxbqfkf = eablkybsjgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f105840iobyxmoadg == nufgyqmvbuVar.f105840iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f105842zoijcleaow, nufgyqmvbuVar.f105842zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f105841ppxfxbqfkf, nufgyqmvbuVar.f105841ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f105840iobyxmoadg) * 31) + this.f105842zoijcleaow.hashCode()) * 31;
        da1.eablkybsjg eablkybsjgVar = this.f105841ppxfxbqfkf;
        return iHashCode + (eablkybsjgVar == null ? 0 : eablkybsjgVar.hashCode());
    }

    public final da1.eablkybsjg iobyxmoadg() {
        return this.f105841ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f105840iobyxmoadg;
    }

    public String toString() {
        return "Model(isLoading=" + this.f105840iobyxmoadg + ", coupons=" + this.f105842zoijcleaow + ", couponDialogData=" + this.f105841ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f105842zoijcleaow;
    }
}
