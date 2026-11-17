package wa;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ojitshcjhn implements Runnable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final TaskCompletionSource f119137zdlpuopuiu;

    ojitshcjhn() {
        this.f119137zdlpuopuiu = null;
    }

    public void iobyxmoadg(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f119137zdlpuopuiu;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    final TaskCompletionSource ppxfxbqfkf() {
        return this.f119137zdlpuopuiu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zoijcleaow();
        } catch (Exception e13) {
            iobyxmoadg(e13);
        }
    }

    protected abstract void zoijcleaow();

    public ojitshcjhn(TaskCompletionSource taskCompletionSource) {
        this.f119137zdlpuopuiu = taskCompletionSource;
    }
}
