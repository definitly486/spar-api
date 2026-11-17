package yadqdtsiqt;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow implements Executor {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static volatile zoijcleaow f124324zdlpuopuiu;

    zoijcleaow() {
    }

    static Executor iobyxmoadg() {
        if (f124324zdlpuopuiu != null) {
            return f124324zdlpuopuiu;
        }
        synchronized (zoijcleaow.class) {
            try {
                if (f124324zdlpuopuiu == null) {
                    f124324zdlpuopuiu = new zoijcleaow();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f124324zdlpuopuiu;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
