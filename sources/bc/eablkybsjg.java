package bc;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg implements Executor {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ExecutorService f15692zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f15691yggfygwlhe = new Object();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Task f15690jyumaefscl = Tasks.forResult(null);

    eablkybsjg(ExecutorService executorService) {
        this.f15692zdlpuopuiu = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task eablkybsjg(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task wkgbmnqykc(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.forResult(null);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f15692zdlpuopuiu.execute(runnable);
    }

    public Task gxszxtbevo(final Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f15691yggfygwlhe) {
            taskContinueWithTask = this.f15690jyumaefscl.continueWithTask(this.f15692zdlpuopuiu, new Continuation() { // from class: bc.wkgbmnqykc
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return eablkybsjg.wkgbmnqykc(runnable, task);
                }
            });
            this.f15690jyumaefscl = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public Task lqeggnwhkg(final Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.f15691yggfygwlhe) {
            taskContinueWithTask = this.f15690jyumaefscl.continueWithTask(this.f15692zdlpuopuiu, new Continuation() { // from class: bc.ppxfxbqfkf
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return eablkybsjg.eablkybsjg(callable, task);
                }
            });
            this.f15690jyumaefscl = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public ExecutorService ppxfxbqfkf() {
        return this.f15692zdlpuopuiu;
    }
}
