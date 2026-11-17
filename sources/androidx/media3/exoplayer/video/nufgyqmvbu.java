package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.hszhottldk;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.oxmwwwfdhm;
import androidx.media3.exoplayer.wizcaqwiak;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.common.collect.zdlpuopuiu;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.C4007z9;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import v2.cdpycssgdh;
import v2.iwizpuwonk;
import v2.jpowsppfya;
import y2.jyumaefscl;
import y2.kcexrzcfyt;
import y2.lmojexxdyd;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu extends MediaCodecRenderer implements gtknphoqwx.zoijcleaow {
    private static final int[] S = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean T;
    private static boolean U;
    private int A;
    private int B;
    private int C;
    private long D;
    private int E;
    private long F;
    private jpowsppfya G;
    private jpowsppfya H;
    private int I;
    private boolean J;
    private int K;
    gxszxtbevo L;
    private r3.lqeggnwhkg M;
    private long N;
    private long O;
    private boolean P;
    private boolean Q;
    private int R;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f11547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f11548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wflxmlrfwp.iobyxmoadg f11549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f11550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f11551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final gtknphoqwx f11552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final gtknphoqwx.iobyxmoadg f11553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.media3.exoplayer.video.iobyxmoadg f11554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f11555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final PriorityQueue f11556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private eablkybsjg f11557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f11558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f11559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private VideoSink f11560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f11561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List f11562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Surface f11563t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PlaceholderSurface f11564u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private lmojexxdyd f11565v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f11566w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f11567x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f11568y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f11569z;

    protected static final class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f11570iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f11571ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f11572zoijcleaow;

        public eablkybsjg(int i13, int i14, int i15) {
            this.f11570iobyxmoadg = i13;
            this.f11572zoijcleaow = i14;
            this.f11571ppxfxbqfkf = i15;
        }
    }

    private final class gxszxtbevo implements androidx.media3.exoplayer.mediacodec.nufgyqmvbu.wkgbmnqykc, Handler.Callback {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Handler f11574zdlpuopuiu;

        public gxszxtbevo(androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar) {
            Handler handlerPmvmpeiblj = stevsuqkhv.pmvmpeiblj(this);
            this.f11574zdlpuopuiu = handlerPmvmpeiblj;
            nufgyqmvbuVar.eablkybsjg(this, handlerPmvmpeiblj);
        }

        private void zoijcleaow(long j13) {
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
            if (this != nufgyqmvbuVar.L || nufgyqmvbuVar.jrbgnlbqoe() == null) {
                return;
            }
            if (j13 == Long.MAX_VALUE) {
                nufgyqmvbu.this.P0();
                return;
            }
            try {
                nufgyqmvbu.this.O0(j13);
            } catch (ExoPlaybackException e13) {
                nufgyqmvbu.this.S(e13);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            zoijcleaow(stevsuqkhv.q(message.arg1, message.arg2));
            return true;
        }

        @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu.wkgbmnqykc
        public void iobyxmoadg(androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar, long j13, long j14) {
            if (stevsuqkhv.f123602iobyxmoadg >= 30) {
                zoijcleaow(j13);
            } else {
                this.f11574zdlpuopuiu.sendMessageAtFrontOfQueue(Message.obtain(this.f11574zdlpuopuiu, 0, (int) (j13 >> 32), (int) j13));
            }
        }
    }

    class iobyxmoadg implements VideoSink.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.iobyxmoadg
        public void iobyxmoadg(VideoSink videoSink) {
            if (nufgyqmvbu.this.f11563t != null) {
                nufgyqmvbu.this.N0();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.iobyxmoadg
        public void ppxfxbqfkf(VideoSink videoSink) {
            if (nufgyqmvbu.this.f11563t != null) {
                nufgyqmvbu.this.i1(0, 1);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.iobyxmoadg
        public void zoijcleaow(VideoSink videoSink, jpowsppfya jpowsppfyaVar) {
        }
    }

    private static final class ppxfxbqfkf {
        public static boolean iobyxmoadg(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i13 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i13 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class wkgbmnqykc {

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private boolean f11577draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f11578dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f11579eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private VideoSink f11580gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f11581gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f11582iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private Handler f11583lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private wflxmlrfwp f11584nufgyqmvbu;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private androidx.media3.exoplayer.mediacodec.nufgyqmvbu.zoijcleaow f11587wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f11588zoijcleaow;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private androidx.media3.exoplayer.mediacodec.draadjrbmk f11585ppxfxbqfkf = androidx.media3.exoplayer.mediacodec.draadjrbmk.f10812iobyxmoadg;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private float f11576btonecajqb = 30.0f;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private long f11586wflxmlrfwp = -9223372036854775807L;

        public wkgbmnqykc(Context context) {
            this.f11582iobyxmoadg = context;
            this.f11587wkgbmnqykc = androidx.media3.exoplayer.mediacodec.nufgyqmvbu.zoijcleaow.iobyxmoadg(context);
        }

        public wkgbmnqykc agtfadlqog(long j13) {
            this.f11586wflxmlrfwp = j13;
            return this;
        }

        public wkgbmnqykc jyumaefscl(androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar) {
            this.f11585ppxfxbqfkf = draadjrbmkVar;
            return this;
        }

        public wkgbmnqykc kcexrzcfyt(Handler handler) {
            this.f11583lqeggnwhkg = handler;
            return this;
        }

        public wkgbmnqykc ojitshcjhn(boolean z13) {
            this.f11577draadjrbmk = z13;
            return this;
        }

        public wkgbmnqykc oxmwwwfdhm(boolean z13) {
            this.f11581gxszxtbevo = z13;
            return this;
        }

        public wkgbmnqykc rgvfuqvkyq(long j13) {
            this.f11579eablkybsjg = j13;
            return this;
        }

        public wkgbmnqykc vdvldrhtss(androidx.media3.exoplayer.mediacodec.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
            this.f11587wkgbmnqykc = zoijcleaowVar;
            return this;
        }

        public nufgyqmvbu wflxmlrfwp() {
            y2.iobyxmoadg.lqeggnwhkg(!this.f11588zoijcleaow);
            Handler handler = this.f11583lqeggnwhkg;
            y2.iobyxmoadg.lqeggnwhkg((handler == null && this.f11584nufgyqmvbu == null) || !(handler == null || this.f11584nufgyqmvbu == null));
            this.f11588zoijcleaow = true;
            return new nufgyqmvbu(this);
        }

        public wkgbmnqykc yggfygwlhe(int i13) {
            this.f11578dxjokdxxww = i13;
            return this;
        }

        public wkgbmnqykc zdlpuopuiu(wflxmlrfwp wflxmlrfwpVar) {
            this.f11584nufgyqmvbu = wflxmlrfwpVar;
            return this;
        }
    }

    class zoijcleaow implements VideoSink.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ androidx.media3.exoplayer.mediacodec.nufgyqmvbu f11589iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ long f11590ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ int f11592zoijcleaow;

        zoijcleaow(androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar, int i13, long j13) {
            this.f11589iobyxmoadg = nufgyqmvbuVar;
            this.f11592zoijcleaow = i13;
            this.f11590ppxfxbqfkf = j13;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.zoijcleaow
        public void iobyxmoadg(long j13) {
            nufgyqmvbu.this.S0(this.f11589iobyxmoadg, this.f11592zoijcleaow, this.f11590ppxfxbqfkf, j13);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.zoijcleaow
        public void zoijcleaow() {
            nufgyqmvbu.this.f1(this.f11589iobyxmoadg, this.f11592zoijcleaow, this.f11590ppxfxbqfkf);
        }
    }

    protected nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar) {
        super(2, wkgbmnqykcVar.f11587wkgbmnqykc, wkgbmnqykcVar.f11585ppxfxbqfkf, wkgbmnqykcVar.f11581gxszxtbevo, wkgbmnqykcVar.f11576btonecajqb);
        Context applicationContext = wkgbmnqykcVar.f11582iobyxmoadg.getApplicationContext();
        this.f11547d = applicationContext;
        this.f11550g = wkgbmnqykcVar.f11578dxjokdxxww;
        this.f11560q = wkgbmnqykcVar.f11580gtknphoqwx;
        this.f11549f = new wflxmlrfwp.iobyxmoadg(wkgbmnqykcVar.f11583lqeggnwhkg, wkgbmnqykcVar.f11584nufgyqmvbu);
        this.f11548e = this.f11560q == null;
        this.f11552i = new gtknphoqwx(applicationContext, this, wkgbmnqykcVar.f11579eablkybsjg);
        this.f11553j = new gtknphoqwx.iobyxmoadg();
        this.f11551h = o0();
        this.f11565v = lmojexxdyd.f123566ppxfxbqfkf;
        this.f11567x = 1;
        this.f11568y = 0;
        this.G = jpowsppfya.f115374eablkybsjg;
        this.K = 0;
        this.H = null;
        this.I = -1000;
        this.N = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.f11554k = wkgbmnqykcVar.f11577draadjrbmk ? new androidx.media3.exoplayer.video.iobyxmoadg() : null;
        this.f11556m = new PriorityQueue();
        this.f11555l = wkgbmnqykcVar.f11586wflxmlrfwp != -9223372036854775807L ? -wkgbmnqykcVar.f11586wflxmlrfwp : -9223372036854775807L;
    }

    private boolean A0(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar) {
        Surface surface;
        return this.f11560q != null || ((surface = this.f11563t) != null && surface.isValid()) || d1(btonecajqbVar) || e1(btonecajqbVar);
    }

    private boolean B0(DecoderInputBuffer decoderInputBuffer) {
        return decoderInputBuffer.f10020esjtqupxsv < ribwqtqdhb();
    }

    private boolean C0(DecoderInputBuffer decoderInputBuffer) {
        if (wflxmlrfwp() || decoderInputBuffer.draadjrbmk() || this.O == -9223372036854775807L) {
            return true;
        }
        return this.O - (decoderInputBuffer.f10020esjtqupxsv - d()) <= 100000;
    }

    private void E0() {
        if (this.A > 0) {
            long jElapsedRealtime = ulzqkzuiru().elapsedRealtime();
            this.f11549f.agtfadlqog(this.A, jElapsedRealtime - this.f11569z);
            this.A = 0;
            this.f11569z = jElapsedRealtime;
        }
    }

    private void F0() {
        if (!this.f11552i.dxjokdxxww() || this.f11563t == null) {
            return;
        }
        N0();
    }

    private void G0() {
        int i13 = this.E;
        if (i13 != 0) {
            this.f11549f.zynmafqrjb(this.D, i13);
            this.D = 0L;
            this.E = 0;
        }
    }

    private void H0(jpowsppfya jpowsppfyaVar) {
        if (jpowsppfyaVar.equals(jpowsppfya.f115374eablkybsjg) || jpowsppfyaVar.equals(this.H)) {
            return;
        }
        this.H = jpowsppfyaVar;
        this.f11549f.cdpycssgdh(jpowsppfyaVar);
    }

    private void I0() {
        Surface surface = this.f11563t;
        if (surface == null || !this.f11566w) {
            return;
        }
        this.f11549f.pmvmpeiblj(surface);
    }

    private void J0() {
        jpowsppfya jpowsppfyaVar = this.H;
        if (jpowsppfyaVar != null) {
            this.f11549f.cdpycssgdh(jpowsppfyaVar);
        }
    }

    private void K0(MediaFormat mediaFormat) {
        if (this.f11560q == null || stevsuqkhv.igdgnonuha(this.f11547d)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void L0() {
        int i13;
        androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVarJrbgnlbqoe;
        if (!this.J || (i13 = stevsuqkhv.f123602iobyxmoadg) < 23 || (nufgyqmvbuVarJrbgnlbqoe = jrbgnlbqoe()) == null) {
            return;
        }
        this.L = new gxszxtbevo(nufgyqmvbuVarJrbgnlbqoe);
        if (i13 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            nufgyqmvbuVarJrbgnlbqoe.ppxfxbqfkf(bundle);
        }
    }

    private void M0(long j13, long j14, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        r3.lqeggnwhkg lqeggnwhkgVar = this.M;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.lqeggnwhkg(j13, j14, iobyxmoadgVar, eslsurpljm());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        this.f11549f.pmvmpeiblj(this.f11563t);
        this.f11566w = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        R();
    }

    private void Q0(androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar, int i13, long j13, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        long jLqeggnwhkg = this.f11553j.lqeggnwhkg();
        long jGxszxtbevo = this.f11553j.gxszxtbevo();
        if (c1() && jLqeggnwhkg == this.F) {
            f1(nufgyqmvbuVar, i13, j13);
        } else {
            M0(j13, jLqeggnwhkg, iobyxmoadgVar);
            T0(nufgyqmvbuVar, i13, j13, jLqeggnwhkg);
        }
        l1(jGxszxtbevo);
        this.F = jLqeggnwhkg;
    }

    private void R0() {
        PlaceholderSurface placeholderSurface = this.f11564u;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.f11564u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0(androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar, int i13, long j13, long j14) {
        T0(nufgyqmvbuVar, i13, j13, j14);
    }

    private static void U0(androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        nufgyqmvbuVar.ppxfxbqfkf(bundle);
    }

    private void V0(Object obj) throws ExoPlaybackException {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.f11563t == surface) {
            if (surface != null) {
                J0();
                I0();
                return;
            }
            return;
        }
        this.f11563t = surface;
        if (this.f11560q == null) {
            this.f11552i.vdvldrhtss(surface);
        }
        this.f11566w = false;
        int state = getState();
        androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVarJrbgnlbqoe = jrbgnlbqoe();
        if (nufgyqmvbuVarJrbgnlbqoe != null && this.f11560q == null) {
            androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar = (androidx.media3.exoplayer.mediacodec.btonecajqb) y2.iobyxmoadg.eablkybsjg(ezmngbhpjk());
            boolean zA0 = A0(btonecajqbVar);
            if (stevsuqkhv.f123602iobyxmoadg < 23 || !zA0 || this.f11558o) {
                J();
                r();
            } else {
                W0(nufgyqmvbuVarJrbgnlbqoe, z0(btonecajqbVar));
            }
        }
        if (surface != null) {
            J0();
        } else {
            this.H = null;
            VideoSink videoSink = this.f11560q;
            if (videoSink != null) {
                videoSink.yggfygwlhe();
            }
        }
        if (state == 2) {
            VideoSink videoSink2 = this.f11560q;
            if (videoSink2 != null) {
                videoSink2.iwizpuwonk(true);
            } else {
                this.f11552i.eablkybsjg(true);
            }
        }
        L0();
    }

    private void W0(androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar, Surface surface) {
        int i13 = stevsuqkhv.f123602iobyxmoadg;
        if (i13 >= 23 && surface != null) {
            X0(nufgyqmvbuVar, surface);
        } else {
            if (i13 < 35) {
                throw new IllegalStateException();
            }
            n0(nufgyqmvbuVar);
        }
    }

    private static int g1(Context context, androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        boolean z13;
        int i13 = 0;
        if (!iwizpuwonk.vdvldrhtss(iobyxmoadgVar.f9769ojitshcjhn)) {
            return hszhottldk.jyumaefscl(0);
        }
        boolean z14 = iobyxmoadgVar.f9764kcexrzcfyt != null;
        List listV0 = v0(context, draadjrbmkVar, iobyxmoadgVar, z14, false);
        if (z14 && listV0.isEmpty()) {
            listV0 = v0(context, draadjrbmkVar, iobyxmoadgVar, false, false);
        }
        if (listV0.isEmpty()) {
            return hszhottldk.jyumaefscl(1);
        }
        if (!MediaCodecRenderer.b0(iobyxmoadgVar)) {
            return hszhottldk.jyumaefscl(2);
        }
        androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar = (androidx.media3.exoplayer.mediacodec.btonecajqb) listV0.get(0);
        boolean zOjitshcjhn = btonecajqbVar.ojitshcjhn(iobyxmoadgVar);
        if (!zOjitshcjhn) {
            int i14 = 1;
            while (true) {
                if (i14 >= listV0.size()) {
                    z13 = true;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar2 = (androidx.media3.exoplayer.mediacodec.btonecajqb) listV0.get(i14);
                if (btonecajqbVar2.ojitshcjhn(iobyxmoadgVar)) {
                    z13 = false;
                    zOjitshcjhn = true;
                    btonecajqbVar = btonecajqbVar2;
                    break;
                }
                i14++;
            }
        } else {
            z13 = true;
            break;
        }
        int i15 = zOjitshcjhn ? 4 : 3;
        int i16 = btonecajqbVar.oxmwwwfdhm(iobyxmoadgVar) ? 16 : 8;
        int i17 = btonecajqbVar.f10808nufgyqmvbu ? 64 : 0;
        int i18 = z13 ? UserVerificationMethods.USER_VERIFY_PATTERN : 0;
        if (stevsuqkhv.f123602iobyxmoadg >= 26 && "video/dolby-vision".equals(iobyxmoadgVar.f9769ojitshcjhn) && !ppxfxbqfkf.iobyxmoadg(context)) {
            i18 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (zOjitshcjhn) {
            List listV1 = v0(context, draadjrbmkVar, iobyxmoadgVar, z14, true);
            if (!listV1.isEmpty()) {
                androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar3 = (androidx.media3.exoplayer.mediacodec.btonecajqb) MediaCodecUtil.agtfadlqog(listV1, iobyxmoadgVar).get(0);
                if (btonecajqbVar3.ojitshcjhn(iobyxmoadgVar) && btonecajqbVar3.oxmwwwfdhm(iobyxmoadgVar)) {
                    i13 = 32;
                }
            }
        }
        return hszhottldk.vdvldrhtss(i15, i16, i13, i17, i18);
    }

    private void h1() {
        androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVarJrbgnlbqoe = jrbgnlbqoe();
        if (nufgyqmvbuVarJrbgnlbqoe != null && stevsuqkhv.f123602iobyxmoadg >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.I));
            nufgyqmvbuVarJrbgnlbqoe.ppxfxbqfkf(bundle);
        }
    }

    private void j1(long j13) {
        int i13 = 0;
        while (true) {
            Long l13 = (Long) this.f11556m.peek();
            if (l13 == null || l13.longValue() >= j13) {
                break;
            }
            i13++;
            this.f11556m.poll();
        }
        i1(i13, 0);
    }

    private void k1(oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        cdpycssgdh cdpycssgdhVarOkpsazkaxt = okpsazkaxt();
        if (cdpycssgdhVarOkpsazkaxt.vdvldrhtss()) {
            this.O = -9223372036854775807L;
        } else {
            this.O = cdpycssgdhVarOkpsazkaxt.nufgyqmvbu(((oxmwwwfdhm.zoijcleaow) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar)).f11262iobyxmoadg, new cdpycssgdh.zoijcleaow()).btonecajqb();
        }
    }

    private static boolean o0() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    private static boolean q0() {
        byte b13 = 26;
        int i13 = stevsuqkhv.f123602iobyxmoadg;
        if (i13 <= 28) {
            String str = Build.DEVICE;
            str.hashCode();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (i13 <= 27 && "HWEML".equals(Build.DEVICE)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.hashCode();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i13 <= 26) {
                    String str3 = Build.DEVICE;
                    str3.hashCode();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b13 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b13 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b13 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b13 = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b13 = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b13 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b13 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            b13 = !str3.equals("PGN528") ? (byte) -1 : (byte) 7;
                            break;
                        case -1936688066:
                            b13 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b13 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b13 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b13 = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b13 = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b13 = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b13 = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b13 = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b13 = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b13 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b13 = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b13 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b13 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b13 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b13 = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b13 = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b13 = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b13 = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            if (!str3.equals("A10-70L")) {
                                b13 = -1;
                            }
                            break;
                        case -965403638:
                            b13 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b13 = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b13 = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b13 = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b13 = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b13 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b13 = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b13 = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b13 = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b13 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b13 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b13 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b13 = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b13 = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b13 = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b13 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b13 = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b13 = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b13 = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b13 = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b13 = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b13 = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b13 = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b13 = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b13 = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b13 = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b13 = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b13 = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b13 = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b13 = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b13 = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b13 = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b13 = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b13 = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b13 = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b13 = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b13 = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b13 = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b13 = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b13 = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b13 = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b13 = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b13 = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b13 = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b13 = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b13 = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b13 = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b13 = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b13 = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b13 = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b13 = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b13 = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b13 = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b13 = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b13 = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b13 = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b13 = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b13 = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b13 = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b13 = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b13 = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b13 = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b13 = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b13 = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b13 = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b13 = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b13 = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b13 = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b13 = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b13 = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b13 = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b13 = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b13 = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b13 = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b13 = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b13 = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b13 = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b13 = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b13 = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b13 = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b13 = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b13 = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b13 = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b13 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b13 = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b13 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b13 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b13 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b13 = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b13 = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b13 = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b13 = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b13 = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b13 = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b13 = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b13 = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b13 = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b13 = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b13 = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b13 = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b13 = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b13 = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b13 = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b13 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b13 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b13 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b13 = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b13 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b13 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b13 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b13 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b13 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b13 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b13 = -1;
                            break;
                    }
                    switch (b13) {
                        default:
                            str2.hashCode();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case C4007z9.F /* 25 */:
                        case C4007z9.G /* 26 */:
                        case 27:
                        case 28:
                        case C4007z9.I /* 29 */:
                        case 30:
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 33:
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case C4007z9.J /* 35 */:
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        case C4007z9.K /* 38 */:
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        case 40:
                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        case 42:
                        case 43:
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case BuildConfig.API_LEVEL /* 115 */:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    public static int s0(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        byte b13 = 1;
        int i13 = iobyxmoadgVar.f9763jyumaefscl;
        int i14 = iobyxmoadgVar.f9761iwizpuwonk;
        if (i13 == -1 || i14 == -1) {
            return -1;
        }
        String str = (String) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar.f9769ojitshcjhn);
        if ("video/dolby-vision".equals(str)) {
            Pair pairDxjokdxxww = MediaCodecUtil.dxjokdxxww(iobyxmoadgVar);
            if (pairDxjokdxxww == null) {
                str = "video/hevc";
            } else {
                int iIntValue = ((Integer) pairDxjokdxxww.first).intValue();
                if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                    str = "video/avc";
                } else if (iIntValue == 1024) {
                    str = "video/av01";
                } else {
                    str = "video/hevc";
                }
            }
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1664118616:
                b13 = !str.equals("video/3gpp") ? (byte) -1 : (byte) 0;
                break;
            case -1662735862:
                if (!str.equals("video/av01")) {
                    b13 = -1;
                }
                break;
            case -1662541442:
                b13 = !str.equals("video/hevc") ? (byte) -1 : (byte) 2;
                break;
            case 1187890754:
                b13 = !str.equals("video/mp4v-es") ? (byte) -1 : (byte) 3;
                break;
            case 1331836730:
                b13 = !str.equals("video/avc") ? (byte) -1 : (byte) 4;
                break;
            case 1599127256:
                b13 = !str.equals("video/x-vnd.on2.vp8") ? (byte) -1 : (byte) 5;
                break;
            case 1599127257:
                b13 = !str.equals("video/x-vnd.on2.vp9") ? (byte) -1 : (byte) 6;
                break;
            default:
                b13 = -1;
                break;
        }
        switch (b13) {
            case 0:
            case 1:
            case 3:
            case 5:
                return x0(i13 * i14, 2);
            case 2:
                return Math.max(2097152, x0(i13 * i14, 2));
            case 4:
                String str2 = Build.MODEL;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Build.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && btonecajqbVar.f10807lqeggnwhkg)))) {
                    return -1;
                }
                return x0(stevsuqkhv.btonecajqb(i13, 16) * stevsuqkhv.btonecajqb(i14, 16) * UserVerificationMethods.USER_VERIFY_HANDPRINT, 2);
            case 6:
                return x0(i13 * i14, 4);
            default:
                return -1;
        }
    }

    private static Point t0(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadgVar.f9761iwizpuwonk;
        int i14 = iobyxmoadgVar.f9763jyumaefscl;
        boolean z13 = i13 > i14;
        int i15 = z13 ? i13 : i14;
        if (z13) {
            i13 = i14;
        }
        float f13 = i13 / i15;
        for (int i16 : S) {
            int i17 = (int) (i16 * f13);
            if (i16 <= i15 || i17 <= i13) {
                break;
            }
            int i18 = z13 ? i17 : i16;
            if (!z13) {
                i16 = i17;
            }
            Point pointPpxfxbqfkf = btonecajqbVar.ppxfxbqfkf(i18, i16);
            float f14 = iobyxmoadgVar.f9748cqumvgiudr;
            if (pointPpxfxbqfkf != null && btonecajqbVar.yggfygwlhe(pointPpxfxbqfkf.x, pointPpxfxbqfkf.y, f14)) {
                return pointPpxfxbqfkf;
            }
        }
        return null;
    }

    private static List v0(Context context, androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14) {
        String str = iobyxmoadgVar.f9769ojitshcjhn;
        if (str == null) {
            return zdlpuopuiu.zynmafqrjb();
        }
        if (stevsuqkhv.f123602iobyxmoadg >= 26 && "video/dolby-vision".equals(str) && !ppxfxbqfkf.iobyxmoadg(context)) {
            List listLqeggnwhkg = MediaCodecUtil.lqeggnwhkg(draadjrbmkVar, iobyxmoadgVar, z13, z14);
            if (!listLqeggnwhkg.isEmpty()) {
                return listLqeggnwhkg;
            }
        }
        return MediaCodecUtil.wflxmlrfwp(draadjrbmkVar, iobyxmoadgVar, z13, z14);
    }

    protected static int w0(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.f9774rgvfuqvkyq == -1) {
            return s0(btonecajqbVar, iobyxmoadgVar);
        }
        int size = iobyxmoadgVar.f9770oxmwwwfdhm.size();
        int length = 0;
        for (int i13 = 0; i13 < size; i13++) {
            length += ((byte[]) iobyxmoadgVar.f9770oxmwwwfdhm.get(i13)).length;
        }
        return iobyxmoadgVar.f9774rgvfuqvkyq + length;
    }

    private static int x0(int i13, int i14) {
        return (i13 * 3) / (i14 * 2);
    }

    private Surface z0(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar) {
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            return videoSink.ojitshcjhn();
        }
        Surface surface = this.f11563t;
        if (surface != null) {
            return surface;
        }
        if (d1(btonecajqbVar)) {
            return null;
        }
        y2.iobyxmoadg.lqeggnwhkg(e1(btonecajqbVar));
        PlaceholderSurface placeholderSurface = this.f11564u;
        if (placeholderSurface != null && placeholderSurface.f11459zdlpuopuiu != btonecajqbVar.f10807lqeggnwhkg) {
            R0();
        }
        if (this.f11564u == null) {
            this.f11564u = PlaceholderSurface.eablkybsjg(this.f11547d, btonecajqbVar.f10807lqeggnwhkg);
        }
        return this.f11564u;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void A(long j13) {
        super.A(j13);
        if (this.J) {
            return;
        }
        this.C--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void B() {
        super.B();
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            videoSink.ppxfxbqfkf();
            this.f11560q.eablkybsjg(e(), r0());
        } else {
            this.f11552i.btonecajqb();
        }
        this.P = true;
        L0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void C(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (this.f11554k != null && ((androidx.media3.exoplayer.mediacodec.btonecajqb) y2.iobyxmoadg.eablkybsjg(ezmngbhpjk())).f10811zoijcleaow.equals("video/av01") && (byteBuffer = decoderInputBuffer.f10021iwizpuwonk) != null) {
            this.f11554k.zoijcleaow(byteBuffer);
        }
        this.R = 0;
        boolean z13 = this.J;
        if (!z13) {
            this.C++;
        }
        if (stevsuqkhv.f123602iobyxmoadg >= 23 || !z13) {
            return;
        }
        O0(decoderInputBuffer.f10020esjtqupxsv);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void D(wizcaqwiak.iobyxmoadg iobyxmoadgVar) {
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            videoSink.lqeggnwhkg(iobyxmoadgVar);
        }
    }

    protected boolean D0(long j13, boolean z13) throws ExoPlaybackException {
        int iWeqkydbzbr = weqkydbzbr(j13);
        if (iWeqkydbzbr == 0) {
            return false;
        }
        if (z13) {
            f3.zoijcleaow zoijcleaowVar = this.f10778yzdjzghtvl;
            int i13 = zoijcleaowVar.f32714wkgbmnqykc + iWeqkydbzbr;
            zoijcleaowVar.f32714wkgbmnqykc = i13;
            zoijcleaowVar.f32709gxszxtbevo += this.C;
            zoijcleaowVar.f32714wkgbmnqykc = i13 + this.f11556m.size();
        } else {
            this.f10778yzdjzghtvl.f32704btonecajqb++;
            i1(iWeqkydbzbr + this.f11556m.size(), this.C);
        }
        grlcpdaxtj();
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            videoSink.jyumaefscl(false);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean F(long j13, long j14, androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar, ByteBuffer byteBuffer, int i13, int i14, int i15, long j15, boolean z13, boolean z14, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        y2.iobyxmoadg.eablkybsjg(nufgyqmvbuVar);
        long jD = j15 - d();
        j1(j15);
        if (this.f11560q != null) {
            if (!z13 || z14) {
                return this.f11560q.iobyxmoadg(r0() + j15, z14, new zoijcleaow(nufgyqmvbuVar, i13, jD));
            }
            f1(nufgyqmvbuVar, i13, jD);
            return true;
        }
        int iPpxfxbqfkf = this.f11552i.ppxfxbqfkf(j15, j13, j14, e(), z13, z14, this.f11553j);
        if (iPpxfxbqfkf == 0) {
            long jNanoTime = ulzqkzuiru().nanoTime();
            M0(jD, jNanoTime, iobyxmoadgVar);
            S0(nufgyqmvbuVar, i13, jD, jNanoTime);
            l1(this.f11553j.gxszxtbevo());
            return true;
        }
        if (iPpxfxbqfkf == 1) {
            Q0((androidx.media3.exoplayer.mediacodec.nufgyqmvbu) y2.iobyxmoadg.dxjokdxxww(nufgyqmvbuVar), i13, jD, iobyxmoadgVar);
            return true;
        }
        if (iPpxfxbqfkf == 2) {
            p0(nufgyqmvbuVar, i13, jD);
            l1(this.f11553j.gxszxtbevo());
            return true;
        }
        if (iPpxfxbqfkf == 3) {
            f1(nufgyqmvbuVar, i13, jD);
            l1(this.f11553j.gxszxtbevo());
            return true;
        }
        if (iPpxfxbqfkf == 4 || iPpxfxbqfkf == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iPpxfxbqfkf));
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void K() {
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            videoSink.ppxfxbqfkf();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void L() {
        super.L();
        this.f11556m.clear();
        this.Q = false;
        this.C = 0;
        this.R = 0;
        androidx.media3.exoplayer.video.iobyxmoadg iobyxmoadgVar = this.f11554k;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf();
        }
    }

    protected void O0(long j13) {
        e0(j13);
        H0(this.G);
        this.f10778yzdjzghtvl.f32707eablkybsjg++;
        F0();
        A(j13);
    }

    protected void T0(androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar, int i13, long j13, long j14) {
        y2.jpowsppfya.iobyxmoadg("releaseOutputBuffer");
        nufgyqmvbuVar.draadjrbmk(i13, j14);
        y2.jpowsppfya.zoijcleaow();
        this.f10778yzdjzghtvl.f32707eablkybsjg++;
        this.B = 0;
        if (this.f11560q == null) {
            H0(this.G);
            F0();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean V(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (C0(decoderInputBuffer) || decoderInputBuffer.oxmwwwfdhm()) {
            return false;
        }
        boolean zB0 = B0(decoderInputBuffer);
        if ((!zB0 && !this.Q) || decoderInputBuffer.nufgyqmvbu()) {
            return false;
        }
        if (decoderInputBuffer.wflxmlrfwp()) {
            decoderInputBuffer.gxszxtbevo();
            if (zB0) {
                this.f10778yzdjzghtvl.f32714wkgbmnqykc++;
            } else if (this.Q) {
                this.f11556m.add(Long.valueOf(decoderInputBuffer.f10020esjtqupxsv));
                this.R++;
            }
            return true;
        }
        if (this.f11554k != null && ((androidx.media3.exoplayer.mediacodec.btonecajqb) y2.iobyxmoadg.eablkybsjg(ezmngbhpjk())).f10811zoijcleaow.equals("video/av01") && (byteBuffer = decoderInputBuffer.f10021iwizpuwonk) != null) {
            boolean z13 = zB0 || this.R <= 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            byteBufferAsReadOnlyBuffer.flip();
            int iWkgbmnqykc = this.f11554k.wkgbmnqykc(byteBufferAsReadOnlyBuffer, z13);
            boolean z14 = ((eablkybsjg) y2.iobyxmoadg.eablkybsjg(this.f11557n)).f11571ppxfxbqfkf + iWkgbmnqykc < byteBufferAsReadOnlyBuffer.capacity();
            if (iWkgbmnqykc != byteBufferAsReadOnlyBuffer.limit() && z14) {
                ((ByteBuffer) y2.iobyxmoadg.eablkybsjg(decoderInputBuffer.f10021iwizpuwonk)).position(iWkgbmnqykc);
                if (zB0) {
                    this.f10778yzdjzghtvl.f32714wkgbmnqykc++;
                } else if (this.Q) {
                    this.f11556m.add(Long.valueOf(decoderInputBuffer.f10020esjtqupxsv));
                    this.R++;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean W(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar) {
        return A0(btonecajqbVar);
    }

    protected void X0(androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar, Surface surface) {
        nufgyqmvbuVar.btonecajqb(surface);
    }

    public void Y0(List list) {
        this.f11562s = list;
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            videoSink.dxjokdxxww(list);
        }
    }

    protected boolean Z0(long j13, long j14, boolean z13) {
        return j13 < -500000 && !z13;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int a0(androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return g1(this.f11547d, draadjrbmkVar, iobyxmoadgVar);
    }

    protected boolean a1(long j13, long j14, boolean z13) {
        return j13 < -30000 && !z13;
    }

    protected boolean b1(long j13, long j14) {
        return j13 < -30000 && j14 > 100000;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.wizcaqwiak
    public void btonecajqb(long j13, long j14) throws ExoPlaybackException {
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            try {
                videoSink.btonecajqb(j13, j14);
            } catch (VideoSink.VideoSinkException e13) {
                throw mbcevpiqjq(e13, e13.f11465zdlpuopuiu, 7001);
            }
        }
        super.btonecajqb(j13, j14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.mediacodec.nufgyqmvbu.iobyxmoadg c(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, MediaCrypto mediaCrypto, float f13) {
        String str = btonecajqbVar.f10809ppxfxbqfkf;
        eablkybsjg eablkybsjgVarU0 = u0(btonecajqbVar, iobyxmoadgVar, jhduphickx());
        this.f11557n = eablkybsjgVarU0;
        MediaFormat mediaFormatY0 = y0(iobyxmoadgVar, str, eablkybsjgVarU0, f13, this.f11551h, this.J ? this.K : 0);
        Surface surfaceZ0 = z0(btonecajqbVar);
        K0(mediaFormatY0);
        return androidx.media3.exoplayer.mediacodec.nufgyqmvbu.iobyxmoadg.zoijcleaow(btonecajqbVar, mediaFormatY0, iobyxmoadgVar, surfaceZ0, mediaCrypto);
    }

    protected boolean c1() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.gtknphoqwx.zoijcleaow
    public boolean cdpycssgdh(long j13, long j14, long j15, boolean z13, boolean z14) {
        if (this.f11555l != -9223372036854775807L) {
            this.Q = j14 > ribwqtqdhb() + 200000 && j13 < this.f11555l;
        }
        return Z0(j13, j15, z13) && D0(j14, z14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu, androidx.media3.exoplayer.igdgnonuha.zoijcleaow
    public void cqumvgiudr(int i13, Object obj) throws ExoPlaybackException {
        if (i13 == 1) {
            V0(obj);
            return;
        }
        if (i13 == 7) {
            r3.lqeggnwhkg lqeggnwhkgVar = (r3.lqeggnwhkg) y2.iobyxmoadg.eablkybsjg(obj);
            this.M = lqeggnwhkgVar;
            VideoSink videoSink = this.f11560q;
            if (videoSink != null) {
                videoSink.zoijcleaow(lqeggnwhkgVar);
                return;
            }
            return;
        }
        if (i13 == 10) {
            int iIntValue = ((Integer) y2.iobyxmoadg.eablkybsjg(obj)).intValue();
            if (this.K != iIntValue) {
                this.K = iIntValue;
                if (this.J) {
                    J();
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 4) {
            this.f11567x = ((Integer) y2.iobyxmoadg.eablkybsjg(obj)).intValue();
            androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVarJrbgnlbqoe = jrbgnlbqoe();
            if (nufgyqmvbuVarJrbgnlbqoe != null) {
                nufgyqmvbuVarJrbgnlbqoe.nufgyqmvbu(this.f11567x);
                return;
            }
            return;
        }
        if (i13 == 5) {
            int iIntValue2 = ((Integer) y2.iobyxmoadg.eablkybsjg(obj)).intValue();
            this.f11568y = iIntValue2;
            VideoSink videoSink2 = this.f11560q;
            if (videoSink2 != null) {
                videoSink2.kcexrzcfyt(iIntValue2);
                return;
            } else {
                this.f11552i.agtfadlqog(iIntValue2);
                return;
            }
        }
        if (i13 == 13) {
            Y0((List) y2.iobyxmoadg.eablkybsjg(obj));
            return;
        }
        if (i13 == 14) {
            lmojexxdyd lmojexxdydVar = (lmojexxdyd) y2.iobyxmoadg.eablkybsjg(obj);
            if (lmojexxdydVar.zoijcleaow() == 0 || lmojexxdydVar.iobyxmoadg() == 0) {
                return;
            }
            this.f11565v = lmojexxdydVar;
            VideoSink videoSink3 = this.f11560q;
            if (videoSink3 != null) {
                videoSink3.agtfadlqog((Surface) y2.iobyxmoadg.dxjokdxxww(this.f11563t), lmojexxdydVar);
                return;
            }
            return;
        }
        if (i13 == 16) {
            this.I = ((Integer) y2.iobyxmoadg.eablkybsjg(obj)).intValue();
            h1();
        } else {
            if (i13 != 17) {
                super.cqumvgiudr(i13, obj);
                return;
            }
            Surface surface = this.f11563t;
            V0(null);
            ((nufgyqmvbu) y2.iobyxmoadg.eablkybsjg(obj)).cqumvgiudr(1, surface);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void czzsidtyhn(long j13, boolean z13) throws ExoPlaybackException {
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            if (!z13) {
                videoSink.jyumaefscl(true);
            }
            this.f11560q.eablkybsjg(e(), r0());
            this.P = true;
        }
        super.czzsidtyhn(j13, z13);
        if (this.f11560q == null) {
            this.f11552i.wflxmlrfwp();
        }
        if (z13) {
            VideoSink videoSink2 = this.f11560q;
            if (videoSink2 != null) {
                videoSink2.iwizpuwonk(false);
            } else {
                this.f11552i.eablkybsjg(false);
            }
        }
        L0();
        this.B = 0;
    }

    protected boolean d1(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar) {
        return stevsuqkhv.f123602iobyxmoadg >= 35 && btonecajqbVar.f10804gtknphoqwx;
    }

    protected boolean e1(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar) {
        return stevsuqkhv.f123602iobyxmoadg >= 23 && !this.J && !m0(btonecajqbVar.f10806iobyxmoadg) && (!btonecajqbVar.f10807lqeggnwhkg || PlaceholderSurface.ppxfxbqfkf(this.f11547d));
    }

    protected void f1(androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar, int i13, long j13) {
        y2.jpowsppfya.iobyxmoadg("skipVideoBuffer");
        nufgyqmvbuVar.ojitshcjhn(i13, false);
        y2.jpowsppfya.zoijcleaow();
        this.f10778yzdjzghtvl.f32709gxszxtbevo++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int fmlbqenlif(DecoderInputBuffer decoderInputBuffer) {
        return (stevsuqkhv.f123602iobyxmoadg >= 34 && this.J && B0(decoderInputBuffer)) ? 32 : 0;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak, androidx.media3.exoplayer.hszhottldk
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void h(DecoderInputBuffer decoderInputBuffer) {
        if (this.f11559p) {
            ByteBuffer byteBuffer = (ByteBuffer) y2.iobyxmoadg.eablkybsjg(decoderInputBuffer.f10023lereixgezr);
            if (byteBuffer.remaining() >= 7) {
                byte b13 = byteBuffer.get();
                short s13 = byteBuffer.getShort();
                short s14 = byteBuffer.getShort();
                byte b14 = byteBuffer.get();
                byte b15 = byteBuffer.get();
                byteBuffer.position(0);
                if (b13 == -75 && s13 == 60 && s14 == 1 && b14 == 4) {
                    if (b15 == 0 || b15 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        U0((androidx.media3.exoplayer.mediacodec.nufgyqmvbu) y2.iobyxmoadg.eablkybsjg(jrbgnlbqoe()), bArr);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.video.gtknphoqwx.zoijcleaow
    public boolean hkdspvbjdz(long j13, long j14, boolean z13) {
        return a1(j13, j14, z13);
    }

    protected void i1(int i13, int i14) {
        f3.zoijcleaow zoijcleaowVar = this.f10778yzdjzghtvl;
        zoijcleaowVar.f32712nufgyqmvbu += i13;
        int i15 = i13 + i14;
        zoijcleaowVar.f32711lqeggnwhkg += i15;
        this.A += i15;
        int i16 = this.B + i15;
        this.B = i16;
        zoijcleaowVar.f32706dxjokdxxww = Math.max(i16, zoijcleaowVar.f32706dxjokdxxww);
        int i17 = this.f11550g;
        if (i17 <= 0 || this.A < i17) {
            return;
        }
        E0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.wizcaqwiak
    public void jpowsppfya(float f13, float f14) throws ExoPlaybackException {
        super.jpowsppfya(f13, f14);
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            videoSink.zdlpuopuiu(f13);
        } else {
            this.f11552i.oxmwwwfdhm(f13);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List krqnebusok(androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, boolean z13) {
        return MediaCodecUtil.agtfadlqog(v0(this.f11547d, draadjrbmkVar, iobyxmoadgVar, z13, this.J), iobyxmoadgVar);
    }

    protected void l0(VideoSink videoSink, int i13, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        List listZynmafqrjb = this.f11562s;
        if (listZynmafqrjb == null) {
            listZynmafqrjb = zdlpuopuiu.zynmafqrjb();
        }
        videoSink.vdvldrhtss(i13, iobyxmoadgVar, listZynmafqrjb);
    }

    protected void l1(long j13) {
        this.f10778yzdjzghtvl.iobyxmoadg(j13);
        this.D += j13;
        this.E++;
    }

    protected boolean m0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (nufgyqmvbu.class) {
            try {
                if (!T) {
                    U = q0();
                    T = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return U;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void metgxyhuhe(boolean z13, boolean z14) {
        super.metgxyhuhe(z13, z14);
        boolean z15 = sopmlzcsov().f32666zoijcleaow;
        y2.iobyxmoadg.lqeggnwhkg((z15 && this.K == 0) ? false : true);
        if (this.J != z15) {
            this.J = z15;
            J();
        }
        this.f11549f.ojitshcjhn(this.f10778yzdjzghtvl);
        if (!this.f11561r) {
            if (this.f11562s != null && this.f11560q == null) {
                dxjokdxxww dxjokdxxwwVarNufgyqmvbu = new dxjokdxxww.zoijcleaow(this.f11547d, this.f11552i).dxjokdxxww(ulzqkzuiru()).nufgyqmvbu();
                dxjokdxxwwVarNufgyqmvbu.dsvhmnatus(1);
                this.f11560q = dxjokdxxwwVarNufgyqmvbu.zynmafqrjb(0);
            }
            this.f11561r = true;
        }
        VideoSink videoSink = this.f11560q;
        if (videoSink == null) {
            this.f11552i.ojitshcjhn(ulzqkzuiru());
            this.f11552i.nufgyqmvbu(z14);
            return;
        }
        videoSink.cqumvgiudr(new iobyxmoadg(), com.google.common.util.concurrent.eablkybsjg.iobyxmoadg());
        r3.lqeggnwhkg lqeggnwhkgVar = this.M;
        if (lqeggnwhkgVar != null) {
            this.f11560q.zoijcleaow(lqeggnwhkgVar);
        }
        if (this.f11563t != null && !this.f11565v.equals(lmojexxdyd.f123566ppxfxbqfkf)) {
            this.f11560q.agtfadlqog(this.f11563t, this.f11565v);
        }
        this.f11560q.kcexrzcfyt(this.f11568y);
        this.f11560q.zdlpuopuiu(f());
        List list = this.f11562s;
        if (list != null) {
            this.f11560q.dxjokdxxww(list);
        }
        this.f11560q.wflxmlrfwp(z14);
        wizcaqwiak.iobyxmoadg iobyxmoadgVarG = g();
        if (iobyxmoadgVarG != null) {
            this.f11560q.lqeggnwhkg(iobyxmoadgVarG);
        }
    }

    protected void n0(androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar) {
        nufgyqmvbuVar.lqeggnwhkg();
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public void nufgyqmvbu() {
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            videoSink.nufgyqmvbu();
        } else {
            this.f11552i.iobyxmoadg();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void oipsdeybqn(androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr, long j13, long j14, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        super.oipsdeybqn(iobyxmoadgVarArr, j13, j14, zoijcleaowVar);
        if (this.N == -9223372036854775807L) {
            this.N = j13;
        }
        k1(zoijcleaowVar);
    }

    protected void p0(androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVar, int i13, long j13) {
        y2.jpowsppfya.iobyxmoadg("dropVideoBuffer");
        nufgyqmvbuVar.ojitshcjhn(i13, false);
        y2.jpowsppfya.zoijcleaow();
        i1(0, 1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.wizcaqwiak
    public boolean ppxfxbqfkf() {
        boolean zPpxfxbqfkf = super.ppxfxbqfkf();
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            return videoSink.gtknphoqwx(zPpxfxbqfkf);
        }
        if (zPpxfxbqfkf && (jrbgnlbqoe() == null || this.J)) {
            return true;
        }
        return this.f11552i.wkgbmnqykc(zPpxfxbqfkf);
    }

    protected long r0() {
        return -this.N;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean rhgxfdycjh() {
        return this.J && stevsuqkhv.f123602iobyxmoadg < 23;
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void rlfsiqarku() {
        super.rlfsiqarku();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void sflfametgt() {
        super.sflfametgt();
        this.A = 0;
        this.f11569z = ulzqkzuiru().elapsedRealtime();
        this.D = 0L;
        this.E = 0;
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            videoSink.rgvfuqvkyq();
        } else {
            this.f11552i.gtknphoqwx();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException skhdrjzrfn(Throwable th2, androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar) {
        return new MediaCodecVideoDecoderException(th2, btonecajqbVar, this.f11563t);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean t(androidx.media3.common.iobyxmoadg iobyxmoadgVar) throws ExoPlaybackException {
        VideoSink videoSink = this.f11560q;
        if (videoSink == null || videoSink.isInitialized()) {
            return true;
        }
        try {
            return this.f11560q.draadjrbmk(iobyxmoadgVar);
        } catch (VideoSink.VideoSinkException e13) {
            throw mbcevpiqjq(e13, iobyxmoadgVar, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected f3.ppxfxbqfkf tbqsvytpvh(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2) {
        f3.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = btonecajqbVar.eablkybsjg(iobyxmoadgVar, iobyxmoadgVar2);
        int i13 = ppxfxbqfkfVarEablkybsjg.f32688eablkybsjg;
        eablkybsjg eablkybsjgVar = (eablkybsjg) y2.iobyxmoadg.eablkybsjg(this.f11557n);
        if (iobyxmoadgVar2.f9763jyumaefscl > eablkybsjgVar.f11570iobyxmoadg || iobyxmoadgVar2.f9761iwizpuwonk > eablkybsjgVar.f11572zoijcleaow) {
            i13 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (w0(btonecajqbVar, iobyxmoadgVar2) > eablkybsjgVar.f11571ppxfxbqfkf) {
            i13 |= 64;
        }
        int i14 = i13;
        return new f3.ppxfxbqfkf(btonecajqbVar.f10806iobyxmoadg, iobyxmoadgVar, iobyxmoadgVar2, i14 != 0 ? 0 : ppxfxbqfkfVarEablkybsjg.f32691wkgbmnqykc, i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void u(Exception exc) {
        kcexrzcfyt.wkgbmnqykc("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f11549f.istkbnxepw(exc);
    }

    protected eablkybsjg u0(androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr) {
        int iS0;
        int iMax = iobyxmoadgVar.f9763jyumaefscl;
        int iMax2 = iobyxmoadgVar.f9761iwizpuwonk;
        int iW0 = w0(btonecajqbVar, iobyxmoadgVar);
        if (iobyxmoadgVarArr.length == 1) {
            if (iW0 != -1 && (iS0 = s0(btonecajqbVar, iobyxmoadgVar)) != -1) {
                iW0 = Math.min((int) (iW0 * 1.5f), iS0);
            }
            return new eablkybsjg(iMax, iMax2, iW0);
        }
        int length = iobyxmoadgVarArr.length;
        boolean z13 = false;
        for (int i13 = 0; i13 < length; i13++) {
            androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = iobyxmoadgVarArr[i13];
            if (iobyxmoadgVar.f9760istkbnxepw != null && iobyxmoadgVarCllcsxoeiz.f9760istkbnxepw == null) {
                iobyxmoadgVarCllcsxoeiz = iobyxmoadgVarCllcsxoeiz.zoijcleaow().mbcevpiqjq(iobyxmoadgVar.f9760istkbnxepw).cllcsxoeiz();
            }
            if (btonecajqbVar.eablkybsjg(iobyxmoadgVar, iobyxmoadgVarCllcsxoeiz).f32691wkgbmnqykc != 0) {
                int i14 = iobyxmoadgVarCllcsxoeiz.f9763jyumaefscl;
                z13 |= i14 == -1 || iobyxmoadgVarCllcsxoeiz.f9761iwizpuwonk == -1;
                iMax = Math.max(iMax, i14);
                iMax2 = Math.max(iMax2, iobyxmoadgVarCllcsxoeiz.f9761iwizpuwonk);
                iW0 = Math.max(iW0, w0(btonecajqbVar, iobyxmoadgVarCllcsxoeiz));
            }
        }
        if (z13) {
            kcexrzcfyt.nufgyqmvbu("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointT0 = t0(btonecajqbVar, iobyxmoadgVar);
            if (pointT0 != null) {
                iMax = Math.max(iMax, pointT0.x);
                iMax2 = Math.max(iMax2, pointT0.y);
                iW0 = Math.max(iW0, s0(btonecajqbVar, iobyxmoadgVar.zoijcleaow().auzgnhcxok(iMax).okpsazkaxt(iMax2).cllcsxoeiz()));
                kcexrzcfyt.nufgyqmvbu("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new eablkybsjg(iMax, iMax2, iW0);
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void uwvvkdfqfp() {
        super.uwvvkdfqfp();
        VideoSink videoSink = this.f11560q;
        if (videoSink == null || !this.f11548e) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void v(String str, androidx.media3.exoplayer.mediacodec.nufgyqmvbu.iobyxmoadg iobyxmoadgVar, long j13, long j14) {
        this.f11549f.gtknphoqwx(str, j13, j14);
        this.f11558o = m0(str);
        this.f11559p = ((androidx.media3.exoplayer.mediacodec.btonecajqb) y2.iobyxmoadg.eablkybsjg(ezmngbhpjk())).rgvfuqvkyq();
        L0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void w(String str) {
        this.f11549f.draadjrbmk(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.wizcaqwiak
    public boolean wkgbmnqykc() {
        VideoSink videoSink;
        return super.wkgbmnqykc() && ((videoSink = this.f11560q) == null || videoSink.wkgbmnqykc());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected f3.ppxfxbqfkf x(f3.lmojexxdyd lmojexxdydVar) throws ExoPlaybackException {
        f3.ppxfxbqfkf ppxfxbqfkfVarX = super.x(lmojexxdydVar);
        this.f11549f.rgvfuqvkyq((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(lmojexxdydVar.f32682zoijcleaow), ppxfxbqfkfVarX);
        return ppxfxbqfkfVarX;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void xrmfcynszj() {
        this.H = null;
        this.O = -9223372036854775807L;
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            videoSink.oxmwwwfdhm();
        } else {
            this.f11552i.lqeggnwhkg();
        }
        L0();
        this.f11566w = false;
        this.L = null;
        try {
            super.xrmfcynszj();
        } finally {
            this.f11549f.wflxmlrfwp(this.f10778yzdjzghtvl);
            this.f11549f.cdpycssgdh(jpowsppfya.f115374eablkybsjg);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void y(androidx.media3.common.iobyxmoadg iobyxmoadgVar, MediaFormat mediaFormat) {
        int integer;
        int i13;
        androidx.media3.exoplayer.mediacodec.nufgyqmvbu nufgyqmvbuVarJrbgnlbqoe = jrbgnlbqoe();
        if (nufgyqmvbuVarJrbgnlbqoe != null) {
            nufgyqmvbuVarJrbgnlbqoe.nufgyqmvbu(this.f11567x);
        }
        if (this.J) {
            i13 = iobyxmoadgVar.f9763jyumaefscl;
            integer = iobyxmoadgVar.f9761iwizpuwonk;
        } else {
            y2.iobyxmoadg.eablkybsjg(mediaFormat);
            boolean z13 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z13 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z13 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i13 = integer2;
        }
        float f13 = iobyxmoadgVar.f9765lereixgezr;
        int i14 = iobyxmoadgVar.f9753esjtqupxsv;
        if (i14 == 90 || i14 == 270) {
            f13 = 1.0f / f13;
            int i15 = integer;
            integer = i13;
            i13 = i15;
        }
        this.G = new jpowsppfya(i13, integer, f13);
        VideoSink videoSink = this.f11560q;
        if (videoSink == null || !this.P) {
            this.f11552i.rgvfuqvkyq(iobyxmoadgVar.f9748cqumvgiudr);
        } else {
            l0(videoSink, 1, iobyxmoadgVar.zoijcleaow().auzgnhcxok(i13).okpsazkaxt(integer).opjhrmiecq(f13).cllcsxoeiz());
        }
        this.P = false;
    }

    protected MediaFormat y0(androidx.media3.common.iobyxmoadg iobyxmoadgVar, String str, eablkybsjg eablkybsjgVar, float f13, boolean z13, int i13) {
        Pair pairDxjokdxxww;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", iobyxmoadgVar.f9763jyumaefscl);
        mediaFormat.setInteger("height", iobyxmoadgVar.f9761iwizpuwonk);
        jyumaefscl.eablkybsjg(mediaFormat, iobyxmoadgVar.f9770oxmwwwfdhm);
        jyumaefscl.ppxfxbqfkf(mediaFormat, "frame-rate", iobyxmoadgVar.f9748cqumvgiudr);
        jyumaefscl.wkgbmnqykc(mediaFormat, "rotation-degrees", iobyxmoadgVar.f9753esjtqupxsv);
        jyumaefscl.zoijcleaow(mediaFormat, iobyxmoadgVar.f9760istkbnxepw);
        if ("video/dolby-vision".equals(iobyxmoadgVar.f9769ojitshcjhn) && (pairDxjokdxxww = MediaCodecUtil.dxjokdxxww(iobyxmoadgVar)) != null) {
            jyumaefscl.wkgbmnqykc(mediaFormat, Scopes.PROFILE, ((Integer) pairDxjokdxxww.first).intValue());
        }
        mediaFormat.setInteger("max-width", eablkybsjgVar.f11570iobyxmoadg);
        mediaFormat.setInteger("max-height", eablkybsjgVar.f11572zoijcleaow);
        jyumaefscl.wkgbmnqykc(mediaFormat, "max-input-size", eablkybsjgVar.f11571ppxfxbqfkf);
        int i14 = stevsuqkhv.f123602iobyxmoadg;
        if (i14 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f13 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f13);
            }
        }
        if (z13) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i13 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i13);
        }
        if (i14 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.I));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void ydmasvzmpa() {
        try {
            super.ydmasvzmpa();
        } finally {
            this.f11561r = false;
            this.N = -9223372036854775807L;
            R0();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float yzdjzghtvl(float f13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr) {
        float fMax = -1.0f;
        for (androidx.media3.common.iobyxmoadg iobyxmoadgVar2 : iobyxmoadgVarArr) {
            float f14 = iobyxmoadgVar2.f9748cqumvgiudr;
            if (f14 != -1.0f) {
                fMax = Math.max(fMax, f14);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f13;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.nufgyqmvbu
    protected void zfvoamnweg() {
        E0();
        G0();
        VideoSink videoSink = this.f11560q;
        if (videoSink != null) {
            videoSink.gxszxtbevo();
        } else {
            this.f11552i.draadjrbmk();
        }
        super.zfvoamnweg();
    }

    @Override // androidx.media3.exoplayer.video.gtknphoqwx.zoijcleaow
    public boolean zynmafqrjb(long j13, long j14) {
        return b1(j13, j14);
    }
}
