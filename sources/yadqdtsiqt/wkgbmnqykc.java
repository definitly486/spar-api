package yadqdtsiqt;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc implements Executor {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static volatile Executor f124321yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ExecutorService f124322zdlpuopuiu = Executors.newSingleThreadExecutor(new iobyxmoadg());

    class iobyxmoadg implements ThreadFactory {
        iobyxmoadg() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    wkgbmnqykc() {
    }

    static Executor iobyxmoadg() {
        if (f124321yggfygwlhe != null) {
            return f124321yggfygwlhe;
        }
        synchronized (wkgbmnqykc.class) {
            try {
                if (f124321yggfygwlhe == null) {
                    f124321yggfygwlhe = new wkgbmnqykc();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f124321yggfygwlhe;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f124322zdlpuopuiu.execute(runnable);
    }
}
