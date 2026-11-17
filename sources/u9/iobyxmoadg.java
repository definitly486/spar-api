package u9;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {
    public static void eablkybsjg(String str, String str2, Object obj) {
        String strWkgbmnqykc = wkgbmnqykc(str);
        if (Log.isLoggable(strWkgbmnqykc, 4)) {
            Log.i(strWkgbmnqykc, String.format(str2, obj));
        }
    }

    public static void gxszxtbevo(String str, String str2, Object obj) {
        String strWkgbmnqykc = wkgbmnqykc(str);
        if (Log.isLoggable(strWkgbmnqykc, 5)) {
            Log.w(strWkgbmnqykc, String.format(str2, obj));
        }
    }

    public static void iobyxmoadg(String str, String str2, Object obj) {
        String strWkgbmnqykc = wkgbmnqykc(str);
        if (Log.isLoggable(strWkgbmnqykc, 3)) {
            Log.d(strWkgbmnqykc, String.format(str2, obj));
        }
    }

    public static void ppxfxbqfkf(String str, String str2, Throwable th2) {
        String strWkgbmnqykc = wkgbmnqykc(str);
        if (Log.isLoggable(strWkgbmnqykc, 6)) {
            Log.e(strWkgbmnqykc, str2, th2);
        }
    }

    private static String wkgbmnqykc(String str) {
        return "TRuntime." + str;
    }

    public static void zoijcleaow(String str, String str2, Object... objArr) {
        String strWkgbmnqykc = wkgbmnqykc(str);
        if (Log.isLoggable(strWkgbmnqykc, 3)) {
            Log.d(strWkgbmnqykc, String.format(str2, objArr));
        }
    }
}
