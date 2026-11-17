package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f11527agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f11528btonecajqb;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f11534iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f11535lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f11537ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f11538wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f11539wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final r3.dxjokdxxww f11540zoijcleaow;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f11531eablkybsjg = 0;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f11533gxszxtbevo = -9223372036854775807L;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f11536nufgyqmvbu = -9223372036854775807L;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f11530dxjokdxxww = -9223372036854775807L;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private float f11532gtknphoqwx = 1.0f;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private y2.dxjokdxxww f11529draadjrbmk = y2.dxjokdxxww.f123544iobyxmoadg;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f11541iobyxmoadg = -9223372036854775807L;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f11542zoijcleaow = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void nufgyqmvbu() {
            this.f11541iobyxmoadg = -9223372036854775807L;
            this.f11542zoijcleaow = -9223372036854775807L;
        }

        public long gxszxtbevo() {
            return this.f11541iobyxmoadg;
        }

        public long lqeggnwhkg() {
            return this.f11542zoijcleaow;
        }
    }

    public interface zoijcleaow {
        boolean cdpycssgdh(long j13, long j14, long j15, boolean z13, boolean z14);

        boolean hkdspvbjdz(long j13, long j14, boolean z13);

        boolean zynmafqrjb(long j13, long j14);
    }

    public gtknphoqwx(Context context, zoijcleaow zoijcleaowVar, long j13) {
        this.f11534iobyxmoadg = zoijcleaowVar;
        this.f11537ppxfxbqfkf = j13;
        this.f11540zoijcleaow = new r3.dxjokdxxww(context);
    }

    private void gxszxtbevo(int i13) {
        this.f11531eablkybsjg = Math.min(this.f11531eablkybsjg, i13);
    }

    private boolean kcexrzcfyt(long j13, long j14, long j15) {
        if (this.f11530dxjokdxxww != -9223372036854775807L && !this.f11528btonecajqb) {
            return false;
        }
        int i13 = this.f11531eablkybsjg;
        if (i13 == 0) {
            return this.f11539wkgbmnqykc;
        }
        if (i13 == 1) {
            return true;
        }
        if (i13 == 2) {
            return j13 >= j15;
        }
        if (i13 == 3) {
            return this.f11539wkgbmnqykc && this.f11534iobyxmoadg.zynmafqrjb(j14, stevsuqkhv.ixidwrxhsl(this.f11529draadjrbmk.elapsedRealtime()) - this.f11535lqeggnwhkg);
        }
        throw new IllegalStateException();
    }

    private long zoijcleaow(long j13, long j14, long j15) {
        long j16 = (long) ((j15 - j13) / ((double) this.f11532gtknphoqwx));
        return this.f11539wkgbmnqykc ? j16 - (stevsuqkhv.ixidwrxhsl(this.f11529draadjrbmk.elapsedRealtime()) - j14) : j16;
    }

    public void agtfadlqog(int i13) {
        this.f11540zoijcleaow.ojitshcjhn(i13);
    }

    public void btonecajqb() {
        gxszxtbevo(2);
    }

    public void draadjrbmk() {
        this.f11539wkgbmnqykc = false;
        this.f11530dxjokdxxww = -9223372036854775807L;
        this.f11540zoijcleaow.draadjrbmk();
    }

    public boolean dxjokdxxww() {
        boolean z13 = this.f11531eablkybsjg != 3;
        this.f11531eablkybsjg = 3;
        this.f11535lqeggnwhkg = stevsuqkhv.ixidwrxhsl(this.f11529draadjrbmk.elapsedRealtime());
        return z13;
    }

    public void eablkybsjg(boolean z13) {
        this.f11528btonecajqb = z13;
        this.f11530dxjokdxxww = this.f11537ppxfxbqfkf > 0 ? this.f11529draadjrbmk.elapsedRealtime() + this.f11537ppxfxbqfkf : -9223372036854775807L;
    }

    public void gtknphoqwx() {
        this.f11539wkgbmnqykc = true;
        this.f11535lqeggnwhkg = stevsuqkhv.ixidwrxhsl(this.f11529draadjrbmk.elapsedRealtime());
        this.f11540zoijcleaow.gtknphoqwx();
    }

    public void iobyxmoadg() {
        if (this.f11531eablkybsjg == 0) {
            this.f11531eablkybsjg = 1;
        }
    }

    public void lqeggnwhkg() {
        gxszxtbevo(0);
    }

    public void nufgyqmvbu(boolean z13) {
        this.f11531eablkybsjg = z13 ? 1 : 0;
    }

    public void ojitshcjhn(y2.dxjokdxxww dxjokdxxwwVar) {
        this.f11529draadjrbmk = dxjokdxxwwVar;
    }

    public void oxmwwwfdhm(float f13) {
        y2.iobyxmoadg.iobyxmoadg(f13 > 0.0f);
        if (f13 == this.f11532gtknphoqwx) {
            return;
        }
        this.f11532gtknphoqwx = f13;
        this.f11540zoijcleaow.dxjokdxxww(f13);
    }

    public int ppxfxbqfkf(long j13, long j14, long j15, long j16, boolean z13, boolean z14, iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.nufgyqmvbu();
        if (this.f11533gxszxtbevo == -9223372036854775807L) {
            this.f11533gxszxtbevo = j14;
        }
        if (this.f11536nufgyqmvbu != j13) {
            this.f11540zoijcleaow.nufgyqmvbu(j13);
            this.f11536nufgyqmvbu = j13;
        }
        iobyxmoadgVar.f11541iobyxmoadg = zoijcleaow(j14, j15, j13);
        if (z13 && !z14) {
            return 3;
        }
        if (!this.f11538wflxmlrfwp) {
            this.f11527agtfadlqog = true;
            if (this.f11534iobyxmoadg.cdpycssgdh(iobyxmoadgVar.f11541iobyxmoadg, j14, j15, z14, true)) {
                return 4;
            }
            return (!this.f11539wkgbmnqykc || iobyxmoadgVar.f11541iobyxmoadg >= 30000) ? 5 : 3;
        }
        boolean z15 = false;
        if (kcexrzcfyt(j14, iobyxmoadgVar.f11541iobyxmoadg, j16)) {
            return 0;
        }
        if (!this.f11539wkgbmnqykc || j14 == this.f11533gxszxtbevo) {
            return 5;
        }
        long jNanoTime = this.f11529draadjrbmk.nanoTime();
        iobyxmoadgVar.f11542zoijcleaow = this.f11540zoijcleaow.zoijcleaow((iobyxmoadgVar.f11541iobyxmoadg * 1000) + jNanoTime);
        iobyxmoadgVar.f11541iobyxmoadg = (iobyxmoadgVar.f11542zoijcleaow - jNanoTime) / 1000;
        if (this.f11530dxjokdxxww != -9223372036854775807L && !this.f11528btonecajqb) {
            z15 = true;
        }
        if (this.f11534iobyxmoadg.cdpycssgdh(iobyxmoadgVar.f11541iobyxmoadg, j14, j15, z14, z15)) {
            return 4;
        }
        if (this.f11534iobyxmoadg.hkdspvbjdz(iobyxmoadgVar.f11541iobyxmoadg, j15, z14)) {
            return z15 ? 3 : 2;
        }
        return iobyxmoadgVar.f11541iobyxmoadg > 50000 ? 5 : 1;
    }

    public void rgvfuqvkyq(float f13) {
        this.f11540zoijcleaow.lqeggnwhkg(f13);
    }

    public void vdvldrhtss(Surface surface) {
        this.f11538wflxmlrfwp = surface != null;
        this.f11527agtfadlqog = false;
        this.f11540zoijcleaow.wflxmlrfwp(surface);
        gxszxtbevo(1);
    }

    public void wflxmlrfwp() {
        this.f11540zoijcleaow.btonecajqb();
        this.f11536nufgyqmvbu = -9223372036854775807L;
        this.f11533gxszxtbevo = -9223372036854775807L;
        gxszxtbevo(1);
        this.f11530dxjokdxxww = -9223372036854775807L;
    }

    public boolean wkgbmnqykc(boolean z13) {
        if (z13 && (this.f11531eablkybsjg == 3 || (!this.f11538wflxmlrfwp && this.f11527agtfadlqog))) {
            this.f11530dxjokdxxww = -9223372036854775807L;
            return true;
        }
        if (this.f11530dxjokdxxww == -9223372036854775807L) {
            return false;
        }
        if (this.f11529draadjrbmk.elapsedRealtime() < this.f11530dxjokdxxww) {
            return true;
        }
        this.f11530dxjokdxxww = -9223372036854775807L;
        return false;
    }
}
