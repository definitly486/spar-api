package t00;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.cart.CartProduct;
import ru.myspar.core.models.Warning;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CartProduct f109236iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Warning.DailyLimit f109237ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f109238zoijcleaow;

    public ppxfxbqfkf(CartProduct cartProduct, double d13, Warning.DailyLimit dailyLimit) {
        zdlpuopuiu.btonecajqb(cartProduct, "cartProduct");
        this.f109236iobyxmoadg = cartProduct;
        this.f109238zoijcleaow = d13;
        this.f109237ppxfxbqfkf = dailyLimit;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f109236iobyxmoadg, ppxfxbqfkfVar.f109236iobyxmoadg) && Double.compare(this.f109238zoijcleaow, ppxfxbqfkfVar.f109238zoijcleaow) == 0 && zdlpuopuiu.eablkybsjg(this.f109237ppxfxbqfkf, ppxfxbqfkfVar.f109237ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f109236iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f109238zoijcleaow)) * 31;
        Warning.DailyLimit dailyLimit = this.f109237ppxfxbqfkf;
        return iHashCode + (dailyLimit == null ? 0 : dailyLimit.hashCode());
    }

    public final double iobyxmoadg() {
        return this.f109238zoijcleaow;
    }

    public final Warning.DailyLimit ppxfxbqfkf() {
        return this.f109237ppxfxbqfkf;
    }

    public String toString() {
        return "AddToBasketResult(cartProduct=" + this.f109236iobyxmoadg + ", basketSum=" + this.f109238zoijcleaow + ", dailyLimitWarning=" + this.f109237ppxfxbqfkf + ")";
    }

    public final CartProduct zoijcleaow() {
        return this.f109236iobyxmoadg;
    }
}
