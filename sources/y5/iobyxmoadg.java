package y5;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static Method f123912eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static long f123913iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static Method f123914ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static Method f123915wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static Method f123916zoijcleaow;

    public static void btonecajqb(String str, int i13) {
        if (Build.VERSION.SDK_INT >= 29) {
            ppxfxbqfkf.wkgbmnqykc(draadjrbmk(str), i13);
        } else {
            gtknphoqwx(draadjrbmk(str), i13);
        }
    }

    private static String draadjrbmk(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    private static boolean dxjokdxxww() {
        try {
            if (f123916zoijcleaow == null) {
                f123913iobyxmoadg = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f123916zoijcleaow = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f123916zoijcleaow.invoke(null, Long.valueOf(f123913iobyxmoadg))).booleanValue();
        } catch (Exception e13) {
            lqeggnwhkg("isTagEnabled", e13);
            return false;
        }
    }

    private static void eablkybsjg(String str, int i13) {
        try {
            if (f123915wkgbmnqykc == null) {
                f123915wkgbmnqykc = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f123915wkgbmnqykc.invoke(null, Long.valueOf(f123913iobyxmoadg), str, Integer.valueOf(i13));
        } catch (Exception e13) {
            lqeggnwhkg("asyncTraceEnd", e13);
        }
    }

    private static void gtknphoqwx(String str, int i13) {
        try {
            if (f123912eablkybsjg == null) {
                f123912eablkybsjg = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f123912eablkybsjg.invoke(null, Long.valueOf(f123913iobyxmoadg), str, Integer.valueOf(i13));
        } catch (Exception e13) {
            lqeggnwhkg("traceCounter", e13);
        }
    }

    public static void gxszxtbevo() {
        zoijcleaow.zoijcleaow();
    }

    public static void iobyxmoadg(String str, int i13) {
        if (Build.VERSION.SDK_INT >= 29) {
            ppxfxbqfkf.iobyxmoadg(draadjrbmk(str), i13);
        } else {
            zoijcleaow(draadjrbmk(str), i13);
        }
    }

    private static void lqeggnwhkg(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean nufgyqmvbu() {
        return Build.VERSION.SDK_INT >= 29 ? ppxfxbqfkf.ppxfxbqfkf() : dxjokdxxww();
    }

    public static void ppxfxbqfkf(String str) {
        zoijcleaow.iobyxmoadg(draadjrbmk(str));
    }

    public static void wkgbmnqykc(String str, int i13) {
        if (Build.VERSION.SDK_INT >= 29) {
            ppxfxbqfkf.zoijcleaow(draadjrbmk(str), i13);
        } else {
            eablkybsjg(draadjrbmk(str), i13);
        }
    }

    private static void zoijcleaow(String str, int i13) {
        try {
            if (f123914ppxfxbqfkf == null) {
                f123914ppxfxbqfkf = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f123914ppxfxbqfkf.invoke(null, Long.valueOf(f123913iobyxmoadg), str, Integer.valueOf(i13));
        } catch (Exception e13) {
            lqeggnwhkg("asyncTraceBegin", e13);
        }
    }
}
