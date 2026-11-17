package zdlpuopuiu;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f129769iobyxmoadg;

    interface iobyxmoadg {
        void iobyxmoadg(yggfygwlhe.vdvldrhtss vdvldrhtssVar);
    }

    static final class zoijcleaow extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final CameraDevice.StateCallback f129770iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Executor f129771zoijcleaow;

        zoijcleaow(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f129771zoijcleaow = executor;
            this.f129770iobyxmoadg = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void eablkybsjg(CameraDevice cameraDevice) {
            this.f129770iobyxmoadg.onClosed(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void gxszxtbevo(CameraDevice cameraDevice) {
            this.f129770iobyxmoadg.onDisconnected(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lqeggnwhkg(CameraDevice cameraDevice, int i13) {
            this.f129770iobyxmoadg.onError(cameraDevice, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void nufgyqmvbu(CameraDevice cameraDevice) {
            this.f129770iobyxmoadg.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f129771zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.istkbnxepw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129715zdlpuopuiu.eablkybsjg(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f129771zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.yadqdtsiqt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129764zdlpuopuiu.gxszxtbevo(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i13) {
            this.f129771zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.cdpycssgdh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129688zdlpuopuiu.lqeggnwhkg(cameraDevice, i13);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f129771zoijcleaow.execute(new Runnable() { // from class: zdlpuopuiu.iozdgvuglv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129713zdlpuopuiu.nufgyqmvbu(cameraDevice);
                }
            });
        }
    }

    private zynmafqrjb(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f129769iobyxmoadg = new ylkuphrtab(cameraDevice);
        } else {
            this.f129769iobyxmoadg = wwaezpbzkn.eablkybsjg(cameraDevice, handler);
        }
    }

    public static zynmafqrjb zoijcleaow(CameraDevice cameraDevice, Handler handler) {
        return new zynmafqrjb(cameraDevice, handler);
    }

    public void iobyxmoadg(yggfygwlhe.vdvldrhtss vdvldrhtssVar) {
        this.f129769iobyxmoadg.iobyxmoadg(vdvldrhtssVar);
    }
}
