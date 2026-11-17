package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static Handler f9605cqumvgiudr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private volatile eablkybsjg f9608yggfygwlhe = eablkybsjg.PENDING;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final AtomicBoolean f9607jyumaefscl = new AtomicBoolean();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final AtomicBoolean f9606iwizpuwonk = new AtomicBoolean();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final FutureTask f9609zdlpuopuiu = new zoijcleaow(new iobyxmoadg());

    public enum eablkybsjg {
        PENDING,
        RUNNING,
        FINISHED
    }

    class iobyxmoadg implements Callable {
        iobyxmoadg() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            ppxfxbqfkf.this.f9606iwizpuwonk.set(true);
            Object objZoijcleaow = null;
            try {
                Process.setThreadPriority(10);
                objZoijcleaow = ppxfxbqfkf.this.zoijcleaow();
                Binder.flushPendingCommands();
                ppxfxbqfkf.this.dxjokdxxww(objZoijcleaow);
                return objZoijcleaow;
            } catch (Throwable th2) {
                try {
                    ppxfxbqfkf.this.f9607jyumaefscl.set(true);
                    throw th2;
                } catch (Throwable th3) {
                    ppxfxbqfkf.this.dxjokdxxww(objZoijcleaow);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    class RunnableC0156ppxfxbqfkf implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Object f9616zdlpuopuiu;

        RunnableC0156ppxfxbqfkf(Object obj) {
            this.f9616zdlpuopuiu = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            ppxfxbqfkf.this.wkgbmnqykc(this.f9616zdlpuopuiu);
        }
    }

    static /* synthetic */ class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f9617iobyxmoadg;

        static {
            int[] iArr = new int[eablkybsjg.values().length];
            f9617iobyxmoadg = iArr;
            try {
                iArr[eablkybsjg.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9617iobyxmoadg[eablkybsjg.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class zoijcleaow extends FutureTask {
        zoijcleaow(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                ppxfxbqfkf.this.btonecajqb(get());
            } catch (InterruptedException e13) {
                Log.w("AsyncTask", e13);
            } catch (CancellationException unused) {
                ppxfxbqfkf.this.btonecajqb(null);
            } catch (ExecutionException e14) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e14.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    ppxfxbqfkf() {
    }

    private static Handler eablkybsjg() {
        Handler handler;
        synchronized (ppxfxbqfkf.class) {
            try {
                if (f9605cqumvgiudr == null) {
                    f9605cqumvgiudr = new Handler(Looper.getMainLooper());
                }
                handler = f9605cqumvgiudr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    void btonecajqb(Object obj) {
        if (this.f9606iwizpuwonk.get()) {
            return;
        }
        dxjokdxxww(obj);
    }

    void dxjokdxxww(Object obj) {
        eablkybsjg().post(new RunnableC0156ppxfxbqfkf(obj));
    }

    public final boolean gxszxtbevo() {
        return this.f9607jyumaefscl.get();
    }

    public final boolean iobyxmoadg(boolean z13) {
        this.f9607jyumaefscl.set(true);
        return this.f9609zdlpuopuiu.cancel(z13);
    }

    protected abstract void lqeggnwhkg(Object obj);

    protected abstract void nufgyqmvbu(Object obj);

    public final void ppxfxbqfkf(Executor executor) {
        if (this.f9608yggfygwlhe == eablkybsjg.PENDING) {
            this.f9608yggfygwlhe = eablkybsjg.RUNNING;
            executor.execute(this.f9609zdlpuopuiu);
            return;
        }
        int i13 = wkgbmnqykc.f9617iobyxmoadg[this.f9608yggfygwlhe.ordinal()];
        if (i13 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i13 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    void wkgbmnqykc(Object obj) {
        if (gxszxtbevo()) {
            lqeggnwhkg(obj);
        } else {
            nufgyqmvbu(obj);
        }
        this.f9608yggfygwlhe = eablkybsjg.FINISHED;
    }

    protected abstract Object zoijcleaow();
}
