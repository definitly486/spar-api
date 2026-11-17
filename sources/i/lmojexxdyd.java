package i;

/* JADX INFO: loaded from: classes.dex */
public final class lmojexxdyd {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final double f41545eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final double f41546gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f41547iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final double f41548lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f41549ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final double f41550wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f41551zoijcleaow;

    public lmojexxdyd(double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        this.f41547iobyxmoadg = d13;
        this.f41551zoijcleaow = d14;
        this.f41549ppxfxbqfkf = d15;
        this.f41550wkgbmnqykc = d16;
        this.f41545eablkybsjg = d17;
        this.f41546gxszxtbevo = d18;
        this.f41548lqeggnwhkg = d19;
        if (Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d17) || Double.isNaN(d18) || Double.isNaN(d19) || Double.isNaN(d13)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (wwaezpbzkn.zoijcleaow(d13)) {
            return;
        }
        if (d17 < 0.0d || d17 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d17);
        }
        if (d17 == 0.0d && (d14 == 0.0d || d13 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d17 >= 1.0d && d16 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d14 == 0.0d || d13 == 0.0d) && d16 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d16 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d14 < 0.0d || d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean dxjokdxxww() {
        return this.f41547iobyxmoadg == -2.0d;
    }

    public final double eablkybsjg() {
        return this.f41546gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmojexxdyd)) {
            return false;
        }
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) obj;
        return Double.compare(this.f41547iobyxmoadg, lmojexxdydVar.f41547iobyxmoadg) == 0 && Double.compare(this.f41551zoijcleaow, lmojexxdydVar.f41551zoijcleaow) == 0 && Double.compare(this.f41549ppxfxbqfkf, lmojexxdydVar.f41549ppxfxbqfkf) == 0 && Double.compare(this.f41550wkgbmnqykc, lmojexxdydVar.f41550wkgbmnqykc) == 0 && Double.compare(this.f41545eablkybsjg, lmojexxdydVar.f41545eablkybsjg) == 0 && Double.compare(this.f41546gxszxtbevo, lmojexxdydVar.f41546gxszxtbevo) == 0 && Double.compare(this.f41548lqeggnwhkg, lmojexxdydVar.f41548lqeggnwhkg) == 0;
    }

    public final double gxszxtbevo() {
        return this.f41548lqeggnwhkg;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f41547iobyxmoadg) * 31) + Double.hashCode(this.f41551zoijcleaow)) * 31) + Double.hashCode(this.f41549ppxfxbqfkf)) * 31) + Double.hashCode(this.f41550wkgbmnqykc)) * 31) + Double.hashCode(this.f41545eablkybsjg)) * 31) + Double.hashCode(this.f41546gxszxtbevo)) * 31) + Double.hashCode(this.f41548lqeggnwhkg);
    }

    public final double iobyxmoadg() {
        return this.f41551zoijcleaow;
    }

    public final double lqeggnwhkg() {
        return this.f41547iobyxmoadg;
    }

    public final boolean nufgyqmvbu() {
        return this.f41547iobyxmoadg == -3.0d;
    }

    public final double ppxfxbqfkf() {
        return this.f41550wkgbmnqykc;
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f41547iobyxmoadg + ", a=" + this.f41551zoijcleaow + ", b=" + this.f41549ppxfxbqfkf + ", c=" + this.f41550wkgbmnqykc + ", d=" + this.f41545eablkybsjg + ", e=" + this.f41546gxszxtbevo + ", f=" + this.f41548lqeggnwhkg + ')';
    }

    public final double wkgbmnqykc() {
        return this.f41545eablkybsjg;
    }

    public final double zoijcleaow() {
        return this.f41549ppxfxbqfkf;
    }

    public /* synthetic */ lmojexxdyd(double d13, double d14, double d15, double d16, double d17, double d18, double d19, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(d13, d14, d15, d16, d17, (i13 & 32) != 0 ? 0.0d : d18, (i13 & 64) != 0 ? 0.0d : d19);
    }
}
