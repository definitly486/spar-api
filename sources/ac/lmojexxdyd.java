package ac;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lmojexxdyd {

    class iobyxmoadg implements ThreadFactory {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f1379iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ AtomicLong f1380zoijcleaow;

        /* JADX INFO: renamed from: ac.lmojexxdyd$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C0027iobyxmoadg extends eablkybsjg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ Runnable f1382zdlpuopuiu;

            C0027iobyxmoadg(Runnable runnable) {
                this.f1382zdlpuopuiu = runnable;
            }

            @Override // ac.eablkybsjg
            public void iobyxmoadg() {
                this.f1382zdlpuopuiu.run();
            }
        }

        iobyxmoadg(String str, AtomicLong atomicLong) {
            this.f1379iobyxmoadg = str;
            this.f1380zoijcleaow = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0027iobyxmoadg(runnable));
            threadNewThread.setName(this.f1379iobyxmoadg + this.f1380zoijcleaow.getAndIncrement());
            return threadNewThread;
        }
    }

    class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ TimeUnit f1383iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ long f1384jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ExecutorService f1385yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ String f1386zdlpuopuiu;

        zoijcleaow(String str, ExecutorService executorService, long j13, TimeUnit timeUnit) {
            this.f1386zdlpuopuiu = str;
            this.f1385yggfygwlhe = executorService;
            this.f1384jyumaefscl = j13;
            this.f1383iwizpuwonk = timeUnit;
        }

        @Override // ac.eablkybsjg
        public void iobyxmoadg() {
            try {
                xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Executing shutdown hook for " + this.f1386zdlpuopuiu);
                this.f1385yggfygwlhe.shutdown();
                if (this.f1385yggfygwlhe.awaitTermination(this.f1384jyumaefscl, this.f1383iwizpuwonk)) {
                    return;
                }
                xb.lqeggnwhkg.gxszxtbevo().zoijcleaow(this.f1386zdlpuopuiu + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f1385yggfygwlhe.shutdownNow();
            } catch (InterruptedException unused) {
                xb.lqeggnwhkg.gxszxtbevo().zoijcleaow(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f1386zdlpuopuiu));
                this.f1385yggfygwlhe.shutdownNow();
            }
        }
    }

    private static ExecutorService eablkybsjg(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    private static void iobyxmoadg(String str, ExecutorService executorService) {
        zoijcleaow(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static ExecutorService ppxfxbqfkf(String str) {
        ExecutorService executorServiceEablkybsjg = eablkybsjg(wkgbmnqykc(str), new ThreadPoolExecutor.DiscardPolicy());
        iobyxmoadg(str, executorServiceEablkybsjg);
        return executorServiceEablkybsjg;
    }

    public static ThreadFactory wkgbmnqykc(String str) {
        return new iobyxmoadg(str, new AtomicLong(1L));
    }

    private static void zoijcleaow(String str, ExecutorService executorService, long j13, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new zoijcleaow(str, executorService, j13, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }
}
