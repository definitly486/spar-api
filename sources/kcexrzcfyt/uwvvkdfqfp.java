package kcexrzcfyt;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
final class uwvvkdfqfp extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final istkbnxepw.nufgyqmvbu f55034iobyxmoadg;

    uwvvkdfqfp(istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f55034iobyxmoadg = nufgyqmvbuVar;
    }

    private int iobyxmoadg(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof istkbnxepw.opjhrmiecq) && (num = (Integer) ((istkbnxepw.opjhrmiecq) captureRequest.getTag()).wkgbmnqykc("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        istkbnxepw.opjhrmiecq opjhrmiecqVarZoijcleaow;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            u1.nufgyqmvbu.zoijcleaow(tag instanceof istkbnxepw.opjhrmiecq, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            opjhrmiecqVarZoijcleaow = (istkbnxepw.opjhrmiecq) tag;
        } else {
            opjhrmiecqVarZoijcleaow = istkbnxepw.opjhrmiecq.zoijcleaow();
        }
        this.f55034iobyxmoadg.zoijcleaow(iobyxmoadg(captureRequest), new nufgyqmvbu(opjhrmiecqVarZoijcleaow, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f55034iobyxmoadg.ppxfxbqfkf(iobyxmoadg(captureRequest), new istkbnxepw.btonecajqb(istkbnxepw.btonecajqb.iobyxmoadg.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j13, long j14) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j13, j14);
        this.f55034iobyxmoadg.eablkybsjg(iobyxmoadg(captureRequest));
    }
}
