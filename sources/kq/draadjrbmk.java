package kq;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.product.model.cart.CartProductUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class draadjrbmk implements btonecajqb, gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CartProductUiModel f60346iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f60347ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f60348zoijcleaow;

    public draadjrbmk(CartProductUiModel product, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(product, "product");
        this.f60346iobyxmoadg = product;
        this.f60348zoijcleaow = z13;
        this.f60347ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return zdlpuopuiu.eablkybsjg(this.f60346iobyxmoadg, draadjrbmkVar.f60346iobyxmoadg) && this.f60348zoijcleaow == draadjrbmkVar.f60348zoijcleaow && this.f60347ppxfxbqfkf == draadjrbmkVar.f60347ppxfxbqfkf;
    }

    @Override // kq.btonecajqb
    public Object getId() {
        return iobyxmoadg().getId();
    }

    @Override // kq.btonecajqb
    public gtknphoqwx getType() {
        return gtknphoqwx.UNAVAILABLE_PRODUCT;
    }

    public int hashCode() {
        return (((this.f60346iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f60348zoijcleaow)) * 31) + Boolean.hashCode(this.f60347ppxfxbqfkf);
    }

    @Override // kq.gxszxtbevo
    public CartProductUiModel iobyxmoadg() {
        return this.f60346iobyxmoadg;
    }

    @Override // kq.gxszxtbevo
    public boolean isFirst() {
        return this.f60348zoijcleaow;
    }

    @Override // kq.gxszxtbevo
    public boolean isLast() {
        return this.f60347ppxfxbqfkf;
    }

    public String toString() {
        return "CartUnavailableProductUiModelWrapper(product=" + this.f60346iobyxmoadg + ", isFirst=" + this.f60348zoijcleaow + ", isLast=" + this.f60347ppxfxbqfkf + ")";
    }
}
