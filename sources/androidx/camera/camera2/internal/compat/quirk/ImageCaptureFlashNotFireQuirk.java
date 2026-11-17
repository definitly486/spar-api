package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import zdlpuopuiu.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final List f3636iobyxmoadg = Arrays.asList("itel w6004");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final List f3637zoijcleaow = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        List list = f3637zoijcleaow;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f3636iobyxmoadg.contains(str.toLowerCase(locale));
    }
}
