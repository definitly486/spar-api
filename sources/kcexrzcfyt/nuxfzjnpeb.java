package kcexrzcfyt;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl;

/* JADX INFO: loaded from: classes.dex */
final class nuxfzjnpeb implements x.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu.pmvmpeiblj f54892iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f54893ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Rect f54895zoijcleaow = null;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Rect f54894wkgbmnqykc = null;

    nuxfzjnpeb(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar) {
        this.f54892iobyxmoadg = pmvmpeibljVar;
    }

    private Rect eablkybsjg() {
        return (Rect) u1.nufgyqmvbu.gxszxtbevo((Rect) this.f54892iobyxmoadg.iobyxmoadg(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // kcexrzcfyt.x.zoijcleaow
    public float getMaxZoom() {
        Float f13 = (Float) this.f54892iobyxmoadg.iobyxmoadg(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f13 == null) {
            return 1.0f;
        }
        return f13.floatValue() < getMinZoom() ? getMinZoom() : f13.floatValue();
    }

    @Override // kcexrzcfyt.x.zoijcleaow
    public float getMinZoom() {
        return 1.0f;
    }

    @Override // kcexrzcfyt.x.zoijcleaow
    public void iobyxmoadg(TotalCaptureResult totalCaptureResult) {
        if (this.f54893ppxfxbqfkf != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f54894wkgbmnqykc;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f54893ppxfxbqfkf.ppxfxbqfkf(null);
            this.f54893ppxfxbqfkf = null;
            this.f54894wkgbmnqykc = null;
        }
    }

    @Override // kcexrzcfyt.x.zoijcleaow
    public void ppxfxbqfkf() {
        this.f54894wkgbmnqykc = null;
        this.f54895zoijcleaow = null;
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f54893ppxfxbqfkf;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.gxszxtbevo(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f54893ppxfxbqfkf = null;
        }
    }

    @Override // kcexrzcfyt.x.zoijcleaow
    public Rect wkgbmnqykc() {
        Rect rect = this.f54895zoijcleaow;
        return rect != null ? rect : eablkybsjg();
    }

    @Override // kcexrzcfyt.x.zoijcleaow
    public void zoijcleaow(oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg) {
        Rect rect = this.f54895zoijcleaow;
        if (rect != null) {
            c1637iobyxmoadg.lqeggnwhkg(CaptureRequest.SCALER_CROP_REGION, rect, androidx.camera.core.impl.btonecajqb.ppxfxbqfkf.REQUIRED);
        }
    }
}
