package androidx.media3.exoplayer.video;

import v2.jpowsppfya;
import y2.pkzmftpjix;
import y2.yggfygwlhe;

/* JADX INFO: loaded from: classes.dex */
final class draadjrbmk {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f11470gtknphoqwx;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f11472iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gtknphoqwx f11477zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx.iobyxmoadg f11475ppxfxbqfkf = new gtknphoqwx.iobyxmoadg();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final pkzmftpjix f11476wkgbmnqykc = new pkzmftpjix();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final pkzmftpjix f11469eablkybsjg = new pkzmftpjix();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final yggfygwlhe f11471gxszxtbevo = new yggfygwlhe();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f11473lqeggnwhkg = -9223372036854775807L;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private jpowsppfya f11467btonecajqb = jpowsppfya.f115374eablkybsjg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f11474nufgyqmvbu = -9223372036854775807L;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f11468dxjokdxxww = -9223372036854775807L;

    interface iobyxmoadg {
        void ppxfxbqfkf();

        void wkgbmnqykc(long j13, long j14, boolean z13);

        void zoijcleaow(jpowsppfya jpowsppfyaVar);
    }

    public draadjrbmk(iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
        this.f11472iobyxmoadg = iobyxmoadgVar;
        this.f11477zoijcleaow = gtknphoqwxVar;
    }

    private boolean eablkybsjg(long j13) {
        Long l13 = (Long) this.f11469eablkybsjg.btonecajqb(j13);
        if (l13 == null || l13.longValue() == this.f11470gtknphoqwx) {
            return false;
        }
        this.f11470gtknphoqwx = l13.longValue();
        return true;
    }

    private void gtknphoqwx(boolean z13) {
        long jGxszxtbevo = this.f11471gxszxtbevo.gxszxtbevo();
        if (gxszxtbevo(jGxszxtbevo)) {
            this.f11472iobyxmoadg.zoijcleaow(this.f11467btonecajqb);
        }
        this.f11472iobyxmoadg.wkgbmnqykc(z13 ? -1L : this.f11475ppxfxbqfkf.lqeggnwhkg(), jGxszxtbevo, this.f11477zoijcleaow.dxjokdxxww());
    }

    private boolean gxszxtbevo(long j13) {
        jpowsppfya jpowsppfyaVar = (jpowsppfya) this.f11476wkgbmnqykc.btonecajqb(j13);
        if (jpowsppfyaVar == null || jpowsppfyaVar.equals(jpowsppfya.f115374eablkybsjg) || jpowsppfyaVar.equals(this.f11467btonecajqb)) {
            return false;
        }
        this.f11467btonecajqb = jpowsppfyaVar;
        return true;
    }

    private void iobyxmoadg() {
        this.f11471gxszxtbevo.gxszxtbevo();
        this.f11472iobyxmoadg.ppxfxbqfkf();
    }

    private static Object ppxfxbqfkf(pkzmftpjix pkzmftpjixVar) {
        y2.iobyxmoadg.iobyxmoadg(pkzmftpjixVar.draadjrbmk() > 0);
        while (pkzmftpjixVar.draadjrbmk() > 1) {
            pkzmftpjixVar.dxjokdxxww();
        }
        return y2.iobyxmoadg.eablkybsjg(pkzmftpjixVar.dxjokdxxww());
    }

    public void btonecajqb(long j13, long j14) {
        while (!this.f11471gxszxtbevo.eablkybsjg()) {
            long jWkgbmnqykc = this.f11471gxszxtbevo.wkgbmnqykc();
            if (eablkybsjg(jWkgbmnqykc)) {
                this.f11477zoijcleaow.btonecajqb();
            }
            int iPpxfxbqfkf = this.f11477zoijcleaow.ppxfxbqfkf(jWkgbmnqykc, j13, j14, this.f11470gtknphoqwx, false, false, this.f11475ppxfxbqfkf);
            if (iPpxfxbqfkf == 0 || iPpxfxbqfkf == 1) {
                this.f11474nufgyqmvbu = jWkgbmnqykc;
                gtknphoqwx(iPpxfxbqfkf == 0);
            } else if (iPpxfxbqfkf == 2 || iPpxfxbqfkf == 3) {
                this.f11474nufgyqmvbu = jWkgbmnqykc;
                iobyxmoadg();
            } else {
                if (iPpxfxbqfkf != 4) {
                    if (iPpxfxbqfkf != 5) {
                        throw new IllegalStateException(String.valueOf(iPpxfxbqfkf));
                    }
                    return;
                }
                this.f11474nufgyqmvbu = jWkgbmnqykc;
            }
        }
    }

    public void draadjrbmk() {
        this.f11468dxjokdxxww = this.f11473lqeggnwhkg;
    }

    public void dxjokdxxww(int i13, int i14) {
        pkzmftpjix pkzmftpjixVar = this.f11476wkgbmnqykc;
        long j13 = this.f11473lqeggnwhkg;
        pkzmftpjixVar.iobyxmoadg(j13 == -9223372036854775807L ? 0L : j13 + 1, new jpowsppfya(i13, i14));
    }

    public void lqeggnwhkg(long j13) {
        this.f11471gxszxtbevo.iobyxmoadg(j13);
        this.f11473lqeggnwhkg = j13;
        this.f11468dxjokdxxww = -9223372036854775807L;
    }

    public void nufgyqmvbu(long j13) {
        pkzmftpjix pkzmftpjixVar = this.f11469eablkybsjg;
        long j14 = this.f11473lqeggnwhkg;
        pkzmftpjixVar.iobyxmoadg(j14 == -9223372036854775807L ? 0L : j14 + 1, Long.valueOf(j13));
    }

    public boolean wkgbmnqykc() {
        long j13 = this.f11468dxjokdxxww;
        return j13 != -9223372036854775807L && this.f11474nufgyqmvbu == j13;
    }

    public void zoijcleaow() {
        this.f11471gxszxtbevo.zoijcleaow();
        this.f11473lqeggnwhkg = -9223372036854775807L;
        this.f11474nufgyqmvbu = -9223372036854775807L;
        this.f11468dxjokdxxww = -9223372036854775807L;
        if (this.f11469eablkybsjg.draadjrbmk() > 0) {
            Long l13 = (Long) ppxfxbqfkf(this.f11469eablkybsjg);
            l13.longValue();
            this.f11469eablkybsjg.iobyxmoadg(0L, l13);
        }
        if (this.f11476wkgbmnqykc.draadjrbmk() > 0) {
            this.f11476wkgbmnqykc.iobyxmoadg(0L, (jpowsppfya) ppxfxbqfkf(this.f11476wkgbmnqykc));
        }
    }
}
