package kcexrzcfyt;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: loaded from: classes.dex */
abstract class e0 {
    public static boolean iobyxmoadg(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, int i13) {
        int[] iArr = (int[]) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i14 : iArr) {
                if (i14 == i13) {
                    return true;
                }
            }
        }
        return false;
    }
}
