package r3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f81542gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f81544ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f81545wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private C1819iobyxmoadg f81543iobyxmoadg = new C1819iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private C1819iobyxmoadg f81546zoijcleaow = new C1819iobyxmoadg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f81541eablkybsjg = -9223372036854775807L;

    /* JADX INFO: renamed from: r3.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1819iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f81547eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private long f81548gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f81549iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final boolean[] f81550lqeggnwhkg = new boolean[15];

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f81551nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private long f81552ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private long f81553wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f81554zoijcleaow;

        private static int ppxfxbqfkf(long j13) {
            return (int) (j13 % 15);
        }

        public boolean eablkybsjg() {
            return this.f81553wkgbmnqykc > 15 && this.f81551nufgyqmvbu == 0;
        }

        public void gxszxtbevo(long j13) {
            long j14 = this.f81553wkgbmnqykc;
            if (j14 == 0) {
                this.f81549iobyxmoadg = j13;
            } else if (j14 == 1) {
                long j15 = j13 - this.f81549iobyxmoadg;
                this.f81554zoijcleaow = j15;
                this.f81548gxszxtbevo = j15;
                this.f81547eablkybsjg = 1L;
            } else {
                long j16 = j13 - this.f81552ppxfxbqfkf;
                int iPpxfxbqfkf = ppxfxbqfkf(j14);
                if (Math.abs(j16 - this.f81554zoijcleaow) <= 1000000) {
                    this.f81547eablkybsjg++;
                    this.f81548gxszxtbevo += j16;
                    boolean[] zArr = this.f81550lqeggnwhkg;
                    if (zArr[iPpxfxbqfkf]) {
                        zArr[iPpxfxbqfkf] = false;
                        this.f81551nufgyqmvbu--;
                    }
                } else {
                    boolean[] zArr2 = this.f81550lqeggnwhkg;
                    if (!zArr2[iPpxfxbqfkf]) {
                        zArr2[iPpxfxbqfkf] = true;
                        this.f81551nufgyqmvbu++;
                    }
                }
            }
            this.f81553wkgbmnqykc++;
            this.f81552ppxfxbqfkf = j13;
        }

        public long iobyxmoadg() {
            long j13 = this.f81547eablkybsjg;
            if (j13 == 0) {
                return 0L;
            }
            return this.f81548gxszxtbevo / j13;
        }

        public void lqeggnwhkg() {
            this.f81553wkgbmnqykc = 0L;
            this.f81547eablkybsjg = 0L;
            this.f81548gxszxtbevo = 0L;
            this.f81551nufgyqmvbu = 0;
            Arrays.fill(this.f81550lqeggnwhkg, false);
        }

        public boolean wkgbmnqykc() {
            long j13 = this.f81553wkgbmnqykc;
            if (j13 == 0) {
                return false;
            }
            return this.f81550lqeggnwhkg[ppxfxbqfkf(j13 - 1)];
        }

        public long zoijcleaow() {
            return this.f81548gxszxtbevo;
        }
    }

    public boolean eablkybsjg() {
        return this.f81543iobyxmoadg.eablkybsjg();
    }

    public void gxszxtbevo(long j13) {
        this.f81543iobyxmoadg.gxszxtbevo(j13);
        if (this.f81543iobyxmoadg.eablkybsjg() && !this.f81545wkgbmnqykc) {
            this.f81544ppxfxbqfkf = false;
        } else if (this.f81541eablkybsjg != -9223372036854775807L) {
            if (!this.f81544ppxfxbqfkf || this.f81546zoijcleaow.wkgbmnqykc()) {
                this.f81546zoijcleaow.lqeggnwhkg();
                this.f81546zoijcleaow.gxszxtbevo(this.f81541eablkybsjg);
            }
            this.f81544ppxfxbqfkf = true;
            this.f81546zoijcleaow.gxszxtbevo(j13);
        }
        if (this.f81544ppxfxbqfkf && this.f81546zoijcleaow.eablkybsjg()) {
            C1819iobyxmoadg c1819iobyxmoadg = this.f81543iobyxmoadg;
            this.f81543iobyxmoadg = this.f81546zoijcleaow;
            this.f81546zoijcleaow = c1819iobyxmoadg;
            this.f81544ppxfxbqfkf = false;
            this.f81545wkgbmnqykc = false;
        }
        this.f81541eablkybsjg = j13;
        this.f81542gxszxtbevo = this.f81543iobyxmoadg.eablkybsjg() ? 0 : this.f81542gxszxtbevo + 1;
    }

    public long iobyxmoadg() {
        if (eablkybsjg()) {
            return this.f81543iobyxmoadg.iobyxmoadg();
        }
        return -9223372036854775807L;
    }

    public void lqeggnwhkg() {
        this.f81543iobyxmoadg.lqeggnwhkg();
        this.f81546zoijcleaow.lqeggnwhkg();
        this.f81544ppxfxbqfkf = false;
        this.f81541eablkybsjg = -9223372036854775807L;
        this.f81542gxszxtbevo = 0;
    }

    public int ppxfxbqfkf() {
        return this.f81542gxszxtbevo;
    }

    public long wkgbmnqykc() {
        if (eablkybsjg()) {
            return this.f81543iobyxmoadg.zoijcleaow();
        }
        return -9223372036854775807L;
    }

    public float zoijcleaow() {
        if (eablkybsjg()) {
            return (float) (1.0E9d / this.f81543iobyxmoadg.iobyxmoadg());
        }
        return -1.0f;
    }
}
