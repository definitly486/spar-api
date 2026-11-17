package zdlpuopuiu;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f129726iobyxmoadg;

    interface iobyxmoadg {
        CameraCaptureSession iobyxmoadg();

        int ppxfxbqfkf(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int zoijcleaow(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    static final class ppxfxbqfkf extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final CameraCaptureSession.StateCallback f129727iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Executor f129728zoijcleaow;

        ppxfxbqfkf(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f129728zoijcleaow = executor;
            this.f129727iobyxmoadg = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void agtfadlqog(CameraCaptureSession cameraCaptureSession, Surface surface) {
            zdlpuopuiu.zoijcleaow.iobyxmoadg(this.f129727iobyxmoadg, cameraCaptureSession, surface);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void btonecajqb(CameraCaptureSession cameraCaptureSession) {
            this.f129727iobyxmoadg.onClosed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void draadjrbmk(CameraCaptureSession cameraCaptureSession) {
            this.f129727iobyxmoadg.onConfigured(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void dxjokdxxww(CameraCaptureSession cameraCaptureSession) {
            wkgbmnqykc.iobyxmoadg(this.f129727iobyxmoadg, cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void gtknphoqwx(CameraCaptureSession cameraCaptureSession) {
            this.f129727iobyxmoadg.onConfigureFailed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void nufgyqmvbu(CameraCaptureSession cameraCaptureSession) {
            this.f129727iobyxmoadg.onActive(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wflxmlrfwp(CameraCaptureSession cameraCaptureSession) {
            this.f129727iobyxmoadg.onReady(cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f129728zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.ojitshcjhn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129738zdlpuopuiu.nufgyqmvbu(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f129728zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.oxmwwwfdhm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129740zdlpuopuiu.dxjokdxxww(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f129728zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.rgvfuqvkyq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129749zdlpuopuiu.btonecajqb(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f129728zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.yggfygwlhe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129766zdlpuopuiu.gtknphoqwx(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f129728zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.kcexrzcfyt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129721zdlpuopuiu.draadjrbmk(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f129728zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.zdlpuopuiu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129768zdlpuopuiu.wflxmlrfwp(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f129728zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.vdvldrhtss
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129757zdlpuopuiu.agtfadlqog(cameraCaptureSession, surface);
                }
            });
        }
    }

    static final class zoijcleaow extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final CameraCaptureSession.CaptureCallback f129729iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Executor f129730zoijcleaow;

        zoijcleaow(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f129730zoijcleaow = executor;
            this.f129729iobyxmoadg = captureCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void agtfadlqog(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j13, long j14) {
            this.f129729iobyxmoadg.onCaptureStarted(cameraCaptureSession, captureRequest, j13, j14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void btonecajqb(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f129729iobyxmoadg.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void draadjrbmk(CameraCaptureSession cameraCaptureSession, int i13) {
            this.f129729iobyxmoadg.onCaptureSequenceAborted(cameraCaptureSession, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void dxjokdxxww(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f129729iobyxmoadg.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void gtknphoqwx(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f129729iobyxmoadg.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void nufgyqmvbu(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j13) {
            zdlpuopuiu.ppxfxbqfkf.iobyxmoadg(this.f129729iobyxmoadg, cameraCaptureSession, captureRequest, surface, j13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wflxmlrfwp(CameraCaptureSession cameraCaptureSession, int i13, long j13) {
            this.f129729iobyxmoadg.onCaptureSequenceCompleted(cameraCaptureSession, i13, j13);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j13) {
            this.f129730zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.wflxmlrfwp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129762zdlpuopuiu.nufgyqmvbu(cameraCaptureSession, captureRequest, surface, j13);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f129730zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.dxjokdxxww
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129702zdlpuopuiu.dxjokdxxww(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f129730zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.draadjrbmk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129698zdlpuopuiu.btonecajqb(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f129730zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.btonecajqb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129685zdlpuopuiu.gtknphoqwx(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i13) {
            this.f129730zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.agtfadlqog
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129681zdlpuopuiu.draadjrbmk(cameraCaptureSession, i13);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i13, final long j13) {
            this.f129730zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.gtknphoqwx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129707zdlpuopuiu.wflxmlrfwp(cameraCaptureSession, i13, j13);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j13, final long j14) {
            this.f129730zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.nufgyqmvbu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129736zdlpuopuiu.agtfadlqog(cameraCaptureSession, captureRequest, j13, j14);
                }
            });
        }
    }

    private lqeggnwhkg(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f129726iobyxmoadg = new jyumaefscl(cameraCaptureSession);
        } else {
            this.f129726iobyxmoadg = iwizpuwonk.wkgbmnqykc(cameraCaptureSession, handler);
        }
    }

    public static lqeggnwhkg wkgbmnqykc(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new lqeggnwhkg(cameraCaptureSession, handler);
    }

    public int iobyxmoadg(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f129726iobyxmoadg.zoijcleaow(list, executor, captureCallback);
    }

    public CameraCaptureSession ppxfxbqfkf() {
        return this.f129726iobyxmoadg.iobyxmoadg();
    }

    public int zoijcleaow(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f129726iobyxmoadg.ppxfxbqfkf(captureRequest, executor, captureCallback);
    }
}
