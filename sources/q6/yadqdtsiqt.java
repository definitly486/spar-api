package q6;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class yadqdtsiqt implements r6.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Runnable f77976jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Executor f77977yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ArrayDeque f77978zdlpuopuiu = new ArrayDeque();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final Object f77975iwizpuwonk = new Object();

    static class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final Runnable f77979yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final yadqdtsiqt f77980zdlpuopuiu;

        iobyxmoadg(yadqdtsiqt yadqdtsiqtVar, Runnable runnable) {
            this.f77980zdlpuopuiu = yadqdtsiqtVar;
            this.f77979yggfygwlhe = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f77979yggfygwlhe.run();
                synchronized (this.f77980zdlpuopuiu.f77975iwizpuwonk) {
                    this.f77980zdlpuopuiu.iobyxmoadg();
                }
            } catch (Throwable th2) {
                synchronized (this.f77980zdlpuopuiu.f77975iwizpuwonk) {
                    this.f77980zdlpuopuiu.iobyxmoadg();
                    throw th2;
                }
            }
        }
    }

    public yadqdtsiqt(Executor executor) {
        this.f77977yggfygwlhe = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f77975iwizpuwonk) {
            try {
                this.f77978zdlpuopuiu.add(new iobyxmoadg(this, runnable));
                if (this.f77976jyumaefscl == null) {
                    iobyxmoadg();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void iobyxmoadg() {
        Runnable runnable = (Runnable) this.f77978zdlpuopuiu.poll();
        this.f77976jyumaefscl = runnable;
        if (runnable != null) {
            this.f77977yggfygwlhe.execute(runnable);
        }
    }

    @Override // r6.iobyxmoadg
    public boolean zynmafqrjb() {
        boolean z13;
        synchronized (this.f77975iwizpuwonk) {
            z13 = !this.f77978zdlpuopuiu.isEmpty();
        }
        return z13;
    }
}
