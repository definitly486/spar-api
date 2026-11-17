package q8;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements ExecutorService {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static volatile int f78186jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final long f78187yggfygwlhe = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ExecutorService f78188zdlpuopuiu;

    public interface eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f78189iobyxmoadg = new C1744iobyxmoadg();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final eablkybsjg f78190ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final eablkybsjg f78191wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final eablkybsjg f78192zoijcleaow;

        /* JADX INFO: renamed from: q8.iobyxmoadg$eablkybsjg$iobyxmoadg, reason: collision with other inner class name */
        class C1744iobyxmoadg implements eablkybsjg {
            C1744iobyxmoadg() {
            }

            @Override // q8.iobyxmoadg.eablkybsjg
            public void iobyxmoadg(Throwable th2) {
            }
        }

        class ppxfxbqfkf implements eablkybsjg {
            ppxfxbqfkf() {
            }

            @Override // q8.iobyxmoadg.eablkybsjg
            public void iobyxmoadg(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        class zoijcleaow implements eablkybsjg {
            zoijcleaow() {
            }

            @Override // q8.iobyxmoadg.eablkybsjg
            public void iobyxmoadg(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        static {
            zoijcleaow zoijcleaowVar = new zoijcleaow();
            f78192zoijcleaow = zoijcleaowVar;
            f78190ppxfxbqfkf = new ppxfxbqfkf();
            f78191wkgbmnqykc = zoijcleaowVar;
        }

        void iobyxmoadg(Throwable th2);
    }

    private static final class ppxfxbqfkf implements ThreadFactory {

        /* JADX INFO: renamed from: q8.iobyxmoadg$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
        class C1746iobyxmoadg extends Thread {
            C1746iobyxmoadg(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private ppxfxbqfkf() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C1746iobyxmoadg(runnable);
        }
    }

    private static final class wkgbmnqykc implements ThreadFactory {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final AtomicInteger f78194eablkybsjg = new AtomicInteger();

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ThreadFactory f78195iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final eablkybsjg f78196ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final boolean f78197wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f78198zoijcleaow;

        /* JADX INFO: renamed from: q8.iobyxmoadg$wkgbmnqykc$iobyxmoadg, reason: collision with other inner class name */
        class RunnableC1747iobyxmoadg implements Runnable {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ Runnable f78200zdlpuopuiu;

            RunnableC1747iobyxmoadg(Runnable runnable) {
                this.f78200zdlpuopuiu = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (wkgbmnqykc.this.f78197wkgbmnqykc) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f78200zdlpuopuiu.run();
                } catch (Throwable th2) {
                    wkgbmnqykc.this.f78196ppxfxbqfkf.iobyxmoadg(th2);
                }
            }
        }

        wkgbmnqykc(ThreadFactory threadFactory, String str, eablkybsjg eablkybsjgVar, boolean z13) {
            this.f78195iobyxmoadg = threadFactory;
            this.f78198zoijcleaow = str;
            this.f78196ppxfxbqfkf = eablkybsjgVar;
            this.f78197wkgbmnqykc = z13;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f78195iobyxmoadg.newThread(new RunnableC1747iobyxmoadg(runnable));
            threadNewThread.setName("glide-" + this.f78198zoijcleaow + "-thread-" + this.f78194eablkybsjg.getAndIncrement());
            return threadNewThread;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private String f78202gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f78203iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private long f78204lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f78205ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f78207zoijcleaow;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private ThreadFactory f78206wkgbmnqykc = new ppxfxbqfkf();

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private eablkybsjg f78201eablkybsjg = eablkybsjg.f78191wkgbmnqykc;

        zoijcleaow(boolean z13) {
            this.f78203iobyxmoadg = z13;
        }

        public iobyxmoadg iobyxmoadg() {
            if (TextUtils.isEmpty(this.f78202gxszxtbevo)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f78202gxszxtbevo);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f78207zoijcleaow, this.f78205ppxfxbqfkf, this.f78204lqeggnwhkg, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new wkgbmnqykc(this.f78206wkgbmnqykc, this.f78202gxszxtbevo, this.f78201eablkybsjg, this.f78203iobyxmoadg));
            if (this.f78204lqeggnwhkg != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new iobyxmoadg(threadPoolExecutor);
        }

        public zoijcleaow ppxfxbqfkf(int i13) {
            this.f78207zoijcleaow = i13;
            this.f78205ppxfxbqfkf = i13;
            return this;
        }

        public zoijcleaow zoijcleaow(String str) {
            this.f78202gxszxtbevo = str;
            return this;
        }
    }

    iobyxmoadg(ExecutorService executorService) {
        this.f78188zdlpuopuiu = executorService;
    }

    public static zoijcleaow agtfadlqog() {
        return new zoijcleaow(false).ppxfxbqfkf(wkgbmnqykc()).zoijcleaow(AdRevenueConstants.SOURCE_KEY);
    }

    public static zoijcleaow btonecajqb() {
        return new zoijcleaow(true).ppxfxbqfkf(1).zoijcleaow("disk-cache");
    }

    public static iobyxmoadg draadjrbmk() {
        return btonecajqb().iobyxmoadg();
    }

    static int iobyxmoadg() {
        return wkgbmnqykc() >= 4 ? 2 : 1;
    }

    public static zoijcleaow lqeggnwhkg() {
        return new zoijcleaow(true).ppxfxbqfkf(iobyxmoadg()).zoijcleaow("animation");
    }

    public static iobyxmoadg nufgyqmvbu() {
        return lqeggnwhkg().iobyxmoadg();
    }

    public static iobyxmoadg ojitshcjhn() {
        return agtfadlqog().iobyxmoadg();
    }

    public static iobyxmoadg rgvfuqvkyq() {
        return new iobyxmoadg(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f78187yggfygwlhe, TimeUnit.MILLISECONDS, new SynchronousQueue(), new wkgbmnqykc(new ppxfxbqfkf(), "source-unlimited", eablkybsjg.f78191wkgbmnqykc, false)));
    }

    public static int wkgbmnqykc() {
        if (f78186jyumaefscl == 0) {
            f78186jyumaefscl = Math.min(4, q8.zoijcleaow.iobyxmoadg());
        }
        return f78186jyumaefscl;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j13, TimeUnit timeUnit) {
        return this.f78188zdlpuopuiu.awaitTermination(j13, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f78188zdlpuopuiu.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f78188zdlpuopuiu.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f78188zdlpuopuiu.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f78188zdlpuopuiu.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f78188zdlpuopuiu.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f78188zdlpuopuiu.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f78188zdlpuopuiu.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f78188zdlpuopuiu.submit(runnable);
    }

    public String toString() {
        return this.f78188zdlpuopuiu.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j13, TimeUnit timeUnit) {
        return this.f78188zdlpuopuiu.invokeAll(collection, j13, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j13, TimeUnit timeUnit) {
        return this.f78188zdlpuopuiu.invokeAny(collection, j13, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f78188zdlpuopuiu.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f78188zdlpuopuiu.submit(callable);
    }
}
