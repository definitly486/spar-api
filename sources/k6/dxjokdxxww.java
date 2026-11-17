package k6;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import g6.jyumaefscl;
import g6.yggfygwlhe;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class dxjokdxxww {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f53888wkgbmnqykc = yggfygwlhe.dxjokdxxww("SystemJobInfoConverter");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ComponentName f53889iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f53890ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final g6.zoijcleaow f53891zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f53892iobyxmoadg;

        static {
            int[] iArr = new int[jyumaefscl.values().length];
            f53892iobyxmoadg = iArr;
            try {
                iArr[jyumaefscl.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53892iobyxmoadg[jyumaefscl.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53892iobyxmoadg[jyumaefscl.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53892iobyxmoadg[jyumaefscl.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53892iobyxmoadg[jyumaefscl.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    dxjokdxxww(Context context, g6.zoijcleaow zoijcleaowVar, boolean z13) {
        this.f53891zoijcleaow = zoijcleaowVar;
        this.f53889iobyxmoadg = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f53890ppxfxbqfkf = z13;
    }

    static int ppxfxbqfkf(jyumaefscl jyumaefsclVar) {
        int i13 = iobyxmoadg.f53892iobyxmoadg[jyumaefsclVar.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        if (i13 == 4) {
            return 3;
        }
        if (i13 == 5) {
            return 4;
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(f53888wkgbmnqykc, "API version too low. Cannot convert network type value " + jyumaefsclVar);
        return 1;
    }

    static void wkgbmnqykc(JobInfo.Builder builder, jyumaefscl jyumaefsclVar) {
        if (Build.VERSION.SDK_INT < 30 || jyumaefsclVar != jyumaefscl.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(ppxfxbqfkf(jyumaefsclVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    private static JobInfo.TriggerContentUri zoijcleaow(g6.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        return new JobInfo.TriggerContentUri(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow() ? 1 : 0);
    }

    JobInfo iobyxmoadg(p6.yggfygwlhe yggfygwlheVar, int i13) {
        String strGtknphoqwx;
        g6.wkgbmnqykc wkgbmnqykcVar = yggfygwlheVar.f75789btonecajqb;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", yggfygwlheVar.f75796iobyxmoadg);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", yggfygwlheVar.gxszxtbevo());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", yggfygwlheVar.agtfadlqog());
        JobInfo.Builder extras = new JobInfo.Builder(i13, this.f53889iobyxmoadg).setRequiresCharging(wkgbmnqykcVar.dxjokdxxww()).setRequiresDeviceIdle(wkgbmnqykcVar.btonecajqb()).setExtras(persistableBundle);
        NetworkRequest networkRequestWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 28 || networkRequestWkgbmnqykc == null) {
            wkgbmnqykc(extras, wkgbmnqykcVar.gxszxtbevo());
        } else {
            btonecajqb.iobyxmoadg(extras, networkRequestWkgbmnqykc);
        }
        if (!wkgbmnqykcVar.btonecajqb()) {
            extras.setBackoffCriteria(yggfygwlheVar.f75807wflxmlrfwp, yggfygwlheVar.f75791draadjrbmk == g6.iobyxmoadg.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(yggfygwlheVar.ppxfxbqfkf() - this.f53891zoijcleaow.currentTimeMillis(), 0L);
        if (i14 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!yggfygwlheVar.f75806vdvldrhtss && this.f53890ppxfxbqfkf) {
            extras.setImportantWhileForeground(true);
        }
        if (wkgbmnqykcVar.lqeggnwhkg()) {
            Iterator it = wkgbmnqykcVar.ppxfxbqfkf().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(zoijcleaow((g6.wkgbmnqykc.ppxfxbqfkf) it.next()));
            }
            extras.setTriggerContentUpdateDelay(wkgbmnqykcVar.zoijcleaow());
            extras.setTriggerContentMaxDelay(wkgbmnqykcVar.iobyxmoadg());
        }
        extras.setPersisted(false);
        int i15 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(wkgbmnqykcVar.nufgyqmvbu());
        extras.setRequiresStorageNotLow(wkgbmnqykcVar.gtknphoqwx());
        boolean z13 = yggfygwlheVar.f75794gtknphoqwx > 0;
        boolean z14 = jMax > 0;
        if (i15 >= 31 && yggfygwlheVar.f75806vdvldrhtss && !z13 && !z14) {
            extras.setExpedited(true);
        }
        if (i15 >= 35 && (strGtknphoqwx = yggfygwlheVar.gtknphoqwx()) != null) {
            extras.setTraceTag(strGtknphoqwx);
        }
        return extras.build();
    }
}
