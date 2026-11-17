package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class rlfsiqarku {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f117237iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private double f117239zoijcleaow = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f117238ppxfxbqfkf = 1.0f;

    public rlfsiqarku(float f13) {
        this.f117237iobyxmoadg = f13;
    }

    public final void eablkybsjg(float f13) {
        if (zoijcleaow() <= 0.0f) {
            ikoacuggdj.iobyxmoadg("Spring stiffness constant must be positive.");
        }
        this.f117239zoijcleaow = Math.sqrt(f13);
    }

    public final long gxszxtbevo(float f13, float f14, long j13) {
        double dExp;
        double dExp2;
        float f15 = f13 - this.f117237iobyxmoadg;
        double d13 = j13 / 1000.0d;
        float f16 = this.f117238ppxfxbqfkf;
        double d14 = ((double) f16) * ((double) f16);
        double d15 = this.f117239zoijcleaow;
        double d16 = ((double) (-f16)) * d15;
        if (f16 > 1.0f) {
            double dSqrt = d15 * Math.sqrt(d14 - ((double) 1));
            double d17 = d16 + dSqrt;
            double d18 = d16 - dSqrt;
            double d19 = f15;
            double d23 = ((d18 * d19) - ((double) f14)) / (d18 - d17);
            double d24 = d19 - d23;
            double d25 = d18 * d13;
            double d26 = d13 * d17;
            dExp2 = (Math.exp(d25) * d24) + (Math.exp(d26) * d23);
            dExp = (d24 * d18 * Math.exp(d25)) + (d23 * d17 * Math.exp(d26));
        } else if (f16 == 1.0f) {
            double d27 = f15;
            double d28 = ((double) f14) + (d15 * d27);
            double d29 = (-d15) * d13;
            double d33 = d27 + (d13 * d28);
            dExp2 = d33 * Math.exp(d29);
            dExp = (d33 * Math.exp(d29) * (-this.f117239zoijcleaow)) + (d28 * Math.exp(d29));
        } else {
            double d34 = 1;
            double dSqrt2 = d15 * Math.sqrt(d34 - d14);
            double d35 = f15;
            double d36 = (d34 / dSqrt2) * (((-d16) * d35) + ((double) f14));
            double d37 = dSqrt2 * d13;
            double d38 = d13 * d16;
            double dExp3 = Math.exp(d38) * ((Math.cos(d37) * d35) + (Math.sin(d37) * d36));
            dExp = (d16 * dExp3) + (Math.exp(d38) * (((-dSqrt2) * d35 * Math.sin(d37)) + (dSqrt2 * d36 * Math.cos(d37))));
            dExp2 = dExp3;
        }
        return jlmebxxoox.iobyxmoadg((((long) Float.floatToRawIntBits((float) dExp)) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp2 + ((double) this.f117237iobyxmoadg))) << 32));
    }

    public final float iobyxmoadg() {
        return this.f117238ppxfxbqfkf;
    }

    public final void ppxfxbqfkf(float f13) {
        if (f13 < 0.0f) {
            ikoacuggdj.iobyxmoadg("Damping ratio must be non-negative");
        }
        this.f117238ppxfxbqfkf = f13;
    }

    public final void wkgbmnqykc(float f13) {
        this.f117237iobyxmoadg = f13;
    }

    public final float zoijcleaow() {
        double d13 = this.f117239zoijcleaow;
        return (float) (d13 * d13);
    }
}
