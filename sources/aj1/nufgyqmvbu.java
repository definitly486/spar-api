package aj1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f2096iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f2097ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f2098wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gj1.iobyxmoadg f2099zoijcleaow;

    public nufgyqmvbu(List purchases, gj1.iobyxmoadg iobyxmoadgVar, boolean z13, int i13) {
        zdlpuopuiu.btonecajqb(purchases, "purchases");
        this.f2096iobyxmoadg = purchases;
        this.f2099zoijcleaow = iobyxmoadgVar;
        this.f2097ppxfxbqfkf = z13;
        this.f2098wkgbmnqykc = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f2096iobyxmoadg, nufgyqmvbuVar.f2096iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f2099zoijcleaow, nufgyqmvbuVar.f2099zoijcleaow) && this.f2097ppxfxbqfkf == nufgyqmvbuVar.f2097ppxfxbqfkf && this.f2098wkgbmnqykc == nufgyqmvbuVar.f2098wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = this.f2096iobyxmoadg.hashCode() * 31;
        gj1.iobyxmoadg iobyxmoadgVar = this.f2099zoijcleaow;
        return ((((iHashCode + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode())) * 31) + Boolean.hashCode(this.f2097ppxfxbqfkf)) * 31) + Integer.hashCode(this.f2098wkgbmnqykc);
    }

    public final int iobyxmoadg() {
        return this.f2098wkgbmnqykc;
    }

    public final List ppxfxbqfkf() {
        return this.f2096iobyxmoadg;
    }

    public String toString() {
        return "PurchaseItems(purchases=" + this.f2096iobyxmoadg + ", futurePurchases=" + this.f2099zoijcleaow + ", isPageLoading=" + this.f2097ppxfxbqfkf + ", currentPage=" + this.f2098wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f2097ppxfxbqfkf;
    }

    public final gj1.iobyxmoadg zoijcleaow() {
        return this.f2099zoijcleaow;
    }
}
