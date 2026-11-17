package kcexrzcfyt;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.CameraControl;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class uawqvzlxes {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f55020eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private zdlpuopuiu.ppxfxbqfkf f55021gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu f55022iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Executor f55023ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f55024wkgbmnqykc = false;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final auzgnhcxok f55025zoijcleaow;

    uawqvzlxes(zdlpuopuiu zdlpuopuiuVar, zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, Executor executor) {
        this.f55022iobyxmoadg = zdlpuopuiuVar;
        this.f55025zoijcleaow = new auzgnhcxok(pmvmpeibljVar, 0);
        this.f55023ppxfxbqfkf = executor;
    }

    private void iobyxmoadg() {
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f55020eablkybsjg;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.gxszxtbevo(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.f55020eablkybsjg = null;
        }
        zdlpuopuiu.ppxfxbqfkf ppxfxbqfkfVar = this.f55021gxszxtbevo;
        if (ppxfxbqfkfVar != null) {
            this.f55022iobyxmoadg.ntlheqmsrt(ppxfxbqfkfVar);
            this.f55021gxszxtbevo = null;
        }
    }

    void ppxfxbqfkf(oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg) {
        c1637iobyxmoadg.lqeggnwhkg(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f55025zoijcleaow.iobyxmoadg()), androidx.camera.core.impl.btonecajqb.ppxfxbqfkf.REQUIRED);
    }

    void zoijcleaow(boolean z13) {
        if (z13 == this.f55024wkgbmnqykc) {
            return;
        }
        this.f55024wkgbmnqykc = z13;
        if (z13) {
            return;
        }
        this.f55025zoijcleaow.zoijcleaow(0);
        iobyxmoadg();
    }
}
