package pj;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class tzroggbefp extends uwvvkdfqfp implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final tzroggbefp f76776pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final long f76777zynmafqrjb;

    static {
        Long l13;
        tzroggbefp tzroggbefpVar = new tzroggbefp();
        f76776pmvmpeiblj = tzroggbefpVar;
        czzsidtyhn.iyctptxqzt(tzroggbefpVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l13 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l13 = 1000L;
        }
        f76777zynmafqrjb = timeUnit.toNanos(l13.longValue());
    }

    private tzroggbefp() {
    }

    private final synchronized void B() {
        if (L()) {
            debugStatus = 3;
            q();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread D() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f76776pmvmpeiblj.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean J() {
        return debugStatus == 4;
    }

    private final boolean L() {
        int i13 = debugStatus;
        return i13 == 2 || i13 == 3;
    }

    private final synchronized boolean M() {
        if (L()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void O() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // pj.uwvvkdfqfp, pj.sopmlzcsov
    public jztzpxfvev hkdspvbjdz(long j13, Runnable runnable, lg.btonecajqb btonecajqbVar) {
        return w(j13, runnable);
    }

    @Override // pj.yfnezrywwk
    protected void hszhottldk(long j13, uwvvkdfqfp.ppxfxbqfkf ppxfxbqfkfVar) {
        O();
    }

    @Override // pj.uwvvkdfqfp
    public void rhgxfdycjh(Runnable runnable) {
        if (J()) {
            O();
        }
        super.rhgxfdycjh(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zI;
        c.f76674iobyxmoadg.wkgbmnqykc(this);
        ppxfxbqfkf.iobyxmoadg();
        try {
            if (!M()) {
                if (zI) {
                    return;
                } else {
                    return;
                }
            }
            long j13 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jTbqsvytpvh = tbqsvytpvh();
                if (jTbqsvytpvh == Long.MAX_VALUE) {
                    ppxfxbqfkf.iobyxmoadg();
                    long jNanoTime = System.nanoTime();
                    if (j13 == Long.MAX_VALUE) {
                        j13 = f76777zynmafqrjb + jNanoTime;
                    }
                    long j14 = j13 - jNanoTime;
                    if (j14 <= 0) {
                        if (zI) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jTbqsvytpvh = zg.gtknphoqwx.gtknphoqwx(jTbqsvytpvh, j14);
                } else {
                    j13 = Long.MAX_VALUE;
                }
                if (jTbqsvytpvh > 0) {
                    if (L()) {
                        if (zI) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        ppxfxbqfkf.iobyxmoadg();
                        LockSupport.parkNanos(this, jTbqsvytpvh);
                    }
                }
            }
        } finally {
            _thread = null;
            B();
            ppxfxbqfkf.iobyxmoadg();
            if (!i()) {
                wizcaqwiak();
            }
        }
    }

    @Override // pj.uwvvkdfqfp, pj.czzsidtyhn
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // pj.pkzmftpjix
    public String toString() {
        return "DefaultExecutor";
    }

    @Override // pj.yfnezrywwk
    protected Thread wizcaqwiak() {
        Thread thread = _thread;
        return thread == null ? D() : thread;
    }
}
