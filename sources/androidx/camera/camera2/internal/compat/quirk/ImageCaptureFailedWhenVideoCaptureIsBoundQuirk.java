package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import istkbnxepw.vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, vipkmwdibw {
    static boolean btonecajqb() {
        return ppxfxbqfkf() || wkgbmnqykc() || dxjokdxxww() || lqeggnwhkg() || gxszxtbevo() || eablkybsjg() || nufgyqmvbu();
    }

    public static boolean dxjokdxxww() {
        return "vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean eablkybsjg() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e13".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean gxszxtbevo() {
        return "pixel 4 xl".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT == 29;
    }

    public static boolean lqeggnwhkg() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean nufgyqmvbu() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            String str = Build.DEVICE;
            if ("gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean ppxfxbqfkf() {
        return "blu".equalsIgnoreCase(Build.BRAND) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean wkgbmnqykc() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public boolean zoijcleaow() {
        return ppxfxbqfkf() || wkgbmnqykc() || dxjokdxxww() || lqeggnwhkg();
    }
}
