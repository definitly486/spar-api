package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import istkbnxepw.vipkmwdibw;
import zdlpuopuiu.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public class LegacyCameraSurfaceCleanupQuirk implements vipkmwdibw {
    static boolean ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        Integer num = (Integer) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    static boolean wkgbmnqykc(pmvmpeiblj pmvmpeibljVar) {
        return Build.VERSION.SDK_INT < 29 && ppxfxbqfkf(pmvmpeibljVar);
    }
}
