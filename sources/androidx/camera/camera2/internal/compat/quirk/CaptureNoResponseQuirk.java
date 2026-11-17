package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import istkbnxepw.vipkmwdibw;
import zdlpuopuiu.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public class CaptureNoResponseQuirk implements vipkmwdibw {
    static boolean ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        String str = Build.HARDWARE;
        return ("samsungexynos7420".equalsIgnoreCase(str) || "universal7420".equalsIgnoreCase(str)) && ((Integer) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
