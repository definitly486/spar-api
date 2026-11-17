package l50;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final double f61613eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f61614gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f61615iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final double f61616lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f61617ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Double f61618wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f61619zoijcleaow;

    public iobyxmoadg(double d13, double d14, double d15, Double d16, double d17, String type, double d18) {
        zdlpuopuiu.btonecajqb(type, "type");
        this.f61615iobyxmoadg = d13;
        this.f61619zoijcleaow = d14;
        this.f61617ppxfxbqfkf = d15;
        this.f61618wkgbmnqykc = d16;
        this.f61613eablkybsjg = d17;
        this.f61614gxszxtbevo = type;
        this.f61616lqeggnwhkg = d18;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return Double.compare(this.f61615iobyxmoadg, iobyxmoadgVar.f61615iobyxmoadg) == 0 && Double.compare(this.f61619zoijcleaow, iobyxmoadgVar.f61619zoijcleaow) == 0 && Double.compare(this.f61617ppxfxbqfkf, iobyxmoadgVar.f61617ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f61618wkgbmnqykc, iobyxmoadgVar.f61618wkgbmnqykc) && Double.compare(this.f61613eablkybsjg, iobyxmoadgVar.f61613eablkybsjg) == 0 && zdlpuopuiu.eablkybsjg(this.f61614gxszxtbevo, iobyxmoadgVar.f61614gxszxtbevo) && Double.compare(this.f61616lqeggnwhkg, iobyxmoadgVar.f61616lqeggnwhkg) == 0;
    }

    public int hashCode() {
        int iHashCode = ((((Double.hashCode(this.f61615iobyxmoadg) * 31) + Double.hashCode(this.f61619zoijcleaow)) * 31) + Double.hashCode(this.f61617ppxfxbqfkf)) * 31;
        Double d13 = this.f61618wkgbmnqykc;
        return ((((((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + Double.hashCode(this.f61613eablkybsjg)) * 31) + this.f61614gxszxtbevo.hashCode()) * 31) + Double.hashCode(this.f61616lqeggnwhkg);
    }

    public String toString() {
        return "CounterInfoProperty(price=" + this.f61615iobyxmoadg + ", basketDefault=" + this.f61619zoijcleaow + ", ratio=" + this.f61617ppxfxbqfkf + ", avgWeight=" + this.f61618wkgbmnqykc + ", minAvailable=" + this.f61613eablkybsjg + ", type=" + this.f61614gxszxtbevo + ", quantity=" + this.f61616lqeggnwhkg + ")";
    }
}
