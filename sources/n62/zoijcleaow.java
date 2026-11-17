package n62;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f69214yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f69215zdlpuopuiu;

    public zoijcleaow(String itemId, List products) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(products, "products");
        this.f69215zdlpuopuiu = itemId;
        this.f69214yggfygwlhe = products;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f69215zdlpuopuiu, zoijcleaowVar.f69215zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f69214yggfygwlhe, zoijcleaowVar.f69214yggfygwlhe);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f69215zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f69215zdlpuopuiu.hashCode() * 31) + this.f69214yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f69214yggfygwlhe;
    }

    public String toString() {
        return "SpecialBannerProductsBlockUiModel(itemId=" + this.f69215zdlpuopuiu + ", products=" + this.f69214yggfygwlhe + ")";
    }
}
