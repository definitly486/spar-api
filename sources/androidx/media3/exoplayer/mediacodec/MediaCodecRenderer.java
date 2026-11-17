package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.wizcaqwiak;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f3.lmojexxdyd;
import g3.h0;
import h3.wwaezpbzkn;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import y2.jpowsppfya;
import y2.kcexrzcfyt;
import y2.pkzmftpjix;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaCodecRenderer extends androidx.media3.exoplayer.nufgyqmvbu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f10715c = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10716a;

    /* JADX INFO: renamed from: ageimvtcrz, reason: collision with root package name */
    private boolean f10717ageimvtcrz;

    /* JADX INFO: renamed from: auzgnhcxok, reason: collision with root package name */
    private boolean f10718auzgnhcxok;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10719b;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private boolean f10720bfopjjpdmp;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final float f10721cllcsxoeiz;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private DrmSession f10722crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private float f10723czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final DecoderInputBuffer f10724dsvhmnatus;

    /* JADX INFO: renamed from: dvvnrvtcbc, reason: collision with root package name */
    private boolean f10725dvvnrvtcbc;

    /* JADX INFO: renamed from: eslsurpljm, reason: collision with root package name */
    private wkgbmnqykc f10726eslsurpljm;

    /* JADX INFO: renamed from: ezmngbhpjk, reason: collision with root package name */
    private boolean f10727ezmngbhpjk;

    /* JADX INFO: renamed from: fiwbwshyhd, reason: collision with root package name */
    private int f10728fiwbwshyhd;

    /* JADX INFO: renamed from: fmlbqenlif, reason: collision with root package name */
    private boolean f10729fmlbqenlif;

    /* JADX INFO: renamed from: fyldjkxazc, reason: collision with root package name */
    private boolean f10730fyldjkxazc;

    /* JADX INFO: renamed from: grlcpdaxtj, reason: collision with root package name */
    private long f10731grlcpdaxtj;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final nufgyqmvbu.zoijcleaow f10732hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final boolean f10733hkdspvbjdz;

    /* JADX INFO: renamed from: hszhottldk, reason: collision with root package name */
    private int f10734hszhottldk;

    /* JADX INFO: renamed from: igdgnonuha, reason: collision with root package name */
    private boolean f10735igdgnonuha;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private float f10736ikoacuggdj;

    /* JADX INFO: renamed from: ipoelvxyzq, reason: collision with root package name */
    private boolean f10737ipoelvxyzq;

    /* JADX INFO: renamed from: iwxlajgraz, reason: collision with root package name */
    private boolean f10738iwxlajgraz;

    /* JADX INFO: renamed from: ixidwrxhsl, reason: collision with root package name */
    private boolean f10739ixidwrxhsl;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private boolean f10740iyctptxqzt;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private long f10741jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private DrmSession f10742jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final draadjrbmk f10743jpowsppfya;

    /* JADX INFO: renamed from: jrbgnlbqoe, reason: collision with root package name */
    private boolean f10744jrbgnlbqoe;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private nufgyqmvbu f10745jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final gxszxtbevo f10746kegysxyocb;

    /* JADX INFO: renamed from: krqnebusok, reason: collision with root package name */
    private long f10747krqnebusok;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private long f10748lrnfpwlwnk;

    /* JADX INFO: renamed from: lxfrhoxuzk, reason: collision with root package name */
    private boolean f10749lxfrhoxuzk;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private final ArrayDeque f10750mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private MediaFormat f10751metgxyhuhe;

    /* JADX INFO: renamed from: mhtqkkgtqm, reason: collision with root package name */
    private long f10752mhtqkkgtqm;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private final wwaezpbzkn f10753ntlheqmsrt;

    /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
    private long f10754nuxfzjnpeb;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private boolean f10755oipsdeybqn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private float f10756okpsazkaxt;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private boolean f10757opjhrmiecq;

    /* JADX INFO: renamed from: rhgxfdycjh, reason: collision with root package name */
    private ExoPlaybackException f10758rhgxfdycjh;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private wizcaqwiak.iobyxmoadg f10759ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private boolean f10760rlfsiqarku;

    /* JADX INFO: renamed from: roivzttewh, reason: collision with root package name */
    private int f10761roivzttewh;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private int f10762sflfametgt;

    /* JADX INFO: renamed from: skhdrjzrfn, reason: collision with root package name */
    private boolean f10763skhdrjzrfn;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f10764sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final DecoderInputBuffer f10765stevsuqkhv;

    /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
    private int f10766tbqsvytpvh;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private final MediaCodec.BufferInfo f10767tzroggbefp;

    /* JADX INFO: renamed from: uawqvzlxes, reason: collision with root package name */
    private ByteBuffer f10768uawqvzlxes;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f10769ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private ArrayDeque f10770uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private MediaCrypto f10771vipkmwdibw;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private boolean f10772weqkydbzbr;

    /* JADX INFO: renamed from: wizcaqwiak, reason: collision with root package name */
    private int f10773wizcaqwiak;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final DecoderInputBuffer f10774wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f10775xrmfcynszj;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private btonecajqb f10776ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private DecoderInitializationException f10777yfnezrywwk;

    /* JADX INFO: renamed from: yzdjzghtvl, reason: collision with root package name */
    protected f3.zoijcleaow f10778yzdjzghtvl;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    private boolean f10779zeieaojujs;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private boolean f10780zfvoamnweg;

    private final class ppxfxbqfkf implements nufgyqmvbu.ppxfxbqfkf {
        private ppxfxbqfkf() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu.ppxfxbqfkf
        public void iobyxmoadg() {
            if (MediaCodecRenderer.this.f10759ribwqtqdhb != null) {
                MediaCodecRenderer.this.f10759ribwqtqdhb.zoijcleaow();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu.ppxfxbqfkf
        public void zoijcleaow() {
            if (MediaCodecRenderer.this.f10759ribwqtqdhb != null) {
                MediaCodecRenderer.this.f10759ribwqtqdhb.zoijcleaow();
            }
        }
    }

    private static final class wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final wkgbmnqykc f10787eablkybsjg = new wkgbmnqykc(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long f10788iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final long f10789ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final pkzmftpjix f10790wkgbmnqykc = new pkzmftpjix();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f10791zoijcleaow;

        public wkgbmnqykc(long j13, long j14, long j15) {
            this.f10788iobyxmoadg = j13;
            this.f10791zoijcleaow = j14;
            this.f10789ppxfxbqfkf = j15;
        }
    }

    private static final class zoijcleaow {
        public static void iobyxmoadg(nufgyqmvbu.iobyxmoadg iobyxmoadgVar, h0 h0Var) {
            LogSessionId logSessionIdIobyxmoadg = h0Var.iobyxmoadg();
            if (logSessionIdIobyxmoadg.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            iobyxmoadgVar.f10845zoijcleaow.setString("log-session-id", logSessionIdIobyxmoadg.getStringId());
        }
    }

    public MediaCodecRenderer(int i13, nufgyqmvbu.zoijcleaow zoijcleaowVar, draadjrbmk draadjrbmkVar, boolean z13, float f13) {
        super(i13);
        this.f10732hcddaimhww = zoijcleaowVar;
        this.f10743jpowsppfya = (draadjrbmk) y2.iobyxmoadg.eablkybsjg(draadjrbmkVar);
        this.f10733hkdspvbjdz = z13;
        this.f10721cllcsxoeiz = f13;
        this.f10724dsvhmnatus = DecoderInputBuffer.kcexrzcfyt();
        this.f10774wypolnanlu = new DecoderInputBuffer(0);
        this.f10765stevsuqkhv = new DecoderInputBuffer(2);
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
        this.f10746kegysxyocb = gxszxtbevoVar;
        this.f10767tzroggbefp = new MediaCodec.BufferInfo();
        this.f10736ikoacuggdj = 1.0f;
        this.f10756okpsazkaxt = 1.0f;
        this.f10741jhduphickx = -9223372036854775807L;
        this.f10750mbcevpiqjq = new ArrayDeque();
        this.f10726eslsurpljm = wkgbmnqykc.f10787eablkybsjg;
        gxszxtbevoVar.rgvfuqvkyq(0);
        gxszxtbevoVar.f10021iwizpuwonk.order(ByteOrder.nativeOrder());
        this.f10753ntlheqmsrt = new wwaezpbzkn();
        this.f10723czzsidtyhn = -1.0f;
        this.f10762sflfametgt = 0;
        this.f10773wizcaqwiak = 0;
        this.f10766tbqsvytpvh = -1;
        this.f10761roivzttewh = -1;
        this.f10754nuxfzjnpeb = -9223372036854775807L;
        this.f10731grlcpdaxtj = -9223372036854775807L;
        this.f10752mhtqkkgtqm = -9223372036854775807L;
        this.f10747krqnebusok = -9223372036854775807L;
        this.f10748lrnfpwlwnk = -9223372036854775807L;
        this.f10734hszhottldk = 0;
        this.f10728fiwbwshyhd = 0;
        this.f10778yzdjzghtvl = new f3.zoijcleaow();
    }

    private void E() throws ExoPlaybackException {
        int i13 = this.f10728fiwbwshyhd;
        if (i13 == 1) {
            ipoelvxyzq();
            return;
        }
        if (i13 == 2) {
            ipoelvxyzq();
            d0();
        } else if (i13 == 3) {
            I();
        } else {
            this.f10744jrbgnlbqoe = true;
            K();
        }
    }

    private void G() {
        this.f10737ipoelvxyzq = true;
        MediaFormat mediaFormatGxszxtbevo = ((nufgyqmvbu) y2.iobyxmoadg.eablkybsjg(this.f10745jztzpxfvev)).gxszxtbevo();
        if (this.f10762sflfametgt != 0 && mediaFormatGxszxtbevo.getInteger("width") == 32 && mediaFormatGxszxtbevo.getInteger("height") == 32) {
            this.f10740iyctptxqzt = true;
        } else {
            this.f10751metgxyhuhe = mediaFormatGxszxtbevo;
            this.f10760rlfsiqarku = true;
        }
    }

    private boolean H(int i13) throws ExoPlaybackException {
        lmojexxdyd lmojexxdydVarCrxdokpmqz = crxdokpmqz();
        this.f10724dsvhmnatus.gxszxtbevo();
        int iOpjhrmiecq = opjhrmiecq(lmojexxdydVarCrxdokpmqz, this.f10724dsvhmnatus, i13 | 4);
        if (iOpjhrmiecq == -5) {
            x(lmojexxdydVarCrxdokpmqz);
            return true;
        }
        if (iOpjhrmiecq != -4 || !this.f10724dsvhmnatus.dxjokdxxww()) {
            return false;
        }
        this.f10739ixidwrxhsl = true;
        E();
        return false;
    }

    private void I() throws ExoPlaybackException {
        J();
        r();
    }

    private void N() {
        this.f10766tbqsvytpvh = -1;
        this.f10774wypolnanlu.f10021iwizpuwonk = null;
    }

    private void O() {
        this.f10761roivzttewh = -1;
        this.f10768uawqvzlxes = null;
    }

    private void P(DrmSession drmSession) {
        DrmSession.ppxfxbqfkf(this.f10722crxdokpmqz, drmSession);
        this.f10722crxdokpmqz = drmSession;
    }

    private void Q(wkgbmnqykc wkgbmnqykcVar) {
        this.f10726eslsurpljm = wkgbmnqykcVar;
        long j13 = wkgbmnqykcVar.f10789ppxfxbqfkf;
        if (j13 != -9223372036854775807L) {
            this.f10716a = true;
            z(j13);
        }
    }

    private void T(DrmSession drmSession) {
        DrmSession.ppxfxbqfkf(this.f10742jlmebxxoox, drmSession);
        this.f10742jlmebxxoox = drmSession;
    }

    private boolean U(long j13) {
        return this.f10741jhduphickx == -9223372036854775807L || ulzqkzuiru().elapsedRealtime() - j13 < this.f10741jhduphickx;
    }

    private boolean ageimvtcrz(btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, DrmSession drmSession, DrmSession drmSession2) {
        e3.zoijcleaow zoijcleaowVarEablkybsjg;
        e3.zoijcleaow zoijcleaowVarEablkybsjg2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (zoijcleaowVarEablkybsjg = drmSession2.eablkybsjg()) != null && (zoijcleaowVarEablkybsjg2 = drmSession.eablkybsjg()) != null && zoijcleaowVarEablkybsjg.getClass().equals(zoijcleaowVarEablkybsjg2.getClass())) {
            if (!(zoijcleaowVarEablkybsjg instanceof i3.draadjrbmk)) {
                return false;
            }
            if (!drmSession2.iobyxmoadg().equals(drmSession.iobyxmoadg()) || stevsuqkhv.f123602iobyxmoadg < 23) {
                return true;
            }
            UUID uuid = v2.nufgyqmvbu.f115644eablkybsjg;
            if (!uuid.equals(drmSession.iobyxmoadg()) && !uuid.equals(drmSession2.iobyxmoadg())) {
                if (btonecajqbVar.f10807lqeggnwhkg) {
                    return false;
                }
                return drmSession2.getState() == 2 || ((drmSession2.getState() == 3 || drmSession2.getState() == 4) && drmSession2.dxjokdxxww((String) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar.f9769ojitshcjhn)));
            }
        }
        return true;
    }

    private static boolean auzgnhcxok(String str) {
        return stevsuqkhv.f123602iobyxmoadg == 21 && "OMX.google.aac.decoder".equals(str);
    }

    protected static boolean b0(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadgVar.f9747cllcsxoeiz;
        return i13 == 0 || i13 == 2;
    }

    private boolean c0(androidx.media3.common.iobyxmoadg iobyxmoadgVar) throws ExoPlaybackException {
        if (stevsuqkhv.f123602iobyxmoadg >= 23 && this.f10745jztzpxfvev != null && this.f10728fiwbwshyhd != 3 && getState() != 0) {
            float fYzdjzghtvl = yzdjzghtvl(this.f10756okpsazkaxt, (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar), jhduphickx());
            float f13 = this.f10723czzsidtyhn;
            if (f13 == fYzdjzghtvl) {
                return true;
            }
            if (fYzdjzghtvl == -1.0f) {
                wizcaqwiak();
                return false;
            }
            if (f13 == -1.0f && fYzdjzghtvl <= this.f10721cllcsxoeiz) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fYzdjzghtvl);
            ((nufgyqmvbu) y2.iobyxmoadg.eablkybsjg(this.f10745jztzpxfvev)).ppxfxbqfkf(bundle);
            this.f10723czzsidtyhn = fYzdjzghtvl;
        }
        return true;
    }

    private void d0() throws ExoPlaybackException {
        e3.zoijcleaow zoijcleaowVarEablkybsjg = ((DrmSession) y2.iobyxmoadg.eablkybsjg(this.f10742jlmebxxoox)).eablkybsjg();
        if (zoijcleaowVarEablkybsjg instanceof i3.draadjrbmk) {
            try {
                ((MediaCrypto) y2.iobyxmoadg.eablkybsjg(this.f10771vipkmwdibw)).setMediaDrmSession(((i3.draadjrbmk) zoijcleaowVarEablkybsjg).f41824zoijcleaow);
            } catch (MediaCryptoException e13) {
                throw mbcevpiqjq(e13, this.f10769ulzqkzuiru, 6006);
            }
        }
        P(this.f10742jlmebxxoox);
        this.f10734hszhottldk = 0;
        this.f10728fiwbwshyhd = 0;
    }

    private static boolean dvvnrvtcbc(String str) {
        return stevsuqkhv.f123602iobyxmoadg == 29 && "c2.android.aac.decoder".equals(str);
    }

    private boolean fiwbwshyhd(long j13, long j14) throws ExoPlaybackException {
        boolean z13;
        boolean zF;
        int iAgtfadlqog;
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) y2.iobyxmoadg.eablkybsjg(this.f10745jztzpxfvev);
        if (!i()) {
            if (this.f10720bfopjjpdmp && this.f10730fyldjkxazc) {
                try {
                    iAgtfadlqog = nufgyqmvbuVar.agtfadlqog(this.f10767tzroggbefp);
                } catch (IllegalStateException unused) {
                    E();
                    if (this.f10744jrbgnlbqoe) {
                        J();
                    }
                    return false;
                }
            } else {
                iAgtfadlqog = nufgyqmvbuVar.agtfadlqog(this.f10767tzroggbefp);
            }
            if (iAgtfadlqog < 0) {
                if (iAgtfadlqog == -2) {
                    G();
                    return true;
                }
                if (this.f10772weqkydbzbr && (this.f10739ixidwrxhsl || this.f10734hszhottldk == 2)) {
                    E();
                }
                long j15 = this.f10748lrnfpwlwnk;
                if (j15 != -9223372036854775807L && j15 + 100 < ulzqkzuiru().currentTimeMillis()) {
                    E();
                }
                return false;
            }
            if (this.f10740iyctptxqzt) {
                this.f10740iyctptxqzt = false;
                nufgyqmvbuVar.ojitshcjhn(iAgtfadlqog, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f10767tzroggbefp;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                E();
                return false;
            }
            this.f10761roivzttewh = iAgtfadlqog;
            ByteBuffer byteBufferRgvfuqvkyq = nufgyqmvbuVar.rgvfuqvkyq(iAgtfadlqog);
            this.f10768uawqvzlxes = byteBufferRgvfuqvkyq;
            if (byteBufferRgvfuqvkyq != null) {
                byteBufferRgvfuqvkyq.position(this.f10767tzroggbefp.offset);
                ByteBuffer byteBuffer = this.f10768uawqvzlxes;
                MediaCodec.BufferInfo bufferInfo2 = this.f10767tzroggbefp;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.f10718auzgnhcxok = this.f10767tzroggbefp.presentationTimeUs < ribwqtqdhb();
            long j16 = this.f10752mhtqkkgtqm;
            this.f10738iwxlajgraz = j16 != -9223372036854775807L && j16 <= this.f10767tzroggbefp.presentationTimeUs;
            e0(this.f10767tzroggbefp.presentationTimeUs);
        }
        if (this.f10720bfopjjpdmp && this.f10730fyldjkxazc) {
            try {
                ByteBuffer byteBuffer2 = this.f10768uawqvzlxes;
                int i13 = this.f10761roivzttewh;
                MediaCodec.BufferInfo bufferInfo3 = this.f10767tzroggbefp;
                z13 = false;
                try {
                    zF = F(j13, j14, nufgyqmvbuVar, byteBuffer2, i13, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, this.f10718auzgnhcxok, this.f10738iwxlajgraz, (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10764sopmlzcsov));
                } catch (IllegalStateException unused2) {
                    E();
                    if (this.f10744jrbgnlbqoe) {
                        J();
                    }
                    return z13;
                }
            } catch (IllegalStateException unused3) {
                z13 = false;
            }
        } else {
            z13 = false;
            ByteBuffer byteBuffer3 = this.f10768uawqvzlxes;
            int i14 = this.f10761roivzttewh;
            MediaCodec.BufferInfo bufferInfo4 = this.f10767tzroggbefp;
            zF = F(j13, j14, nufgyqmvbuVar, byteBuffer3, i14, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f10718auzgnhcxok, this.f10738iwxlajgraz, (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10764sopmlzcsov));
        }
        if (zF) {
            A(this.f10767tzroggbefp.presentationTimeUs);
            boolean z14 = (this.f10767tzroggbefp.flags & 4) != 0 ? true : z13;
            if (!z14 && this.f10730fyldjkxazc && this.f10738iwxlajgraz) {
                this.f10748lrnfpwlwnk = ulzqkzuiru().currentTimeMillis();
            }
            O();
            if (!z14) {
                return true;
            }
            E();
        }
        return z13;
    }

    private boolean fyldjkxazc() throws ExoPlaybackException {
        int i13;
        if (this.f10745jztzpxfvev == null || (i13 = this.f10734hszhottldk) == 2 || this.f10739ixidwrxhsl) {
            return false;
        }
        if (i13 == 0 && X()) {
            wizcaqwiak();
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) y2.iobyxmoadg.eablkybsjg(this.f10745jztzpxfvev);
        if (this.f10766tbqsvytpvh < 0) {
            int iWflxmlrfwp = nufgyqmvbuVar.wflxmlrfwp();
            this.f10766tbqsvytpvh = iWflxmlrfwp;
            if (iWflxmlrfwp < 0) {
                return false;
            }
            this.f10774wypolnanlu.f10021iwizpuwonk = nufgyqmvbuVar.dxjokdxxww(iWflxmlrfwp);
            this.f10774wypolnanlu.gxszxtbevo();
        }
        if (this.f10734hszhottldk == 1) {
            if (!this.f10772weqkydbzbr) {
                this.f10730fyldjkxazc = true;
                nufgyqmvbuVar.zoijcleaow(this.f10766tbqsvytpvh, 0, 0, 0L, 4);
                N();
            }
            this.f10734hszhottldk = 2;
            return false;
        }
        if (this.f10757opjhrmiecq) {
            this.f10757opjhrmiecq = false;
            ByteBuffer byteBuffer = (ByteBuffer) y2.iobyxmoadg.eablkybsjg(this.f10774wypolnanlu.f10021iwizpuwonk);
            byte[] bArr = f10715c;
            byteBuffer.put(bArr);
            nufgyqmvbuVar.zoijcleaow(this.f10766tbqsvytpvh, 0, bArr.length, 0L, 0);
            N();
            this.f10717ageimvtcrz = true;
            return true;
        }
        if (this.f10773wizcaqwiak == 1) {
            for (int i14 = 0; i14 < ((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10775xrmfcynszj)).f9770oxmwwwfdhm.size(); i14++) {
                ((ByteBuffer) y2.iobyxmoadg.eablkybsjg(this.f10774wypolnanlu.f10021iwizpuwonk)).put((byte[]) this.f10775xrmfcynszj.f9770oxmwwwfdhm.get(i14));
            }
            this.f10773wizcaqwiak = 2;
        }
        int iPosition = ((ByteBuffer) y2.iobyxmoadg.eablkybsjg(this.f10774wypolnanlu.f10021iwizpuwonk)).position();
        lmojexxdyd lmojexxdydVarCrxdokpmqz = crxdokpmqz();
        try {
            int iOpjhrmiecq = opjhrmiecq(lmojexxdydVarCrxdokpmqz, this.f10774wypolnanlu, 0);
            if (iOpjhrmiecq == -3) {
                if (wflxmlrfwp()) {
                    this.f10752mhtqkkgtqm = this.f10731grlcpdaxtj;
                }
                return false;
            }
            if (iOpjhrmiecq == -5) {
                if (this.f10773wizcaqwiak == 2) {
                    this.f10774wypolnanlu.gxszxtbevo();
                    this.f10773wizcaqwiak = 1;
                }
                x(lmojexxdydVarCrxdokpmqz);
                return true;
            }
            if (this.f10774wypolnanlu.dxjokdxxww()) {
                this.f10752mhtqkkgtqm = this.f10731grlcpdaxtj;
                if (this.f10773wizcaqwiak == 2) {
                    this.f10774wypolnanlu.gxszxtbevo();
                    this.f10773wizcaqwiak = 1;
                }
                this.f10739ixidwrxhsl = true;
                if (!this.f10717ageimvtcrz) {
                    E();
                    return false;
                }
                if (!this.f10772weqkydbzbr) {
                    this.f10730fyldjkxazc = true;
                    nufgyqmvbuVar.zoijcleaow(this.f10766tbqsvytpvh, 0, 0, 0L, 4);
                    N();
                }
                return false;
            }
            if (!this.f10717ageimvtcrz && !this.f10774wypolnanlu.gtknphoqwx()) {
                this.f10774wypolnanlu.gxszxtbevo();
                if (this.f10773wizcaqwiak == 2) {
                    this.f10773wizcaqwiak = 1;
                }
                return true;
            }
            if (V(this.f10774wypolnanlu)) {
                return true;
            }
            boolean zOxmwwwfdhm = this.f10774wypolnanlu.oxmwwwfdhm();
            if (zOxmwwwfdhm) {
                this.f10774wypolnanlu.f10022jyumaefscl.zoijcleaow(iPosition);
            }
            long j13 = this.f10774wypolnanlu.f10020esjtqupxsv;
            if (this.f10729fmlbqenlif) {
                if (this.f10750mbcevpiqjq.isEmpty()) {
                    this.f10726eslsurpljm.f10790wkgbmnqykc.iobyxmoadg(j13, (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10769ulzqkzuiru));
                } else {
                    ((wkgbmnqykc) this.f10750mbcevpiqjq.peekLast()).f10790wkgbmnqykc.iobyxmoadg(j13, (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10769ulzqkzuiru));
                }
                this.f10729fmlbqenlif = false;
            }
            this.f10731grlcpdaxtj = Math.max(this.f10731grlcpdaxtj, j13);
            if (wflxmlrfwp() || this.f10774wypolnanlu.draadjrbmk()) {
                this.f10752mhtqkkgtqm = this.f10731grlcpdaxtj;
            }
            this.f10774wypolnanlu.vdvldrhtss();
            if (this.f10774wypolnanlu.nufgyqmvbu()) {
                h(this.f10774wypolnanlu);
            }
            C(this.f10774wypolnanlu);
            int iFmlbqenlif = fmlbqenlif(this.f10774wypolnanlu);
            if (zOxmwwwfdhm) {
                ((nufgyqmvbu) y2.iobyxmoadg.eablkybsjg(nufgyqmvbuVar)).iobyxmoadg(this.f10766tbqsvytpvh, 0, this.f10774wypolnanlu.f10022jyumaefscl, j13, iFmlbqenlif);
            } else {
                ((nufgyqmvbu) y2.iobyxmoadg.eablkybsjg(nufgyqmvbuVar)).zoijcleaow(this.f10766tbqsvytpvh, 0, ((ByteBuffer) y2.iobyxmoadg.eablkybsjg(this.f10774wypolnanlu.f10021iwizpuwonk)).limit(), j13, iFmlbqenlif);
            }
            N();
            this.f10717ageimvtcrz = true;
            this.f10773wizcaqwiak = 0;
            this.f10778yzdjzghtvl.f32713ppxfxbqfkf++;
            return true;
        } catch (DecoderInputBuffer.InsufficientCapacityException e13) {
            u(e13);
            H(0);
            ipoelvxyzq();
            return true;
        }
    }

    private boolean hszhottldk() throws ExoPlaybackException {
        if (this.f10717ageimvtcrz) {
            this.f10734hszhottldk = 1;
            if (this.f10755oipsdeybqn) {
                this.f10728fiwbwshyhd = 3;
                return false;
            }
            this.f10728fiwbwshyhd = 2;
        } else {
            d0();
        }
        return true;
    }

    private boolean i() {
        return this.f10761roivzttewh >= 0;
    }

    private void igdgnonuha() {
        this.f10735igdgnonuha = false;
        this.f10746kegysxyocb.gxszxtbevo();
        this.f10765stevsuqkhv.gxszxtbevo();
        this.f10763skhdrjzrfn = false;
        this.f10725dvvnrvtcbc = false;
        this.f10753ntlheqmsrt.wkgbmnqykc();
    }

    private void ipoelvxyzq() {
        try {
            ((nufgyqmvbu) y2.iobyxmoadg.dxjokdxxww(this.f10745jztzpxfvev)).flush();
        } finally {
            L();
        }
    }

    private static boolean iwxlajgraz(btonecajqb btonecajqbVar) {
        String str = btonecajqbVar.f10806iobyxmoadg;
        int i13 = stevsuqkhv.f123602iobyxmoadg;
        return (i13 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i13 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && btonecajqbVar.f10807lqeggnwhkg);
    }

    private List ixidwrxhsl(boolean z13) {
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10769ulzqkzuiru);
        List listKrqnebusok = krqnebusok(this.f10743jpowsppfya, iobyxmoadgVar, z13);
        if (listKrqnebusok.isEmpty() && z13) {
            listKrqnebusok = krqnebusok(this.f10743jpowsppfya, iobyxmoadgVar, false);
            if (!listKrqnebusok.isEmpty()) {
                kcexrzcfyt.nufgyqmvbu("MediaCodecRenderer", "Drm session requires secure decoder for " + iobyxmoadgVar.f9769ojitshcjhn + ", but no secure decoder available. Trying to proceed with " + listKrqnebusok + ".");
            }
        }
        return listKrqnebusok;
    }

    private boolean j() {
        if (!this.f10746kegysxyocb.pmvmpeiblj()) {
            return true;
        }
        long jRibwqtqdhb = ribwqtqdhb();
        return p(jRibwqtqdhb, this.f10746kegysxyocb.esjtqupxsv()) == p(jRibwqtqdhb, this.f10765stevsuqkhv.f10020esjtqupxsv);
    }

    private void k(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        igdgnonuha();
        String str = iobyxmoadgVar.f9769ojitshcjhn;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f10746kegysxyocb.zynmafqrjb(32);
        } else {
            this.f10746kegysxyocb.zynmafqrjb(1);
        }
        this.f10725dvvnrvtcbc = true;
    }

    private void l(btonecajqb btonecajqbVar, MediaCrypto mediaCrypto) {
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10769ulzqkzuiru);
        String str = btonecajqbVar.f10806iobyxmoadg;
        int i13 = stevsuqkhv.f123602iobyxmoadg;
        float fYzdjzghtvl = i13 < 23 ? -1.0f : yzdjzghtvl(this.f10756okpsazkaxt, iobyxmoadgVar, jhduphickx());
        float f13 = fYzdjzghtvl > this.f10721cllcsxoeiz ? fYzdjzghtvl : -1.0f;
        long jElapsedRealtime = ulzqkzuiru().elapsedRealtime();
        nufgyqmvbu.iobyxmoadg iobyxmoadgVarC = c(btonecajqbVar, iobyxmoadgVar, mediaCrypto, f13);
        if (i13 >= 31) {
            zoijcleaow.iobyxmoadg(iobyxmoadgVarC, vipkmwdibw());
        }
        try {
            jpowsppfya.iobyxmoadg("createCodec:" + str);
            nufgyqmvbu nufgyqmvbuVarZoijcleaow = this.f10732hcddaimhww.zoijcleaow(iobyxmoadgVarC);
            this.f10745jztzpxfvev = nufgyqmvbuVarZoijcleaow;
            this.f10779zeieaojujs = nufgyqmvbuVarZoijcleaow.wkgbmnqykc(new ppxfxbqfkf());
            jpowsppfya.zoijcleaow();
            long jElapsedRealtime2 = ulzqkzuiru().elapsedRealtime();
            if (!btonecajqbVar.ojitshcjhn(iobyxmoadgVar)) {
                kcexrzcfyt.nufgyqmvbu("MediaCodecRenderer", stevsuqkhv.iozdgvuglv("Format exceeds selected codec's capabilities [%s, %s]", androidx.media3.common.iobyxmoadg.dxjokdxxww(iobyxmoadgVar), str));
            }
            this.f10776ydmasvzmpa = btonecajqbVar;
            this.f10723czzsidtyhn = f13;
            this.f10775xrmfcynszj = iobyxmoadgVar;
            this.f10762sflfametgt = roivzttewh(str);
            this.f10780zfvoamnweg = dvvnrvtcbc(str);
            this.f10755oipsdeybqn = uawqvzlxes(str);
            this.f10720bfopjjpdmp = auzgnhcxok(str);
            this.f10772weqkydbzbr = iwxlajgraz(btonecajqbVar) || rhgxfdycjh();
            if (((nufgyqmvbu) y2.iobyxmoadg.eablkybsjg(this.f10745jztzpxfvev)).gtknphoqwx()) {
                this.f10749lxfrhoxuzk = true;
                this.f10773wizcaqwiak = 1;
                this.f10757opjhrmiecq = this.f10762sflfametgt != 0;
            }
            if (getState() == 2) {
                this.f10754nuxfzjnpeb = ulzqkzuiru().elapsedRealtime() + 1000;
            }
            this.f10778yzdjzghtvl.f32710iobyxmoadg++;
            v(str, iobyxmoadgVarC, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th2) {
            jpowsppfya.zoijcleaow();
            throw th2;
        }
    }

    private boolean lxfrhoxuzk() {
        if (this.f10717ageimvtcrz) {
            this.f10734hszhottldk = 1;
            if (this.f10755oipsdeybqn) {
                this.f10728fiwbwshyhd = 3;
                return false;
            }
            this.f10728fiwbwshyhd = 1;
        }
        return true;
    }

    private boolean m() throws ExoPlaybackException {
        y2.iobyxmoadg.lqeggnwhkg(this.f10771vipkmwdibw == null);
        DrmSession drmSession = this.f10722crxdokpmqz;
        e3.zoijcleaow zoijcleaowVarEablkybsjg = drmSession.eablkybsjg();
        if (i3.draadjrbmk.f41821wkgbmnqykc && (zoijcleaowVarEablkybsjg instanceof i3.draadjrbmk)) {
            int state = drmSession.getState();
            if (state == 1) {
                DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) y2.iobyxmoadg.eablkybsjg(drmSession.wkgbmnqykc());
                throw mbcevpiqjq(drmSessionException, this.f10769ulzqkzuiru, drmSessionException.f10447zdlpuopuiu);
            }
            if (state != 4) {
                return false;
            }
        }
        if (zoijcleaowVarEablkybsjg == null) {
            return drmSession.wkgbmnqykc() != null;
        }
        if (zoijcleaowVarEablkybsjg instanceof i3.draadjrbmk) {
            i3.draadjrbmk draadjrbmkVar = (i3.draadjrbmk) zoijcleaowVarEablkybsjg;
            try {
                this.f10771vipkmwdibw = new MediaCrypto(draadjrbmkVar.f41822iobyxmoadg, draadjrbmkVar.f41824zoijcleaow);
            } catch (MediaCryptoException e13) {
                throw mbcevpiqjq(e13, this.f10769ulzqkzuiru, 6006);
            }
        }
        return true;
    }

    private boolean nuxfzjnpeb(long j13, long j14) throws ExoPlaybackException {
        boolean z13;
        y2.iobyxmoadg.lqeggnwhkg(!this.f10744jrbgnlbqoe);
        if (this.f10746kegysxyocb.pmvmpeiblj()) {
            gxszxtbevo gxszxtbevoVar = this.f10746kegysxyocb;
            if (!F(j13, j14, null, gxszxtbevoVar.f10021iwizpuwonk, this.f10761roivzttewh, 0, gxszxtbevoVar.lereixgezr(), this.f10746kegysxyocb.cqumvgiudr(), p(ribwqtqdhb(), this.f10746kegysxyocb.esjtqupxsv()), this.f10746kegysxyocb.dxjokdxxww(), (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10764sopmlzcsov))) {
                return false;
            }
            A(this.f10746kegysxyocb.esjtqupxsv());
            this.f10746kegysxyocb.gxszxtbevo();
            z13 = false;
        } else {
            z13 = false;
        }
        if (this.f10739ixidwrxhsl) {
            this.f10744jrbgnlbqoe = true;
            return z13;
        }
        if (this.f10763skhdrjzrfn) {
            y2.iobyxmoadg.lqeggnwhkg(this.f10746kegysxyocb.jyumaefscl(this.f10765stevsuqkhv));
            this.f10763skhdrjzrfn = z13;
        }
        if (this.f10735igdgnonuha) {
            if (this.f10746kegysxyocb.pmvmpeiblj()) {
                return true;
            }
            igdgnonuha();
            this.f10735igdgnonuha = z13;
            r();
            if (!this.f10725dvvnrvtcbc) {
                return z13;
            }
        }
        zeieaojujs();
        if (this.f10746kegysxyocb.pmvmpeiblj()) {
            this.f10746kegysxyocb.vdvldrhtss();
        }
        if (this.f10746kegysxyocb.pmvmpeiblj() || this.f10739ixidwrxhsl || this.f10735igdgnonuha) {
            return true;
        }
        return z13;
    }

    private boolean p(long j13, long j14) {
        androidx.media3.common.iobyxmoadg iobyxmoadgVar;
        return j14 < j13 && !((iobyxmoadgVar = this.f10764sopmlzcsov) != null && Objects.equals(iobyxmoadgVar.f9769ojitshcjhn, "audio/opus") && t3.wwaezpbzkn.lqeggnwhkg(j13, j14));
    }

    private static boolean q(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private int roivzttewh(String str) {
        int i13 = stevsuqkhv.f123602iobyxmoadg;
        if (i13 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Build.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i13 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = Build.DEVICE;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private void s(MediaCrypto mediaCrypto, boolean z13) throws DecoderInitializationException {
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10769ulzqkzuiru);
        if (this.f10770uwvvkdfqfp == null) {
            try {
                List listIxidwrxhsl = ixidwrxhsl(z13);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f10770uwvvkdfqfp = arrayDeque;
                if (this.f10733hkdspvbjdz) {
                    arrayDeque.addAll(listIxidwrxhsl);
                } else if (!listIxidwrxhsl.isEmpty()) {
                    this.f10770uwvvkdfqfp.add((btonecajqb) listIxidwrxhsl.get(0));
                }
                this.f10777yfnezrywwk = null;
            } catch (MediaCodecUtil.DecoderQueryException e13) {
                throw new DecoderInitializationException(iobyxmoadgVar, e13, z13, -49998);
            }
        }
        if (this.f10770uwvvkdfqfp.isEmpty()) {
            throw new DecoderInitializationException(iobyxmoadgVar, (Throwable) null, z13, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) y2.iobyxmoadg.eablkybsjg(this.f10770uwvvkdfqfp);
        while (this.f10745jztzpxfvev == null) {
            btonecajqb btonecajqbVar = (btonecajqb) y2.iobyxmoadg.eablkybsjg((btonecajqb) arrayDeque2.peekFirst());
            if (!t(iobyxmoadgVar) || !W(btonecajqbVar)) {
                return;
            }
            try {
                l(btonecajqbVar, mediaCrypto);
            } catch (Exception e14) {
                kcexrzcfyt.dxjokdxxww("MediaCodecRenderer", "Failed to initialize decoder: " + btonecajqbVar, e14);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(iobyxmoadgVar, e14, z13, btonecajqbVar);
                u(decoderInitializationException);
                if (this.f10777yfnezrywwk == null) {
                    this.f10777yfnezrywwk = decoderInitializationException;
                } else {
                    this.f10777yfnezrywwk = this.f10777yfnezrywwk.lqeggnwhkg(decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f10777yfnezrywwk;
                }
            }
        }
        this.f10770uwvvkdfqfp = null;
    }

    private static boolean uawqvzlxes(String str) {
        return stevsuqkhv.f123602iobyxmoadg <= 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    private void wizcaqwiak() throws ExoPlaybackException {
        if (!this.f10717ageimvtcrz) {
            I();
        } else {
            this.f10734hszhottldk = 1;
            this.f10728fiwbwshyhd = 3;
        }
    }

    private void zeieaojujs() throws ExoPlaybackException {
        y2.iobyxmoadg.lqeggnwhkg(!this.f10739ixidwrxhsl);
        lmojexxdyd lmojexxdydVarCrxdokpmqz = crxdokpmqz();
        this.f10765stevsuqkhv.gxszxtbevo();
        do {
            this.f10765stevsuqkhv.gxszxtbevo();
            int iOpjhrmiecq = opjhrmiecq(lmojexxdydVarCrxdokpmqz, this.f10765stevsuqkhv, 0);
            if (iOpjhrmiecq == -5) {
                x(lmojexxdydVarCrxdokpmqz);
                return;
            }
            if (iOpjhrmiecq == -4) {
                if (!this.f10765stevsuqkhv.dxjokdxxww()) {
                    this.f10731grlcpdaxtj = Math.max(this.f10731grlcpdaxtj, this.f10765stevsuqkhv.f10020esjtqupxsv);
                    if (wflxmlrfwp() || this.f10774wypolnanlu.draadjrbmk()) {
                        this.f10752mhtqkkgtqm = this.f10731grlcpdaxtj;
                    }
                    if (this.f10729fmlbqenlif) {
                        androidx.media3.common.iobyxmoadg iobyxmoadgVar = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10769ulzqkzuiru);
                        this.f10764sopmlzcsov = iobyxmoadgVar;
                        if (Objects.equals(iobyxmoadgVar.f9769ojitshcjhn, "audio/opus") && !this.f10764sopmlzcsov.f9770oxmwwwfdhm.isEmpty()) {
                            this.f10764sopmlzcsov = this.f10764sopmlzcsov.zoijcleaow().ribwqtqdhb(t3.wwaezpbzkn.gxszxtbevo((byte[]) this.f10764sopmlzcsov.f9770oxmwwwfdhm.get(0))).cllcsxoeiz();
                        }
                        y(this.f10764sopmlzcsov, null);
                        this.f10729fmlbqenlif = false;
                    }
                    this.f10765stevsuqkhv.vdvldrhtss();
                    androidx.media3.common.iobyxmoadg iobyxmoadgVar2 = this.f10764sopmlzcsov;
                    if (iobyxmoadgVar2 != null && Objects.equals(iobyxmoadgVar2.f9769ojitshcjhn, "audio/opus")) {
                        if (this.f10765stevsuqkhv.nufgyqmvbu()) {
                            DecoderInputBuffer decoderInputBuffer = this.f10765stevsuqkhv;
                            decoderInputBuffer.f10025yggfygwlhe = this.f10764sopmlzcsov;
                            h(decoderInputBuffer);
                        }
                        if (t3.wwaezpbzkn.lqeggnwhkg(ribwqtqdhb(), this.f10765stevsuqkhv.f10020esjtqupxsv)) {
                            this.f10753ntlheqmsrt.iobyxmoadg(this.f10765stevsuqkhv, this.f10764sopmlzcsov.f9770oxmwwwfdhm);
                        }
                    }
                    if (!j()) {
                        break;
                    }
                } else {
                    this.f10739ixidwrxhsl = true;
                    this.f10752mhtqkkgtqm = this.f10731grlcpdaxtj;
                    return;
                }
            } else {
                if (iOpjhrmiecq != -3) {
                    throw new IllegalStateException();
                }
                if (wflxmlrfwp()) {
                    this.f10752mhtqkkgtqm = this.f10731grlcpdaxtj;
                    return;
                }
                return;
            }
        } while (this.f10746kegysxyocb.jyumaefscl(this.f10765stevsuqkhv));
        this.f10763skhdrjzrfn = true;
    }

    protected void A(long j13) {
        this.f10747krqnebusok = j13;
        while (!this.f10750mbcevpiqjq.isEmpty() && j13 >= ((wkgbmnqykc) this.f10750mbcevpiqjq.peek()).f10788iobyxmoadg) {
            Q((wkgbmnqykc) y2.iobyxmoadg.eablkybsjg((wkgbmnqykc) this.f10750mbcevpiqjq.poll()));
            B();
        }
    }

    protected void B() {
    }

    protected void C(DecoderInputBuffer decoderInputBuffer) {
    }

    protected void D(wizcaqwiak.iobyxmoadg iobyxmoadgVar) {
    }

    protected abstract boolean F(long j13, long j14, nufgyqmvbu nufgyqmvbuVar, ByteBuffer byteBuffer, int i13, int i14, int i15, long j15, boolean z13, boolean z14, androidx.media3.common.iobyxmoadg iobyxmoadgVar);

    /* JADX WARN: Multi-variable type inference failed */
    protected void J() {
        try {
            nufgyqmvbu nufgyqmvbuVar = this.f10745jztzpxfvev;
            if (nufgyqmvbuVar != null) {
                nufgyqmvbuVar.release();
                this.f10778yzdjzghtvl.f32715zoijcleaow++;
                w(((btonecajqb) y2.iobyxmoadg.eablkybsjg(this.f10776ydmasvzmpa)).f10806iobyxmoadg);
            }
            this.f10745jztzpxfvev = null;
            try {
                MediaCrypto mediaCrypto = this.f10771vipkmwdibw;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f10771vipkmwdibw = null;
                P(null);
                M();
            }
        } catch (Throwable th2) {
            this.f10745jztzpxfvev = null;
            try {
                MediaCrypto mediaCrypto2 = this.f10771vipkmwdibw;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.f10771vipkmwdibw = null;
                P(null);
                M();
            }
        }
    }

    protected abstract void K();

    protected void L() {
        N();
        O();
        this.f10754nuxfzjnpeb = -9223372036854775807L;
        this.f10730fyldjkxazc = false;
        this.f10748lrnfpwlwnk = -9223372036854775807L;
        this.f10717ageimvtcrz = false;
        this.f10757opjhrmiecq = false;
        this.f10740iyctptxqzt = false;
        this.f10718auzgnhcxok = false;
        this.f10738iwxlajgraz = false;
        this.f10731grlcpdaxtj = -9223372036854775807L;
        this.f10752mhtqkkgtqm = -9223372036854775807L;
        this.f10747krqnebusok = -9223372036854775807L;
        this.f10734hszhottldk = 0;
        this.f10728fiwbwshyhd = 0;
        this.f10773wizcaqwiak = this.f10749lxfrhoxuzk ? 1 : 0;
    }

    protected void M() {
        L();
        this.f10758rhgxfdycjh = null;
        this.f10770uwvvkdfqfp = null;
        this.f10776ydmasvzmpa = null;
        this.f10775xrmfcynszj = null;
        this.f10751metgxyhuhe = null;
        this.f10760rlfsiqarku = false;
        this.f10737ipoelvxyzq = false;
        this.f10723czzsidtyhn = -1.0f;
        this.f10762sflfametgt = 0;
        this.f10780zfvoamnweg = false;
        this.f10755oipsdeybqn = false;
        this.f10720bfopjjpdmp = false;
        this.f10772weqkydbzbr = false;
        this.f10779zeieaojujs = false;
        this.f10749lxfrhoxuzk = false;
        this.f10773wizcaqwiak = 0;
    }

    protected final void R() {
        this.f10727ezmngbhpjk = true;
    }

    protected final void S(ExoPlaybackException exoPlaybackException) {
        this.f10758rhgxfdycjh = exoPlaybackException;
    }

    protected boolean V(DecoderInputBuffer decoderInputBuffer) {
        if (!Y(decoderInputBuffer)) {
            return false;
        }
        decoderInputBuffer.gxszxtbevo();
        this.f10778yzdjzghtvl.f32714wkgbmnqykc++;
        return true;
    }

    protected boolean W(btonecajqb btonecajqbVar) {
        return true;
    }

    protected boolean X() {
        return false;
    }

    protected boolean Y(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    protected boolean Z(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return false;
    }

    protected long a(long j13, long j14, boolean z13) {
        return super.iozdgvuglv(j13, j14);
    }

    protected abstract int a0(draadjrbmk draadjrbmkVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar);

    protected long b() {
        return this.f10752mhtqkkgtqm;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public void btonecajqb(long j13, long j14) throws ExoPlaybackException {
        boolean z13 = false;
        if (this.f10727ezmngbhpjk) {
            this.f10727ezmngbhpjk = false;
            E();
        }
        ExoPlaybackException exoPlaybackException = this.f10758rhgxfdycjh;
        if (exoPlaybackException != null) {
            this.f10758rhgxfdycjh = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f10744jrbgnlbqoe) {
                K();
                return;
            }
            if (this.f10769ulzqkzuiru != null || H(2)) {
                r();
                if (this.f10725dvvnrvtcbc) {
                    jpowsppfya.iobyxmoadg("bypassRender");
                    while (nuxfzjnpeb(j13, j14)) {
                    }
                    jpowsppfya.zoijcleaow();
                } else if (this.f10745jztzpxfvev != null) {
                    long jElapsedRealtime = ulzqkzuiru().elapsedRealtime();
                    jpowsppfya.iobyxmoadg("drainAndFeed");
                    while (fiwbwshyhd(j13, j14) && U(jElapsedRealtime)) {
                    }
                    while (fyldjkxazc() && U(jElapsedRealtime)) {
                    }
                    jpowsppfya.zoijcleaow();
                } else {
                    this.f10778yzdjzghtvl.f32714wkgbmnqykc += weqkydbzbr(j13);
                    H(1);
                }
                this.f10778yzdjzghtvl.ppxfxbqfkf();
            }
        } catch (MediaCodec.CryptoException e13) {
            throw mbcevpiqjq(e13, this.f10769ulzqkzuiru, stevsuqkhv.crxdokpmqz(e13.getErrorCode()));
        } catch (IllegalStateException e14) {
            if (!q(e14)) {
                throw e14;
            }
            u(e14);
            if ((e14 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e14).isRecoverable()) {
                z13 = true;
            }
            if (z13) {
                J();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionSkhdrjzrfn = skhdrjzrfn(e14, ezmngbhpjk());
            throw ntlheqmsrt(mediaCodecDecoderExceptionSkhdrjzrfn, this.f10769ulzqkzuiru, z13, mediaCodecDecoderExceptionSkhdrjzrfn.f10712jyumaefscl == 1101 ? 4006 : 4003);
        }
    }

    protected abstract nufgyqmvbu.iobyxmoadg c(btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, MediaCrypto mediaCrypto, float f13);

    @Override // androidx.media3.exoplayer.nufgyqmvbu, androidx.media3.exoplayer.hszhottldk
    public final int cllcsxoeiz() {
        return 8;
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu, androidx.media3.exoplayer.igdgnonuha.zoijcleaow
    public void cqumvgiudr(int i13, Object obj) {
        if (i13 != 11) {
            super.cqumvgiudr(i13, obj);
            return;
        }
        wizcaqwiak.iobyxmoadg iobyxmoadgVar = (wizcaqwiak.iobyxmoadg) y2.iobyxmoadg.eablkybsjg((wizcaqwiak.iobyxmoadg) obj);
        this.f10759ribwqtqdhb = iobyxmoadgVar;
        D(iobyxmoadgVar);
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void czzsidtyhn(long j13, boolean z13) throws ExoPlaybackException {
        this.f10739ixidwrxhsl = false;
        this.f10744jrbgnlbqoe = false;
        this.f10727ezmngbhpjk = false;
        if (this.f10725dvvnrvtcbc) {
            this.f10746kegysxyocb.gxszxtbevo();
            this.f10765stevsuqkhv.gxszxtbevo();
            this.f10763skhdrjzrfn = false;
            this.f10753ntlheqmsrt.wkgbmnqykc();
        } else {
            grlcpdaxtj();
        }
        if (this.f10726eslsurpljm.f10790wkgbmnqykc.draadjrbmk() > 0) {
            this.f10729fmlbqenlif = true;
        }
        this.f10726eslsurpljm.f10790wkgbmnqykc.ppxfxbqfkf();
        this.f10750mbcevpiqjq.clear();
    }

    protected final long d() {
        return this.f10726eslsurpljm.f10789ppxfxbqfkf;
    }

    protected final long e() {
        return this.f10726eslsurpljm.f10791zoijcleaow;
    }

    protected final void e0(long j13) {
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = (androidx.media3.common.iobyxmoadg) this.f10726eslsurpljm.f10790wkgbmnqykc.btonecajqb(j13);
        if (iobyxmoadgVar == null && this.f10716a && this.f10751metgxyhuhe != null) {
            iobyxmoadgVar = (androidx.media3.common.iobyxmoadg) this.f10726eslsurpljm.f10790wkgbmnqykc.dxjokdxxww();
        }
        if (iobyxmoadgVar != null) {
            this.f10764sopmlzcsov = iobyxmoadgVar;
        } else if (!this.f10760rlfsiqarku || this.f10764sopmlzcsov == null) {
            return;
        }
        y((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10764sopmlzcsov), this.f10751metgxyhuhe);
        this.f10760rlfsiqarku = false;
        this.f10716a = false;
    }

    protected final MediaFormat eslsurpljm() {
        return this.f10751metgxyhuhe;
    }

    protected final btonecajqb ezmngbhpjk() {
        return this.f10776ydmasvzmpa;
    }

    protected float f() {
        return this.f10736ikoacuggdj;
    }

    protected int fmlbqenlif(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    protected final wizcaqwiak.iobyxmoadg g() {
        return this.f10759ribwqtqdhb;
    }

    protected final boolean grlcpdaxtj() throws ExoPlaybackException {
        boolean zMhtqkkgtqm = mhtqkkgtqm();
        if (zMhtqkkgtqm) {
            r();
        }
        return zMhtqkkgtqm;
    }

    protected abstract void h(DecoderInputBuffer decoderInputBuffer);

    @Override // androidx.media3.exoplayer.hszhottldk
    public final int iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) throws ExoPlaybackException {
        try {
            return a0(this.f10743jpowsppfya, iobyxmoadgVar);
        } catch (MediaCodecUtil.DecoderQueryException e13) {
            throw mbcevpiqjq(e13, iobyxmoadgVar, 4002);
        }
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final long iozdgvuglv(long j13, long j14) {
        return a(j13, j14, this.f10779zeieaojujs);
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public void jpowsppfya(float f13, float f14) throws ExoPlaybackException {
        this.f10736ikoacuggdj = f13;
        this.f10756okpsazkaxt = f14;
        c0(this.f10775xrmfcynszj);
    }

    protected final nufgyqmvbu jrbgnlbqoe() {
        return this.f10745jztzpxfvev;
    }

    protected abstract List krqnebusok(draadjrbmk draadjrbmkVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, boolean z13);

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void metgxyhuhe(boolean z13, boolean z14) {
        this.f10778yzdjzghtvl = new f3.zoijcleaow();
    }

    protected boolean mhtqkkgtqm() {
        if (this.f10745jztzpxfvev == null) {
            return false;
        }
        int i13 = this.f10728fiwbwshyhd;
        if (i13 == 3 || ((this.f10780zfvoamnweg && !this.f10737ipoelvxyzq) || (this.f10755oipsdeybqn && this.f10730fyldjkxazc))) {
            J();
            return true;
        }
        if (i13 == 2) {
            int i14 = stevsuqkhv.f123602iobyxmoadg;
            y2.iobyxmoadg.lqeggnwhkg(i14 >= 23);
            if (i14 >= 23) {
                try {
                    d0();
                } catch (ExoPlaybackException e13) {
                    kcexrzcfyt.dxjokdxxww("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e13);
                    J();
                    return true;
                }
            }
        }
        ipoelvxyzq();
        return false;
    }

    protected final boolean n() {
        return this.f10725dvvnrvtcbc;
    }

    protected final boolean o(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return this.f10742jlmebxxoox == null && Z(iobyxmoadgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r5 >= r1) goto L15;
     */
    @Override // androidx.media3.exoplayer.nufgyqmvbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void oipsdeybqn(androidx.media3.common.iobyxmoadg[] r13, long r14, long r16, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow r18) {
        /*
            r12 = this;
            r0 = r12
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$wkgbmnqykc r1 = r0.f10726eslsurpljm
            long r1 = r1.f10789ppxfxbqfkf
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L27
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$wkgbmnqykc r1 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$wkgbmnqykc
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.Q(r1)
            boolean r1 = r0.f10719b
            if (r1 == 0) goto L6c
            r12.B()
            goto L6c
        L27:
            java.util.ArrayDeque r1 = r0.f10750mbcevpiqjq
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5c
            long r1 = r0.f10731grlcpdaxtj
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L3f
            long r5 = r0.f10747krqnebusok
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L5c
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L5c
        L3f:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$wkgbmnqykc r1 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$wkgbmnqykc
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.Q(r1)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$wkgbmnqykc r1 = r0.f10726eslsurpljm
            long r1 = r1.f10789ppxfxbqfkf
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L6c
            r12.B()
            goto L6c
        L5c:
            java.util.ArrayDeque r1 = r0.f10750mbcevpiqjq
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$wkgbmnqykc r9 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$wkgbmnqykc
            long r3 = r0.f10731grlcpdaxtj
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.oipsdeybqn(androidx.media3.common.iobyxmoadg[], long, long, androidx.media3.exoplayer.source.oxmwwwfdhm$zoijcleaow):void");
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public boolean ppxfxbqfkf() {
        return this.f10769ulzqkzuiru != null && (jztzpxfvev() || i() || (this.f10754nuxfzjnpeb != -9223372036854775807L && ulzqkzuiru().elapsedRealtime() < this.f10754nuxfzjnpeb));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    protected final void r() throws ExoPlaybackException {
        androidx.media3.common.iobyxmoadg iobyxmoadgVar;
        boolean z13;
        if (this.f10745jztzpxfvev != null || this.f10725dvvnrvtcbc || (iobyxmoadgVar = this.f10769ulzqkzuiru) == null) {
            return;
        }
        if (o(iobyxmoadgVar)) {
            k(iobyxmoadgVar);
            return;
        }
        P(this.f10742jlmebxxoox);
        if (this.f10722crxdokpmqz == null || m()) {
            try {
                DrmSession drmSession = this.f10722crxdokpmqz;
                if (drmSession == null || !(drmSession.getState() == 3 || this.f10722crxdokpmqz.getState() == 4)) {
                    z13 = false;
                } else if (this.f10722crxdokpmqz.dxjokdxxww((String) y2.iobyxmoadg.dxjokdxxww(iobyxmoadgVar.f9769ojitshcjhn))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                s(this.f10771vipkmwdibw, z13);
            } catch (DecoderInitializationException e13) {
                throw mbcevpiqjq(e13, iobyxmoadgVar, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.f10771vipkmwdibw;
        if (mediaCrypto == null || this.f10745jztzpxfvev != null) {
            return;
        }
        mediaCrypto.release();
        this.f10771vipkmwdibw = null;
    }

    protected boolean rhgxfdycjh() {
        return false;
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void sflfametgt() {
    }

    protected MediaCodecDecoderException skhdrjzrfn(Throwable th2, btonecajqb btonecajqbVar) {
        return new MediaCodecDecoderException(th2, btonecajqbVar);
    }

    protected boolean t(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return true;
    }

    protected abstract f3.ppxfxbqfkf tbqsvytpvh(btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2);

    protected abstract void u(Exception exc);

    protected abstract void v(String str, nufgyqmvbu.iobyxmoadg iobyxmoadgVar, long j13, long j14);

    protected abstract void w(String str);

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public boolean wkgbmnqykc() {
        return this.f10744jrbgnlbqoe;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    protected f3.ppxfxbqfkf x(lmojexxdyd lmojexxdydVar) throws ExoPlaybackException {
        int i13;
        boolean z13 = true;
        this.f10729fmlbqenlif = true;
        androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(lmojexxdydVar.f32682zoijcleaow);
        String str = iobyxmoadgVarCllcsxoeiz.f9769ojitshcjhn;
        if (str == null) {
            throw mbcevpiqjq(new IllegalArgumentException("Sample MIME type is null."), iobyxmoadgVarCllcsxoeiz, 4005);
        }
        if (Objects.equals(str, "video/av01") && !iobyxmoadgVarCllcsxoeiz.f9770oxmwwwfdhm.isEmpty()) {
            iobyxmoadgVarCllcsxoeiz = iobyxmoadgVarCllcsxoeiz.zoijcleaow().metgxyhuhe(null).cllcsxoeiz();
        }
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = iobyxmoadgVarCllcsxoeiz;
        T(lmojexxdydVar.f32681iobyxmoadg);
        this.f10769ulzqkzuiru = iobyxmoadgVar;
        if (this.f10725dvvnrvtcbc) {
            this.f10735igdgnonuha = true;
            return null;
        }
        nufgyqmvbu nufgyqmvbuVar = this.f10745jztzpxfvev;
        if (nufgyqmvbuVar == null) {
            this.f10770uwvvkdfqfp = null;
            r();
            return null;
        }
        btonecajqb btonecajqbVar = (btonecajqb) y2.iobyxmoadg.eablkybsjg(this.f10776ydmasvzmpa);
        androidx.media3.common.iobyxmoadg iobyxmoadgVar2 = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10775xrmfcynszj);
        if (ageimvtcrz(btonecajqbVar, iobyxmoadgVar, this.f10722crxdokpmqz, this.f10742jlmebxxoox)) {
            wizcaqwiak();
            return new f3.ppxfxbqfkf(btonecajqbVar.f10806iobyxmoadg, iobyxmoadgVar2, iobyxmoadgVar, 0, UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        boolean z14 = this.f10742jlmebxxoox != this.f10722crxdokpmqz;
        y2.iobyxmoadg.lqeggnwhkg(!z14 || stevsuqkhv.f123602iobyxmoadg >= 23);
        f3.ppxfxbqfkf ppxfxbqfkfVarTbqsvytpvh = tbqsvytpvh(btonecajqbVar, iobyxmoadgVar2, iobyxmoadgVar);
        int i14 = ppxfxbqfkfVarTbqsvytpvh.f32691wkgbmnqykc;
        if (i14 != 0) {
            i13 = 16;
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException();
                    }
                    if (c0(iobyxmoadgVar)) {
                        this.f10775xrmfcynszj = iobyxmoadgVar;
                        if (z14 && !hszhottldk()) {
                            i13 = 2;
                        }
                    }
                } else if (c0(iobyxmoadgVar)) {
                    this.f10749lxfrhoxuzk = true;
                    this.f10773wizcaqwiak = 1;
                    int i15 = this.f10762sflfametgt;
                    if (i15 != 2 && (i15 != 1 || iobyxmoadgVar.f9763jyumaefscl != iobyxmoadgVar2.f9763jyumaefscl || iobyxmoadgVar.f9761iwizpuwonk != iobyxmoadgVar2.f9761iwizpuwonk)) {
                        z13 = false;
                    }
                    this.f10757opjhrmiecq = z13;
                    this.f10775xrmfcynszj = iobyxmoadgVar;
                    if (z14 && !hszhottldk()) {
                        i13 = 2;
                    }
                }
            } else if (c0(iobyxmoadgVar)) {
                this.f10775xrmfcynszj = iobyxmoadgVar;
                if (!z14 ? !lxfrhoxuzk() : !hszhottldk()) {
                    i13 = 2;
                }
            }
            return (ppxfxbqfkfVarTbqsvytpvh.f32691wkgbmnqykc != 0 || (this.f10745jztzpxfvev == nufgyqmvbuVar && this.f10728fiwbwshyhd != 3)) ? ppxfxbqfkfVarTbqsvytpvh : new f3.ppxfxbqfkf(btonecajqbVar.f10806iobyxmoadg, iobyxmoadgVar2, iobyxmoadgVar, 0, i13);
        }
        wizcaqwiak();
        i13 = 0;
        if (ppxfxbqfkfVarTbqsvytpvh.f32691wkgbmnqykc != 0) {
        }
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void xrmfcynszj() {
        this.f10769ulzqkzuiru = null;
        Q(wkgbmnqykc.f10787eablkybsjg);
        this.f10750mbcevpiqjq.clear();
        mhtqkkgtqm();
    }

    protected abstract void y(androidx.media3.common.iobyxmoadg iobyxmoadgVar, MediaFormat mediaFormat);

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void ydmasvzmpa() {
        try {
            igdgnonuha();
            J();
        } finally {
            T(null);
        }
    }

    protected abstract float yzdjzghtvl(float f13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr);

    protected void z(long j13) {
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void zfvoamnweg() {
    }

    public static class DecoderInitializationException extends Exception {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        public final DecoderInitializationException f10781cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public final String f10782iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public final btonecajqb f10783jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final boolean f10784yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final String f10785zdlpuopuiu;

        public DecoderInitializationException(androidx.media3.common.iobyxmoadg iobyxmoadgVar, Throwable th2, boolean z13, int i13) {
            this("Decoder init failed: [" + i13 + "], " + iobyxmoadgVar, th2, iobyxmoadgVar.f9769ojitshcjhn, z13, null, wkgbmnqykc(i13), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException lqeggnwhkg(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.f10785zdlpuopuiu, this.f10784yggfygwlhe, this.f10783jyumaefscl, this.f10782iwizpuwonk, decoderInitializationException);
        }

        private static String wkgbmnqykc(int i13) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i13 < 0 ? "neg_" : "") + Math.abs(i13);
        }

        public DecoderInitializationException(androidx.media3.common.iobyxmoadg iobyxmoadgVar, Throwable th2, boolean z13, btonecajqb btonecajqbVar) {
            this("Decoder init failed: " + btonecajqbVar.f10806iobyxmoadg + ", " + iobyxmoadgVar, th2, iobyxmoadgVar.f9769ojitshcjhn, z13, btonecajqbVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
        }

        private DecoderInitializationException(String str, Throwable th2, String str2, boolean z13, btonecajqb btonecajqbVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.f10785zdlpuopuiu = str2;
            this.f10784yggfygwlhe = z13;
            this.f10783jyumaefscl = btonecajqbVar;
            this.f10782iwizpuwonk = str3;
            this.f10781cqumvgiudr = decoderInitializationException;
        }
    }
}
