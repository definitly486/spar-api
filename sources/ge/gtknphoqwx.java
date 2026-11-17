package ge;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final ojitshcjhn f36907iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final AtomicBoolean f36908ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicInteger f36909zoijcleaow;

    public gtknphoqwx() {
        this.f36909zoijcleaow = new AtomicInteger(0);
        this.f36908ppxfxbqfkf = new AtomicBoolean(false);
        this.f36907iobyxmoadg = new ojitshcjhn();
    }

    public void eablkybsjg(Executor executor) {
        gxszxtbevo(executor);
    }

    public Task gxszxtbevo(Executor executor) {
        Preconditions.checkState(this.f36909zoijcleaow.get() > 0);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f36907iobyxmoadg.iobyxmoadg(executor, new Runnable() { // from class: ge.esjtqupxsv
            @Override // java.lang.Runnable
            public final void run() {
                this.f36906zdlpuopuiu.nufgyqmvbu(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public Task iobyxmoadg(final Executor executor, final Callable callable, final CancellationToken cancellationToken) {
        Preconditions.checkState(this.f36909zoijcleaow.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f36907iobyxmoadg.iobyxmoadg(new Executor() { // from class: ge.lereixgezr
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e13) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e13);
                    }
                    throw e13;
                }
            }
        }, new Runnable() { // from class: ge.pmvmpeiblj
            @Override // java.lang.Runnable
            public final void run() {
                this.f36934zdlpuopuiu.lqeggnwhkg(cancellationToken, cancellationTokenSource, callable, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ void lqeggnwhkg(CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        try {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
                return;
            }
            try {
                if (!this.f36908ppxfxbqfkf.get()) {
                    zoijcleaow();
                    this.f36908ppxfxbqfkf.set(true);
                }
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                    return;
                }
                Object objCall = callable.call();
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                } else {
                    taskCompletionSource.setResult(objCall);
                }
            } catch (RuntimeException e13) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e13);
            }
        } catch (Exception e14) {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
            } else {
                taskCompletionSource.setException(e14);
            }
        }
    }

    final /* synthetic */ void nufgyqmvbu(TaskCompletionSource taskCompletionSource) {
        int iDecrementAndGet = this.f36909zoijcleaow.decrementAndGet();
        Preconditions.checkState(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            wkgbmnqykc();
            this.f36908ppxfxbqfkf.set(false);
        }
        zzrr.zza();
        taskCompletionSource.setResult(null);
    }

    public void ppxfxbqfkf() {
        this.f36909zoijcleaow.incrementAndGet();
    }

    protected abstract void wkgbmnqykc();

    public abstract void zoijcleaow();

    protected gtknphoqwx(ojitshcjhn ojitshcjhnVar) {
        this.f36909zoijcleaow = new AtomicInteger(0);
        this.f36908ppxfxbqfkf = new AtomicBoolean(false);
        this.f36907iobyxmoadg = ojitshcjhnVar;
    }
}
