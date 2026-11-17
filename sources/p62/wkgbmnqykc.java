package p62;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f75848yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f75849zdlpuopuiu;

    public wkgbmnqykc(String itemId, List products) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(products, "products");
        this.f75849zdlpuopuiu = itemId;
        this.f75848yggfygwlhe = products;
    }

    public static /* synthetic */ wkgbmnqykc wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = wkgbmnqykcVar.f75849zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            list = wkgbmnqykcVar.f75848yggfygwlhe;
        }
        return wkgbmnqykcVar.iobyxmoadg(str, list);
    }

    public final List eablkybsjg() {
        return this.f75848yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f75849zdlpuopuiu, wkgbmnqykcVar.f75849zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f75848yggfygwlhe, wkgbmnqykcVar.f75848yggfygwlhe);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f75849zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f75849zdlpuopuiu.hashCode() * 31) + this.f75848yggfygwlhe.hashCode();
    }

    public final wkgbmnqykc iobyxmoadg(String itemId, List products) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(products, "products");
        return new wkgbmnqykc(itemId, products);
    }

    public String toString() {
        return "VerticalPromoSpecialBannerUiModel(itemId=" + this.f75849zdlpuopuiu + ", products=" + this.f75848yggfygwlhe + ")";
    }
}
