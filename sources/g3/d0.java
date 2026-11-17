package g3;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements g3.zoijcleaow, e0.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private String f35927btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f35928cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f35929draadjrbmk;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f35932esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private PlaybackMetrics.Builder f35933gtknphoqwx;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f35935iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f35936iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f35937jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f35938kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f35939lereixgezr;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private PlaybackException f35942ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private zoijcleaow f35943oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f35944pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final e0 f35945ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private zoijcleaow f35946rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private zoijcleaow f35947vdvldrhtss;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final PlaybackSession f35949wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f35950yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f35951zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f35953zynmafqrjb;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Executor f35952zoijcleaow = y2.ppxfxbqfkf.iobyxmoadg();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final v2.cdpycssgdh.ppxfxbqfkf f35934gxszxtbevo = new v2.cdpycssgdh.ppxfxbqfkf();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final v2.cdpycssgdh.zoijcleaow f35940lqeggnwhkg = new v2.cdpycssgdh.zoijcleaow();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final HashMap f35930dxjokdxxww = new HashMap();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final HashMap f35941nufgyqmvbu = new HashMap();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f35931eablkybsjg = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f35948wflxmlrfwp = 0;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f35926agtfadlqog = 0;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f35954iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f35955zoijcleaow;

        public iobyxmoadg(int i13, int i14) {
            this.f35954iobyxmoadg = i13;
            this.f35955zoijcleaow = i14;
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final androidx.media3.common.iobyxmoadg f35956iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final String f35957ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f35958zoijcleaow;

        public zoijcleaow(androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i13, String str) {
            this.f35956iobyxmoadg = iobyxmoadgVar;
            this.f35958zoijcleaow = i13;
            this.f35957ppxfxbqfkf = str;
        }
    }

    private d0(Context context, PlaybackSession playbackSession) {
        this.f35935iobyxmoadg = context.getApplicationContext();
        this.f35949wkgbmnqykc = playbackSession;
        iyctptxqzt iyctptxqztVar = new iyctptxqzt();
        this.f35945ppxfxbqfkf = iyctptxqztVar;
        iyctptxqztVar.zoijcleaow(this);
    }

    private void a(v2.esjtqupxsv esjtqupxsvVar, g3.zoijcleaow.C0813zoijcleaow c0813zoijcleaow, long j13) {
        if (esjtqupxsvVar.tzroggbefp() != 2) {
            this.f35937jyumaefscl = false;
        }
        if (esjtqupxsvVar.draadjrbmk() == null) {
            this.f35928cqumvgiudr = false;
        } else if (c0813zoijcleaow.iobyxmoadg(10)) {
            this.f35928cqumvgiudr = true;
        }
        int i13 = i(esjtqupxsvVar);
        if (this.f35948wflxmlrfwp != i13) {
            this.f35948wflxmlrfwp = i13;
            this.f35953zynmafqrjb = true;
            final PlaybackStateEvent playbackStateEventBuild = p.iobyxmoadg().setState(this.f35948wflxmlrfwp).setTimeSinceCreatedMillis(j13 - this.f35931eablkybsjg).build();
            this.f35952zoijcleaow.execute(new Runnable() { // from class: g3.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35914zdlpuopuiu.ezmngbhpjk(playbackStateEventBuild);
                }
            });
        }
    }

    private static Pair ageimvtcrz(String str) {
        String[] strArrK = y2.stevsuqkhv.k(str, "-");
        return Pair.create(strArrK[0], strArrK.length >= 2 ? strArrK[1] : null);
    }

    private void b(v2.esjtqupxsv esjtqupxsvVar, g3.zoijcleaow.C0813zoijcleaow c0813zoijcleaow, long j13) {
        if (c0813zoijcleaow.iobyxmoadg(2)) {
            v2.wwaezpbzkn wwaezpbzknVarOjitshcjhn = esjtqupxsvVar.ojitshcjhn();
            boolean zPpxfxbqfkf = wwaezpbzknVarOjitshcjhn.ppxfxbqfkf(2);
            boolean zPpxfxbqfkf2 = wwaezpbzknVarOjitshcjhn.ppxfxbqfkf(1);
            boolean zPpxfxbqfkf3 = wwaezpbzknVarOjitshcjhn.ppxfxbqfkf(3);
            if (zPpxfxbqfkf || zPpxfxbqfkf2 || zPpxfxbqfkf3) {
                if (!zPpxfxbqfkf) {
                    g(j13, null, 0);
                }
                if (!zPpxfxbqfkf2) {
                    c(j13, null, 0);
                }
                if (!zPpxfxbqfkf3) {
                    e(j13, null, 0);
                }
            }
        }
        if (dvvnrvtcbc(this.f35946rgvfuqvkyq)) {
            zoijcleaow zoijcleaowVar = this.f35946rgvfuqvkyq;
            androidx.media3.common.iobyxmoadg iobyxmoadgVar = zoijcleaowVar.f35956iobyxmoadg;
            if (iobyxmoadgVar.f9761iwizpuwonk != -1) {
                g(j13, iobyxmoadgVar, zoijcleaowVar.f35958zoijcleaow);
                this.f35946rgvfuqvkyq = null;
            }
        }
        if (dvvnrvtcbc(this.f35947vdvldrhtss)) {
            zoijcleaow zoijcleaowVar2 = this.f35947vdvldrhtss;
            c(j13, zoijcleaowVar2.f35956iobyxmoadg, zoijcleaowVar2.f35958zoijcleaow);
            this.f35947vdvldrhtss = null;
        }
        if (dvvnrvtcbc(this.f35943oxmwwwfdhm)) {
            zoijcleaow zoijcleaowVar3 = this.f35943oxmwwwfdhm;
            e(j13, zoijcleaowVar3.f35956iobyxmoadg, zoijcleaowVar3.f35958zoijcleaow);
            this.f35943oxmwwwfdhm = null;
        }
    }

    private void c(long j13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i13) {
        if (Objects.equals(this.f35951zdlpuopuiu, iobyxmoadgVar)) {
            return;
        }
        if (this.f35951zdlpuopuiu == null && i13 == 0) {
            i13 = 1;
        }
        this.f35951zdlpuopuiu = iobyxmoadgVar;
        h(0, j13, iobyxmoadgVar, i13);
    }

    private void d(v2.esjtqupxsv esjtqupxsvVar, g3.zoijcleaow.C0813zoijcleaow c0813zoijcleaow) {
        DrmInitData drmInitDataWizcaqwiak;
        if (c0813zoijcleaow.iobyxmoadg(0)) {
            g3.zoijcleaow.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = c0813zoijcleaow.ppxfxbqfkf(0);
            if (this.f35933gtknphoqwx != null) {
                f(iobyxmoadgVarPpxfxbqfkf.f36127zoijcleaow, iobyxmoadgVarPpxfxbqfkf.f36126wkgbmnqykc);
            }
        }
        if (c0813zoijcleaow.iobyxmoadg(2) && this.f35933gtknphoqwx != null && (drmInitDataWizcaqwiak = wizcaqwiak(esjtqupxsvVar.ojitshcjhn().iobyxmoadg())) != null) {
            fyldjkxazc.iobyxmoadg(y2.stevsuqkhv.nufgyqmvbu(this.f35933gtknphoqwx)).setDrmType(hszhottldk(drmInitDataWizcaqwiak));
        }
        if (c0813zoijcleaow.iobyxmoadg(1011)) {
            this.f35944pmvmpeiblj++;
        }
    }

    private boolean dvvnrvtcbc(zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar != null && zoijcleaowVar.f35957ppxfxbqfkf.equals(this.f35945ppxfxbqfkf.iobyxmoadg());
    }

    private void e(long j13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i13) {
        if (Objects.equals(this.f35950yggfygwlhe, iobyxmoadgVar)) {
            return;
        }
        if (this.f35950yggfygwlhe == null && i13 == 0) {
            i13 = 1;
        }
        this.f35950yggfygwlhe = iobyxmoadgVar;
        h(2, j13, iobyxmoadgVar, i13);
    }

    private void eslsurpljm(long j13) {
        int iIpoelvxyzq = ipoelvxyzq(this.f35935iobyxmoadg);
        if (iIpoelvxyzq != this.f35926agtfadlqog) {
            this.f35926agtfadlqog = iIpoelvxyzq;
            final NetworkEvent networkEventBuild = igdgnonuha.iobyxmoadg().setNetworkType(iIpoelvxyzq).setTimeSinceCreatedMillis(j13 - this.f35931eablkybsjg).build();
            this.f35952zoijcleaow.execute(new Runnable() { // from class: g3.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36110zdlpuopuiu.jrbgnlbqoe(networkEventBuild);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ezmngbhpjk(PlaybackStateEvent playbackStateEvent) {
        this.f35949wkgbmnqykc.reportPlaybackStateEvent(playbackStateEvent);
    }

    private void f(v2.cdpycssgdh cdpycssgdhVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        int iZoijcleaow;
        PlaybackMetrics.Builder builder = this.f35933gtknphoqwx;
        if (zoijcleaowVar == null || (iZoijcleaow = cdpycssgdhVar.zoijcleaow(zoijcleaowVar.f11262iobyxmoadg)) == -1) {
            return;
        }
        cdpycssgdhVar.gxszxtbevo(iZoijcleaow, this.f35940lqeggnwhkg);
        cdpycssgdhVar.agtfadlqog(this.f35940lqeggnwhkg.f115304ppxfxbqfkf, this.f35934gxszxtbevo);
        builder.setStreamType(grlcpdaxtj(this.f35934gxszxtbevo.f115290ppxfxbqfkf));
        v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar = this.f35934gxszxtbevo;
        if (ppxfxbqfkfVar.f115292wflxmlrfwp != -9223372036854775807L && !ppxfxbqfkfVar.f115284gtknphoqwx && !ppxfxbqfkfVar.f115282dxjokdxxww && !ppxfxbqfkfVar.gxszxtbevo()) {
            builder.setMediaDurationMillis(this.f35934gxszxtbevo.wkgbmnqykc());
        }
        builder.setPlaybackType(this.f35934gxszxtbevo.gxszxtbevo() ? 2 : 1);
        this.f35953zynmafqrjb = true;
    }

    private static iobyxmoadg fiwbwshyhd(PlaybackException playbackException, Context context, boolean z13) {
        int i13;
        boolean z14;
        if (playbackException.f9641zdlpuopuiu == 1001) {
            return new iobyxmoadg(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z14 = exoPlaybackException.f10031istkbnxepw == 1;
            i13 = exoPlaybackException.f10032lmojexxdyd;
        } else {
            i13 = 0;
            z14 = false;
        }
        Throwable th2 = (Throwable) y2.iobyxmoadg.eablkybsjg(playbackException.getCause());
        if (!(th2 instanceof IOException)) {
            if (z14 && (i13 == 0 || i13 == 1)) {
                return new iobyxmoadg(35, 0);
            }
            if (z14 && i13 == 3) {
                return new iobyxmoadg(15, 0);
            }
            if (z14 && i13 == 2) {
                return new iobyxmoadg(23, 0);
            }
            if (th2 instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new iobyxmoadg(13, y2.stevsuqkhv.jlmebxxoox(((MediaCodecRenderer.DecoderInitializationException) th2).f10782iwizpuwonk));
            }
            if (th2 instanceof MediaCodecDecoderException) {
                return new iobyxmoadg(14, ((MediaCodecDecoderException) th2).f10712jyumaefscl);
            }
            if (th2 instanceof OutOfMemoryError) {
                return new iobyxmoadg(14, 0);
            }
            if (th2 instanceof AudioSink.InitializationException) {
                return new iobyxmoadg(17, ((AudioSink.InitializationException) th2).f10079zdlpuopuiu);
            }
            if (th2 instanceof AudioSink.WriteException) {
                return new iobyxmoadg(18, ((AudioSink.WriteException) th2).f10084zdlpuopuiu);
            }
            if (!(th2 instanceof MediaCodec.CryptoException)) {
                return new iobyxmoadg(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new iobyxmoadg(lxfrhoxuzk(errorCode), errorCode);
        }
        if (th2 instanceof HttpDataSource$InvalidResponseCodeException) {
            return new iobyxmoadg(5, ((HttpDataSource$InvalidResponseCodeException) th2).f9871iwizpuwonk);
        }
        if ((th2 instanceof HttpDataSource$InvalidContentTypeException) || (th2 instanceof ParserException)) {
            return new iobyxmoadg(z13 ? 10 : 11, 0);
        }
        boolean z15 = th2 instanceof HttpDataSource$HttpDataSourceException;
        if (z15 || (th2 instanceof UdpDataSource.UdpDataSourceException)) {
            if (y2.cqumvgiudr.eablkybsjg(context).lqeggnwhkg() == 1) {
                return new iobyxmoadg(3, 0);
            }
            Throwable cause = th2.getCause();
            if (cause instanceof UnknownHostException) {
                return new iobyxmoadg(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new iobyxmoadg(7, 0);
            }
            return (z15 && ((HttpDataSource$HttpDataSourceException) th2).f9866jyumaefscl == 1) ? new iobyxmoadg(4, 0) : new iobyxmoadg(8, 0);
        }
        if (playbackException.f9641zdlpuopuiu == 1002) {
            return new iobyxmoadg(21, 0);
        }
        if (!(th2 instanceof DrmSession.DrmSessionException)) {
            if (!(th2 instanceof FileDataSource.FileDataSourceException) || !(th2.getCause() instanceof FileNotFoundException)) {
                return new iobyxmoadg(9, 0);
            }
            Throwable cause2 = ((Throwable) y2.iobyxmoadg.eablkybsjg(th2.getCause())).getCause();
            return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new iobyxmoadg(32, 0) : new iobyxmoadg(31, 0);
        }
        Throwable th3 = (Throwable) y2.iobyxmoadg.eablkybsjg(th2.getCause());
        if (th3 instanceof MediaDrm.MediaDrmStateException) {
            int iJlmebxxoox = y2.stevsuqkhv.jlmebxxoox(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
            return new iobyxmoadg(lxfrhoxuzk(iJlmebxxoox), iJlmebxxoox);
        }
        if (y2.stevsuqkhv.f123602iobyxmoadg >= 23 && (th3 instanceof MediaDrmResetException)) {
            return new iobyxmoadg(27, 0);
        }
        if (th3 instanceof NotProvisionedException) {
            return new iobyxmoadg(24, 0);
        }
        if (th3 instanceof DeniedByServerException) {
            return new iobyxmoadg(29, 0);
        }
        if (th3 instanceof UnsupportedDrmException) {
            return new iobyxmoadg(23, 0);
        }
        return th3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new iobyxmoadg(28, 0) : new iobyxmoadg(30, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fmlbqenlif(PlaybackErrorEvent playbackErrorEvent) {
        this.f35949wkgbmnqykc.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    private void g(long j13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i13) {
        if (Objects.equals(this.f35938kcexrzcfyt, iobyxmoadgVar)) {
            return;
        }
        if (this.f35938kcexrzcfyt == null && i13 == 0) {
            i13 = 1;
        }
        this.f35938kcexrzcfyt = iobyxmoadgVar;
        h(1, j13, iobyxmoadgVar, i13);
    }

    private static int grlcpdaxtj(v2.kcexrzcfyt kcexrzcfytVar) {
        v2.kcexrzcfyt.nufgyqmvbu nufgyqmvbuVar = kcexrzcfytVar.f115398zoijcleaow;
        if (nufgyqmvbuVar == null) {
            return 0;
        }
        int iTbqsvytpvh = y2.stevsuqkhv.tbqsvytpvh(nufgyqmvbuVar.f115485iobyxmoadg, nufgyqmvbuVar.f115490zoijcleaow);
        if (iTbqsvytpvh == 0) {
            return 3;
        }
        if (iTbqsvytpvh != 1) {
            return iTbqsvytpvh != 2 ? 1 : 4;
        }
        return 5;
    }

    private void h(int i13, long j13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i14) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = weqkydbzbr.iobyxmoadg(i13).setTimeSinceCreatedMillis(j13 - this.f35931eablkybsjg);
        if (iobyxmoadgVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(mhtqkkgtqm(i14));
            String str = iobyxmoadgVar.f9744agtfadlqog;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = iobyxmoadgVar.f9769ojitshcjhn;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = iobyxmoadgVar.f9754gtknphoqwx;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i15 = iobyxmoadgVar.f9745btonecajqb;
            if (i15 != -1) {
                timeSinceCreatedMillis.setBitrate(i15);
            }
            int i16 = iobyxmoadgVar.f9763jyumaefscl;
            if (i16 != -1) {
                timeSinceCreatedMillis.setWidth(i16);
            }
            int i17 = iobyxmoadgVar.f9761iwizpuwonk;
            if (i17 != -1) {
                timeSinceCreatedMillis.setHeight(i17);
            }
            int i18 = iobyxmoadgVar.f9779yadqdtsiqt;
            if (i18 != -1) {
                timeSinceCreatedMillis.setChannelCount(i18);
            }
            int i19 = iobyxmoadgVar.f9759iozdgvuglv;
            if (i19 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i19);
            }
            String str4 = iobyxmoadgVar.f9777wkgbmnqykc;
            if (str4 != null) {
                Pair pairAgeimvtcrz = ageimvtcrz(str4);
                timeSinceCreatedMillis.setLanguage((String) pairAgeimvtcrz.first);
                Object obj = pairAgeimvtcrz.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f13 = iobyxmoadgVar.f9748cqumvgiudr;
            if (f13 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f13);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f35953zynmafqrjb = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.f35952zoijcleaow.execute(new Runnable() { // from class: g3.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f36099zdlpuopuiu.rhgxfdycjh(trackChangeEventBuild);
            }
        });
    }

    private static int hszhottldk(DrmInitData drmInitData) {
        for (int i13 = 0; i13 < drmInitData.f9619iwizpuwonk; i13++) {
            UUID uuid = drmInitData.eablkybsjg(i13).f9626yggfygwlhe;
            if (uuid.equals(v2.nufgyqmvbu.f115647wkgbmnqykc)) {
                return 3;
            }
            if (uuid.equals(v2.nufgyqmvbu.f115644eablkybsjg)) {
                return 2;
            }
            if (uuid.equals(v2.nufgyqmvbu.f115646ppxfxbqfkf)) {
                return 6;
            }
        }
        return 1;
    }

    private int i(v2.esjtqupxsv esjtqupxsvVar) {
        int iTzroggbefp = esjtqupxsvVar.tzroggbefp();
        if (this.f35937jyumaefscl) {
            return 5;
        }
        if (this.f35928cqumvgiudr) {
            return 13;
        }
        if (iTzroggbefp == 4) {
            return 11;
        }
        if (iTzroggbefp == 2) {
            int i13 = this.f35948wflxmlrfwp;
            if (i13 == 0 || i13 == 2 || i13 == 12) {
                return 2;
            }
            if (esjtqupxsvVar.iozdgvuglv()) {
                return esjtqupxsvVar.yggfygwlhe() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (iTzroggbefp == 3) {
            if (esjtqupxsvVar.iozdgvuglv()) {
                return esjtqupxsvVar.yggfygwlhe() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (iTzroggbefp != 1 || this.f35948wflxmlrfwp == 0) {
            return this.f35948wflxmlrfwp;
        }
        return 12;
    }

    private void igdgnonuha() {
        PlaybackMetrics.Builder builder = this.f35933gtknphoqwx;
        if (builder != null && this.f35953zynmafqrjb) {
            builder.setAudioUnderrunCount(this.f35944pmvmpeiblj);
            this.f35933gtknphoqwx.setVideoFramesDropped(this.f35932esjtqupxsv);
            this.f35933gtknphoqwx.setVideoFramesPlayed(this.f35939lereixgezr);
            Long l13 = (Long) this.f35941nufgyqmvbu.get(this.f35927btonecajqb);
            this.f35933gtknphoqwx.setNetworkTransferDurationMillis(l13 == null ? 0L : l13.longValue());
            Long l14 = (Long) this.f35930dxjokdxxww.get(this.f35927btonecajqb);
            this.f35933gtknphoqwx.setNetworkBytesRead(l14 == null ? 0L : l14.longValue());
            this.f35933gtknphoqwx.setStreamSource((l14 == null || l14.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.f35933gtknphoqwx.build();
            this.f35952zoijcleaow.execute(new Runnable() { // from class: g3.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35895zdlpuopuiu.ixidwrxhsl(playbackMetricsBuild);
                }
            });
        }
        this.f35933gtknphoqwx = null;
        this.f35927btonecajqb = null;
        this.f35944pmvmpeiblj = 0;
        this.f35932esjtqupxsv = 0;
        this.f35939lereixgezr = 0;
        this.f35938kcexrzcfyt = null;
        this.f35951zdlpuopuiu = null;
        this.f35950yggfygwlhe = null;
        this.f35953zynmafqrjb = false;
    }

    private static int ipoelvxyzq(Context context) {
        switch (y2.cqumvgiudr.eablkybsjg(context).lqeggnwhkg()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ixidwrxhsl(PlaybackMetrics playbackMetrics) {
        this.f35949wkgbmnqykc.reportPlaybackMetrics(playbackMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jrbgnlbqoe(NetworkEvent networkEvent) {
        this.f35949wkgbmnqykc.reportNetworkEvent(networkEvent);
    }

    private void krqnebusok(long j13) {
        PlaybackException playbackException = this.f35942ojitshcjhn;
        if (playbackException == null) {
            return;
        }
        iobyxmoadg iobyxmoadgVarFiwbwshyhd = fiwbwshyhd(playbackException, this.f35935iobyxmoadg, this.f35936iwizpuwonk == 4);
        final PlaybackErrorEvent playbackErrorEventBuild = e.iobyxmoadg().setTimeSinceCreatedMillis(j13 - this.f35931eablkybsjg).setErrorCode(iobyxmoadgVarFiwbwshyhd.f35954iobyxmoadg).setSubErrorCode(iobyxmoadgVarFiwbwshyhd.f35955zoijcleaow).setException(playbackException).build();
        this.f35952zoijcleaow.execute(new Runnable() { // from class: g3.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f35891zdlpuopuiu.fmlbqenlif(playbackErrorEventBuild);
            }
        });
        this.f35953zynmafqrjb = true;
        this.f35942ojitshcjhn = null;
    }

    private static int lxfrhoxuzk(int i13) {
        switch (y2.stevsuqkhv.crxdokpmqz(i13)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static int mhtqkkgtqm(int i13) {
        if (i13 == 1) {
            return 2;
        }
        if (i13 != 2) {
            return i13 != 3 ? 1 : 4;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void rhgxfdycjh(TrackChangeEvent trackChangeEvent) {
        this.f35949wkgbmnqykc.reportTrackChangeEvent(trackChangeEvent);
    }

    public static d0 skhdrjzrfn(Context context) {
        MediaMetricsManager mediaMetricsManagerIobyxmoadg = t.iobyxmoadg(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerIobyxmoadg == null) {
            return null;
        }
        return new d0(context, mediaMetricsManagerIobyxmoadg.createPlaybackSession());
    }

    private static DrmInitData wizcaqwiak(com.google.common.collect.zdlpuopuiu zdlpuopuiuVar) {
        DrmInitData drmInitData;
        com.google.common.collect.ulzqkzuiru it = zdlpuopuiuVar.iterator();
        while (it.hasNext()) {
            v2.wwaezpbzkn.iobyxmoadg iobyxmoadgVar = (v2.wwaezpbzkn.iobyxmoadg) it.next();
            for (int i13 = 0; i13 < iobyxmoadgVar.f115698iobyxmoadg; i13++) {
                if (iobyxmoadgVar.lqeggnwhkg(i13) && (drmInitData = iobyxmoadgVar.zoijcleaow(i13).f9764kcexrzcfyt) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private void yzdjzghtvl(g3.zoijcleaow.C0813zoijcleaow c0813zoijcleaow) {
        for (int i13 = 0; i13 < c0813zoijcleaow.wkgbmnqykc(); i13++) {
            int iZoijcleaow = c0813zoijcleaow.zoijcleaow(i13);
            g3.zoijcleaow.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = c0813zoijcleaow.ppxfxbqfkf(iZoijcleaow);
            if (iZoijcleaow == 0) {
                this.f35945ppxfxbqfkf.eablkybsjg(iobyxmoadgVarPpxfxbqfkf);
            } else if (iZoijcleaow == 11) {
                this.f35945ppxfxbqfkf.ppxfxbqfkf(iobyxmoadgVarPpxfxbqfkf, this.f35929draadjrbmk);
            } else {
                this.f35945ppxfxbqfkf.gxszxtbevo(iobyxmoadgVarPpxfxbqfkf);
            }
        }
    }

    @Override // g3.zoijcleaow
    public void agtfadlqog(g3.zoijcleaow.iobyxmoadg iobyxmoadgVar, v2.jpowsppfya jpowsppfyaVar) {
        zoijcleaow zoijcleaowVar = this.f35946rgvfuqvkyq;
        if (zoijcleaowVar != null) {
            androidx.media3.common.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f35956iobyxmoadg;
            if (iobyxmoadgVar2.f9761iwizpuwonk == -1) {
                this.f35946rgvfuqvkyq = new zoijcleaow(iobyxmoadgVar2.zoijcleaow().auzgnhcxok(jpowsppfyaVar.f115378iobyxmoadg).okpsazkaxt(jpowsppfyaVar.f115381zoijcleaow).cllcsxoeiz(), zoijcleaowVar.f35958zoijcleaow, zoijcleaowVar.f35957ppxfxbqfkf);
            }
        }
    }

    @Override // g3.zoijcleaow
    public void bfopjjpdmp(g3.zoijcleaow.iobyxmoadg iobyxmoadgVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, IOException iOException, boolean z13) {
        this.f35936iwizpuwonk = btonecajqbVar.f65015iobyxmoadg;
    }

    @Override // g3.zoijcleaow
    public void crxdokpmqz(g3.zoijcleaow.iobyxmoadg iobyxmoadgVar, int i13, long j13, long j14) {
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f36126wkgbmnqykc;
        if (zoijcleaowVar != null) {
            String strLqeggnwhkg = this.f35945ppxfxbqfkf.lqeggnwhkg(iobyxmoadgVar.f36127zoijcleaow, (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar));
            Long l13 = (Long) this.f35930dxjokdxxww.get(strLqeggnwhkg);
            Long l14 = (Long) this.f35941nufgyqmvbu.get(strLqeggnwhkg);
            this.f35930dxjokdxxww.put(strLqeggnwhkg, Long.valueOf((l13 == null ? 0L : l13.longValue()) + j13));
            this.f35941nufgyqmvbu.put(strLqeggnwhkg, Long.valueOf((l14 != null ? l14.longValue() : 0L) + ((long) i13)));
        }
    }

    @Override // g3.zoijcleaow
    public void esjtqupxsv(g3.zoijcleaow.iobyxmoadg iobyxmoadgVar, v2.esjtqupxsv.eablkybsjg eablkybsjgVar, v2.esjtqupxsv.eablkybsjg eablkybsjgVar2, int i13) {
        if (i13 == 1) {
            this.f35937jyumaefscl = true;
        }
        this.f35929draadjrbmk = i13;
    }

    public LogSessionId fyldjkxazc() {
        return this.f35949wkgbmnqykc.getSessionId();
    }

    @Override // g3.e0.iobyxmoadg
    public void lereixgezr(g3.zoijcleaow.iobyxmoadg iobyxmoadgVar, String str) {
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f36126wkgbmnqykc;
        if (zoijcleaowVar == null || !zoijcleaowVar.zoijcleaow()) {
            igdgnonuha();
            this.f35927btonecajqb = str;
            this.f35933gtknphoqwx = jrbgnlbqoe.iobyxmoadg().setPlayerName("AndroidXMedia3").setPlayerVersion("1.7.1");
            f(iobyxmoadgVar.f36127zoijcleaow, iobyxmoadgVar.f36126wkgbmnqykc);
        }
    }

    @Override // g3.e0.iobyxmoadg
    public void pkzmftpjix(g3.zoijcleaow.iobyxmoadg iobyxmoadgVar, String str) {
    }

    @Override // g3.e0.iobyxmoadg
    public void rlfsiqarku(g3.zoijcleaow.iobyxmoadg iobyxmoadgVar, String str, String str2) {
    }

    @Override // g3.zoijcleaow
    public void ulzqkzuiru(v2.esjtqupxsv esjtqupxsvVar, g3.zoijcleaow.C0813zoijcleaow c0813zoijcleaow) {
        if (c0813zoijcleaow.wkgbmnqykc() == 0) {
            return;
        }
        yzdjzghtvl(c0813zoijcleaow);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        d(esjtqupxsvVar, c0813zoijcleaow);
        krqnebusok(jElapsedRealtime);
        b(esjtqupxsvVar, c0813zoijcleaow, jElapsedRealtime);
        eslsurpljm(jElapsedRealtime);
        a(esjtqupxsvVar, c0813zoijcleaow, jElapsedRealtime);
        if (c0813zoijcleaow.iobyxmoadg(1028)) {
            this.f35945ppxfxbqfkf.wkgbmnqykc(c0813zoijcleaow.ppxfxbqfkf(1028));
        }
    }

    @Override // g3.zoijcleaow
    public void uwvvkdfqfp(g3.zoijcleaow.iobyxmoadg iobyxmoadgVar, PlaybackException playbackException) {
        this.f35942ojitshcjhn = playbackException;
    }

    @Override // g3.e0.iobyxmoadg
    public void wflxmlrfwp(g3.zoijcleaow.iobyxmoadg iobyxmoadgVar, String str, boolean z13) {
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f36126wkgbmnqykc;
        if ((zoijcleaowVar == null || !zoijcleaowVar.zoijcleaow()) && str.equals(this.f35927btonecajqb)) {
            igdgnonuha();
        }
        this.f35941nufgyqmvbu.remove(str);
        this.f35930dxjokdxxww.remove(str);
    }

    @Override // g3.zoijcleaow
    public void wwaezpbzkn(g3.zoijcleaow.iobyxmoadg iobyxmoadgVar, f3.zoijcleaow zoijcleaowVar) {
        this.f35932esjtqupxsv += zoijcleaowVar.f32711lqeggnwhkg;
        this.f35939lereixgezr += zoijcleaowVar.f32707eablkybsjg;
    }

    @Override // g3.zoijcleaow
    public void wypolnanlu(g3.zoijcleaow.iobyxmoadg iobyxmoadgVar, m3.btonecajqb btonecajqbVar) {
        if (iobyxmoadgVar.f36126wkgbmnqykc == null) {
            return;
        }
        zoijcleaow zoijcleaowVar = new zoijcleaow((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(btonecajqbVar.f65017ppxfxbqfkf), btonecajqbVar.f65018wkgbmnqykc, this.f35945ppxfxbqfkf.lqeggnwhkg(iobyxmoadgVar.f36127zoijcleaow, (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar.f36126wkgbmnqykc)));
        int i13 = btonecajqbVar.f65019zoijcleaow;
        if (i13 != 0) {
            if (i13 == 1) {
                this.f35947vdvldrhtss = zoijcleaowVar;
                return;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    return;
                }
                this.f35943oxmwwwfdhm = zoijcleaowVar;
                return;
            }
        }
        this.f35946rgvfuqvkyq = zoijcleaowVar;
    }
}
