package androidx.media3.exoplayer;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww implements f3.wwaezpbzkn {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float f10511agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private long f10512btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f10513draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f10514dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f10515eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f10516gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f10517gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f10518iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private long f10519kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final float f10520lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f10521nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private float f10522ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private long f10523oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f10524ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private float f10525rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private long f10526vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f10527wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f10528wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f10529zoijcleaow;

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private float f10532iobyxmoadg = 0.97f;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private float f10536zoijcleaow = 1.03f;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private long f10534ppxfxbqfkf = 1000;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private float f10535wkgbmnqykc = 1.0E-7f;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f10530eablkybsjg = y2.stevsuqkhv.ixidwrxhsl(20);

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private long f10531gxszxtbevo = y2.stevsuqkhv.ixidwrxhsl(500);

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private float f10533lqeggnwhkg = 0.999f;

        public dxjokdxxww iobyxmoadg() {
            return new dxjokdxxww(this.f10532iobyxmoadg, this.f10536zoijcleaow, this.f10534ppxfxbqfkf, this.f10535wkgbmnqykc, this.f10530eablkybsjg, this.f10531gxszxtbevo, this.f10533lqeggnwhkg);
        }
    }

    private void dxjokdxxww(long j13, long j14) {
        long j15 = j13 - j14;
        long j16 = this.f10523oxmwwwfdhm;
        if (j16 == -9223372036854775807L) {
            this.f10523oxmwwwfdhm = j15;
            this.f10519kcexrzcfyt = 0L;
        } else {
            long jMax = Math.max(j15, nufgyqmvbu(j16, j15, this.f10520lqeggnwhkg));
            this.f10523oxmwwwfdhm = jMax;
            this.f10519kcexrzcfyt = nufgyqmvbu(this.f10519kcexrzcfyt, Math.abs(j15 - jMax), this.f10520lqeggnwhkg);
        }
    }

    private void gxszxtbevo(long j13) {
        long j14 = this.f10523oxmwwwfdhm + (this.f10519kcexrzcfyt * 3);
        if (this.f10527wflxmlrfwp > j14) {
            float fIxidwrxhsl = y2.stevsuqkhv.ixidwrxhsl(this.f10524ppxfxbqfkf);
            this.f10527wflxmlrfwp = com.google.common.primitives.nufgyqmvbu.zoijcleaow(j14, this.f10512btonecajqb, this.f10527wflxmlrfwp - (((long) ((this.f10525rgvfuqvkyq - 1.0f) * fIxidwrxhsl)) + ((long) ((this.f10511agtfadlqog - 1.0f) * fIxidwrxhsl))));
            return;
        }
        long jRgvfuqvkyq = y2.stevsuqkhv.rgvfuqvkyq(j13 - ((long) (Math.max(0.0f, this.f10525rgvfuqvkyq - 1.0f) / this.f10528wkgbmnqykc)), this.f10527wflxmlrfwp, j14);
        this.f10527wflxmlrfwp = jRgvfuqvkyq;
        long j15 = this.f10513draadjrbmk;
        if (j15 == -9223372036854775807L || jRgvfuqvkyq <= j15) {
            return;
        }
        this.f10527wflxmlrfwp = j15;
    }

    private void lqeggnwhkg() {
        long j13;
        long j14 = this.f10521nufgyqmvbu;
        if (j14 != -9223372036854775807L) {
            j13 = this.f10514dxjokdxxww;
            if (j13 == -9223372036854775807L) {
                long j15 = this.f10516gtknphoqwx;
                if (j15 != -9223372036854775807L && j14 < j15) {
                    j14 = j15;
                }
                j13 = this.f10513draadjrbmk;
                if (j13 == -9223372036854775807L || j14 <= j13) {
                    j13 = j14;
                }
            }
        } else {
            j13 = -9223372036854775807L;
        }
        if (this.f10512btonecajqb == j13) {
            return;
        }
        this.f10512btonecajqb = j13;
        this.f10527wflxmlrfwp = j13;
        this.f10523oxmwwwfdhm = -9223372036854775807L;
        this.f10519kcexrzcfyt = -9223372036854775807L;
        this.f10526vdvldrhtss = -9223372036854775807L;
    }

    private static long nufgyqmvbu(long j13, long j14, float f13) {
        return (long) ((j13 * f13) + ((1.0f - f13) * j14));
    }

    @Override // f3.wwaezpbzkn
    public void eablkybsjg(long j13) {
        this.f10514dxjokdxxww = j13;
        lqeggnwhkg();
    }

    @Override // f3.wwaezpbzkn
    public void iobyxmoadg(v2.kcexrzcfyt.lqeggnwhkg lqeggnwhkgVar) {
        this.f10521nufgyqmvbu = y2.stevsuqkhv.ixidwrxhsl(lqeggnwhkgVar.f115465iobyxmoadg);
        this.f10516gtknphoqwx = y2.stevsuqkhv.ixidwrxhsl(lqeggnwhkgVar.f115468zoijcleaow);
        this.f10513draadjrbmk = y2.stevsuqkhv.ixidwrxhsl(lqeggnwhkgVar.f115466ppxfxbqfkf);
        float f13 = lqeggnwhkgVar.f115467wkgbmnqykc;
        if (f13 == -3.4028235E38f) {
            f13 = this.f10518iobyxmoadg;
        }
        this.f10522ojitshcjhn = f13;
        float f14 = lqeggnwhkgVar.f115464eablkybsjg;
        if (f14 == -3.4028235E38f) {
            f14 = this.f10529zoijcleaow;
        }
        this.f10511agtfadlqog = f14;
        if (f13 == 1.0f && f14 == 1.0f) {
            this.f10521nufgyqmvbu = -9223372036854775807L;
        }
        lqeggnwhkg();
    }

    @Override // f3.wwaezpbzkn
    public long ppxfxbqfkf() {
        return this.f10527wflxmlrfwp;
    }

    @Override // f3.wwaezpbzkn
    public void wkgbmnqykc() {
        long j13 = this.f10527wflxmlrfwp;
        if (j13 == -9223372036854775807L) {
            return;
        }
        long j14 = j13 + this.f10517gxszxtbevo;
        this.f10527wflxmlrfwp = j14;
        long j15 = this.f10513draadjrbmk;
        if (j15 != -9223372036854775807L && j14 > j15) {
            this.f10527wflxmlrfwp = j15;
        }
        this.f10526vdvldrhtss = -9223372036854775807L;
    }

    @Override // f3.wwaezpbzkn
    public float zoijcleaow(long j13, long j14) {
        if (this.f10521nufgyqmvbu == -9223372036854775807L) {
            return 1.0f;
        }
        dxjokdxxww(j13, j14);
        if (this.f10526vdvldrhtss != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f10526vdvldrhtss < this.f10524ppxfxbqfkf) {
            return this.f10525rgvfuqvkyq;
        }
        this.f10526vdvldrhtss = SystemClock.elapsedRealtime();
        gxszxtbevo(j13);
        long j15 = j13 - this.f10527wflxmlrfwp;
        if (Math.abs(j15) < this.f10515eablkybsjg) {
            this.f10525rgvfuqvkyq = 1.0f;
        } else {
            this.f10525rgvfuqvkyq = y2.stevsuqkhv.agtfadlqog((this.f10528wkgbmnqykc * j15) + 1.0f, this.f10522ojitshcjhn, this.f10511agtfadlqog);
        }
        return this.f10525rgvfuqvkyq;
    }

    private dxjokdxxww(float f13, float f14, long j13, float f15, long j14, long j15, float f16) {
        this.f10518iobyxmoadg = f13;
        this.f10529zoijcleaow = f14;
        this.f10524ppxfxbqfkf = j13;
        this.f10528wkgbmnqykc = f15;
        this.f10515eablkybsjg = j14;
        this.f10517gxszxtbevo = j15;
        this.f10520lqeggnwhkg = f16;
        this.f10521nufgyqmvbu = -9223372036854775807L;
        this.f10514dxjokdxxww = -9223372036854775807L;
        this.f10516gtknphoqwx = -9223372036854775807L;
        this.f10513draadjrbmk = -9223372036854775807L;
        this.f10522ojitshcjhn = f13;
        this.f10511agtfadlqog = f14;
        this.f10525rgvfuqvkyq = 1.0f;
        this.f10526vdvldrhtss = -9223372036854775807L;
        this.f10512btonecajqb = -9223372036854775807L;
        this.f10527wflxmlrfwp = -9223372036854775807L;
        this.f10523oxmwwwfdhm = -9223372036854775807L;
        this.f10519kcexrzcfyt = -9223372036854775807L;
    }
}
