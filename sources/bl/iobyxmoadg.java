package bl;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg extends ylkuphrtab {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static iobyxmoadg f16684agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final ReentrantLock f16685btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final long f16686draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final C0299iobyxmoadg f16687dxjokdxxww = new C0299iobyxmoadg(null);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final Condition f16688gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final long f16689wflxmlrfwp;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f16690gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private iobyxmoadg f16691lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f16692nufgyqmvbu;

    /* JADX INFO: renamed from: bl.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0299iobyxmoadg {
        public /* synthetic */ C0299iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void lqeggnwhkg(iobyxmoadg iobyxmoadgVar, long j13, boolean z13) {
            ReentrantLock reentrantLockGxszxtbevo = iobyxmoadg.f16687dxjokdxxww.gxszxtbevo();
            reentrantLockGxszxtbevo.lock();
            try {
                if (iobyxmoadgVar.f16690gxszxtbevo) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                iobyxmoadgVar.f16690gxszxtbevo = true;
                if (iobyxmoadg.f16684agtfadlqog == null) {
                    iobyxmoadg.f16684agtfadlqog = new iobyxmoadg();
                    new zoijcleaow().start();
                }
                long jNanoTime = System.nanoTime();
                if (j13 != 0 && z13) {
                    iobyxmoadgVar.f16692nufgyqmvbu = Math.min(j13, iobyxmoadgVar.ppxfxbqfkf() - jNanoTime) + jNanoTime;
                } else if (j13 != 0) {
                    iobyxmoadgVar.f16692nufgyqmvbu = j13 + jNanoTime;
                } else {
                    if (!z13) {
                        throw new AssertionError();
                    }
                    iobyxmoadgVar.f16692nufgyqmvbu = iobyxmoadgVar.ppxfxbqfkf();
                }
                long jEsjtqupxsv = iobyxmoadgVar.esjtqupxsv(jNanoTime);
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.f16684agtfadlqog;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar2);
                while (iobyxmoadgVar2.f16691lqeggnwhkg != null) {
                    iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar2.f16691lqeggnwhkg;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar3);
                    if (jEsjtqupxsv < iobyxmoadgVar3.esjtqupxsv(jNanoTime)) {
                        break;
                    }
                    iobyxmoadgVar2 = iobyxmoadgVar2.f16691lqeggnwhkg;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar2);
                }
                iobyxmoadgVar.f16691lqeggnwhkg = iobyxmoadgVar2.f16691lqeggnwhkg;
                iobyxmoadgVar2.f16691lqeggnwhkg = iobyxmoadgVar;
                if (iobyxmoadgVar2 == iobyxmoadg.f16684agtfadlqog) {
                    iobyxmoadg.f16687dxjokdxxww.eablkybsjg().signal();
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                reentrantLockGxszxtbevo.unlock();
            } catch (Throwable th2) {
                reentrantLockGxszxtbevo.unlock();
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean wkgbmnqykc(iobyxmoadg iobyxmoadgVar) {
            ReentrantLock reentrantLockGxszxtbevo = iobyxmoadg.f16687dxjokdxxww.gxszxtbevo();
            reentrantLockGxszxtbevo.lock();
            try {
                if (!iobyxmoadgVar.f16690gxszxtbevo) {
                    return false;
                }
                iobyxmoadgVar.f16690gxszxtbevo = false;
                for (iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.f16684agtfadlqog; iobyxmoadgVar2 != null; iobyxmoadgVar2 = iobyxmoadgVar2.f16691lqeggnwhkg) {
                    if (iobyxmoadgVar2.f16691lqeggnwhkg == iobyxmoadgVar) {
                        iobyxmoadgVar2.f16691lqeggnwhkg = iobyxmoadgVar.f16691lqeggnwhkg;
                        iobyxmoadgVar.f16691lqeggnwhkg = null;
                        return false;
                    }
                }
                return true;
            } finally {
                reentrantLockGxszxtbevo.unlock();
            }
        }

        public final Condition eablkybsjg() {
            return iobyxmoadg.f16688gtknphoqwx;
        }

        public final ReentrantLock gxszxtbevo() {
            return iobyxmoadg.f16685btonecajqb;
        }

        public final iobyxmoadg ppxfxbqfkf() throws InterruptedException {
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.f16684agtfadlqog;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar);
            iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar.f16691lqeggnwhkg;
            if (iobyxmoadgVar2 == null) {
                long jNanoTime = System.nanoTime();
                eablkybsjg().await(iobyxmoadg.f16686draadjrbmk, TimeUnit.MILLISECONDS);
                iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.f16684agtfadlqog;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar3);
                if (iobyxmoadgVar3.f16691lqeggnwhkg != null || System.nanoTime() - jNanoTime < iobyxmoadg.f16689wflxmlrfwp) {
                    return null;
                }
                return iobyxmoadg.f16684agtfadlqog;
            }
            long jEsjtqupxsv = iobyxmoadgVar2.esjtqupxsv(System.nanoTime());
            if (jEsjtqupxsv > 0) {
                eablkybsjg().await(jEsjtqupxsv, TimeUnit.NANOSECONDS);
                return null;
            }
            iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.f16684agtfadlqog;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar4);
            iobyxmoadgVar4.f16691lqeggnwhkg = iobyxmoadgVar2.f16691lqeggnwhkg;
            iobyxmoadgVar2.f16691lqeggnwhkg = null;
            return iobyxmoadgVar2;
        }

        private C0299iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements iozdgvuglv {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iozdgvuglv f16693yggfygwlhe;

        ppxfxbqfkf(iozdgvuglv iozdgvuglvVar) {
            this.f16693yggfygwlhe = iozdgvuglvVar;
        }

        @Override // bl.iozdgvuglv, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            iozdgvuglv iozdgvuglvVar = this.f16693yggfygwlhe;
            iobyxmoadgVar.jyumaefscl();
            try {
                try {
                    iozdgvuglvVar.close();
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    if (iobyxmoadgVar.iwizpuwonk()) {
                        throw iobyxmoadgVar.rgvfuqvkyq(null);
                    }
                } catch (IOException e13) {
                    if (!iobyxmoadgVar.iwizpuwonk()) {
                        throw e13;
                    }
                    throw iobyxmoadgVar.rgvfuqvkyq(e13);
                }
            } catch (Throwable th2) {
                iobyxmoadgVar.iwizpuwonk();
                throw th2;
            }
        }

        @Override // bl.iozdgvuglv, java.io.Flushable
        public void flush() throws IOException {
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            iozdgvuglv iozdgvuglvVar = this.f16693yggfygwlhe;
            iobyxmoadgVar.jyumaefscl();
            try {
                try {
                    iozdgvuglvVar.flush();
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    if (iobyxmoadgVar.iwizpuwonk()) {
                        throw iobyxmoadgVar.rgvfuqvkyq(null);
                    }
                } catch (IOException e13) {
                    if (!iobyxmoadgVar.iwizpuwonk()) {
                        throw e13;
                    }
                    throw iobyxmoadgVar.rgvfuqvkyq(e13);
                }
            } catch (Throwable th2) {
                iobyxmoadgVar.iwizpuwonk();
                throw th2;
            }
        }

        @Override // bl.iozdgvuglv
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg ppxfxbqfkf() {
            return iobyxmoadg.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f16693yggfygwlhe + ')';
        }

        @Override // bl.iozdgvuglv
        public void zeieaojujs(bl.ppxfxbqfkf source, long j13) throws IOException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
            cllcsxoeiz.zoijcleaow(source.dsvhmnatus(), 0L, j13);
            while (true) {
                long j14 = 0;
                if (j13 <= 0) {
                    return;
                }
                istkbnxepw istkbnxepwVar = source.f16740zdlpuopuiu;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                while (j14 < 65536) {
                    j14 += (long) (istkbnxepwVar.f16702ppxfxbqfkf - istkbnxepwVar.f16704zoijcleaow);
                    if (j14 >= j13) {
                        j14 = j13;
                        break;
                    } else {
                        istkbnxepwVar = istkbnxepwVar.f16699gxszxtbevo;
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVar);
                    }
                }
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                iozdgvuglv iozdgvuglvVar = this.f16693yggfygwlhe;
                iobyxmoadgVar.jyumaefscl();
                try {
                    try {
                        iozdgvuglvVar.zeieaojujs(source, j14);
                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                        if (iobyxmoadgVar.iwizpuwonk()) {
                            throw iobyxmoadgVar.rgvfuqvkyq(null);
                        }
                        j13 -= j14;
                    } catch (IOException e13) {
                        if (!iobyxmoadgVar.iwizpuwonk()) {
                            throw e13;
                        }
                        throw iobyxmoadgVar.rgvfuqvkyq(e13);
                    }
                } catch (Throwable th2) {
                    iobyxmoadgVar.iwizpuwonk();
                    throw th2;
                }
            }
        }
    }

    public static final class wkgbmnqykc implements wwaezpbzkn {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wwaezpbzkn f16695yggfygwlhe;

        wkgbmnqykc(wwaezpbzkn wwaezpbzknVar) {
            this.f16695yggfygwlhe = wwaezpbzknVar;
        }

        @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            wwaezpbzkn wwaezpbzknVar = this.f16695yggfygwlhe;
            iobyxmoadgVar.jyumaefscl();
            try {
                try {
                    wwaezpbzknVar.close();
                    gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                    if (iobyxmoadgVar.iwizpuwonk()) {
                        throw iobyxmoadgVar.rgvfuqvkyq(null);
                    }
                } catch (IOException e13) {
                    if (!iobyxmoadgVar.iwizpuwonk()) {
                        throw e13;
                    }
                    throw iobyxmoadgVar.rgvfuqvkyq(e13);
                }
            } catch (Throwable th2) {
                iobyxmoadgVar.iwizpuwonk();
                throw th2;
            }
        }

        @Override // bl.wwaezpbzkn
        public long fmlbqenlif(bl.ppxfxbqfkf sink, long j13) throws IOException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            wwaezpbzkn wwaezpbzknVar = this.f16695yggfygwlhe;
            iobyxmoadgVar.jyumaefscl();
            try {
                try {
                    long jFmlbqenlif = wwaezpbzknVar.fmlbqenlif(sink, j13);
                    if (iobyxmoadgVar.iwizpuwonk()) {
                        throw iobyxmoadgVar.rgvfuqvkyq(null);
                    }
                    return jFmlbqenlif;
                } catch (IOException e13) {
                    if (iobyxmoadgVar.iwizpuwonk()) {
                        throw iobyxmoadgVar.rgvfuqvkyq(e13);
                    }
                    throw e13;
                }
            } catch (Throwable th2) {
                iobyxmoadgVar.iwizpuwonk();
                throw th2;
            }
        }

        @Override // bl.wwaezpbzkn
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg ppxfxbqfkf() {
            return iobyxmoadg.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f16695yggfygwlhe + ')';
        }
    }

    private static final class zoijcleaow extends Thread {
        public zoijcleaow() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    C0299iobyxmoadg c0299iobyxmoadg = iobyxmoadg.f16687dxjokdxxww;
                    ReentrantLock reentrantLockGxszxtbevo = c0299iobyxmoadg.gxszxtbevo();
                    reentrantLockGxszxtbevo.lock();
                    try {
                        iobyxmoadg iobyxmoadgVarPpxfxbqfkf = c0299iobyxmoadg.ppxfxbqfkf();
                        if (iobyxmoadgVarPpxfxbqfkf == iobyxmoadg.f16684agtfadlqog) {
                            iobyxmoadg.f16684agtfadlqog = null;
                            reentrantLockGxszxtbevo.unlock();
                            return;
                        } else {
                            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                            reentrantLockGxszxtbevo.unlock();
                            if (iobyxmoadgVarPpxfxbqfkf != null) {
                                iobyxmoadgVarPpxfxbqfkf.zynmafqrjb();
                            }
                        }
                    } catch (Throwable th2) {
                        reentrantLockGxszxtbevo.unlock();
                        throw th2;
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f16685btonecajqb = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(conditionNewCondition, "lock.newCondition()");
        f16688gtknphoqwx = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f16686draadjrbmk = millis;
        f16689wflxmlrfwp = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long esjtqupxsv(long j13) {
        return this.f16692nufgyqmvbu - j13;
    }

    protected IOException cqumvgiudr(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final boolean iwizpuwonk() {
        return f16687dxjokdxxww.wkgbmnqykc(this);
    }

    public final void jyumaefscl() {
        long jNufgyqmvbu = nufgyqmvbu();
        boolean zEablkybsjg = eablkybsjg();
        if (jNufgyqmvbu != 0 || zEablkybsjg) {
            f16687dxjokdxxww.lqeggnwhkg(this, jNufgyqmvbu, zEablkybsjg);
        }
    }

    public final iozdgvuglv lereixgezr(iozdgvuglv sink) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
        return new ppxfxbqfkf(sink);
    }

    public final wwaezpbzkn pmvmpeiblj(wwaezpbzkn source) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        return new wkgbmnqykc(source);
    }

    public final IOException rgvfuqvkyq(IOException iOException) {
        return cqumvgiudr(iOException);
    }

    protected void zynmafqrjb() {
    }
}
