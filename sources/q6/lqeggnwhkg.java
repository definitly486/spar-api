package q6;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lqeggnwhkg {
    public static final void iobyxmoadg(WorkDatabase workDatabase, androidx.work.iobyxmoadg configuration, h6.iozdgvuglv continuation) {
        int i13;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workDatabase, "workDatabase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configuration, "configuration");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(continuation, "continuation");
        List listKcexrzcfyt = hg.jyumaefscl.kcexrzcfyt(continuation);
        int i14 = 0;
        while (!listKcexrzcfyt.isEmpty()) {
            h6.iozdgvuglv iozdgvuglvVar = (h6.iozdgvuglv) hg.jyumaefscl.hkdspvbjdz(listKcexrzcfyt);
            List listLqeggnwhkg = iozdgvuglvVar.lqeggnwhkg();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listLqeggnwhkg, "current.work");
            if (listLqeggnwhkg == null || !listLqeggnwhkg.isEmpty()) {
                Iterator it = listLqeggnwhkg.iterator();
                i13 = 0;
                while (it.hasNext()) {
                    if (((g6.dsvhmnatus) it.next()).wkgbmnqykc().f75789btonecajqb.lqeggnwhkg() && (i13 = i13 + 1) < 0) {
                        hg.jyumaefscl.jyumaefscl();
                    }
                }
            } else {
                i13 = 0;
            }
            i14 += i13;
            List listGxszxtbevo = iozdgvuglvVar.gxszxtbevo();
            if (listGxszxtbevo != null) {
                listKcexrzcfyt.addAll(listGxszxtbevo);
            }
        }
        if (i14 == 0) {
            return;
        }
        int iZynmafqrjb = workDatabase.ulzqkzuiru().zynmafqrjb();
        int iZoijcleaow = configuration.zoijcleaow();
        if (iZynmafqrjb + i14 <= iZoijcleaow) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + iZoijcleaow + ";\nalready enqueued count: " + iZynmafqrjb + ";\ncurrent enqueue operation count: " + i14 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    public static final p6.yggfygwlhe ppxfxbqfkf(List schedulers, p6.yggfygwlhe workSpec) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(schedulers, "schedulers");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpec, "workSpec");
        return zoijcleaow(workSpec);
    }

    public static final p6.yggfygwlhe zoijcleaow(p6.yggfygwlhe workSpec) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpec, "workSpec");
        boolean zGxszxtbevo = workSpec.f75793eablkybsjg.gxszxtbevo("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zGxszxtbevo2 = workSpec.f75793eablkybsjg.gxszxtbevo("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zGxszxtbevo3 = workSpec.f75793eablkybsjg.gxszxtbevo("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zGxszxtbevo || !zGxszxtbevo2 || !zGxszxtbevo3) {
            return workSpec;
        }
        return p6.yggfygwlhe.eablkybsjg(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new androidx.work.zoijcleaow.iobyxmoadg().ppxfxbqfkf(workSpec.f75793eablkybsjg).lqeggnwhkg("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", workSpec.f75804ppxfxbqfkf).iobyxmoadg(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }
}
