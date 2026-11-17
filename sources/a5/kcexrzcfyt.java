package a5;

import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collections;
import t3.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public final class kcexrzcfyt implements wflxmlrfwp {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f575agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f576btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f577draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f578dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final y2.cdpycssgdh f579eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f580gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private dsvhmnatus f581gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f582iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private String f583iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f584jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private long f585kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private String f586lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f587nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f588ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f589oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f590ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f591rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f592vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f593wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final y2.yadqdtsiqt f594wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f595yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f596zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f597zoijcleaow;

    public kcexrzcfyt(String str, int i13, String str2) {
        this.f582iobyxmoadg = str;
        this.f597zoijcleaow = i13;
        this.f590ppxfxbqfkf = str2;
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(UserVerificationMethods.USER_VERIFY_ALL);
        this.f594wkgbmnqykc = yadqdtsiqtVar;
        this.f579eablkybsjg = new y2.cdpycssgdh(yadqdtsiqtVar.eablkybsjg());
        this.f593wflxmlrfwp = -9223372036854775807L;
    }

    private int btonecajqb(y2.cdpycssgdh cdpycssgdhVar) throws ParserException {
        int iNufgyqmvbu;
        if (this.f592vdvldrhtss != 0) {
            throw ParserException.iobyxmoadg(null, null);
        }
        int i13 = 0;
        do {
            iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(8);
            i13 += iNufgyqmvbu;
        } while (iNufgyqmvbu == 255);
        return i13;
    }

    private void draadjrbmk(y2.cdpycssgdh cdpycssgdhVar) throws ParserException {
        boolean zLqeggnwhkg;
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(1);
        int iNufgyqmvbu2 = iNufgyqmvbu == 1 ? cdpycssgdhVar.nufgyqmvbu(1) : 0;
        this.f588ojitshcjhn = iNufgyqmvbu2;
        if (iNufgyqmvbu2 != 0) {
            throw ParserException.iobyxmoadg(null, null);
        }
        if (iNufgyqmvbu == 1) {
            zoijcleaow(cdpycssgdhVar);
        }
        if (!cdpycssgdhVar.lqeggnwhkg()) {
            throw ParserException.iobyxmoadg(null, null);
        }
        this.f591rgvfuqvkyq = cdpycssgdhVar.nufgyqmvbu(6);
        int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(4);
        int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(3);
        if (iNufgyqmvbu3 != 0 || iNufgyqmvbu4 != 0) {
            throw ParserException.iobyxmoadg(null, null);
        }
        if (iNufgyqmvbu == 0) {
            int iEablkybsjg = cdpycssgdhVar.eablkybsjg();
            int iNufgyqmvbu5 = nufgyqmvbu(cdpycssgdhVar);
            cdpycssgdhVar.rgvfuqvkyq(iEablkybsjg);
            byte[] bArr = new byte[(iNufgyqmvbu5 + 7) / 8];
            cdpycssgdhVar.dxjokdxxww(bArr, 0, iNufgyqmvbu5);
            androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(this.f586lqeggnwhkg).ntlheqmsrt(this.f590ppxfxbqfkf).zeieaojujs("audio/mp4a-latm").tzroggbefp(this.f583iwizpuwonk).kegysxyocb(this.f584jyumaefscl).nuxfzjnpeb(this.f596zdlpuopuiu).metgxyhuhe(Collections.singletonList(bArr)).uwvvkdfqfp(this.f582iobyxmoadg).weqkydbzbr(this.f597zoijcleaow).cllcsxoeiz();
            if (!iobyxmoadgVarCllcsxoeiz.equals(this.f587nufgyqmvbu)) {
                this.f587nufgyqmvbu = iobyxmoadgVarCllcsxoeiz;
                this.f595yggfygwlhe = 1024000000 / ((long) iobyxmoadgVarCllcsxoeiz.f9759iozdgvuglv);
                this.f581gxszxtbevo.iobyxmoadg(iobyxmoadgVarCllcsxoeiz);
            }
        } else {
            cdpycssgdhVar.oxmwwwfdhm(((int) zoijcleaow(cdpycssgdhVar)) - nufgyqmvbu(cdpycssgdhVar));
        }
        dxjokdxxww(cdpycssgdhVar);
        boolean zLqeggnwhkg2 = cdpycssgdhVar.lqeggnwhkg();
        this.f589oxmwwwfdhm = zLqeggnwhkg2;
        this.f585kcexrzcfyt = 0L;
        if (zLqeggnwhkg2) {
            if (iNufgyqmvbu == 1) {
                this.f585kcexrzcfyt = zoijcleaow(cdpycssgdhVar);
            } else {
                do {
                    zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
                    this.f585kcexrzcfyt = (this.f585kcexrzcfyt << 8) + ((long) cdpycssgdhVar.nufgyqmvbu(8));
                } while (zLqeggnwhkg);
            }
        }
        if (cdpycssgdhVar.lqeggnwhkg()) {
            cdpycssgdhVar.oxmwwwfdhm(8);
        }
    }

    private void dxjokdxxww(y2.cdpycssgdh cdpycssgdhVar) {
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(3);
        this.f592vdvldrhtss = iNufgyqmvbu;
        if (iNufgyqmvbu == 0) {
            cdpycssgdhVar.oxmwwwfdhm(8);
            return;
        }
        if (iNufgyqmvbu == 1) {
            cdpycssgdhVar.oxmwwwfdhm(9);
            return;
        }
        if (iNufgyqmvbu == 3 || iNufgyqmvbu == 4 || iNufgyqmvbu == 5) {
            cdpycssgdhVar.oxmwwwfdhm(6);
        } else {
            if (iNufgyqmvbu != 6 && iNufgyqmvbu != 7) {
                throw new IllegalStateException();
            }
            cdpycssgdhVar.oxmwwwfdhm(1);
        }
    }

    private void gtknphoqwx(y2.cdpycssgdh cdpycssgdhVar, int i13) {
        int iEablkybsjg = cdpycssgdhVar.eablkybsjg();
        if ((iEablkybsjg & 7) == 0) {
            this.f594wkgbmnqykc.sopmlzcsov(iEablkybsjg >> 3);
        } else {
            cdpycssgdhVar.dxjokdxxww(this.f594wkgbmnqykc.eablkybsjg(), 0, i13 * 8);
            this.f594wkgbmnqykc.sopmlzcsov(0);
        }
        this.f581gxszxtbevo.lqeggnwhkg(this.f594wkgbmnqykc, i13);
        y2.iobyxmoadg.lqeggnwhkg(this.f593wflxmlrfwp != -9223372036854775807L);
        this.f581gxszxtbevo.zoijcleaow(this.f593wflxmlrfwp, 1, i13, 0, null);
        this.f593wflxmlrfwp += this.f595yggfygwlhe;
    }

    private void lqeggnwhkg(y2.cdpycssgdh cdpycssgdhVar) throws ParserException {
        if (!cdpycssgdhVar.lqeggnwhkg()) {
            this.f575agtfadlqog = true;
            draadjrbmk(cdpycssgdhVar);
        } else if (!this.f575agtfadlqog) {
            return;
        }
        if (this.f588ojitshcjhn != 0) {
            throw ParserException.iobyxmoadg(null, null);
        }
        if (this.f591rgvfuqvkyq != 0) {
            throw ParserException.iobyxmoadg(null, null);
        }
        gtknphoqwx(cdpycssgdhVar, btonecajqb(cdpycssgdhVar));
        if (this.f589oxmwwwfdhm) {
            cdpycssgdhVar.oxmwwwfdhm((int) this.f585kcexrzcfyt);
        }
    }

    private int nufgyqmvbu(y2.cdpycssgdh cdpycssgdhVar) throws ParserException {
        int iZoijcleaow = cdpycssgdhVar.zoijcleaow();
        t3.iobyxmoadg.zoijcleaow zoijcleaowVarWkgbmnqykc = t3.iobyxmoadg.wkgbmnqykc(cdpycssgdhVar, true);
        this.f583iwizpuwonk = zoijcleaowVarWkgbmnqykc.f109439ppxfxbqfkf;
        this.f596zdlpuopuiu = zoijcleaowVarWkgbmnqykc.f109438iobyxmoadg;
        this.f584jyumaefscl = zoijcleaowVarWkgbmnqykc.f109440zoijcleaow;
        return iZoijcleaow - cdpycssgdhVar.zoijcleaow();
    }

    private void wflxmlrfwp(int i13) {
        this.f594wkgbmnqykc.tzroggbefp(i13);
        this.f579eablkybsjg.agtfadlqog(this.f594wkgbmnqykc.eablkybsjg());
    }

    private static long zoijcleaow(y2.cdpycssgdh cdpycssgdhVar) {
        return cdpycssgdhVar.nufgyqmvbu((cdpycssgdhVar.nufgyqmvbu(2) + 1) * 8);
    }

    @Override // a5.wflxmlrfwp
    public void eablkybsjg(long j13, int i13) {
        this.f593wflxmlrfwp = j13;
    }

    @Override // a5.wflxmlrfwp
    public void gxszxtbevo(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iobyxmoadg();
        this.f581gxszxtbevo = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 1);
        this.f586lqeggnwhkg = wkgbmnqykcVar.zoijcleaow();
    }

    @Override // a5.wflxmlrfwp
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) throws ParserException {
        y2.iobyxmoadg.dxjokdxxww(this.f581gxszxtbevo);
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            int i13 = this.f578dxjokdxxww;
            if (i13 != 0) {
                if (i13 == 1) {
                    int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                    if ((iWwaezpbzkn & 224) == 224) {
                        this.f577draadjrbmk = iWwaezpbzkn;
                        this.f578dxjokdxxww = 2;
                    } else if (iWwaezpbzkn != 86) {
                        this.f578dxjokdxxww = 0;
                    }
                } else if (i13 == 2) {
                    int iWwaezpbzkn2 = ((this.f577draadjrbmk & (-225)) << 8) | yadqdtsiqtVar.wwaezpbzkn();
                    this.f580gtknphoqwx = iWwaezpbzkn2;
                    if (iWwaezpbzkn2 > this.f594wkgbmnqykc.eablkybsjg().length) {
                        wflxmlrfwp(this.f580gtknphoqwx);
                    }
                    this.f576btonecajqb = 0;
                    this.f578dxjokdxxww = 3;
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), this.f580gtknphoqwx - this.f576btonecajqb);
                    yadqdtsiqtVar.draadjrbmk(this.f579eablkybsjg.f123526iobyxmoadg, this.f576btonecajqb, iMin);
                    int i14 = this.f576btonecajqb + iMin;
                    this.f576btonecajqb = i14;
                    if (i14 == this.f580gtknphoqwx) {
                        this.f579eablkybsjg.rgvfuqvkyq(0);
                        lqeggnwhkg(this.f579eablkybsjg);
                        this.f578dxjokdxxww = 0;
                    }
                }
            } else if (yadqdtsiqtVar.wwaezpbzkn() == 86) {
                this.f578dxjokdxxww = 1;
            }
        }
    }

    @Override // a5.wflxmlrfwp
    public void ppxfxbqfkf() {
        this.f578dxjokdxxww = 0;
        this.f593wflxmlrfwp = -9223372036854775807L;
        this.f575agtfadlqog = false;
    }

    @Override // a5.wflxmlrfwp
    public void wkgbmnqykc(boolean z13) {
    }
}
