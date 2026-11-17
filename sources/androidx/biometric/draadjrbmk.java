package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
abstract class draadjrbmk {

    private static class iobyxmoadg {
        static boolean iobyxmoadg(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    static boolean iobyxmoadg(Context context) {
        return (context == null || context.getPackageManager() == null || !iobyxmoadg.iobyxmoadg(context.getPackageManager())) ? false : true;
    }
}
