package yadqdtsiqt;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import iozdgvuglv.gtknphoqwx;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static ThreadLocal f124309yggfygwlhe = new iobyxmoadg();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Handler f124310zdlpuopuiu;

    class iobyxmoadg extends ThreadLocal {
        iobyxmoadg() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return yadqdtsiqt.iobyxmoadg.wkgbmnqykc();
            }
            if (Looper.myLooper() != null) {
                return new ppxfxbqfkf(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: yadqdtsiqt.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private static class RunnableScheduledFutureC3143ppxfxbqfkf implements RunnableScheduledFuture {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final com.google.common.util.concurrent.wkgbmnqykc f124311iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final Callable f124312jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final long f124313yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final AtomicReference f124314zdlpuopuiu = new AtomicReference(null);

        /* JADX INFO: renamed from: yadqdtsiqt.ppxfxbqfkf$ppxfxbqfkf$iobyxmoadg */
        class iobyxmoadg implements androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ Handler f124315iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ Callable f124317zoijcleaow;

            /* JADX INFO: renamed from: yadqdtsiqt.ppxfxbqfkf$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            class RunnableC3144iobyxmoadg implements Runnable {
                RunnableC3144iobyxmoadg() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC3143ppxfxbqfkf.this.f124314zdlpuopuiu.getAndSet(null) != null) {
                        iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                        iobyxmoadgVar.f124315iobyxmoadg.removeCallbacks(RunnableScheduledFutureC3143ppxfxbqfkf.this);
                    }
                }
            }

            iobyxmoadg(Handler handler, Callable callable) {
                this.f124315iobyxmoadg = handler;
                this.f124317zoijcleaow = callable;
            }

            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                iobyxmoadgVar.iobyxmoadg(new RunnableC3144iobyxmoadg(), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
                RunnableScheduledFutureC3143ppxfxbqfkf.this.f124314zdlpuopuiu.set(iobyxmoadgVar);
                return "HandlerScheduledFuture-" + this.f124317zoijcleaow.toString();
            }
        }

        RunnableScheduledFutureC3143ppxfxbqfkf(Handler handler, long j13, Callable callable) {
            this.f124313yggfygwlhe = j13;
            this.f124312jyumaefscl = callable;
            this.f124311iwizpuwonk = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new iobyxmoadg(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z13) {
            return this.f124311iwizpuwonk.cancel(z13);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f124311iwizpuwonk.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f124313yggfygwlhe - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f124311iwizpuwonk.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f124311iwizpuwonk.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = (androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg) this.f124314zdlpuopuiu.getAndSet(null);
            if (iobyxmoadgVar != null) {
                try {
                    iobyxmoadgVar.ppxfxbqfkf(this.f124312jyumaefscl.call());
                } catch (Exception e13) {
                    iobyxmoadgVar.gxszxtbevo(e13);
                }
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public Object get(long j13, TimeUnit timeUnit) {
            return this.f124311iwizpuwonk.get(j13, timeUnit);
        }
    }

    class zoijcleaow implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Runnable f124319iobyxmoadg;

        zoijcleaow(Runnable runnable) {
            this.f124319iobyxmoadg = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f124319iobyxmoadg.run();
            return null;
        }
    }

    ppxfxbqfkf(Handler handler) {
        this.f124310zdlpuopuiu = handler;
    }

    private RejectedExecutionException iobyxmoadg() {
        return new RejectedExecutionException(this.f124310zdlpuopuiu + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j13, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ppxfxbqfkf.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f124310zdlpuopuiu.post(runnable)) {
            throw iobyxmoadg();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j13, TimeUnit timeUnit) {
        return schedule(new zoijcleaow(runnable), j13, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j13, long j14, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ppxfxbqfkf.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j13, long j14, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ppxfxbqfkf.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(ppxfxbqfkf.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException(ppxfxbqfkf.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j13, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j13, timeUnit);
        RunnableScheduledFutureC3143ppxfxbqfkf runnableScheduledFutureC3143ppxfxbqfkf = new RunnableScheduledFutureC3143ppxfxbqfkf(this.f124310zdlpuopuiu, jUptimeMillis, callable);
        return this.f124310zdlpuopuiu.postAtTime(runnableScheduledFutureC3143ppxfxbqfkf, jUptimeMillis) ? runnableScheduledFutureC3143ppxfxbqfkf : gtknphoqwx.gtknphoqwx(iobyxmoadg());
    }
}
