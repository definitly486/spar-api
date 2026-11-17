package kcexrzcfyt;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface e {

    public interface iobyxmoadg {
        com.google.common.util.concurrent.wkgbmnqykc dxjokdxxww(List list, long j13);

        yggfygwlhe.vdvldrhtss gtknphoqwx(int i13, List list, ppxfxbqfkf ppxfxbqfkfVar);

        Executor iobyxmoadg();

        com.google.common.util.concurrent.wkgbmnqykc ppxfxbqfkf(CameraDevice cameraDevice, yggfygwlhe.vdvldrhtss vdvldrhtssVar, List list);

        boolean stop();
    }

    public static abstract class ppxfxbqfkf {
        void agtfadlqog(e eVar) {
        }

        abstract void kcexrzcfyt(e eVar);

        void ojitshcjhn(e eVar) {
        }

        abstract void oxmwwwfdhm(e eVar);

        public void rgvfuqvkyq(e eVar) {
        }

        public abstract void vdvldrhtss(e eVar);

        void yggfygwlhe(e eVar, Surface surface) {
        }

        abstract void zdlpuopuiu(e eVar);
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final istkbnxepw.jztzpxfvev f54669eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final istkbnxepw.jztzpxfvev f54670gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Executor f54671iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Handler f54672ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final zeieaojujs f54673wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ScheduledExecutorService f54674zoijcleaow;

        zoijcleaow(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, zeieaojujs zeieaojujsVar, istkbnxepw.jztzpxfvev jztzpxfvevVar, istkbnxepw.jztzpxfvev jztzpxfvevVar2) {
            this.f54671iobyxmoadg = executor;
            this.f54674zoijcleaow = scheduledExecutorService;
            this.f54672ppxfxbqfkf = handler;
            this.f54673wkgbmnqykc = zeieaojujsVar;
            this.f54669eablkybsjg = jztzpxfvevVar;
            this.f54670gxszxtbevo = jztzpxfvevVar2;
        }

        iobyxmoadg iobyxmoadg() {
            return new o(this.f54669eablkybsjg, this.f54670gxszxtbevo, this.f54673wkgbmnqykc, this.f54671iobyxmoadg, this.f54674zoijcleaow, this.f54672ppxfxbqfkf);
        }
    }

    int btonecajqb(List list, CameraCaptureSession.CaptureCallback captureCallback);

    void close();

    zdlpuopuiu.lqeggnwhkg draadjrbmk();

    void eablkybsjg();

    void gxszxtbevo(int i13);

    CameraDevice lqeggnwhkg();

    int nufgyqmvbu(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    void stopRepeating();

    com.google.common.util.concurrent.wkgbmnqykc wflxmlrfwp();

    ppxfxbqfkf wkgbmnqykc();

    void zoijcleaow();
}
