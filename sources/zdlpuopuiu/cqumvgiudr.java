package zdlpuopuiu;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Collections;
import java.util.Set;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
class cqumvgiudr extends esjtqupxsv {
    cqumvgiudr(CameraCharacteristics cameraCharacteristics) {
        super(cameraCharacteristics);
    }

    @Override // zdlpuopuiu.esjtqupxsv, zdlpuopuiu.pmvmpeiblj.iobyxmoadg
    public Set ppxfxbqfkf() {
        try {
            return this.f129703iobyxmoadg.getPhysicalCameraIds();
        } catch (Exception e13) {
            sopmlzcsov.wkgbmnqykc("CameraCharacteristicsImpl", "CameraCharacteristics.getPhysicalCameraIds throws an exception.", e13);
            return Collections.emptySet();
        }
    }
}
