package q9;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
class agtfadlqog implements Executor {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Executor f78241zdlpuopuiu;

    static class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Runnable f78242zdlpuopuiu;

        iobyxmoadg(Runnable runnable) {
            this.f78242zdlpuopuiu = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f78242zdlpuopuiu.run();
            } catch (Exception e13) {
                u9.iobyxmoadg.ppxfxbqfkf("Executor", "Background execution failure.", e13);
            }
        }
    }

    agtfadlqog(Executor executor) {
        this.f78241zdlpuopuiu = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f78241zdlpuopuiu.execute(new iobyxmoadg(runnable));
    }
}
