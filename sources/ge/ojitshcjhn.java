package ge;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f36926iobyxmoadg = new Object();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Queue f36927ppxfxbqfkf = new ArrayDeque();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final AtomicReference f36928wkgbmnqykc = new AtomicReference();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f36929zoijcleaow;

    private final void eablkybsjg(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: ge.lmojexxdyd
                @Override // java.lang.Runnable
                public final void run() {
                    hcddaimhww hcddaimhwwVar = new hcddaimhww(this.f36922zdlpuopuiu, null);
                    try {
                        runnable.run();
                        hcddaimhwwVar.close();
                    } catch (Throwable th2) {
                        try {
                            hcddaimhwwVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            wkgbmnqykc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wkgbmnqykc() {
        synchronized (this.f36926iobyxmoadg) {
            try {
                if (this.f36927ppxfxbqfkf.isEmpty()) {
                    this.f36929zoijcleaow = false;
                } else {
                    ylkuphrtab ylkuphrtabVar = (ylkuphrtab) this.f36927ppxfxbqfkf.remove();
                    eablkybsjg(ylkuphrtabVar.f36969iobyxmoadg, ylkuphrtabVar.f36970zoijcleaow);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void iobyxmoadg(Executor executor, Runnable runnable) {
        synchronized (this.f36926iobyxmoadg) {
            try {
                if (this.f36929zoijcleaow) {
                    this.f36927ppxfxbqfkf.add(new ylkuphrtab(executor, runnable, null));
                } else {
                    this.f36929zoijcleaow = true;
                    eablkybsjg(executor, runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
