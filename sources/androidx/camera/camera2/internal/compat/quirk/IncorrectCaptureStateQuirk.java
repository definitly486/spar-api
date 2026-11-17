package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import istkbnxepw.vipkmwdibw;
import zdlpuopuiu.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public class IncorrectCaptureStateQuirk implements vipkmwdibw {
    static boolean ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        Integer num = (Integer) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
