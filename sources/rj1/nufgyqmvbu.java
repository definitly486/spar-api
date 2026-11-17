package rj1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.lists.presentation.model.PurchaseListUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final PurchaseListUiModel f82940iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f82941ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f82942wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f82943zoijcleaow;

    public nufgyqmvbu(PurchaseListUiModel purchaseList, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(purchaseList, "purchaseList");
        this.f82940iobyxmoadg = purchaseList;
        this.f82943zoijcleaow = z13;
        this.f82941ppxfxbqfkf = z14;
        this.f82942wkgbmnqykc = z15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f82940iobyxmoadg, nufgyqmvbuVar.f82940iobyxmoadg) && this.f82943zoijcleaow == nufgyqmvbuVar.f82943zoijcleaow && this.f82941ppxfxbqfkf == nufgyqmvbuVar.f82941ppxfxbqfkf && this.f82942wkgbmnqykc == nufgyqmvbuVar.f82942wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f82940iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f82943zoijcleaow)) * 31) + Boolean.hashCode(this.f82941ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f82942wkgbmnqykc);
    }

    public final PurchaseListUiModel iobyxmoadg() {
        return this.f82940iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f82941ppxfxbqfkf;
    }

    public String toString() {
        return "Model(purchaseList=" + this.f82940iobyxmoadg + ", isUserHasTheSamePurchaseList=" + this.f82943zoijcleaow + ", isPurchaseListFeatureEnabled=" + this.f82941ppxfxbqfkf + ", isLoading=" + this.f82942wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f82943zoijcleaow;
    }

    public final boolean zoijcleaow() {
        return this.f82942wkgbmnqykc;
    }
}
