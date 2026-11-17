package is1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f49290yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f49291zdlpuopuiu;

    public wkgbmnqykc(String itemId, List products) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(products, "products");
        this.f49291zdlpuopuiu = itemId;
        this.f49290yggfygwlhe = products;
    }

    public static /* synthetic */ wkgbmnqykc wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = wkgbmnqykcVar.f49291zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            list = wkgbmnqykcVar.f49290yggfygwlhe;
        }
        return wkgbmnqykcVar.iobyxmoadg(str, list);
    }

    public final List eablkybsjg() {
        return this.f49290yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f49291zdlpuopuiu, wkgbmnqykcVar.f49291zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f49290yggfygwlhe, wkgbmnqykcVar.f49290yggfygwlhe);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f49291zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f49291zdlpuopuiu.hashCode() * 31) + this.f49290yggfygwlhe.hashCode();
    }

    public final wkgbmnqykc iobyxmoadg(String itemId, List products) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(products, "products");
        return new wkgbmnqykc(itemId, products);
    }

    public String toString() {
        return "VerticalPromoSpecialBannerUiModel(itemId=" + this.f49291zdlpuopuiu + ", products=" + this.f49290yggfygwlhe + ")";
    }
}
