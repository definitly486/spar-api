package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
abstract class gtknphoqwx {

    private static class iobyxmoadg {
        static KeyguardManager iobyxmoadg(Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        static boolean zoijcleaow(KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    static KeyguardManager iobyxmoadg(Context context) {
        return iobyxmoadg.iobyxmoadg(context);
    }

    static boolean zoijcleaow(Context context) {
        KeyguardManager keyguardManagerIobyxmoadg = iobyxmoadg(context);
        if (keyguardManagerIobyxmoadg == null) {
            return false;
        }
        return iobyxmoadg.zoijcleaow(keyguardManagerIobyxmoadg);
    }
}
