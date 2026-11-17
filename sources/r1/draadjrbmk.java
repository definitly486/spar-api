package r1;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
abstract class draadjrbmk {

    private static class iobyxmoadg implements ThreadFactory {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f81413iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f81414zoijcleaow;

        /* JADX INFO: renamed from: r1.draadjrbmk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static class C1816iobyxmoadg extends Thread {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private final int f81415zdlpuopuiu;

            C1816iobyxmoadg(Runnable runnable, String str, int i13) {
                super(runnable, str);
                this.f81415zdlpuopuiu = i13;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f81415zdlpuopuiu);
                super.run();
            }
        }

        iobyxmoadg(String str, int i13) {
            this.f81413iobyxmoadg = str;
            this.f81414zoijcleaow = i13;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C1816iobyxmoadg(runnable, this.f81413iobyxmoadg, this.f81414zoijcleaow);
        }
    }

    private static class ppxfxbqfkf implements Runnable {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private Handler f81416jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private u1.iobyxmoadg f81417yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private Callable f81418zdlpuopuiu;

        class iobyxmoadg implements Runnable {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ Object f81420yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ u1.iobyxmoadg f81421zdlpuopuiu;

            iobyxmoadg(u1.iobyxmoadg iobyxmoadgVar, Object obj) {
                this.f81421zdlpuopuiu = iobyxmoadgVar;
                this.f81420yggfygwlhe = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f81421zdlpuopuiu.accept(this.f81420yggfygwlhe);
            }
        }

        ppxfxbqfkf(Handler handler, Callable callable, u1.iobyxmoadg iobyxmoadgVar) {
            this.f81418zdlpuopuiu = callable;
            this.f81417yggfygwlhe = iobyxmoadgVar;
            this.f81416jyumaefscl = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f81418zdlpuopuiu.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f81416jyumaefscl.post(new iobyxmoadg(this.f81417yggfygwlhe, objCall));
        }
    }

    private static class zoijcleaow implements Executor {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Handler f81422zdlpuopuiu;

        zoijcleaow(Handler handler) {
            this.f81422zdlpuopuiu = (Handler) u1.nufgyqmvbu.gxszxtbevo(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f81422zdlpuopuiu.post((Runnable) u1.nufgyqmvbu.gxszxtbevo(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f81422zdlpuopuiu + " is shutting down");
        }
    }

    static ThreadPoolExecutor iobyxmoadg(String str, int i13, int i14) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i14, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new iobyxmoadg(str, i13));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static void ppxfxbqfkf(Executor executor, Callable callable, u1.iobyxmoadg iobyxmoadgVar) {
        executor.execute(new ppxfxbqfkf(r1.zoijcleaow.iobyxmoadg(), callable, iobyxmoadgVar));
    }

    static Object wkgbmnqykc(ExecutorService executorService, Callable callable, int i13) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i13, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e13) {
            throw e13;
        } catch (ExecutionException e14) {
            throw new RuntimeException(e14);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    static Executor zoijcleaow(Handler handler) {
        return new zoijcleaow(handler);
    }
}
