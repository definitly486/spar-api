package i6;

import g6.wwaezpbzkn;
import h6.esjtqupxsv;
import h6.hcddaimhww;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f41992eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wwaezpbzkn f41993iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f41994ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Object f41995wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final hcddaimhww f41996zoijcleaow;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(wwaezpbzkn runnableScheduler, hcddaimhww launcher) {
        this(runnableScheduler, launcher, 0L, 4, null);
        zdlpuopuiu.btonecajqb(runnableScheduler, "runnableScheduler");
        zdlpuopuiu.btonecajqb(launcher, "launcher");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, esjtqupxsv esjtqupxsvVar) {
        wkgbmnqykcVar.f41996zoijcleaow.iobyxmoadg(esjtqupxsvVar, 3);
    }

    public final void ppxfxbqfkf(final esjtqupxsv token) {
        zdlpuopuiu.btonecajqb(token, "token");
        Runnable runnable = new Runnable() { // from class: i6.ppxfxbqfkf
            @Override // java.lang.Runnable
            public final void run() {
                wkgbmnqykc.wkgbmnqykc(this.f41991zdlpuopuiu, token);
            }
        };
        synchronized (this.f41995wkgbmnqykc) {
        }
        this.f41993iobyxmoadg.zoijcleaow(this.f41994ppxfxbqfkf, runnable);
    }

    public final void zoijcleaow(esjtqupxsv token) {
        Runnable runnable;
        zdlpuopuiu.btonecajqb(token, "token");
        synchronized (this.f41995wkgbmnqykc) {
            runnable = (Runnable) this.f41992eablkybsjg.remove(token);
        }
        if (runnable != null) {
            this.f41993iobyxmoadg.iobyxmoadg(runnable);
        }
    }

    public wkgbmnqykc(wwaezpbzkn runnableScheduler, hcddaimhww launcher, long j13) {
        zdlpuopuiu.btonecajqb(runnableScheduler, "runnableScheduler");
        zdlpuopuiu.btonecajqb(launcher, "launcher");
        this.f41993iobyxmoadg = runnableScheduler;
        this.f41996zoijcleaow = launcher;
        this.f41994ppxfxbqfkf = j13;
        this.f41995wkgbmnqykc = new Object();
        this.f41992eablkybsjg = new LinkedHashMap();
    }

    public /* synthetic */ wkgbmnqykc(wwaezpbzkn wwaezpbzknVar, hcddaimhww hcddaimhwwVar, long j13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(wwaezpbzknVar, hcddaimhwwVar, (i13 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j13);
    }
}
