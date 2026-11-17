package ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f82712iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f82713ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w0.wkgbmnqykc f82714zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f82715iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final long f82716ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final float f82717zoijcleaow;

        public iobyxmoadg(float f13, float f14, long j13) {
            this.f82715iobyxmoadg = f13;
            this.f82717zoijcleaow = f14;
            this.f82716ppxfxbqfkf = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return Float.compare(this.f82715iobyxmoadg, iobyxmoadgVar.f82715iobyxmoadg) == 0 && Float.compare(this.f82717zoijcleaow, iobyxmoadgVar.f82717zoijcleaow) == 0 && this.f82716ppxfxbqfkf == iobyxmoadgVar.f82716ppxfxbqfkf;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f82715iobyxmoadg) * 31) + Float.hashCode(this.f82717zoijcleaow)) * 31) + Long.hashCode(this.f82716ppxfxbqfkf);
        }

        public final float iobyxmoadg(long j13) {
            long j14 = this.f82716ppxfxbqfkf;
            return this.f82717zoijcleaow * Math.signum(this.f82715iobyxmoadg) * ribwqtqdhb.iobyxmoadg.f82731iobyxmoadg.zoijcleaow(j14 > 0 ? j13 / j14 : 1.0f).iobyxmoadg();
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f82715iobyxmoadg + ", distance=" + this.f82717zoijcleaow + ", duration=" + this.f82716ppxfxbqfkf + ')';
        }

        public final float zoijcleaow(long j13) {
            long j14 = this.f82716ppxfxbqfkf;
            return (((ribwqtqdhb.iobyxmoadg.f82731iobyxmoadg.zoijcleaow(j14 > 0 ? j13 / j14 : 1.0f).zoijcleaow() * Math.signum(this.f82715iobyxmoadg)) * this.f82717zoijcleaow) / this.f82716ppxfxbqfkf) * 1000.0f;
        }
    }

    public draadjrbmk(float f13, w0.wkgbmnqykc wkgbmnqykcVar) {
        this.f82712iobyxmoadg = f13;
        this.f82714zoijcleaow = wkgbmnqykcVar;
        this.f82713ppxfxbqfkf = iobyxmoadg(wkgbmnqykcVar);
    }

    private final double eablkybsjg(float f13) {
        return ribwqtqdhb.iobyxmoadg.f82731iobyxmoadg.iobyxmoadg(f13, this.f82712iobyxmoadg * this.f82713ppxfxbqfkf);
    }

    private final float iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar) {
        return wflxmlrfwp.ppxfxbqfkf(0.84f, wkgbmnqykcVar.getDensity());
    }

    public final long ppxfxbqfkf(float f13) {
        return (long) (Math.exp(eablkybsjg(f13) / (((double) wflxmlrfwp.f82846iobyxmoadg) - 1.0d)) * 1000.0d);
    }

    public final iobyxmoadg wkgbmnqykc(float f13) {
        double dEablkybsjg = eablkybsjg(f13);
        double d13 = ((double) wflxmlrfwp.f82846iobyxmoadg) - 1.0d;
        return new iobyxmoadg(f13, (float) (((double) (this.f82712iobyxmoadg * this.f82713ppxfxbqfkf)) * Math.exp((((double) wflxmlrfwp.f82846iobyxmoadg) / d13) * dEablkybsjg)), (long) (Math.exp(dEablkybsjg / d13) * 1000.0d));
    }

    public final float zoijcleaow(float f13) {
        return (float) (((double) (this.f82712iobyxmoadg * this.f82713ppxfxbqfkf)) * Math.exp((((double) wflxmlrfwp.f82846iobyxmoadg) / (((double) wflxmlrfwp.f82846iobyxmoadg) - 1.0d)) * eablkybsjg(f13)));
    }
}
