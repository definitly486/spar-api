package lereixgezr;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class draadjrbmk implements Executor {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final ThreadFactory f62264jyumaefscl = new iobyxmoadg();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f62266zdlpuopuiu = new Object();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ThreadPoolExecutor f62265yggfygwlhe = zoijcleaow();

    class iobyxmoadg implements ThreadFactory {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AtomicInteger f62267iobyxmoadg = new AtomicInteger(0);

        iobyxmoadg() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f62267iobyxmoadg.getAndIncrement())));
            return thread;
        }
    }

    private static ThreadPoolExecutor zoijcleaow() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f62264jyumaefscl);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: lereixgezr.gtknphoqwx
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                sopmlzcsov.ppxfxbqfkf("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        u1.nufgyqmvbu.gxszxtbevo(runnable);
        synchronized (this.f62266zdlpuopuiu) {
            this.f62265yggfygwlhe.execute(runnable);
        }
    }

    void ppxfxbqfkf(istkbnxepw.yggfygwlhe yggfygwlheVar) {
        ThreadPoolExecutor threadPoolExecutor;
        u1.nufgyqmvbu.gxszxtbevo(yggfygwlheVar);
        synchronized (this.f62266zdlpuopuiu) {
            try {
                if (this.f62265yggfygwlhe.isShutdown()) {
                    this.f62265yggfygwlhe = zoijcleaow();
                }
                threadPoolExecutor = this.f62265yggfygwlhe;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iMax = Math.max(1, yggfygwlheVar.zoijcleaow().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }
}
