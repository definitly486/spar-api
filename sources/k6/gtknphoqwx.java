package k6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import g6.cdpycssgdh;
import g6.hkdspvbjdz;
import g6.yggfygwlhe;
import h6.jyumaefscl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p6.draadjrbmk;
import p6.lereixgezr;
import p6.wflxmlrfwp;
import q6.agtfadlqog;

/* JADX INFO: loaded from: classes2.dex */
public class gtknphoqwx implements jyumaefscl {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final String f53893esjtqupxsv = yggfygwlhe.dxjokdxxww("SystemJobScheduler");

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final androidx.work.iobyxmoadg f53894cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final WorkDatabase f53895iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final dxjokdxxww f53896jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final JobScheduler f53897yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f53898zdlpuopuiu;

    public gtknphoqwx(Context context, WorkDatabase workDatabase, androidx.work.iobyxmoadg iobyxmoadgVar) {
        this(context, workDatabase, iobyxmoadgVar, wkgbmnqykc.ppxfxbqfkf(context), new dxjokdxxww(context, iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.kcexrzcfyt()));
    }

    public static boolean dxjokdxxww(Context context, WorkDatabase workDatabase) {
        JobScheduler jobSchedulerPpxfxbqfkf = wkgbmnqykc.ppxfxbqfkf(context);
        List<JobInfo> listLqeggnwhkg = lqeggnwhkg(context, jobSchedulerPpxfxbqfkf);
        List listWkgbmnqykc = workDatabase.tzroggbefp().wkgbmnqykc();
        boolean z13 = false;
        HashSet hashSet = new HashSet(listLqeggnwhkg != null ? listLqeggnwhkg.size() : 0);
        if (listLqeggnwhkg != null && !listLqeggnwhkg.isEmpty()) {
            for (JobInfo jobInfo : listLqeggnwhkg) {
                wflxmlrfwp wflxmlrfwpVarNufgyqmvbu = nufgyqmvbu(jobInfo);
                if (wflxmlrfwpVarNufgyqmvbu != null) {
                    hashSet.add(wflxmlrfwpVarNufgyqmvbu.zoijcleaow());
                } else {
                    wkgbmnqykc(jobSchedulerPpxfxbqfkf, jobInfo.getId());
                }
            }
        }
        Iterator it = listWkgbmnqykc.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains((String) it.next())) {
                yggfygwlhe.eablkybsjg().iobyxmoadg(f53893esjtqupxsv, "Reconciling jobs");
                z13 = true;
                break;
            }
        }
        if (z13) {
            workDatabase.ojitshcjhn();
            try {
                p6.jyumaefscl jyumaefsclVarUlzqkzuiru = workDatabase.ulzqkzuiru();
                Iterator it2 = listWkgbmnqykc.iterator();
                while (it2.hasNext()) {
                    jyumaefsclVarUlzqkzuiru.ojitshcjhn((String) it2.next(), -1L);
                }
                workDatabase.dsvhmnatus();
            } finally {
                workDatabase.kcexrzcfyt();
            }
        }
        return z13;
    }

    private static List gxszxtbevo(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listLqeggnwhkg = lqeggnwhkg(context, jobScheduler);
        if (listLqeggnwhkg == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listLqeggnwhkg) {
            wflxmlrfwp wflxmlrfwpVarNufgyqmvbu = nufgyqmvbu(jobInfo);
            if (wflxmlrfwpVarNufgyqmvbu != null && str.equals(wflxmlrfwpVarNufgyqmvbu.zoijcleaow())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    static List lqeggnwhkg(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listZoijcleaow = wkgbmnqykc.zoijcleaow(jobScheduler);
        if (listZoijcleaow == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listZoijcleaow.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listZoijcleaow) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static wflxmlrfwp nufgyqmvbu(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new wflxmlrfwp(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static void wkgbmnqykc(JobScheduler jobScheduler, int i13) {
        try {
            jobScheduler.cancel(i13);
        } catch (Throwable th2) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(f53893esjtqupxsv, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i13)), th2);
        }
    }

    public static void zoijcleaow(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            wkgbmnqykc.ppxfxbqfkf(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List listLqeggnwhkg = lqeggnwhkg(context, jobScheduler);
        if (listLqeggnwhkg == null || listLqeggnwhkg.isEmpty()) {
            return;
        }
        Iterator it = listLqeggnwhkg.iterator();
        while (it.hasNext()) {
            wkgbmnqykc(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public void btonecajqb(p6.yggfygwlhe yggfygwlheVar, int i13) {
        JobInfo jobInfoIobyxmoadg = this.f53896jyumaefscl.iobyxmoadg(yggfygwlheVar, i13);
        yggfygwlhe yggfygwlheVarEablkybsjg = yggfygwlhe.eablkybsjg();
        String str = f53893esjtqupxsv;
        yggfygwlheVarEablkybsjg.iobyxmoadg(str, "Scheduling work ID " + yggfygwlheVar.f75796iobyxmoadg + "Job ID " + i13);
        try {
            if (this.f53897yggfygwlhe.schedule(jobInfoIobyxmoadg) == 0) {
                yggfygwlhe.eablkybsjg().gtknphoqwx(str, "Unable to schedule work ID " + yggfygwlheVar.f75796iobyxmoadg);
                if (yggfygwlheVar.f75806vdvldrhtss && yggfygwlheVar.f75803oxmwwwfdhm == cdpycssgdh.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    yggfygwlheVar.f75806vdvldrhtss = false;
                    yggfygwlhe.eablkybsjg().iobyxmoadg(str, String.format("Scheduling a non-expedited job (work ID %s)", yggfygwlheVar.f75796iobyxmoadg));
                    btonecajqb(yggfygwlheVar, i13);
                }
            }
        } catch (IllegalStateException e13) {
            String strIobyxmoadg = wkgbmnqykc.iobyxmoadg(this.f53898zdlpuopuiu, this.f53895iwizpuwonk, this.f53894cqumvgiudr);
            yggfygwlhe.eablkybsjg().ppxfxbqfkf(f53893esjtqupxsv, strIobyxmoadg);
            IllegalStateException illegalStateException = new IllegalStateException(strIobyxmoadg, e13);
            u1.iobyxmoadg iobyxmoadgVarDraadjrbmk = this.f53894cqumvgiudr.draadjrbmk();
            if (iobyxmoadgVarDraadjrbmk == null) {
                throw illegalStateException;
            }
            iobyxmoadgVarDraadjrbmk.accept(illegalStateException);
        } catch (Throwable th2) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(f53893esjtqupxsv, "Unable to schedule " + yggfygwlheVar, th2);
        }
    }

    @Override // h6.jyumaefscl
    public boolean eablkybsjg() {
        return true;
    }

    @Override // h6.jyumaefscl
    public void iobyxmoadg(String str) {
        List listGxszxtbevo = gxszxtbevo(this.f53898zdlpuopuiu, this.f53897yggfygwlhe, str);
        if (listGxszxtbevo == null || listGxszxtbevo.isEmpty()) {
            return;
        }
        Iterator it = listGxszxtbevo.iterator();
        while (it.hasNext()) {
            wkgbmnqykc(this.f53897yggfygwlhe, ((Integer) it.next()).intValue());
        }
        this.f53895iwizpuwonk.tzroggbefp().gxszxtbevo(str);
    }

    @Override // h6.jyumaefscl
    public void ppxfxbqfkf(p6.yggfygwlhe... yggfygwlheVarArr) {
        agtfadlqog agtfadlqogVar = new agtfadlqog(this.f53895iwizpuwonk);
        for (p6.yggfygwlhe yggfygwlheVar : yggfygwlheVarArr) {
            this.f53895iwizpuwonk.ojitshcjhn();
            try {
                p6.yggfygwlhe yggfygwlheVarDxjokdxxww = this.f53895iwizpuwonk.ulzqkzuiru().dxjokdxxww(yggfygwlheVar.f75796iobyxmoadg);
                if (yggfygwlheVarDxjokdxxww == null) {
                    yggfygwlhe.eablkybsjg().gtknphoqwx(f53893esjtqupxsv, "Skipping scheduling " + yggfygwlheVar.f75796iobyxmoadg + " because it's no longer in the DB");
                    this.f53895iwizpuwonk.dsvhmnatus();
                } else if (yggfygwlheVarDxjokdxxww.f75811zoijcleaow != hkdspvbjdz.ppxfxbqfkf.ENQUEUED) {
                    yggfygwlhe.eablkybsjg().gtknphoqwx(f53893esjtqupxsv, "Skipping scheduling " + yggfygwlheVar.f75796iobyxmoadg + " because it is no longer enqueued");
                    this.f53895iwizpuwonk.dsvhmnatus();
                } else {
                    wflxmlrfwp wflxmlrfwpVarIobyxmoadg = lereixgezr.iobyxmoadg(yggfygwlheVar);
                    p6.dxjokdxxww dxjokdxxwwVarIobyxmoadg = this.f53895iwizpuwonk.tzroggbefp().iobyxmoadg(wflxmlrfwpVarIobyxmoadg);
                    int iEablkybsjg = dxjokdxxwwVarIobyxmoadg != null ? dxjokdxxwwVarIobyxmoadg.f75705ppxfxbqfkf : agtfadlqogVar.eablkybsjg(this.f53894cqumvgiudr.dxjokdxxww(), this.f53894cqumvgiudr.lqeggnwhkg());
                    if (dxjokdxxwwVarIobyxmoadg == null) {
                        this.f53895iwizpuwonk.tzroggbefp().zoijcleaow(draadjrbmk.iobyxmoadg(wflxmlrfwpVarIobyxmoadg, iEablkybsjg));
                    }
                    btonecajqb(yggfygwlheVar, iEablkybsjg);
                    this.f53895iwizpuwonk.dsvhmnatus();
                }
                this.f53895iwizpuwonk.kcexrzcfyt();
            } catch (Throwable th2) {
                this.f53895iwizpuwonk.kcexrzcfyt();
                throw th2;
            }
        }
    }

    public gtknphoqwx(Context context, WorkDatabase workDatabase, androidx.work.iobyxmoadg iobyxmoadgVar, JobScheduler jobScheduler, dxjokdxxww dxjokdxxwwVar) {
        this.f53898zdlpuopuiu = context;
        this.f53897yggfygwlhe = jobScheduler;
        this.f53896jyumaefscl = dxjokdxxwwVar;
        this.f53895iwizpuwonk = workDatabase;
        this.f53894cqumvgiudr = iobyxmoadgVar;
    }
}
