package o4;

import com.google.common.collect.zdlpuopuiu;
import java.util.Arrays;
import java.util.List;
import t3.kegysxyocb;
import t3.wwaezpbzkn;
import v2.jyumaefscl;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class nufgyqmvbu extends dxjokdxxww {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final byte[] f71987ojitshcjhn = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final byte[] f71988rgvfuqvkyq = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f71989agtfadlqog;

    nufgyqmvbu() {
    }

    private static boolean agtfadlqog(yadqdtsiqt yadqdtsiqtVar, byte[] bArr) {
        if (yadqdtsiqtVar.iobyxmoadg() < bArr.length) {
            return false;
        }
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        byte[] bArr2 = new byte[bArr.length];
        yadqdtsiqtVar.draadjrbmk(bArr2, 0, bArr.length);
        yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean ojitshcjhn(yadqdtsiqt yadqdtsiqtVar) {
        return agtfadlqog(yadqdtsiqtVar, f71987ojitshcjhn);
    }

    @Override // o4.dxjokdxxww
    protected void draadjrbmk(boolean z13) {
        super.draadjrbmk(z13);
        if (z13) {
            this.f71989agtfadlqog = false;
        }
    }

    @Override // o4.dxjokdxxww
    protected boolean dxjokdxxww(yadqdtsiqt yadqdtsiqtVar, long j13, dxjokdxxww.zoijcleaow zoijcleaowVar) {
        if (agtfadlqog(yadqdtsiqtVar, f71987ojitshcjhn)) {
            byte[] bArrCopyOf = Arrays.copyOf(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.lqeggnwhkg());
            int iPpxfxbqfkf = wwaezpbzkn.ppxfxbqfkf(bArrCopyOf);
            List listIobyxmoadg = wwaezpbzkn.iobyxmoadg(bArrCopyOf);
            if (zoijcleaowVar.f71956iobyxmoadg != null) {
                return true;
            }
            zoijcleaowVar.f71956iobyxmoadg = new androidx.media3.common.iobyxmoadg.zoijcleaow().ntlheqmsrt("audio/ogg").zeieaojujs("audio/opus").kegysxyocb(iPpxfxbqfkf).nuxfzjnpeb(48000).metgxyhuhe(listIobyxmoadg).cllcsxoeiz();
            return true;
        }
        byte[] bArr = f71988rgvfuqvkyq;
        if (!agtfadlqog(yadqdtsiqtVar, bArr)) {
            y2.iobyxmoadg.dxjokdxxww(zoijcleaowVar.f71956iobyxmoadg);
            return false;
        }
        y2.iobyxmoadg.dxjokdxxww(zoijcleaowVar.f71956iobyxmoadg);
        if (this.f71989agtfadlqog) {
            return true;
        }
        this.f71989agtfadlqog = true;
        yadqdtsiqtVar.crxdokpmqz(bArr.length);
        jyumaefscl jyumaefsclVarWkgbmnqykc = kegysxyocb.wkgbmnqykc(zdlpuopuiu.cqumvgiudr(kegysxyocb.gtknphoqwx(yadqdtsiqtVar, false, false).f109481zoijcleaow));
        if (jyumaefsclVarWkgbmnqykc == null) {
            return true;
        }
        zoijcleaowVar.f71956iobyxmoadg = zoijcleaowVar.f71956iobyxmoadg.zoijcleaow().zfvoamnweg(jyumaefsclVarWkgbmnqykc.zoijcleaow(zoijcleaowVar.f71956iobyxmoadg.f9749draadjrbmk)).cllcsxoeiz();
        return true;
    }

    @Override // o4.dxjokdxxww
    protected long gxszxtbevo(yadqdtsiqt yadqdtsiqtVar) {
        return ppxfxbqfkf(wwaezpbzkn.eablkybsjg(yadqdtsiqtVar.eablkybsjg()));
    }
}
