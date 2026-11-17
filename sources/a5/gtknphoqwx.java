package a5;

import androidx.media3.common.ParserException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinVersion;
import t3.dsvhmnatus;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx implements wflxmlrfwp {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f468agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f469btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f470draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f471dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f472eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f473gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private String f474gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final y2.yadqdtsiqt f475iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private dsvhmnatus f476lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f479ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f482wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f483wkgbmnqykc;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f477nufgyqmvbu = 0;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private long f481vdvldrhtss = -9223372036854775807L;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicInteger f484zoijcleaow = new AtomicInteger();

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f478ojitshcjhn = -1;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f480rgvfuqvkyq = -1;

    public gtknphoqwx(String str, int i13, int i14, String str2) {
        this.f475iobyxmoadg = new y2.yadqdtsiqt(new byte[i14]);
        this.f479ppxfxbqfkf = str;
        this.f483wkgbmnqykc = i13;
        this.f472eablkybsjg = str2;
    }

    private boolean btonecajqb(y2.yadqdtsiqt yadqdtsiqtVar) {
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            int i13 = this.f469btonecajqb << 8;
            this.f469btonecajqb = i13;
            int iWwaezpbzkn = i13 | yadqdtsiqtVar.wwaezpbzkn();
            this.f469btonecajqb = iWwaezpbzkn;
            int iPpxfxbqfkf = t3.ojitshcjhn.ppxfxbqfkf(iWwaezpbzkn);
            this.f468agtfadlqog = iPpxfxbqfkf;
            if (iPpxfxbqfkf != 0) {
                byte[] bArrEablkybsjg = this.f475iobyxmoadg.eablkybsjg();
                int i14 = this.f469btonecajqb;
                bArrEablkybsjg[0] = (byte) ((i14 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArrEablkybsjg[1] = (byte) ((i14 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArrEablkybsjg[2] = (byte) ((i14 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArrEablkybsjg[3] = (byte) (i14 & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f471dxjokdxxww = 4;
                this.f469btonecajqb = 0;
                return true;
            }
        }
        return false;
    }

    private void dxjokdxxww() throws ParserException {
        t3.ojitshcjhn.zoijcleaow zoijcleaowVarGtknphoqwx = t3.ojitshcjhn.gtknphoqwx(this.f475iobyxmoadg.eablkybsjg(), this.f484zoijcleaow);
        if (this.f468agtfadlqog == 3) {
            gtknphoqwx(zoijcleaowVarGtknphoqwx);
        }
        this.f482wflxmlrfwp = zoijcleaowVarGtknphoqwx.f109523wkgbmnqykc;
        long j13 = zoijcleaowVarGtknphoqwx.f109519eablkybsjg;
        if (j13 == -9223372036854775807L) {
            j13 = 0;
        }
        this.f473gtknphoqwx = j13;
    }

    private void gtknphoqwx(t3.ojitshcjhn.zoijcleaow zoijcleaowVar) {
        int i13;
        int i14 = zoijcleaowVar.f109524zoijcleaow;
        if (i14 == -2147483647 || (i13 = zoijcleaowVar.f109522ppxfxbqfkf) == -1) {
            return;
        }
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = this.f470draadjrbmk;
        if (iobyxmoadgVar != null && i13 == iobyxmoadgVar.f9779yadqdtsiqt && i14 == iobyxmoadgVar.f9759iozdgvuglv && Objects.equals(zoijcleaowVar.f109521iobyxmoadg, iobyxmoadgVar.f9769ojitshcjhn)) {
            return;
        }
        androidx.media3.common.iobyxmoadg iobyxmoadgVar2 = this.f470draadjrbmk;
        androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = (iobyxmoadgVar2 == null ? new androidx.media3.common.iobyxmoadg.zoijcleaow() : iobyxmoadgVar2.zoijcleaow()).xrmfcynszj(this.f474gxszxtbevo).ntlheqmsrt(this.f472eablkybsjg).zeieaojujs(zoijcleaowVar.f109521iobyxmoadg).kegysxyocb(zoijcleaowVar.f109522ppxfxbqfkf).nuxfzjnpeb(zoijcleaowVar.f109524zoijcleaow).uwvvkdfqfp(this.f479ppxfxbqfkf).weqkydbzbr(this.f483wkgbmnqykc).cllcsxoeiz();
        this.f470draadjrbmk = iobyxmoadgVarCllcsxoeiz;
        this.f476lqeggnwhkg.iobyxmoadg(iobyxmoadgVarCllcsxoeiz);
    }

    private void lqeggnwhkg() {
        byte[] bArrEablkybsjg = this.f475iobyxmoadg.eablkybsjg();
        if (this.f470draadjrbmk == null) {
            androidx.media3.common.iobyxmoadg iobyxmoadgVarNufgyqmvbu = t3.ojitshcjhn.nufgyqmvbu(bArrEablkybsjg, this.f474gxszxtbevo, this.f479ppxfxbqfkf, this.f483wkgbmnqykc, this.f472eablkybsjg, null);
            this.f470draadjrbmk = iobyxmoadgVarNufgyqmvbu;
            this.f476lqeggnwhkg.iobyxmoadg(iobyxmoadgVarNufgyqmvbu);
        }
        this.f482wflxmlrfwp = t3.ojitshcjhn.zoijcleaow(bArrEablkybsjg);
        this.f473gtknphoqwx = com.google.common.primitives.gxszxtbevo.wkgbmnqykc(stevsuqkhv.a(t3.ojitshcjhn.lqeggnwhkg(bArrEablkybsjg), this.f470draadjrbmk.f9759iozdgvuglv));
    }

    private void nufgyqmvbu() throws ParserException {
        t3.ojitshcjhn.zoijcleaow zoijcleaowVarDxjokdxxww = t3.ojitshcjhn.dxjokdxxww(this.f475iobyxmoadg.eablkybsjg());
        gtknphoqwx(zoijcleaowVarDxjokdxxww);
        this.f482wflxmlrfwp = zoijcleaowVarDxjokdxxww.f109523wkgbmnqykc;
        long j13 = zoijcleaowVarDxjokdxxww.f109519eablkybsjg;
        if (j13 == -9223372036854775807L) {
            j13 = 0;
        }
        this.f473gtknphoqwx = j13;
    }

    private boolean zoijcleaow(y2.yadqdtsiqt yadqdtsiqtVar, byte[] bArr, int i13) {
        int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), i13 - this.f471dxjokdxxww);
        yadqdtsiqtVar.draadjrbmk(bArr, this.f471dxjokdxxww, iMin);
        int i14 = this.f471dxjokdxxww + iMin;
        this.f471dxjokdxxww = i14;
        return i14 == i13;
    }

    @Override // a5.wflxmlrfwp
    public void eablkybsjg(long j13, int i13) {
        this.f481vdvldrhtss = j13;
    }

    @Override // a5.wflxmlrfwp
    public void gxszxtbevo(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iobyxmoadg();
        this.f474gxszxtbevo = wkgbmnqykcVar.zoijcleaow();
        this.f476lqeggnwhkg = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 1);
    }

    @Override // a5.wflxmlrfwp
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) throws ParserException {
        y2.iobyxmoadg.dxjokdxxww(this.f476lqeggnwhkg);
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            switch (this.f477nufgyqmvbu) {
                case 0:
                    if (btonecajqb(yadqdtsiqtVar)) {
                        int i13 = this.f468agtfadlqog;
                        if (i13 == 3 || i13 == 4) {
                            this.f477nufgyqmvbu = 4;
                        } else if (i13 != 1) {
                            this.f477nufgyqmvbu = 2;
                        } else {
                            this.f477nufgyqmvbu = 1;
                        }
                    }
                    break;
                case 1:
                    if (zoijcleaow(yadqdtsiqtVar, this.f475iobyxmoadg.eablkybsjg(), 18)) {
                        lqeggnwhkg();
                        this.f475iobyxmoadg.sopmlzcsov(0);
                        this.f476lqeggnwhkg.lqeggnwhkg(this.f475iobyxmoadg, 18);
                        this.f477nufgyqmvbu = 6;
                    }
                    break;
                case 2:
                    if (zoijcleaow(yadqdtsiqtVar, this.f475iobyxmoadg.eablkybsjg(), 7)) {
                        this.f478ojitshcjhn = t3.ojitshcjhn.btonecajqb(this.f475iobyxmoadg.eablkybsjg());
                        this.f477nufgyqmvbu = 3;
                    }
                    break;
                case 3:
                    if (zoijcleaow(yadqdtsiqtVar, this.f475iobyxmoadg.eablkybsjg(), this.f478ojitshcjhn)) {
                        nufgyqmvbu();
                        this.f475iobyxmoadg.sopmlzcsov(0);
                        this.f476lqeggnwhkg.lqeggnwhkg(this.f475iobyxmoadg, this.f478ojitshcjhn);
                        this.f477nufgyqmvbu = 6;
                    }
                    break;
                case 4:
                    if (zoijcleaow(yadqdtsiqtVar, this.f475iobyxmoadg.eablkybsjg(), 6)) {
                        int iDraadjrbmk = t3.ojitshcjhn.draadjrbmk(this.f475iobyxmoadg.eablkybsjg());
                        this.f480rgvfuqvkyq = iDraadjrbmk;
                        int i14 = this.f471dxjokdxxww;
                        if (i14 > iDraadjrbmk) {
                            int i15 = i14 - iDraadjrbmk;
                            this.f471dxjokdxxww = i14 - i15;
                            yadqdtsiqtVar.sopmlzcsov(yadqdtsiqtVar.gxszxtbevo() - i15);
                        }
                        this.f477nufgyqmvbu = 5;
                    }
                    break;
                case 5:
                    if (zoijcleaow(yadqdtsiqtVar, this.f475iobyxmoadg.eablkybsjg(), this.f480rgvfuqvkyq)) {
                        dxjokdxxww();
                        this.f475iobyxmoadg.sopmlzcsov(0);
                        this.f476lqeggnwhkg.lqeggnwhkg(this.f475iobyxmoadg, this.f480rgvfuqvkyq);
                        this.f477nufgyqmvbu = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), this.f482wflxmlrfwp - this.f471dxjokdxxww);
                    this.f476lqeggnwhkg.lqeggnwhkg(yadqdtsiqtVar, iMin);
                    int i16 = this.f471dxjokdxxww + iMin;
                    this.f471dxjokdxxww = i16;
                    if (i16 == this.f482wflxmlrfwp) {
                        y2.iobyxmoadg.lqeggnwhkg(this.f481vdvldrhtss != -9223372036854775807L);
                        this.f476lqeggnwhkg.zoijcleaow(this.f481vdvldrhtss, this.f468agtfadlqog == 4 ? 0 : 1, this.f482wflxmlrfwp, 0, null);
                        this.f481vdvldrhtss += this.f473gtknphoqwx;
                        this.f477nufgyqmvbu = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // a5.wflxmlrfwp
    public void ppxfxbqfkf() {
        this.f477nufgyqmvbu = 0;
        this.f471dxjokdxxww = 0;
        this.f469btonecajqb = 0;
        this.f481vdvldrhtss = -9223372036854775807L;
        this.f484zoijcleaow.set(0);
    }

    @Override // a5.wflxmlrfwp
    public void wkgbmnqykc(boolean z13) {
    }
}
