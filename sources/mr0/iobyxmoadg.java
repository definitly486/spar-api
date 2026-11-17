package mr0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f67866iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f67867ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f67868zoijcleaow;

    public iobyxmoadg(String price, String priceFractional, String measure) {
        zdlpuopuiu.btonecajqb(price, "price");
        zdlpuopuiu.btonecajqb(priceFractional, "priceFractional");
        zdlpuopuiu.btonecajqb(measure, "measure");
        this.f67866iobyxmoadg = price;
        this.f67868zoijcleaow = priceFractional;
        this.f67867ppxfxbqfkf = measure;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f67866iobyxmoadg, iobyxmoadgVar.f67866iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67868zoijcleaow, iobyxmoadgVar.f67868zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f67867ppxfxbqfkf, iobyxmoadgVar.f67867ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f67866iobyxmoadg.hashCode() * 31) + this.f67868zoijcleaow.hashCode()) * 31) + this.f67867ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f67867ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f67868zoijcleaow;
    }

    public String toString() {
        return "PricePerUnitUiModel(price=" + this.f67866iobyxmoadg + ", priceFractional=" + this.f67868zoijcleaow + ", measure=" + this.f67867ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f67866iobyxmoadg;
    }
}
