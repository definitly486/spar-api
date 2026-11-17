package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.btonecajqb;
import androidx.camera.core.impl.dxjokdxxww;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import istkbnxepw.vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureRotationOptionQuirk implements vipkmwdibw {
    private static boolean eablkybsjg() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean gxszxtbevo() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    static boolean nufgyqmvbu() {
        return gxszxtbevo() || eablkybsjg() || wkgbmnqykc();
    }

    private static boolean ppxfxbqfkf() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith(CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE)) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Cuttlefish") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk") && !Build.HARDWARE.contains("ranchu"))) {
                return false;
            }
        }
        return true;
    }

    private static boolean wkgbmnqykc() {
        ppxfxbqfkf();
        return false;
    }

    public boolean lqeggnwhkg(btonecajqb.iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar != dxjokdxxww.f3755dxjokdxxww;
    }
}
