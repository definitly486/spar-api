package l3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.hszhottldk;
import androidx.media3.exoplayer.nufgyqmvbu;
import androidx.media3.exoplayer.source.oxmwwwfdhm;
import f3.lmojexxdyd;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import v2.jyumaefscl;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf extends nufgyqmvbu implements Handler.Callback {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final c4.zoijcleaow f61381cllcsxoeiz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final boolean f61382dsvhmnatus;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final iobyxmoadg f61383hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final Handler f61384hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final zoijcleaow f61385jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f61386kegysxyocb;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private jyumaefscl f61387mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private long f61388ntlheqmsrt;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private boolean f61389stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private long f61390tzroggbefp;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private c4.iobyxmoadg f61391wypolnanlu;

    public ppxfxbqfkf(zoijcleaow zoijcleaowVar, Looper looper) {
        this(zoijcleaowVar, looper, iobyxmoadg.f61380iobyxmoadg);
    }

    private void lrnfpwlwnk(jyumaefscl jyumaefsclVar, List list) {
        for (int i13 = 0; i13 < jyumaefsclVar.eablkybsjg(); i13++) {
            androidx.media3.common.iobyxmoadg iobyxmoadgVarIobyxmoadg = jyumaefsclVar.wkgbmnqykc(i13).iobyxmoadg();
            if (iobyxmoadgVarIobyxmoadg == null || !this.f61383hcddaimhww.iobyxmoadg(iobyxmoadgVarIobyxmoadg)) {
                list.add(jyumaefsclVar.wkgbmnqykc(i13));
            } else {
                c4.iobyxmoadg iobyxmoadgVarZoijcleaow = this.f61383hcddaimhww.zoijcleaow(iobyxmoadgVarIobyxmoadg);
                byte[] bArr = (byte[]) y2.iobyxmoadg.eablkybsjg(jyumaefsclVar.wkgbmnqykc(i13).ppxfxbqfkf());
                this.f61381cllcsxoeiz.gxszxtbevo();
                this.f61381cllcsxoeiz.rgvfuqvkyq(bArr.length);
                ((ByteBuffer) stevsuqkhv.nufgyqmvbu(this.f61381cllcsxoeiz.f10021iwizpuwonk)).put(bArr);
                this.f61381cllcsxoeiz.vdvldrhtss();
                jyumaefscl jyumaefsclVarIobyxmoadg = iobyxmoadgVarZoijcleaow.iobyxmoadg(this.f61381cllcsxoeiz);
                if (jyumaefsclVarIobyxmoadg != null) {
                    lrnfpwlwnk(jyumaefsclVarIobyxmoadg, list);
                }
            }
        }
    }

    private void nuxfzjnpeb(jyumaefscl jyumaefsclVar) {
        Handler handler = this.f61384hkdspvbjdz;
        if (handler != null) {
            handler.obtainMessage(1, jyumaefsclVar).sendToTarget();
        } else {
            tbqsvytpvh(jyumaefsclVar);
        }
    }

    private boolean roivzttewh(long j13) {
        boolean z13;
        jyumaefscl jyumaefsclVar = this.f61387mbcevpiqjq;
        if (jyumaefsclVar == null || (!this.f61382dsvhmnatus && jyumaefsclVar.f115383zoijcleaow > zeieaojujs(j13))) {
            z13 = false;
        } else {
            nuxfzjnpeb(this.f61387mbcevpiqjq);
            this.f61387mbcevpiqjq = null;
            z13 = true;
        }
        if (this.f61389stevsuqkhv && this.f61387mbcevpiqjq == null) {
            this.f61386kegysxyocb = true;
        }
        return z13;
    }

    private void tbqsvytpvh(jyumaefscl jyumaefsclVar) {
        this.f61385jpowsppfya.yggfygwlhe(jyumaefsclVar);
    }

    private void uawqvzlxes() {
        if (this.f61389stevsuqkhv || this.f61387mbcevpiqjq != null) {
            return;
        }
        this.f61381cllcsxoeiz.gxszxtbevo();
        lmojexxdyd lmojexxdydVarCrxdokpmqz = crxdokpmqz();
        int iOpjhrmiecq = opjhrmiecq(lmojexxdydVarCrxdokpmqz, this.f61381cllcsxoeiz, 0);
        if (iOpjhrmiecq != -4) {
            if (iOpjhrmiecq == -5) {
                this.f61390tzroggbefp = ((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(lmojexxdydVarCrxdokpmqz.f32682zoijcleaow)).f9782zdlpuopuiu;
                return;
            }
            return;
        }
        if (this.f61381cllcsxoeiz.dxjokdxxww()) {
            this.f61389stevsuqkhv = true;
            return;
        }
        if (this.f61381cllcsxoeiz.f10020esjtqupxsv >= ribwqtqdhb()) {
            c4.zoijcleaow zoijcleaowVar = this.f61381cllcsxoeiz;
            zoijcleaowVar.f18723istkbnxepw = this.f61390tzroggbefp;
            zoijcleaowVar.vdvldrhtss();
            jyumaefscl jyumaefsclVarIobyxmoadg = ((c4.iobyxmoadg) stevsuqkhv.nufgyqmvbu(this.f61391wypolnanlu)).iobyxmoadg(this.f61381cllcsxoeiz);
            if (jyumaefsclVarIobyxmoadg != null) {
                ArrayList arrayList = new ArrayList(jyumaefsclVarIobyxmoadg.eablkybsjg());
                lrnfpwlwnk(jyumaefsclVarIobyxmoadg, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f61387mbcevpiqjq = new jyumaefscl(zeieaojujs(this.f61381cllcsxoeiz.f10020esjtqupxsv), arrayList);
            }
        }
    }

    private long zeieaojujs(long j13) {
        y2.iobyxmoadg.lqeggnwhkg(j13 != -9223372036854775807L);
        y2.iobyxmoadg.lqeggnwhkg(this.f61388ntlheqmsrt != -9223372036854775807L);
        return j13 - this.f61388ntlheqmsrt;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public void btonecajqb(long j13, long j14) {
        boolean zRoivzttewh = true;
        while (zRoivzttewh) {
            uawqvzlxes();
            zRoivzttewh = roivzttewh(j13);
        }
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void czzsidtyhn(long j13, boolean z13) {
        this.f61387mbcevpiqjq = null;
        this.f61389stevsuqkhv = false;
        this.f61386kegysxyocb = false;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak, androidx.media3.exoplayer.hszhottldk
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        tbqsvytpvh((jyumaefscl) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.hszhottldk
    public int iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        if (this.f61383hcddaimhww.iobyxmoadg(iobyxmoadgVar)) {
            return hszhottldk.jyumaefscl(iobyxmoadgVar.f9747cllcsxoeiz == 0 ? 4 : 2);
        }
        return hszhottldk.jyumaefscl(0);
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void oipsdeybqn(androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr, long j13, long j14, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        this.f61391wypolnanlu = this.f61383hcddaimhww.zoijcleaow(iobyxmoadgVarArr[0]);
        jyumaefscl jyumaefsclVar = this.f61387mbcevpiqjq;
        if (jyumaefsclVar != null) {
            this.f61387mbcevpiqjq = jyumaefsclVar.ppxfxbqfkf((jyumaefsclVar.f115383zoijcleaow + this.f61388ntlheqmsrt) - j14);
        }
        this.f61388ntlheqmsrt = j14;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public boolean ppxfxbqfkf() {
        return true;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public boolean wkgbmnqykc() {
        return this.f61386kegysxyocb;
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void xrmfcynszj() {
        this.f61387mbcevpiqjq = null;
        this.f61391wypolnanlu = null;
        this.f61388ntlheqmsrt = -9223372036854775807L;
    }

    public ppxfxbqfkf(zoijcleaow zoijcleaowVar, Looper looper, iobyxmoadg iobyxmoadgVar) {
        this(zoijcleaowVar, looper, iobyxmoadgVar, false);
    }

    public ppxfxbqfkf(zoijcleaow zoijcleaowVar, Looper looper, iobyxmoadg iobyxmoadgVar, boolean z13) {
        super(5);
        this.f61385jpowsppfya = (zoijcleaow) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar);
        this.f61384hkdspvbjdz = looper == null ? null : stevsuqkhv.esjtqupxsv(looper, this);
        this.f61383hcddaimhww = (iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar);
        this.f61382dsvhmnatus = z13;
        this.f61381cllcsxoeiz = new c4.zoijcleaow();
        this.f61388ntlheqmsrt = -9223372036854775807L;
    }
}
