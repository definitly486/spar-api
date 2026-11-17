package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import istkbnxepw.vipkmwdibw;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import zdlpuopuiu.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailWithAutoFlashQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final List f3634iobyxmoadg = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        return f3634iobyxmoadg.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
