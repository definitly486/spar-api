package xb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import dc.iozdgvuglv;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final btonecajqb f121951iobyxmoadg = new btonecajqb();

    private btonecajqb() {
    }

    private final String gxszxtbevo() {
        String processName;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 33) {
            return (i13 < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        zdlpuopuiu.dxjokdxxww(strMyProcessName, "{\n      Process.myProcessName()\n    }");
        return strMyProcessName;
    }

    public static /* synthetic */ iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf ppxfxbqfkf(btonecajqb btonecajqbVar, String str, int i13, int i14, boolean z13, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            i14 = 0;
        }
        if ((i15 & 8) != 0) {
            z13 = false;
        }
        return btonecajqbVar.zoijcleaow(str, i13, i14, z13);
    }

    public final iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf eablkybsjg(Context context) {
        Object next;
        zdlpuopuiu.btonecajqb(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = wkgbmnqykc(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf) next).ppxfxbqfkf() != iMyPid);
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = (iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf) next;
        return ppxfxbqfkfVar == null ? ppxfxbqfkf(this, gxszxtbevo(), iMyPid, 0, false, 12, null) : ppxfxbqfkfVar;
    }

    public final iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf iobyxmoadg(String processName, int i13, int i14) {
        zdlpuopuiu.btonecajqb(processName, "processName");
        return ppxfxbqfkf(this, processName, i13, i14, false, 8, null);
    }

    public final List wkgbmnqykc(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        int i13 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = jyumaefscl.wflxmlrfwp();
        }
        List listZfvoamnweg = jyumaefscl.zfvoamnweg(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listZfvoamnweg) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i13) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.iobyxmoadg().eablkybsjg(runningAppProcessInfo.processName).wkgbmnqykc(runningAppProcessInfo.pid).ppxfxbqfkf(runningAppProcessInfo.importance).zoijcleaow(zdlpuopuiu.eablkybsjg(runningAppProcessInfo.processName, str)).iobyxmoadg());
        }
        return arrayList2;
    }

    public final iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf zoijcleaow(String processName, int i13, int i14, boolean z13) {
        zdlpuopuiu.btonecajqb(processName, "processName");
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.iobyxmoadg().eablkybsjg(processName).wkgbmnqykc(i13).ppxfxbqfkf(i14).zoijcleaow(z13).iobyxmoadg();
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarIobyxmoadg, "builder()\n      .setProc…ltProcess)\n      .build()");
        return ppxfxbqfkfVarIobyxmoadg;
    }
}
