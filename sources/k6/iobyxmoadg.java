package k6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f53899iobyxmoadg = new iobyxmoadg();

    private iobyxmoadg() {
    }

    public final List iobyxmoadg(JobScheduler jobScheduler) {
        zdlpuopuiu.btonecajqb(jobScheduler, "jobScheduler");
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        zdlpuopuiu.dxjokdxxww(allPendingJobs, "jobScheduler.allPendingJobs");
        return allPendingJobs;
    }
}
