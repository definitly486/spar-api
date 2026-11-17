package androidx.media3.extractor.flv;

import androidx.media3.extractor.flv.zoijcleaow;
import t3.oxmwwwfdhm;
import t3.pkzmftpjix;
import t3.rgvfuqvkyq;
import t3.vdvldrhtss;
import t3.yggfygwlhe;
import t3.ylkuphrtab;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements rgvfuqvkyq {

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final yggfygwlhe f11697vdvldrhtss = new yggfygwlhe() { // from class: z3.iobyxmoadg
        @Override // t3.yggfygwlhe
        public final rgvfuqvkyq[] lqeggnwhkg() {
            return zoijcleaow.nufgyqmvbu();
        }
    };

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f11698agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f11699btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f11700draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f11701dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f11703gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private oxmwwwfdhm f11704gxszxtbevo;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f11707nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private iobyxmoadg f11708ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private wkgbmnqykc f11710rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f11711wflxmlrfwp;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f11705iobyxmoadg = new yadqdtsiqt(4);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yadqdtsiqt f11713zoijcleaow = new yadqdtsiqt(9);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yadqdtsiqt f11709ppxfxbqfkf = new yadqdtsiqt(11);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yadqdtsiqt f11712wkgbmnqykc = new yadqdtsiqt();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ppxfxbqfkf f11702eablkybsjg = new ppxfxbqfkf();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f11706lqeggnwhkg = 1;

    private boolean agtfadlqog(vdvldrhtss vdvldrhtssVar) {
        if (!vdvldrhtssVar.lqeggnwhkg(this.f11709ppxfxbqfkf.eablkybsjg(), 0, 11, true)) {
            return false;
        }
        this.f11709ppxfxbqfkf.sopmlzcsov(0);
        this.f11703gtknphoqwx = this.f11709ppxfxbqfkf.wwaezpbzkn();
        this.f11700draadjrbmk = this.f11709ppxfxbqfkf.hcddaimhww();
        this.f11711wflxmlrfwp = this.f11709ppxfxbqfkf.hcddaimhww();
        this.f11711wflxmlrfwp = (((long) (this.f11709ppxfxbqfkf.wwaezpbzkn() << 24)) | this.f11711wflxmlrfwp) * 1000;
        this.f11709ppxfxbqfkf.crxdokpmqz(3);
        this.f11706lqeggnwhkg = 4;
        return true;
    }

    private yadqdtsiqt btonecajqb(vdvldrhtss vdvldrhtssVar) {
        if (this.f11700draadjrbmk > this.f11712wkgbmnqykc.zoijcleaow()) {
            yadqdtsiqt yadqdtsiqtVar = this.f11712wkgbmnqykc;
            yadqdtsiqtVar.ntlheqmsrt(new byte[Math.max(yadqdtsiqtVar.zoijcleaow() * 2, this.f11700draadjrbmk)], 0);
        } else {
            this.f11712wkgbmnqykc.sopmlzcsov(0);
        }
        this.f11712wkgbmnqykc.ulzqkzuiru(this.f11700draadjrbmk);
        vdvldrhtssVar.readFully(this.f11712wkgbmnqykc.eablkybsjg(), 0, this.f11700draadjrbmk);
        return this.f11712wkgbmnqykc;
    }

    private boolean gtknphoqwx(vdvldrhtss vdvldrhtssVar) {
        if (!vdvldrhtssVar.lqeggnwhkg(this.f11713zoijcleaow.eablkybsjg(), 0, 9, true)) {
            return false;
        }
        this.f11713zoijcleaow.sopmlzcsov(0);
        this.f11713zoijcleaow.crxdokpmqz(4);
        int iWwaezpbzkn = this.f11713zoijcleaow.wwaezpbzkn();
        boolean z13 = (iWwaezpbzkn & 4) != 0;
        boolean z14 = (iWwaezpbzkn & 1) != 0;
        if (z13 && this.f11708ojitshcjhn == null) {
            this.f11708ojitshcjhn = new iobyxmoadg(this.f11704gxszxtbevo.kcexrzcfyt(8, 1));
        }
        if (z14 && this.f11710rgvfuqvkyq == null) {
            this.f11710rgvfuqvkyq = new wkgbmnqykc(this.f11704gxszxtbevo.kcexrzcfyt(9, 2));
        }
        this.f11704gxszxtbevo.agtfadlqog();
        this.f11699btonecajqb = this.f11713zoijcleaow.vdvldrhtss() - 5;
        this.f11706lqeggnwhkg = 2;
        return true;
    }

    private void gxszxtbevo() {
        if (this.f11698agtfadlqog) {
            return;
        }
        this.f11704gxszxtbevo.gxszxtbevo(new pkzmftpjix.zoijcleaow(-9223372036854775807L));
        this.f11698agtfadlqog = true;
    }

    private long lqeggnwhkg() {
        if (this.f11707nufgyqmvbu) {
            return this.f11701dxjokdxxww + this.f11711wflxmlrfwp;
        }
        if (this.f11702eablkybsjg.wkgbmnqykc() == -9223372036854775807L) {
            return 0L;
        }
        return this.f11711wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ rgvfuqvkyq[] nufgyqmvbu() {
        return new rgvfuqvkyq[]{new zoijcleaow()};
    }

    private void ojitshcjhn(vdvldrhtss vdvldrhtssVar) {
        vdvldrhtssVar.draadjrbmk(this.f11699btonecajqb);
        this.f11699btonecajqb = 0;
        this.f11706lqeggnwhkg = 3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    private boolean wflxmlrfwp(vdvldrhtss vdvldrhtssVar) {
        boolean zIobyxmoadg;
        boolean z13;
        long j13;
        long jLqeggnwhkg = lqeggnwhkg();
        int i13 = this.f11703gtknphoqwx;
        if (i13 == 8 && this.f11708ojitshcjhn != null) {
            gxszxtbevo();
            zIobyxmoadg = this.f11708ojitshcjhn.iobyxmoadg(btonecajqb(vdvldrhtssVar), jLqeggnwhkg);
        } else {
            if (i13 != 9 || this.f11710rgvfuqvkyq == null) {
                if (i13 != 18 || this.f11698agtfadlqog) {
                    vdvldrhtssVar.draadjrbmk(this.f11700draadjrbmk);
                    zIobyxmoadg = false;
                    z13 = false;
                } else {
                    zIobyxmoadg = this.f11702eablkybsjg.iobyxmoadg(btonecajqb(vdvldrhtssVar), jLqeggnwhkg);
                    long jWkgbmnqykc = this.f11702eablkybsjg.wkgbmnqykc();
                    if (jWkgbmnqykc != -9223372036854775807L) {
                        this.f11704gxszxtbevo.gxszxtbevo(new t3.yadqdtsiqt(this.f11702eablkybsjg.eablkybsjg(), this.f11702eablkybsjg.gxszxtbevo(), jWkgbmnqykc));
                        this.f11698agtfadlqog = true;
                    }
                }
                if (!this.f11707nufgyqmvbu && zIobyxmoadg) {
                    this.f11707nufgyqmvbu = true;
                    if (this.f11702eablkybsjg.wkgbmnqykc() == -9223372036854775807L) {
                        j13 = -this.f11711wflxmlrfwp;
                    } else {
                        j13 = 0;
                    }
                    this.f11701dxjokdxxww = j13;
                }
                this.f11699btonecajqb = 4;
                this.f11706lqeggnwhkg = 2;
                return z13;
            }
            gxszxtbevo();
            zIobyxmoadg = this.f11710rgvfuqvkyq.iobyxmoadg(btonecajqb(vdvldrhtssVar), jLqeggnwhkg);
        }
        z13 = true;
        if (!this.f11707nufgyqmvbu) {
            this.f11707nufgyqmvbu = true;
            if (this.f11702eablkybsjg.wkgbmnqykc() == -9223372036854775807L) {
                j13 = -this.f11711wflxmlrfwp;
            } else {
                j13 = 0;
            }
            this.f11701dxjokdxxww = j13;
        }
        this.f11699btonecajqb = 4;
        this.f11706lqeggnwhkg = 2;
        return z13;
    }

    @Override // t3.rgvfuqvkyq
    public boolean draadjrbmk(vdvldrhtss vdvldrhtssVar) {
        vdvldrhtssVar.ojitshcjhn(this.f11705iobyxmoadg.eablkybsjg(), 0, 3);
        this.f11705iobyxmoadg.sopmlzcsov(0);
        if (this.f11705iobyxmoadg.hcddaimhww() != 4607062) {
            return false;
        }
        vdvldrhtssVar.ojitshcjhn(this.f11705iobyxmoadg.eablkybsjg(), 0, 2);
        this.f11705iobyxmoadg.sopmlzcsov(0);
        if ((this.f11705iobyxmoadg.wypolnanlu() & 250) != 0) {
            return false;
        }
        vdvldrhtssVar.ojitshcjhn(this.f11705iobyxmoadg.eablkybsjg(), 0, 4);
        this.f11705iobyxmoadg.sopmlzcsov(0);
        int iVdvldrhtss = this.f11705iobyxmoadg.vdvldrhtss();
        vdvldrhtssVar.gxszxtbevo();
        vdvldrhtssVar.dxjokdxxww(iVdvldrhtss);
        vdvldrhtssVar.ojitshcjhn(this.f11705iobyxmoadg.eablkybsjg(), 0, 4);
        this.f11705iobyxmoadg.sopmlzcsov(0);
        return this.f11705iobyxmoadg.vdvldrhtss() == 0;
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        if (j13 == 0) {
            this.f11706lqeggnwhkg = 1;
            this.f11707nufgyqmvbu = false;
        } else {
            this.f11706lqeggnwhkg = 3;
        }
        this.f11699btonecajqb = 0;
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f11704gxszxtbevo = oxmwwwfdhmVar;
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) {
        y2.iobyxmoadg.dxjokdxxww(this.f11704gxszxtbevo);
        while (true) {
            int i13 = this.f11706lqeggnwhkg;
            if (i13 != 1) {
                if (i13 == 2) {
                    ojitshcjhn(vdvldrhtssVar);
                } else if (i13 != 3) {
                    if (i13 != 4) {
                        throw new IllegalStateException();
                    }
                    if (wflxmlrfwp(vdvldrhtssVar)) {
                        return 0;
                    }
                } else if (!agtfadlqog(vdvldrhtssVar)) {
                    return -1;
                }
            } else if (!gtknphoqwx(vdvldrhtssVar)) {
                return -1;
            }
        }
    }
}
