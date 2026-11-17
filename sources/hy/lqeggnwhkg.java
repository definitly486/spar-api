package hy;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg implements h60.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final double f41301dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final double f41302eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final double f41303gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f41304iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f41305lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final double f41306nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f41307ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final double f41308wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f41309zoijcleaow;

    public lqeggnwhkg(double d13, double d14, double d15, double d16, double d17, double d18, int i13, double d19, double d23) {
        this.f41304iobyxmoadg = d13;
        this.f41309zoijcleaow = d14;
        this.f41307ppxfxbqfkf = d15;
        this.f41308wkgbmnqykc = d16;
        this.f41302eablkybsjg = d17;
        this.f41303gxszxtbevo = d18;
        this.f41305lqeggnwhkg = i13;
        this.f41306nufgyqmvbu = d19;
        this.f41301dxjokdxxww = d23;
    }

    public final double dxjokdxxww() {
        return this.f41302eablkybsjg;
    }

    public final double eablkybsjg() {
        return this.f41309zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return Double.compare(this.f41304iobyxmoadg, lqeggnwhkgVar.f41304iobyxmoadg) == 0 && Double.compare(this.f41309zoijcleaow, lqeggnwhkgVar.f41309zoijcleaow) == 0 && Double.compare(this.f41307ppxfxbqfkf, lqeggnwhkgVar.f41307ppxfxbqfkf) == 0 && Double.compare(this.f41308wkgbmnqykc, lqeggnwhkgVar.f41308wkgbmnqykc) == 0 && Double.compare(this.f41302eablkybsjg, lqeggnwhkgVar.f41302eablkybsjg) == 0 && Double.compare(this.f41303gxszxtbevo, lqeggnwhkgVar.f41303gxszxtbevo) == 0 && this.f41305lqeggnwhkg == lqeggnwhkgVar.f41305lqeggnwhkg && Double.compare(this.f41306nufgyqmvbu, lqeggnwhkgVar.f41306nufgyqmvbu) == 0 && Double.compare(this.f41301dxjokdxxww, lqeggnwhkgVar.f41301dxjokdxxww) == 0;
    }

    public final double gxszxtbevo() {
        return this.f41306nufgyqmvbu;
    }

    public int hashCode() {
        return (((((((((((((((Double.hashCode(this.f41304iobyxmoadg) * 31) + Double.hashCode(this.f41309zoijcleaow)) * 31) + Double.hashCode(this.f41307ppxfxbqfkf)) * 31) + Double.hashCode(this.f41308wkgbmnqykc)) * 31) + Double.hashCode(this.f41302eablkybsjg)) * 31) + Double.hashCode(this.f41303gxszxtbevo)) * 31) + Integer.hashCode(this.f41305lqeggnwhkg)) * 31) + Double.hashCode(this.f41306nufgyqmvbu)) * 31) + Double.hashCode(this.f41301dxjokdxxww);
    }

    public final double iobyxmoadg() {
        return this.f41304iobyxmoadg;
    }

    public final double lqeggnwhkg() {
        return this.f41308wkgbmnqykc;
    }

    public final double nufgyqmvbu() {
        return this.f41303gxszxtbevo;
    }

    public final double ppxfxbqfkf() {
        return this.f41307ppxfxbqfkf;
    }

    public String toString() {
        return "OrderEditSumEntity(basket=" + this.f41304iobyxmoadg + ", discount=" + this.f41309zoijcleaow + ", delivery=" + this.f41307ppxfxbqfkf + ", overweight=" + this.f41308wkgbmnqykc + ", weight=" + this.f41302eablkybsjg + ", total=" + this.f41303gxszxtbevo + ", count=" + this.f41305lqeggnwhkg + ", oldTotal=" + this.f41306nufgyqmvbu + ", diffTotal=" + this.f41301dxjokdxxww + ")";
    }

    public final double wkgbmnqykc() {
        return this.f41301dxjokdxxww;
    }

    public final int zoijcleaow() {
        return this.f41305lqeggnwhkg;
    }
}
