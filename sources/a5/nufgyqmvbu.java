package a5;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements t3.rgvfuqvkyq {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final t3.yggfygwlhe f604wflxmlrfwp = new t3.yggfygwlhe() { // from class: a5.lqeggnwhkg
        @Override // t3.yggfygwlhe
        public final t3.rgvfuqvkyq[] lqeggnwhkg() {
            return nufgyqmvbu.btonecajqb();
        }
    };

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f605btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f606draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f607dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final y2.cdpycssgdh f608eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f609gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private t3.oxmwwwfdhm f610gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f611iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f612lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f613nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y2.yadqdtsiqt f614ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final y2.yadqdtsiqt f615wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dxjokdxxww f616zoijcleaow;

    public nufgyqmvbu() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t3.rgvfuqvkyq[] btonecajqb() {
        return new t3.rgvfuqvkyq[]{new nufgyqmvbu()};
    }

    private void gtknphoqwx(long j13, boolean z13) {
        if (this.f606draadjrbmk) {
            return;
        }
        boolean z14 = (this.f611iobyxmoadg & 1) != 0 && this.f607dxjokdxxww > 0;
        if (z14 && this.f616zoijcleaow.gtknphoqwx() == -9223372036854775807L && !z13) {
            return;
        }
        if (!z14 || this.f616zoijcleaow.gtknphoqwx() == -9223372036854775807L) {
            this.f610gxszxtbevo.gxszxtbevo(new t3.pkzmftpjix.zoijcleaow(-9223372036854775807L));
        } else {
            this.f610gxszxtbevo.gxszxtbevo(nufgyqmvbu(j13, (this.f611iobyxmoadg & 2) != 0));
        }
        this.f606draadjrbmk = true;
    }

    private void gxszxtbevo(t3.vdvldrhtss vdvldrhtssVar) throws ParserException {
        if (this.f605btonecajqb) {
            return;
        }
        this.f607dxjokdxxww = -1;
        vdvldrhtssVar.gxszxtbevo();
        long j13 = 0;
        if (vdvldrhtssVar.getPosition() == 0) {
            wflxmlrfwp(vdvldrhtssVar);
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            try {
                if (vdvldrhtssVar.ppxfxbqfkf(this.f615wkgbmnqykc.eablkybsjg(), 0, 2, true)) {
                    this.f615wkgbmnqykc.sopmlzcsov(0);
                    if (!dxjokdxxww.wflxmlrfwp(this.f615wkgbmnqykc.wypolnanlu())) {
                        break;
                    }
                    if (vdvldrhtssVar.ppxfxbqfkf(this.f615wkgbmnqykc.eablkybsjg(), 0, 4, true)) {
                        this.f608eablkybsjg.rgvfuqvkyq(14);
                        int iNufgyqmvbu = this.f608eablkybsjg.nufgyqmvbu(13);
                        if (iNufgyqmvbu <= 6) {
                            this.f605btonecajqb = true;
                            throw ParserException.iobyxmoadg("Malformed ADTS stream", null);
                        }
                        j13 += (long) iNufgyqmvbu;
                        i14++;
                        if (i14 != 1000 && vdvldrhtssVar.wflxmlrfwp(iNufgyqmvbu - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i13 = i14;
            break;
        }
        vdvldrhtssVar.gxszxtbevo();
        if (i13 > 0) {
            this.f607dxjokdxxww = (int) (j13 / ((long) i13));
        } else {
            this.f607dxjokdxxww = -1;
        }
        this.f605btonecajqb = true;
    }

    private static int lqeggnwhkg(int i13, long j13) {
        return (int) ((((long) i13) * 8000000) / j13);
    }

    private t3.pkzmftpjix nufgyqmvbu(long j13, boolean z13) {
        return new t3.nufgyqmvbu(j13, this.f613nufgyqmvbu, lqeggnwhkg(this.f607dxjokdxxww, this.f616zoijcleaow.gtknphoqwx()), this.f607dxjokdxxww, z13);
    }

    private int wflxmlrfwp(t3.vdvldrhtss vdvldrhtssVar) {
        int i13 = 0;
        while (true) {
            vdvldrhtssVar.ojitshcjhn(this.f615wkgbmnqykc.eablkybsjg(), 0, 10);
            this.f615wkgbmnqykc.sopmlzcsov(0);
            if (this.f615wkgbmnqykc.hcddaimhww() != 4801587) {
                break;
            }
            this.f615wkgbmnqykc.crxdokpmqz(3);
            int iLmojexxdyd = this.f615wkgbmnqykc.lmojexxdyd();
            i13 += iLmojexxdyd + 10;
            vdvldrhtssVar.dxjokdxxww(iLmojexxdyd);
        }
        vdvldrhtssVar.gxszxtbevo();
        vdvldrhtssVar.dxjokdxxww(i13);
        if (this.f613nufgyqmvbu == -1) {
            this.f613nufgyqmvbu = i13;
        }
        return i13;
    }

    @Override // t3.rgvfuqvkyq
    public boolean draadjrbmk(t3.vdvldrhtss vdvldrhtssVar) {
        int iWflxmlrfwp = wflxmlrfwp(vdvldrhtssVar);
        int i13 = iWflxmlrfwp;
        int i14 = 0;
        int i15 = 0;
        do {
            vdvldrhtssVar.ojitshcjhn(this.f615wkgbmnqykc.eablkybsjg(), 0, 2);
            this.f615wkgbmnqykc.sopmlzcsov(0);
            if (dxjokdxxww.wflxmlrfwp(this.f615wkgbmnqykc.wypolnanlu())) {
                i14++;
                if (i14 >= 4 && i15 > 188) {
                    return true;
                }
                vdvldrhtssVar.ojitshcjhn(this.f615wkgbmnqykc.eablkybsjg(), 0, 4);
                this.f608eablkybsjg.rgvfuqvkyq(14);
                int iNufgyqmvbu = this.f608eablkybsjg.nufgyqmvbu(13);
                if (iNufgyqmvbu <= 6) {
                    i13++;
                    vdvldrhtssVar.gxszxtbevo();
                    vdvldrhtssVar.dxjokdxxww(i13);
                } else {
                    vdvldrhtssVar.dxjokdxxww(iNufgyqmvbu - 6);
                    i15 += iNufgyqmvbu;
                }
            } else {
                i13++;
                vdvldrhtssVar.gxszxtbevo();
                vdvldrhtssVar.dxjokdxxww(i13);
            }
            i14 = 0;
            i15 = 0;
        } while (i13 - iWflxmlrfwp < 8192);
        return false;
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        this.f609gtknphoqwx = false;
        this.f616zoijcleaow.ppxfxbqfkf();
        this.f612lqeggnwhkg = j14;
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(t3.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f610gxszxtbevo = oxmwwwfdhmVar;
        this.f616zoijcleaow.gxszxtbevo(oxmwwwfdhmVar, new jpowsppfya.wkgbmnqykc(0, 1));
        oxmwwwfdhmVar.agtfadlqog();
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(t3.vdvldrhtss vdvldrhtssVar, t3.ylkuphrtab ylkuphrtabVar) throws ParserException {
        y2.iobyxmoadg.dxjokdxxww(this.f610gxszxtbevo);
        long length = vdvldrhtssVar.getLength();
        int i13 = this.f611iobyxmoadg;
        if ((i13 & 2) != 0 || ((i13 & 1) != 0 && length != -1)) {
            gxszxtbevo(vdvldrhtssVar);
        }
        int iZoijcleaow = vdvldrhtssVar.zoijcleaow(this.f614ppxfxbqfkf.eablkybsjg(), 0, 2048);
        boolean z13 = iZoijcleaow == -1;
        gtknphoqwx(length, z13);
        if (z13) {
            return -1;
        }
        this.f614ppxfxbqfkf.sopmlzcsov(0);
        this.f614ppxfxbqfkf.ulzqkzuiru(iZoijcleaow);
        if (!this.f609gtknphoqwx) {
            this.f616zoijcleaow.eablkybsjg(this.f612lqeggnwhkg, 4);
            this.f609gtknphoqwx = true;
        }
        this.f616zoijcleaow.iobyxmoadg(this.f614ppxfxbqfkf);
        return 0;
    }

    public nufgyqmvbu(int i13) {
        this.f611iobyxmoadg = (i13 & 2) != 0 ? i13 | 1 : i13;
        this.f616zoijcleaow = new dxjokdxxww(true, "audio/mp4a-latm");
        this.f614ppxfxbqfkf = new y2.yadqdtsiqt(2048);
        this.f607dxjokdxxww = -1;
        this.f613nufgyqmvbu = -1L;
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(10);
        this.f615wkgbmnqykc = yadqdtsiqtVar;
        this.f608eablkybsjg = new y2.cdpycssgdh(yadqdtsiqtVar.eablkybsjg());
    }
}
