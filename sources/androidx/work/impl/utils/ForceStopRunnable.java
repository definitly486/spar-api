package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.iobyxmoadg;
import g6.hkdspvbjdz;
import g6.yggfygwlhe;
import h6.dsvhmnatus;
import h6.ylkuphrtab;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k6.gtknphoqwx;
import p6.jyumaefscl;
import p6.oxmwwwfdhm;
import q1.draadjrbmk;
import q6.cdpycssgdh;
import q6.dxjokdxxww;
import q6.istkbnxepw;

/* JADX INFO: loaded from: classes2.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final String f13968cqumvgiudr = yggfygwlhe.dxjokdxxww("ForceStopRunnable");

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final long f13969esjtqupxsv = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f13970iwizpuwonk = 0;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final istkbnxepw f13971jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final dsvhmnatus f13972yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f13973zdlpuopuiu;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final String f13974iobyxmoadg = yggfygwlhe.dxjokdxxww("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            yggfygwlhe.eablkybsjg().btonecajqb(f13974iobyxmoadg, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.lqeggnwhkg(context);
        }
    }

    public ForceStopRunnable(Context context, dsvhmnatus dsvhmnatusVar) {
        this.f13973zdlpuopuiu = context.getApplicationContext();
        this.f13972yggfygwlhe = dsvhmnatusVar;
        this.f13971jyumaefscl = dsvhmnatusVar.vdvldrhtss();
    }

    static void lqeggnwhkg(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentWkgbmnqykc = wkgbmnqykc(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f13969esjtqupxsv;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentWkgbmnqykc);
        }
    }

    static Intent ppxfxbqfkf(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent wkgbmnqykc(Context context, int i13) {
        return PendingIntent.getBroadcast(context, -1, ppxfxbqfkf(context), i13);
    }

    public void dxjokdxxww(long j13) {
        try {
            Thread.sleep(j13);
        } catch (InterruptedException unused) {
        }
    }

    public boolean eablkybsjg() {
        try {
            int i13 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentWkgbmnqykc = wkgbmnqykc(this.f13973zdlpuopuiu, i13 >= 31 ? 570425344 : 536870912);
            if (i13 >= 30) {
                if (pendingIntentWkgbmnqykc != null) {
                    pendingIntentWkgbmnqykc.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f13973zdlpuopuiu.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jIobyxmoadg = this.f13971jyumaefscl.iobyxmoadg();
                    for (int i14 = 0; i14 < historicalProcessExitReasons.size(); i14++) {
                        ApplicationExitInfo applicationExitInfoIobyxmoadg = dxjokdxxww.iobyxmoadg(historicalProcessExitReasons.get(i14));
                        if (applicationExitInfoIobyxmoadg.getReason() == 10 && applicationExitInfoIobyxmoadg.getTimestamp() >= jIobyxmoadg) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentWkgbmnqykc == null) {
                lqeggnwhkg(this.f13973zdlpuopuiu);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e13) {
            e = e13;
            yggfygwlhe.eablkybsjg().draadjrbmk(f13968cqumvgiudr, "Ignoring exception", e);
            return true;
        } catch (SecurityException e14) {
            e = e14;
            yggfygwlhe.eablkybsjg().draadjrbmk(f13968cqumvgiudr, "Ignoring exception", e);
            return true;
        }
    }

    public boolean gxszxtbevo() {
        iobyxmoadg iobyxmoadgVarAgtfadlqog = this.f13972yggfygwlhe.agtfadlqog();
        if (TextUtils.isEmpty(iobyxmoadgVarAgtfadlqog.ppxfxbqfkf())) {
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13968cqumvgiudr, "The default process name was not specified.");
            return true;
        }
        boolean zZoijcleaow = cdpycssgdh.zoijcleaow(this.f13973zdlpuopuiu, iobyxmoadgVarAgtfadlqog);
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13968cqumvgiudr, "Is default app process = " + zZoijcleaow);
        return zZoijcleaow;
    }

    public boolean iobyxmoadg() {
        boolean zDxjokdxxww = gtknphoqwx.dxjokdxxww(this.f13973zdlpuopuiu, this.f13972yggfygwlhe.yggfygwlhe());
        WorkDatabase workDatabaseYggfygwlhe = this.f13972yggfygwlhe.yggfygwlhe();
        jyumaefscl jyumaefsclVarUlzqkzuiru = workDatabaseYggfygwlhe.ulzqkzuiru();
        oxmwwwfdhm oxmwwwfdhmVarNtlheqmsrt = workDatabaseYggfygwlhe.ntlheqmsrt();
        workDatabaseYggfygwlhe.ojitshcjhn();
        try {
            List<p6.yggfygwlhe> listYggfygwlhe = jyumaefsclVarUlzqkzuiru.yggfygwlhe();
            boolean z13 = (listYggfygwlhe == null || listYggfygwlhe.isEmpty()) ? false : true;
            if (z13) {
                for (p6.yggfygwlhe yggfygwlheVar : listYggfygwlhe) {
                    jyumaefsclVarUlzqkzuiru.jyumaefscl(hkdspvbjdz.ppxfxbqfkf.ENQUEUED, yggfygwlheVar.f75796iobyxmoadg);
                    jyumaefsclVarUlzqkzuiru.eablkybsjg(yggfygwlheVar.f75796iobyxmoadg, -512);
                    jyumaefsclVarUlzqkzuiru.ojitshcjhn(yggfygwlheVar.f75796iobyxmoadg, -1L);
                }
            }
            oxmwwwfdhmVarNtlheqmsrt.ppxfxbqfkf();
            workDatabaseYggfygwlhe.dsvhmnatus();
            workDatabaseYggfygwlhe.kcexrzcfyt();
            return z13 || zDxjokdxxww;
        } catch (Throwable th2) {
            workDatabaseYggfygwlhe.kcexrzcfyt();
            throw th2;
        }
    }

    public boolean nufgyqmvbu() {
        return this.f13972yggfygwlhe.vdvldrhtss().zoijcleaow();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i13;
        try {
            if (!gxszxtbevo()) {
                this.f13972yggfygwlhe.esjtqupxsv();
                return;
            }
            while (true) {
                try {
                    ylkuphrtab.wkgbmnqykc(this.f13973zdlpuopuiu);
                    yggfygwlhe.eablkybsjg().iobyxmoadg(f13968cqumvgiudr, "Performing cleanup operations.");
                    try {
                        zoijcleaow();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e13) {
                        i13 = this.f13970iwizpuwonk + 1;
                        this.f13970iwizpuwonk = i13;
                        if (i13 >= 3) {
                            String str = draadjrbmk.iobyxmoadg(this.f13973zdlpuopuiu) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            yggfygwlhe yggfygwlheVarEablkybsjg = yggfygwlhe.eablkybsjg();
                            String str2 = f13968cqumvgiudr;
                            yggfygwlheVarEablkybsjg.wkgbmnqykc(str2, str, e13);
                            IllegalStateException illegalStateException = new IllegalStateException(str, e13);
                            u1.iobyxmoadg iobyxmoadgVarEablkybsjg = this.f13972yggfygwlhe.agtfadlqog().eablkybsjg();
                            if (iobyxmoadgVarEablkybsjg == null) {
                                throw illegalStateException;
                            }
                            yggfygwlhe.eablkybsjg().zoijcleaow(str2, "Routing exception to the specified exception handler", illegalStateException);
                            iobyxmoadgVarEablkybsjg.accept(illegalStateException);
                            break;
                        }
                        yggfygwlhe.eablkybsjg().zoijcleaow(f13968cqumvgiudr, "Retrying after " + (((long) i13) * 300), e13);
                        dxjokdxxww(((long) this.f13970iwizpuwonk) * 300);
                    }
                    yggfygwlhe.eablkybsjg().zoijcleaow(f13968cqumvgiudr, "Retrying after " + (((long) i13) * 300), e13);
                    dxjokdxxww(((long) this.f13970iwizpuwonk) * 300);
                } catch (SQLiteException e14) {
                    yggfygwlhe.eablkybsjg().ppxfxbqfkf(f13968cqumvgiudr, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e14);
                    u1.iobyxmoadg iobyxmoadgVarEablkybsjg2 = this.f13972yggfygwlhe.agtfadlqog().eablkybsjg();
                    if (iobyxmoadgVarEablkybsjg2 == null) {
                        throw illegalStateException2;
                    }
                    iobyxmoadgVarEablkybsjg2.accept(illegalStateException2);
                }
            }
            this.f13972yggfygwlhe.esjtqupxsv();
        } catch (Throwable th2) {
            this.f13972yggfygwlhe.esjtqupxsv();
            throw th2;
        }
    }

    public void zoijcleaow() {
        boolean zIobyxmoadg = iobyxmoadg();
        if (nufgyqmvbu()) {
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13968cqumvgiudr, "Rescheduling Workers.");
            this.f13972yggfygwlhe.lereixgezr();
            this.f13972yggfygwlhe.vdvldrhtss().eablkybsjg(false);
        } else if (eablkybsjg()) {
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13968cqumvgiudr, "Application was force-stopped, rescheduling.");
            this.f13972yggfygwlhe.lereixgezr();
            this.f13971jyumaefscl.wkgbmnqykc(this.f13972yggfygwlhe.agtfadlqog().iobyxmoadg().currentTimeMillis());
        } else if (zIobyxmoadg) {
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13968cqumvgiudr, "Found unfinished work, scheduling it.");
            androidx.work.impl.iobyxmoadg.nufgyqmvbu(this.f13972yggfygwlhe.agtfadlqog(), this.f13972yggfygwlhe.yggfygwlhe(), this.f13972yggfygwlhe.kcexrzcfyt());
        }
    }
}
