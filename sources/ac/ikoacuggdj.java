package ac;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ikoacuggdj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ExecutorService f1358iobyxmoadg = lmojexxdyd.ppxfxbqfkf("awaitEvenIfOnMainThread task continuation executor");

    public static boolean ppxfxbqfkf(CountDownLatch countDownLatch, long j13, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z13 = false;
        try {
            long nanos = timeUnit.toNanos(j13);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z13 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z13) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th2) {
            if (z13) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object wkgbmnqykc(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    public static Object zoijcleaow(Task task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f1358iobyxmoadg, new Continuation() { // from class: ac.jhduphickx
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return ikoacuggdj.wkgbmnqykc(countDownLatch, task2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }
}
