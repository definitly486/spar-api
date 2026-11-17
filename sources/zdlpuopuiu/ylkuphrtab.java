package zdlpuopuiu;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* JADX INFO: loaded from: classes.dex */
class ylkuphrtab extends wwaezpbzkn {
    ylkuphrtab(CameraDevice cameraDevice) {
        super((CameraDevice) u1.nufgyqmvbu.gxszxtbevo(cameraDevice), null);
    }

    @Override // zdlpuopuiu.wwaezpbzkn, zdlpuopuiu.zynmafqrjb.iobyxmoadg
    public void iobyxmoadg(yggfygwlhe.vdvldrhtss vdvldrhtssVar) throws CameraAccessExceptionCompat {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) vdvldrhtssVar.btonecajqb();
        u1.nufgyqmvbu.gxszxtbevo(sessionConfiguration);
        try {
            this.f129741iobyxmoadg.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e13) {
            throw CameraAccessExceptionCompat.dxjokdxxww(e13);
        }
    }
}
