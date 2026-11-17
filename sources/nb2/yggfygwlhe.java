package nb2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* JADX INFO: loaded from: classes6.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Context f69628iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final wwaezpbzkn f69629zoijcleaow;

    public yggfygwlhe(Context context, wwaezpbzkn getJobRepeatIntervalUseCase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getJobRepeatIntervalUseCase, "getJobRepeatIntervalUseCase");
        this.f69628iobyxmoadg = context;
        this.f69629zoijcleaow = getJobRepeatIntervalUseCase;
    }

    public final void iobyxmoadg() {
        Object systemService = this.f69628iobyxmoadg.getSystemService((Class<Object>) JobScheduler.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(systemService, "context.getSystemService(JobScheduler::class.java)");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(allPendingJobs, "jobScheduler.allPendingJobs");
        if (allPendingJobs == null || !allPendingJobs.isEmpty()) {
            Iterator<T> it = allPendingJobs.iterator();
            while (it.hasNext()) {
                if (((JobInfo) it.next()).getId() == 88123556) {
                    return;
                }
            }
        }
        JobInfo.Builder builder = new JobInfo.Builder(88123556, new ComponentName(this.f69628iobyxmoadg, (Class<?>) SendMetricsEventJobService.class));
        this.f69629zoijcleaow.f69622iobyxmoadg.f69578iobyxmoadg.getClass();
        nj.iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = nj.iobyxmoadg.f70173yggfygwlhe;
        Integer JOB_REPEAT_INTERVAL_MINUTES = mb2.iobyxmoadg.f66774iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(JOB_REPEAT_INTERVAL_MINUTES, "JOB_REPEAT_INTERVAL_MINUTES");
        jobScheduler.schedule(builder.setPeriodic(nj.iobyxmoadg.ojitshcjhn(nj.ppxfxbqfkf.kcexrzcfyt(JOB_REPEAT_INTERVAL_MINUTES.intValue(), nj.wkgbmnqykc.MINUTES))).setPersisted(true).build());
    }
}
