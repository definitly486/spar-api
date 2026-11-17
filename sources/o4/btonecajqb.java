package o4;

import androidx.media3.common.ParserException;
import com.google.common.collect.zdlpuopuiu;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;
import t3.kegysxyocb;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class btonecajqb extends dxjokdxxww {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private iobyxmoadg f71933agtfadlqog;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f71934ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private kegysxyocb.iobyxmoadg f71935oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f71936rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private kegysxyocb.ppxfxbqfkf f71937vdvldrhtss;

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final int f71938eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final kegysxyocb.ppxfxbqfkf f71939iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final byte[] f71940ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final kegysxyocb.zoijcleaow[] f71941wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final kegysxyocb.iobyxmoadg f71942zoijcleaow;

        public iobyxmoadg(kegysxyocb.ppxfxbqfkf ppxfxbqfkfVar, kegysxyocb.iobyxmoadg iobyxmoadgVar, byte[] bArr, kegysxyocb.zoijcleaow[] zoijcleaowVarArr, int i13) {
            this.f71939iobyxmoadg = ppxfxbqfkfVar;
            this.f71942zoijcleaow = iobyxmoadgVar;
            this.f71940ppxfxbqfkf = bArr;
            this.f71941wkgbmnqykc = zoijcleaowVarArr;
            this.f71938eablkybsjg = i13;
        }
    }

    btonecajqb() {
    }

    static void agtfadlqog(yadqdtsiqt yadqdtsiqtVar, long j13) {
        if (yadqdtsiqtVar.zoijcleaow() < yadqdtsiqtVar.lqeggnwhkg() + 4) {
            yadqdtsiqtVar.mbcevpiqjq(Arrays.copyOf(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.lqeggnwhkg() + 4));
        } else {
            yadqdtsiqtVar.ulzqkzuiru(yadqdtsiqtVar.lqeggnwhkg() + 4);
        }
        byte[] bArrEablkybsjg = yadqdtsiqtVar.eablkybsjg();
        bArrEablkybsjg[yadqdtsiqtVar.lqeggnwhkg() - 4] = (byte) (j13 & 255);
        bArrEablkybsjg[yadqdtsiqtVar.lqeggnwhkg() - 3] = (byte) ((j13 >>> 8) & 255);
        bArrEablkybsjg[yadqdtsiqtVar.lqeggnwhkg() - 2] = (byte) ((j13 >>> 16) & 255);
        bArrEablkybsjg[yadqdtsiqtVar.lqeggnwhkg() - 1] = (byte) ((j13 >>> 24) & 255);
    }

    private static int ojitshcjhn(byte b13, iobyxmoadg iobyxmoadgVar) {
        return !iobyxmoadgVar.f71941wkgbmnqykc[rgvfuqvkyq(b13, iobyxmoadgVar.f71938eablkybsjg, 1)].f109492iobyxmoadg ? iobyxmoadgVar.f71939iobyxmoadg.f109487lqeggnwhkg : iobyxmoadgVar.f71939iobyxmoadg.f109488nufgyqmvbu;
    }

    public static boolean oxmwwwfdhm(yadqdtsiqt yadqdtsiqtVar) {
        try {
            return kegysxyocb.ojitshcjhn(1, yadqdtsiqtVar, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    static int rgvfuqvkyq(byte b13, int i13, int i14) {
        return (b13 >> i14) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - i13));
    }

    @Override // o4.dxjokdxxww
    protected void draadjrbmk(boolean z13) {
        super.draadjrbmk(z13);
        if (z13) {
            this.f71933agtfadlqog = null;
            this.f71937vdvldrhtss = null;
            this.f71935oxmwwwfdhm = null;
        }
        this.f71934ojitshcjhn = 0;
        this.f71936rgvfuqvkyq = false;
    }

    @Override // o4.dxjokdxxww
    protected boolean dxjokdxxww(yadqdtsiqt yadqdtsiqtVar, long j13, dxjokdxxww.zoijcleaow zoijcleaowVar) throws ParserException {
        if (this.f71933agtfadlqog != null) {
            y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.f71956iobyxmoadg);
            return false;
        }
        iobyxmoadg iobyxmoadgVarVdvldrhtss = vdvldrhtss(yadqdtsiqtVar);
        this.f71933agtfadlqog = iobyxmoadgVarVdvldrhtss;
        if (iobyxmoadgVarVdvldrhtss == null) {
            return true;
        }
        kegysxyocb.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVarVdvldrhtss.f71939iobyxmoadg;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ppxfxbqfkfVar.f109482btonecajqb);
        arrayList.add(iobyxmoadgVarVdvldrhtss.f71940ppxfxbqfkf);
        zoijcleaowVar.f71956iobyxmoadg = new androidx.media3.common.iobyxmoadg.zoijcleaow().ntlheqmsrt("audio/ogg").zeieaojujs("audio/vorbis").stevsuqkhv(ppxfxbqfkfVar.f109484eablkybsjg).bfopjjpdmp(ppxfxbqfkfVar.f109490wkgbmnqykc).kegysxyocb(ppxfxbqfkfVar.f109491zoijcleaow).nuxfzjnpeb(ppxfxbqfkfVar.f109489ppxfxbqfkf).metgxyhuhe(arrayList).zfvoamnweg(kegysxyocb.wkgbmnqykc(zdlpuopuiu.cqumvgiudr(iobyxmoadgVarVdvldrhtss.f71942zoijcleaow.f109481zoijcleaow))).cllcsxoeiz();
        return true;
    }

    @Override // o4.dxjokdxxww
    protected void eablkybsjg(long j13) {
        super.eablkybsjg(j13);
        this.f71936rgvfuqvkyq = j13 != 0;
        kegysxyocb.ppxfxbqfkf ppxfxbqfkfVar = this.f71937vdvldrhtss;
        this.f71934ojitshcjhn = ppxfxbqfkfVar != null ? ppxfxbqfkfVar.f109487lqeggnwhkg : 0;
    }

    @Override // o4.dxjokdxxww
    protected long gxszxtbevo(yadqdtsiqt yadqdtsiqtVar) {
        if ((yadqdtsiqtVar.eablkybsjg()[0] & 1) == 1) {
            return -1L;
        }
        int iOjitshcjhn = ojitshcjhn(yadqdtsiqtVar.eablkybsjg()[0], (iobyxmoadg) y2.iobyxmoadg.dxjokdxxww(this.f71933agtfadlqog));
        long j13 = this.f71936rgvfuqvkyq ? (this.f71934ojitshcjhn + iOjitshcjhn) / 4 : 0;
        agtfadlqog(yadqdtsiqtVar, j13);
        this.f71936rgvfuqvkyq = true;
        this.f71934ojitshcjhn = iOjitshcjhn;
        return j13;
    }

    iobyxmoadg vdvldrhtss(yadqdtsiqt yadqdtsiqtVar) throws ParserException {
        kegysxyocb.ppxfxbqfkf ppxfxbqfkfVar = this.f71937vdvldrhtss;
        if (ppxfxbqfkfVar == null) {
            this.f71937vdvldrhtss = kegysxyocb.draadjrbmk(yadqdtsiqtVar);
            return null;
        }
        kegysxyocb.iobyxmoadg iobyxmoadgVar = this.f71935oxmwwwfdhm;
        if (iobyxmoadgVar == null) {
            this.f71935oxmwwwfdhm = kegysxyocb.btonecajqb(yadqdtsiqtVar);
            return null;
        }
        byte[] bArr = new byte[yadqdtsiqtVar.lqeggnwhkg()];
        System.arraycopy(yadqdtsiqtVar.eablkybsjg(), 0, bArr, 0, yadqdtsiqtVar.lqeggnwhkg());
        kegysxyocb.zoijcleaow[] zoijcleaowVarArrWflxmlrfwp = kegysxyocb.wflxmlrfwp(yadqdtsiqtVar, ppxfxbqfkfVar.f109491zoijcleaow);
        return new iobyxmoadg(ppxfxbqfkfVar, iobyxmoadgVar, bArr, zoijcleaowVarArrWflxmlrfwp, kegysxyocb.zoijcleaow(zoijcleaowVarArrWflxmlrfwp.length - 1));
    }
}
