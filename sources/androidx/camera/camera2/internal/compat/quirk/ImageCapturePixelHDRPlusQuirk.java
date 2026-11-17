package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import istkbnxepw.vipkmwdibw;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ImageCapturePixelHDRPlusQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final List f3638iobyxmoadg = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    static boolean ppxfxbqfkf() {
        return f3638iobyxmoadg.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER);
    }
}
