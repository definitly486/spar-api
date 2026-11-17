package bx0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gtknphoqwx implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final double f17268eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Double f17269gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f17270iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Integer f17271lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Double f17272ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Double f17273wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Double f17274zoijcleaow;

    public gtknphoqwx(double d13, Double d14, Double d15, Double d16, double d17, Double d18, Integer num) {
        this.f17270iobyxmoadg = d13;
        this.f17274zoijcleaow = d14;
        this.f17272ppxfxbqfkf = d15;
        this.f17273wkgbmnqykc = d16;
        this.f17268eablkybsjg = d17;
        this.f17269gxszxtbevo = d18;
        this.f17271lqeggnwhkg = num;
    }

    public final Double eablkybsjg() {
        return this.f17273wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtknphoqwx)) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        return Double.compare(this.f17270iobyxmoadg, gtknphoqwxVar.f17270iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f17274zoijcleaow, gtknphoqwxVar.f17274zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f17272ppxfxbqfkf, gtknphoqwxVar.f17272ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f17273wkgbmnqykc, gtknphoqwxVar.f17273wkgbmnqykc) && Double.compare(this.f17268eablkybsjg, gtknphoqwxVar.f17268eablkybsjg) == 0 && zdlpuopuiu.eablkybsjg(this.f17269gxszxtbevo, gtknphoqwxVar.f17269gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f17271lqeggnwhkg, gtknphoqwxVar.f17271lqeggnwhkg);
    }

    public final Double gxszxtbevo() {
        return this.f17269gxszxtbevo;
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.f17270iobyxmoadg) * 31;
        Double d13 = this.f17274zoijcleaow;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f17272ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f17273wkgbmnqykc;
        int iHashCode4 = (((iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31) + Double.hashCode(this.f17268eablkybsjg)) * 31;
        Double d16 = this.f17269gxszxtbevo;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Integer num = this.f17271lqeggnwhkg;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final double iobyxmoadg() {
        return this.f17270iobyxmoadg;
    }

    public final double lqeggnwhkg() {
        return this.f17268eablkybsjg;
    }

    public final Double ppxfxbqfkf() {
        return this.f17272ppxfxbqfkf;
    }

    public String toString() {
        return "CartSumEntity(basket=" + this.f17270iobyxmoadg + ", discount=" + this.f17274zoijcleaow + ", delivery=" + this.f17272ppxfxbqfkf + ", overweight=" + this.f17273wkgbmnqykc + ", weight=" + this.f17268eablkybsjg + ", total=" + this.f17269gxszxtbevo + ", count=" + this.f17271lqeggnwhkg + ")";
    }

    public final Double wkgbmnqykc() {
        return this.f17274zoijcleaow;
    }

    public final Integer zoijcleaow() {
        return this.f17271lqeggnwhkg;
    }
}
