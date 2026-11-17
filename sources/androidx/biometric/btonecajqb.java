package androidx.biometric;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
abstract class btonecajqb {
    static String iobyxmoadg(Context context, int i13) {
        if (context == null) {
            return "";
        }
        if (i13 == 1) {
            return context.getString(rgvfuqvkyq.gxszxtbevo.fingerprint_error_hw_not_available);
        }
        if (i13 != 7) {
            switch (i13) {
                case 9:
                    break;
                case 10:
                    return context.getString(rgvfuqvkyq.gxszxtbevo.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(rgvfuqvkyq.gxszxtbevo.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(rgvfuqvkyq.gxszxtbevo.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i13);
                    return context.getString(rgvfuqvkyq.gxszxtbevo.default_error_msg);
            }
        }
        return context.getString(rgvfuqvkyq.gxszxtbevo.fingerprint_error_lockout);
    }

    static boolean ppxfxbqfkf(int i13) {
        return i13 == 7 || i13 == 9;
    }

    static boolean zoijcleaow(int i13) {
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 6:
            default:
                return false;
        }
    }
}
