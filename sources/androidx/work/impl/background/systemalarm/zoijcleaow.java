package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import g6.yggfygwlhe;
import h6.esjtqupxsv;
import h6.gxszxtbevo;
import h6.lereixgezr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p6.wflxmlrfwp;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow implements gxszxtbevo {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final String f13934esjtqupxsv = yggfygwlhe.dxjokdxxww("CommandHandler");

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final lereixgezr f13935cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final g6.zoijcleaow f13936iwizpuwonk;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f13939zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Map f13938yggfygwlhe = new HashMap();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object f13937jyumaefscl = new Object();

    zoijcleaow(Context context, g6.zoijcleaow zoijcleaowVar, lereixgezr lereixgezrVar) {
        this.f13939zdlpuopuiu = context;
        this.f13936iwizpuwonk = zoijcleaowVar;
        this.f13935cqumvgiudr = lereixgezrVar;
    }

    private void btonecajqb(Intent intent, int i13, eablkybsjg eablkybsjgVar) {
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13934esjtqupxsv, "Handling reschedule " + intent + ", " + i13);
        eablkybsjgVar.lqeggnwhkg().lereixgezr();
    }

    private void draadjrbmk(Intent intent, eablkybsjg eablkybsjgVar) {
        List<esjtqupxsv> listRemove;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i13 = extras.getInt("KEY_WORKSPEC_GENERATION");
            listRemove = new ArrayList(1);
            esjtqupxsv esjtqupxsvVarEablkybsjg = this.f13935cqumvgiudr.eablkybsjg(new wflxmlrfwp(string, i13));
            if (esjtqupxsvVarEablkybsjg != null) {
                listRemove.add(esjtqupxsvVarEablkybsjg);
            }
        } else {
            listRemove = this.f13935cqumvgiudr.remove(string);
        }
        for (esjtqupxsv esjtqupxsvVar : listRemove) {
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13934esjtqupxsv, "Handing stopWork work for " + string);
            eablkybsjgVar.dxjokdxxww().zoijcleaow(esjtqupxsvVar);
            iobyxmoadg.iobyxmoadg(this.f13939zdlpuopuiu, eablkybsjgVar.lqeggnwhkg().yggfygwlhe(), esjtqupxsvVar.iobyxmoadg());
            eablkybsjgVar.zoijcleaow(esjtqupxsvVar.iobyxmoadg(), false);
        }
    }

    private void dxjokdxxww(Intent intent, int i13) {
        wflxmlrfwp wflxmlrfwpVarRgvfuqvkyq = rgvfuqvkyq(intent);
        boolean z13 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13934esjtqupxsv, "Handling onExecutionCompleted " + intent + ", " + i13);
        zoijcleaow(wflxmlrfwpVarRgvfuqvkyq, z13);
    }

    static Intent eablkybsjg(Context context, wflxmlrfwp wflxmlrfwpVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return vdvldrhtss(intent, wflxmlrfwpVar);
    }

    private void gtknphoqwx(Intent intent, int i13, eablkybsjg eablkybsjgVar) {
        wflxmlrfwp wflxmlrfwpVarRgvfuqvkyq = rgvfuqvkyq(intent);
        yggfygwlhe yggfygwlheVarEablkybsjg = yggfygwlhe.eablkybsjg();
        String str = f13934esjtqupxsv;
        yggfygwlheVarEablkybsjg.iobyxmoadg(str, "Handling schedule work for " + wflxmlrfwpVarRgvfuqvkyq);
        WorkDatabase workDatabaseYggfygwlhe = eablkybsjgVar.lqeggnwhkg().yggfygwlhe();
        workDatabaseYggfygwlhe.ojitshcjhn();
        try {
            p6.yggfygwlhe yggfygwlheVarDxjokdxxww = workDatabaseYggfygwlhe.ulzqkzuiru().dxjokdxxww(wflxmlrfwpVarRgvfuqvkyq.zoijcleaow());
            if (yggfygwlheVarDxjokdxxww == null) {
                yggfygwlhe.eablkybsjg().gtknphoqwx(str, "Skipping scheduling " + wflxmlrfwpVarRgvfuqvkyq + " because it's no longer in the DB");
                return;
            }
            if (yggfygwlheVarDxjokdxxww.f75811zoijcleaow.wkgbmnqykc()) {
                yggfygwlhe.eablkybsjg().gtknphoqwx(str, "Skipping scheduling " + wflxmlrfwpVarRgvfuqvkyq + "because it is finished.");
                return;
            }
            long jPpxfxbqfkf = yggfygwlheVarDxjokdxxww.ppxfxbqfkf();
            if (yggfygwlheVarDxjokdxxww.draadjrbmk()) {
                yggfygwlhe.eablkybsjg().iobyxmoadg(str, "Opportunistically setting an alarm for " + wflxmlrfwpVarRgvfuqvkyq + "at " + jPpxfxbqfkf);
                iobyxmoadg.ppxfxbqfkf(this.f13939zdlpuopuiu, workDatabaseYggfygwlhe, wflxmlrfwpVarRgvfuqvkyq, jPpxfxbqfkf);
                eablkybsjgVar.gxszxtbevo().iobyxmoadg().execute(new eablkybsjg.zoijcleaow(eablkybsjgVar, iobyxmoadg(this.f13939zdlpuopuiu), i13));
            } else {
                yggfygwlhe.eablkybsjg().iobyxmoadg(str, "Setting up Alarms for " + wflxmlrfwpVarRgvfuqvkyq + "at " + jPpxfxbqfkf);
                iobyxmoadg.ppxfxbqfkf(this.f13939zdlpuopuiu, workDatabaseYggfygwlhe, wflxmlrfwpVarRgvfuqvkyq, jPpxfxbqfkf);
            }
            workDatabaseYggfygwlhe.dsvhmnatus();
        } finally {
            workDatabaseYggfygwlhe.kcexrzcfyt();
        }
    }

    static Intent gxszxtbevo(Context context, wflxmlrfwp wflxmlrfwpVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return vdvldrhtss(intent, wflxmlrfwpVar);
    }

    static Intent iobyxmoadg(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    private void lqeggnwhkg(Intent intent, int i13, eablkybsjg eablkybsjgVar) {
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13934esjtqupxsv, "Handling constraints changed " + intent);
        new ppxfxbqfkf(this.f13939zdlpuopuiu, this.f13936iwizpuwonk, i13, eablkybsjgVar).iobyxmoadg();
    }

    private void nufgyqmvbu(Intent intent, int i13, eablkybsjg eablkybsjgVar) {
        synchronized (this.f13937jyumaefscl) {
            try {
                wflxmlrfwp wflxmlrfwpVarRgvfuqvkyq = rgvfuqvkyq(intent);
                yggfygwlhe yggfygwlheVarEablkybsjg = yggfygwlhe.eablkybsjg();
                String str = f13934esjtqupxsv;
                yggfygwlheVarEablkybsjg.iobyxmoadg(str, "Handing delay met for " + wflxmlrfwpVarRgvfuqvkyq);
                if (this.f13938yggfygwlhe.containsKey(wflxmlrfwpVarRgvfuqvkyq)) {
                    yggfygwlhe.eablkybsjg().iobyxmoadg(str, "WorkSpec " + wflxmlrfwpVarRgvfuqvkyq + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f13939zdlpuopuiu, i13, eablkybsjgVar, this.f13935cqumvgiudr.wkgbmnqykc(wflxmlrfwpVarRgvfuqvkyq));
                    this.f13938yggfygwlhe.put(wflxmlrfwpVarRgvfuqvkyq, wkgbmnqykcVar);
                    wkgbmnqykcVar.gxszxtbevo();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static Intent ppxfxbqfkf(Context context, wflxmlrfwp wflxmlrfwpVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return vdvldrhtss(intent, wflxmlrfwpVar);
    }

    static wflxmlrfwp rgvfuqvkyq(Intent intent) {
        return new wflxmlrfwp(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent vdvldrhtss(Intent intent, wflxmlrfwp wflxmlrfwpVar) {
        intent.putExtra("KEY_WORKSPEC_ID", wflxmlrfwpVar.zoijcleaow());
        intent.putExtra("KEY_WORKSPEC_GENERATION", wflxmlrfwpVar.iobyxmoadg());
        return intent;
    }

    private static boolean wflxmlrfwp(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static Intent wkgbmnqykc(Context context, wflxmlrfwp wflxmlrfwpVar, boolean z13) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z13);
        return vdvldrhtss(intent, wflxmlrfwpVar);
    }

    boolean agtfadlqog() {
        boolean z13;
        synchronized (this.f13937jyumaefscl) {
            z13 = !this.f13938yggfygwlhe.isEmpty();
        }
        return z13;
    }

    void ojitshcjhn(Intent intent, int i13, eablkybsjg eablkybsjgVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            lqeggnwhkg(intent, i13, eablkybsjgVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            btonecajqb(intent, i13, eablkybsjgVar);
            return;
        }
        if (!wflxmlrfwp(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            yggfygwlhe.eablkybsjg().ppxfxbqfkf(f13934esjtqupxsv, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            gtknphoqwx(intent, i13, eablkybsjgVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            nufgyqmvbu(intent, i13, eablkybsjgVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            draadjrbmk(intent, eablkybsjgVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            dxjokdxxww(intent, i13);
            return;
        }
        yggfygwlhe.eablkybsjg().gtknphoqwx(f13934esjtqupxsv, "Ignoring intent " + intent);
    }

    @Override // h6.gxszxtbevo
    public void zoijcleaow(wflxmlrfwp wflxmlrfwpVar, boolean z13) {
        synchronized (this.f13937jyumaefscl) {
            try {
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f13938yggfygwlhe.remove(wflxmlrfwpVar);
                this.f13935cqumvgiudr.eablkybsjg(wflxmlrfwpVar);
                if (wkgbmnqykcVar != null) {
                    wkgbmnqykcVar.lqeggnwhkg(z13);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
