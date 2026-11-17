package dq0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg implements jt0.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f29321yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ProductUiModel f29322zdlpuopuiu;

    public lqeggnwhkg(ProductUiModel product) {
        zdlpuopuiu.btonecajqb(product, "product");
        this.f29322zdlpuopuiu = product;
        this.f29321yggfygwlhe = lqeggnwhkg.class.getName() + product.getId();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f29322zdlpuopuiu, ((lqeggnwhkg) obj).f29322zdlpuopuiu);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f29321yggfygwlhe;
    }

    public int hashCode() {
        return this.f29322zdlpuopuiu.hashCode();
    }

    public final ProductUiModel iobyxmoadg() {
        return this.f29322zdlpuopuiu;
    }

    public String toString() {
        return "RecommendationProduct(product=" + this.f29322zdlpuopuiu + ")";
    }
}
