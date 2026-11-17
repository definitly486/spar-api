package pj;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class opjhrmiecq extends bfopjjpdmp implements sopmlzcsov {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Executor f76760jyumaefscl;

    public opjhrmiecq(Executor executor) {
        this.f76760jyumaefscl = executor;
        if (xrmfcynszj() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) xrmfcynszj()).setRemoveOnCancelPolicy(true);
        }
    }

    private final ScheduledFuture czzsidtyhn(ScheduledExecutorService scheduledExecutorService, Runnable runnable, lg.btonecajqb btonecajqbVar, long j13) {
        try {
            return scheduledExecutorService.schedule(runnable, j13, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e13) {
            rlfsiqarku(btonecajqbVar, e13);
            return null;
        }
    }

    private final void rlfsiqarku(lg.btonecajqb btonecajqbVar, RejectedExecutionException rejectedExecutionException) {
        dvvnrvtcbc.ppxfxbqfkf(btonecajqbVar, zfvoamnweg.iobyxmoadg("The task was rejected", rejectedExecutionException));
    }

    @Override // pj.sopmlzcsov
    public void cdpycssgdh(long j13, agtfadlqog agtfadlqogVar) {
        Executor executorXrmfcynszj = xrmfcynszj();
        ScheduledExecutorService scheduledExecutorService = executorXrmfcynszj instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorXrmfcynszj : null;
        ScheduledFuture scheduledFutureCzzsidtyhn = scheduledExecutorService != null ? czzsidtyhn(scheduledExecutorService, new ezmngbhpjk(this, agtfadlqogVar), agtfadlqogVar.getContext(), j13) : null;
        if (scheduledFutureCzzsidtyhn != null) {
            oxmwwwfdhm.ppxfxbqfkf(agtfadlqogVar, new draadjrbmk(scheduledFutureCzzsidtyhn));
        } else {
            tzroggbefp.f76776pmvmpeiblj.cdpycssgdh(j13, agtfadlqogVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorXrmfcynszj = xrmfcynszj();
        ExecutorService executorService = executorXrmfcynszj instanceof ExecutorService ? (ExecutorService) executorXrmfcynszj : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // pj.pkzmftpjix
    public void dsvhmnatus(lg.btonecajqb btonecajqbVar, Runnable runnable) {
        try {
            Executor executorXrmfcynszj = xrmfcynszj();
            ppxfxbqfkf.iobyxmoadg();
            executorXrmfcynszj.execute(runnable);
        } catch (RejectedExecutionException e13) {
            ppxfxbqfkf.iobyxmoadg();
            rlfsiqarku(btonecajqbVar, e13);
            ikoacuggdj.zoijcleaow().dsvhmnatus(btonecajqbVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof opjhrmiecq) && ((opjhrmiecq) obj).xrmfcynszj() == xrmfcynszj();
    }

    public int hashCode() {
        return System.identityHashCode(xrmfcynszj());
    }

    @Override // pj.sopmlzcsov
    public jztzpxfvev hkdspvbjdz(long j13, Runnable runnable, lg.btonecajqb btonecajqbVar) {
        Executor executorXrmfcynszj = xrmfcynszj();
        ScheduledExecutorService scheduledExecutorService = executorXrmfcynszj instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorXrmfcynszj : null;
        ScheduledFuture scheduledFutureCzzsidtyhn = scheduledExecutorService != null ? czzsidtyhn(scheduledExecutorService, runnable, btonecajqbVar, j13) : null;
        return scheduledFutureCzzsidtyhn != null ? new okpsazkaxt(scheduledFutureCzzsidtyhn) : tzroggbefp.f76776pmvmpeiblj.hkdspvbjdz(j13, runnable, btonecajqbVar);
    }

    @Override // pj.pkzmftpjix
    public String toString() {
        return xrmfcynszj().toString();
    }

    @Override // pj.bfopjjpdmp
    public Executor xrmfcynszj() {
        return this.f76760jyumaefscl;
    }
}
