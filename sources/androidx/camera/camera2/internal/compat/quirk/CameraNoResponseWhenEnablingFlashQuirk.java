package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import zdlpuopuiu.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public class CameraNoResponseWhenEnablingFlashQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final List f3624iobyxmoadg = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    static boolean ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        return f3624iobyxmoadg.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
