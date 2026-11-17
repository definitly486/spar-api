package ux1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f114651iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f114652ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f114653wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ay1.iobyxmoadg f114654zoijcleaow;

    public nufgyqmvbu(List purchases, ay1.iobyxmoadg iobyxmoadgVar, boolean z13, int i13) {
        zdlpuopuiu.btonecajqb(purchases, "purchases");
        this.f114651iobyxmoadg = purchases;
        this.f114654zoijcleaow = iobyxmoadgVar;
        this.f114652ppxfxbqfkf = z13;
        this.f114653wkgbmnqykc = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f114651iobyxmoadg, nufgyqmvbuVar.f114651iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f114654zoijcleaow, nufgyqmvbuVar.f114654zoijcleaow) && this.f114652ppxfxbqfkf == nufgyqmvbuVar.f114652ppxfxbqfkf && this.f114653wkgbmnqykc == nufgyqmvbuVar.f114653wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = this.f114651iobyxmoadg.hashCode() * 31;
        ay1.iobyxmoadg iobyxmoadgVar = this.f114654zoijcleaow;
        return ((((iHashCode + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode())) * 31) + Boolean.hashCode(this.f114652ppxfxbqfkf)) * 31) + Integer.hashCode(this.f114653wkgbmnqykc);
    }

    public final int iobyxmoadg() {
        return this.f114653wkgbmnqykc;
    }

    public final List ppxfxbqfkf() {
        return this.f114651iobyxmoadg;
    }

    public String toString() {
        return "PurchaseItems(purchases=" + this.f114651iobyxmoadg + ", futurePurchases=" + this.f114654zoijcleaow + ", isPageLoading=" + this.f114652ppxfxbqfkf + ", currentPage=" + this.f114653wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f114652ppxfxbqfkf;
    }

    public final ay1.iobyxmoadg zoijcleaow() {
        return this.f114654zoijcleaow;
    }
}
