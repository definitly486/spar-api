package ly1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.impl.lists.presentation.model.PurchaseListUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final PurchaseListUiModel f64533iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f64534ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f64535wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f64536zoijcleaow;

    public nufgyqmvbu(PurchaseListUiModel purchaseList, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(purchaseList, "purchaseList");
        this.f64533iobyxmoadg = purchaseList;
        this.f64536zoijcleaow = z13;
        this.f64534ppxfxbqfkf = z14;
        this.f64535wkgbmnqykc = z15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f64533iobyxmoadg, nufgyqmvbuVar.f64533iobyxmoadg) && this.f64536zoijcleaow == nufgyqmvbuVar.f64536zoijcleaow && this.f64534ppxfxbqfkf == nufgyqmvbuVar.f64534ppxfxbqfkf && this.f64535wkgbmnqykc == nufgyqmvbuVar.f64535wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f64533iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f64536zoijcleaow)) * 31) + Boolean.hashCode(this.f64534ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f64535wkgbmnqykc);
    }

    public final PurchaseListUiModel iobyxmoadg() {
        return this.f64533iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f64534ppxfxbqfkf;
    }

    public String toString() {
        return "Model(purchaseList=" + this.f64533iobyxmoadg + ", isUserHasTheSamePurchaseList=" + this.f64536zoijcleaow + ", isPurchaseListFeatureEnabled=" + this.f64534ppxfxbqfkf + ", isLoading=" + this.f64535wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f64536zoijcleaow;
    }

    public final boolean zoijcleaow() {
        return this.f64535wkgbmnqykc;
    }
}
