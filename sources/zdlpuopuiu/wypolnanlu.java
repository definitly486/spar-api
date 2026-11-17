package zdlpuopuiu;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class wypolnanlu extends dsvhmnatus {
    wypolnanlu(Context context) {
        super(context);
    }

    @Override // zdlpuopuiu.dsvhmnatus, zdlpuopuiu.kegysxyocb, zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public void wkgbmnqykc(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f129722iobyxmoadg.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e13) {
            throw CameraAccessExceptionCompat.dxjokdxxww(e13);
        }
    }

    @Override // zdlpuopuiu.dsvhmnatus, zdlpuopuiu.kegysxyocb, zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public CameraCharacteristics zoijcleaow(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f129722iobyxmoadg.getCameraCharacteristics(str);
        } catch (CameraAccessException e13) {
            throw CameraAccessExceptionCompat.dxjokdxxww(e13);
        }
    }
}
