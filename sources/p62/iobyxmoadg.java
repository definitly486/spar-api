package p62;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f75835yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f75836zdlpuopuiu;

    public iobyxmoadg(String itemId, List products) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(products, "products");
        this.f75836zdlpuopuiu = itemId;
        this.f75835yggfygwlhe = products;
    }

    public static /* synthetic */ iobyxmoadg wkgbmnqykc(iobyxmoadg iobyxmoadgVar, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f75836zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            list = iobyxmoadgVar.f75835yggfygwlhe;
        }
        return iobyxmoadgVar.iobyxmoadg(str, list);
    }

    public final List eablkybsjg() {
        return this.f75835yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f75836zdlpuopuiu, iobyxmoadgVar.f75836zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f75835yggfygwlhe, iobyxmoadgVar.f75835yggfygwlhe);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f75836zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f75836zdlpuopuiu.hashCode() * 31) + this.f75835yggfygwlhe.hashCode();
    }

    public final iobyxmoadg iobyxmoadg(String itemId, List products) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(products, "products");
        return new iobyxmoadg(itemId, products);
    }

    public String toString() {
        return "HorizontalPromoSpecialBannerUiModel(itemId=" + this.f75836zdlpuopuiu + ", products=" + this.f75835yggfygwlhe + ")";
    }
}
