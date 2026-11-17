package t6;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class nuxfzjnpeb implements weqkydbzbr {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Runnable f109846eablkybsjg = new iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private ScheduledExecutorService f109847iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Runnable f109848ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f109849wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Runnable f109850zoijcleaow;

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (nuxfzjnpeb.this.f109849wkgbmnqykc <= 0 || System.currentTimeMillis() <= nuxfzjnpeb.this.f109849wkgbmnqykc) {
                if (nuxfzjnpeb.this.f109850zoijcleaow != null) {
                    nuxfzjnpeb.this.f109850zoijcleaow.run();
                }
            } else {
                if (nuxfzjnpeb.this.f109848ppxfxbqfkf != null) {
                    nuxfzjnpeb.this.f109848ppxfxbqfkf.run();
                }
                nuxfzjnpeb.this.iobyxmoadg();
            }
        }
    }

    private void lqeggnwhkg(Runnable runnable, long j13, long j14, long j15, Runnable runnable2) {
        iobyxmoadg();
        this.f109850zoijcleaow = runnable;
        this.f109848ppxfxbqfkf = runnable2;
        if (j15 > 0) {
            this.f109849wkgbmnqykc = System.currentTimeMillis() + j15;
        }
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f109847iobyxmoadg = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(this.f109846eablkybsjg, j13, j14, TimeUnit.MILLISECONDS);
    }

    @Override // t6.weqkydbzbr
    public synchronized void iobyxmoadg() {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f109847iobyxmoadg;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.f109847iobyxmoadg = null;
            }
            this.f109850zoijcleaow = null;
            this.f109848ppxfxbqfkf = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // t6.weqkydbzbr
    public void ppxfxbqfkf(Runnable runnable, long j13, long j14, Runnable runnable2) {
        lqeggnwhkg(runnable, 0L, j13, j14, runnable2);
    }

    @Override // t6.weqkydbzbr
    public void zoijcleaow(Runnable runnable, long j13, long j14) {
        lqeggnwhkg(runnable, 0L, j13, j14, null);
    }
}
