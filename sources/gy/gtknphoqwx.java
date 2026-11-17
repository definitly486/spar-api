package gy;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gtknphoqwx implements h60.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final double f38702eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Double f38703gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f38704iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Integer f38705lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Double f38706ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Double f38707wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Double f38708zoijcleaow;

    public gtknphoqwx(double d13, Double d14, Double d15, Double d16, double d17, Double d18, Integer num) {
        this.f38704iobyxmoadg = d13;
        this.f38708zoijcleaow = d14;
        this.f38706ppxfxbqfkf = d15;
        this.f38707wkgbmnqykc = d16;
        this.f38702eablkybsjg = d17;
        this.f38703gxszxtbevo = d18;
        this.f38705lqeggnwhkg = num;
    }

    public final Double eablkybsjg() {
        return this.f38707wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtknphoqwx)) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        return Double.compare(this.f38704iobyxmoadg, gtknphoqwxVar.f38704iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f38708zoijcleaow, gtknphoqwxVar.f38708zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f38706ppxfxbqfkf, gtknphoqwxVar.f38706ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f38707wkgbmnqykc, gtknphoqwxVar.f38707wkgbmnqykc) && Double.compare(this.f38702eablkybsjg, gtknphoqwxVar.f38702eablkybsjg) == 0 && zdlpuopuiu.eablkybsjg(this.f38703gxszxtbevo, gtknphoqwxVar.f38703gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f38705lqeggnwhkg, gtknphoqwxVar.f38705lqeggnwhkg);
    }

    public final Double gxszxtbevo() {
        return this.f38703gxszxtbevo;
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.f38704iobyxmoadg) * 31;
        Double d13 = this.f38708zoijcleaow;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f38706ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f38707wkgbmnqykc;
        int iHashCode4 = (((iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31) + Double.hashCode(this.f38702eablkybsjg)) * 31;
        Double d16 = this.f38703gxszxtbevo;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Integer num = this.f38705lqeggnwhkg;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final double iobyxmoadg() {
        return this.f38704iobyxmoadg;
    }

    public final double lqeggnwhkg() {
        return this.f38702eablkybsjg;
    }

    public final Double ppxfxbqfkf() {
        return this.f38706ppxfxbqfkf;
    }

    public String toString() {
        return "CartSumEntity(basket=" + this.f38704iobyxmoadg + ", discount=" + this.f38708zoijcleaow + ", delivery=" + this.f38706ppxfxbqfkf + ", overweight=" + this.f38707wkgbmnqykc + ", weight=" + this.f38702eablkybsjg + ", total=" + this.f38703gxszxtbevo + ", count=" + this.f38705lqeggnwhkg + ")";
    }

    public final Double wkgbmnqykc() {
        return this.f38708zoijcleaow;
    }

    public final Integer zoijcleaow() {
        return this.f38705lqeggnwhkg;
    }
}
