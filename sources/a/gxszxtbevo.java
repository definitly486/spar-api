package a;

import w0.oxmwwwfdhm;
import w0.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo implements eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f37ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f38zoijcleaow;

    public static final class iobyxmoadg implements eablkybsjg.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f39iobyxmoadg;

        public iobyxmoadg(float f13) {
            this.f39iobyxmoadg = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && Float.compare(this.f39iobyxmoadg, ((iobyxmoadg) obj).f39iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f39iobyxmoadg);
        }

        @Override // a.eablkybsjg.zoijcleaow
        public int iobyxmoadg(int i13, int i14, zdlpuopuiu zdlpuopuiuVar) {
            return Math.round(((i14 - i13) / 2.0f) * (1 + this.f39iobyxmoadg));
        }

        public String toString() {
            return "Horizontal(bias=" + this.f39iobyxmoadg + ')';
        }
    }

    public gxszxtbevo(float f13, float f14) {
        this.f38zoijcleaow = f13;
        this.f37ppxfxbqfkf = f14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return Float.compare(this.f38zoijcleaow, gxszxtbevoVar.f38zoijcleaow) == 0 && Float.compare(this.f37ppxfxbqfkf, gxszxtbevoVar.f37ppxfxbqfkf) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f38zoijcleaow) * 31) + Float.hashCode(this.f37ppxfxbqfkf);
    }

    @Override // a.eablkybsjg
    public long iobyxmoadg(long j13, long j14, zdlpuopuiu zdlpuopuiuVar) {
        long jPpxfxbqfkf = oxmwwwfdhm.ppxfxbqfkf((((long) (((int) (j14 >> 32)) - ((int) (j13 >> 32)))) << 32) | (((long) (((int) (j14 & 4294967295L)) - ((int) (j13 & 4294967295L)))) & 4294967295L));
        float f13 = 1;
        return w0.agtfadlqog.wkgbmnqykc((((long) Math.round((((int) (jPpxfxbqfkf >> 32)) / 2.0f) * (this.f38zoijcleaow + f13))) << 32) | (((long) Math.round((((int) (jPpxfxbqfkf & 4294967295L)) / 2.0f) * (f13 + this.f37ppxfxbqfkf))) & 4294967295L));
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f38zoijcleaow + ", verticalBias=" + this.f37ppxfxbqfkf + ')';
    }
}
