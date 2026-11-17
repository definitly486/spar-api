package wflxmlrfwp;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc extends eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private volatile Handler f119563ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f119562iobyxmoadg = new Object();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ExecutorService f119564zoijcleaow = Executors.newFixedThreadPool(4, new iobyxmoadg());

    class iobyxmoadg implements ThreadFactory {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AtomicInteger f119565iobyxmoadg = new AtomicInteger(0);

        iobyxmoadg() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f119565iobyxmoadg.getAndIncrement());
            return thread;
        }
    }

    private static class zoijcleaow {
        public static Handler iobyxmoadg(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler eablkybsjg(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return zoijcleaow.iobyxmoadg(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // wflxmlrfwp.eablkybsjg
    public void iobyxmoadg(Runnable runnable) {
        this.f119564zoijcleaow.execute(runnable);
    }

    @Override // wflxmlrfwp.eablkybsjg
    public boolean ppxfxbqfkf() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // wflxmlrfwp.eablkybsjg
    public void wkgbmnqykc(Runnable runnable) {
        if (this.f119563ppxfxbqfkf == null) {
            synchronized (this.f119562iobyxmoadg) {
                try {
                    if (this.f119563ppxfxbqfkf == null) {
                        this.f119563ppxfxbqfkf = eablkybsjg(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f119563ppxfxbqfkf.post(runnable);
    }
}
