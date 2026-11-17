package md;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import lk.jyumaefscl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static Boolean f66800iobyxmoadg;

    public static String eablkybsjg(String str, int i13) {
        jyumaefscl jyumaefsclVarWflxmlrfwp;
        int iLastIndexOf;
        if (str.length() <= i13) {
            return str;
        }
        if (str.charAt(i13) != '/' && (jyumaefsclVarWflxmlrfwp = jyumaefscl.wflxmlrfwp(str)) != null) {
            return (jyumaefsclVarWflxmlrfwp.wkgbmnqykc().lastIndexOf(47) < 0 || (iLastIndexOf = str.lastIndexOf(47, i13 + (-1))) < 0) ? str.substring(0, i13) : str.substring(0, iLastIndexOf);
        }
        return str.substring(0, i13);
    }

    public static void iobyxmoadg(boolean z13, String str) {
        if (!z13) {
            throw new IllegalArgumentException(str);
        }
    }

    public static int ppxfxbqfkf(long j13) {
        if (j13 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j13 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j13;
    }

    public static String wkgbmnqykc(String str) {
        jyumaefscl jyumaefsclVarWflxmlrfwp = jyumaefscl.wflxmlrfwp(str);
        return jyumaefsclVarWflxmlrfwp != null ? jyumaefsclVarWflxmlrfwp.gtknphoqwx().lereixgezr("").draadjrbmk("").rgvfuqvkyq(null).gxszxtbevo(null).toString() : str;
    }

    public static boolean zoijcleaow(Context context) {
        Boolean bool = f66800iobyxmoadg;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f66800iobyxmoadg = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e13) {
            gd.iobyxmoadg.eablkybsjg().iobyxmoadg("No perf logcat meta data found " + e13.getMessage());
            return false;
        }
    }
}
