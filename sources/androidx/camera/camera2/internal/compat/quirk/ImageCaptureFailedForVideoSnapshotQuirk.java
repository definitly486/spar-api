package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import istkbnxepw.vipkmwdibw;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Set f3635iobyxmoadg = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "tecno mobile bf6"));

    static boolean eablkybsjg() {
        return wkgbmnqykc() || ppxfxbqfkf();
    }

    private static boolean ppxfxbqfkf() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "FIG-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean wkgbmnqykc() {
        Set set = f3635iobyxmoadg;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!set.contains(str.toLowerCase(locale)) && (Build.VERSION.SDK_INT < 31 || !"Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER))) {
            String str2 = Build.HARDWARE;
            if (!str2.toLowerCase(locale).startsWith("ums") && (!"itel".equalsIgnoreCase(Build.BRAND) || !str2.toLowerCase(locale).startsWith("sp"))) {
                return false;
            }
        }
        return true;
    }
}
