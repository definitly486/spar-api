package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import istkbnxepw.vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceViewStretchedQuirk implements vipkmwdibw {
    private static boolean eablkybsjg() {
        if ("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.DEVICE;
            if ("F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    static boolean gxszxtbevo() {
        return Build.VERSION.SDK_INT < 33 && (eablkybsjg() || wkgbmnqykc() || ppxfxbqfkf());
    }

    private static boolean ppxfxbqfkf() {
        return "LENOVO".equalsIgnoreCase(Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean wkgbmnqykc() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE);
    }
}
