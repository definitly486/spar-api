package a5;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Objects;
import t3.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf implements wflxmlrfwp {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private long f659agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f660btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f661draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f662dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f663eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f664gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private String f665gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final y2.cdpycssgdh f666iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private dsvhmnatus f667lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f668nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f669ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f670wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f671wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.yadqdtsiqt f672zoijcleaow;

    public ppxfxbqfkf(String str) {
        this(null, 0, str);
    }

    private void lqeggnwhkg() {
        this.f666iobyxmoadg.rgvfuqvkyq(0);
        t3.zoijcleaow.C2690zoijcleaow c2690zoijcleaowGxszxtbevo = t3.zoijcleaow.gxszxtbevo(this.f666iobyxmoadg);
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = this.f661draadjrbmk;
        if (iobyxmoadgVar == null || c2690zoijcleaowGxszxtbevo.f109583wkgbmnqykc != iobyxmoadgVar.f9779yadqdtsiqt || c2690zoijcleaowGxszxtbevo.f109582ppxfxbqfkf != iobyxmoadgVar.f9759iozdgvuglv || !Objects.equals(c2690zoijcleaowGxszxtbevo.f109580iobyxmoadg, iobyxmoadgVar.f9769ojitshcjhn)) {
            androidx.media3.common.iobyxmoadg.zoijcleaow zoijcleaowVarBfopjjpdmp = new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(this.f665gxszxtbevo).ntlheqmsrt(this.f663eablkybsjg).zeieaojujs(c2690zoijcleaowGxszxtbevo.f109580iobyxmoadg).kegysxyocb(c2690zoijcleaowGxszxtbevo.f109583wkgbmnqykc).nuxfzjnpeb(c2690zoijcleaowGxszxtbevo.f109582ppxfxbqfkf).uwvvkdfqfp(this.f669ppxfxbqfkf).weqkydbzbr(this.f671wkgbmnqykc).bfopjjpdmp(c2690zoijcleaowGxszxtbevo.f109581lqeggnwhkg);
            if ("audio/ac3".equals(c2690zoijcleaowGxszxtbevo.f109580iobyxmoadg)) {
                zoijcleaowVarBfopjjpdmp.stevsuqkhv(c2690zoijcleaowGxszxtbevo.f109581lqeggnwhkg);
            }
            androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = zoijcleaowVarBfopjjpdmp.cllcsxoeiz();
            this.f661draadjrbmk = iobyxmoadgVarCllcsxoeiz;
            this.f667lqeggnwhkg.iobyxmoadg(iobyxmoadgVarCllcsxoeiz);
        }
        this.f670wflxmlrfwp = c2690zoijcleaowGxszxtbevo.f109578eablkybsjg;
        this.f664gtknphoqwx = (((long) c2690zoijcleaowGxszxtbevo.f109579gxszxtbevo) * 1000000) / ((long) this.f661draadjrbmk.f9759iozdgvuglv);
    }

    private boolean nufgyqmvbu(y2.yadqdtsiqt yadqdtsiqtVar) {
        while (true) {
            if (yadqdtsiqtVar.iobyxmoadg() <= 0) {
                return false;
            }
            if (this.f660btonecajqb) {
                int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                if (iWwaezpbzkn == 119) {
                    this.f660btonecajqb = false;
                    return true;
                }
                this.f660btonecajqb = iWwaezpbzkn == 11;
            } else {
                this.f660btonecajqb = yadqdtsiqtVar.wwaezpbzkn() == 11;
            }
        }
    }

    private boolean zoijcleaow(y2.yadqdtsiqt yadqdtsiqtVar, byte[] bArr, int i13) {
        int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), i13 - this.f662dxjokdxxww);
        yadqdtsiqtVar.draadjrbmk(bArr, this.f662dxjokdxxww, iMin);
        int i14 = this.f662dxjokdxxww + iMin;
        this.f662dxjokdxxww = i14;
        return i14 == i13;
    }

    @Override // a5.wflxmlrfwp
    public void eablkybsjg(long j13, int i13) {
        this.f659agtfadlqog = j13;
    }

    @Override // a5.wflxmlrfwp
    public void gxszxtbevo(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iobyxmoadg();
        this.f665gxszxtbevo = wkgbmnqykcVar.zoijcleaow();
        this.f667lqeggnwhkg = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 1);
    }

    @Override // a5.wflxmlrfwp
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
        y2.iobyxmoadg.dxjokdxxww(this.f667lqeggnwhkg);
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            int i13 = this.f668nufgyqmvbu;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), this.f670wflxmlrfwp - this.f662dxjokdxxww);
                        this.f667lqeggnwhkg.lqeggnwhkg(yadqdtsiqtVar, iMin);
                        int i14 = this.f662dxjokdxxww + iMin;
                        this.f662dxjokdxxww = i14;
                        if (i14 == this.f670wflxmlrfwp) {
                            y2.iobyxmoadg.lqeggnwhkg(this.f659agtfadlqog != -9223372036854775807L);
                            this.f667lqeggnwhkg.zoijcleaow(this.f659agtfadlqog, 1, this.f670wflxmlrfwp, 0, null);
                            this.f659agtfadlqog += this.f664gtknphoqwx;
                            this.f668nufgyqmvbu = 0;
                        }
                    }
                } else if (zoijcleaow(yadqdtsiqtVar, this.f672zoijcleaow.eablkybsjg(), UserVerificationMethods.USER_VERIFY_PATTERN)) {
                    lqeggnwhkg();
                    this.f672zoijcleaow.sopmlzcsov(0);
                    this.f667lqeggnwhkg.lqeggnwhkg(this.f672zoijcleaow, UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.f668nufgyqmvbu = 2;
                }
            } else if (nufgyqmvbu(yadqdtsiqtVar)) {
                this.f668nufgyqmvbu = 1;
                this.f672zoijcleaow.eablkybsjg()[0] = 11;
                this.f672zoijcleaow.eablkybsjg()[1] = 119;
                this.f662dxjokdxxww = 2;
            }
        }
    }

    @Override // a5.wflxmlrfwp
    public void ppxfxbqfkf() {
        this.f668nufgyqmvbu = 0;
        this.f662dxjokdxxww = 0;
        this.f660btonecajqb = false;
        this.f659agtfadlqog = -9223372036854775807L;
    }

    @Override // a5.wflxmlrfwp
    public void wkgbmnqykc(boolean z13) {
    }

    public ppxfxbqfkf(String str, int i13, String str2) {
        y2.cdpycssgdh cdpycssgdhVar = new y2.cdpycssgdh(new byte[UserVerificationMethods.USER_VERIFY_PATTERN]);
        this.f666iobyxmoadg = cdpycssgdhVar;
        this.f672zoijcleaow = new y2.yadqdtsiqt(cdpycssgdhVar.f123526iobyxmoadg);
        this.f668nufgyqmvbu = 0;
        this.f659agtfadlqog = -9223372036854775807L;
        this.f669ppxfxbqfkf = str;
        this.f671wkgbmnqykc = i13;
        this.f663eablkybsjg = str2;
    }
}
