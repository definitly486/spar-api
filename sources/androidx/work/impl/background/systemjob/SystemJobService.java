package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import g6.yggfygwlhe;
import h6.dsvhmnatus;
import h6.esjtqupxsv;
import h6.gxszxtbevo;
import h6.hcddaimhww;
import h6.hkdspvbjdz;
import h6.lereixgezr;
import h6.zdlpuopuiu;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p6.wflxmlrfwp;

/* JADX INFO: loaded from: classes2.dex */
public class SystemJobService extends JobService implements gxszxtbevo {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final String f13940cqumvgiudr = yggfygwlhe.dxjokdxxww("SystemJobService");

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private hcddaimhww f13941iwizpuwonk;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private dsvhmnatus f13944zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Map f13943yggfygwlhe = new HashMap();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final lereixgezr f13942jyumaefscl = lereixgezr.ppxfxbqfkf(false);

    static class iobyxmoadg {
        static String[] iobyxmoadg(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] zoijcleaow(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class ppxfxbqfkf {
        static int iobyxmoadg(JobParameters jobParameters) {
            return SystemJobService.ppxfxbqfkf(jobParameters.getStopReason());
        }
    }

    static class zoijcleaow {
        static Network iobyxmoadg(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    private static void iobyxmoadg(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    static int ppxfxbqfkf(int i13) {
        switch (i13) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i13;
            default:
                return -512;
        }
    }

    private static wflxmlrfwp wkgbmnqykc(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new wflxmlrfwp(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            dsvhmnatus dsvhmnatusVarRgvfuqvkyq = dsvhmnatus.rgvfuqvkyq(getApplicationContext());
            this.f13944zdlpuopuiu = dsvhmnatusVarRgvfuqvkyq;
            zdlpuopuiu zdlpuopuiuVarOxmwwwfdhm = dsvhmnatusVarRgvfuqvkyq.oxmwwwfdhm();
            this.f13941iwizpuwonk = new hkdspvbjdz(zdlpuopuiuVarOxmwwwfdhm, this.f13944zdlpuopuiu.jyumaefscl());
            zdlpuopuiuVarOxmwwwfdhm.eablkybsjg(this);
        } catch (IllegalStateException e13) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e13);
            }
            yggfygwlhe.eablkybsjg().gtknphoqwx(f13940cqumvgiudr, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        dsvhmnatus dsvhmnatusVar = this.f13944zdlpuopuiu;
        if (dsvhmnatusVar != null) {
            dsvhmnatusVar.oxmwwwfdhm().rgvfuqvkyq(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        iobyxmoadg("onStartJob");
        if (this.f13944zdlpuopuiu == null) {
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13940cqumvgiudr, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = wkgbmnqykc(jobParameters);
        if (wflxmlrfwpVarWkgbmnqykc == null) {
            yggfygwlhe.eablkybsjg().ppxfxbqfkf(f13940cqumvgiudr, "WorkSpec id not found!");
            return false;
        }
        if (this.f13943yggfygwlhe.containsKey(wflxmlrfwpVarWkgbmnqykc)) {
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13940cqumvgiudr, "Job is already being executed by SystemJobService: " + wflxmlrfwpVarWkgbmnqykc);
            return false;
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13940cqumvgiudr, "onStartJob for " + wflxmlrfwpVarWkgbmnqykc);
        this.f13943yggfygwlhe.put(wflxmlrfwpVarWkgbmnqykc, jobParameters);
        int i13 = Build.VERSION.SDK_INT;
        WorkerParameters.iobyxmoadg iobyxmoadgVar = new WorkerParameters.iobyxmoadg();
        if (iobyxmoadg.zoijcleaow(jobParameters) != null) {
            iobyxmoadgVar.f13874zoijcleaow = Arrays.asList(iobyxmoadg.zoijcleaow(jobParameters));
        }
        if (iobyxmoadg.iobyxmoadg(jobParameters) != null) {
            iobyxmoadgVar.f13872iobyxmoadg = Arrays.asList(iobyxmoadg.iobyxmoadg(jobParameters));
        }
        if (i13 >= 28) {
            iobyxmoadgVar.f13873ppxfxbqfkf = zoijcleaow.iobyxmoadg(jobParameters);
        }
        this.f13941iwizpuwonk.ppxfxbqfkf(this.f13942jyumaefscl.wkgbmnqykc(wflxmlrfwpVarWkgbmnqykc), iobyxmoadgVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        iobyxmoadg("onStopJob");
        if (this.f13944zdlpuopuiu == null) {
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13940cqumvgiudr, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = wkgbmnqykc(jobParameters);
        if (wflxmlrfwpVarWkgbmnqykc == null) {
            yggfygwlhe.eablkybsjg().ppxfxbqfkf(f13940cqumvgiudr, "WorkSpec id not found!");
            return false;
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13940cqumvgiudr, "onStopJob for " + wflxmlrfwpVarWkgbmnqykc);
        this.f13943yggfygwlhe.remove(wflxmlrfwpVarWkgbmnqykc);
        esjtqupxsv esjtqupxsvVarEablkybsjg = this.f13942jyumaefscl.eablkybsjg(wflxmlrfwpVarWkgbmnqykc);
        if (esjtqupxsvVarEablkybsjg != null) {
            this.f13941iwizpuwonk.eablkybsjg(esjtqupxsvVarEablkybsjg, Build.VERSION.SDK_INT >= 31 ? ppxfxbqfkf.iobyxmoadg(jobParameters) : -512);
        }
        return !this.f13944zdlpuopuiu.oxmwwwfdhm().btonecajqb(wflxmlrfwpVarWkgbmnqykc.zoijcleaow());
    }

    @Override // h6.gxszxtbevo
    public void zoijcleaow(wflxmlrfwp wflxmlrfwpVar, boolean z13) {
        iobyxmoadg("onExecuted");
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13940cqumvgiudr, wflxmlrfwpVar.zoijcleaow() + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.f13943yggfygwlhe.remove(wflxmlrfwpVar);
        this.f13942jyumaefscl.eablkybsjg(wflxmlrfwpVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z13);
        }
    }
}
