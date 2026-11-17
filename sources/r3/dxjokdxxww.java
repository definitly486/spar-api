package r3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private long f81498agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f81499btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f81500draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private float f81501dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Surface f81502eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f81503gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private float f81504gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final r3.iobyxmoadg f81505iobyxmoadg = new r3.iobyxmoadg();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private float f81506lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private float f81507nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private long f81508ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f81509ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private long f81510rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private long f81511vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f81512wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f81513wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f81514zoijcleaow;

    private static final class iobyxmoadg {
        public static void iobyxmoadg(Surface surface, float f13) {
            try {
                surface.setFrameRate(f13, f13 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e13) {
                y2.kcexrzcfyt.wkgbmnqykc("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e13);
            }
        }
    }

    private static final class ppxfxbqfkf implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final ppxfxbqfkf f81515esjtqupxsv = new ppxfxbqfkf();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private int f81516cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private Choreographer f81517iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final HandlerThread f81518jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Handler f81519yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public volatile long f81520zdlpuopuiu = -9223372036854775807L;

        private ppxfxbqfkf() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f81518jyumaefscl = handlerThread;
            handlerThread.start();
            Handler handlerEsjtqupxsv = stevsuqkhv.esjtqupxsv(handlerThread.getLooper(), this);
            this.f81519yggfygwlhe = handlerEsjtqupxsv;
            handlerEsjtqupxsv.sendEmptyMessage(1);
        }

        private void gxszxtbevo() {
            Choreographer choreographer = this.f81517iwizpuwonk;
            if (choreographer != null) {
                int i13 = this.f81516cqumvgiudr - 1;
                this.f81516cqumvgiudr = i13;
                if (i13 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f81520zdlpuopuiu = -9223372036854775807L;
                }
            }
        }

        private void ppxfxbqfkf() {
            try {
                this.f81517iwizpuwonk = Choreographer.getInstance();
            } catch (RuntimeException e13) {
                y2.kcexrzcfyt.dxjokdxxww("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e13);
            }
        }

        public static ppxfxbqfkf wkgbmnqykc() {
            return f81515esjtqupxsv;
        }

        private void zoijcleaow() {
            Choreographer choreographer = this.f81517iwizpuwonk;
            if (choreographer != null) {
                int i13 = this.f81516cqumvgiudr + 1;
                this.f81516cqumvgiudr = i13;
                if (i13 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j13) {
            this.f81520zdlpuopuiu = j13;
            ((Choreographer) y2.iobyxmoadg.eablkybsjg(this.f81517iwizpuwonk)).postFrameCallbackDelayed(this, 500L);
        }

        public void eablkybsjg() {
            this.f81519yggfygwlhe.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i13 = message.what;
            if (i13 == 1) {
                ppxfxbqfkf();
                return true;
            }
            if (i13 == 2) {
                zoijcleaow();
                return true;
            }
            if (i13 != 3) {
                return false;
            }
            gxszxtbevo();
            return true;
        }

        public void iobyxmoadg() {
            this.f81519yggfygwlhe.sendEmptyMessage(2);
        }
    }

    private final class zoijcleaow implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final DisplayManager f81521iobyxmoadg;

        public zoijcleaow(DisplayManager displayManager) {
            this.f81521iobyxmoadg = displayManager;
        }

        private Display iobyxmoadg() {
            return this.f81521iobyxmoadg.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i13) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i13) {
            if (i13 == 0) {
                dxjokdxxww.this.rgvfuqvkyq(iobyxmoadg());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i13) {
        }

        public void ppxfxbqfkf() {
            this.f81521iobyxmoadg.unregisterDisplayListener(this);
        }

        public void zoijcleaow() {
            this.f81521iobyxmoadg.registerDisplayListener(this, stevsuqkhv.lereixgezr());
            dxjokdxxww.this.rgvfuqvkyq(iobyxmoadg());
        }
    }

    public dxjokdxxww(Context context) {
        zoijcleaow zoijcleaowVarGxszxtbevo = gxszxtbevo(context);
        this.f81514zoijcleaow = zoijcleaowVarGxszxtbevo;
        this.f81509ppxfxbqfkf = zoijcleaowVarGxszxtbevo != null ? ppxfxbqfkf.wkgbmnqykc() : null;
        this.f81503gtknphoqwx = -9223372036854775807L;
        this.f81500draadjrbmk = -9223372036854775807L;
        this.f81504gxszxtbevo = -1.0f;
        this.f81501dxjokdxxww = 1.0f;
        this.f81499btonecajqb = 0;
    }

    private void agtfadlqog() {
        this.f81512wflxmlrfwp = 0L;
        this.f81510rgvfuqvkyq = -1L;
        this.f81498agtfadlqog = -1L;
    }

    private static long eablkybsjg(long j13, long j14, long j15) {
        long j16;
        long j17 = j14 + (((j13 - j14) / j15) * j15);
        if (j13 <= j17) {
            j16 = j17 - j15;
        } else {
            j17 = j15 + j17;
            j16 = j17;
        }
        return j17 - j13 < j13 - j16 ? j17 : j16;
    }

    private zoijcleaow gxszxtbevo(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new zoijcleaow(displayManager);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    private void oxmwwwfdhm(boolean z13) {
        Surface surface;
        float f13;
        if (stevsuqkhv.f123602iobyxmoadg < 30 || (surface = this.f81502eablkybsjg) == null || this.f81499btonecajqb == Integer.MIN_VALUE) {
            return;
        }
        if (this.f81513wkgbmnqykc) {
            float f14 = this.f81506lqeggnwhkg;
            if (f14 != -1.0f) {
                f13 = f14 * this.f81501dxjokdxxww;
            } else {
                f13 = 0.0f;
            }
        } else {
            f13 = 0.0f;
        }
        if (z13 || this.f81507nufgyqmvbu != f13) {
            this.f81507nufgyqmvbu = f13;
            iobyxmoadg.iobyxmoadg(surface, f13);
        }
    }

    private static boolean ppxfxbqfkf(long j13, long j14) {
        return Math.abs(j13 - j14) <= 20000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rgvfuqvkyq(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f81503gtknphoqwx = refreshRate;
            this.f81500draadjrbmk = (refreshRate * 80) / 100;
        } else {
            y2.kcexrzcfyt.nufgyqmvbu("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f81503gtknphoqwx = -9223372036854775807L;
            this.f81500draadjrbmk = -9223372036854775807L;
        }
    }

    private void vdvldrhtss() {
        if (stevsuqkhv.f123602iobyxmoadg < 30 || this.f81502eablkybsjg == null) {
            return;
        }
        float fZoijcleaow = this.f81505iobyxmoadg.eablkybsjg() ? this.f81505iobyxmoadg.zoijcleaow() : this.f81504gxszxtbevo;
        float f13 = this.f81506lqeggnwhkg;
        if (fZoijcleaow == f13) {
            return;
        }
        if (fZoijcleaow != -1.0f && f13 != -1.0f) {
            if (Math.abs(fZoijcleaow - this.f81506lqeggnwhkg) < ((!this.f81505iobyxmoadg.eablkybsjg() || this.f81505iobyxmoadg.wkgbmnqykc() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fZoijcleaow == -1.0f && this.f81505iobyxmoadg.ppxfxbqfkf() < 30) {
            return;
        }
        this.f81506lqeggnwhkg = fZoijcleaow;
        oxmwwwfdhm(false);
    }

    private void wkgbmnqykc() {
        Surface surface;
        if (stevsuqkhv.f123602iobyxmoadg < 30 || (surface = this.f81502eablkybsjg) == null || this.f81499btonecajqb == Integer.MIN_VALUE || this.f81507nufgyqmvbu == 0.0f) {
            return;
        }
        this.f81507nufgyqmvbu = 0.0f;
        iobyxmoadg.iobyxmoadg(surface, 0.0f);
    }

    public void btonecajqb() {
        agtfadlqog();
    }

    public void draadjrbmk() {
        this.f81513wkgbmnqykc = false;
        zoijcleaow zoijcleaowVar = this.f81514zoijcleaow;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.ppxfxbqfkf();
            ((ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(this.f81509ppxfxbqfkf)).eablkybsjg();
        }
        wkgbmnqykc();
    }

    public void dxjokdxxww(float f13) {
        this.f81501dxjokdxxww = f13;
        agtfadlqog();
        oxmwwwfdhm(false);
    }

    public void gtknphoqwx() {
        this.f81513wkgbmnqykc = true;
        agtfadlqog();
        if (this.f81514zoijcleaow != null) {
            ((ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(this.f81509ppxfxbqfkf)).iobyxmoadg();
            this.f81514zoijcleaow.zoijcleaow();
        }
        oxmwwwfdhm(false);
    }

    public void lqeggnwhkg(float f13) {
        this.f81504gxszxtbevo = f13;
        this.f81505iobyxmoadg.lqeggnwhkg();
        vdvldrhtss();
    }

    public void nufgyqmvbu(long j13) {
        long j14 = this.f81498agtfadlqog;
        if (j14 != -1) {
            this.f81510rgvfuqvkyq = j14;
            this.f81511vdvldrhtss = this.f81508ojitshcjhn;
        }
        this.f81512wflxmlrfwp++;
        this.f81505iobyxmoadg.gxszxtbevo(j13 * 1000);
        vdvldrhtss();
    }

    public void ojitshcjhn(int i13) {
        if (this.f81499btonecajqb == i13) {
            return;
        }
        this.f81499btonecajqb = i13;
        oxmwwwfdhm(true);
    }

    public void wflxmlrfwp(Surface surface) {
        if (this.f81502eablkybsjg == surface) {
            return;
        }
        wkgbmnqykc();
        this.f81502eablkybsjg = surface;
        oxmwwwfdhm(true);
    }

    public long zoijcleaow(long j13) {
        long j14;
        if (this.f81510rgvfuqvkyq == -1 || !this.f81505iobyxmoadg.eablkybsjg()) {
            j14 = j13;
        } else {
            long jIobyxmoadg = this.f81511vdvldrhtss + ((long) ((this.f81505iobyxmoadg.iobyxmoadg() * (this.f81512wflxmlrfwp - this.f81510rgvfuqvkyq)) / this.f81501dxjokdxxww));
            if (ppxfxbqfkf(j13, jIobyxmoadg)) {
                j14 = jIobyxmoadg;
            } else {
                agtfadlqog();
                j14 = j13;
            }
        }
        this.f81498agtfadlqog = this.f81512wflxmlrfwp;
        this.f81508ojitshcjhn = j14;
        ppxfxbqfkf ppxfxbqfkfVar = this.f81509ppxfxbqfkf;
        if (ppxfxbqfkfVar == null || this.f81503gtknphoqwx == -9223372036854775807L) {
            return j14;
        }
        long j15 = ppxfxbqfkfVar.f81520zdlpuopuiu;
        return j15 == -9223372036854775807L ? j14 : eablkybsjg(j14, j15, this.f81503gtknphoqwx) - this.f81500draadjrbmk;
    }
}
