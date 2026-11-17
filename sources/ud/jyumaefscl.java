package ud;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final jyumaefscl f113390iobyxmoadg = new jyumaefscl();

    private jyumaefscl() {
    }

    private final yggfygwlhe iobyxmoadg(String str, int i13, int i14, boolean z13) {
        return new yggfygwlhe(str, i13, i14, z13);
    }

    static /* synthetic */ yggfygwlhe zoijcleaow(jyumaefscl jyumaefsclVar, String str, int i13, int i14, boolean z13, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            i14 = 0;
        }
        if ((i15 & 8) != 0) {
            z13 = false;
        }
        return jyumaefsclVar.iobyxmoadg(str, i13, i14, z13);
    }

    public final String eablkybsjg() throws Throwable {
        String processName;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            String strMyProcessName = Process.myProcessName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strMyProcessName, "myProcessName()");
            return strMyProcessName;
        }
        if (i13 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String myProcessName = ProcessUtils.getMyProcessName();
        return myProcessName != null ? myProcessName : "";
    }

    public final List ppxfxbqfkf(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        int i13 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = hg.jyumaefscl.wflxmlrfwp();
        }
        List listZfvoamnweg = hg.jyumaefscl.zfvoamnweg(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listZfvoamnweg) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i13) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new yggfygwlhe(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final yggfygwlhe wkgbmnqykc(Context context) {
        Object next;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = ppxfxbqfkf(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((yggfygwlhe) next).zoijcleaow() != iMyPid);
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) next;
        return yggfygwlheVar == null ? zoijcleaow(this, eablkybsjg(), iMyPid, 0, false, 12, null) : yggfygwlheVar;
    }
}
