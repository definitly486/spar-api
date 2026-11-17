package lereixgezr;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class sopmlzcsov {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static int f62384iobyxmoadg = 3;

    static void btonecajqb(int i13) {
        f62384iobyxmoadg = i13;
    }

    public static void draadjrbmk(String str, String str2) {
        String strGtknphoqwx = gtknphoqwx(str);
        if (lqeggnwhkg(strGtknphoqwx, 5)) {
            Log.w(strGtknphoqwx, str2);
        }
    }

    static void dxjokdxxww() {
        f62384iobyxmoadg = 3;
    }

    public static void eablkybsjg(String str, String str2) {
        String strGtknphoqwx = gtknphoqwx(str);
        if (lqeggnwhkg(strGtknphoqwx, 4)) {
            Log.i(strGtknphoqwx, str2);
        }
    }

    private static String gtknphoqwx(String str) {
        return str;
    }

    public static boolean gxszxtbevo(String str) {
        return lqeggnwhkg(gtknphoqwx(str), 3);
    }

    public static void iobyxmoadg(String str, String str2) {
        String strGtknphoqwx = gtknphoqwx(str);
        if (lqeggnwhkg(strGtknphoqwx, 3)) {
            Log.d(strGtknphoqwx, str2);
        }
    }

    private static boolean lqeggnwhkg(String str, int i13) {
        return f62384iobyxmoadg <= i13 || Log.isLoggable(str, i13);
    }

    public static boolean nufgyqmvbu(String str) {
        return lqeggnwhkg(gtknphoqwx(str), 2);
    }

    public static void ppxfxbqfkf(String str, String str2) {
        String strGtknphoqwx = gtknphoqwx(str);
        if (lqeggnwhkg(strGtknphoqwx, 6)) {
            Log.e(strGtknphoqwx, str2);
        }
    }

    public static void wflxmlrfwp(String str, String str2, Throwable th2) {
        String strGtknphoqwx = gtknphoqwx(str);
        if (lqeggnwhkg(strGtknphoqwx, 5)) {
            Log.w(strGtknphoqwx, str2, th2);
        }
    }

    public static void wkgbmnqykc(String str, String str2, Throwable th2) {
        String strGtknphoqwx = gtknphoqwx(str);
        if (lqeggnwhkg(strGtknphoqwx, 6)) {
            Log.e(strGtknphoqwx, str2, th2);
        }
    }

    public static void zoijcleaow(String str, String str2, Throwable th2) {
        String strGtknphoqwx = gtknphoqwx(str);
        if (lqeggnwhkg(strGtknphoqwx, 3)) {
            Log.d(strGtknphoqwx, str2, th2);
        }
    }
}
