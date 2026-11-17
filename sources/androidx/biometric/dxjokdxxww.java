package androidx.biometric;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
abstract class dxjokdxxww {
    static boolean eablkybsjg(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return zoijcleaow(context, str, rgvfuqvkyq.iobyxmoadg.delay_showing_prompt_models);
    }

    static boolean gxszxtbevo(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return ppxfxbqfkf(context, str, rgvfuqvkyq.iobyxmoadg.hide_fingerprint_instantly_prefixes);
    }

    static boolean iobyxmoadg(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return zoijcleaow(context, str, rgvfuqvkyq.iobyxmoadg.assume_strong_biometrics_models);
    }

    static boolean lqeggnwhkg(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return wkgbmnqykc(context, str, rgvfuqvkyq.iobyxmoadg.crypto_fingerprint_fallback_vendors) || ppxfxbqfkf(context, str2, rgvfuqvkyq.iobyxmoadg.crypto_fingerprint_fallback_prefixes);
    }

    private static boolean ppxfxbqfkf(Context context, String str, int i13) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i13)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean wkgbmnqykc(Context context, String str, int i13) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i13)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zoijcleaow(Context context, String str, int i13) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i13)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
