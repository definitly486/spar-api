package ay1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f14733iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f14734ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f14735zoijcleaow;

    public iobyxmoadg(String price, String priceDecimal, List productsImgUrl) {
        zdlpuopuiu.btonecajqb(price, "price");
        zdlpuopuiu.btonecajqb(priceDecimal, "priceDecimal");
        zdlpuopuiu.btonecajqb(productsImgUrl, "productsImgUrl");
        this.f14733iobyxmoadg = price;
        this.f14735zoijcleaow = priceDecimal;
        this.f14734ppxfxbqfkf = productsImgUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f14733iobyxmoadg, iobyxmoadgVar.f14733iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14735zoijcleaow, iobyxmoadgVar.f14735zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f14734ppxfxbqfkf, iobyxmoadgVar.f14734ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f14733iobyxmoadg.hashCode() * 31) + this.f14735zoijcleaow.hashCode()) * 31) + this.f14734ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f14733iobyxmoadg;
    }

    public String toString() {
        return "PurchaseFutureUiModel(price=" + this.f14733iobyxmoadg + ", priceDecimal=" + this.f14735zoijcleaow + ", productsImgUrl=" + this.f14734ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f14734ppxfxbqfkf;
    }
}
