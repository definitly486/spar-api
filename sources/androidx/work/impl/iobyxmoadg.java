package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import g6.yggfygwlhe;
import h6.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import k6.gtknphoqwx;
import p6.jyumaefscl;
import p6.wflxmlrfwp;
import q6.zynmafqrjb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f13965iobyxmoadg = yggfygwlhe.dxjokdxxww("Schedulers");

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void eablkybsjg(Executor executor, final List list, final androidx.work.iobyxmoadg iobyxmoadgVar, final WorkDatabase workDatabase, final wflxmlrfwp wflxmlrfwpVar, boolean z13) {
        executor.execute(new Runnable() { // from class: h6.cqumvgiudr
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.iobyxmoadg.wkgbmnqykc(list, wflxmlrfwpVar, iobyxmoadgVar, workDatabase);
            }
        });
    }

    private static void gxszxtbevo(jyumaefscl jyumaefsclVar, g6.zoijcleaow zoijcleaowVar, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = zoijcleaowVar.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jyumaefsclVar.ojitshcjhn(((p6.yggfygwlhe) it.next()).f75796iobyxmoadg, jCurrentTimeMillis);
            }
        }
    }

    public static void lqeggnwhkg(final List list, zdlpuopuiu zdlpuopuiuVar, final Executor executor, final WorkDatabase workDatabase, final androidx.work.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiuVar.eablkybsjg(new h6.gxszxtbevo() { // from class: h6.iwizpuwonk
            @Override // h6.gxszxtbevo
            public final void zoijcleaow(p6.wflxmlrfwp wflxmlrfwpVar, boolean z13) {
                androidx.work.impl.iobyxmoadg.eablkybsjg(executor, list, iobyxmoadgVar, workDatabase, wflxmlrfwpVar, z13);
            }
        });
    }

    public static void nufgyqmvbu(androidx.work.iobyxmoadg iobyxmoadgVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        jyumaefscl jyumaefsclVarUlzqkzuiru = workDatabase.ulzqkzuiru();
        workDatabase.ojitshcjhn();
        try {
            List listIwizpuwonk = jyumaefsclVarUlzqkzuiru.iwizpuwonk();
            gxszxtbevo(jyumaefsclVarUlzqkzuiru, iobyxmoadgVar.iobyxmoadg(), listIwizpuwonk);
            List listOxmwwwfdhm = jyumaefsclVarUlzqkzuiru.oxmwwwfdhm(iobyxmoadgVar.nufgyqmvbu());
            gxszxtbevo(jyumaefsclVarUlzqkzuiru, iobyxmoadgVar.iobyxmoadg(), listOxmwwwfdhm);
            if (listIwizpuwonk != null) {
                listOxmwwwfdhm.addAll(listIwizpuwonk);
            }
            List listWflxmlrfwp = jyumaefsclVarUlzqkzuiru.wflxmlrfwp(200);
            workDatabase.dsvhmnatus();
            workDatabase.kcexrzcfyt();
            if (listOxmwwwfdhm.size() > 0) {
                p6.yggfygwlhe[] yggfygwlheVarArr = (p6.yggfygwlhe[]) listOxmwwwfdhm.toArray(new p6.yggfygwlhe[listOxmwwwfdhm.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    h6.jyumaefscl jyumaefsclVar = (h6.jyumaefscl) it.next();
                    if (jyumaefsclVar.eablkybsjg()) {
                        jyumaefsclVar.ppxfxbqfkf(yggfygwlheVarArr);
                    }
                }
            }
            if (listWflxmlrfwp.size() > 0) {
                p6.yggfygwlhe[] yggfygwlheVarArr2 = (p6.yggfygwlhe[]) listWflxmlrfwp.toArray(new p6.yggfygwlhe[listWflxmlrfwp.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h6.jyumaefscl jyumaefsclVar2 = (h6.jyumaefscl) it2.next();
                    if (!jyumaefsclVar2.eablkybsjg()) {
                        jyumaefsclVar2.ppxfxbqfkf(yggfygwlheVarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.kcexrzcfyt();
            throw th2;
        }
    }

    static h6.jyumaefscl ppxfxbqfkf(Context context, WorkDatabase workDatabase, androidx.work.iobyxmoadg iobyxmoadgVar) {
        gtknphoqwx gtknphoqwxVar = new gtknphoqwx(context, workDatabase, iobyxmoadgVar);
        zynmafqrjb.ppxfxbqfkf(context, SystemJobService.class, true);
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13965iobyxmoadg, "Created SystemJobScheduler and enabled SystemJobService");
        return gtknphoqwxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void wkgbmnqykc(List list, wflxmlrfwp wflxmlrfwpVar, androidx.work.iobyxmoadg iobyxmoadgVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((h6.jyumaefscl) it.next()).iobyxmoadg(wflxmlrfwpVar.zoijcleaow());
        }
        nufgyqmvbu(iobyxmoadgVar, workDatabase, list);
    }
}
