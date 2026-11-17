package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.camera.extensions.internal.gtknphoqwx;
import androidx.camera.extensions.internal.gxszxtbevo;
import istkbnxepw.vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public class ExtensionDisabledQuirk implements vipkmwdibw {
    private static boolean eablkybsjg() {
        return "google".equalsIgnoreCase(Build.BRAND) && "redfin".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean gxszxtbevo() {
        return "realme".equalsIgnoreCase(Build.BRAND);
    }

    static boolean lqeggnwhkg() {
        return eablkybsjg() || wkgbmnqykc() || gxszxtbevo();
    }

    private static boolean ppxfxbqfkf() {
        return gxszxtbevo.lqeggnwhkg(gtknphoqwx.f3996jyumaefscl) && gxszxtbevo.wkgbmnqykc();
    }

    private static boolean wkgbmnqykc() {
        return "motorola".equalsIgnoreCase(Build.BRAND);
    }

    public boolean nufgyqmvbu() {
        if (eablkybsjg() && !ppxfxbqfkf()) {
            return true;
        }
        if (wkgbmnqykc() && gxszxtbevo.gxszxtbevo(gtknphoqwx.f3997yggfygwlhe)) {
            return true;
        }
        return gxszxtbevo() && gxszxtbevo.gxszxtbevo(gtknphoqwx.f3997yggfygwlhe);
    }
}
