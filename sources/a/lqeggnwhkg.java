package a;

import w0.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f49ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f50zoijcleaow;

    public static final class iobyxmoadg implements eablkybsjg.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f51iobyxmoadg;

        public iobyxmoadg(float f13) {
            this.f51iobyxmoadg = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && Float.compare(this.f51iobyxmoadg, ((iobyxmoadg) obj).f51iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f51iobyxmoadg);
        }

        @Override // a.eablkybsjg.zoijcleaow
        public int iobyxmoadg(int i13, int i14, zdlpuopuiu zdlpuopuiuVar) {
            return Math.round(((i14 - i13) / 2.0f) * (1 + (zdlpuopuiuVar == zdlpuopuiu.Ltr ? this.f51iobyxmoadg : (-1) * this.f51iobyxmoadg)));
        }

        public String toString() {
            return "Horizontal(bias=" + this.f51iobyxmoadg + ')';
        }
    }

    public static final class zoijcleaow implements eablkybsjg.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f52iobyxmoadg;

        public zoijcleaow(float f13) {
            this.f52iobyxmoadg = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && Float.compare(this.f52iobyxmoadg, ((zoijcleaow) obj).f52iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f52iobyxmoadg);
        }

        @Override // a.eablkybsjg.ppxfxbqfkf
        public int iobyxmoadg(int i13, int i14) {
            return Math.round(((i14 - i13) / 2.0f) * (1 + this.f52iobyxmoadg));
        }

        public String toString() {
            return "Vertical(bias=" + this.f52iobyxmoadg + ')';
        }
    }

    public lqeggnwhkg(float f13, float f14) {
        this.f50zoijcleaow = f13;
        this.f49ppxfxbqfkf = f14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return Float.compare(this.f50zoijcleaow, lqeggnwhkgVar.f50zoijcleaow) == 0 && Float.compare(this.f49ppxfxbqfkf, lqeggnwhkgVar.f49ppxfxbqfkf) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f50zoijcleaow) * 31) + Float.hashCode(this.f49ppxfxbqfkf);
    }

    @Override // a.eablkybsjg
    public long iobyxmoadg(long j13, long j14, zdlpuopuiu zdlpuopuiuVar) {
        float f13 = (((int) (j14 >> 32)) - ((int) (j13 >> 32))) / 2.0f;
        float f14 = (((int) (j14 & 4294967295L)) - ((int) (j13 & 4294967295L))) / 2.0f;
        float f15 = 1;
        return w0.agtfadlqog.wkgbmnqykc((((long) Math.round(f13 * ((zdlpuopuiuVar == zdlpuopuiu.Ltr ? this.f50zoijcleaow : (-1) * this.f50zoijcleaow) + f15))) << 32) | (((long) Math.round(f14 * (f15 + this.f49ppxfxbqfkf))) & 4294967295L));
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f50zoijcleaow + ", verticalBias=" + this.f49ppxfxbqfkf + ')';
    }
}
