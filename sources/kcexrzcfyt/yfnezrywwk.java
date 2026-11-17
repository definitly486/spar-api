package kcexrzcfyt;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: loaded from: classes.dex */
final class yfnezrywwk extends istkbnxepw.nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f55070iobyxmoadg;

    private yfnezrywwk(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f55070iobyxmoadg = captureCallback;
    }

    static yfnezrywwk gxszxtbevo(CameraCaptureSession.CaptureCallback captureCallback) {
        return new yfnezrywwk(captureCallback);
    }

    CameraCaptureSession.CaptureCallback lqeggnwhkg() {
        return this.f55070iobyxmoadg;
    }
}
