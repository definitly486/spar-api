package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import istkbnxepw.vipkmwdibw;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final List f3647iobyxmoadg = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    static boolean ppxfxbqfkf() {
        return "Google".equals(Build.MANUFACTURER) && f3647iobyxmoadg.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
