package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import t3.dsvhmnatus;
import y2.yadqdtsiqt;
import z2.gxszxtbevo;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc extends TagPayloadReader {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f11691eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f11692gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f11693lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yadqdtsiqt f11694ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f11695wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yadqdtsiqt f11696zoijcleaow;

    public wkgbmnqykc(dsvhmnatus dsvhmnatusVar) {
        super(dsvhmnatusVar);
        this.f11696zoijcleaow = new yadqdtsiqt(gxszxtbevo.f127610iobyxmoadg);
        this.f11694ppxfxbqfkf = new yadqdtsiqt(4);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar, long j13) throws ParserException {
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        long jOxmwwwfdhm = j13 + (((long) yadqdtsiqtVar.oxmwwwfdhm()) * 1000);
        if (iWwaezpbzkn == 0 && !this.f11691eablkybsjg) {
            yadqdtsiqt yadqdtsiqtVar2 = new yadqdtsiqt(new byte[yadqdtsiqtVar.iobyxmoadg()]);
            yadqdtsiqtVar.draadjrbmk(yadqdtsiqtVar2.eablkybsjg(), 0, yadqdtsiqtVar.iobyxmoadg());
            t3.wkgbmnqykc wkgbmnqykcVarZoijcleaow = t3.wkgbmnqykc.zoijcleaow(yadqdtsiqtVar2);
            this.f11695wkgbmnqykc = wkgbmnqykcVarZoijcleaow.f109559zoijcleaow;
            this.f11683iobyxmoadg.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().ntlheqmsrt("video/x-flv").zeieaojujs("video/avc").tzroggbefp(wkgbmnqykcVarZoijcleaow.f109549draadjrbmk).auzgnhcxok(wkgbmnqykcVarZoijcleaow.f109557ppxfxbqfkf).okpsazkaxt(wkgbmnqykcVarZoijcleaow.f109558wkgbmnqykc).opjhrmiecq(wkgbmnqykcVarZoijcleaow.f109552gtknphoqwx).metgxyhuhe(wkgbmnqykcVarZoijcleaow.f109554iobyxmoadg).cllcsxoeiz());
            this.f11691eablkybsjg = true;
            return false;
        }
        if (iWwaezpbzkn != 1 || !this.f11691eablkybsjg) {
            return false;
        }
        int i13 = this.f11693lqeggnwhkg == 1 ? 1 : 0;
        if (!this.f11692gxszxtbevo && i13 == 0) {
            return false;
        }
        byte[] bArrEablkybsjg = this.f11694ppxfxbqfkf.eablkybsjg();
        bArrEablkybsjg[0] = 0;
        bArrEablkybsjg[1] = 0;
        bArrEablkybsjg[2] = 0;
        int i14 = 4 - this.f11695wkgbmnqykc;
        int i15 = 0;
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            yadqdtsiqtVar.draadjrbmk(this.f11694ppxfxbqfkf.eablkybsjg(), i14, this.f11695wkgbmnqykc);
            this.f11694ppxfxbqfkf.sopmlzcsov(0);
            int iJpowsppfya = this.f11694ppxfxbqfkf.jpowsppfya();
            this.f11696zoijcleaow.sopmlzcsov(0);
            this.f11683iobyxmoadg.lqeggnwhkg(this.f11696zoijcleaow, 4);
            this.f11683iobyxmoadg.lqeggnwhkg(yadqdtsiqtVar, iJpowsppfya);
            i15 = i15 + 4 + iJpowsppfya;
        }
        this.f11683iobyxmoadg.zoijcleaow(jOxmwwwfdhm, i13, i15, 0, null);
        this.f11692gxszxtbevo = true;
        return true;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean zoijcleaow(yadqdtsiqt yadqdtsiqtVar) throws TagPayloadReader.UnsupportedFormatException {
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        int i13 = (iWwaezpbzkn >> 4) & 15;
        int i14 = iWwaezpbzkn & 15;
        if (i14 == 7) {
            this.f11693lqeggnwhkg = i13;
            return i13 != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i14);
    }
}
