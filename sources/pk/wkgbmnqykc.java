package pk;

import gg.wwaezpbzkn;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mk.rgvfuqvkyq;
import mk.wflxmlrfwp;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final Logger f76868btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final zoijcleaow f76869dxjokdxxww = new zoijcleaow(null);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final wkgbmnqykc f76870gtknphoqwx;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f76871eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f76872gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f76873iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f76874lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Runnable f76875nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f76876ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f76877wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Logger f76878zoijcleaow;

    public interface iobyxmoadg {
        void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, long j13);

        long nanoTime();

        void ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar);

        void wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, Runnable runnable);

        BlockingQueue zoijcleaow(BlockingQueue blockingQueue);
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ThreadPoolExecutor f76879iobyxmoadg;

        public ppxfxbqfkf(ThreadFactory threadFactory) {
            zdlpuopuiu.btonecajqb(threadFactory, "threadFactory");
            this.f76879iobyxmoadg = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // pk.wkgbmnqykc.iobyxmoadg
        public void iobyxmoadg(wkgbmnqykc taskRunner, long j13) throws InterruptedException {
            zdlpuopuiu.btonecajqb(taskRunner, "taskRunner");
            long j14 = j13 / 1000000;
            long j15 = j13 - (1000000 * j14);
            if (j14 > 0 || j13 > 0) {
                taskRunner.wait(j14, (int) j15);
            }
        }

        @Override // pk.wkgbmnqykc.iobyxmoadg
        public long nanoTime() {
            return System.nanoTime();
        }

        @Override // pk.wkgbmnqykc.iobyxmoadg
        public void ppxfxbqfkf(wkgbmnqykc taskRunner) {
            zdlpuopuiu.btonecajqb(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // pk.wkgbmnqykc.iobyxmoadg
        public void wkgbmnqykc(wkgbmnqykc taskRunner, Runnable runnable) {
            zdlpuopuiu.btonecajqb(taskRunner, "taskRunner");
            zdlpuopuiu.btonecajqb(runnable, "runnable");
            this.f76879iobyxmoadg.execute(runnable);
        }

        @Override // pk.wkgbmnqykc.iobyxmoadg
        public BlockingQueue zoijcleaow(BlockingQueue queue) {
            zdlpuopuiu.btonecajqb(queue, "queue");
            return queue;
        }
    }

    /* JADX INFO: renamed from: pk.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class RunnableC1700wkgbmnqykc implements Runnable {
        RunnableC1700wkgbmnqykc() {
        }

        @Override // java.lang.Runnable
        public void run() {
            pk.iobyxmoadg iobyxmoadgVarPpxfxbqfkf;
            long jNanoTime;
            while (true) {
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                synchronized (wkgbmnqykcVar) {
                    iobyxmoadgVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
                }
                if (iobyxmoadgVarPpxfxbqfkf == null) {
                    return;
                }
                Logger loggerLqeggnwhkg = wkgbmnqykc.this.lqeggnwhkg();
                pk.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = iobyxmoadgVarPpxfxbqfkf.wkgbmnqykc();
                zdlpuopuiu.lqeggnwhkg(ppxfxbqfkfVarWkgbmnqykc);
                wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykc.this;
                boolean zIsLoggable = loggerLqeggnwhkg.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = ppxfxbqfkfVarWkgbmnqykc.btonecajqb().gxszxtbevo().nanoTime();
                    pk.zoijcleaow.ppxfxbqfkf(loggerLqeggnwhkg, iobyxmoadgVarPpxfxbqfkf, ppxfxbqfkfVarWkgbmnqykc, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    wkgbmnqykcVar2.btonecajqb(iobyxmoadgVarPpxfxbqfkf);
                    try {
                        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                        if (zIsLoggable) {
                            pk.zoijcleaow.ppxfxbqfkf(loggerLqeggnwhkg, iobyxmoadgVarPpxfxbqfkf, ppxfxbqfkfVarWkgbmnqykc, "finished run in " + pk.zoijcleaow.zoijcleaow(ppxfxbqfkfVarWkgbmnqykc.btonecajqb().gxszxtbevo().nanoTime() - jNanoTime));
                        }
                    } catch (Throwable th2) {
                        if (zIsLoggable) {
                            pk.zoijcleaow.ppxfxbqfkf(loggerLqeggnwhkg, iobyxmoadgVarPpxfxbqfkf, ppxfxbqfkfVarWkgbmnqykc, "failed a run in " + pk.zoijcleaow.zoijcleaow(ppxfxbqfkfVarWkgbmnqykc.btonecajqb().gxszxtbevo().nanoTime() - jNanoTime));
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    synchronized (wkgbmnqykcVar2) {
                        wkgbmnqykcVar2.gxszxtbevo().wkgbmnqykc(wkgbmnqykcVar2, this);
                        wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                        throw th3;
                    }
                }
            }
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Logger logger = Logger.getLogger(wkgbmnqykc.class.getName());
        zdlpuopuiu.dxjokdxxww(logger, "getLogger(TaskRunner::class.java.name)");
        f76868btonecajqb = logger;
        f76870gtknphoqwx = new wkgbmnqykc(new ppxfxbqfkf(rgvfuqvkyq.ojitshcjhn(rgvfuqvkyq.f67371gxszxtbevo + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    public wkgbmnqykc(iobyxmoadg backend, Logger logger) {
        zdlpuopuiu.btonecajqb(backend, "backend");
        zdlpuopuiu.btonecajqb(logger, "logger");
        this.f76873iobyxmoadg = backend;
        this.f76878zoijcleaow = logger;
        this.f76876ppxfxbqfkf = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f76872gxszxtbevo = new ArrayList();
        this.f76874lqeggnwhkg = new ArrayList();
        this.f76875nufgyqmvbu = new RunnableC1700wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void btonecajqb(pk.iobyxmoadg iobyxmoadgVar) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(iobyxmoadgVar.zoijcleaow());
        try {
            long jGxszxtbevo = iobyxmoadgVar.gxszxtbevo();
            synchronized (this) {
                zoijcleaow(iobyxmoadgVar, jGxszxtbevo);
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
        } finally {
            synchronized (this) {
                zoijcleaow(iobyxmoadgVar, -1L);
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                threadCurrentThread.setName(name);
            }
        }
    }

    private final void wkgbmnqykc(pk.iobyxmoadg iobyxmoadgVar) {
        if (rgvfuqvkyq.f67370eablkybsjg && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        iobyxmoadgVar.lqeggnwhkg(-1L);
        pk.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        zdlpuopuiu.lqeggnwhkg(ppxfxbqfkfVarWkgbmnqykc);
        ppxfxbqfkfVarWkgbmnqykc.lqeggnwhkg().remove(iobyxmoadgVar);
        this.f76874lqeggnwhkg.remove(ppxfxbqfkfVarWkgbmnqykc);
        ppxfxbqfkfVarWkgbmnqykc.ojitshcjhn(iobyxmoadgVar);
        this.f76872gxszxtbevo.add(ppxfxbqfkfVarWkgbmnqykc);
    }

    private final void zoijcleaow(pk.iobyxmoadg iobyxmoadgVar, long j13) {
        if (rgvfuqvkyq.f67370eablkybsjg && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        pk.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        zdlpuopuiu.lqeggnwhkg(ppxfxbqfkfVarWkgbmnqykc);
        if (ppxfxbqfkfVarWkgbmnqykc.eablkybsjg() != iobyxmoadgVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zGxszxtbevo = ppxfxbqfkfVarWkgbmnqykc.gxszxtbevo();
        ppxfxbqfkfVarWkgbmnqykc.rgvfuqvkyq(false);
        ppxfxbqfkfVarWkgbmnqykc.ojitshcjhn(null);
        this.f76872gxszxtbevo.remove(ppxfxbqfkfVarWkgbmnqykc);
        if (j13 != -1 && !zGxszxtbevo && !ppxfxbqfkfVarWkgbmnqykc.dxjokdxxww()) {
            ppxfxbqfkfVarWkgbmnqykc.agtfadlqog(iobyxmoadgVar, j13, true);
        }
        if (ppxfxbqfkfVarWkgbmnqykc.lqeggnwhkg().isEmpty()) {
            return;
        }
        this.f76874lqeggnwhkg.add(ppxfxbqfkfVarWkgbmnqykc);
    }

    public final pk.ppxfxbqfkf dxjokdxxww() {
        int i13;
        synchronized (this) {
            i13 = this.f76876ppxfxbqfkf;
            this.f76876ppxfxbqfkf = i13 + 1;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append('Q');
        sb3.append(i13);
        return new pk.ppxfxbqfkf(this, sb3.toString());
    }

    public final void eablkybsjg() {
        if (rgvfuqvkyq.f67370eablkybsjg && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        int size = this.f76872gxszxtbevo.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((pk.ppxfxbqfkf) this.f76872gxszxtbevo.get(size)).zoijcleaow();
            }
        }
        for (int size2 = this.f76874lqeggnwhkg.size() - 1; -1 < size2; size2--) {
            pk.ppxfxbqfkf ppxfxbqfkfVar = (pk.ppxfxbqfkf) this.f76874lqeggnwhkg.get(size2);
            ppxfxbqfkfVar.zoijcleaow();
            if (ppxfxbqfkfVar.lqeggnwhkg().isEmpty()) {
                this.f76874lqeggnwhkg.remove(size2);
            }
        }
    }

    public final iobyxmoadg gxszxtbevo() {
        return this.f76873iobyxmoadg;
    }

    public final Logger lqeggnwhkg() {
        return this.f76878zoijcleaow;
    }

    public final void nufgyqmvbu(pk.ppxfxbqfkf taskQueue) {
        zdlpuopuiu.btonecajqb(taskQueue, "taskQueue");
        if (rgvfuqvkyq.f67370eablkybsjg && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.eablkybsjg() == null) {
            if (taskQueue.lqeggnwhkg().isEmpty()) {
                this.f76874lqeggnwhkg.remove(taskQueue);
            } else {
                wflxmlrfwp.iobyxmoadg(this.f76874lqeggnwhkg, taskQueue);
            }
        }
        if (this.f76877wkgbmnqykc) {
            this.f76873iobyxmoadg.ppxfxbqfkf(this);
        } else {
            this.f76873iobyxmoadg.wkgbmnqykc(this, this.f76875nufgyqmvbu);
        }
    }

    public final pk.iobyxmoadg ppxfxbqfkf() {
        boolean z13;
        if (rgvfuqvkyq.f67370eablkybsjg && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f76874lqeggnwhkg.isEmpty()) {
            long jNanoTime = this.f76873iobyxmoadg.nanoTime();
            Iterator it = this.f76874lqeggnwhkg.iterator();
            long jMin = Long.MAX_VALUE;
            pk.iobyxmoadg iobyxmoadgVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z13 = false;
                    break;
                }
                pk.iobyxmoadg iobyxmoadgVar2 = (pk.iobyxmoadg) ((pk.ppxfxbqfkf) it.next()).lqeggnwhkg().get(0);
                long jMax = Math.max(0L, iobyxmoadgVar2.ppxfxbqfkf() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (iobyxmoadgVar != null) {
                        z13 = true;
                        break;
                    }
                    iobyxmoadgVar = iobyxmoadgVar2;
                }
            }
            if (iobyxmoadgVar != null) {
                wkgbmnqykc(iobyxmoadgVar);
                if (z13 || (!this.f76877wkgbmnqykc && !this.f76874lqeggnwhkg.isEmpty())) {
                    this.f76873iobyxmoadg.wkgbmnqykc(this, this.f76875nufgyqmvbu);
                }
                return iobyxmoadgVar;
            }
            if (this.f76877wkgbmnqykc) {
                if (jMin < this.f76871eablkybsjg - jNanoTime) {
                    this.f76873iobyxmoadg.ppxfxbqfkf(this);
                }
                return null;
            }
            this.f76877wkgbmnqykc = true;
            this.f76871eablkybsjg = jNanoTime + jMin;
            try {
                try {
                    this.f76873iobyxmoadg.iobyxmoadg(this, jMin);
                } catch (InterruptedException unused) {
                    eablkybsjg();
                }
                this.f76877wkgbmnqykc = false;
            } catch (Throwable th2) {
                this.f76877wkgbmnqykc = false;
                throw th2;
            }
        }
        return null;
    }

    public /* synthetic */ wkgbmnqykc(iobyxmoadg iobyxmoadgVar, Logger logger, int i13, gtknphoqwx gtknphoqwxVar) {
        this(iobyxmoadgVar, (i13 & 2) != 0 ? f76868btonecajqb : logger);
    }
}
