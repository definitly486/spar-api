package androidx.media3.exoplayer.video;

import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.wizcaqwiak;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import v2.jpowsppfya;
import y2.lmojexxdyd;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc implements VideoSink {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private Executor f11595btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private VideoSink.iobyxmoadg f11596dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Surface f11597eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private r3.lqeggnwhkg f11598gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f11599gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f11600iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f11601lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f11602nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final draadjrbmk f11603ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Queue f11604wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.dxjokdxxww f11605zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    final class zoijcleaow implements draadjrbmk.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private androidx.media3.common.iobyxmoadg f11606iobyxmoadg;

        private zoijcleaow() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void dxjokdxxww() {
            wkgbmnqykc.this.f11596dxjokdxxww.iobyxmoadg(wkgbmnqykc.this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lqeggnwhkg() {
            wkgbmnqykc.this.f11596dxjokdxxww.ppxfxbqfkf(wkgbmnqykc.this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void nufgyqmvbu(jpowsppfya jpowsppfyaVar) {
            wkgbmnqykc.this.f11596dxjokdxxww.zoijcleaow(wkgbmnqykc.this, jpowsppfyaVar);
        }

        @Override // androidx.media3.exoplayer.video.draadjrbmk.iobyxmoadg
        public void ppxfxbqfkf() {
            wkgbmnqykc.this.f11595btonecajqb.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.gxszxtbevo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11543zdlpuopuiu.lqeggnwhkg();
                }
            });
            ((VideoSink.zoijcleaow) wkgbmnqykc.this.f11604wkgbmnqykc.remove()).zoijcleaow();
        }

        @Override // androidx.media3.exoplayer.video.draadjrbmk.iobyxmoadg
        public void wkgbmnqykc(long j13, long j14, boolean z13) {
            if (z13 && wkgbmnqykc.this.f11597eablkybsjg != null) {
                wkgbmnqykc.this.f11595btonecajqb.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.eablkybsjg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11526zdlpuopuiu.dxjokdxxww();
                    }
                });
            }
            androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = this.f11606iobyxmoadg;
            if (iobyxmoadgVarCllcsxoeiz == null) {
                iobyxmoadgVarCllcsxoeiz = new androidx.media3.common.iobyxmoadg.zoijcleaow().cllcsxoeiz();
            }
            wkgbmnqykc.this.f11598gtknphoqwx.lqeggnwhkg(j14, wkgbmnqykc.this.f11605zoijcleaow.nanoTime(), iobyxmoadgVarCllcsxoeiz, null);
            ((VideoSink.zoijcleaow) wkgbmnqykc.this.f11604wkgbmnqykc.remove()).iobyxmoadg(j13);
        }

        @Override // androidx.media3.exoplayer.video.draadjrbmk.iobyxmoadg
        public void zoijcleaow(final jpowsppfya jpowsppfyaVar) {
            this.f11606iobyxmoadg = new androidx.media3.common.iobyxmoadg.zoijcleaow().auzgnhcxok(jpowsppfyaVar.f115378iobyxmoadg).okpsazkaxt(jpowsppfyaVar.f115381zoijcleaow).zeieaojujs("video/raw").cllcsxoeiz();
            wkgbmnqykc.this.f11595btonecajqb.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.lqeggnwhkg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11546zdlpuopuiu.nufgyqmvbu(jpowsppfyaVar);
                }
            });
        }
    }

    public wkgbmnqykc(gtknphoqwx gtknphoqwxVar, y2.dxjokdxxww dxjokdxxwwVar) {
        this.f11600iobyxmoadg = gtknphoqwxVar;
        gtknphoqwxVar.ojitshcjhn(dxjokdxxwwVar);
        this.f11605zoijcleaow = dxjokdxxwwVar;
        this.f11603ppxfxbqfkf = new draadjrbmk(new zoijcleaow(), gtknphoqwxVar);
        this.f11604wkgbmnqykc = new ArrayDeque();
        this.f11599gxszxtbevo = new androidx.media3.common.iobyxmoadg.zoijcleaow().cllcsxoeiz();
        this.f11601lqeggnwhkg = -9223372036854775807L;
        this.f11596dxjokdxxww = VideoSink.iobyxmoadg.f11466iobyxmoadg;
        this.f11595btonecajqb = new Executor() { // from class: androidx.media3.exoplayer.video.zoijcleaow
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                wkgbmnqykc.lmojexxdyd(runnable);
            }
        };
        this.f11598gtknphoqwx = new r3.lqeggnwhkg() { // from class: androidx.media3.exoplayer.video.ppxfxbqfkf
            @Override // r3.lqeggnwhkg
            public final void lqeggnwhkg(long j13, long j14, androidx.media3.common.iobyxmoadg iobyxmoadgVar, MediaFormat mediaFormat) {
                wkgbmnqykc.wwaezpbzkn(j13, j14, iobyxmoadgVar, mediaFormat);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lmojexxdyd(Runnable runnable) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void wwaezpbzkn(long j13, long j14, androidx.media3.common.iobyxmoadg iobyxmoadgVar, MediaFormat mediaFormat) {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void agtfadlqog(Surface surface, lmojexxdyd lmojexxdydVar) {
        this.f11597eablkybsjg = surface;
        this.f11600iobyxmoadg.vdvldrhtss(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void btonecajqb(long j13, long j14) throws VideoSink.VideoSinkException {
        try {
            this.f11603ppxfxbqfkf.btonecajqb(j13, j14);
        } catch (ExoPlaybackException e13) {
            throw new VideoSink.VideoSinkException(e13, this.f11599gxszxtbevo);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void cqumvgiudr(VideoSink.iobyxmoadg iobyxmoadgVar, Executor executor) {
        this.f11596dxjokdxxww = iobyxmoadgVar;
        this.f11595btonecajqb = executor;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean draadjrbmk(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void dxjokdxxww(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void eablkybsjg(long j13, long j14) {
        if (j13 != this.f11601lqeggnwhkg) {
            this.f11603ppxfxbqfkf.nufgyqmvbu(j13);
            this.f11601lqeggnwhkg = j13;
        }
        this.f11602nufgyqmvbu = j14;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean gtknphoqwx(boolean z13) {
        return this.f11600iobyxmoadg.wkgbmnqykc(z13);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void gxszxtbevo() {
        this.f11600iobyxmoadg.draadjrbmk();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean iobyxmoadg(long j13, boolean z13, VideoSink.zoijcleaow zoijcleaowVar) {
        this.f11604wkgbmnqykc.add(zoijcleaowVar);
        this.f11603ppxfxbqfkf.lqeggnwhkg(j13 - this.f11602nufgyqmvbu);
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isInitialized() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void iwizpuwonk(boolean z13) {
        this.f11600iobyxmoadg.eablkybsjg(z13);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void jyumaefscl(boolean z13) {
        if (z13) {
            this.f11600iobyxmoadg.wflxmlrfwp();
        }
        this.f11603ppxfxbqfkf.zoijcleaow();
        this.f11604wkgbmnqykc.clear();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void kcexrzcfyt(int i13) {
        this.f11600iobyxmoadg.agtfadlqog(i13);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void lqeggnwhkg(wizcaqwiak.iobyxmoadg iobyxmoadgVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void nufgyqmvbu() {
        this.f11600iobyxmoadg.iobyxmoadg();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public Surface ojitshcjhn() {
        return (Surface) y2.iobyxmoadg.dxjokdxxww(this.f11597eablkybsjg);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void oxmwwwfdhm() {
        this.f11600iobyxmoadg.lqeggnwhkg();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void ppxfxbqfkf() {
        this.f11603ppxfxbqfkf.draadjrbmk();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void release() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void rgvfuqvkyq() {
        this.f11600iobyxmoadg.gtknphoqwx();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void vdvldrhtss(int i13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, List list) {
        y2.iobyxmoadg.lqeggnwhkg(list.isEmpty());
        int i14 = iobyxmoadgVar.f9763jyumaefscl;
        androidx.media3.common.iobyxmoadg iobyxmoadgVar2 = this.f11599gxszxtbevo;
        if (i14 != iobyxmoadgVar2.f9763jyumaefscl || iobyxmoadgVar.f9761iwizpuwonk != iobyxmoadgVar2.f9761iwizpuwonk) {
            this.f11603ppxfxbqfkf.dxjokdxxww(i14, iobyxmoadgVar.f9761iwizpuwonk);
        }
        float f13 = iobyxmoadgVar.f9748cqumvgiudr;
        if (f13 != this.f11599gxszxtbevo.f9748cqumvgiudr) {
            this.f11600iobyxmoadg.rgvfuqvkyq(f13);
        }
        this.f11599gxszxtbevo = iobyxmoadgVar;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void wflxmlrfwp(boolean z13) {
        this.f11600iobyxmoadg.nufgyqmvbu(z13);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean wkgbmnqykc() {
        return this.f11603ppxfxbqfkf.wkgbmnqykc();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void yggfygwlhe() {
        this.f11597eablkybsjg = null;
        this.f11600iobyxmoadg.vdvldrhtss(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void zdlpuopuiu(float f13) {
        this.f11600iobyxmoadg.oxmwwwfdhm(f13);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void zoijcleaow(r3.lqeggnwhkg lqeggnwhkgVar) {
        this.f11598gtknphoqwx = lqeggnwhkgVar;
    }
}
