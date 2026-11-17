package k6;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import g6.yggfygwlhe;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f53901iobyxmoadg;

    static {
        String strDxjokdxxww = yggfygwlhe.dxjokdxxww("SystemJobScheduler");
        zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"SystemJobScheduler\")");
        f53901iobyxmoadg = strDxjokdxxww;
    }

    public static final String iobyxmoadg(Context context, WorkDatabase workDatabase, androidx.work.iobyxmoadg configuration) {
        String str;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(workDatabase, "workDatabase");
        zdlpuopuiu.btonecajqb(configuration, "configuration");
        int i13 = Build.VERSION.SDK_INT;
        int i14 = i13 >= 31 ? 150 : 100;
        int size = workDatabase.ulzqkzuiru().gxszxtbevo().size();
        String strIwxlajgraz = "<faulty JobScheduler failed to getPendingJobs>";
        if (i13 >= 34) {
            JobScheduler jobSchedulerPpxfxbqfkf = ppxfxbqfkf(context);
            List listZoijcleaow = zoijcleaow(jobSchedulerPpxfxbqfkf);
            if (listZoijcleaow != null) {
                List listLqeggnwhkg = gtknphoqwx.lqeggnwhkg(context, jobSchedulerPpxfxbqfkf);
                int size2 = listLqeggnwhkg != null ? listZoijcleaow.size() - listLqeggnwhkg.size() : 0;
                String str2 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                List listLqeggnwhkg2 = gtknphoqwx.lqeggnwhkg(context, (JobScheduler) systemService);
                int size3 = listLqeggnwhkg2 != null ? listLqeggnwhkg2.size() : 0;
                if (size3 != 0) {
                    str2 = size3 + " from WorkManager in the default namespace";
                }
                strIwxlajgraz = jyumaefscl.iwxlajgraz(jyumaefscl.oxmwwwfdhm(listZoijcleaow.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            List listLqeggnwhkg3 = gtknphoqwx.lqeggnwhkg(context, ppxfxbqfkf(context));
            if (listLqeggnwhkg3 != null) {
                strIwxlajgraz = listLqeggnwhkg3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i14 + " job limit exceeded.\nIn JobScheduler there are " + strIwxlajgraz + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + configuration.nufgyqmvbu() + '.';
    }

    public static final JobScheduler ppxfxbqfkf(Context context) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? ppxfxbqfkf.f53900iobyxmoadg.iobyxmoadg(jobScheduler) : jobScheduler;
    }

    public static final List zoijcleaow(JobScheduler jobScheduler) {
        zdlpuopuiu.btonecajqb(jobScheduler, "<this>");
        try {
            return iobyxmoadg.f53899iobyxmoadg.iobyxmoadg(jobScheduler);
        } catch (Throwable th2) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(f53901iobyxmoadg, "getAllPendingJobs() is not reliable on this device.", th2);
            return null;
        }
    }
}
