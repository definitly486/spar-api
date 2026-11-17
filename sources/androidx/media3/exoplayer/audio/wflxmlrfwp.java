package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.hszhottldk;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.wizcaqwiak;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.common.collect.zdlpuopuiu;
import f3.lmojexxdyd;
import f3.ylkuphrtab;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import t3.kegysxyocb;
import v2.cqumvgiudr;
import v2.iwizpuwonk;
import y2.jyumaefscl;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class wflxmlrfwp extends MediaCodecRenderer implements ylkuphrtab {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f10289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final eablkybsjg.iobyxmoadg f10290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AudioSink f10291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k3.nufgyqmvbu f10292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f10296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f10297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f10298m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10299n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10300o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f10302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f10303r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f10304s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10305t;

    private final class ppxfxbqfkf implements AudioSink.zoijcleaow {
        private ppxfxbqfkf() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.zoijcleaow
        public void btonecajqb() {
            wflxmlrfwp.this.s0();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.zoijcleaow
        public void dxjokdxxww() {
            wflxmlrfwp.this.yfnezrywwk();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.zoijcleaow
        public void eablkybsjg(Exception exc) {
            kcexrzcfyt.wkgbmnqykc("MediaCodecAudioRenderer", "Audio sink error", exc);
            wflxmlrfwp.this.f10290e.agtfadlqog(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.zoijcleaow
        public void gtknphoqwx() {
            wizcaqwiak.iobyxmoadg iobyxmoadgVarG = wflxmlrfwp.this.g();
            if (iobyxmoadgVarG != null) {
                iobyxmoadgVarG.zoijcleaow();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.zoijcleaow
        public void gxszxtbevo() {
            wflxmlrfwp.this.f10301p = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.zoijcleaow
        public void iobyxmoadg(AudioSink.iobyxmoadg iobyxmoadgVar) {
            wflxmlrfwp.this.f10290e.ojitshcjhn(iobyxmoadgVar);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.zoijcleaow
        public void lqeggnwhkg() {
            wizcaqwiak.iobyxmoadg iobyxmoadgVarG = wflxmlrfwp.this.g();
            if (iobyxmoadgVarG != null) {
                iobyxmoadgVarG.iobyxmoadg();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.zoijcleaow
        public void nufgyqmvbu(int i13, long j13, long j14) {
            wflxmlrfwp.this.f10290e.pkzmftpjix(i13, j13, j14);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.zoijcleaow
        public void ppxfxbqfkf(AudioSink.iobyxmoadg iobyxmoadgVar) {
            wflxmlrfwp.this.f10290e.rgvfuqvkyq(iobyxmoadgVar);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.zoijcleaow
        public void wkgbmnqykc(boolean z13) {
            wflxmlrfwp.this.f10290e.ylkuphrtab(z13);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.zoijcleaow
        public void zoijcleaow(long j13) {
            wflxmlrfwp.this.f10290e.wwaezpbzkn(j13);
        }
    }

    private static final class zoijcleaow {
        public static void iobyxmoadg(AudioSink audioSink, Object obj) {
            audioSink.dxjokdxxww((AudioDeviceInfo) obj);
        }
    }

    public wflxmlrfwp(Context context, androidx.media3.exoplayer.mediacodec.nufgyqmvbu.zoijcleaow zoijcleaowVar, androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar, boolean z13, Handler handler, eablkybsjg eablkybsjgVar, AudioSink audioSink) {
        this(context, zoijcleaowVar, draadjrbmkVar, z13, handler, eablkybsjgVar, audioSink, stevsuqkhv.f123602iobyxmoadg >= 35 ? new k3.nufgyqmvbu() : null);
    }

    private static boolean k0(String str) {
        if (stevsuqkhv.f123602iobyxmoadg < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean l0(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean m0() {
        if (stevsuqkhv.f123602iobyxmoadg == 23) {
            String str = Build.MODEL;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int n0(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = this.f10291f.nufgyqmvbu(iobyxmoadgVar);
        if (!wkgbmnqykcVarNufgyqmvbu.f10308iobyxmoadg) {
            return 0;
        }
        int i13 = wkgbmnqykcVarNufgyqmvbu.f10310zoijcleaow ? 1536 : UserVerificationMethods.USER_VERIFY_NONE;
        return wkgbmnqykcVarNufgyqmvbu.f10309ppxfxbqfkf ? i13 | 2048 : i13;
    }

    private int o0(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        int i13;
        if (!"OMX.google.raw.decoder".equals(btonecajqbVar.f10806iobyxmoadg) || (i13 = stevsuqkhv.f123602iobyxmoadg) >= 24 || (i13 == 23 && stevsuqkhv.hszhottldk(this.f10289d))) {
            return iobyxmoadgVar.f9774rgvfuqvkyq;
        }
        return -1;
    }

    private static List q0(androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, boolean z13, AudioSink audioSink) {
        androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVarRgvfuqvkyq;
        if (iobyxmoadgVar.f9769ojitshcjhn == null) {
            return zdlpuopuiu.zynmafqrjb();
        }
        return (!audioSink.iobyxmoadg(iobyxmoadgVar) || (btonecajqbVarRgvfuqvkyq = MediaCodecUtil.rgvfuqvkyq()) == null) ? MediaCodecUtil.wflxmlrfwp(draadjrbmkVar, iobyxmoadgVar, z13, false) : zdlpuopuiu.istkbnxepw(btonecajqbVarRgvfuqvkyq);
    }

    private void t0(int i13) {
        k3.nufgyqmvbu nufgyqmvbuVar;
        this.f10291f.gtknphoqwx(i13);
        if (stevsuqkhv.f123602iobyxmoadg < 35 || (nufgyqmvbuVar = this.f10292g) == null) {
            return;
        }
        nufgyqmvbuVar.eablkybsjg(i13);
    }

    private void u0() {
        androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVarJrbgnlbqoe = jrbgnlbqoe();
        if (nufgyqmvbuVarJrbgnlbqoe != null && stevsuqkhv.f123602iobyxmoadg >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f10302q));
            nufgyqmvbuVarJrbgnlbqoe.ppxfxbqfkf(bundle);
        }
    }

    private void v0() {
        long jIwizpuwonk = this.f10291f.iwizpuwonk(wkgbmnqykc());
        if (jIwizpuwonk != Long.MIN_VALUE) {
            if (!this.f10299n) {
                jIwizpuwonk = Math.max(this.f10298m, jIwizpuwonk);
            }
            this.f10298m = jIwizpuwonk;
            this.f10299n = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void B() {
        super.B();
        this.f10291f.esjtqupxsv();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean F(long j13, long j14, androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar, ByteBuffer byteBuffer, int i13, int i14, int i15, long j15, boolean z13, boolean z14, androidx.media3.common.iobyxmoadg iobyxmoadgVar) throws ExoPlaybackException {
        y2.iobyxmoadg.eablkybsjg(byteBuffer);
        this.f10304s = -9223372036854775807L;
        if (this.f10297l != null && (i14 & 2) != 0) {
            ((androidx.media3.exoplayer.mediacodec.nufgyqmvbu) y2.iobyxmoadg.eablkybsjg(nufgyqmvbuVar)).ojitshcjhn(i13, false);
            return true;
        }
        if (z13) {
            if (nufgyqmvbuVar != null) {
                nufgyqmvbuVar.ojitshcjhn(i13, false);
            }
            this.f10778yzdjzghtvl.f32709gxszxtbevo += i15;
            this.f10291f.esjtqupxsv();
            return true;
        }
        try {
            if (!this.f10291f.vdvldrhtss(byteBuffer, j15, i15)) {
                this.f10304s = j15;
                return false;
            }
            if (nufgyqmvbuVar != null) {
                nufgyqmvbuVar.ojitshcjhn(i13, false);
            }
            this.f10778yzdjzghtvl.f32707eablkybsjg += i15;
            return true;
        } catch (AudioSink.InitializationException e13) {
            throw ntlheqmsrt(e13, this.f10296k, e13.f10078yggfygwlhe, (!n() || sopmlzcsov().f32665iobyxmoadg == 0) ? 5001 : 5004);
        } catch (AudioSink.WriteException e14) {
            throw ntlheqmsrt(e14, iobyxmoadgVar, e14.f10083yggfygwlhe, (!n() || sopmlzcsov().f32665iobyxmoadg == 0) ? 5002 : 5003);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void K() throws ExoPlaybackException {
        try {
            this.f10291f.zdlpuopuiu();
            if (b() != -9223372036854775807L) {
                this.f10304s = b();
            }
            this.f10305t = true;
        } catch (AudioSink.WriteException e13) {
            throw ntlheqmsrt(e13, e13.f10082jyumaefscl, e13.f10083yggfygwlhe, n() ? 5003 : 5002);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean Z(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        if (sopmlzcsov().f32665iobyxmoadg != 0) {
            int iN0 = n0(iobyxmoadgVar);
            if ((iN0 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                if (sopmlzcsov().f32665iobyxmoadg == 2 || (iN0 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    return true;
                }
                if (iobyxmoadgVar.f9778wwaezpbzkn == 0 && iobyxmoadgVar.f9781ylkuphrtab == 0) {
                    return true;
                }
            }
        }
        return this.f10291f.iobyxmoadg(iobyxmoadgVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected long a(long j13, long j14, boolean z13) {
        if (this.f10304s == -9223372036854775807L) {
            return super.a(j13, j14, z13);
        }
        long jDraadjrbmk = this.f10291f.draadjrbmk();
        if (!this.f10305t && jDraadjrbmk == -9223372036854775807L) {
            return super.a(j13, j14, z13);
        }
        long jMin = this.f10304s - j13;
        if (jDraadjrbmk != -9223372036854775807L) {
            jMin = Math.min(jDraadjrbmk, jMin);
        }
        long jIxidwrxhsl = (long) ((jMin / (lqeggnwhkg() != null ? lqeggnwhkg().f115310iobyxmoadg : 1.0f)) / 2.0f);
        if (this.f10303r) {
            jIxidwrxhsl -= stevsuqkhv.ixidwrxhsl(ulzqkzuiru().elapsedRealtime()) - j14;
        }
        return Math.max(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, jIxidwrxhsl);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int a0(androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        int i13;
        boolean z13;
        if (!iwizpuwonk.agtfadlqog(iobyxmoadgVar.f9769ojitshcjhn)) {
            return hszhottldk.jyumaefscl(0);
        }
        boolean z14 = true;
        boolean z15 = iobyxmoadgVar.f9747cllcsxoeiz != 0;
        boolean zB0 = MediaCodecRenderer.b0(iobyxmoadgVar);
        int i14 = 8;
        if (!zB0 || (z15 && MediaCodecUtil.rgvfuqvkyq() == null)) {
            i13 = 0;
        } else {
            int iN0 = n0(iobyxmoadgVar);
            if (this.f10291f.iobyxmoadg(iobyxmoadgVar)) {
                return hszhottldk.kcexrzcfyt(4, 8, 32, iN0);
            }
            i13 = iN0;
        }
        if ((!"audio/raw".equals(iobyxmoadgVar.f9769ojitshcjhn) || this.f10291f.iobyxmoadg(iobyxmoadgVar)) && this.f10291f.iobyxmoadg(stevsuqkhv.xrmfcynszj(2, iobyxmoadgVar.f9779yadqdtsiqt, iobyxmoadgVar.f9759iozdgvuglv))) {
            List listQ0 = q0(draadjrbmkVar, iobyxmoadgVar, false, this.f10291f);
            if (listQ0.isEmpty()) {
                return hszhottldk.jyumaefscl(1);
            }
            if (!zB0) {
                return hszhottldk.jyumaefscl(2);
            }
            androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar = (androidx.media3.exoplayer.mediacodec.btonecajqb) listQ0.get(0);
            boolean zOjitshcjhn = btonecajqbVar.ojitshcjhn(iobyxmoadgVar);
            if (!zOjitshcjhn) {
                int i15 = 1;
                while (true) {
                    if (i15 >= listQ0.size()) {
                        z13 = true;
                        z14 = zOjitshcjhn;
                        break;
                    }
                    androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar2 = (androidx.media3.exoplayer.mediacodec.btonecajqb) listQ0.get(i15);
                    if (btonecajqbVar2.ojitshcjhn(iobyxmoadgVar)) {
                        z13 = false;
                        btonecajqbVar = btonecajqbVar2;
                        break;
                    }
                    i15++;
                }
            } else {
                z13 = true;
                z14 = zOjitshcjhn;
                break;
            }
            int i16 = z14 ? 4 : 3;
            if (z14 && btonecajqbVar.oxmwwwfdhm(iobyxmoadgVar)) {
                i14 = 16;
            }
            return hszhottldk.yadqdtsiqt(i16, i14, 32, btonecajqbVar.f10808nufgyqmvbu ? 64 : 0, z13 ? UserVerificationMethods.USER_VERIFY_PATTERN : 0, i13);
        }
        return hszhottldk.jyumaefscl(1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.mediacodec.nufgyqmvbu.iobyxmoadg c(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, MediaCrypto mediaCrypto, float f13) {
        this.f10293h = p0(btonecajqbVar, iobyxmoadgVar, jhduphickx());
        this.f10294i = k0(btonecajqbVar.f10806iobyxmoadg);
        this.f10295j = l0(btonecajqbVar.f10806iobyxmoadg);
        MediaFormat mediaFormatR0 = r0(iobyxmoadgVar, btonecajqbVar.f10809ppxfxbqfkf, this.f10293h, f13);
        this.f10297l = (!"audio/raw".equals(btonecajqbVar.f10811zoijcleaow) || "audio/raw".equals(iobyxmoadgVar.f9769ojitshcjhn)) ? null : iobyxmoadgVar;
        return androidx.media3.exoplayer.mediacodec.nufgyqmvbu.iobyxmoadg.iobyxmoadg(btonecajqbVar, mediaFormatR0, iobyxmoadgVar, mediaCrypto, this.f10292g);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu, androidx.media3.exoplayer.igdgnonuha.zoijcleaow
    public void cqumvgiudr(int i13, Object obj) {
        if (i13 == 2) {
            this.f10291f.lereixgezr(((Float) y2.iobyxmoadg.eablkybsjg(obj)).floatValue());
            return;
        }
        if (i13 == 3) {
            this.f10291f.jyumaefscl((v2.ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg((v2.ppxfxbqfkf) obj));
            return;
        }
        if (i13 == 6) {
            this.f10291f.zynmafqrjb((v2.gxszxtbevo) y2.iobyxmoadg.eablkybsjg((v2.gxszxtbevo) obj));
            return;
        }
        if (i13 == 12) {
            if (stevsuqkhv.f123602iobyxmoadg >= 23) {
                zoijcleaow.iobyxmoadg(this.f10291f, obj);
            }
        } else if (i13 == 16) {
            this.f10302q = ((Integer) y2.iobyxmoadg.eablkybsjg(obj)).intValue();
            u0();
        } else if (i13 == 9) {
            this.f10291f.cdpycssgdh(((Boolean) y2.iobyxmoadg.eablkybsjg(obj)).booleanValue());
        } else if (i13 != 10) {
            super.cqumvgiudr(i13, obj);
        } else {
            t0(((Integer) y2.iobyxmoadg.eablkybsjg(obj)).intValue());
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void czzsidtyhn(long j13, boolean z13) throws ExoPlaybackException {
        super.czzsidtyhn(j13, z13);
        this.f10291f.flush();
        this.f10298m = j13;
        this.f10304s = -9223372036854775807L;
        this.f10305t = false;
        this.f10301p = false;
        this.f10299n = true;
    }

    @Override // f3.ylkuphrtab
    public void eablkybsjg(cqumvgiudr cqumvgiudrVar) {
        this.f10291f.eablkybsjg(cqumvgiudrVar);
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak, androidx.media3.exoplayer.hszhottldk
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void h(DecoderInputBuffer decoderInputBuffer) {
        androidx.media3.common.iobyxmoadg iobyxmoadgVar;
        if (stevsuqkhv.f123602iobyxmoadg < 29 || (iobyxmoadgVar = decoderInputBuffer.f10025yggfygwlhe) == null || !Objects.equals(iobyxmoadgVar.f9769ojitshcjhn, "audio/opus") || !n()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) y2.iobyxmoadg.eablkybsjg(decoderInputBuffer.f10023lereixgezr);
        int i13 = ((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(decoderInputBuffer.f10025yggfygwlhe)).f9778wwaezpbzkn;
        if (byteBuffer.remaining() == 8) {
            this.f10291f.yggfygwlhe(i13, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // f3.ylkuphrtab
    public long hcddaimhww() {
        if (getState() == 2) {
            v0();
        }
        return this.f10298m;
    }

    @Override // f3.ylkuphrtab
    public boolean iwizpuwonk() {
        boolean z13 = this.f10301p;
        this.f10301p = false;
        return z13;
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu, androidx.media3.exoplayer.wizcaqwiak
    public ylkuphrtab kegysxyocb() {
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List krqnebusok(androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, boolean z13) {
        return MediaCodecUtil.agtfadlqog(q0(draadjrbmkVar, iobyxmoadgVar, z13, this.f10291f), iobyxmoadgVar);
    }

    @Override // f3.ylkuphrtab
    public cqumvgiudr lqeggnwhkg() {
        return this.f10291f.lqeggnwhkg();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void metgxyhuhe(boolean z13, boolean z14) {
        super.metgxyhuhe(z13, z14);
        this.f10290e.zdlpuopuiu(this.f10778yzdjzghtvl);
        if (sopmlzcsov().f32666zoijcleaow) {
            this.f10291f.pmvmpeiblj();
        } else {
            this.f10291f.ojitshcjhn();
        }
        this.f10291f.oxmwwwfdhm(vipkmwdibw());
        this.f10291f.rgvfuqvkyq(ulzqkzuiru());
    }

    protected int p0(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr) {
        int iO0 = o0(btonecajqbVar, iobyxmoadgVar);
        if (iobyxmoadgVarArr.length == 1) {
            return iO0;
        }
        for (androidx.media3.common.iobyxmoadg iobyxmoadgVar2 : iobyxmoadgVarArr) {
            if (btonecajqbVar.eablkybsjg(iobyxmoadgVar, iobyxmoadgVar2).f32691wkgbmnqykc != 0) {
                iO0 = Math.max(iO0, o0(btonecajqbVar, iobyxmoadgVar2));
            }
        }
        return iO0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.wizcaqwiak
    public boolean ppxfxbqfkf() {
        return this.f10291f.btonecajqb() || super.ppxfxbqfkf();
    }

    protected MediaFormat r0(androidx.media3.common.iobyxmoadg iobyxmoadgVar, String str, int i13, float f13) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", iobyxmoadgVar.f9779yadqdtsiqt);
        mediaFormat.setInteger("sample-rate", iobyxmoadgVar.f9759iozdgvuglv);
        jyumaefscl.eablkybsjg(mediaFormat, iobyxmoadgVar.f9770oxmwwwfdhm);
        jyumaefscl.wkgbmnqykc(mediaFormat, "max-input-size", i13);
        int i14 = stevsuqkhv.f123602iobyxmoadg;
        if (i14 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f13 != -1.0f && !m0()) {
                mediaFormat.setFloat("operating-rate", f13);
            }
        }
        if (i14 <= 28 && "audio/ac4".equals(iobyxmoadgVar.f9769ojitshcjhn)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i14 >= 24 && this.f10291f.istkbnxepw(stevsuqkhv.xrmfcynszj(4, iobyxmoadgVar.f9779yadqdtsiqt, iobyxmoadgVar.f9759iozdgvuglv)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i14 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i14 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f10302q));
        }
        return mediaFormat;
    }

    protected void s0() {
        this.f10299n = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void sflfametgt() {
        super.sflfametgt();
        this.f10291f.play();
        this.f10303r = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected f3.ppxfxbqfkf tbqsvytpvh(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2) {
        f3.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = btonecajqbVar.eablkybsjg(iobyxmoadgVar, iobyxmoadgVar2);
        int i13 = ppxfxbqfkfVarEablkybsjg.f32688eablkybsjg;
        if (o(iobyxmoadgVar2)) {
            i13 |= 32768;
        }
        if (o0(btonecajqbVar, iobyxmoadgVar2) > this.f10293h) {
            i13 |= 64;
        }
        int i14 = i13;
        return new f3.ppxfxbqfkf(btonecajqbVar.f10806iobyxmoadg, iobyxmoadgVar, iobyxmoadgVar2, i14 != 0 ? 0 : ppxfxbqfkfVarEablkybsjg.f32691wkgbmnqykc, i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void u(Exception exc) {
        kcexrzcfyt.wkgbmnqykc("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f10290e.wflxmlrfwp(exc);
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void uwvvkdfqfp() {
        k3.nufgyqmvbu nufgyqmvbuVar;
        this.f10291f.release();
        if (stevsuqkhv.f123602iobyxmoadg < 35 || (nufgyqmvbuVar = this.f10292g) == null) {
            return;
        }
        nufgyqmvbuVar.ppxfxbqfkf();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void v(String str, androidx.media3.exoplayer.mediacodec.nufgyqmvbu.iobyxmoadg iobyxmoadgVar, long j13, long j14) {
        this.f10290e.vdvldrhtss(str, j13, j14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void w(String str) {
        this.f10290e.oxmwwwfdhm(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.wizcaqwiak
    public boolean wkgbmnqykc() {
        return super.wkgbmnqykc() && this.f10291f.wkgbmnqykc();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected f3.ppxfxbqfkf x(lmojexxdyd lmojexxdydVar) throws ExoPlaybackException {
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(lmojexxdydVar.f32682zoijcleaow);
        this.f10296k = iobyxmoadgVar;
        f3.ppxfxbqfkf ppxfxbqfkfVarX = super.x(lmojexxdydVar);
        this.f10290e.yggfygwlhe(iobyxmoadgVar, ppxfxbqfkfVarX);
        return ppxfxbqfkfVarX;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void xrmfcynszj() {
        this.f10300o = true;
        this.f10296k = null;
        this.f10304s = -9223372036854775807L;
        this.f10305t = false;
        try {
            this.f10291f.flush();
            try {
                super.xrmfcynszj();
            } finally {
                this.f10290e.kcexrzcfyt(this.f10778yzdjzghtvl);
            }
        } catch (Throwable th2) {
            try {
                super.xrmfcynszj();
                throw th2;
            } finally {
                this.f10290e.kcexrzcfyt(this.f10778yzdjzghtvl);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void y(androidx.media3.common.iobyxmoadg iobyxmoadgVar, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iJztzpxfvev;
        int i13;
        androidx.media3.common.iobyxmoadg iobyxmoadgVar2 = this.f10297l;
        int[] iArrIobyxmoadg = null;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar = iobyxmoadgVar2;
        } else if (jrbgnlbqoe() != null) {
            y2.iobyxmoadg.eablkybsjg(mediaFormat);
            if ("audio/raw".equals(iobyxmoadgVar.f9769ojitshcjhn)) {
                iJztzpxfvev = iobyxmoadgVar.f9766lmojexxdyd;
            } else if (stevsuqkhv.f123602iobyxmoadg < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iJztzpxfvev = mediaFormat.containsKey("v-bits-per-sample") ? stevsuqkhv.jztzpxfvev(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iJztzpxfvev = mediaFormat.getInteger("pcm-encoding");
            }
            androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = new androidx.media3.common.iobyxmoadg.zoijcleaow().zeieaojujs("audio/raw").oipsdeybqn(iJztzpxfvev).ribwqtqdhb(iobyxmoadgVar.f9778wwaezpbzkn).vipkmwdibw(iobyxmoadgVar.f9781ylkuphrtab).zfvoamnweg(iobyxmoadgVar.f9749draadjrbmk).crxdokpmqz(iobyxmoadgVar.f9776wflxmlrfwp).xrmfcynszj(iobyxmoadgVar.f9758iobyxmoadg).rlfsiqarku(iobyxmoadgVar.f9783zoijcleaow).czzsidtyhn(iobyxmoadgVar.f9773ppxfxbqfkf).uwvvkdfqfp(iobyxmoadgVar.f9777wkgbmnqykc).tbqsvytpvh(iobyxmoadgVar.f9752eablkybsjg).weqkydbzbr(iobyxmoadgVar.f9755gxszxtbevo).kegysxyocb(mediaFormat.getInteger("channel-count")).nuxfzjnpeb(mediaFormat.getInteger("sample-rate")).cllcsxoeiz();
            if (this.f10294i && iobyxmoadgVarCllcsxoeiz.f9779yadqdtsiqt == 6 && (i13 = iobyxmoadgVar.f9779yadqdtsiqt) < 6) {
                iArrIobyxmoadg = new int[i13];
                for (int i14 = 0; i14 < iobyxmoadgVar.f9779yadqdtsiqt; i14++) {
                    iArrIobyxmoadg[i14] = i14;
                }
            } else if (this.f10295j) {
                iArrIobyxmoadg = kegysxyocb.iobyxmoadg(iobyxmoadgVarCllcsxoeiz.f9779yadqdtsiqt);
            }
            iobyxmoadgVar = iobyxmoadgVarCllcsxoeiz;
        }
        try {
            if (stevsuqkhv.f123602iobyxmoadg >= 29) {
                if (!n() || sopmlzcsov().f32665iobyxmoadg == 0) {
                    this.f10291f.agtfadlqog(0);
                } else {
                    this.f10291f.agtfadlqog(sopmlzcsov().f32665iobyxmoadg);
                }
            }
            this.f10291f.kcexrzcfyt(iobyxmoadgVar, 0, iArrIobyxmoadg);
        } catch (AudioSink.ConfigurationException e13) {
            throw mbcevpiqjq(e13, e13.f10076zdlpuopuiu, 5001);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void ydmasvzmpa() {
        this.f10301p = false;
        this.f10304s = -9223372036854775807L;
        this.f10305t = false;
        try {
            super.ydmasvzmpa();
        } finally {
            if (this.f10300o) {
                this.f10300o = false;
                this.f10291f.zoijcleaow();
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float yzdjzghtvl(float f13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr) {
        int iMax = -1;
        for (androidx.media3.common.iobyxmoadg iobyxmoadgVar2 : iobyxmoadgVarArr) {
            int i13 = iobyxmoadgVar2.f9759iozdgvuglv;
            if (i13 != -1) {
                iMax = Math.max(iMax, i13);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f13 * iMax;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void z(long j13) {
        this.f10291f.cqumvgiudr(j13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void zfvoamnweg() {
        v0();
        this.f10303r = false;
        this.f10291f.pause();
        super.zfvoamnweg();
    }

    public wflxmlrfwp(Context context, androidx.media3.exoplayer.mediacodec.nufgyqmvbu.zoijcleaow zoijcleaowVar, androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar, boolean z13, Handler handler, eablkybsjg eablkybsjgVar, AudioSink audioSink, k3.nufgyqmvbu nufgyqmvbuVar) {
        super(1, zoijcleaowVar, draadjrbmkVar, z13, 44100.0f);
        this.f10289d = context.getApplicationContext();
        this.f10291f = audioSink;
        this.f10292g = nufgyqmvbuVar;
        this.f10302q = -1000;
        this.f10290e = new eablkybsjg.iobyxmoadg(handler, eablkybsjgVar);
        this.f10304s = -9223372036854775807L;
        audioSink.wflxmlrfwp(new ppxfxbqfkf());
    }
}
