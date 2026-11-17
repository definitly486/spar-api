package w31;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final double f118632eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f118633gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f118634iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final double f118635lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f118636ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Double f118637wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f118638zoijcleaow;

    public iobyxmoadg(double d13, double d14, double d15, Double d16, double d17, String type, double d18) {
        zdlpuopuiu.btonecajqb(type, "type");
        this.f118634iobyxmoadg = d13;
        this.f118638zoijcleaow = d14;
        this.f118636ppxfxbqfkf = d15;
        this.f118637wkgbmnqykc = d16;
        this.f118632eablkybsjg = d17;
        this.f118633gxszxtbevo = type;
        this.f118635lqeggnwhkg = d18;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return Double.compare(this.f118634iobyxmoadg, iobyxmoadgVar.f118634iobyxmoadg) == 0 && Double.compare(this.f118638zoijcleaow, iobyxmoadgVar.f118638zoijcleaow) == 0 && Double.compare(this.f118636ppxfxbqfkf, iobyxmoadgVar.f118636ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f118637wkgbmnqykc, iobyxmoadgVar.f118637wkgbmnqykc) && Double.compare(this.f118632eablkybsjg, iobyxmoadgVar.f118632eablkybsjg) == 0 && zdlpuopuiu.eablkybsjg(this.f118633gxszxtbevo, iobyxmoadgVar.f118633gxszxtbevo) && Double.compare(this.f118635lqeggnwhkg, iobyxmoadgVar.f118635lqeggnwhkg) == 0;
    }

    public int hashCode() {
        int iHashCode = ((((Double.hashCode(this.f118634iobyxmoadg) * 31) + Double.hashCode(this.f118638zoijcleaow)) * 31) + Double.hashCode(this.f118636ppxfxbqfkf)) * 31;
        Double d13 = this.f118637wkgbmnqykc;
        return ((((((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + Double.hashCode(this.f118632eablkybsjg)) * 31) + this.f118633gxszxtbevo.hashCode()) * 31) + Double.hashCode(this.f118635lqeggnwhkg);
    }

    public String toString() {
        return "CounterInfoProperty(price=" + this.f118634iobyxmoadg + ", basketDefault=" + this.f118638zoijcleaow + ", ratio=" + this.f118636ppxfxbqfkf + ", avgWeight=" + this.f118637wkgbmnqykc + ", minAvailable=" + this.f118632eablkybsjg + ", type=" + this.f118633gxszxtbevo + ", quantity=" + this.f118635lqeggnwhkg + ")";
    }
}
