package q6;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f77916iobyxmoadg;

    static {
        String strDxjokdxxww = g6.yggfygwlhe.dxjokdxxww("ProcessUtils");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"ProcessUtils\")");
        f77916iobyxmoadg = strDxjokdxxww;
    }

    private static final String iobyxmoadg(Context context) {
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            return iobyxmoadg.f77937iobyxmoadg.iobyxmoadg();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, g6.cllcsxoeiz.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objInvoke);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th2) {
            g6.yggfygwlhe.eablkybsjg().zoijcleaow(f77916iobyxmoadg, "Unable to check ActivityThread for processName", th2);
        }
        int iMyPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean zoijcleaow(Context context, androidx.work.iobyxmoadg configuration) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configuration, "configuration");
        String strIobyxmoadg = iobyxmoadg(context);
        String strPpxfxbqfkf = configuration.ppxfxbqfkf();
        return (strPpxfxbqfkf == null || strPpxfxbqfkf.length() == 0) ? kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strIobyxmoadg, context.getApplicationInfo().processName) : kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strIobyxmoadg, configuration.ppxfxbqfkf());
    }
}
