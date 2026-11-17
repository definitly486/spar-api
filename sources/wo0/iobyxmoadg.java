package wo0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.product.model.cart.CartProductUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements gtknphoqwx, lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CartProductUiModel f120314iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f120315ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f120316zoijcleaow;

    public iobyxmoadg(CartProductUiModel product, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(product, "product");
        this.f120314iobyxmoadg = product;
        this.f120316zoijcleaow = z13;
        this.f120315ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f120314iobyxmoadg, iobyxmoadgVar.f120314iobyxmoadg) && this.f120316zoijcleaow == iobyxmoadgVar.f120316zoijcleaow && this.f120315ppxfxbqfkf == iobyxmoadgVar.f120315ppxfxbqfkf;
    }

    @Override // wo0.gtknphoqwx
    public Object getId() {
        return iobyxmoadg().getId();
    }

    @Override // wo0.gtknphoqwx
    public draadjrbmk getType() {
        return draadjrbmk.AVAILABLE_PRODUCT;
    }

    public int hashCode() {
        return (((this.f120314iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f120316zoijcleaow)) * 31) + Boolean.hashCode(this.f120315ppxfxbqfkf);
    }

    @Override // wo0.lqeggnwhkg
    public CartProductUiModel iobyxmoadg() {
        return this.f120314iobyxmoadg;
    }

    @Override // wo0.lqeggnwhkg
    public boolean isFirst() {
        return this.f120316zoijcleaow;
    }

    @Override // wo0.lqeggnwhkg
    public boolean isLast() {
        return this.f120315ppxfxbqfkf;
    }

    public String toString() {
        return "CartAvailableProductUiModelWrapper(product=" + this.f120314iobyxmoadg + ", isFirst=" + this.f120316zoijcleaow + ", isLast=" + this.f120315ppxfxbqfkf + ")";
    }
}
