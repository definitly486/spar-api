package k6;

import android.app.job.JobScheduler;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f53900iobyxmoadg = new ppxfxbqfkf();

    private ppxfxbqfkf() {
    }

    public final JobScheduler iobyxmoadg(JobScheduler jobScheduler) {
        zdlpuopuiu.btonecajqb(jobScheduler, "jobScheduler");
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        zdlpuopuiu.dxjokdxxww(jobSchedulerForNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return jobSchedulerForNamespace;
    }
}
