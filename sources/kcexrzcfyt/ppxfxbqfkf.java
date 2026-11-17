package kcexrzcfyt;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.CameraControl;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf implements x.zoijcleaow {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f54957gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu.pmvmpeiblj f54958iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f54960wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Range f54961zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f54959ppxfxbqfkf = 1.0f;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f54956eablkybsjg = 1.0f;

    ppxfxbqfkf(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar) {
        this.f54957gxszxtbevo = false;
        this.f54958iobyxmoadg = pmvmpeibljVar;
        this.f54961zoijcleaow = (Range) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f54957gxszxtbevo = pmvmpeibljVar.eablkybsjg();
    }

    @Override // kcexrzcfyt.x.zoijcleaow
    public float getMaxZoom() {
        return ((Float) this.f54961zoijcleaow.getUpper()).floatValue();
    }

    @Override // kcexrzcfyt.x.zoijcleaow
    public float getMinZoom() {
        return ((Float) this.f54961zoijcleaow.getLower()).floatValue();
    }

    @Override // kcexrzcfyt.x.zoijcleaow
    public void iobyxmoadg(TotalCaptureResult totalCaptureResult) {
        if (this.f54960wkgbmnqykc != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f13 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f13 == null) {
                return;
            }
            if (this.f54956eablkybsjg == f13.floatValue()) {
                this.f54960wkgbmnqykc.ppxfxbqfkf(null);
                this.f54960wkgbmnqykc = null;
            }
        }
    }

    @Override // kcexrzcfyt.x.zoijcleaow
    public void ppxfxbqfkf() {
        this.f54959ppxfxbqfkf = 1.0f;
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f54960wkgbmnqykc;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.gxszxtbevo(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f54960wkgbmnqykc = null;
        }
    }

    @Override // kcexrzcfyt.x.zoijcleaow
    public Rect wkgbmnqykc() {
        return (Rect) u1.nufgyqmvbu.gxszxtbevo((Rect) this.f54958iobyxmoadg.iobyxmoadg(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // kcexrzcfyt.x.zoijcleaow
    public void zoijcleaow(oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f54959ppxfxbqfkf);
        androidx.camera.core.impl.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar = androidx.camera.core.impl.btonecajqb.ppxfxbqfkf.REQUIRED;
        c1637iobyxmoadg.lqeggnwhkg(key, fValueOf, ppxfxbqfkfVar);
        if (this.f54957gxszxtbevo) {
            yggfygwlhe.zoijcleaow.iobyxmoadg(c1637iobyxmoadg, ppxfxbqfkfVar);
        }
    }
}
