package zdlpuopuiu;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {
    public static void iobyxmoadg(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j13) {
        captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j13);
    }
}
