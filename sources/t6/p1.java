package t6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public interface p1 {
    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void wflxmlrfwp(AtomicReference atomicReference, Callable callable, Semaphore semaphore) {
        try {
            atomicReference.set(callable.call());
        } catch (Exception unused) {
        }
        semaphore.release();
    }

    default Object vdvldrhtss(final Callable callable) {
        if (!zoijcleaow().ppxfxbqfkf()) {
            try {
                return callable.call();
            } catch (Exception unused) {
                return null;
            }
        }
        final Semaphore semaphore = new Semaphore(0);
        final AtomicReference atomicReference = new AtomicReference();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: t6.o1
            @Override // java.lang.Runnable
            public final void run() {
                p1.wflxmlrfwp(atomicReference, callable, semaphore);
            }
        });
        try {
            semaphore.acquire();
        } catch (InterruptedException unused2) {
        }
        return atomicReference.get();
    }

    pc2.iobyxmoadg zoijcleaow();
}
