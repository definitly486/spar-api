package wo0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.product.model.cart.CartProductUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class wflxmlrfwp implements gtknphoqwx, lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CartProductUiModel f120332iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f120333ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f120334zoijcleaow;

    public wflxmlrfwp(CartProductUiModel product, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(product, "product");
        this.f120332iobyxmoadg = product;
        this.f120334zoijcleaow = z13;
        this.f120333ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return zdlpuopuiu.eablkybsjg(this.f120332iobyxmoadg, wflxmlrfwpVar.f120332iobyxmoadg) && this.f120334zoijcleaow == wflxmlrfwpVar.f120334zoijcleaow && this.f120333ppxfxbqfkf == wflxmlrfwpVar.f120333ppxfxbqfkf;
    }

    @Override // wo0.gtknphoqwx
    public Object getId() {
        return iobyxmoadg().getId();
    }

    @Override // wo0.gtknphoqwx
    public draadjrbmk getType() {
        return draadjrbmk.UNAVAILABLE_PRODUCT;
    }

    public int hashCode() {
        return (((this.f120332iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f120334zoijcleaow)) * 31) + Boolean.hashCode(this.f120333ppxfxbqfkf);
    }

    @Override // wo0.lqeggnwhkg
    public CartProductUiModel iobyxmoadg() {
        return this.f120332iobyxmoadg;
    }

    @Override // wo0.lqeggnwhkg
    public boolean isFirst() {
        return this.f120334zoijcleaow;
    }

    @Override // wo0.lqeggnwhkg
    public boolean isLast() {
        return this.f120333ppxfxbqfkf;
    }

    public String toString() {
        return "CartUnavailableProductUiModelWrapper(product=" + this.f120332iobyxmoadg + ", isFirst=" + this.f120334zoijcleaow + ", isLast=" + this.f120333ppxfxbqfkf + ")";
    }
}
