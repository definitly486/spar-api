package zdlpuopuiu;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class iwizpuwonk implements lqeggnwhkg.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final CameraCaptureSession f129716iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final Object f129717zoijcleaow;

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Handler f129718iobyxmoadg;

        iobyxmoadg(Handler handler) {
            this.f129718iobyxmoadg = handler;
        }
    }

    iwizpuwonk(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f129716iobyxmoadg = (CameraCaptureSession) u1.nufgyqmvbu.gxszxtbevo(cameraCaptureSession);
        this.f129717zoijcleaow = obj;
    }

    static lqeggnwhkg.iobyxmoadg wkgbmnqykc(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new iwizpuwonk(cameraCaptureSession, new iobyxmoadg(handler));
    }

    @Override // zdlpuopuiu.lqeggnwhkg.iobyxmoadg
    public CameraCaptureSession iobyxmoadg() {
        return this.f129716iobyxmoadg;
    }

    @Override // zdlpuopuiu.lqeggnwhkg.iobyxmoadg
    public int ppxfxbqfkf(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f129716iobyxmoadg.setRepeatingRequest(captureRequest, new lqeggnwhkg.zoijcleaow(executor, captureCallback), ((iobyxmoadg) this.f129717zoijcleaow).f129718iobyxmoadg);
    }

    @Override // zdlpuopuiu.lqeggnwhkg.iobyxmoadg
    public int zoijcleaow(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f129716iobyxmoadg.captureBurst(list, new lqeggnwhkg.zoijcleaow(executor, captureCallback), ((iobyxmoadg) this.f129717zoijcleaow).f129718iobyxmoadg);
    }
}
