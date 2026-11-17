package cx0;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final double f26046dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final double f26047eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final double f26048gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f26049iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f26050lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final double f26051nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f26052ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final double f26053wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f26054zoijcleaow;

    public lqeggnwhkg(double d13, double d14, double d15, double d16, double d17, double d18, int i13, double d19, double d23) {
        this.f26049iobyxmoadg = d13;
        this.f26054zoijcleaow = d14;
        this.f26052ppxfxbqfkf = d15;
        this.f26053wkgbmnqykc = d16;
        this.f26047eablkybsjg = d17;
        this.f26048gxszxtbevo = d18;
        this.f26050lqeggnwhkg = i13;
        this.f26051nufgyqmvbu = d19;
        this.f26046dxjokdxxww = d23;
    }

    public final double dxjokdxxww() {
        return this.f26047eablkybsjg;
    }

    public final double eablkybsjg() {
        return this.f26054zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return Double.compare(this.f26049iobyxmoadg, lqeggnwhkgVar.f26049iobyxmoadg) == 0 && Double.compare(this.f26054zoijcleaow, lqeggnwhkgVar.f26054zoijcleaow) == 0 && Double.compare(this.f26052ppxfxbqfkf, lqeggnwhkgVar.f26052ppxfxbqfkf) == 0 && Double.compare(this.f26053wkgbmnqykc, lqeggnwhkgVar.f26053wkgbmnqykc) == 0 && Double.compare(this.f26047eablkybsjg, lqeggnwhkgVar.f26047eablkybsjg) == 0 && Double.compare(this.f26048gxszxtbevo, lqeggnwhkgVar.f26048gxszxtbevo) == 0 && this.f26050lqeggnwhkg == lqeggnwhkgVar.f26050lqeggnwhkg && Double.compare(this.f26051nufgyqmvbu, lqeggnwhkgVar.f26051nufgyqmvbu) == 0 && Double.compare(this.f26046dxjokdxxww, lqeggnwhkgVar.f26046dxjokdxxww) == 0;
    }

    public final double gxszxtbevo() {
        return this.f26051nufgyqmvbu;
    }

    public int hashCode() {
        return (((((((((((((((Double.hashCode(this.f26049iobyxmoadg) * 31) + Double.hashCode(this.f26054zoijcleaow)) * 31) + Double.hashCode(this.f26052ppxfxbqfkf)) * 31) + Double.hashCode(this.f26053wkgbmnqykc)) * 31) + Double.hashCode(this.f26047eablkybsjg)) * 31) + Double.hashCode(this.f26048gxszxtbevo)) * 31) + Integer.hashCode(this.f26050lqeggnwhkg)) * 31) + Double.hashCode(this.f26051nufgyqmvbu)) * 31) + Double.hashCode(this.f26046dxjokdxxww);
    }

    public final double iobyxmoadg() {
        return this.f26049iobyxmoadg;
    }

    public final double lqeggnwhkg() {
        return this.f26053wkgbmnqykc;
    }

    public final double nufgyqmvbu() {
        return this.f26048gxszxtbevo;
    }

    public final double ppxfxbqfkf() {
        return this.f26052ppxfxbqfkf;
    }

    public String toString() {
        return "OrderEditSumEntity(basket=" + this.f26049iobyxmoadg + ", discount=" + this.f26054zoijcleaow + ", delivery=" + this.f26052ppxfxbqfkf + ", overweight=" + this.f26053wkgbmnqykc + ", weight=" + this.f26047eablkybsjg + ", total=" + this.f26048gxszxtbevo + ", count=" + this.f26050lqeggnwhkg + ", oldTotal=" + this.f26051nufgyqmvbu + ", diffTotal=" + this.f26046dxjokdxxww + ")";
    }

    public final double wkgbmnqykc() {
        return this.f26046dxjokdxxww;
    }

    public final int zoijcleaow() {
        return this.f26050lqeggnwhkg;
    }
}
