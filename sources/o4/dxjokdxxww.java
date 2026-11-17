package o4;

import t3.dsvhmnatus;
import t3.oxmwwwfdhm;
import t3.pkzmftpjix;
import t3.vdvldrhtss;
import t3.ylkuphrtab;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
abstract class dxjokdxxww {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f71944draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f71945dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f71946eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f71947gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f71948gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f71950lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f71951nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private oxmwwwfdhm f71952ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f71953wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private lqeggnwhkg f71954wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private dsvhmnatus f71955zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f71949iobyxmoadg = new eablkybsjg();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private zoijcleaow f71943btonecajqb = new zoijcleaow();

    private static final class ppxfxbqfkf implements lqeggnwhkg {
        private ppxfxbqfkf() {
        }

        @Override // o4.lqeggnwhkg
        public long iobyxmoadg(vdvldrhtss vdvldrhtssVar) {
            return -1L;
        }

        @Override // o4.lqeggnwhkg
        public void ppxfxbqfkf(long j13) {
        }

        @Override // o4.lqeggnwhkg
        public pkzmftpjix zoijcleaow() {
            return new pkzmftpjix.zoijcleaow(-9223372036854775807L);
        }
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        androidx.media3.common.iobyxmoadg f71956iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        lqeggnwhkg f71957zoijcleaow;

        zoijcleaow() {
        }
    }

    private int btonecajqb(vdvldrhtss vdvldrhtssVar) {
        if (!nufgyqmvbu(vdvldrhtssVar)) {
            return -1;
        }
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = this.f71943btonecajqb.f71956iobyxmoadg;
        this.f71945dxjokdxxww = iobyxmoadgVar.f9759iozdgvuglv;
        if (!this.f71953wflxmlrfwp) {
            this.f71955zoijcleaow.iobyxmoadg(iobyxmoadgVar);
            this.f71953wflxmlrfwp = true;
        }
        lqeggnwhkg lqeggnwhkgVar = this.f71943btonecajqb.f71957zoijcleaow;
        if (lqeggnwhkgVar != null) {
            this.f71954wkgbmnqykc = lqeggnwhkgVar;
        } else if (vdvldrhtssVar.getLength() == -1) {
            this.f71954wkgbmnqykc = new ppxfxbqfkf();
        } else {
            gxszxtbevo gxszxtbevoVarZoijcleaow = this.f71949iobyxmoadg.zoijcleaow();
            this.f71954wkgbmnqykc = new o4.iobyxmoadg(this, this.f71948gxszxtbevo, vdvldrhtssVar.getLength(), gxszxtbevoVarZoijcleaow.f71970nufgyqmvbu + gxszxtbevoVarZoijcleaow.f71964dxjokdxxww, gxszxtbevoVarZoijcleaow.f71971ppxfxbqfkf, (gxszxtbevoVarZoijcleaow.f71973zoijcleaow & 4) != 0);
        }
        this.f71951nufgyqmvbu = 2;
        this.f71949iobyxmoadg.gxszxtbevo();
        return 0;
    }

    private int gtknphoqwx(vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) {
        long jIobyxmoadg = this.f71954wkgbmnqykc.iobyxmoadg(vdvldrhtssVar);
        if (jIobyxmoadg >= 0) {
            ylkuphrtabVar.f109571iobyxmoadg = jIobyxmoadg;
            return 1;
        }
        if (jIobyxmoadg < -1) {
            eablkybsjg(-(jIobyxmoadg + 2));
        }
        if (!this.f71944draadjrbmk) {
            pkzmftpjix pkzmftpjixVar = (pkzmftpjix) y2.iobyxmoadg.dxjokdxxww(this.f71954wkgbmnqykc.zoijcleaow());
            this.f71952ppxfxbqfkf.gxszxtbevo(pkzmftpjixVar);
            this.f71955zoijcleaow.eablkybsjg(pkzmftpjixVar.gtknphoqwx());
            this.f71944draadjrbmk = true;
        }
        if (this.f71947gtknphoqwx <= 0 && !this.f71949iobyxmoadg.wkgbmnqykc(vdvldrhtssVar)) {
            this.f71951nufgyqmvbu = 3;
            return -1;
        }
        this.f71947gtknphoqwx = 0L;
        yadqdtsiqt yadqdtsiqtVarPpxfxbqfkf = this.f71949iobyxmoadg.ppxfxbqfkf();
        long jGxszxtbevo = gxszxtbevo(yadqdtsiqtVarPpxfxbqfkf);
        if (jGxszxtbevo >= 0) {
            long j13 = this.f71950lqeggnwhkg;
            if (j13 + jGxszxtbevo >= this.f71946eablkybsjg) {
                long jZoijcleaow = zoijcleaow(j13);
                this.f71955zoijcleaow.lqeggnwhkg(yadqdtsiqtVarPpxfxbqfkf, yadqdtsiqtVarPpxfxbqfkf.lqeggnwhkg());
                this.f71955zoijcleaow.zoijcleaow(jZoijcleaow, 1, yadqdtsiqtVarPpxfxbqfkf.lqeggnwhkg(), 0, null);
                this.f71946eablkybsjg = -1L;
            }
        }
        this.f71950lqeggnwhkg += jGxszxtbevo;
        return 0;
    }

    private void iobyxmoadg() {
        y2.iobyxmoadg.dxjokdxxww(this.f71955zoijcleaow);
        stevsuqkhv.nufgyqmvbu(this.f71952ppxfxbqfkf);
    }

    private boolean nufgyqmvbu(vdvldrhtss vdvldrhtssVar) {
        while (this.f71949iobyxmoadg.wkgbmnqykc(vdvldrhtssVar)) {
            this.f71947gtknphoqwx = vdvldrhtssVar.getPosition() - this.f71948gxszxtbevo;
            if (!dxjokdxxww(this.f71949iobyxmoadg.ppxfxbqfkf(), this.f71948gxszxtbevo, this.f71943btonecajqb)) {
                return true;
            }
            this.f71948gxszxtbevo = vdvldrhtssVar.getPosition();
        }
        this.f71951nufgyqmvbu = 3;
        return false;
    }

    protected void draadjrbmk(boolean z13) {
        if (z13) {
            this.f71943btonecajqb = new zoijcleaow();
            this.f71948gxszxtbevo = 0L;
            this.f71951nufgyqmvbu = 0;
        } else {
            this.f71951nufgyqmvbu = 1;
        }
        this.f71946eablkybsjg = -1L;
        this.f71950lqeggnwhkg = 0L;
    }

    protected abstract boolean dxjokdxxww(yadqdtsiqt yadqdtsiqtVar, long j13, zoijcleaow zoijcleaowVar);

    protected void eablkybsjg(long j13) {
        this.f71950lqeggnwhkg = j13;
    }

    protected abstract long gxszxtbevo(yadqdtsiqt yadqdtsiqtVar);

    final int lqeggnwhkg(vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) {
        iobyxmoadg();
        int i13 = this.f71951nufgyqmvbu;
        if (i13 == 0) {
            return btonecajqb(vdvldrhtssVar);
        }
        if (i13 == 1) {
            vdvldrhtssVar.draadjrbmk((int) this.f71948gxszxtbevo);
            this.f71951nufgyqmvbu = 2;
            return 0;
        }
        if (i13 == 2) {
            stevsuqkhv.nufgyqmvbu(this.f71954wkgbmnqykc);
            return gtknphoqwx(vdvldrhtssVar, ylkuphrtabVar);
        }
        if (i13 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected long ppxfxbqfkf(long j13) {
        return (((long) this.f71945dxjokdxxww) * j13) / 1000000;
    }

    final void wflxmlrfwp(long j13, long j14) {
        this.f71949iobyxmoadg.eablkybsjg();
        if (j13 == 0) {
            draadjrbmk(!this.f71944draadjrbmk);
        } else if (this.f71951nufgyqmvbu != 0) {
            this.f71946eablkybsjg = ppxfxbqfkf(j14);
            ((lqeggnwhkg) stevsuqkhv.nufgyqmvbu(this.f71954wkgbmnqykc)).ppxfxbqfkf(this.f71946eablkybsjg);
            this.f71951nufgyqmvbu = 2;
        }
    }

    void wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar, dsvhmnatus dsvhmnatusVar) {
        this.f71952ppxfxbqfkf = oxmwwwfdhmVar;
        this.f71955zoijcleaow = dsvhmnatusVar;
        draadjrbmk(true);
    }

    protected long zoijcleaow(long j13) {
        return (j13 * 1000000) / ((long) this.f71945dxjokdxxww);
    }
}
