package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import g6.yggfygwlhe;
import p6.btonecajqb;
import p6.draadjrbmk;
import p6.dxjokdxxww;
import p6.wflxmlrfwp;
import q6.agtfadlqog;

/* JADX INFO: loaded from: classes2.dex */
abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f13912iobyxmoadg = yggfygwlhe.dxjokdxxww("Alarms");

    public static void iobyxmoadg(Context context, WorkDatabase workDatabase, wflxmlrfwp wflxmlrfwpVar) {
        btonecajqb btonecajqbVarTzroggbefp = workDatabase.tzroggbefp();
        dxjokdxxww dxjokdxxwwVarIobyxmoadg = btonecajqbVarTzroggbefp.iobyxmoadg(wflxmlrfwpVar);
        if (dxjokdxxwwVarIobyxmoadg != null) {
            zoijcleaow(context, wflxmlrfwpVar, dxjokdxxwwVarIobyxmoadg.f75705ppxfxbqfkf);
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13912iobyxmoadg, "Removing SystemIdInfo for workSpecId (" + wflxmlrfwpVar + ")");
            btonecajqbVarTzroggbefp.lqeggnwhkg(wflxmlrfwpVar);
        }
    }

    public static void ppxfxbqfkf(Context context, WorkDatabase workDatabase, wflxmlrfwp wflxmlrfwpVar, long j13) {
        btonecajqb btonecajqbVarTzroggbefp = workDatabase.tzroggbefp();
        dxjokdxxww dxjokdxxwwVarIobyxmoadg = btonecajqbVarTzroggbefp.iobyxmoadg(wflxmlrfwpVar);
        if (dxjokdxxwwVarIobyxmoadg != null) {
            zoijcleaow(context, wflxmlrfwpVar, dxjokdxxwwVarIobyxmoadg.f75705ppxfxbqfkf);
            wkgbmnqykc(context, wflxmlrfwpVar, dxjokdxxwwVarIobyxmoadg.f75705ppxfxbqfkf, j13);
        } else {
            int iPpxfxbqfkf = new agtfadlqog(workDatabase).ppxfxbqfkf();
            btonecajqbVarTzroggbefp.zoijcleaow(draadjrbmk.iobyxmoadg(wflxmlrfwpVar, iPpxfxbqfkf));
            wkgbmnqykc(context, wflxmlrfwpVar, iPpxfxbqfkf, j13);
        }
    }

    private static void wkgbmnqykc(Context context, wflxmlrfwp wflxmlrfwpVar, int i13, long j13) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i13, zoijcleaow.ppxfxbqfkf(context, wflxmlrfwpVar), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j13, service);
        }
    }

    private static void zoijcleaow(Context context, wflxmlrfwp wflxmlrfwpVar, int i13) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i13, zoijcleaow.ppxfxbqfkf(context, wflxmlrfwpVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13912iobyxmoadg, "Cancelling existing alarm with (workSpecId, systemId) (" + wflxmlrfwpVar + ", " + i13 + ")");
        alarmManager.cancel(service);
    }
}
