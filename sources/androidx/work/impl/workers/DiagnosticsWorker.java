package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.ppxfxbqfkf;
import g6.yggfygwlhe;
import h6.dsvhmnatus;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import p6.btonecajqb;
import p6.jyumaefscl;
import p6.ojitshcjhn;
import p6.zynmafqrjb;
import s6.iobyxmoadg;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ppxfxbqfkf$iobyxmoadg;", "doWork", "()Landroidx/work/ppxfxbqfkf$iobyxmoadg;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public ppxfxbqfkf.iobyxmoadg doWork() {
        dsvhmnatus dsvhmnatusVarRgvfuqvkyq = dsvhmnatus.rgvfuqvkyq(getApplicationContext());
        zdlpuopuiu.dxjokdxxww(dsvhmnatusVarRgvfuqvkyq, "getInstance(applicationContext)");
        WorkDatabase workDatabaseYggfygwlhe = dsvhmnatusVarRgvfuqvkyq.yggfygwlhe();
        zdlpuopuiu.dxjokdxxww(workDatabaseYggfygwlhe, "workManager.workDatabase");
        jyumaefscl jyumaefsclVarUlzqkzuiru = workDatabaseYggfygwlhe.ulzqkzuiru();
        ojitshcjhn ojitshcjhnVarMbcevpiqjq = workDatabaseYggfygwlhe.mbcevpiqjq();
        zynmafqrjb zynmafqrjbVarSopmlzcsov = workDatabaseYggfygwlhe.sopmlzcsov();
        btonecajqb btonecajqbVarTzroggbefp = workDatabaseYggfygwlhe.tzroggbefp();
        List listWkgbmnqykc = jyumaefsclVarUlzqkzuiru.wkgbmnqykc(dsvhmnatusVarRgvfuqvkyq.agtfadlqog().iobyxmoadg().currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listYggfygwlhe = jyumaefsclVarUlzqkzuiru.yggfygwlhe();
        List listWflxmlrfwp = jyumaefsclVarUlzqkzuiru.wflxmlrfwp(200);
        if (!listWkgbmnqykc.isEmpty()) {
            yggfygwlhe.eablkybsjg().gxszxtbevo(iobyxmoadg.f105600iobyxmoadg, "Recently completed work:\n\n");
            yggfygwlhe.eablkybsjg().gxszxtbevo(iobyxmoadg.f105600iobyxmoadg, iobyxmoadg.wkgbmnqykc(ojitshcjhnVarMbcevpiqjq, zynmafqrjbVarSopmlzcsov, btonecajqbVarTzroggbefp, listWkgbmnqykc));
        }
        if (!listYggfygwlhe.isEmpty()) {
            yggfygwlhe.eablkybsjg().gxszxtbevo(iobyxmoadg.f105600iobyxmoadg, "Running work:\n\n");
            yggfygwlhe.eablkybsjg().gxszxtbevo(iobyxmoadg.f105600iobyxmoadg, iobyxmoadg.wkgbmnqykc(ojitshcjhnVarMbcevpiqjq, zynmafqrjbVarSopmlzcsov, btonecajqbVarTzroggbefp, listYggfygwlhe));
        }
        if (!listWflxmlrfwp.isEmpty()) {
            yggfygwlhe.eablkybsjg().gxszxtbevo(iobyxmoadg.f105600iobyxmoadg, "Enqueued work:\n\n");
            yggfygwlhe.eablkybsjg().gxszxtbevo(iobyxmoadg.f105600iobyxmoadg, iobyxmoadg.wkgbmnqykc(ojitshcjhnVarMbcevpiqjq, zynmafqrjbVarSopmlzcsov, btonecajqbVarTzroggbefp, listWflxmlrfwp));
        }
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "success()");
        return iobyxmoadgVarPpxfxbqfkf;
    }
}
