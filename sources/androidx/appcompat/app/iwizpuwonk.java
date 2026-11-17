package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class iwizpuwonk {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static iwizpuwonk f2635wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public long f2636iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int f2637ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public long f2638zoijcleaow;

    iwizpuwonk() {
    }

    static iwizpuwonk zoijcleaow() {
        if (f2635wkgbmnqykc == null) {
            f2635wkgbmnqykc = new iwizpuwonk();
        }
        return f2635wkgbmnqykc;
    }

    public void iobyxmoadg(long j13, double d13, double d14) {
        float f13 = (j13 - 946728000000L) / 8.64E7f;
        float f14 = (0.01720197f * f13) + 6.24006f;
        double d15 = f14;
        double dSin = (Math.sin(d15) * 0.03341960161924362d) + d15 + (Math.sin(2.0f * f14) * 3.4906598739326E-4d) + (Math.sin(f14 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d16 = (-d14) / 360.0d;
        double dRound = ((double) (Math.round(((double) (f13 - 9.0E-4f)) - d16) + 9.0E-4f)) + d16 + (Math.sin(d15) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d17 = 0.01745329238474369d * d13;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d17) * Math.sin(dAsin))) / (Math.cos(d17) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f2637ppxfxbqfkf = 1;
            this.f2636iobyxmoadg = -1L;
            this.f2638zoijcleaow = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f2637ppxfxbqfkf = 0;
                this.f2636iobyxmoadg = -1L;
                this.f2638zoijcleaow = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f2636iobyxmoadg = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f2638zoijcleaow = jRound;
            if (jRound >= j13 || this.f2636iobyxmoadg <= j13) {
                this.f2637ppxfxbqfkf = 1;
            } else {
                this.f2637ppxfxbqfkf = 0;
            }
        }
    }
}
