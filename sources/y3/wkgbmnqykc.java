package y3;

import androidx.media3.common.ParserException;
import t3.cqumvgiudr;
import t3.dsvhmnatus;
import t3.esjtqupxsv;
import t3.iwizpuwonk;
import t3.oxmwwwfdhm;
import t3.pkzmftpjix;
import t3.rgvfuqvkyq;
import t3.vdvldrhtss;
import t3.yggfygwlhe;
import t3.ylkuphrtab;
import v2.jyumaefscl;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc implements rgvfuqvkyq {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final yggfygwlhe f123658ojitshcjhn = new yggfygwlhe() { // from class: y3.ppxfxbqfkf
        @Override // t3.yggfygwlhe
        public final rgvfuqvkyq[] lqeggnwhkg() {
            return wkgbmnqykc.gtknphoqwx();
        }
    };

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private long f123659agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f123660btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private zoijcleaow f123661draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private esjtqupxsv f123662dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private oxmwwwfdhm f123663eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f123664gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private dsvhmnatus f123665gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f123666iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f123667lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private jyumaefscl f123668nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f123669ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f123670wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final t3.jyumaefscl.iobyxmoadg f123671wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yadqdtsiqt f123672zoijcleaow;

    public wkgbmnqykc() {
        this(0);
    }

    private int agtfadlqog(vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) {
        boolean z13;
        y2.iobyxmoadg.eablkybsjg(this.f123665gxszxtbevo);
        y2.iobyxmoadg.eablkybsjg(this.f123662dxjokdxxww);
        zoijcleaow zoijcleaowVar = this.f123661draadjrbmk;
        if (zoijcleaowVar != null && zoijcleaowVar.wkgbmnqykc()) {
            return this.f123661draadjrbmk.ppxfxbqfkf(vdvldrhtssVar, ylkuphrtabVar);
        }
        if (this.f123659agtfadlqog == -1) {
            this.f123659agtfadlqog = t3.jyumaefscl.dxjokdxxww(vdvldrhtssVar, this.f123662dxjokdxxww);
            return 0;
        }
        int iLqeggnwhkg = this.f123672zoijcleaow.lqeggnwhkg();
        if (iLqeggnwhkg < 32768) {
            int iZoijcleaow = vdvldrhtssVar.zoijcleaow(this.f123672zoijcleaow.eablkybsjg(), iLqeggnwhkg, 32768 - iLqeggnwhkg);
            z13 = iZoijcleaow == -1;
            if (!z13) {
                this.f123672zoijcleaow.ulzqkzuiru(iLqeggnwhkg + iZoijcleaow);
            } else if (this.f123672zoijcleaow.iobyxmoadg() == 0) {
                wflxmlrfwp();
                return -1;
            }
        } else {
            z13 = false;
        }
        int iGxszxtbevo = this.f123672zoijcleaow.gxszxtbevo();
        int i13 = this.f123670wflxmlrfwp;
        int i14 = this.f123660btonecajqb;
        if (i13 < i14) {
            yadqdtsiqt yadqdtsiqtVar = this.f123672zoijcleaow;
            yadqdtsiqtVar.crxdokpmqz(Math.min(i14 - i13, yadqdtsiqtVar.iobyxmoadg()));
        }
        long jGxszxtbevo = gxszxtbevo(this.f123672zoijcleaow, z13);
        int iGxszxtbevo2 = this.f123672zoijcleaow.gxszxtbevo() - iGxszxtbevo;
        this.f123672zoijcleaow.sopmlzcsov(iGxszxtbevo);
        this.f123665gxszxtbevo.lqeggnwhkg(this.f123672zoijcleaow, iGxszxtbevo2);
        this.f123670wflxmlrfwp += iGxszxtbevo2;
        if (jGxszxtbevo != -1) {
            wflxmlrfwp();
            this.f123670wflxmlrfwp = 0;
            this.f123659agtfadlqog = jGxszxtbevo;
        }
        int length = this.f123672zoijcleaow.eablkybsjg().length - this.f123672zoijcleaow.lqeggnwhkg();
        if (this.f123672zoijcleaow.iobyxmoadg() < 16 && length < 16) {
            int iIobyxmoadg = this.f123672zoijcleaow.iobyxmoadg();
            System.arraycopy(this.f123672zoijcleaow.eablkybsjg(), this.f123672zoijcleaow.gxszxtbevo(), this.f123672zoijcleaow.eablkybsjg(), 0, iIobyxmoadg);
            this.f123672zoijcleaow.sopmlzcsov(0);
            this.f123672zoijcleaow.ulzqkzuiru(iIobyxmoadg);
        }
        return 0;
    }

    private void btonecajqb(vdvldrhtss vdvldrhtssVar) {
        byte[] bArr = this.f123666iobyxmoadg;
        vdvldrhtssVar.ojitshcjhn(bArr, 0, bArr.length);
        vdvldrhtssVar.gxszxtbevo();
        this.f123667lqeggnwhkg = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ rgvfuqvkyq[] gtknphoqwx() {
        return new rgvfuqvkyq[]{new wkgbmnqykc()};
    }

    private long gxszxtbevo(yadqdtsiqt yadqdtsiqtVar, boolean z13) {
        boolean zWkgbmnqykc;
        y2.iobyxmoadg.eablkybsjg(this.f123662dxjokdxxww);
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        while (iGxszxtbevo <= yadqdtsiqtVar.lqeggnwhkg() - 16) {
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            if (t3.jyumaefscl.wkgbmnqykc(yadqdtsiqtVar, this.f123662dxjokdxxww, this.f123664gtknphoqwx, this.f123671wkgbmnqykc)) {
                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                return this.f123671wkgbmnqykc.f109478iobyxmoadg;
            }
            iGxszxtbevo++;
        }
        if (!z13) {
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            return -1L;
        }
        while (iGxszxtbevo <= yadqdtsiqtVar.lqeggnwhkg() - this.f123660btonecajqb) {
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            try {
                zWkgbmnqykc = t3.jyumaefscl.wkgbmnqykc(yadqdtsiqtVar, this.f123662dxjokdxxww, this.f123664gtknphoqwx, this.f123671wkgbmnqykc);
            } catch (IndexOutOfBoundsException unused) {
                zWkgbmnqykc = false;
            }
            if (yadqdtsiqtVar.gxszxtbevo() <= yadqdtsiqtVar.lqeggnwhkg() ? zWkgbmnqykc : false) {
                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                return this.f123671wkgbmnqykc.f109478iobyxmoadg;
            }
            iGxszxtbevo++;
        }
        yadqdtsiqtVar.sopmlzcsov(yadqdtsiqtVar.lqeggnwhkg());
        return -1L;
    }

    private void lqeggnwhkg(vdvldrhtss vdvldrhtssVar) {
        this.f123664gtknphoqwx = iwizpuwonk.zoijcleaow(vdvldrhtssVar);
        ((oxmwwwfdhm) stevsuqkhv.nufgyqmvbu(this.f123663eablkybsjg)).gxszxtbevo(nufgyqmvbu(vdvldrhtssVar.getPosition(), vdvldrhtssVar.getLength()));
        this.f123667lqeggnwhkg = 5;
    }

    private pkzmftpjix nufgyqmvbu(long j13, long j14) {
        y2.iobyxmoadg.eablkybsjg(this.f123662dxjokdxxww);
        esjtqupxsv esjtqupxsvVar = this.f123662dxjokdxxww;
        if (esjtqupxsvVar.f109421gtknphoqwx != null) {
            return new cqumvgiudr(esjtqupxsvVar, j13);
        }
        if (j14 == -1 || esjtqupxsvVar.f109417btonecajqb <= 0) {
            return new pkzmftpjix.zoijcleaow(esjtqupxsvVar.gxszxtbevo());
        }
        zoijcleaow zoijcleaowVar = new zoijcleaow(esjtqupxsvVar, this.f123664gtknphoqwx, j13, j14);
        this.f123661draadjrbmk = zoijcleaowVar;
        return zoijcleaowVar.zoijcleaow();
    }

    private void ojitshcjhn(vdvldrhtss vdvldrhtssVar) {
        this.f123668nufgyqmvbu = iwizpuwonk.wkgbmnqykc(vdvldrhtssVar, !this.f123669ppxfxbqfkf);
        this.f123667lqeggnwhkg = 1;
    }

    private void rgvfuqvkyq(vdvldrhtss vdvldrhtssVar) {
        iwizpuwonk.iobyxmoadg iobyxmoadgVar = new iwizpuwonk.iobyxmoadg(this.f123662dxjokdxxww);
        boolean zEablkybsjg = false;
        while (!zEablkybsjg) {
            zEablkybsjg = iwizpuwonk.eablkybsjg(vdvldrhtssVar, iobyxmoadgVar);
            this.f123662dxjokdxxww = (esjtqupxsv) stevsuqkhv.nufgyqmvbu(iobyxmoadgVar.f109470iobyxmoadg);
        }
        y2.iobyxmoadg.eablkybsjg(this.f123662dxjokdxxww);
        this.f123660btonecajqb = Math.max(this.f123662dxjokdxxww.f109426ppxfxbqfkf, 6);
        ((dsvhmnatus) stevsuqkhv.nufgyqmvbu(this.f123665gxszxtbevo)).iobyxmoadg(this.f123662dxjokdxxww.lqeggnwhkg(this.f123666iobyxmoadg, this.f123668nufgyqmvbu).zoijcleaow().ntlheqmsrt("audio/flac").cllcsxoeiz());
        ((dsvhmnatus) stevsuqkhv.nufgyqmvbu(this.f123665gxszxtbevo)).eablkybsjg(this.f123662dxjokdxxww.gxszxtbevo());
        this.f123667lqeggnwhkg = 4;
    }

    private void vdvldrhtss(vdvldrhtss vdvldrhtssVar) throws ParserException {
        iwizpuwonk.dxjokdxxww(vdvldrhtssVar);
        this.f123667lqeggnwhkg = 3;
    }

    private void wflxmlrfwp() {
        ((dsvhmnatus) stevsuqkhv.nufgyqmvbu(this.f123665gxszxtbevo)).zoijcleaow((this.f123659agtfadlqog * 1000000) / ((long) ((esjtqupxsv) stevsuqkhv.nufgyqmvbu(this.f123662dxjokdxxww)).f109420eablkybsjg), 1, this.f123670wflxmlrfwp, 0, null);
    }

    @Override // t3.rgvfuqvkyq
    public boolean draadjrbmk(vdvldrhtss vdvldrhtssVar) {
        iwizpuwonk.ppxfxbqfkf(vdvldrhtssVar, false);
        return iwizpuwonk.iobyxmoadg(vdvldrhtssVar);
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        if (j13 == 0) {
            this.f123667lqeggnwhkg = 0;
        } else {
            zoijcleaow zoijcleaowVar = this.f123661draadjrbmk;
            if (zoijcleaowVar != null) {
                zoijcleaowVar.nufgyqmvbu(j14);
            }
        }
        this.f123659agtfadlqog = j14 != 0 ? -1L : 0L;
        this.f123670wflxmlrfwp = 0;
        this.f123672zoijcleaow.tzroggbefp(0);
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f123663eablkybsjg = oxmwwwfdhmVar;
        this.f123665gxszxtbevo = oxmwwwfdhmVar.kcexrzcfyt(0, 1);
        oxmwwwfdhmVar.agtfadlqog();
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) throws ParserException {
        int i13 = this.f123667lqeggnwhkg;
        if (i13 == 0) {
            ojitshcjhn(vdvldrhtssVar);
            return 0;
        }
        if (i13 == 1) {
            btonecajqb(vdvldrhtssVar);
            return 0;
        }
        if (i13 == 2) {
            vdvldrhtss(vdvldrhtssVar);
            return 0;
        }
        if (i13 == 3) {
            rgvfuqvkyq(vdvldrhtssVar);
            return 0;
        }
        if (i13 == 4) {
            lqeggnwhkg(vdvldrhtssVar);
            return 0;
        }
        if (i13 == 5) {
            return agtfadlqog(vdvldrhtssVar, ylkuphrtabVar);
        }
        throw new IllegalStateException();
    }

    public wkgbmnqykc(int i13) {
        this.f123666iobyxmoadg = new byte[42];
        this.f123672zoijcleaow = new yadqdtsiqt(new byte[32768], 0);
        this.f123669ppxfxbqfkf = (i13 & 1) != 0;
        this.f123671wkgbmnqykc = new t3.jyumaefscl.iobyxmoadg();
        this.f123667lqeggnwhkg = 0;
    }
}
