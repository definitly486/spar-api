package iozdgvuglv;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
abstract class draadjrbmk implements com.google.common.util.concurrent.wkgbmnqykc {

    static class iobyxmoadg extends draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Throwable f49103zdlpuopuiu;

        iobyxmoadg(Throwable th2) {
            this.f49103zdlpuopuiu = th2;
        }

        @Override // iozdgvuglv.draadjrbmk, java.util.concurrent.Future
        public Object get() throws ExecutionException {
            throw new ExecutionException(this.f49103zdlpuopuiu);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f49103zdlpuopuiu + "]]";
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        static final draadjrbmk f49104yggfygwlhe = new ppxfxbqfkf(null);

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Object f49105zdlpuopuiu;

        ppxfxbqfkf(Object obj) {
            this.f49105zdlpuopuiu = obj;
        }

        @Override // iozdgvuglv.draadjrbmk, java.util.concurrent.Future
        public Object get() {
            return this.f49105zdlpuopuiu;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f49105zdlpuopuiu + "]]";
        }
    }

    static final class zoijcleaow extends iobyxmoadg implements ScheduledFuture {
        zoijcleaow(Throwable th2) {
            super(th2);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }
    }

    draadjrbmk() {
    }

    public static com.google.common.util.concurrent.wkgbmnqykc zoijcleaow() {
        return ppxfxbqfkf.f49104yggfygwlhe;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z13) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract Object get();

    @Override // java.util.concurrent.Future
    public Object get(long j13, TimeUnit timeUnit) {
        u1.nufgyqmvbu.gxszxtbevo(timeUnit);
        return get();
    }

    @Override // com.google.common.util.concurrent.wkgbmnqykc
    public void iobyxmoadg(Runnable runnable, Executor executor) {
        u1.nufgyqmvbu.gxszxtbevo(runnable);
        u1.nufgyqmvbu.gxszxtbevo(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e13) {
            sopmlzcsov.wkgbmnqykc("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e13);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
