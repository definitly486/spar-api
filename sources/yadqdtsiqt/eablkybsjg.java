package yadqdtsiqt;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg implements Executor {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static volatile Executor f124291yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ExecutorService f124292zdlpuopuiu = Executors.newFixedThreadPool(2, new iobyxmoadg());

    class iobyxmoadg implements ThreadFactory {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AtomicInteger f124293iobyxmoadg = new AtomicInteger(0);

        iobyxmoadg() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f124293iobyxmoadg.getAndIncrement())));
            return thread;
        }
    }

    eablkybsjg() {
    }

    static Executor iobyxmoadg() {
        if (f124291yggfygwlhe != null) {
            return f124291yggfygwlhe;
        }
        synchronized (eablkybsjg.class) {
            try {
                if (f124291yggfygwlhe == null) {
                    f124291yggfygwlhe = new eablkybsjg();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f124291yggfygwlhe;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f124292zdlpuopuiu.execute(runnable);
    }
}
