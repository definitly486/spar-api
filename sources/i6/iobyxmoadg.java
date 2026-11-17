package i6;

import g6.wwaezpbzkn;
import g6.yggfygwlhe;
import h6.jyumaefscl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final String f41983eablkybsjg = yggfygwlhe.dxjokdxxww("DelayedWorkTracker");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final jyumaefscl f41984iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final g6.zoijcleaow f41985ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f41986wkgbmnqykc = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wwaezpbzkn f41987zoijcleaow;

    /* JADX INFO: renamed from: i6.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class RunnableC0985iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ p6.yggfygwlhe f41989zdlpuopuiu;

        RunnableC0985iobyxmoadg(p6.yggfygwlhe yggfygwlheVar) {
            this.f41989zdlpuopuiu = yggfygwlheVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            yggfygwlhe.eablkybsjg().iobyxmoadg(iobyxmoadg.f41983eablkybsjg, "Scheduling work " + this.f41989zdlpuopuiu.f75796iobyxmoadg);
            iobyxmoadg.this.f41984iobyxmoadg.ppxfxbqfkf(this.f41989zdlpuopuiu);
        }
    }

    public iobyxmoadg(jyumaefscl jyumaefsclVar, wwaezpbzkn wwaezpbzknVar, g6.zoijcleaow zoijcleaowVar) {
        this.f41984iobyxmoadg = jyumaefsclVar;
        this.f41987zoijcleaow = wwaezpbzknVar;
        this.f41985ppxfxbqfkf = zoijcleaowVar;
    }

    public void iobyxmoadg(p6.yggfygwlhe yggfygwlheVar, long j13) {
        Runnable runnable = (Runnable) this.f41986wkgbmnqykc.remove(yggfygwlheVar.f75796iobyxmoadg);
        if (runnable != null) {
            this.f41987zoijcleaow.iobyxmoadg(runnable);
        }
        RunnableC0985iobyxmoadg runnableC0985iobyxmoadg = new RunnableC0985iobyxmoadg(yggfygwlheVar);
        this.f41986wkgbmnqykc.put(yggfygwlheVar.f75796iobyxmoadg, runnableC0985iobyxmoadg);
        this.f41987zoijcleaow.zoijcleaow(j13 - this.f41985ppxfxbqfkf.currentTimeMillis(), runnableC0985iobyxmoadg);
    }

    public void zoijcleaow(String str) {
        Runnable runnable = (Runnable) this.f41986wkgbmnqykc.remove(str);
        if (runnable != null) {
            this.f41987zoijcleaow.iobyxmoadg(runnable);
        }
    }
}
