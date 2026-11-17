package a5;

import t3.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public final class zdlpuopuiu implements wflxmlrfwp {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private long f793agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f794btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f795draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f796dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f797eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f798gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private dsvhmnatus f799gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final y2.yadqdtsiqt f800iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private String f801lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f802nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f803ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f804wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f805wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final t3.iozdgvuglv.iobyxmoadg f806zoijcleaow;

    public zdlpuopuiu(String str) {
        this(null, 0, str);
    }

    private void lqeggnwhkg(y2.yadqdtsiqt yadqdtsiqtVar) {
        int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), this.f804wflxmlrfwp - this.f796dxjokdxxww);
        this.f799gxszxtbevo.lqeggnwhkg(yadqdtsiqtVar, iMin);
        int i13 = this.f796dxjokdxxww + iMin;
        this.f796dxjokdxxww = i13;
        if (i13 < this.f804wflxmlrfwp) {
            return;
        }
        y2.iobyxmoadg.lqeggnwhkg(this.f793agtfadlqog != -9223372036854775807L);
        this.f799gxszxtbevo.zoijcleaow(this.f793agtfadlqog, 1, this.f804wflxmlrfwp, 0, null);
        this.f793agtfadlqog += this.f795draadjrbmk;
        this.f796dxjokdxxww = 0;
        this.f802nufgyqmvbu = 0;
    }

    private void nufgyqmvbu(y2.yadqdtsiqt yadqdtsiqtVar) {
        int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), 4 - this.f796dxjokdxxww);
        yadqdtsiqtVar.draadjrbmk(this.f800iobyxmoadg.eablkybsjg(), this.f796dxjokdxxww, iMin);
        int i13 = this.f796dxjokdxxww + iMin;
        this.f796dxjokdxxww = i13;
        if (i13 < 4) {
            return;
        }
        this.f800iobyxmoadg.sopmlzcsov(0);
        if (!this.f806zoijcleaow.iobyxmoadg(this.f800iobyxmoadg.vdvldrhtss())) {
            this.f796dxjokdxxww = 0;
            this.f802nufgyqmvbu = 1;
            return;
        }
        t3.iozdgvuglv.iobyxmoadg iobyxmoadgVar = this.f806zoijcleaow;
        this.f804wflxmlrfwp = iobyxmoadgVar.f109452ppxfxbqfkf;
        if (!this.f794btonecajqb) {
            this.f795draadjrbmk = (((long) iobyxmoadgVar.f109451lqeggnwhkg) * 1000000) / ((long) iobyxmoadgVar.f109453wkgbmnqykc);
            this.f799gxszxtbevo.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(this.f801lqeggnwhkg).ntlheqmsrt(this.f797eablkybsjg).zeieaojujs(this.f806zoijcleaow.f109454zoijcleaow).yfnezrywwk(4096).kegysxyocb(this.f806zoijcleaow.f109448eablkybsjg).nuxfzjnpeb(this.f806zoijcleaow.f109453wkgbmnqykc).uwvvkdfqfp(this.f803ppxfxbqfkf).weqkydbzbr(this.f805wkgbmnqykc).cllcsxoeiz());
            this.f794btonecajqb = true;
        }
        this.f800iobyxmoadg.sopmlzcsov(0);
        this.f799gxszxtbevo.lqeggnwhkg(this.f800iobyxmoadg, 4);
        this.f802nufgyqmvbu = 2;
    }

    private void zoijcleaow(y2.yadqdtsiqt yadqdtsiqtVar) {
        byte[] bArrEablkybsjg = yadqdtsiqtVar.eablkybsjg();
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        for (int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo(); iGxszxtbevo < iLqeggnwhkg; iGxszxtbevo++) {
            byte b13 = bArrEablkybsjg[iGxszxtbevo];
            boolean z13 = (b13 & 255) == 255;
            boolean z14 = this.f798gtknphoqwx && (b13 & 224) == 224;
            this.f798gtknphoqwx = z13;
            if (z14) {
                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 1);
                this.f798gtknphoqwx = false;
                this.f800iobyxmoadg.eablkybsjg()[1] = bArrEablkybsjg[iGxszxtbevo];
                this.f796dxjokdxxww = 2;
                this.f802nufgyqmvbu = 1;
                return;
            }
        }
        yadqdtsiqtVar.sopmlzcsov(iLqeggnwhkg);
    }

    @Override // a5.wflxmlrfwp
    public void eablkybsjg(long j13, int i13) {
        this.f793agtfadlqog = j13;
    }

    @Override // a5.wflxmlrfwp
    public void gxszxtbevo(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iobyxmoadg();
        this.f801lqeggnwhkg = wkgbmnqykcVar.zoijcleaow();
        this.f799gxszxtbevo = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 1);
    }

    @Override // a5.wflxmlrfwp
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
        y2.iobyxmoadg.dxjokdxxww(this.f799gxszxtbevo);
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            int i13 = this.f802nufgyqmvbu;
            if (i13 == 0) {
                zoijcleaow(yadqdtsiqtVar);
            } else if (i13 == 1) {
                nufgyqmvbu(yadqdtsiqtVar);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException();
                }
                lqeggnwhkg(yadqdtsiqtVar);
            }
        }
    }

    @Override // a5.wflxmlrfwp
    public void ppxfxbqfkf() {
        this.f802nufgyqmvbu = 0;
        this.f796dxjokdxxww = 0;
        this.f798gtknphoqwx = false;
        this.f793agtfadlqog = -9223372036854775807L;
    }

    @Override // a5.wflxmlrfwp
    public void wkgbmnqykc(boolean z13) {
    }

    public zdlpuopuiu(String str, int i13, String str2) {
        this.f802nufgyqmvbu = 0;
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(4);
        this.f800iobyxmoadg = yadqdtsiqtVar;
        yadqdtsiqtVar.eablkybsjg()[0] = -1;
        this.f806zoijcleaow = new t3.iozdgvuglv.iobyxmoadg();
        this.f793agtfadlqog = -9223372036854775807L;
        this.f803ppxfxbqfkf = str;
        this.f805wkgbmnqykc = i13;
        this.f797eablkybsjg = str2;
    }
}
