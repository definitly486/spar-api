package kcexrzcfyt;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static boolean iobyxmoadg(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar) {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
            for (int i13 : iArr) {
                if (i13 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
