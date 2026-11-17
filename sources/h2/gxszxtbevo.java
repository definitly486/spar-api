package h2;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final zoijcleaow.rgvfuqvkyq f39090btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private double f39091dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private double f39092eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private double f39093gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    double f39094iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private double f39095lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private double f39096nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f39097ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private double f39098wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    double f39099zoijcleaow;

    public gxszxtbevo() {
        this.f39094iobyxmoadg = Math.sqrt(1500.0d);
        this.f39099zoijcleaow = 0.5d;
        this.f39097ppxfxbqfkf = false;
        this.f39091dxjokdxxww = Double.MAX_VALUE;
        this.f39090btonecajqb = new zoijcleaow.rgvfuqvkyq();
    }

    private void zoijcleaow() {
        if (this.f39097ppxfxbqfkf) {
            return;
        }
        if (this.f39091dxjokdxxww == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d13 = this.f39099zoijcleaow;
        if (d13 > 1.0d) {
            double d14 = this.f39094iobyxmoadg;
            this.f39093gxszxtbevo = ((-d13) * d14) + (d14 * Math.sqrt((d13 * d13) - 1.0d));
            double d15 = this.f39099zoijcleaow;
            double d16 = this.f39094iobyxmoadg;
            this.f39095lqeggnwhkg = ((-d15) * d16) - (d16 * Math.sqrt((d15 * d15) - 1.0d));
        } else if (d13 >= 0.0d && d13 < 1.0d) {
            this.f39096nufgyqmvbu = this.f39094iobyxmoadg * Math.sqrt(1.0d - (d13 * d13));
        }
        this.f39097ppxfxbqfkf = true;
    }

    public gxszxtbevo eablkybsjg(float f13) {
        this.f39091dxjokdxxww = f13;
        return this;
    }

    public gxszxtbevo gxszxtbevo(float f13) {
        if (f13 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f39094iobyxmoadg = Math.sqrt(f13);
        this.f39097ppxfxbqfkf = false;
        return this;
    }

    public float iobyxmoadg() {
        return (float) this.f39091dxjokdxxww;
    }

    void lqeggnwhkg(double d13) {
        double dAbs = Math.abs(d13);
        this.f39098wkgbmnqykc = dAbs;
        this.f39092eablkybsjg = dAbs * 62.5d;
    }

    zoijcleaow.rgvfuqvkyq nufgyqmvbu(double d13, double d14, long j13) {
        double dCos;
        double dPow;
        zoijcleaow();
        double d15 = j13 / 1000.0d;
        double d16 = d13 - this.f39091dxjokdxxww;
        double d17 = this.f39099zoijcleaow;
        if (d17 > 1.0d) {
            double d18 = this.f39095lqeggnwhkg;
            double d19 = this.f39093gxszxtbevo;
            double d23 = d16 - (((d18 * d16) - d14) / (d18 - d19));
            double d24 = ((d16 * d18) - d14) / (d18 - d19);
            dPow = (Math.pow(2.718281828459045d, d18 * d15) * d23) + (Math.pow(2.718281828459045d, this.f39093gxszxtbevo * d15) * d24);
            double d25 = this.f39095lqeggnwhkg;
            double dPow2 = d23 * d25 * Math.pow(2.718281828459045d, d25 * d15);
            double d26 = this.f39093gxszxtbevo;
            dCos = dPow2 + (d24 * d26 * Math.pow(2.718281828459045d, d26 * d15));
        } else if (d17 == 1.0d) {
            double d27 = this.f39094iobyxmoadg;
            double d28 = d14 + (d27 * d16);
            double d29 = d16 + (d28 * d15);
            dPow = Math.pow(2.718281828459045d, (-d27) * d15) * d29;
            double dPow3 = d29 * Math.pow(2.718281828459045d, (-this.f39094iobyxmoadg) * d15);
            double d33 = this.f39094iobyxmoadg;
            dCos = (d28 * Math.pow(2.718281828459045d, (-d33) * d15)) + (dPow3 * (-d33));
        } else {
            double d34 = 1.0d / this.f39096nufgyqmvbu;
            double d35 = this.f39094iobyxmoadg;
            double d36 = d34 * ((d17 * d35 * d16) + d14);
            double dPow4 = Math.pow(2.718281828459045d, (-d17) * d35 * d15) * ((Math.cos(this.f39096nufgyqmvbu * d15) * d16) + (Math.sin(this.f39096nufgyqmvbu * d15) * d36));
            double d37 = this.f39094iobyxmoadg;
            double d38 = this.f39099zoijcleaow;
            double d39 = (-d37) * dPow4 * d38;
            double dPow5 = Math.pow(2.718281828459045d, (-d38) * d37 * d15);
            double d43 = this.f39096nufgyqmvbu;
            double dSin = (-d43) * d16 * Math.sin(d43 * d15);
            double d44 = this.f39096nufgyqmvbu;
            dCos = d39 + (dPow5 * (dSin + (d36 * d44 * Math.cos(d44 * d15))));
            dPow = dPow4;
        }
        zoijcleaow.rgvfuqvkyq rgvfuqvkyqVar = this.f39090btonecajqb;
        rgvfuqvkyqVar.f39142iobyxmoadg = (float) (dPow + this.f39091dxjokdxxww);
        rgvfuqvkyqVar.f39143zoijcleaow = (float) dCos;
        return rgvfuqvkyqVar;
    }

    public boolean ppxfxbqfkf(float f13, float f14) {
        return ((double) Math.abs(f14)) < this.f39092eablkybsjg && ((double) Math.abs(f13 - iobyxmoadg())) < this.f39098wkgbmnqykc;
    }

    public gxszxtbevo wkgbmnqykc(float f13) {
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f39099zoijcleaow = f13;
        this.f39097ppxfxbqfkf = false;
        return this;
    }

    public gxszxtbevo(float f13) {
        this.f39094iobyxmoadg = Math.sqrt(1500.0d);
        this.f39099zoijcleaow = 0.5d;
        this.f39097ppxfxbqfkf = false;
        this.f39091dxjokdxxww = Double.MAX_VALUE;
        this.f39090btonecajqb = new zoijcleaow.rgvfuqvkyq();
        this.f39091dxjokdxxww = f13;
    }
}
