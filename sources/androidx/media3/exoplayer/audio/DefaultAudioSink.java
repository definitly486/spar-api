package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.ulzqkzuiru;
import com.google.common.collect.zdlpuopuiu;
import g3.h0;
import h3.iozdgvuglv;
import h3.pkzmftpjix;
import h3.ylkuphrtab;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import t3.wwaezpbzkn;
import v2.cqumvgiudr;
import v2.iwizpuwonk;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private static int f10091oipsdeybqn = 0;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private static final Object f10092sflfametgt = new Object();

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    public static boolean f10093ydmasvzmpa = false;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private static ScheduledExecutorService f10094zfvoamnweg;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f10095agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final boolean f10096btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private btonecajqb f10097cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f10098cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private AudioTrack f10099cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private boolean f10100crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private long f10101czzsidtyhn;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private agtfadlqog f10102draadjrbmk;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private boolean f10103dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ArrayDeque f10104dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ojitshcjhn f10105eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.iobyxmoadg f10106esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f10107gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final zdlpuopuiu f10108gxszxtbevo;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private long f10109hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private int f10110hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private boolean f10111ikoacuggdj;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f10112iobyxmoadg;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f10113iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private btonecajqb f10114istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private androidx.media3.common.audio.iobyxmoadg f10115iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.ppxfxbqfkf f10116jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private boolean f10117jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private long f10118jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private nufgyqmvbu f10119jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private long f10120jztzpxfvev;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private h0 f10121kcexrzcfyt;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private ByteBuffer f10122kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.zoijcleaow f10123lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private ByteBuffer f10124lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final zdlpuopuiu f10125lqeggnwhkg;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private ByteBuffer f10126mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private boolean f10127metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private boolean f10128ntlheqmsrt;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final androidx.media3.exoplayer.audio.lqeggnwhkg f10129nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final eablkybsjg f10130ojitshcjhn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private long f10131okpsazkaxt;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final gxszxtbevo f10132oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private long f10133pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private gtknphoqwx f10134pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f10135ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final wkgbmnqykc f10136rgvfuqvkyq;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private int f10137ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private Looper f10138rlfsiqarku;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private boolean f10139sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private float f10140stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private int f10141tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private boolean f10142ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private long f10143uwvvkdfqfp;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final ExoPlayer.iobyxmoadg f10144vdvldrhtss;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private v2.gxszxtbevo f10145vipkmwdibw;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f10146wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.media3.exoplayer.audio.nufgyqmvbu f10147wkgbmnqykc;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private int f10148wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private long f10149wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private boolean f10150xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private cqumvgiudr f10151yadqdtsiqt;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private Handler f10152yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private nufgyqmvbu f10153yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private long f10154ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private AudioSink.zoijcleaow f10155zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w2.gxszxtbevo f10156zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private v2.ppxfxbqfkf f10157zynmafqrjb;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    private final class agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Handler f10158iobyxmoadg = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f10160zoijcleaow;

        class iobyxmoadg extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ DefaultAudioSink f10161iobyxmoadg;

            iobyxmoadg(DefaultAudioSink defaultAudioSink) {
                this.f10161iobyxmoadg = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i13) {
                if (audioTrack.equals(DefaultAudioSink.this.f10099cqumvgiudr) && DefaultAudioSink.this.f10155zdlpuopuiu != null && DefaultAudioSink.this.f10100crxdokpmqz) {
                    DefaultAudioSink.this.f10155zdlpuopuiu.gtknphoqwx();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f10099cqumvgiudr)) {
                    DefaultAudioSink.this.f10139sopmlzcsov = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f10099cqumvgiudr) && DefaultAudioSink.this.f10155zdlpuopuiu != null && DefaultAudioSink.this.f10100crxdokpmqz) {
                    DefaultAudioSink.this.f10155zdlpuopuiu.gtknphoqwx();
                }
            }
        }

        public agtfadlqog() {
            this.f10160zoijcleaow = new iobyxmoadg(DefaultAudioSink.this);
        }

        public void iobyxmoadg(AudioTrack audioTrack) {
            Handler handler = this.f10158iobyxmoadg;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new iozdgvuglv(handler), this.f10160zoijcleaow);
        }

        public void zoijcleaow(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f10160zoijcleaow);
            this.f10158iobyxmoadg.removeCallbacksAndMessages(null);
        }
    }

    private static final class btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final cqumvgiudr f10163iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final long f10164ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public long f10165wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f10166zoijcleaow;

        private btonecajqb(cqumvgiudr cqumvgiudrVar, long j13, long j14) {
            this.f10163iobyxmoadg = cqumvgiudrVar;
            this.f10166zoijcleaow = j13;
            this.f10164ppxfxbqfkf = j14;
        }
    }

    private static final class draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Exception f10167iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f10169zoijcleaow = -9223372036854775807L;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private long f10168ppxfxbqfkf = -9223372036854775807L;

        public void iobyxmoadg() {
            this.f10167iobyxmoadg = null;
            this.f10169zoijcleaow = -9223372036854775807L;
            this.f10168ppxfxbqfkf = -9223372036854775807L;
        }

        public void ppxfxbqfkf(Exception exc) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f10167iobyxmoadg == null) {
                this.f10167iobyxmoadg = exc;
            }
            if (this.f10169zoijcleaow == -9223372036854775807L && !DefaultAudioSink.vipkmwdibw()) {
                this.f10169zoijcleaow = 200 + jElapsedRealtime;
            }
            long j13 = this.f10169zoijcleaow;
            if (j13 == -9223372036854775807L || jElapsedRealtime < j13) {
                this.f10168ppxfxbqfkf = jElapsedRealtime + 50;
                return;
            }
            Exception exc2 = this.f10167iobyxmoadg;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f10167iobyxmoadg;
            iobyxmoadg();
            throw exc3;
        }

        public boolean zoijcleaow() {
            if (this.f10167iobyxmoadg == null) {
                return false;
            }
            return DefaultAudioSink.vipkmwdibw() || SystemClock.elapsedRealtime() < this.f10168ppxfxbqfkf;
        }
    }

    public static class dxjokdxxww implements w2.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AudioProcessor[] f10170iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final androidx.media3.common.audio.wkgbmnqykc f10171ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final pkzmftpjix f10172zoijcleaow;

        public dxjokdxxww(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new pkzmftpjix(), new androidx.media3.common.audio.wkgbmnqykc());
        }

        @Override // w2.gxszxtbevo
        public boolean eablkybsjg(boolean z13) {
            this.f10172zoijcleaow.cdpycssgdh(z13);
            return z13;
        }

        @Override // w2.gxszxtbevo
        public long iobyxmoadg(long j13) {
            return this.f10171ppxfxbqfkf.isActive() ? this.f10171ppxfxbqfkf.ppxfxbqfkf(j13) : j13;
        }

        @Override // w2.gxszxtbevo
        public cqumvgiudr ppxfxbqfkf(cqumvgiudr cqumvgiudrVar) {
            this.f10171ppxfxbqfkf.btonecajqb(cqumvgiudrVar.f115310iobyxmoadg);
            this.f10171ppxfxbqfkf.dxjokdxxww(cqumvgiudrVar.f115312zoijcleaow);
            return cqumvgiudrVar;
        }

        @Override // w2.gxszxtbevo
        public long wkgbmnqykc() {
            return this.f10172zoijcleaow.yggfygwlhe();
        }

        @Override // w2.gxszxtbevo
        public AudioProcessor[] zoijcleaow() {
            return this.f10170iobyxmoadg;
        }

        public dxjokdxxww(AudioProcessor[] audioProcessorArr, pkzmftpjix pkzmftpjixVar, androidx.media3.common.audio.wkgbmnqykc wkgbmnqykcVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f10170iobyxmoadg = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f10172zoijcleaow = pkzmftpjixVar;
            this.f10171ppxfxbqfkf = wkgbmnqykcVar;
            audioProcessorArr2[audioProcessorArr.length] = pkzmftpjixVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = wkgbmnqykcVar;
        }
    }

    public interface eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f10173iobyxmoadg = new androidx.media3.exoplayer.audio.gtknphoqwx.iobyxmoadg().nufgyqmvbu();

        int iobyxmoadg(int i13, int i14, int i15, int i16, int i17, int i18, double d13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AudioTrack f10174iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private AudioRouting.OnRoutingChangedListener f10175ppxfxbqfkf = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.btonecajqb
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f10202iobyxmoadg.zoijcleaow(audioRouting);
            }
        };

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final androidx.media3.exoplayer.audio.zoijcleaow f10176zoijcleaow;

        public gtknphoqwx(AudioTrack audioTrack, androidx.media3.exoplayer.audio.zoijcleaow zoijcleaowVar) {
            this.f10174iobyxmoadg = audioTrack;
            this.f10176zoijcleaow = zoijcleaowVar;
            audioTrack.addOnRoutingChangedListener(this.f10175ppxfxbqfkf, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zoijcleaow(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.f10175ppxfxbqfkf == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            this.f10176zoijcleaow.dxjokdxxww(routedDevice);
        }

        public void ppxfxbqfkf() {
            this.f10174iobyxmoadg.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) y2.iobyxmoadg.eablkybsjg(this.f10175ppxfxbqfkf));
            this.f10175ppxfxbqfkf = null;
        }
    }

    public interface gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f10177iobyxmoadg = new androidx.media3.exoplayer.audio.draadjrbmk();

        AudioTrack iobyxmoadg(AudioSink.iobyxmoadg iobyxmoadgVar, v2.ppxfxbqfkf ppxfxbqfkfVar, int i13);
    }

    public static final class lqeggnwhkg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private ExoPlayer.iobyxmoadg f10178btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private wkgbmnqykc f10179dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f10180eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f10181gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f10182iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private w2.gxszxtbevo f10185ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f10186wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private androidx.media3.exoplayer.audio.iobyxmoadg f10187zoijcleaow = androidx.media3.exoplayer.audio.iobyxmoadg.f10235ppxfxbqfkf;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private eablkybsjg f10183lqeggnwhkg = eablkybsjg.f10173iobyxmoadg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private gxszxtbevo f10184nufgyqmvbu = gxszxtbevo.f10177iobyxmoadg;

        public lqeggnwhkg(Context context) {
            this.f10182iobyxmoadg = context;
        }

        public DefaultAudioSink btonecajqb() {
            y2.iobyxmoadg.lqeggnwhkg(!this.f10181gxszxtbevo);
            this.f10181gxszxtbevo = true;
            if (this.f10185ppxfxbqfkf == null) {
                this.f10185ppxfxbqfkf = new dxjokdxxww(new AudioProcessor[0]);
            }
            if (this.f10179dxjokdxxww == null) {
                this.f10179dxjokdxxww = new androidx.media3.exoplayer.audio.dxjokdxxww(this.f10182iobyxmoadg);
            }
            return new DefaultAudioSink(this);
        }

        public lqeggnwhkg draadjrbmk(boolean z13) {
            this.f10186wkgbmnqykc = z13;
            return this;
        }

        public lqeggnwhkg gtknphoqwx(boolean z13) {
            this.f10180eablkybsjg = z13;
            return this;
        }
    }

    private static final class nufgyqmvbu {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public final boolean f10188btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        public final boolean f10189draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public final androidx.media3.common.audio.iobyxmoadg f10190dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final int f10191eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        public final boolean f10192gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final int f10193gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final androidx.media3.common.iobyxmoadg f10194iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public final int f10195lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public final int f10196nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f10197ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f10198wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f10199zoijcleaow;

        public nufgyqmvbu(androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i13, int i14, int i15, int i16, int i17, int i18, int i19, androidx.media3.common.audio.iobyxmoadg iobyxmoadgVar2, boolean z13, boolean z14, boolean z15) {
            this.f10194iobyxmoadg = iobyxmoadgVar;
            this.f10199zoijcleaow = i13;
            this.f10197ppxfxbqfkf = i14;
            this.f10198wkgbmnqykc = i15;
            this.f10191eablkybsjg = i16;
            this.f10193gxszxtbevo = i17;
            this.f10195lqeggnwhkg = i18;
            this.f10196nufgyqmvbu = i19;
            this.f10190dxjokdxxww = iobyxmoadgVar2;
            this.f10188btonecajqb = z13;
            this.f10192gtknphoqwx = z14;
            this.f10189draadjrbmk = z15;
        }

        public long eablkybsjg(long j13) {
            return stevsuqkhv.a(j13, this.f10194iobyxmoadg.f9759iozdgvuglv);
        }

        public boolean gxszxtbevo() {
            return this.f10197ppxfxbqfkf == 1;
        }

        public AudioSink.iobyxmoadg iobyxmoadg() {
            return new AudioSink.iobyxmoadg(this.f10195lqeggnwhkg, this.f10191eablkybsjg, this.f10193gxszxtbevo, this.f10189draadjrbmk, this.f10197ppxfxbqfkf == 1, this.f10196nufgyqmvbu);
        }

        public nufgyqmvbu ppxfxbqfkf(int i13) {
            return new nufgyqmvbu(this.f10194iobyxmoadg, this.f10199zoijcleaow, this.f10197ppxfxbqfkf, this.f10198wkgbmnqykc, this.f10191eablkybsjg, this.f10193gxszxtbevo, this.f10195lqeggnwhkg, i13, this.f10190dxjokdxxww, this.f10188btonecajqb, this.f10192gtknphoqwx, this.f10189draadjrbmk);
        }

        public long wkgbmnqykc(long j13) {
            return stevsuqkhv.a(j13, this.f10191eablkybsjg);
        }

        public boolean zoijcleaow(nufgyqmvbu nufgyqmvbuVar) {
            return nufgyqmvbuVar.f10197ppxfxbqfkf == this.f10197ppxfxbqfkf && nufgyqmvbuVar.f10195lqeggnwhkg == this.f10195lqeggnwhkg && nufgyqmvbuVar.f10191eablkybsjg == this.f10191eablkybsjg && nufgyqmvbuVar.f10193gxszxtbevo == this.f10193gxszxtbevo && nufgyqmvbuVar.f10198wkgbmnqykc == this.f10198wkgbmnqykc && nufgyqmvbuVar.f10188btonecajqb == this.f10188btonecajqb && nufgyqmvbuVar.f10192gtknphoqwx == this.f10192gtknphoqwx;
        }
    }

    private static final class ppxfxbqfkf {
        public static void iobyxmoadg(AudioTrack audioTrack, h0 h0Var) {
            LogSessionId logSessionIdIobyxmoadg = h0Var.iobyxmoadg();
            if (logSessionIdIobyxmoadg.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdIobyxmoadg);
        }
    }

    private final class wflxmlrfwp implements androidx.media3.exoplayer.audio.lqeggnwhkg.iobyxmoadg {
        private wflxmlrfwp() {
        }

        @Override // androidx.media3.exoplayer.audio.lqeggnwhkg.iobyxmoadg
        public void eablkybsjg(long j13, long j14, long j15, long j16) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j13 + ", " + j14 + ", " + j15 + ", " + j16 + ", " + DefaultAudioSink.this.crxdokpmqz() + ", " + DefaultAudioSink.this.jlmebxxoox();
            if (DefaultAudioSink.f10093ydmasvzmpa) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            kcexrzcfyt.nufgyqmvbu("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.lqeggnwhkg.iobyxmoadg
        public void iobyxmoadg(int i13, long j13) {
            if (DefaultAudioSink.this.f10155zdlpuopuiu != null) {
                DefaultAudioSink.this.f10155zdlpuopuiu.nufgyqmvbu(i13, j13, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f10120jztzpxfvev);
            }
        }

        @Override // androidx.media3.exoplayer.audio.lqeggnwhkg.iobyxmoadg
        public void ppxfxbqfkf(long j13) {
            kcexrzcfyt.nufgyqmvbu("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j13);
        }

        @Override // androidx.media3.exoplayer.audio.lqeggnwhkg.iobyxmoadg
        public void wkgbmnqykc(long j13, long j14, long j15, long j16) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j13 + ", " + j14 + ", " + j15 + ", " + j16 + ", " + DefaultAudioSink.this.crxdokpmqz() + ", " + DefaultAudioSink.this.jlmebxxoox();
            if (DefaultAudioSink.f10093ydmasvzmpa) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            kcexrzcfyt.nufgyqmvbu("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.lqeggnwhkg.iobyxmoadg
        public void zoijcleaow(long j13) {
            if (DefaultAudioSink.this.f10155zdlpuopuiu != null) {
                DefaultAudioSink.this.f10155zdlpuopuiu.zoijcleaow(j13);
            }
        }
    }

    public interface wkgbmnqykc {
        androidx.media3.exoplayer.audio.wkgbmnqykc iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar, v2.ppxfxbqfkf ppxfxbqfkfVar);
    }

    private static final class zoijcleaow {
        public static long iobyxmoadg(AudioTrack audioTrack, nufgyqmvbu nufgyqmvbuVar) {
            return nufgyqmvbuVar.f10197ppxfxbqfkf == 0 ? nufgyqmvbuVar.wkgbmnqykc(audioTrack.getBufferSizeInFrames()) : stevsuqkhv.d(audioTrack.getBufferSizeInFrames(), 1000000L, androidx.media3.exoplayer.audio.gtknphoqwx.wkgbmnqykc(nufgyqmvbuVar.f10195lqeggnwhkg), RoundingMode.DOWN);
        }

        public static void zoijcleaow(AudioTrack audioTrack, androidx.media3.exoplayer.audio.ppxfxbqfkf ppxfxbqfkfVar) {
            audioTrack.setPreferredDevice(ppxfxbqfkfVar == null ? null : ppxfxbqfkfVar.f10288iobyxmoadg);
        }
    }

    private static int auzgnhcxok(AudioTrack audioTrack, ByteBuffer byteBuffer, int i13) {
        return audioTrack.write(byteBuffer, i13, 1);
    }

    private static void bfopjjpdmp(final AudioTrack audioTrack, final AudioSink.zoijcleaow zoijcleaowVar, final AudioSink.iobyxmoadg iobyxmoadgVar) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f10092sflfametgt) {
            try {
                if (f10094zfvoamnweg == null) {
                    f10094zfvoamnweg = stevsuqkhv.fmlbqenlif("ExoPlayer:AudioTrackReleaseThread");
                }
                f10091oipsdeybqn++;
                f10094zfvoamnweg.schedule(new Runnable() { // from class: h3.esjtqupxsv
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink.metgxyhuhe(audioTrack, zoijcleaowVar, handler, iobyxmoadgVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void cllcsxoeiz(long j13) {
        cqumvgiudr cqumvgiudrVarPpxfxbqfkf;
        if (uawqvzlxes()) {
            cqumvgiudrVarPpxfxbqfkf = cqumvgiudr.f115309wkgbmnqykc;
        } else {
            cqumvgiudrVarPpxfxbqfkf = tbqsvytpvh() ? this.f10156zoijcleaow.ppxfxbqfkf(this.f10151yadqdtsiqt) : cqumvgiudr.f115309wkgbmnqykc;
            this.f10151yadqdtsiqt = cqumvgiudrVarPpxfxbqfkf;
        }
        cqumvgiudr cqumvgiudrVar = cqumvgiudrVarPpxfxbqfkf;
        this.f10113iozdgvuglv = tbqsvytpvh() ? this.f10156zoijcleaow.eablkybsjg(this.f10113iozdgvuglv) : false;
        this.f10104dxjokdxxww.add(new btonecajqb(cqumvgiudrVar, Math.max(0L, j13), this.f10119jyumaefscl.wkgbmnqykc(jlmebxxoox())));
        nuxfzjnpeb();
        AudioSink.zoijcleaow zoijcleaowVar = this.f10155zdlpuopuiu;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.wkgbmnqykc(this.f10113iozdgvuglv);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long crxdokpmqz() {
        nufgyqmvbu nufgyqmvbuVar = this.f10119jyumaefscl;
        return nufgyqmvbuVar.f10197ppxfxbqfkf == 0 ? this.f10154ylkuphrtab / ((long) nufgyqmvbuVar.f10199zoijcleaow) : this.f10133pkzmftpjix;
    }

    private ByteBuffer czzsidtyhn(ByteBuffer byteBuffer) {
        if (this.f10119jyumaefscl.f10197ppxfxbqfkf != 0) {
            return byteBuffer;
        }
        int iYadqdtsiqt = (int) stevsuqkhv.yadqdtsiqt(stevsuqkhv.ixidwrxhsl(20L), this.f10119jyumaefscl.f10191eablkybsjg);
        long jJlmebxxoox = jlmebxxoox();
        if (jJlmebxxoox >= iYadqdtsiqt) {
            return byteBuffer;
        }
        nufgyqmvbu nufgyqmvbuVar = this.f10119jyumaefscl;
        return ylkuphrtab.iobyxmoadg(byteBuffer, nufgyqmvbuVar.f10195lqeggnwhkg, nufgyqmvbuVar.f10198wkgbmnqykc, (int) jJlmebxxoox, iYadqdtsiqt);
    }

    private long dsvhmnatus(long j13) {
        while (!this.f10104dxjokdxxww.isEmpty() && j13 >= ((btonecajqb) this.f10104dxjokdxxww.getFirst()).f10164ppxfxbqfkf) {
            this.f10097cdpycssgdh = (btonecajqb) this.f10104dxjokdxxww.remove();
        }
        btonecajqb btonecajqbVar = this.f10097cdpycssgdh;
        long j14 = j13 - btonecajqbVar.f10164ppxfxbqfkf;
        long jIkoacuggdj = stevsuqkhv.ikoacuggdj(j14, btonecajqbVar.f10163iobyxmoadg.f115310iobyxmoadg);
        if (!this.f10104dxjokdxxww.isEmpty()) {
            btonecajqb btonecajqbVar2 = this.f10097cdpycssgdh;
            return btonecajqbVar2.f10166zoijcleaow + jIkoacuggdj + btonecajqbVar2.f10165wkgbmnqykc;
        }
        long jIobyxmoadg = this.f10156zoijcleaow.iobyxmoadg(j14);
        btonecajqb btonecajqbVar3 = this.f10097cdpycssgdh;
        long j15 = btonecajqbVar3.f10166zoijcleaow + jIobyxmoadg;
        btonecajqbVar3.f10165wkgbmnqykc = jIobyxmoadg - jIkoacuggdj;
        return j15;
    }

    private static boolean ikoacuggdj(int i13) {
        return (stevsuqkhv.f123602iobyxmoadg >= 24 && i13 == -6) || i13 == -32;
    }

    private int iwxlajgraz(AudioTrack audioTrack, ByteBuffer byteBuffer, int i13, long j13) {
        if (stevsuqkhv.f123602iobyxmoadg >= 26) {
            return audioTrack.write(byteBuffer, i13, 1, j13 * 1000);
        }
        if (this.f10124lmojexxdyd == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f10124lmojexxdyd = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f10124lmojexxdyd.putInt(1431633921);
        }
        if (this.f10148wwaezpbzkn == 0) {
            this.f10124lmojexxdyd.putInt(4, i13);
            this.f10124lmojexxdyd.putLong(8, j13 * 1000);
            this.f10124lmojexxdyd.position(0);
            this.f10148wwaezpbzkn = i13;
        }
        int iRemaining = this.f10124lmojexxdyd.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f10124lmojexxdyd, iRemaining, 1);
            if (iWrite < 0) {
                this.f10148wwaezpbzkn = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iAuzgnhcxok = auzgnhcxok(audioTrack, byteBuffer, i13);
        if (iAuzgnhcxok < 0) {
            this.f10148wwaezpbzkn = 0;
            return iAuzgnhcxok;
        }
        this.f10148wwaezpbzkn -= iAuzgnhcxok;
        return iAuzgnhcxok;
    }

    private void iyctptxqzt(cqumvgiudr cqumvgiudrVar) {
        btonecajqb btonecajqbVar = new btonecajqb(cqumvgiudrVar, -9223372036854775807L, -9223372036854775807L);
        if (okpsazkaxt()) {
            this.f10114istkbnxepw = btonecajqbVar;
        } else {
            this.f10097cdpycssgdh = btonecajqbVar;
        }
    }

    private boolean jhduphickx() throws AudioSink.InitializationException {
        androidx.media3.exoplayer.audio.zoijcleaow zoijcleaowVar;
        h0 h0Var;
        if (this.f10146wflxmlrfwp.zoijcleaow()) {
            return false;
        }
        AudioTrack audioTrackTzroggbefp = tzroggbefp();
        this.f10099cqumvgiudr = audioTrackTzroggbefp;
        if (jztzpxfvev(audioTrackTzroggbefp)) {
            oipsdeybqn(this.f10099cqumvgiudr);
            nufgyqmvbu nufgyqmvbuVar = this.f10119jyumaefscl;
            if (nufgyqmvbuVar.f10192gtknphoqwx) {
                AudioTrack audioTrack = this.f10099cqumvgiudr;
                androidx.media3.common.iobyxmoadg iobyxmoadgVar = nufgyqmvbuVar.f10194iobyxmoadg;
                audioTrack.setOffloadDelayPadding(iobyxmoadgVar.f9778wwaezpbzkn, iobyxmoadgVar.f9781ylkuphrtab);
            }
        }
        int i13 = stevsuqkhv.f123602iobyxmoadg;
        if (i13 >= 31 && (h0Var = this.f10121kcexrzcfyt) != null) {
            ppxfxbqfkf.iobyxmoadg(this.f10099cqumvgiudr, h0Var);
        }
        this.f10137ribwqtqdhb = this.f10099cqumvgiudr.getAudioSessionId();
        androidx.media3.exoplayer.audio.lqeggnwhkg lqeggnwhkgVar = this.f10129nufgyqmvbu;
        AudioTrack audioTrack2 = this.f10099cqumvgiudr;
        nufgyqmvbu nufgyqmvbuVar2 = this.f10119jyumaefscl;
        lqeggnwhkgVar.kcexrzcfyt(audioTrack2, nufgyqmvbuVar2.f10197ppxfxbqfkf == 2, nufgyqmvbuVar2.f10195lqeggnwhkg, nufgyqmvbuVar2.f10198wkgbmnqykc, nufgyqmvbuVar2.f10196nufgyqmvbu);
        zeieaojujs();
        int i14 = this.f10145vipkmwdibw.f115358iobyxmoadg;
        if (i14 != 0) {
            this.f10099cqumvgiudr.attachAuxEffect(i14);
            this.f10099cqumvgiudr.setAuxEffectSendLevel(this.f10145vipkmwdibw.f115359zoijcleaow);
        }
        androidx.media3.exoplayer.audio.ppxfxbqfkf ppxfxbqfkfVar = this.f10116jhduphickx;
        if (ppxfxbqfkfVar != null && i13 >= 23) {
            zoijcleaow.zoijcleaow(this.f10099cqumvgiudr, ppxfxbqfkfVar);
            androidx.media3.exoplayer.audio.zoijcleaow zoijcleaowVar2 = this.f10123lereixgezr;
            if (zoijcleaowVar2 != null) {
                zoijcleaowVar2.dxjokdxxww(this.f10116jhduphickx.f10288iobyxmoadg);
            }
        }
        if (i13 >= 24 && (zoijcleaowVar = this.f10123lereixgezr) != null) {
            this.f10134pmvmpeiblj = new gtknphoqwx(this.f10099cqumvgiudr, zoijcleaowVar);
        }
        this.f10103dsvhmnatus = true;
        AudioSink.zoijcleaow zoijcleaowVar3 = this.f10155zdlpuopuiu;
        if (zoijcleaowVar3 != null) {
            zoijcleaowVar3.iobyxmoadg(this.f10119jyumaefscl.iobyxmoadg());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long jlmebxxoox() {
        nufgyqmvbu nufgyqmvbuVar = this.f10119jyumaefscl;
        return nufgyqmvbuVar.f10197ppxfxbqfkf == 0 ? stevsuqkhv.gtknphoqwx(this.f10109hcddaimhww, nufgyqmvbuVar.f10198wkgbmnqykc) : this.f10118jpowsppfya;
    }

    private static boolean jztzpxfvev(AudioTrack audioTrack) {
        return stevsuqkhv.f123602iobyxmoadg >= 29 && audioTrack.isOffloadedPlayback();
    }

    private AudioTrack kegysxyocb(nufgyqmvbu nufgyqmvbuVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackStevsuqkhv = stevsuqkhv(nufgyqmvbuVar.iobyxmoadg(), this.f10157zynmafqrjb, this.f10137ribwqtqdhb, nufgyqmvbuVar.f10194iobyxmoadg);
            ExoPlayer.iobyxmoadg iobyxmoadgVar = this.f10144vdvldrhtss;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.istkbnxepw(jztzpxfvev(audioTrackStevsuqkhv));
            }
            return audioTrackStevsuqkhv;
        } catch (AudioSink.InitializationException e13) {
            AudioSink.zoijcleaow zoijcleaowVar = this.f10155zdlpuopuiu;
            if (zoijcleaowVar != null) {
                zoijcleaowVar.eablkybsjg(e13);
            }
            throw e13;
        }
    }

    private void lrnfpwlwnk(ByteBuffer byteBuffer) {
        y2.iobyxmoadg.lqeggnwhkg(this.f10126mbcevpiqjq == null);
        if (byteBuffer.hasRemaining()) {
            this.f10126mbcevpiqjq = czzsidtyhn(byteBuffer);
        }
    }

    private void mbcevpiqjq(long j13) throws Exception {
        int iAuzgnhcxok;
        AudioSink.zoijcleaow zoijcleaowVar;
        if (this.f10126mbcevpiqjq == null || this.f10095agtfadlqog.zoijcleaow()) {
            return;
        }
        int iRemaining = this.f10126mbcevpiqjq.remaining();
        boolean z13 = false;
        if (this.f10111ikoacuggdj) {
            y2.iobyxmoadg.lqeggnwhkg(j13 != -9223372036854775807L);
            if (j13 == Long.MIN_VALUE) {
                j13 = this.f10131okpsazkaxt;
            } else {
                this.f10131okpsazkaxt = j13;
            }
            iAuzgnhcxok = iwxlajgraz(this.f10099cqumvgiudr, this.f10126mbcevpiqjq, iRemaining, j13);
        } else {
            iAuzgnhcxok = auzgnhcxok(this.f10099cqumvgiudr, this.f10126mbcevpiqjq, iRemaining);
        }
        this.f10120jztzpxfvev = SystemClock.elapsedRealtime();
        if (iAuzgnhcxok < 0) {
            if (ikoacuggdj(iAuzgnhcxok)) {
                if (jlmebxxoox() > 0) {
                    z13 = true;
                } else if (jztzpxfvev(this.f10099cqumvgiudr)) {
                    rlfsiqarku();
                    z13 = true;
                }
            }
            AudioSink.WriteException writeException = new AudioSink.WriteException(iAuzgnhcxok, this.f10119jyumaefscl.f10194iobyxmoadg, z13);
            AudioSink.zoijcleaow zoijcleaowVar2 = this.f10155zdlpuopuiu;
            if (zoijcleaowVar2 != null) {
                zoijcleaowVar2.eablkybsjg(writeException);
            }
            if (!writeException.f10083yggfygwlhe || this.f10112iobyxmoadg == null) {
                this.f10095agtfadlqog.ppxfxbqfkf(writeException);
                return;
            } else {
                this.f10106esjtqupxsv = androidx.media3.exoplayer.audio.iobyxmoadg.f10235ppxfxbqfkf;
                throw writeException;
            }
        }
        this.f10095agtfadlqog.iobyxmoadg();
        if (jztzpxfvev(this.f10099cqumvgiudr)) {
            if (this.f10118jpowsppfya > 0) {
                this.f10127metgxyhuhe = false;
            }
            if (this.f10100crxdokpmqz && (zoijcleaowVar = this.f10155zdlpuopuiu) != null && iAuzgnhcxok < iRemaining && !this.f10127metgxyhuhe) {
                zoijcleaowVar.lqeggnwhkg();
            }
        }
        int i13 = this.f10119jyumaefscl.f10197ppxfxbqfkf;
        if (i13 == 0) {
            this.f10109hcddaimhww += (long) iAuzgnhcxok;
        }
        if (iAuzgnhcxok == iRemaining) {
            if (i13 != 0) {
                y2.iobyxmoadg.lqeggnwhkg(this.f10126mbcevpiqjq == this.f10122kegysxyocb);
                this.f10118jpowsppfya += ((long) this.f10110hkdspvbjdz) * ((long) this.f10141tzroggbefp);
            }
            this.f10126mbcevpiqjq = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void metgxyhuhe(AudioTrack audioTrack, final AudioSink.zoijcleaow zoijcleaowVar, Handler handler, final AudioSink.iobyxmoadg iobyxmoadgVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zoijcleaowVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: h3.zynmafqrjb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zoijcleaowVar.ppxfxbqfkf(iobyxmoadgVar);
                    }
                });
            }
            synchronized (f10092sflfametgt) {
                try {
                    int i13 = f10091oipsdeybqn - 1;
                    f10091oipsdeybqn = i13;
                    if (i13 == 0) {
                        f10094zfvoamnweg.shutdown();
                        f10094zfvoamnweg = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if (zoijcleaowVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: h3.zynmafqrjb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zoijcleaowVar.ppxfxbqfkf(iobyxmoadgVar);
                    }
                });
            }
            synchronized (f10092sflfametgt) {
                try {
                    int i14 = f10091oipsdeybqn - 1;
                    f10091oipsdeybqn = i14;
                    if (i14 == 0) {
                        f10094zfvoamnweg.shutdown();
                        f10094zfvoamnweg = null;
                    }
                    throw th3;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    private boolean ntlheqmsrt() throws Exception {
        if (!this.f10115iwizpuwonk.gxszxtbevo()) {
            mbcevpiqjq(Long.MIN_VALUE);
            return this.f10126mbcevpiqjq == null;
        }
        this.f10115iwizpuwonk.nufgyqmvbu();
        zfvoamnweg(Long.MIN_VALUE);
        if (!this.f10115iwizpuwonk.eablkybsjg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f10126mbcevpiqjq;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private void nuxfzjnpeb() {
        androidx.media3.common.audio.iobyxmoadg iobyxmoadgVar = this.f10119jyumaefscl.f10190dxjokdxxww;
        this.f10115iwizpuwonk = iobyxmoadgVar;
        iobyxmoadgVar.zoijcleaow();
    }

    private void oipsdeybqn(AudioTrack audioTrack) {
        if (this.f10102draadjrbmk == null) {
            this.f10102draadjrbmk = new agtfadlqog();
        }
        this.f10102draadjrbmk.iobyxmoadg(audioTrack);
    }

    private boolean okpsazkaxt() {
        return this.f10099cqumvgiudr != null;
    }

    private void opjhrmiecq() {
        this.f10154ylkuphrtab = 0L;
        this.f10133pkzmftpjix = 0L;
        this.f10109hcddaimhww = 0L;
        this.f10118jpowsppfya = 0L;
        this.f10127metgxyhuhe = false;
        this.f10110hkdspvbjdz = 0;
        this.f10097cdpycssgdh = new btonecajqb(this.f10151yadqdtsiqt, 0L, 0L);
        this.f10149wypolnanlu = 0L;
        this.f10114istkbnxepw = null;
        this.f10104dxjokdxxww.clear();
        this.f10122kegysxyocb = null;
        this.f10141tzroggbefp = 0;
        this.f10126mbcevpiqjq = null;
        this.f10142ulzqkzuiru = false;
        this.f10128ntlheqmsrt = false;
        this.f10139sopmlzcsov = false;
        this.f10124lmojexxdyd = null;
        this.f10148wwaezpbzkn = 0;
        this.f10105eablkybsjg.agtfadlqog();
        nuxfzjnpeb();
    }

    private void ribwqtqdhb(long j13) {
        this.f10143uwvvkdfqfp += j13;
        if (this.f10152yfnezrywwk == null) {
            this.f10152yfnezrywwk = new Handler(Looper.myLooper());
        }
        this.f10152yfnezrywwk.removeCallbacksAndMessages(null);
        this.f10152yfnezrywwk.postDelayed(new Runnable() { // from class: h3.pmvmpeiblj
            @Override // java.lang.Runnable
            public final void run() {
                this.f39270zdlpuopuiu.uwvvkdfqfp();
            }
        }, 100L);
    }

    private void rlfsiqarku() {
        if (this.f10119jyumaefscl.gxszxtbevo()) {
            this.f10150xrmfcynszj = true;
        }
    }

    private boolean roivzttewh(int i13) {
        return this.f10135ppxfxbqfkf && stevsuqkhv.dvvnrvtcbc(i13);
    }

    private void sflfametgt() {
        if (this.f10142ulzqkzuiru) {
            return;
        }
        this.f10142ulzqkzuiru = true;
        this.f10129nufgyqmvbu.lqeggnwhkg(jlmebxxoox());
        if (jztzpxfvev(this.f10099cqumvgiudr)) {
            this.f10139sopmlzcsov = false;
        }
        this.f10099cqumvgiudr.stop();
        this.f10148wwaezpbzkn = 0;
    }

    private static int sopmlzcsov(int i13, ByteBuffer byteBuffer) {
        if (i13 == 20) {
            return wwaezpbzkn.nufgyqmvbu(byteBuffer);
        }
        if (i13 != 30) {
            switch (i13) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iWflxmlrfwp = t3.iozdgvuglv.wflxmlrfwp(stevsuqkhv.dsvhmnatus(byteBuffer, byteBuffer.position()));
                    if (iWflxmlrfwp != -1) {
                        return iWflxmlrfwp;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return UserVerificationMethods.USER_VERIFY_ALL;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i13) {
                        case 14:
                            int iZoijcleaow = t3.zoijcleaow.zoijcleaow(byteBuffer);
                            if (iZoijcleaow == -1) {
                                return 0;
                            }
                            return t3.zoijcleaow.dxjokdxxww(byteBuffer, iZoijcleaow) * 16;
                        case 15:
                            return UserVerificationMethods.USER_VERIFY_NONE;
                        case 16:
                            return UserVerificationMethods.USER_VERIFY_ALL;
                        case 17:
                            return t3.ppxfxbqfkf.eablkybsjg(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i13);
                    }
                    break;
            }
            return t3.zoijcleaow.eablkybsjg(byteBuffer);
        }
        return t3.ojitshcjhn.gxszxtbevo(byteBuffer);
    }

    private AudioTrack stevsuqkhv(AudioSink.iobyxmoadg iobyxmoadgVar, v2.ppxfxbqfkf ppxfxbqfkfVar, int i13, androidx.media3.common.iobyxmoadg iobyxmoadgVar2) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackIobyxmoadg = this.f10132oxmwwwfdhm.iobyxmoadg(iobyxmoadgVar, ppxfxbqfkfVar, i13);
            int state = audioTrackIobyxmoadg.getState();
            if (state == 1) {
                return audioTrackIobyxmoadg;
            }
            try {
                audioTrackIobyxmoadg.release();
            } catch (Exception unused) {
            }
            throw new AudioSink.InitializationException(state, iobyxmoadgVar.f10090zoijcleaow, iobyxmoadgVar.f10088ppxfxbqfkf, iobyxmoadgVar.f10087iobyxmoadg, iobyxmoadgVar2, iobyxmoadgVar.f10085eablkybsjg, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e13) {
            throw new AudioSink.InitializationException(0, iobyxmoadgVar.f10090zoijcleaow, iobyxmoadgVar.f10088ppxfxbqfkf, iobyxmoadgVar.f10087iobyxmoadg, iobyxmoadgVar2, iobyxmoadgVar.f10085eablkybsjg, e13);
        }
    }

    private boolean tbqsvytpvh() {
        if (!this.f10111ikoacuggdj) {
            nufgyqmvbu nufgyqmvbuVar = this.f10119jyumaefscl;
            if (nufgyqmvbuVar.f10197ppxfxbqfkf == 0 && !roivzttewh(nufgyqmvbuVar.f10194iobyxmoadg.f9766lmojexxdyd)) {
                return true;
            }
        }
        return false;
    }

    private AudioTrack tzroggbefp() throws AudioSink.InitializationException {
        try {
            return kegysxyocb((nufgyqmvbu) y2.iobyxmoadg.eablkybsjg(this.f10119jyumaefscl));
        } catch (AudioSink.InitializationException e13) {
            nufgyqmvbu nufgyqmvbuVar = this.f10119jyumaefscl;
            if (nufgyqmvbuVar.f10196nufgyqmvbu > 1000000) {
                nufgyqmvbu nufgyqmvbuVarPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf(1000000);
                try {
                    AudioTrack audioTrackKegysxyocb = kegysxyocb(nufgyqmvbuVarPpxfxbqfkf);
                    this.f10119jyumaefscl = nufgyqmvbuVarPpxfxbqfkf;
                    return audioTrackKegysxyocb;
                } catch (AudioSink.InitializationException e14) {
                    e13.addSuppressed(e14);
                    rlfsiqarku();
                    throw e13;
                }
            }
            rlfsiqarku();
            throw e13;
        }
    }

    private boolean uawqvzlxes() {
        nufgyqmvbu nufgyqmvbuVar = this.f10119jyumaefscl;
        return nufgyqmvbuVar != null && nufgyqmvbuVar.f10188btonecajqb && stevsuqkhv.f123602iobyxmoadg >= 23;
    }

    private static int ulzqkzuiru(int i13, int i14, int i15) {
        int minBufferSize = AudioTrack.getMinBufferSize(i13, i14, i15);
        y2.iobyxmoadg.lqeggnwhkg(minBufferSize != -2);
        return minBufferSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uwvvkdfqfp() {
        if (this.f10143uwvvkdfqfp >= 300000) {
            this.f10155zdlpuopuiu.gxszxtbevo();
            this.f10143uwvvkdfqfp = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean vipkmwdibw() {
        boolean z13;
        synchronized (f10092sflfametgt) {
            z13 = f10091oipsdeybqn > 0;
        }
        return z13;
    }

    private void weqkydbzbr() {
        if (okpsazkaxt()) {
            try {
                this.f10099cqumvgiudr.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f10151yadqdtsiqt.f115310iobyxmoadg).setPitch(this.f10151yadqdtsiqt.f115312zoijcleaow).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e13) {
                kcexrzcfyt.dxjokdxxww("DefaultAudioSink", "Failed to set playback params", e13);
            }
            cqumvgiudr cqumvgiudrVar = new cqumvgiudr(this.f10099cqumvgiudr.getPlaybackParams().getSpeed(), this.f10099cqumvgiudr.getPlaybackParams().getPitch());
            this.f10151yadqdtsiqt = cqumvgiudrVar;
            this.f10129nufgyqmvbu.zdlpuopuiu(cqumvgiudrVar.f115310iobyxmoadg);
        }
    }

    private long wypolnanlu(long j13) {
        long jWkgbmnqykc = this.f10156zoijcleaow.wkgbmnqykc();
        long jWkgbmnqykc2 = j13 + this.f10119jyumaefscl.wkgbmnqykc(jWkgbmnqykc);
        long j14 = this.f10101czzsidtyhn;
        if (jWkgbmnqykc > j14) {
            long jWkgbmnqykc3 = this.f10119jyumaefscl.wkgbmnqykc(jWkgbmnqykc - j14);
            this.f10101czzsidtyhn = jWkgbmnqykc;
            ribwqtqdhb(jWkgbmnqykc3);
        }
        return jWkgbmnqykc2;
    }

    private void yfnezrywwk() {
        if (this.f10123lereixgezr == null && this.f10112iobyxmoadg != null) {
            this.f10138rlfsiqarku = Looper.myLooper();
            androidx.media3.exoplayer.audio.zoijcleaow zoijcleaowVar = new androidx.media3.exoplayer.audio.zoijcleaow(this.f10112iobyxmoadg, new androidx.media3.exoplayer.audio.zoijcleaow.gxszxtbevo() { // from class: h3.lereixgezr
                @Override // androidx.media3.exoplayer.audio.zoijcleaow.gxszxtbevo
                public final void iobyxmoadg(androidx.media3.exoplayer.audio.iobyxmoadg iobyxmoadgVar) {
                    this.f39246iobyxmoadg.ydmasvzmpa(iobyxmoadgVar);
                }
            }, this.f10157zynmafqrjb, this.f10116jhduphickx);
            this.f10123lereixgezr = zoijcleaowVar;
            this.f10106esjtqupxsv = zoijcleaowVar.lqeggnwhkg();
        }
        y2.iobyxmoadg.eablkybsjg(this.f10106esjtqupxsv);
    }

    private void zeieaojujs() {
        if (okpsazkaxt()) {
            this.f10099cqumvgiudr.setVolume(this.f10140stevsuqkhv);
        }
    }

    private void zfvoamnweg(long j13) throws Exception {
        mbcevpiqjq(j13);
        if (this.f10126mbcevpiqjq != null) {
            return;
        }
        if (!this.f10115iwizpuwonk.gxszxtbevo()) {
            ByteBuffer byteBuffer = this.f10122kegysxyocb;
            if (byteBuffer != null) {
                lrnfpwlwnk(byteBuffer);
                mbcevpiqjq(j13);
                return;
            }
            return;
        }
        while (!this.f10115iwizpuwonk.eablkybsjg()) {
            do {
                ByteBuffer byteBufferWkgbmnqykc = this.f10115iwizpuwonk.wkgbmnqykc();
                if (byteBufferWkgbmnqykc.hasRemaining()) {
                    lrnfpwlwnk(byteBufferWkgbmnqykc);
                    mbcevpiqjq(j13);
                } else {
                    ByteBuffer byteBuffer2 = this.f10122kegysxyocb;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f10115iwizpuwonk.dxjokdxxww(this.f10122kegysxyocb);
                    }
                }
            } while (this.f10126mbcevpiqjq == null);
            return;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void agtfadlqog(int i13) {
        y2.iobyxmoadg.lqeggnwhkg(stevsuqkhv.f123602iobyxmoadg >= 29);
        this.f10107gtknphoqwx = i13;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean btonecajqb() {
        return okpsazkaxt() && !(stevsuqkhv.f123602iobyxmoadg >= 29 && this.f10099cqumvgiudr.isOffloadedPlayback() && this.f10139sopmlzcsov) && this.f10129nufgyqmvbu.nufgyqmvbu(jlmebxxoox());
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void cdpycssgdh(boolean z13) {
        this.f10113iozdgvuglv = z13;
        iyctptxqzt(uawqvzlxes() ? cqumvgiudr.f115309wkgbmnqykc : this.f10151yadqdtsiqt);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long draadjrbmk() {
        if (!okpsazkaxt()) {
            return -9223372036854775807L;
        }
        if (stevsuqkhv.f123602iobyxmoadg >= 23) {
            return zoijcleaow.iobyxmoadg(this.f10099cqumvgiudr, this.f10119jyumaefscl);
        }
        nufgyqmvbu nufgyqmvbuVar = this.f10119jyumaefscl;
        return stevsuqkhv.d(this.f10119jyumaefscl.f10196nufgyqmvbu, 1000000L, nufgyqmvbuVar.f10197ppxfxbqfkf == 0 ? ((long) nufgyqmvbuVar.f10191eablkybsjg) * ((long) nufgyqmvbuVar.f10198wkgbmnqykc) : androidx.media3.exoplayer.audio.gtknphoqwx.wkgbmnqykc(nufgyqmvbuVar.f10195lqeggnwhkg), RoundingMode.DOWN);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void dxjokdxxww(AudioDeviceInfo audioDeviceInfo) {
        this.f10116jhduphickx = audioDeviceInfo == null ? null : new androidx.media3.exoplayer.audio.ppxfxbqfkf(audioDeviceInfo);
        androidx.media3.exoplayer.audio.zoijcleaow zoijcleaowVar = this.f10123lereixgezr;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.dxjokdxxww(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f10099cqumvgiudr;
        if (audioTrack != null) {
            zoijcleaow.zoijcleaow(audioTrack, this.f10116jhduphickx);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void eablkybsjg(cqumvgiudr cqumvgiudrVar) {
        this.f10151yadqdtsiqt = new cqumvgiudr(stevsuqkhv.agtfadlqog(cqumvgiudrVar.f115310iobyxmoadg, 0.1f, 8.0f), stevsuqkhv.agtfadlqog(cqumvgiudrVar.f115312zoijcleaow, 0.1f, 8.0f));
        if (uawqvzlxes()) {
            weqkydbzbr();
        } else {
            iyctptxqzt(cqumvgiudrVar);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void esjtqupxsv() {
        this.f10098cllcsxoeiz = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        gtknphoqwx gtknphoqwxVar;
        if (okpsazkaxt()) {
            opjhrmiecq();
            if (this.f10129nufgyqmvbu.dxjokdxxww()) {
                this.f10099cqumvgiudr.pause();
            }
            if (jztzpxfvev(this.f10099cqumvgiudr)) {
                ((agtfadlqog) y2.iobyxmoadg.eablkybsjg(this.f10102draadjrbmk)).zoijcleaow(this.f10099cqumvgiudr);
            }
            AudioSink.iobyxmoadg iobyxmoadgVarIobyxmoadg = this.f10119jyumaefscl.iobyxmoadg();
            nufgyqmvbu nufgyqmvbuVar = this.f10153yggfygwlhe;
            if (nufgyqmvbuVar != null) {
                this.f10119jyumaefscl = nufgyqmvbuVar;
                this.f10153yggfygwlhe = null;
            }
            this.f10129nufgyqmvbu.vdvldrhtss();
            if (stevsuqkhv.f123602iobyxmoadg >= 24 && (gtknphoqwxVar = this.f10134pmvmpeiblj) != null) {
                gtknphoqwxVar.ppxfxbqfkf();
                this.f10134pmvmpeiblj = null;
            }
            bfopjjpdmp(this.f10099cqumvgiudr, this.f10155zdlpuopuiu, iobyxmoadgVarIobyxmoadg);
            this.f10099cqumvgiudr = null;
        }
        this.f10095agtfadlqog.iobyxmoadg();
        this.f10146wflxmlrfwp.iobyxmoadg();
        this.f10101czzsidtyhn = 0L;
        this.f10143uwvvkdfqfp = 0L;
        Handler handler = this.f10152yfnezrywwk;
        if (handler != null) {
            ((Handler) y2.iobyxmoadg.eablkybsjg(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void gtknphoqwx(int i13) {
        if (this.f10137ribwqtqdhb != i13) {
            this.f10137ribwqtqdhb = i13;
            this.f10117jlmebxxoox = i13 != 0;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return istkbnxepw(iobyxmoadgVar) != 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int istkbnxepw(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        yfnezrywwk();
        if (!"audio/raw".equals(iobyxmoadgVar.f9769ojitshcjhn)) {
            return this.f10106esjtqupxsv.btonecajqb(iobyxmoadgVar, this.f10157zynmafqrjb) ? 2 : 0;
        }
        if (stevsuqkhv.skhdrjzrfn(iobyxmoadgVar.f9766lmojexxdyd)) {
            int i13 = iobyxmoadgVar.f9766lmojexxdyd;
            return (i13 == 2 || (this.f10135ppxfxbqfkf && i13 == 4)) ? 2 : 1;
        }
        kcexrzcfyt.nufgyqmvbu("DefaultAudioSink", "Invalid PCM encoding: " + iobyxmoadgVar.f9766lmojexxdyd);
        return 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long iwizpuwonk(boolean z13) {
        if (!okpsazkaxt() || this.f10103dsvhmnatus) {
            return Long.MIN_VALUE;
        }
        return wypolnanlu(dsvhmnatus(Math.min(this.f10129nufgyqmvbu.ppxfxbqfkf(), this.f10119jyumaefscl.wkgbmnqykc(jlmebxxoox()))));
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void jyumaefscl(v2.ppxfxbqfkf ppxfxbqfkfVar) {
        if (this.f10157zynmafqrjb.equals(ppxfxbqfkfVar)) {
            return;
        }
        this.f10157zynmafqrjb = ppxfxbqfkfVar;
        if (this.f10111ikoacuggdj) {
            return;
        }
        androidx.media3.exoplayer.audio.zoijcleaow zoijcleaowVar = this.f10123lereixgezr;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.nufgyqmvbu(ppxfxbqfkfVar);
        }
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void kcexrzcfyt(androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i13, int[] iArr) throws AudioSink.ConfigurationException {
        androidx.media3.common.audio.iobyxmoadg iobyxmoadgVar2;
        int iMetgxyhuhe;
        int iMetgxyhuhe2;
        boolean z13;
        int i14;
        int iIntValue;
        int i15;
        boolean z14;
        int i16;
        int iIobyxmoadg;
        yfnezrywwk();
        if ("audio/raw".equals(iobyxmoadgVar.f9769ojitshcjhn)) {
            y2.iobyxmoadg.iobyxmoadg(stevsuqkhv.skhdrjzrfn(iobyxmoadgVar.f9766lmojexxdyd));
            iMetgxyhuhe = stevsuqkhv.metgxyhuhe(iobyxmoadgVar.f9766lmojexxdyd, iobyxmoadgVar.f9779yadqdtsiqt);
            zdlpuopuiu.iobyxmoadg iobyxmoadgVar3 = new zdlpuopuiu.iobyxmoadg();
            if (roivzttewh(iobyxmoadgVar.f9766lmojexxdyd)) {
                iobyxmoadgVar3.btonecajqb(this.f10125lqeggnwhkg);
            } else {
                iobyxmoadgVar3.btonecajqb(this.f10108gxszxtbevo);
                iobyxmoadgVar3.dxjokdxxww(this.f10156zoijcleaow.zoijcleaow());
            }
            androidx.media3.common.audio.iobyxmoadg iobyxmoadgVar4 = new androidx.media3.common.audio.iobyxmoadg(iobyxmoadgVar3.gtknphoqwx());
            if (iobyxmoadgVar4.equals(this.f10115iwizpuwonk)) {
                iobyxmoadgVar4 = this.f10115iwizpuwonk;
            }
            this.f10105eablkybsjg.ojitshcjhn(iobyxmoadgVar.f9778wwaezpbzkn, iobyxmoadgVar.f9781ylkuphrtab);
            this.f10147wkgbmnqykc.wflxmlrfwp(iArr);
            try {
                AudioProcessor.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg(new AudioProcessor.iobyxmoadg(iobyxmoadgVar));
                int i17 = iobyxmoadgVarIobyxmoadg.f9653ppxfxbqfkf;
                int i18 = iobyxmoadgVarIobyxmoadg.f9652iobyxmoadg;
                int iJpowsppfya = stevsuqkhv.jpowsppfya(iobyxmoadgVarIobyxmoadg.f9655zoijcleaow);
                i16 = 0;
                z13 = false;
                iMetgxyhuhe2 = stevsuqkhv.metgxyhuhe(i17, iobyxmoadgVarIobyxmoadg.f9655zoijcleaow);
                iobyxmoadgVar2 = iobyxmoadgVar4;
                i14 = i18;
                iIntValue = iJpowsppfya;
                z14 = this.f10096btonecajqb;
                i15 = i17;
            } catch (AudioProcessor.UnhandledAudioFormatException e13) {
                throw new AudioSink.ConfigurationException(e13, iobyxmoadgVar);
            }
        } else {
            androidx.media3.common.audio.iobyxmoadg iobyxmoadgVar5 = new androidx.media3.common.audio.iobyxmoadg(zdlpuopuiu.zynmafqrjb());
            int i19 = iobyxmoadgVar.f9759iozdgvuglv;
            androidx.media3.exoplayer.audio.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = this.f10107gtknphoqwx != 0 ? nufgyqmvbu(iobyxmoadgVar) : androidx.media3.exoplayer.audio.wkgbmnqykc.f10307wkgbmnqykc;
            if (this.f10107gtknphoqwx == 0 || !wkgbmnqykcVarNufgyqmvbu.f10308iobyxmoadg) {
                Pair pairNufgyqmvbu = this.f10106esjtqupxsv.nufgyqmvbu(iobyxmoadgVar, this.f10157zynmafqrjb);
                if (pairNufgyqmvbu == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + iobyxmoadgVar, iobyxmoadgVar);
                }
                int iIntValue2 = ((Integer) pairNufgyqmvbu.first).intValue();
                iobyxmoadgVar2 = iobyxmoadgVar5;
                iMetgxyhuhe = -1;
                iMetgxyhuhe2 = -1;
                z13 = false;
                i14 = i19;
                iIntValue = ((Integer) pairNufgyqmvbu.second).intValue();
                i15 = iIntValue2;
                z14 = this.f10096btonecajqb;
                i16 = 2;
            } else {
                int iGxszxtbevo = iwizpuwonk.gxszxtbevo((String) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar.f9769ojitshcjhn), iobyxmoadgVar.f9754gtknphoqwx);
                int iJpowsppfya2 = stevsuqkhv.jpowsppfya(iobyxmoadgVar.f9779yadqdtsiqt);
                iobyxmoadgVar2 = iobyxmoadgVar5;
                i16 = 1;
                z14 = true;
                iMetgxyhuhe = -1;
                iMetgxyhuhe2 = -1;
                i14 = i19;
                z13 = wkgbmnqykcVarNufgyqmvbu.f10310zoijcleaow;
                i15 = iGxszxtbevo;
                iIntValue = iJpowsppfya2;
            }
        }
        if (i15 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i16 + ") for: " + iobyxmoadgVar, iobyxmoadgVar);
        }
        if (iIntValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i16 + ") for: " + iobyxmoadgVar, iobyxmoadgVar);
        }
        int i23 = iobyxmoadgVar.f9745btonecajqb;
        if ("audio/vnd.dts.hd;profile=lbr".equals(iobyxmoadgVar.f9769ojitshcjhn) && i23 == -1) {
            i23 = 768000;
        }
        int i24 = i23;
        if (i13 != 0) {
            iIobyxmoadg = i13;
        } else {
            iIobyxmoadg = this.f10130ojitshcjhn.iobyxmoadg(ulzqkzuiru(i14, iIntValue, i15), i15, i16, iMetgxyhuhe2 != -1 ? iMetgxyhuhe2 : 1, i14, i24, z14 ? 8.0d : 1.0d);
        }
        this.f10150xrmfcynszj = false;
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(iobyxmoadgVar, iMetgxyhuhe, i16, iMetgxyhuhe2, i14, iIntValue, i15, iIobyxmoadg, iobyxmoadgVar2, z14, z13, this.f10111ikoacuggdj);
        if (okpsazkaxt()) {
            this.f10153yggfygwlhe = nufgyqmvbuVar;
        } else {
            this.f10119jyumaefscl = nufgyqmvbuVar;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void lereixgezr(float f13) {
        if (this.f10140stevsuqkhv != f13) {
            this.f10140stevsuqkhv = f13;
            zeieaojujs();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public cqumvgiudr lqeggnwhkg() {
        return this.f10151yadqdtsiqt;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.exoplayer.audio.wkgbmnqykc nufgyqmvbu(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return this.f10150xrmfcynszj ? androidx.media3.exoplayer.audio.wkgbmnqykc.f10307wkgbmnqykc : this.f10136rgvfuqvkyq.iobyxmoadg(iobyxmoadgVar, this.f10157zynmafqrjb);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void ojitshcjhn() {
        if (this.f10111ikoacuggdj) {
            this.f10111ikoacuggdj = false;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void oxmwwwfdhm(h0 h0Var) {
        this.f10121kcexrzcfyt = h0Var;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.f10100crxdokpmqz = false;
        if (okpsazkaxt()) {
            if (this.f10129nufgyqmvbu.rgvfuqvkyq() || jztzpxfvev(this.f10099cqumvgiudr)) {
                this.f10099cqumvgiudr.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.f10100crxdokpmqz = true;
        if (okpsazkaxt()) {
            this.f10129nufgyqmvbu.jyumaefscl();
            this.f10099cqumvgiudr.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pmvmpeiblj() {
        y2.iobyxmoadg.lqeggnwhkg(this.f10117jlmebxxoox);
        if (this.f10111ikoacuggdj) {
            return;
        }
        this.f10111ikoacuggdj = true;
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        androidx.media3.exoplayer.audio.zoijcleaow zoijcleaowVar = this.f10123lereixgezr;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.btonecajqb();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void rgvfuqvkyq(y2.dxjokdxxww dxjokdxxwwVar) {
        this.f10129nufgyqmvbu.yggfygwlhe(dxjokdxxwwVar);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean vdvldrhtss(ByteBuffer byteBuffer, long j13, int i13) throws Exception {
        ByteBuffer byteBuffer2 = this.f10122kegysxyocb;
        y2.iobyxmoadg.iobyxmoadg(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f10153yggfygwlhe != null) {
            if (!ntlheqmsrt()) {
                return false;
            }
            if (this.f10153yggfygwlhe.zoijcleaow(this.f10119jyumaefscl)) {
                this.f10119jyumaefscl = this.f10153yggfygwlhe;
                this.f10153yggfygwlhe = null;
                AudioTrack audioTrack = this.f10099cqumvgiudr;
                if (audioTrack != null && jztzpxfvev(audioTrack) && this.f10119jyumaefscl.f10192gtknphoqwx) {
                    if (this.f10099cqumvgiudr.getPlayState() == 3) {
                        this.f10099cqumvgiudr.setOffloadEndOfStream();
                        this.f10129nufgyqmvbu.iobyxmoadg();
                    }
                    AudioTrack audioTrack2 = this.f10099cqumvgiudr;
                    androidx.media3.common.iobyxmoadg iobyxmoadgVar = this.f10119jyumaefscl.f10194iobyxmoadg;
                    audioTrack2.setOffloadDelayPadding(iobyxmoadgVar.f9778wwaezpbzkn, iobyxmoadgVar.f9781ylkuphrtab);
                    this.f10127metgxyhuhe = true;
                }
            } else {
                sflfametgt();
                if (btonecajqb()) {
                    return false;
                }
                flush();
            }
            cllcsxoeiz(j13);
        }
        if (!okpsazkaxt()) {
            try {
                if (!jhduphickx()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e13) {
                if (e13.f10078yggfygwlhe) {
                    throw e13;
                }
                this.f10146wflxmlrfwp.ppxfxbqfkf(e13);
                return false;
            }
        }
        this.f10146wflxmlrfwp.iobyxmoadg();
        if (this.f10103dsvhmnatus) {
            this.f10149wypolnanlu = Math.max(0L, j13);
            this.f10098cllcsxoeiz = false;
            this.f10103dsvhmnatus = false;
            if (uawqvzlxes()) {
                weqkydbzbr();
            }
            cllcsxoeiz(j13);
            if (this.f10100crxdokpmqz) {
                play();
            }
        }
        if (!this.f10129nufgyqmvbu.gtknphoqwx(jlmebxxoox())) {
            return false;
        }
        if (this.f10122kegysxyocb == null) {
            y2.iobyxmoadg.iobyxmoadg(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            nufgyqmvbu nufgyqmvbuVar = this.f10119jyumaefscl;
            if (nufgyqmvbuVar.f10197ppxfxbqfkf != 0 && this.f10110hkdspvbjdz == 0) {
                int iSopmlzcsov = sopmlzcsov(nufgyqmvbuVar.f10195lqeggnwhkg, byteBuffer);
                this.f10110hkdspvbjdz = iSopmlzcsov;
                if (iSopmlzcsov == 0) {
                    return true;
                }
            }
            if (this.f10114istkbnxepw != null) {
                if (!ntlheqmsrt()) {
                    return false;
                }
                cllcsxoeiz(j13);
                this.f10114istkbnxepw = null;
            }
            long jEablkybsjg = this.f10149wypolnanlu + this.f10119jyumaefscl.eablkybsjg(crxdokpmqz() - this.f10105eablkybsjg.wflxmlrfwp());
            if (!this.f10098cllcsxoeiz && Math.abs(jEablkybsjg - j13) > 200000) {
                AudioSink.zoijcleaow zoijcleaowVar = this.f10155zdlpuopuiu;
                if (zoijcleaowVar != null) {
                    zoijcleaowVar.eablkybsjg(new AudioSink.UnexpectedDiscontinuityException(j13, jEablkybsjg));
                }
                this.f10098cllcsxoeiz = true;
            }
            if (this.f10098cllcsxoeiz) {
                if (!ntlheqmsrt()) {
                    return false;
                }
                long j14 = j13 - jEablkybsjg;
                this.f10149wypolnanlu += j14;
                this.f10098cllcsxoeiz = false;
                cllcsxoeiz(j13);
                AudioSink.zoijcleaow zoijcleaowVar2 = this.f10155zdlpuopuiu;
                if (zoijcleaowVar2 != null && j14 != 0) {
                    zoijcleaowVar2.btonecajqb();
                }
            }
            if (this.f10119jyumaefscl.f10197ppxfxbqfkf == 0) {
                this.f10154ylkuphrtab += (long) byteBuffer.remaining();
            } else {
                this.f10133pkzmftpjix += ((long) this.f10110hkdspvbjdz) * ((long) i13);
            }
            this.f10122kegysxyocb = byteBuffer;
            this.f10141tzroggbefp = i13;
        }
        zfvoamnweg(j13);
        if (!this.f10122kegysxyocb.hasRemaining()) {
            this.f10122kegysxyocb = null;
            this.f10141tzroggbefp = 0;
            return true;
        }
        if (!this.f10129nufgyqmvbu.btonecajqb(jlmebxxoox())) {
            return false;
        }
        kcexrzcfyt.nufgyqmvbu("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void wflxmlrfwp(AudioSink.zoijcleaow zoijcleaowVar) {
        this.f10155zdlpuopuiu = zoijcleaowVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean wkgbmnqykc() {
        return !okpsazkaxt() || (this.f10128ntlheqmsrt && !btonecajqb());
    }

    public void ydmasvzmpa(androidx.media3.exoplayer.audio.iobyxmoadg iobyxmoadgVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f10138rlfsiqarku;
        if (looper != looperMyLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (looperMyLooper != null ? looperMyLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
        }
        androidx.media3.exoplayer.audio.iobyxmoadg iobyxmoadgVar2 = this.f10106esjtqupxsv;
        if (iobyxmoadgVar2 == null || iobyxmoadgVar.equals(iobyxmoadgVar2)) {
            return;
        }
        this.f10106esjtqupxsv = iobyxmoadgVar;
        AudioSink.zoijcleaow zoijcleaowVar = this.f10155zdlpuopuiu;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.dxjokdxxww();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void yggfygwlhe(int i13, int i14) {
        nufgyqmvbu nufgyqmvbuVar;
        AudioTrack audioTrack = this.f10099cqumvgiudr;
        if (audioTrack == null || !jztzpxfvev(audioTrack) || (nufgyqmvbuVar = this.f10119jyumaefscl) == null || !nufgyqmvbuVar.f10192gtknphoqwx) {
            return;
        }
        this.f10099cqumvgiudr.setOffloadDelayPadding(i13, i14);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void zdlpuopuiu() {
        if (!this.f10128ntlheqmsrt && okpsazkaxt() && ntlheqmsrt()) {
            sflfametgt();
            this.f10128ntlheqmsrt = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void zoijcleaow() {
        flush();
        ulzqkzuiru it = this.f10108gxszxtbevo.iterator();
        while (it.hasNext()) {
            ((AudioProcessor) it.next()).zoijcleaow();
        }
        ulzqkzuiru it2 = this.f10125lqeggnwhkg.iterator();
        while (it2.hasNext()) {
            ((AudioProcessor) it2.next()).zoijcleaow();
        }
        androidx.media3.common.audio.iobyxmoadg iobyxmoadgVar = this.f10115iwizpuwonk;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.btonecajqb();
        }
        this.f10100crxdokpmqz = false;
        this.f10150xrmfcynszj = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void zynmafqrjb(v2.gxszxtbevo gxszxtbevoVar) {
        if (this.f10145vipkmwdibw.equals(gxszxtbevoVar)) {
            return;
        }
        int i13 = gxszxtbevoVar.f115358iobyxmoadg;
        float f13 = gxszxtbevoVar.f115359zoijcleaow;
        AudioTrack audioTrack = this.f10099cqumvgiudr;
        if (audioTrack != null) {
            if (this.f10145vipkmwdibw.f115358iobyxmoadg != i13) {
                audioTrack.attachAuxEffect(i13);
            }
            if (i13 != 0) {
                this.f10099cqumvgiudr.setAuxEffectSendLevel(f13);
            }
        }
        this.f10145vipkmwdibw = gxszxtbevoVar;
    }

    private DefaultAudioSink(lqeggnwhkg lqeggnwhkgVar) {
        Context context = lqeggnwhkgVar.f10182iobyxmoadg;
        this.f10112iobyxmoadg = context;
        this.f10157zynmafqrjb = v2.ppxfxbqfkf.f115660lqeggnwhkg;
        this.f10106esjtqupxsv = context != null ? null : lqeggnwhkgVar.f10187zoijcleaow;
        this.f10156zoijcleaow = lqeggnwhkgVar.f10185ppxfxbqfkf;
        this.f10135ppxfxbqfkf = lqeggnwhkgVar.f10186wkgbmnqykc;
        this.f10096btonecajqb = stevsuqkhv.f123602iobyxmoadg >= 23 && lqeggnwhkgVar.f10180eablkybsjg;
        this.f10107gtknphoqwx = 0;
        this.f10130ojitshcjhn = lqeggnwhkgVar.f10183lqeggnwhkg;
        this.f10136rgvfuqvkyq = (wkgbmnqykc) y2.iobyxmoadg.eablkybsjg(lqeggnwhkgVar.f10179dxjokdxxww);
        this.f10129nufgyqmvbu = new androidx.media3.exoplayer.audio.lqeggnwhkg(new wflxmlrfwp());
        androidx.media3.exoplayer.audio.nufgyqmvbu nufgyqmvbuVar = new androidx.media3.exoplayer.audio.nufgyqmvbu();
        this.f10147wkgbmnqykc = nufgyqmvbuVar;
        ojitshcjhn ojitshcjhnVar = new ojitshcjhn();
        this.f10105eablkybsjg = ojitshcjhnVar;
        this.f10108gxszxtbevo = zdlpuopuiu.yadqdtsiqt(new androidx.media3.common.audio.eablkybsjg(), nufgyqmvbuVar, ojitshcjhnVar);
        this.f10125lqeggnwhkg = zdlpuopuiu.yadqdtsiqt(new androidx.media3.exoplayer.audio.agtfadlqog(), nufgyqmvbuVar, ojitshcjhnVar);
        this.f10140stevsuqkhv = 1.0f;
        this.f10137ribwqtqdhb = 0;
        this.f10145vipkmwdibw = new v2.gxszxtbevo(0, 0.0f);
        cqumvgiudr cqumvgiudrVar = cqumvgiudr.f115309wkgbmnqykc;
        this.f10097cdpycssgdh = new btonecajqb(cqumvgiudrVar, 0L, 0L);
        this.f10151yadqdtsiqt = cqumvgiudrVar;
        this.f10113iozdgvuglv = false;
        this.f10104dxjokdxxww = new ArrayDeque();
        this.f10146wflxmlrfwp = new draadjrbmk();
        this.f10095agtfadlqog = new draadjrbmk();
        this.f10144vdvldrhtss = lqeggnwhkgVar.f10178btonecajqb;
        this.f10132oxmwwwfdhm = lqeggnwhkgVar.f10184nufgyqmvbu;
    }
}
