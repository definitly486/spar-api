package q1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static Method f77634eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static long f77635iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static Method f77636ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static Method f77637wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static Method f77638zoijcleaow;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f77635iobyxmoadg = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f77638zoijcleaow = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f77636ppxfxbqfkf = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f77637wkgbmnqykc = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f77634eablkybsjg = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e13) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e13);
            }
        }
    }

    public static void iobyxmoadg(String str) {
        Trace.beginSection(str);
    }

    public static void zoijcleaow() {
        Trace.endSection();
    }
}
