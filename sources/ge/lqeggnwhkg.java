package ge;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static lqeggnwhkg f36923ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Object f36924zoijcleaow = new Object();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Handler f36925iobyxmoadg;

    private lqeggnwhkg(Looper looper) {
        this.f36925iobyxmoadg = new zza(looper);
    }

    public static lqeggnwhkg iobyxmoadg() {
        lqeggnwhkg lqeggnwhkgVar;
        synchronized (f36924zoijcleaow) {
            try {
                if (f36923ppxfxbqfkf == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f36923ppxfxbqfkf = new lqeggnwhkg(handlerThread.getLooper());
                }
                lqeggnwhkgVar = f36923ppxfxbqfkf;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lqeggnwhkgVar;
    }

    public static Executor wkgbmnqykc() {
        return yggfygwlhe.f36968zdlpuopuiu;
    }

    public void ppxfxbqfkf(Runnable runnable) {
        wkgbmnqykc().execute(runnable);
    }

    public Task zoijcleaow(final Callable callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ppxfxbqfkf(new Runnable() { // from class: ge.zdlpuopuiu
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (MlKitException e13) {
                    taskCompletionSource2.setException(e13);
                } catch (Exception e14) {
                    taskCompletionSource2.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e14));
                }
            }
        });
        return taskCompletionSource.getTask();
    }
}
