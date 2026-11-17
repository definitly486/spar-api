package q6;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class cllcsxoeiz {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String f77917eablkybsjg = g6.yggfygwlhe.dxjokdxxww("WorkTimer");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final g6.wwaezpbzkn f77918iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final Map f77921zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final Map f77919ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final Object f77920wkgbmnqykc = new Object();

    public interface iobyxmoadg {
        void iobyxmoadg(p6.wflxmlrfwp wflxmlrfwpVar);
    }

    public static class zoijcleaow implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final p6.wflxmlrfwp f77922yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final cllcsxoeiz f77923zdlpuopuiu;

        zoijcleaow(cllcsxoeiz cllcsxoeizVar, p6.wflxmlrfwp wflxmlrfwpVar) {
            this.f77923zdlpuopuiu = cllcsxoeizVar;
            this.f77922yggfygwlhe = wflxmlrfwpVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f77923zdlpuopuiu.f77920wkgbmnqykc) {
                try {
                    if (((zoijcleaow) this.f77923zdlpuopuiu.f77921zoijcleaow.remove(this.f77922yggfygwlhe)) != null) {
                        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f77923zdlpuopuiu.f77919ppxfxbqfkf.remove(this.f77922yggfygwlhe);
                        if (iobyxmoadgVar != null) {
                            iobyxmoadgVar.iobyxmoadg(this.f77922yggfygwlhe);
                        }
                    } else {
                        g6.yggfygwlhe.eablkybsjg().iobyxmoadg("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f77922yggfygwlhe));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public cllcsxoeiz(g6.wwaezpbzkn wwaezpbzknVar) {
        this.f77918iobyxmoadg = wwaezpbzknVar;
    }

    public void iobyxmoadg(p6.wflxmlrfwp wflxmlrfwpVar, long j13, iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f77920wkgbmnqykc) {
            g6.yggfygwlhe.eablkybsjg().iobyxmoadg(f77917eablkybsjg, "Starting timer for " + wflxmlrfwpVar);
            zoijcleaow(wflxmlrfwpVar);
            zoijcleaow zoijcleaowVar = new zoijcleaow(this, wflxmlrfwpVar);
            this.f77921zoijcleaow.put(wflxmlrfwpVar, zoijcleaowVar);
            this.f77919ppxfxbqfkf.put(wflxmlrfwpVar, iobyxmoadgVar);
            this.f77918iobyxmoadg.zoijcleaow(j13, zoijcleaowVar);
        }
    }

    public void zoijcleaow(p6.wflxmlrfwp wflxmlrfwpVar) {
        synchronized (this.f77920wkgbmnqykc) {
            try {
                if (((zoijcleaow) this.f77921zoijcleaow.remove(wflxmlrfwpVar)) != null) {
                    g6.yggfygwlhe.eablkybsjg().iobyxmoadg(f77917eablkybsjg, "Stopping timer for " + wflxmlrfwpVar);
                    this.f77919ppxfxbqfkf.remove(wflxmlrfwpVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
