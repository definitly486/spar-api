package gs1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f38423yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f38424zdlpuopuiu;

    public zoijcleaow(String itemId, List products) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(products, "products");
        this.f38424zdlpuopuiu = itemId;
        this.f38423yggfygwlhe = products;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f38424zdlpuopuiu, zoijcleaowVar.f38424zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f38423yggfygwlhe, zoijcleaowVar.f38423yggfygwlhe);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f38424zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f38424zdlpuopuiu.hashCode() * 31) + this.f38423yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f38423yggfygwlhe;
    }

    public String toString() {
        return "SpecialBannerProductsBlockUiModel(itemId=" + this.f38424zdlpuopuiu + ", products=" + this.f38423yggfygwlhe + ")";
    }
}
