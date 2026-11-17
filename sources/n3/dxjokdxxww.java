package n3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.hszhottldk;
import androidx.media3.exoplayer.source.oxmwwwfdhm;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.zdlpuopuiu;
import f3.lmojexxdyd;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import q4.draadjrbmk;
import q4.gtknphoqwx;
import q4.ojitshcjhn;
import q4.rgvfuqvkyq;
import v2.iwizpuwonk;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww extends androidx.media3.exoplayer.nufgyqmvbu implements Handler.Callback {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final lqeggnwhkg f68462cllcsxoeiz;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private final lmojexxdyd f68463crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private boolean f68464dsvhmnatus;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final q4.zoijcleaow f68465hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private iobyxmoadg f68466hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private long f68467ikoacuggdj;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private long f68468jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private boolean f68469jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final DecoderInputBuffer f68470jpowsppfya;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private IOException f68471jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private ojitshcjhn f68472kegysxyocb;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private rgvfuqvkyq f68473mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private int f68474ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private boolean f68475okpsazkaxt;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private boolean f68476ribwqtqdhb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private final nufgyqmvbu f68477sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private draadjrbmk f68478stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private rgvfuqvkyq f68479tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private final Handler f68480ulzqkzuiru;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f68481vipkmwdibw;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private int f68482wypolnanlu;

    public dxjokdxxww(nufgyqmvbu nufgyqmvbuVar, Looper looper) {
        this(nufgyqmvbuVar, looper, lqeggnwhkg.f68486iobyxmoadg);
    }

    private void ageimvtcrz() {
        wizcaqwiak();
        iwxlajgraz();
    }

    private static boolean auzgnhcxok(gtknphoqwx gtknphoqwxVar, long j13) {
        return gtknphoqwxVar == null || gtknphoqwxVar.ppxfxbqfkf(gtknphoqwxVar.wkgbmnqykc() - 1) <= j13;
    }

    private void dvvnrvtcbc(x2.zoijcleaow zoijcleaowVar) {
        this.f68477sopmlzcsov.wflxmlrfwp(zoijcleaowVar.f121003iobyxmoadg);
        this.f68477sopmlzcsov.draadjrbmk(zoijcleaowVar);
    }

    private void fiwbwshyhd(long j13) {
        boolean z13;
        this.f68468jhduphickx = j13;
        if (this.f68473mbcevpiqjq == null) {
            ((draadjrbmk) y2.iobyxmoadg.eablkybsjg(this.f68478stevsuqkhv)).zoijcleaow(j13);
            try {
                this.f68473mbcevpiqjq = (rgvfuqvkyq) ((draadjrbmk) y2.iobyxmoadg.eablkybsjg(this.f68478stevsuqkhv)).iobyxmoadg();
            } catch (SubtitleDecoderException e13) {
                uawqvzlxes(e13);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f68479tzroggbefp != null) {
            long jTbqsvytpvh = tbqsvytpvh();
            z13 = false;
            while (jTbqsvytpvh <= j13) {
                this.f68474ntlheqmsrt++;
                jTbqsvytpvh = tbqsvytpvh();
                z13 = true;
            }
        } else {
            z13 = false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = this.f68473mbcevpiqjq;
        if (rgvfuqvkyqVar != null) {
            if (rgvfuqvkyqVar.dxjokdxxww()) {
                if (!z13 && tbqsvytpvh() == Long.MAX_VALUE) {
                    if (this.f68482wypolnanlu == 2) {
                        ageimvtcrz();
                    } else {
                        lxfrhoxuzk();
                        this.f68476ribwqtqdhb = true;
                    }
                }
            } else if (rgvfuqvkyqVar.f30239yggfygwlhe <= j13) {
                rgvfuqvkyq rgvfuqvkyqVar2 = this.f68479tzroggbefp;
                if (rgvfuqvkyqVar2 != null) {
                    rgvfuqvkyqVar2.ojitshcjhn();
                }
                this.f68474ntlheqmsrt = rgvfuqvkyqVar.iobyxmoadg(j13);
                this.f68479tzroggbefp = rgvfuqvkyqVar;
                this.f68473mbcevpiqjq = null;
                z13 = true;
            }
        }
        if (z13) {
            y2.iobyxmoadg.eablkybsjg(this.f68479tzroggbefp);
            ipoelvxyzq(new x2.zoijcleaow(this.f68479tzroggbefp.zoijcleaow(j13), roivzttewh(nuxfzjnpeb(j13))));
        }
        if (this.f68482wypolnanlu == 2) {
            return;
        }
        while (!this.f68469jlmebxxoox) {
            try {
                ojitshcjhn ojitshcjhnVar = this.f68472kegysxyocb;
                if (ojitshcjhnVar == null) {
                    ojitshcjhnVar = (ojitshcjhn) ((draadjrbmk) y2.iobyxmoadg.eablkybsjg(this.f68478stevsuqkhv)).eablkybsjg();
                    if (ojitshcjhnVar == null) {
                        return;
                    } else {
                        this.f68472kegysxyocb = ojitshcjhnVar;
                    }
                }
                if (this.f68482wypolnanlu == 1) {
                    ojitshcjhnVar.agtfadlqog(4);
                    ((draadjrbmk) y2.iobyxmoadg.eablkybsjg(this.f68478stevsuqkhv)).ppxfxbqfkf(ojitshcjhnVar);
                    this.f68472kegysxyocb = null;
                    this.f68482wypolnanlu = 2;
                    return;
                }
                int iOpjhrmiecq = opjhrmiecq(this.f68463crxdokpmqz, ojitshcjhnVar, 0);
                if (iOpjhrmiecq == -4) {
                    if (ojitshcjhnVar.dxjokdxxww()) {
                        this.f68469jlmebxxoox = true;
                        this.f68464dsvhmnatus = false;
                    } else {
                        androidx.media3.common.iobyxmoadg iobyxmoadgVar = this.f68463crxdokpmqz.f32682zoijcleaow;
                        if (iobyxmoadgVar == null) {
                            return;
                        }
                        ojitshcjhnVar.f77830istkbnxepw = iobyxmoadgVar.f9782zdlpuopuiu;
                        ojitshcjhnVar.vdvldrhtss();
                        this.f68464dsvhmnatus &= !ojitshcjhnVar.gtknphoqwx();
                    }
                    if (!this.f68464dsvhmnatus) {
                        ((draadjrbmk) y2.iobyxmoadg.eablkybsjg(this.f68478stevsuqkhv)).ppxfxbqfkf(ojitshcjhnVar);
                        this.f68472kegysxyocb = null;
                    }
                } else if (iOpjhrmiecq == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e14) {
                uawqvzlxes(e14);
                return;
            }
        }
    }

    private void hszhottldk(long j13) {
        boolean zIgdgnonuha = igdgnonuha(j13);
        long jWkgbmnqykc = this.f68466hkdspvbjdz.wkgbmnqykc(this.f68468jhduphickx);
        if (jWkgbmnqykc == Long.MIN_VALUE && this.f68469jlmebxxoox && !zIgdgnonuha) {
            this.f68476ribwqtqdhb = true;
        }
        if (jWkgbmnqykc != Long.MIN_VALUE && jWkgbmnqykc <= j13) {
            zIgdgnonuha = true;
        }
        if (zIgdgnonuha) {
            zdlpuopuiu zdlpuopuiuVarIobyxmoadg = this.f68466hkdspvbjdz.iobyxmoadg(j13);
            long jZoijcleaow = this.f68466hkdspvbjdz.zoijcleaow(j13);
            ipoelvxyzq(new x2.zoijcleaow(zdlpuopuiuVarIobyxmoadg, roivzttewh(jZoijcleaow)));
            this.f68466hkdspvbjdz.eablkybsjg(jZoijcleaow);
        }
        this.f68468jhduphickx = j13;
    }

    private boolean igdgnonuha(long j13) {
        if (this.f68469jlmebxxoox || opjhrmiecq(this.f68463crxdokpmqz, this.f68470jpowsppfya, 0) != -4) {
            return false;
        }
        if (this.f68470jpowsppfya.dxjokdxxww()) {
            this.f68469jlmebxxoox = true;
            return false;
        }
        this.f68470jpowsppfya.vdvldrhtss();
        ByteBuffer byteBuffer = (ByteBuffer) y2.iobyxmoadg.eablkybsjg(this.f68470jpowsppfya.f10021iwizpuwonk);
        q4.eablkybsjg eablkybsjgVarIobyxmoadg = this.f68465hcddaimhww.iobyxmoadg(this.f68470jpowsppfya.f10020esjtqupxsv, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f68470jpowsppfya.gxszxtbevo();
        return this.f68466hkdspvbjdz.ppxfxbqfkf(eablkybsjgVarIobyxmoadg, j13);
    }

    private void ipoelvxyzq(x2.zoijcleaow zoijcleaowVar) {
        Handler handler = this.f68480ulzqkzuiru;
        if (handler != null) {
            handler.obtainMessage(1, zoijcleaowVar).sendToTarget();
        } else {
            dvvnrvtcbc(zoijcleaowVar);
        }
    }

    private void iwxlajgraz() {
        this.f68464dsvhmnatus = true;
        draadjrbmk draadjrbmkVarZoijcleaow = this.f68462cllcsxoeiz.zoijcleaow((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f68481vipkmwdibw));
        this.f68478stevsuqkhv = draadjrbmkVarZoijcleaow;
        draadjrbmkVarZoijcleaow.wkgbmnqykc(ribwqtqdhb());
    }

    private void lrnfpwlwnk() {
        y2.iobyxmoadg.nufgyqmvbu(this.f68475okpsazkaxt || Objects.equals(this.f68481vipkmwdibw.f9769ojitshcjhn, "application/cea-608") || Objects.equals(this.f68481vipkmwdibw.f9769ojitshcjhn, "application/x-mp4-cea-608") || Objects.equals(this.f68481vipkmwdibw.f9769ojitshcjhn, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f68481vipkmwdibw.f9769ojitshcjhn + " samples (expected application/x-media3-cues).");
    }

    private void lxfrhoxuzk() {
        this.f68472kegysxyocb = null;
        this.f68474ntlheqmsrt = -1;
        rgvfuqvkyq rgvfuqvkyqVar = this.f68479tzroggbefp;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.ojitshcjhn();
            this.f68479tzroggbefp = null;
        }
        rgvfuqvkyq rgvfuqvkyqVar2 = this.f68473mbcevpiqjq;
        if (rgvfuqvkyqVar2 != null) {
            rgvfuqvkyqVar2.ojitshcjhn();
            this.f68473mbcevpiqjq = null;
        }
    }

    private long nuxfzjnpeb(long j13) {
        int iIobyxmoadg = this.f68479tzroggbefp.iobyxmoadg(j13);
        if (iIobyxmoadg == 0 || this.f68479tzroggbefp.wkgbmnqykc() == 0) {
            return this.f68479tzroggbefp.f30239yggfygwlhe;
        }
        if (iIobyxmoadg != -1) {
            return this.f68479tzroggbefp.ppxfxbqfkf(iIobyxmoadg - 1);
        }
        rgvfuqvkyq rgvfuqvkyqVar = this.f68479tzroggbefp;
        return rgvfuqvkyqVar.ppxfxbqfkf(rgvfuqvkyqVar.wkgbmnqykc() - 1);
    }

    private long roivzttewh(long j13) {
        y2.iobyxmoadg.lqeggnwhkg(j13 != -9223372036854775807L);
        return j13 - ikoacuggdj();
    }

    private static boolean skhdrjzrfn(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return Objects.equals(iobyxmoadgVar.f9769ojitshcjhn, "application/x-media3-cues");
    }

    private long tbqsvytpvh() {
        if (this.f68474ntlheqmsrt == -1) {
            return Long.MAX_VALUE;
        }
        y2.iobyxmoadg.eablkybsjg(this.f68479tzroggbefp);
        if (this.f68474ntlheqmsrt >= this.f68479tzroggbefp.wkgbmnqykc()) {
            return Long.MAX_VALUE;
        }
        return this.f68479tzroggbefp.ppxfxbqfkf(this.f68474ntlheqmsrt);
    }

    private void uawqvzlxes(SubtitleDecoderException subtitleDecoderException) {
        kcexrzcfyt.wkgbmnqykc("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f68481vipkmwdibw, subtitleDecoderException);
        zeieaojujs();
        ageimvtcrz();
    }

    private void wizcaqwiak() {
        lxfrhoxuzk();
        ((draadjrbmk) y2.iobyxmoadg.eablkybsjg(this.f68478stevsuqkhv)).release();
        this.f68478stevsuqkhv = null;
        this.f68482wypolnanlu = 0;
    }

    private void zeieaojujs() {
        ipoelvxyzq(new x2.zoijcleaow(zdlpuopuiu.zynmafqrjb(), roivzttewh(this.f68468jhduphickx)));
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public void btonecajqb(long j13, long j14) {
        if (istkbnxepw()) {
            long j15 = this.f68467ikoacuggdj;
            if (j15 != -9223372036854775807L && j13 >= j15) {
                lxfrhoxuzk();
                this.f68476ribwqtqdhb = true;
            }
        }
        if (this.f68476ribwqtqdhb) {
            return;
        }
        if (skhdrjzrfn((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f68481vipkmwdibw))) {
            y2.iobyxmoadg.eablkybsjg(this.f68466hkdspvbjdz);
            hszhottldk(j13);
        } else {
            lrnfpwlwnk();
            fiwbwshyhd(j13);
        }
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void czzsidtyhn(long j13, boolean z13) {
        this.f68468jhduphickx = j13;
        iobyxmoadg iobyxmoadgVar = this.f68466hkdspvbjdz;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.clear();
        }
        zeieaojujs();
        this.f68469jlmebxxoox = false;
        this.f68476ribwqtqdhb = false;
        this.f68467ikoacuggdj = -9223372036854775807L;
        androidx.media3.common.iobyxmoadg iobyxmoadgVar2 = this.f68481vipkmwdibw;
        if (iobyxmoadgVar2 == null || skhdrjzrfn(iobyxmoadgVar2)) {
            return;
        }
        if (this.f68482wypolnanlu != 0) {
            ageimvtcrz();
            return;
        }
        lxfrhoxuzk();
        draadjrbmk draadjrbmkVar = (draadjrbmk) y2.iobyxmoadg.eablkybsjg(this.f68478stevsuqkhv);
        draadjrbmkVar.flush();
        draadjrbmkVar.wkgbmnqykc(ribwqtqdhb());
    }

    public void fyldjkxazc(long j13) {
        y2.iobyxmoadg.lqeggnwhkg(istkbnxepw());
        this.f68467ikoacuggdj = j13;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak, androidx.media3.exoplayer.hszhottldk
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        dvvnrvtcbc((x2.zoijcleaow) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.hszhottldk
    public int iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        if (skhdrjzrfn(iobyxmoadgVar) || this.f68462cllcsxoeiz.iobyxmoadg(iobyxmoadgVar)) {
            return hszhottldk.jyumaefscl(iobyxmoadgVar.f9747cllcsxoeiz == 0 ? 4 : 2);
        }
        return iwizpuwonk.rgvfuqvkyq(iobyxmoadgVar.f9769ojitshcjhn) ? hszhottldk.jyumaefscl(1) : hszhottldk.jyumaefscl(0);
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void oipsdeybqn(androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr, long j13, long j14, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = iobyxmoadgVarArr[0];
        this.f68481vipkmwdibw = iobyxmoadgVar;
        if (skhdrjzrfn(iobyxmoadgVar)) {
            this.f68466hkdspvbjdz = this.f68481vipkmwdibw.f9756hcddaimhww == 1 ? new eablkybsjg() : new gxszxtbevo();
            return;
        }
        lrnfpwlwnk();
        if (this.f68478stevsuqkhv != null) {
            this.f68482wypolnanlu = 1;
        } else {
            iwxlajgraz();
        }
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public boolean ppxfxbqfkf() {
        if (this.f68481vipkmwdibw == null) {
            return true;
        }
        if (this.f68471jztzpxfvev == null) {
            try {
                lereixgezr();
            } catch (IOException e13) {
                this.f68471jztzpxfvev = e13;
            }
        }
        if (this.f68471jztzpxfvev != null) {
            if (skhdrjzrfn((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f68481vipkmwdibw))) {
                return ((iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f68466hkdspvbjdz)).wkgbmnqykc(this.f68468jhduphickx) != Long.MIN_VALUE;
            }
            if (this.f68476ribwqtqdhb || (this.f68469jlmebxxoox && auzgnhcxok(this.f68479tzroggbefp, this.f68468jhduphickx) && auzgnhcxok(this.f68473mbcevpiqjq, this.f68468jhduphickx) && this.f68472kegysxyocb != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public boolean wkgbmnqykc() {
        return this.f68476ribwqtqdhb;
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void xrmfcynszj() {
        this.f68481vipkmwdibw = null;
        this.f68467ikoacuggdj = -9223372036854775807L;
        zeieaojujs();
        this.f68468jhduphickx = -9223372036854775807L;
        if (this.f68478stevsuqkhv != null) {
            wizcaqwiak();
        }
    }

    public dxjokdxxww(nufgyqmvbu nufgyqmvbuVar, Looper looper, lqeggnwhkg lqeggnwhkgVar) {
        super(3);
        this.f68477sopmlzcsov = (nufgyqmvbu) y2.iobyxmoadg.eablkybsjg(nufgyqmvbuVar);
        this.f68480ulzqkzuiru = looper == null ? null : stevsuqkhv.esjtqupxsv(looper, this);
        this.f68462cllcsxoeiz = lqeggnwhkgVar;
        this.f68465hcddaimhww = new q4.zoijcleaow();
        this.f68470jpowsppfya = new DecoderInputBuffer(1);
        this.f68463crxdokpmqz = new lmojexxdyd();
        this.f68467ikoacuggdj = -9223372036854775807L;
        this.f68468jhduphickx = -9223372036854775807L;
        this.f68475okpsazkaxt = false;
    }
}
