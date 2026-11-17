package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import ba.iobyxmoadg;
import q9.rgvfuqvkyq;
import q9.yggfygwlhe;

/* JADX INFO: loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zoijcleaow(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i13 = jobParameters.getExtras().getInt("priority");
        int i14 = jobParameters.getExtras().getInt("attemptNumber");
        yggfygwlhe.gxszxtbevo(getApplicationContext());
        rgvfuqvkyq.iobyxmoadg iobyxmoadgVarWkgbmnqykc = rgvfuqvkyq.iobyxmoadg().zoijcleaow(string).wkgbmnqykc(iobyxmoadg.zoijcleaow(i13));
        if (string2 != null) {
            iobyxmoadgVarWkgbmnqykc.ppxfxbqfkf(Base64.decode(string2, 0));
        }
        yggfygwlhe.ppxfxbqfkf().eablkybsjg().jyumaefscl(iobyxmoadgVarWkgbmnqykc.iobyxmoadg(), i14, new Runnable() { // from class: x9.eablkybsjg
            @Override // java.lang.Runnable
            public final void run() {
                this.f121759zdlpuopuiu.zoijcleaow(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
