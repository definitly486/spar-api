package a5;

import t3.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo implements wflxmlrfwp {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f485agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f486btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f487draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f488dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f489eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f490gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private String f491gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final y2.cdpycssgdh f492iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private dsvhmnatus f493lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f494nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private long f495ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f496ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f497wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f498wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.yadqdtsiqt f499zoijcleaow;

    public gxszxtbevo(String str) {
        this(null, 0, str);
    }

    private void lqeggnwhkg() {
        this.f492iobyxmoadg.rgvfuqvkyq(0);
        t3.ppxfxbqfkf.C2689ppxfxbqfkf c2689ppxfxbqfkfGxszxtbevo = t3.ppxfxbqfkf.gxszxtbevo(this.f492iobyxmoadg);
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = this.f497wflxmlrfwp;
        if (iobyxmoadgVar == null || c2689ppxfxbqfkfGxszxtbevo.f109534ppxfxbqfkf != iobyxmoadgVar.f9779yadqdtsiqt || c2689ppxfxbqfkfGxszxtbevo.f109536zoijcleaow != iobyxmoadgVar.f9759iozdgvuglv || !"audio/ac4".equals(iobyxmoadgVar.f9769ojitshcjhn)) {
            androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(this.f491gxszxtbevo).ntlheqmsrt(this.f489eablkybsjg).zeieaojujs("audio/ac4").kegysxyocb(c2689ppxfxbqfkfGxszxtbevo.f109534ppxfxbqfkf).nuxfzjnpeb(c2689ppxfxbqfkfGxszxtbevo.f109536zoijcleaow).uwvvkdfqfp(this.f496ppxfxbqfkf).weqkydbzbr(this.f498wkgbmnqykc).cllcsxoeiz();
            this.f497wflxmlrfwp = iobyxmoadgVarCllcsxoeiz;
            this.f493lqeggnwhkg.iobyxmoadg(iobyxmoadgVarCllcsxoeiz);
        }
        this.f485agtfadlqog = c2689ppxfxbqfkfGxszxtbevo.f109535wkgbmnqykc;
        this.f487draadjrbmk = (((long) c2689ppxfxbqfkfGxszxtbevo.f109532eablkybsjg) * 1000000) / ((long) this.f497wflxmlrfwp.f9759iozdgvuglv);
    }

    private boolean nufgyqmvbu(y2.yadqdtsiqt yadqdtsiqtVar) {
        while (true) {
            if (yadqdtsiqtVar.iobyxmoadg() <= 0) {
                return false;
            }
            if (this.f486btonecajqb) {
                int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                this.f486btonecajqb = iWwaezpbzkn == 172;
                if (iWwaezpbzkn == 64 || iWwaezpbzkn == 65) {
                    this.f490gtknphoqwx = iWwaezpbzkn == 65;
                    return true;
                }
            } else {
                this.f486btonecajqb = yadqdtsiqtVar.wwaezpbzkn() == 172;
            }
        }
    }

    private boolean zoijcleaow(y2.yadqdtsiqt yadqdtsiqtVar, byte[] bArr, int i13) {
        int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), i13 - this.f488dxjokdxxww);
        yadqdtsiqtVar.draadjrbmk(bArr, this.f488dxjokdxxww, iMin);
        int i14 = this.f488dxjokdxxww + iMin;
        this.f488dxjokdxxww = i14;
        return i14 == i13;
    }

    @Override // a5.wflxmlrfwp
    public void eablkybsjg(long j13, int i13) {
        this.f495ojitshcjhn = j13;
    }

    @Override // a5.wflxmlrfwp
    public void gxszxtbevo(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iobyxmoadg();
        this.f491gxszxtbevo = wkgbmnqykcVar.zoijcleaow();
        this.f493lqeggnwhkg = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 1);
    }

    @Override // a5.wflxmlrfwp
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
        y2.iobyxmoadg.dxjokdxxww(this.f493lqeggnwhkg);
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            int i13 = this.f494nufgyqmvbu;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), this.f485agtfadlqog - this.f488dxjokdxxww);
                        this.f493lqeggnwhkg.lqeggnwhkg(yadqdtsiqtVar, iMin);
                        int i14 = this.f488dxjokdxxww + iMin;
                        this.f488dxjokdxxww = i14;
                        if (i14 == this.f485agtfadlqog) {
                            y2.iobyxmoadg.lqeggnwhkg(this.f495ojitshcjhn != -9223372036854775807L);
                            this.f493lqeggnwhkg.zoijcleaow(this.f495ojitshcjhn, 1, this.f485agtfadlqog, 0, null);
                            this.f495ojitshcjhn += this.f487draadjrbmk;
                            this.f494nufgyqmvbu = 0;
                        }
                    }
                } else if (zoijcleaow(yadqdtsiqtVar, this.f499zoijcleaow.eablkybsjg(), 16)) {
                    lqeggnwhkg();
                    this.f499zoijcleaow.sopmlzcsov(0);
                    this.f493lqeggnwhkg.lqeggnwhkg(this.f499zoijcleaow, 16);
                    this.f494nufgyqmvbu = 2;
                }
            } else if (nufgyqmvbu(yadqdtsiqtVar)) {
                this.f494nufgyqmvbu = 1;
                this.f499zoijcleaow.eablkybsjg()[0] = -84;
                this.f499zoijcleaow.eablkybsjg()[1] = (byte) (this.f490gtknphoqwx ? 65 : 64);
                this.f488dxjokdxxww = 2;
            }
        }
    }

    @Override // a5.wflxmlrfwp
    public void ppxfxbqfkf() {
        this.f494nufgyqmvbu = 0;
        this.f488dxjokdxxww = 0;
        this.f486btonecajqb = false;
        this.f490gtknphoqwx = false;
        this.f495ojitshcjhn = -9223372036854775807L;
    }

    @Override // a5.wflxmlrfwp
    public void wkgbmnqykc(boolean z13) {
    }

    public gxszxtbevo(String str, int i13, String str2) {
        y2.cdpycssgdh cdpycssgdhVar = new y2.cdpycssgdh(new byte[16]);
        this.f492iobyxmoadg = cdpycssgdhVar;
        this.f499zoijcleaow = new y2.yadqdtsiqt(cdpycssgdhVar.f123526iobyxmoadg);
        this.f494nufgyqmvbu = 0;
        this.f488dxjokdxxww = 0;
        this.f486btonecajqb = false;
        this.f490gtknphoqwx = false;
        this.f495ojitshcjhn = -9223372036854775807L;
        this.f496ppxfxbqfkf = str;
        this.f498wkgbmnqykc = i13;
        this.f489eablkybsjg = str2;
    }
}
