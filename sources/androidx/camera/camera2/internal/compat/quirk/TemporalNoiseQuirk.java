package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import zdlpuopuiu.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    private static boolean ppxfxbqfkf() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    static boolean wkgbmnqykc(pmvmpeiblj pmvmpeibljVar) {
        return ppxfxbqfkf() && ((Integer) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
