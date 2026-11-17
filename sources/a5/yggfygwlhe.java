package a5;

import androidx.media3.common.ParserException;
import t3.dsvhmnatus;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class yggfygwlhe implements wflxmlrfwp {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f763btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f764draadjrbmk;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private String f768gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f769iobyxmoadg;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f770jyumaefscl;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private dsvhmnatus f772lqeggnwhkg;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f774ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f777rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f779wflxmlrfwp;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f782zdlpuopuiu;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f766eablkybsjg = 0;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.yadqdtsiqt f783zoijcleaow = new y2.yadqdtsiqt(new byte[15], 2);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y2.cdpycssgdh f776ppxfxbqfkf = new y2.cdpycssgdh();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final y2.yadqdtsiqt f780wkgbmnqykc = new y2.yadqdtsiqt();

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private jyumaefscl.zoijcleaow f778vdvldrhtss = new jyumaefscl.zoijcleaow();

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f775oxmwwwfdhm = -2147483647;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private int f771kcexrzcfyt = -1;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f781yggfygwlhe = -1;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f767gtknphoqwx = true;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f762agtfadlqog = true;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private double f773nufgyqmvbu = -9.223372036854776E18d;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private double f765dxjokdxxww = -9.223372036854776E18d;

    public yggfygwlhe(String str) {
        this.f769iobyxmoadg = str;
    }

    private boolean btonecajqb(int i13) {
        return i13 == 1 || i13 == 17;
    }

    private void draadjrbmk(y2.yadqdtsiqt yadqdtsiqtVar) {
        int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), this.f778vdvldrhtss.f573ppxfxbqfkf - this.f774ojitshcjhn);
        this.f772lqeggnwhkg.lqeggnwhkg(yadqdtsiqtVar, iMin);
        this.f774ojitshcjhn += iMin;
    }

    private boolean dxjokdxxww() throws ParserException {
        int iLqeggnwhkg = this.f783zoijcleaow.lqeggnwhkg();
        this.f776ppxfxbqfkf.ojitshcjhn(this.f783zoijcleaow.eablkybsjg(), iLqeggnwhkg);
        boolean zLqeggnwhkg = jyumaefscl.lqeggnwhkg(this.f776ppxfxbqfkf, this.f778vdvldrhtss);
        if (zLqeggnwhkg) {
            this.f774ojitshcjhn = 0;
            this.f777rgvfuqvkyq += this.f778vdvldrhtss.f573ppxfxbqfkf + iLqeggnwhkg;
        }
        return zLqeggnwhkg;
    }

    private boolean gtknphoqwx(y2.yadqdtsiqt yadqdtsiqtVar) {
        int i13 = this.f764draadjrbmk;
        if ((i13 & 2) == 0) {
            yadqdtsiqtVar.sopmlzcsov(yadqdtsiqtVar.lqeggnwhkg());
            return false;
        }
        if ((i13 & 4) != 0) {
            return true;
        }
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            int i14 = this.f779wflxmlrfwp << 8;
            this.f779wflxmlrfwp = i14;
            int iWwaezpbzkn = i14 | yadqdtsiqtVar.wwaezpbzkn();
            this.f779wflxmlrfwp = iWwaezpbzkn;
            if (jyumaefscl.eablkybsjg(iWwaezpbzkn)) {
                yadqdtsiqtVar.sopmlzcsov(yadqdtsiqtVar.gxszxtbevo() - 3);
                this.f779wflxmlrfwp = 0;
                return true;
            }
        }
        return false;
    }

    private void lqeggnwhkg() {
        int i13;
        if (this.f770jyumaefscl) {
            this.f767gtknphoqwx = false;
            i13 = 1;
        } else {
            i13 = 0;
        }
        double d13 = (((double) (this.f771kcexrzcfyt - this.f782zdlpuopuiu)) * 1000000.0d) / ((double) this.f775oxmwwwfdhm);
        long jRound = Math.round(this.f773nufgyqmvbu);
        if (this.f763btonecajqb) {
            this.f763btonecajqb = false;
            this.f773nufgyqmvbu = this.f765dxjokdxxww;
        } else {
            this.f773nufgyqmvbu += d13;
        }
        this.f772lqeggnwhkg.zoijcleaow(jRound, i13, this.f777rgvfuqvkyq, 0, null);
        this.f770jyumaefscl = false;
        this.f782zdlpuopuiu = 0;
        this.f777rgvfuqvkyq = 0;
    }

    private void nufgyqmvbu(y2.cdpycssgdh cdpycssgdhVar) throws ParserException {
        jyumaefscl.ppxfxbqfkf ppxfxbqfkfVarNufgyqmvbu = jyumaefscl.nufgyqmvbu(cdpycssgdhVar);
        this.f775oxmwwwfdhm = ppxfxbqfkfVarNufgyqmvbu.f571zoijcleaow;
        this.f771kcexrzcfyt = ppxfxbqfkfVarNufgyqmvbu.f569ppxfxbqfkf;
        long j13 = this.f781yggfygwlhe;
        long j14 = this.f778vdvldrhtss.f574zoijcleaow;
        if (j13 != j14) {
            this.f781yggfygwlhe = j14;
            String str = "mhm1";
            if (ppxfxbqfkfVarNufgyqmvbu.f568iobyxmoadg != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(ppxfxbqfkfVarNufgyqmvbu.f568iobyxmoadg));
            }
            byte[] bArr = ppxfxbqfkfVarNufgyqmvbu.f570wkgbmnqykc;
            this.f772lqeggnwhkg.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(this.f768gxszxtbevo).ntlheqmsrt(this.f769iobyxmoadg).zeieaojujs("audio/mhm1").nuxfzjnpeb(this.f775oxmwwwfdhm).tzroggbefp(str).metgxyhuhe((bArr == null || bArr.length <= 0) ? null : com.google.common.collect.zdlpuopuiu.cdpycssgdh(stevsuqkhv.f123601gxszxtbevo, bArr)).cllcsxoeiz());
        }
        this.f770jyumaefscl = true;
    }

    private void zoijcleaow(y2.yadqdtsiqt yadqdtsiqtVar, y2.yadqdtsiqt yadqdtsiqtVar2, boolean z13) {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), yadqdtsiqtVar2.iobyxmoadg());
        yadqdtsiqtVar.draadjrbmk(yadqdtsiqtVar2.eablkybsjg(), yadqdtsiqtVar2.gxszxtbevo(), iMin);
        yadqdtsiqtVar2.crxdokpmqz(iMin);
        if (z13) {
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
        }
    }

    @Override // a5.wflxmlrfwp
    public void eablkybsjg(long j13, int i13) {
        this.f764draadjrbmk = i13;
        if (!this.f767gtknphoqwx && (this.f777rgvfuqvkyq != 0 || !this.f762agtfadlqog)) {
            this.f763btonecajqb = true;
        }
        if (j13 != -9223372036854775807L) {
            if (this.f763btonecajqb) {
                this.f765dxjokdxxww = j13;
            } else {
                this.f773nufgyqmvbu = j13;
            }
        }
    }

    @Override // a5.wflxmlrfwp
    public void gxszxtbevo(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iobyxmoadg();
        this.f768gxszxtbevo = wkgbmnqykcVar.zoijcleaow();
        this.f772lqeggnwhkg = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 1);
    }

    @Override // a5.wflxmlrfwp
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) throws ParserException {
        y2.iobyxmoadg.dxjokdxxww(this.f772lqeggnwhkg);
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            int i13 = this.f766eablkybsjg;
            if (i13 != 0) {
                if (i13 == 1) {
                    zoijcleaow(yadqdtsiqtVar, this.f783zoijcleaow, false);
                    if (this.f783zoijcleaow.iobyxmoadg() != 0) {
                        this.f762agtfadlqog = false;
                    } else if (dxjokdxxww()) {
                        this.f783zoijcleaow.sopmlzcsov(0);
                        dsvhmnatus dsvhmnatusVar = this.f772lqeggnwhkg;
                        y2.yadqdtsiqt yadqdtsiqtVar2 = this.f783zoijcleaow;
                        dsvhmnatusVar.lqeggnwhkg(yadqdtsiqtVar2, yadqdtsiqtVar2.lqeggnwhkg());
                        this.f783zoijcleaow.tzroggbefp(2);
                        this.f780wkgbmnqykc.tzroggbefp(this.f778vdvldrhtss.f573ppxfxbqfkf);
                        this.f762agtfadlqog = true;
                        this.f766eablkybsjg = 2;
                    } else if (this.f783zoijcleaow.lqeggnwhkg() < 15) {
                        y2.yadqdtsiqt yadqdtsiqtVar3 = this.f783zoijcleaow;
                        yadqdtsiqtVar3.ulzqkzuiru(yadqdtsiqtVar3.lqeggnwhkg() + 1);
                        this.f762agtfadlqog = false;
                    }
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException();
                    }
                    if (btonecajqb(this.f778vdvldrhtss.f572iobyxmoadg)) {
                        zoijcleaow(yadqdtsiqtVar, this.f780wkgbmnqykc, true);
                    }
                    draadjrbmk(yadqdtsiqtVar);
                    int i14 = this.f774ojitshcjhn;
                    jyumaefscl.zoijcleaow zoijcleaowVar = this.f778vdvldrhtss;
                    if (i14 == zoijcleaowVar.f573ppxfxbqfkf) {
                        int i15 = zoijcleaowVar.f572iobyxmoadg;
                        if (i15 == 1) {
                            nufgyqmvbu(new y2.cdpycssgdh(this.f780wkgbmnqykc.eablkybsjg()));
                        } else if (i15 == 17) {
                            this.f782zdlpuopuiu = jyumaefscl.gxszxtbevo(new y2.cdpycssgdh(this.f780wkgbmnqykc.eablkybsjg()));
                        } else if (i15 == 2) {
                            lqeggnwhkg();
                        }
                        this.f766eablkybsjg = 1;
                    }
                }
            } else if (gtknphoqwx(yadqdtsiqtVar)) {
                this.f766eablkybsjg = 1;
            }
        }
    }

    @Override // a5.wflxmlrfwp
    public void ppxfxbqfkf() {
        this.f766eablkybsjg = 0;
        this.f779wflxmlrfwp = 0;
        this.f783zoijcleaow.tzroggbefp(2);
        this.f774ojitshcjhn = 0;
        this.f777rgvfuqvkyq = 0;
        this.f775oxmwwwfdhm = -2147483647;
        this.f771kcexrzcfyt = -1;
        this.f782zdlpuopuiu = 0;
        this.f781yggfygwlhe = -1L;
        this.f770jyumaefscl = false;
        this.f763btonecajqb = false;
        this.f762agtfadlqog = true;
        this.f767gtknphoqwx = true;
        this.f773nufgyqmvbu = -9.223372036854776E18d;
        this.f765dxjokdxxww = -9.223372036854776E18d;
    }

    @Override // a5.wflxmlrfwp
    public void wkgbmnqykc(boolean z13) {
    }
}
