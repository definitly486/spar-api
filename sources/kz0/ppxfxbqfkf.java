package kz0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;
import ru.myspar.proloyalty.core.models.Warning;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CartProduct f61176iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Warning.DailyLimit f61177ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f61178zoijcleaow;

    public ppxfxbqfkf(CartProduct cartProduct, double d13, Warning.DailyLimit dailyLimit) {
        zdlpuopuiu.btonecajqb(cartProduct, "cartProduct");
        this.f61176iobyxmoadg = cartProduct;
        this.f61178zoijcleaow = d13;
        this.f61177ppxfxbqfkf = dailyLimit;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f61176iobyxmoadg, ppxfxbqfkfVar.f61176iobyxmoadg) && Double.compare(this.f61178zoijcleaow, ppxfxbqfkfVar.f61178zoijcleaow) == 0 && zdlpuopuiu.eablkybsjg(this.f61177ppxfxbqfkf, ppxfxbqfkfVar.f61177ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f61176iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f61178zoijcleaow)) * 31;
        Warning.DailyLimit dailyLimit = this.f61177ppxfxbqfkf;
        return iHashCode + (dailyLimit == null ? 0 : dailyLimit.hashCode());
    }

    public final double iobyxmoadg() {
        return this.f61178zoijcleaow;
    }

    public final Warning.DailyLimit ppxfxbqfkf() {
        return this.f61177ppxfxbqfkf;
    }

    public String toString() {
        return "AddToBasketResult(cartProduct=" + this.f61176iobyxmoadg + ", basketSum=" + this.f61178zoijcleaow + ", dailyLimitWarning=" + this.f61177ppxfxbqfkf + ")";
    }

    public final CartProduct zoijcleaow() {
        return this.f61176iobyxmoadg;
    }
}
