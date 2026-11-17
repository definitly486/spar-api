package kq;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.product.model.cart.CartProductUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements btonecajqb, gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CartProductUiModel f60372iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f60373ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f60374zoijcleaow;

    public iobyxmoadg(CartProductUiModel product, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(product, "product");
        this.f60372iobyxmoadg = product;
        this.f60374zoijcleaow = z13;
        this.f60373ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f60372iobyxmoadg, iobyxmoadgVar.f60372iobyxmoadg) && this.f60374zoijcleaow == iobyxmoadgVar.f60374zoijcleaow && this.f60373ppxfxbqfkf == iobyxmoadgVar.f60373ppxfxbqfkf;
    }

    @Override // kq.btonecajqb
    public Object getId() {
        return iobyxmoadg().getId();
    }

    @Override // kq.btonecajqb
    public gtknphoqwx getType() {
        return gtknphoqwx.AVAILABLE_PRODUCT;
    }

    public int hashCode() {
        return (((this.f60372iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f60374zoijcleaow)) * 31) + Boolean.hashCode(this.f60373ppxfxbqfkf);
    }

    @Override // kq.gxszxtbevo
    public CartProductUiModel iobyxmoadg() {
        return this.f60372iobyxmoadg;
    }

    @Override // kq.gxszxtbevo
    public boolean isFirst() {
        return this.f60374zoijcleaow;
    }

    @Override // kq.gxszxtbevo
    public boolean isLast() {
        return this.f60373ppxfxbqfkf;
    }

    public String toString() {
        return "CartAvailableProductUiModelWrapper(product=" + this.f60372iobyxmoadg + ", isFirst=" + this.f60374zoijcleaow + ", isLast=" + this.f60373ppxfxbqfkf + ")";
    }
}
