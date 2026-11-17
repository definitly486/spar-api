package is1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f49277yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f49278zdlpuopuiu;

    public iobyxmoadg(String itemId, List products) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(products, "products");
        this.f49278zdlpuopuiu = itemId;
        this.f49277yggfygwlhe = products;
    }

    public static /* synthetic */ iobyxmoadg wkgbmnqykc(iobyxmoadg iobyxmoadgVar, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f49278zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            list = iobyxmoadgVar.f49277yggfygwlhe;
        }
        return iobyxmoadgVar.iobyxmoadg(str, list);
    }

    public final List eablkybsjg() {
        return this.f49277yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f49278zdlpuopuiu, iobyxmoadgVar.f49278zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f49277yggfygwlhe, iobyxmoadgVar.f49277yggfygwlhe);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f49278zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f49278zdlpuopuiu.hashCode() * 31) + this.f49277yggfygwlhe.hashCode();
    }

    public final iobyxmoadg iobyxmoadg(String itemId, List products) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(products, "products");
        return new iobyxmoadg(itemId, products);
    }

    public String toString() {
        return "HorizontalPromoSpecialBannerUiModel(itemId=" + this.f49278zdlpuopuiu + ", products=" + this.f49277yggfygwlhe + ")";
    }
}
