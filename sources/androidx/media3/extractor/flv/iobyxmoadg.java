package androidx.media3.extractor.flv;

import java.util.Collections;
import t3.dsvhmnatus;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends TagPayloadReader {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int[] f11684eablkybsjg = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f11685ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f11686wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f11687zoijcleaow;

    public iobyxmoadg(dsvhmnatus dsvhmnatusVar) {
        super(dsvhmnatusVar);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar, long j13) {
        if (this.f11686wkgbmnqykc == 2) {
            int iIobyxmoadg = yadqdtsiqtVar.iobyxmoadg();
            this.f11683iobyxmoadg.lqeggnwhkg(yadqdtsiqtVar, iIobyxmoadg);
            this.f11683iobyxmoadg.zoijcleaow(j13, 1, iIobyxmoadg, 0, null);
            return true;
        }
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        if (iWwaezpbzkn != 0 || this.f11685ppxfxbqfkf) {
            if (this.f11686wkgbmnqykc == 10 && iWwaezpbzkn != 1) {
                return false;
            }
            int iIobyxmoadg2 = yadqdtsiqtVar.iobyxmoadg();
            this.f11683iobyxmoadg.lqeggnwhkg(yadqdtsiqtVar, iIobyxmoadg2);
            this.f11683iobyxmoadg.zoijcleaow(j13, 1, iIobyxmoadg2, 0, null);
            return true;
        }
        int iIobyxmoadg3 = yadqdtsiqtVar.iobyxmoadg();
        byte[] bArr = new byte[iIobyxmoadg3];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, iIobyxmoadg3);
        t3.iobyxmoadg.zoijcleaow zoijcleaowVarEablkybsjg = t3.iobyxmoadg.eablkybsjg(bArr);
        this.f11683iobyxmoadg.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().ntlheqmsrt("video/x-flv").zeieaojujs("audio/mp4a-latm").tzroggbefp(zoijcleaowVarEablkybsjg.f109439ppxfxbqfkf).kegysxyocb(zoijcleaowVarEablkybsjg.f109440zoijcleaow).nuxfzjnpeb(zoijcleaowVarEablkybsjg.f109438iobyxmoadg).metgxyhuhe(Collections.singletonList(bArr)).cllcsxoeiz());
        this.f11685ppxfxbqfkf = true;
        return false;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean zoijcleaow(yadqdtsiqt yadqdtsiqtVar) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f11687zoijcleaow) {
            yadqdtsiqtVar.crxdokpmqz(1);
        } else {
            int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
            int i13 = (iWwaezpbzkn >> 4) & 15;
            this.f11686wkgbmnqykc = i13;
            if (i13 == 2) {
                this.f11683iobyxmoadg.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().ntlheqmsrt("video/x-flv").zeieaojujs("audio/mpeg").kegysxyocb(1).nuxfzjnpeb(f11684eablkybsjg[(iWwaezpbzkn >> 2) & 3]).cllcsxoeiz());
                this.f11685ppxfxbqfkf = true;
            } else if (i13 == 7 || i13 == 8) {
                this.f11683iobyxmoadg.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().ntlheqmsrt("video/x-flv").zeieaojujs(i13 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").kegysxyocb(1).nuxfzjnpeb(8000).cllcsxoeiz());
                this.f11685ppxfxbqfkf = true;
            } else if (i13 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f11686wkgbmnqykc);
            }
            this.f11687zoijcleaow = true;
        }
        return true;
    }
}
