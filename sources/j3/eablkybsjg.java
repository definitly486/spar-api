package j3;

import android.graphics.Bitmap;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.hszhottldk;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.nufgyqmvbu;
import f3.lmojexxdyd;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import y2.jpowsppfya;

/* JADX INFO: loaded from: classes.dex */
public class eablkybsjg extends nufgyqmvbu {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f50573cllcsxoeiz;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private ImageOutput f50574crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private boolean f50575dsvhmnatus;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final ppxfxbqfkf.iobyxmoadg f50576hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final ArrayDeque f50577hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private int f50578ikoacuggdj;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private zoijcleaow f50579jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private Bitmap f50580jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final DecoderInputBuffer f50581jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private long f50582kegysxyocb;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private int f50583mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f50584ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private boolean f50585okpsazkaxt;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private boolean f50586ribwqtqdhb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private DecoderInputBuffer f50587sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private long f50588stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private int f50589tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private ppxfxbqfkf f50590ulzqkzuiru;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private zoijcleaow f50591vipkmwdibw;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private iobyxmoadg f50592wypolnanlu;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final iobyxmoadg f50593ppxfxbqfkf = new iobyxmoadg(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long f50594iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f50595zoijcleaow;

        public iobyxmoadg(long j13, long j14) {
            this.f50594iobyxmoadg = j13;
            this.f50595zoijcleaow = j14;
        }
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f50596iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Bitmap f50597ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long f50598zoijcleaow;

        public zoijcleaow(int i13, long j13) {
            this.f50596iobyxmoadg = i13;
            this.f50598zoijcleaow = j13;
        }

        public void eablkybsjg(Bitmap bitmap) {
            this.f50597ppxfxbqfkf = bitmap;
        }

        public long iobyxmoadg() {
            return this.f50598zoijcleaow;
        }

        public int ppxfxbqfkf() {
            return this.f50596iobyxmoadg;
        }

        public boolean wkgbmnqykc() {
            return this.f50597ppxfxbqfkf != null;
        }

        public Bitmap zoijcleaow() {
            return this.f50597ppxfxbqfkf;
        }
    }

    public eablkybsjg(ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, ImageOutput imageOutput) {
        super(4);
        this.f50576hcddaimhww = iobyxmoadgVar;
        this.f50574crxdokpmqz = roivzttewh(imageOutput);
        this.f50581jpowsppfya = DecoderInputBuffer.kcexrzcfyt();
        this.f50592wypolnanlu = iobyxmoadg.f50593ppxfxbqfkf;
        this.f50577hkdspvbjdz = new ArrayDeque();
        this.f50582kegysxyocb = -9223372036854775807L;
        this.f50588stevsuqkhv = -9223372036854775807L;
        this.f50589tzroggbefp = 0;
        this.f50583mbcevpiqjq = 1;
    }

    private void auzgnhcxok(int i13) {
        this.f50583mbcevpiqjq = Math.min(this.f50583mbcevpiqjq, i13);
    }

    private boolean dvvnrvtcbc() throws ExoPlaybackException {
        if (!skhdrjzrfn()) {
            return false;
        }
        if (!this.f50585okpsazkaxt) {
            return true;
        }
        if (!lrnfpwlwnk((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f50584ntlheqmsrt))) {
            throw mbcevpiqjq(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.f50584ntlheqmsrt, 4005);
        }
        ppxfxbqfkf ppxfxbqfkfVar = this.f50590ulzqkzuiru;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.release();
        }
        this.f50590ulzqkzuiru = this.f50576hcddaimhww.zoijcleaow();
        this.f50585okpsazkaxt = false;
        return true;
    }

    private boolean fiwbwshyhd() {
        boolean z13 = getState() == 2;
        int i13 = this.f50583mbcevpiqjq;
        if (i13 == 0) {
            return z13;
        }
        if (i13 == 1) {
            return true;
        }
        if (i13 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    private void hszhottldk(ImageOutput imageOutput) {
        this.f50574crxdokpmqz = roivzttewh(imageOutput);
    }

    private void igdgnonuha(long j13) {
        this.f50588stevsuqkhv = j13;
        while (!this.f50577hkdspvbjdz.isEmpty() && j13 >= ((iobyxmoadg) this.f50577hkdspvbjdz.peek()).f50594iobyxmoadg) {
            this.f50592wypolnanlu = (iobyxmoadg) this.f50577hkdspvbjdz.removeFirst();
        }
    }

    private void iwxlajgraz(long j13, DecoderInputBuffer decoderInputBuffer) {
        boolean z13 = true;
        if (decoderInputBuffer.dxjokdxxww()) {
            this.f50586ribwqtqdhb = true;
            return;
        }
        zoijcleaow zoijcleaowVar = new zoijcleaow(this.f50578ikoacuggdj, decoderInputBuffer.f10020esjtqupxsv);
        this.f50579jhduphickx = zoijcleaowVar;
        this.f50578ikoacuggdj++;
        if (!this.f50586ribwqtqdhb) {
            long jIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            boolean z14 = jIobyxmoadg - 30000 <= j13 && j13 <= 30000 + jIobyxmoadg;
            zoijcleaow zoijcleaowVar2 = this.f50591vipkmwdibw;
            boolean z15 = zoijcleaowVar2 != null && zoijcleaowVar2.iobyxmoadg() <= j13 && j13 < jIobyxmoadg;
            boolean zUawqvzlxes = uawqvzlxes((zoijcleaow) y2.iobyxmoadg.dxjokdxxww(this.f50579jhduphickx));
            if (!z14 && !z15 && !zUawqvzlxes) {
                z13 = false;
            }
            this.f50586ribwqtqdhb = z13;
            if (z15 && !z14) {
                return;
            }
        }
        this.f50591vipkmwdibw = this.f50579jhduphickx;
        this.f50579jhduphickx = null;
    }

    private boolean lrnfpwlwnk(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        int iIobyxmoadg = this.f50576hcddaimhww.iobyxmoadg(iobyxmoadgVar);
        return iIobyxmoadg == hszhottldk.jyumaefscl(4) || iIobyxmoadg == hszhottldk.jyumaefscl(3);
    }

    private boolean nuxfzjnpeb(long j13, long j14) throws ExoPlaybackException {
        if (this.f50580jlmebxxoox != null && this.f50591vipkmwdibw == null) {
            return false;
        }
        if (this.f50583mbcevpiqjq == 0 && getState() != 2) {
            return false;
        }
        if (this.f50580jlmebxxoox == null) {
            y2.iobyxmoadg.dxjokdxxww(this.f50590ulzqkzuiru);
            wkgbmnqykc wkgbmnqykcVarIobyxmoadg = this.f50590ulzqkzuiru.iobyxmoadg();
            if (wkgbmnqykcVarIobyxmoadg == null) {
                return false;
            }
            if (((wkgbmnqykc) y2.iobyxmoadg.dxjokdxxww(wkgbmnqykcVarIobyxmoadg)).dxjokdxxww()) {
                if (this.f50589tzroggbefp == 3) {
                    wizcaqwiak();
                    y2.iobyxmoadg.dxjokdxxww(this.f50584ntlheqmsrt);
                    dvvnrvtcbc();
                } else {
                    ((wkgbmnqykc) y2.iobyxmoadg.dxjokdxxww(wkgbmnqykcVarIobyxmoadg)).ojitshcjhn();
                    if (this.f50577hkdspvbjdz.isEmpty()) {
                        this.f50575dsvhmnatus = true;
                    }
                }
                return false;
            }
            y2.iobyxmoadg.btonecajqb(wkgbmnqykcVarIobyxmoadg.f50603cqumvgiudr, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f50580jlmebxxoox = wkgbmnqykcVarIobyxmoadg.f50603cqumvgiudr;
            ((wkgbmnqykc) y2.iobyxmoadg.dxjokdxxww(wkgbmnqykcVarIobyxmoadg)).ojitshcjhn();
        }
        if (!this.f50586ribwqtqdhb || this.f50580jlmebxxoox == null || this.f50591vipkmwdibw == null) {
            return false;
        }
        y2.iobyxmoadg.dxjokdxxww(this.f50584ntlheqmsrt);
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = this.f50584ntlheqmsrt;
        int i13 = iobyxmoadgVar.f9762jpowsppfya;
        boolean z13 = ((i13 == 1 && iobyxmoadgVar.f9757hkdspvbjdz == 1) || i13 == -1 || iobyxmoadgVar.f9757hkdspvbjdz == -1) ? false : true;
        if (!this.f50591vipkmwdibw.wkgbmnqykc()) {
            zoijcleaow zoijcleaowVar = this.f50591vipkmwdibw;
            zoijcleaowVar.eablkybsjg(z13 ? zeieaojujs(zoijcleaowVar.ppxfxbqfkf()) : (Bitmap) y2.iobyxmoadg.dxjokdxxww(this.f50580jlmebxxoox));
        }
        if (!lxfrhoxuzk(j13, j14, (Bitmap) y2.iobyxmoadg.dxjokdxxww(this.f50591vipkmwdibw.zoijcleaow()), this.f50591vipkmwdibw.iobyxmoadg())) {
            return false;
        }
        igdgnonuha(((zoijcleaow) y2.iobyxmoadg.dxjokdxxww(this.f50591vipkmwdibw)).iobyxmoadg());
        this.f50583mbcevpiqjq = 3;
        if (!z13 || ((zoijcleaow) y2.iobyxmoadg.dxjokdxxww(this.f50591vipkmwdibw)).ppxfxbqfkf() == (((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.dxjokdxxww(this.f50584ntlheqmsrt)).f9757hkdspvbjdz * ((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.dxjokdxxww(this.f50584ntlheqmsrt)).f9762jpowsppfya) - 1) {
            this.f50580jlmebxxoox = null;
        }
        this.f50591vipkmwdibw = this.f50579jhduphickx;
        this.f50579jhduphickx = null;
        return true;
    }

    private static ImageOutput roivzttewh(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.f10578iobyxmoadg : imageOutput;
    }

    private boolean tbqsvytpvh(long j13) {
        if (this.f50586ribwqtqdhb && this.f50591vipkmwdibw != null) {
            return false;
        }
        lmojexxdyd lmojexxdydVarCrxdokpmqz = crxdokpmqz();
        ppxfxbqfkf ppxfxbqfkfVar = this.f50590ulzqkzuiru;
        if (ppxfxbqfkfVar == null || this.f50589tzroggbefp == 3 || this.f50573cllcsxoeiz) {
            return false;
        }
        if (this.f50587sopmlzcsov == null) {
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) ppxfxbqfkfVar.eablkybsjg();
            this.f50587sopmlzcsov = decoderInputBuffer;
            if (decoderInputBuffer == null) {
                return false;
            }
        }
        if (this.f50589tzroggbefp == 2) {
            y2.iobyxmoadg.dxjokdxxww(this.f50587sopmlzcsov);
            this.f50587sopmlzcsov.agtfadlqog(4);
            ((ppxfxbqfkf) y2.iobyxmoadg.dxjokdxxww(this.f50590ulzqkzuiru)).gxszxtbevo(this.f50587sopmlzcsov);
            this.f50587sopmlzcsov = null;
            this.f50589tzroggbefp = 3;
            return false;
        }
        int iOpjhrmiecq = opjhrmiecq(lmojexxdydVarCrxdokpmqz, this.f50587sopmlzcsov, 0);
        if (iOpjhrmiecq == -5) {
            this.f50584ntlheqmsrt = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.dxjokdxxww(lmojexxdydVarCrxdokpmqz.f32682zoijcleaow);
            this.f50585okpsazkaxt = true;
            this.f50589tzroggbefp = 2;
            return true;
        }
        if (iOpjhrmiecq != -4) {
            if (iOpjhrmiecq == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f50587sopmlzcsov.vdvldrhtss();
        ByteBuffer byteBuffer = this.f50587sopmlzcsov.f10021iwizpuwonk;
        boolean z13 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((DecoderInputBuffer) y2.iobyxmoadg.dxjokdxxww(this.f50587sopmlzcsov)).dxjokdxxww();
        if (z13) {
            ((ppxfxbqfkf) y2.iobyxmoadg.dxjokdxxww(this.f50590ulzqkzuiru)).gxszxtbevo((DecoderInputBuffer) y2.iobyxmoadg.dxjokdxxww(this.f50587sopmlzcsov));
            this.f50578ikoacuggdj = 0;
        }
        iwxlajgraz(j13, (DecoderInputBuffer) y2.iobyxmoadg.dxjokdxxww(this.f50587sopmlzcsov));
        if (((DecoderInputBuffer) y2.iobyxmoadg.dxjokdxxww(this.f50587sopmlzcsov)).dxjokdxxww()) {
            this.f50573cllcsxoeiz = true;
            this.f50587sopmlzcsov = null;
            return false;
        }
        this.f50582kegysxyocb = Math.max(this.f50582kegysxyocb, ((DecoderInputBuffer) y2.iobyxmoadg.dxjokdxxww(this.f50587sopmlzcsov)).f10020esjtqupxsv);
        if (z13) {
            this.f50587sopmlzcsov = null;
        } else {
            ((DecoderInputBuffer) y2.iobyxmoadg.dxjokdxxww(this.f50587sopmlzcsov)).gxszxtbevo();
        }
        return !this.f50586ribwqtqdhb;
    }

    private boolean uawqvzlxes(zoijcleaow zoijcleaowVar) {
        return ((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.dxjokdxxww(this.f50584ntlheqmsrt)).f9762jpowsppfya == -1 || this.f50584ntlheqmsrt.f9757hkdspvbjdz == -1 || zoijcleaowVar.ppxfxbqfkf() == (((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.dxjokdxxww(this.f50584ntlheqmsrt)).f9757hkdspvbjdz * this.f50584ntlheqmsrt.f9762jpowsppfya) - 1;
    }

    private void wizcaqwiak() {
        this.f50587sopmlzcsov = null;
        this.f50589tzroggbefp = 0;
        this.f50582kegysxyocb = -9223372036854775807L;
        ppxfxbqfkf ppxfxbqfkfVar = this.f50590ulzqkzuiru;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.release();
            this.f50590ulzqkzuiru = null;
        }
    }

    private Bitmap zeieaojujs(int i13) {
        y2.iobyxmoadg.dxjokdxxww(this.f50580jlmebxxoox);
        int width = this.f50580jlmebxxoox.getWidth() / ((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.dxjokdxxww(this.f50584ntlheqmsrt)).f9762jpowsppfya;
        int height = this.f50580jlmebxxoox.getHeight() / ((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.dxjokdxxww(this.f50584ntlheqmsrt)).f9757hkdspvbjdz;
        int i14 = this.f50584ntlheqmsrt.f9762jpowsppfya;
        return Bitmap.createBitmap(this.f50580jlmebxxoox, (i13 % i14) * width, (i13 / i14) * height, width, height);
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public void btonecajqb(long j13, long j14) throws ExoPlaybackException {
        if (this.f50575dsvhmnatus) {
            return;
        }
        if (this.f50584ntlheqmsrt == null) {
            lmojexxdyd lmojexxdydVarCrxdokpmqz = crxdokpmqz();
            this.f50581jpowsppfya.gxszxtbevo();
            int iOpjhrmiecq = opjhrmiecq(lmojexxdydVarCrxdokpmqz, this.f50581jpowsppfya, 2);
            if (iOpjhrmiecq != -5) {
                if (iOpjhrmiecq == -4) {
                    y2.iobyxmoadg.lqeggnwhkg(this.f50581jpowsppfya.dxjokdxxww());
                    this.f50573cllcsxoeiz = true;
                    this.f50575dsvhmnatus = true;
                    return;
                }
                return;
            }
            this.f50584ntlheqmsrt = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.dxjokdxxww(lmojexxdydVarCrxdokpmqz.f32682zoijcleaow);
            this.f50585okpsazkaxt = true;
        }
        if (this.f50590ulzqkzuiru != null || dvvnrvtcbc()) {
            try {
                jpowsppfya.iobyxmoadg("drainAndFeedDecoder");
                while (nuxfzjnpeb(j13, j14)) {
                }
                while (tbqsvytpvh(j13)) {
                }
                jpowsppfya.zoijcleaow();
            } catch (ImageDecoderException e13) {
                throw mbcevpiqjq(e13, null, 4003);
            }
        }
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu, androidx.media3.exoplayer.igdgnonuha.zoijcleaow
    public void cqumvgiudr(int i13, Object obj) {
        if (i13 != 15) {
            super.cqumvgiudr(i13, obj);
        } else {
            hszhottldk(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void czzsidtyhn(long j13, boolean z13) {
        auzgnhcxok(1);
        this.f50575dsvhmnatus = false;
        this.f50573cllcsxoeiz = false;
        this.f50580jlmebxxoox = null;
        this.f50591vipkmwdibw = null;
        this.f50579jhduphickx = null;
        this.f50586ribwqtqdhb = false;
        this.f50587sopmlzcsov = null;
        ppxfxbqfkf ppxfxbqfkfVar = this.f50590ulzqkzuiru;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.flush();
        }
        this.f50577hkdspvbjdz.clear();
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak, androidx.media3.exoplayer.hszhottldk
    public String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.hszhottldk
    public int iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return this.f50576hcddaimhww.iobyxmoadg(iobyxmoadgVar);
    }

    protected boolean lxfrhoxuzk(long j13, long j14, Bitmap bitmap, long j15) {
        long j16 = j15 - j13;
        if (!fiwbwshyhd() && j16 >= 30000) {
            return false;
        }
        this.f50574crxdokpmqz.onImageAvailable(j15 - this.f50592wypolnanlu.f50595zoijcleaow, bitmap);
        return true;
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void metgxyhuhe(boolean z13, boolean z14) {
        this.f50583mbcevpiqjq = z14 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r2 >= r5) goto L14;
     */
    @Override // androidx.media3.exoplayer.nufgyqmvbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void oipsdeybqn(androidx.media3.common.iobyxmoadg[] r5, long r6, long r8, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow r10) {
        /*
            r4 = this;
            super.oipsdeybqn(r5, r6, r8, r10)
            j3.eablkybsjg$iobyxmoadg r5 = r4.f50592wypolnanlu
            long r5 = r5.f50595zoijcleaow
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L36
            java.util.ArrayDeque r5 = r4.f50577hkdspvbjdz
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L29
            long r5 = r4.f50582kegysxyocb
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L36
            long r2 = r4.f50588stevsuqkhv
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L29
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L29
            goto L36
        L29:
            java.util.ArrayDeque r5 = r4.f50577hkdspvbjdz
            j3.eablkybsjg$iobyxmoadg r6 = new j3.eablkybsjg$iobyxmoadg
            long r0 = r4.f50582kegysxyocb
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L3d
        L36:
            j3.eablkybsjg$iobyxmoadg r5 = new j3.eablkybsjg$iobyxmoadg
            r5.<init>(r0, r8)
            r4.f50592wypolnanlu = r5
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.eablkybsjg.oipsdeybqn(androidx.media3.common.iobyxmoadg[], long, long, androidx.media3.exoplayer.source.oxmwwwfdhm$zoijcleaow):void");
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public boolean ppxfxbqfkf() {
        int i13 = this.f50583mbcevpiqjq;
        return i13 == 3 || (i13 == 0 && this.f50586ribwqtqdhb);
    }

    protected boolean skhdrjzrfn() {
        return true;
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void uwvvkdfqfp() {
        wizcaqwiak();
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public boolean wkgbmnqykc() {
        return this.f50575dsvhmnatus;
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void xrmfcynszj() {
        this.f50584ntlheqmsrt = null;
        this.f50592wypolnanlu = iobyxmoadg.f50593ppxfxbqfkf;
        this.f50577hkdspvbjdz.clear();
        wizcaqwiak();
        this.f50574crxdokpmqz.iobyxmoadg();
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void ydmasvzmpa() {
        wizcaqwiak();
        auzgnhcxok(1);
    }
}
