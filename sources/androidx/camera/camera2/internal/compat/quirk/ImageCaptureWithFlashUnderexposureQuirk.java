package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import zdlpuopuiu.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureWithFlashUnderexposureQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final List f3640iobyxmoadg = Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    static boolean ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        return f3640iobyxmoadg.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
