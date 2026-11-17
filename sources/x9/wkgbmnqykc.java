package x9;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc implements cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f121815iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo f121816ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y9.wkgbmnqykc f121817zoijcleaow;

    public wkgbmnqykc(Context context, y9.wkgbmnqykc wkgbmnqykcVar, gxszxtbevo gxszxtbevoVar) {
        this.f121815iobyxmoadg = context;
        this.f121817zoijcleaow = wkgbmnqykcVar;
        this.f121816ppxfxbqfkf = gxszxtbevoVar;
    }

    private boolean wkgbmnqykc(JobScheduler jobScheduler, int i13, int i14) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i15 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i13) {
                return i15 >= i14;
            }
        }
        return false;
    }

    @Override // x9.cqumvgiudr
    public void iobyxmoadg(q9.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        zoijcleaow(rgvfuqvkyqVar, i13, false);
    }

    int ppxfxbqfkf(q9.rgvfuqvkyq rgvfuqvkyqVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f121815iobyxmoadg.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(rgvfuqvkyqVar.zoijcleaow().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(ba.iobyxmoadg.iobyxmoadg(rgvfuqvkyqVar.wkgbmnqykc())).array());
        if (rgvfuqvkyqVar.ppxfxbqfkf() != null) {
            adler32.update(rgvfuqvkyqVar.ppxfxbqfkf());
        }
        return (int) adler32.getValue();
    }

    @Override // x9.cqumvgiudr
    public void zoijcleaow(q9.rgvfuqvkyq rgvfuqvkyqVar, int i13, boolean z13) {
        ComponentName componentName = new ComponentName(this.f121815iobyxmoadg, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f121815iobyxmoadg.getSystemService("jobscheduler");
        int iPpxfxbqfkf = ppxfxbqfkf(rgvfuqvkyqVar);
        if (!z13 && wkgbmnqykc(jobScheduler, iPpxfxbqfkf, i13)) {
            u9.iobyxmoadg.iobyxmoadg("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", rgvfuqvkyqVar);
            return;
        }
        long jC = this.f121817zoijcleaow.c(rgvfuqvkyqVar);
        JobInfo.Builder builderPpxfxbqfkf = this.f121816ppxfxbqfkf.ppxfxbqfkf(new JobInfo.Builder(iPpxfxbqfkf, componentName), rgvfuqvkyqVar.wkgbmnqykc(), jC, i13);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i13);
        persistableBundle.putString("backendName", rgvfuqvkyqVar.zoijcleaow());
        persistableBundle.putInt("priority", ba.iobyxmoadg.iobyxmoadg(rgvfuqvkyqVar.wkgbmnqykc()));
        if (rgvfuqvkyqVar.ppxfxbqfkf() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(rgvfuqvkyqVar.ppxfxbqfkf(), 0));
        }
        builderPpxfxbqfkf.setExtras(persistableBundle);
        u9.iobyxmoadg.zoijcleaow("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", rgvfuqvkyqVar, Integer.valueOf(iPpxfxbqfkf), Long.valueOf(this.f121816ppxfxbqfkf.lqeggnwhkg(rgvfuqvkyqVar.wkgbmnqykc(), jC, i13)), Long.valueOf(jC), Integer.valueOf(i13));
        jobScheduler.schedule(builderPpxfxbqfkf.build());
    }
}
