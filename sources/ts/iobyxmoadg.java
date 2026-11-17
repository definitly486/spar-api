package ts;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f111427iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f111428ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f111429zoijcleaow;

    public iobyxmoadg(String price, String priceFractional, String measure) {
        zdlpuopuiu.btonecajqb(price, "price");
        zdlpuopuiu.btonecajqb(priceFractional, "priceFractional");
        zdlpuopuiu.btonecajqb(measure, "measure");
        this.f111427iobyxmoadg = price;
        this.f111429zoijcleaow = priceFractional;
        this.f111428ppxfxbqfkf = measure;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f111427iobyxmoadg, iobyxmoadgVar.f111427iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f111429zoijcleaow, iobyxmoadgVar.f111429zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f111428ppxfxbqfkf, iobyxmoadgVar.f111428ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f111427iobyxmoadg.hashCode() * 31) + this.f111429zoijcleaow.hashCode()) * 31) + this.f111428ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f111428ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f111429zoijcleaow;
    }

    public String toString() {
        return "PricePerUnitUiModel(price=" + this.f111427iobyxmoadg + ", priceFractional=" + this.f111429zoijcleaow + ", measure=" + this.f111428ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f111427iobyxmoadg;
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3);
    }
}
