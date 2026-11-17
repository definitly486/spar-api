package qo;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    private static final String iobyxmoadg(Application application) {
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            zdlpuopuiu.dxjokdxxww(processName, "getProcessName(...)");
            return processName;
        }
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            Object systemService = application.getSystemService("activity");
            zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == Process.myPid()) {
                        String processName2 = runningAppProcessInfo.processName;
                        zdlpuopuiu.dxjokdxxww(processName2, "processName");
                        return processName2;
                    }
                }
            }
            String packageName = application.getPackageName();
            zdlpuopuiu.dxjokdxxww(packageName, "getPackageName(...)");
            return packageName;
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
    }

    public static final void ppxfxbqfkf(Application application, tg.iobyxmoadg blockInAppProcess, tg.iobyxmoadg blockOutsideAppProcess) {
        zdlpuopuiu.btonecajqb(application, "<this>");
        zdlpuopuiu.btonecajqb(blockInAppProcess, "blockInAppProcess");
        zdlpuopuiu.btonecajqb(blockOutsideAppProcess, "blockOutsideAppProcess");
        blockOutsideAppProcess.invoke();
        if (zoijcleaow(application)) {
            blockInAppProcess.invoke();
        }
    }

    private static final boolean zoijcleaow(Application application) {
        return zdlpuopuiu.eablkybsjg(application.getPackageName(), iobyxmoadg(application));
    }
}
