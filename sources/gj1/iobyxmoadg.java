package gj1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f37684iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f37685ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f37686zoijcleaow;

    public iobyxmoadg(String price, String priceDecimal, List productsImgUrl) {
        zdlpuopuiu.btonecajqb(price, "price");
        zdlpuopuiu.btonecajqb(priceDecimal, "priceDecimal");
        zdlpuopuiu.btonecajqb(productsImgUrl, "productsImgUrl");
        this.f37684iobyxmoadg = price;
        this.f37686zoijcleaow = priceDecimal;
        this.f37685ppxfxbqfkf = productsImgUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f37684iobyxmoadg, iobyxmoadgVar.f37684iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f37686zoijcleaow, iobyxmoadgVar.f37686zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f37685ppxfxbqfkf, iobyxmoadgVar.f37685ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f37684iobyxmoadg.hashCode() * 31) + this.f37686zoijcleaow.hashCode()) * 31) + this.f37685ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f37684iobyxmoadg;
    }

    public String toString() {
        return "PurchaseFutureUiModel(price=" + this.f37684iobyxmoadg + ", priceDecimal=" + this.f37686zoijcleaow + ", productsImgUrl=" + this.f37685ppxfxbqfkf + ")";
    }

    public final List zoijcleaow() {
        return this.f37685ppxfxbqfkf;
    }
}
