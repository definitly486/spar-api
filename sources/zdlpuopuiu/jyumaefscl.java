package zdlpuopuiu;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class jyumaefscl extends iwizpuwonk {
    jyumaefscl(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // zdlpuopuiu.iwizpuwonk, zdlpuopuiu.lqeggnwhkg.iobyxmoadg
    public int ppxfxbqfkf(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f129716iobyxmoadg.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override // zdlpuopuiu.iwizpuwonk, zdlpuopuiu.lqeggnwhkg.iobyxmoadg
    public int zoijcleaow(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f129716iobyxmoadg.captureBurstRequests(list, executor, captureCallback);
    }
}
