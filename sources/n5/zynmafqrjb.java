package n5;

import gg.wwaezpbzkn;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zynmafqrjb implements Executor {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f68945iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Runnable f68946jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ArrayDeque f68947yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Executor f68948zdlpuopuiu;

    public zynmafqrjb(Executor executor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(executor, "executor");
        this.f68948zdlpuopuiu = executor;
        this.f68947yggfygwlhe = new ArrayDeque();
        this.f68945iwizpuwonk = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zoijcleaow(Runnable command, zynmafqrjb this$0) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(command, "$command");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.ppxfxbqfkf();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(command, "command");
        synchronized (this.f68945iwizpuwonk) {
            try {
                this.f68947yggfygwlhe.offer(new Runnable() { // from class: n5.pmvmpeiblj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zynmafqrjb.zoijcleaow(command, this);
                    }
                });
                if (this.f68946jyumaefscl == null) {
                    ppxfxbqfkf();
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void ppxfxbqfkf() {
        synchronized (this.f68945iwizpuwonk) {
            try {
                Object objPoll = this.f68947yggfygwlhe.poll();
                Runnable runnable = (Runnable) objPoll;
                this.f68946jyumaefscl = runnable;
                if (objPoll != null) {
                    this.f68948zdlpuopuiu.execute(runnable);
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
