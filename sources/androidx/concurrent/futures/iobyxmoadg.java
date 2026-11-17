package androidx.concurrent.futures;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg implements com.google.common.util.concurrent.wkgbmnqykc {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    static final zoijcleaow f7491esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final Object f7493lereixgezr;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    volatile nufgyqmvbu f7494jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    volatile eablkybsjg f7495yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    volatile Object f7496zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    static final boolean f7492iwizpuwonk = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final Logger f7490cqumvgiudr = Logger.getLogger(iobyxmoadg.class.getName());

    private static final class eablkybsjg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        static final eablkybsjg f7497wkgbmnqykc = new eablkybsjg(null, null);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Runnable f7498iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        eablkybsjg f7499ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Executor f7500zoijcleaow;

        eablkybsjg(Runnable runnable, Executor executor) {
            this.f7498iobyxmoadg = runnable;
            this.f7500zoijcleaow = executor;
        }
    }

    private static final class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7501eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7502iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7503ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7504wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7505zoijcleaow;

        gxszxtbevo(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f7502iobyxmoadg = atomicReferenceFieldUpdater;
            this.f7505zoijcleaow = atomicReferenceFieldUpdater2;
            this.f7503ppxfxbqfkf = atomicReferenceFieldUpdater3;
            this.f7504wkgbmnqykc = atomicReferenceFieldUpdater4;
            this.f7501eablkybsjg = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.iobyxmoadg.zoijcleaow
        void eablkybsjg(nufgyqmvbu nufgyqmvbuVar, Thread thread) {
            this.f7502iobyxmoadg.lazySet(nufgyqmvbuVar, thread);
        }

        @Override // androidx.concurrent.futures.iobyxmoadg.zoijcleaow
        boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar, eablkybsjg eablkybsjgVar2) {
            return androidx.concurrent.futures.zoijcleaow.iobyxmoadg(this.f7504wkgbmnqykc, iobyxmoadgVar, eablkybsjgVar, eablkybsjgVar2);
        }

        @Override // androidx.concurrent.futures.iobyxmoadg.zoijcleaow
        boolean ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2) {
            return androidx.concurrent.futures.zoijcleaow.iobyxmoadg(this.f7503ppxfxbqfkf, iobyxmoadgVar, nufgyqmvbuVar, nufgyqmvbuVar2);
        }

        @Override // androidx.concurrent.futures.iobyxmoadg.zoijcleaow
        void wkgbmnqykc(nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2) {
            this.f7505zoijcleaow.lazySet(nufgyqmvbuVar, nufgyqmvbuVar2);
        }

        @Override // androidx.concurrent.futures.iobyxmoadg.zoijcleaow
        boolean zoijcleaow(iobyxmoadg iobyxmoadgVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.zoijcleaow.iobyxmoadg(this.f7501eablkybsjg, iobyxmoadgVar, obj, obj2);
        }
    }

    private static final class lqeggnwhkg extends zoijcleaow {
        lqeggnwhkg() {
            super();
        }

        @Override // androidx.concurrent.futures.iobyxmoadg.zoijcleaow
        void eablkybsjg(nufgyqmvbu nufgyqmvbuVar, Thread thread) {
            nufgyqmvbuVar.f7507iobyxmoadg = thread;
        }

        @Override // androidx.concurrent.futures.iobyxmoadg.zoijcleaow
        boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar, eablkybsjg eablkybsjgVar2) {
            synchronized (iobyxmoadgVar) {
                try {
                    if (iobyxmoadgVar.f7495yggfygwlhe != eablkybsjgVar) {
                        return false;
                    }
                    iobyxmoadgVar.f7495yggfygwlhe = eablkybsjgVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.iobyxmoadg.zoijcleaow
        boolean ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2) {
            synchronized (iobyxmoadgVar) {
                try {
                    if (iobyxmoadgVar.f7494jyumaefscl != nufgyqmvbuVar) {
                        return false;
                    }
                    iobyxmoadgVar.f7494jyumaefscl = nufgyqmvbuVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.iobyxmoadg.zoijcleaow
        void wkgbmnqykc(nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2) {
            nufgyqmvbuVar.f7508zoijcleaow = nufgyqmvbuVar2;
        }

        @Override // androidx.concurrent.futures.iobyxmoadg.zoijcleaow
        boolean zoijcleaow(iobyxmoadg iobyxmoadgVar, Object obj, Object obj2) {
            synchronized (iobyxmoadgVar) {
                try {
                    if (iobyxmoadgVar.f7496zdlpuopuiu != obj) {
                        return false;
                    }
                    iobyxmoadgVar.f7496zdlpuopuiu = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final class nufgyqmvbu {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        static final nufgyqmvbu f7506ppxfxbqfkf = new nufgyqmvbu(false);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        volatile Thread f7507iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        volatile nufgyqmvbu f7508zoijcleaow;

        nufgyqmvbu(boolean z13) {
        }

        void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
            iobyxmoadg.f7491esjtqupxsv.wkgbmnqykc(this, nufgyqmvbuVar);
        }

        void zoijcleaow() {
            Thread thread = this.f7507iobyxmoadg;
            if (thread != null) {
                this.f7507iobyxmoadg = null;
                LockSupport.unpark(thread);
            }
        }

        nufgyqmvbu() {
            iobyxmoadg.f7491esjtqupxsv.eablkybsjg(this, Thread.currentThread());
        }
    }

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        static final ppxfxbqfkf f7509ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        static final ppxfxbqfkf f7510wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final boolean f7511iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Throwable f7512zoijcleaow;

        static {
            if (iobyxmoadg.f7492iwizpuwonk) {
                f7510wkgbmnqykc = null;
                f7509ppxfxbqfkf = null;
            } else {
                f7510wkgbmnqykc = new ppxfxbqfkf(false, null);
                f7509ppxfxbqfkf = new ppxfxbqfkf(true, null);
            }
        }

        ppxfxbqfkf(boolean z13, Throwable th2) {
            this.f7511iobyxmoadg = z13;
            this.f7512zoijcleaow = th2;
        }
    }

    private static final class wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final wkgbmnqykc f7513zoijcleaow = new wkgbmnqykc(new C0127iobyxmoadg("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Throwable f7514iobyxmoadg;

        /* JADX INFO: renamed from: androidx.concurrent.futures.iobyxmoadg$wkgbmnqykc$iobyxmoadg, reason: collision with other inner class name */
        class C0127iobyxmoadg extends Throwable {
            C0127iobyxmoadg(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        wkgbmnqykc(Throwable th2) {
            this.f7514iobyxmoadg = (Throwable) iobyxmoadg.eablkybsjg(th2);
        }
    }

    private static abstract class zoijcleaow {
        private zoijcleaow() {
        }

        abstract void eablkybsjg(nufgyqmvbu nufgyqmvbuVar, Thread thread);

        abstract boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar, eablkybsjg eablkybsjgVar2);

        abstract boolean ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2);

        abstract void wkgbmnqykc(nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2);

        abstract boolean zoijcleaow(iobyxmoadg iobyxmoadgVar, Object obj, Object obj2);
    }

    static {
        zoijcleaow lqeggnwhkgVar;
        try {
            lqeggnwhkgVar = new gxszxtbevo(AtomicReferenceFieldUpdater.newUpdater(nufgyqmvbu.class, Thread.class, "iobyxmoadg"), AtomicReferenceFieldUpdater.newUpdater(nufgyqmvbu.class, nufgyqmvbu.class, "zoijcleaow"), AtomicReferenceFieldUpdater.newUpdater(iobyxmoadg.class, nufgyqmvbu.class, "jyumaefscl"), AtomicReferenceFieldUpdater.newUpdater(iobyxmoadg.class, eablkybsjg.class, "yggfygwlhe"), AtomicReferenceFieldUpdater.newUpdater(iobyxmoadg.class, Object.class, "zdlpuopuiu"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            lqeggnwhkgVar = new lqeggnwhkg();
        }
        f7491esjtqupxsv = lqeggnwhkgVar;
        if (th != null) {
            f7490cqumvgiudr.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7493lereixgezr = new Object();
    }

    protected iobyxmoadg() {
    }

    private void agtfadlqog(nufgyqmvbu nufgyqmvbuVar) {
        nufgyqmvbuVar.f7507iobyxmoadg = null;
        while (true) {
            nufgyqmvbu nufgyqmvbuVar2 = this.f7494jyumaefscl;
            if (nufgyqmvbuVar2 == nufgyqmvbu.f7506ppxfxbqfkf) {
                return;
            }
            nufgyqmvbu nufgyqmvbuVar3 = null;
            while (nufgyqmvbuVar2 != null) {
                nufgyqmvbu nufgyqmvbuVar4 = nufgyqmvbuVar2.f7508zoijcleaow;
                if (nufgyqmvbuVar2.f7507iobyxmoadg != null) {
                    nufgyqmvbuVar3 = nufgyqmvbuVar2;
                } else if (nufgyqmvbuVar3 != null) {
                    nufgyqmvbuVar3.f7508zoijcleaow = nufgyqmvbuVar4;
                    if (nufgyqmvbuVar3.f7507iobyxmoadg == null) {
                    }
                } else if (!f7491esjtqupxsv.ppxfxbqfkf(this, nufgyqmvbuVar2, nufgyqmvbuVar4)) {
                }
                nufgyqmvbuVar2 = nufgyqmvbuVar4;
            }
            return;
        }
    }

    static Object btonecajqb(Future future) {
        Object obj;
        boolean z13 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z13 = true;
            } catch (Throwable th2) {
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private Object dxjokdxxww(Object obj) throws ExecutionException {
        if (obj instanceof ppxfxbqfkf) {
            throw wkgbmnqykc("Task was cancelled.", ((ppxfxbqfkf) obj).f7512zoijcleaow);
        }
        if (obj instanceof wkgbmnqykc) {
            throw new ExecutionException(((wkgbmnqykc) obj).f7514iobyxmoadg);
        }
        if (obj == f7493lereixgezr) {
            return null;
        }
        return obj;
    }

    static Object eablkybsjg(Object obj) {
        obj.getClass();
        return obj;
    }

    private eablkybsjg gxszxtbevo(eablkybsjg eablkybsjgVar) {
        eablkybsjg eablkybsjgVar2;
        do {
            eablkybsjgVar2 = this.f7495yggfygwlhe;
        } while (!f7491esjtqupxsv.iobyxmoadg(this, eablkybsjgVar2, eablkybsjg.f7497wkgbmnqykc));
        eablkybsjg eablkybsjgVar3 = eablkybsjgVar;
        eablkybsjg eablkybsjgVar4 = eablkybsjgVar2;
        while (eablkybsjgVar4 != null) {
            eablkybsjg eablkybsjgVar5 = eablkybsjgVar4.f7499ppxfxbqfkf;
            eablkybsjgVar4.f7499ppxfxbqfkf = eablkybsjgVar3;
            eablkybsjgVar3 = eablkybsjgVar4;
            eablkybsjgVar4 = eablkybsjgVar5;
        }
        return eablkybsjgVar3;
    }

    static void lqeggnwhkg(iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.wflxmlrfwp();
        iobyxmoadgVar.ppxfxbqfkf();
        eablkybsjg eablkybsjgVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(null);
        while (eablkybsjgVarGxszxtbevo != null) {
            eablkybsjg eablkybsjgVar = eablkybsjgVarGxszxtbevo.f7499ppxfxbqfkf;
            nufgyqmvbu(eablkybsjgVarGxszxtbevo.f7498iobyxmoadg, eablkybsjgVarGxszxtbevo.f7500zoijcleaow);
            eablkybsjgVarGxszxtbevo = eablkybsjgVar;
        }
    }

    private static void nufgyqmvbu(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e13) {
            f7490cqumvgiudr.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e13);
        }
    }

    private String vdvldrhtss(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void wflxmlrfwp() {
        nufgyqmvbu nufgyqmvbuVar;
        do {
            nufgyqmvbuVar = this.f7494jyumaefscl;
        } while (!f7491esjtqupxsv.ppxfxbqfkf(this, nufgyqmvbuVar, nufgyqmvbu.f7506ppxfxbqfkf));
        while (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.zoijcleaow();
            nufgyqmvbuVar = nufgyqmvbuVar.f7508zoijcleaow;
        }
    }

    private static CancellationException wkgbmnqykc(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    private void zoijcleaow(StringBuilder sb3) {
        try {
            Object objBtonecajqb = btonecajqb(this);
            sb3.append("SUCCESS, result=[");
            sb3.append(vdvldrhtss(objBtonecajqb));
            sb3.append("]");
        } catch (CancellationException unused) {
            sb3.append("CANCELLED");
        } catch (RuntimeException e13) {
            sb3.append("UNKNOWN, cause=[");
            sb3.append(e13.getClass());
            sb3.append(" thrown from get()]");
        } catch (ExecutionException e14) {
            sb3.append("FAILURE, cause=[");
            sb3.append(e14.getCause());
            sb3.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        ppxfxbqfkf ppxfxbqfkfVar;
        Object obj = this.f7496zdlpuopuiu;
        if (obj == null) {
            if (f7492iwizpuwonk) {
                ppxfxbqfkfVar = new ppxfxbqfkf(z13, new CancellationException("Future.cancel() was called."));
            } else {
                ppxfxbqfkfVar = z13 ? ppxfxbqfkf.f7509ppxfxbqfkf : ppxfxbqfkf.f7510wkgbmnqykc;
            }
            if (f7491esjtqupxsv.zoijcleaow(this, obj, ppxfxbqfkfVar)) {
                if (z13) {
                    gtknphoqwx();
                }
                lqeggnwhkg(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String draadjrbmk() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j13);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7496zdlpuopuiu;
        if (obj != null) {
            return dxjokdxxww(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            nufgyqmvbu nufgyqmvbuVar = this.f7494jyumaefscl;
            if (nufgyqmvbuVar != nufgyqmvbu.f7506ppxfxbqfkf) {
                nufgyqmvbu nufgyqmvbuVar2 = new nufgyqmvbu();
                while (true) {
                    nufgyqmvbuVar2.iobyxmoadg(nufgyqmvbuVar);
                    if (f7491esjtqupxsv.ppxfxbqfkf(this, nufgyqmvbuVar, nufgyqmvbuVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                agtfadlqog(nufgyqmvbuVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7496zdlpuopuiu;
                            if (obj2 != null) {
                                return dxjokdxxww(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        agtfadlqog(nufgyqmvbuVar2);
                        break;
                    }
                    nufgyqmvbuVar = this.f7494jyumaefscl;
                    if (nufgyqmvbuVar == nufgyqmvbu.f7506ppxfxbqfkf) {
                    }
                }
            }
            return dxjokdxxww(this.f7496zdlpuopuiu);
        }
        while (nanos > 0) {
            Object obj3 = this.f7496zdlpuopuiu;
            if (obj3 != null) {
                return dxjokdxxww(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j13 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j14 = -nanos;
            long jConvert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
            long nanos2 = j14 - timeUnit.toNanos(jConvert);
            boolean z13 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z13) {
                    str3 = str3 + StringUtils.COMMA;
                }
                str2 = str3 + " ";
            }
            if (z13) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    protected void gtknphoqwx() {
    }

    @Override // com.google.common.util.concurrent.wkgbmnqykc
    public final void iobyxmoadg(Runnable runnable, Executor executor) {
        eablkybsjg(runnable);
        eablkybsjg(executor);
        eablkybsjg eablkybsjgVar = this.f7495yggfygwlhe;
        if (eablkybsjgVar != eablkybsjg.f7497wkgbmnqykc) {
            eablkybsjg eablkybsjgVar2 = new eablkybsjg(runnable, executor);
            do {
                eablkybsjgVar2.f7499ppxfxbqfkf = eablkybsjgVar;
                if (f7491esjtqupxsv.iobyxmoadg(this, eablkybsjgVar, eablkybsjgVar2)) {
                    return;
                } else {
                    eablkybsjgVar = this.f7495yggfygwlhe;
                }
            } while (eablkybsjgVar != eablkybsjg.f7497wkgbmnqykc);
        }
        nufgyqmvbu(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7496zdlpuopuiu instanceof ppxfxbqfkf;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7496zdlpuopuiu != null;
    }

    protected boolean ojitshcjhn(Object obj) {
        if (obj == null) {
            obj = f7493lereixgezr;
        }
        if (!f7491esjtqupxsv.zoijcleaow(this, null, obj)) {
            return false;
        }
        lqeggnwhkg(this);
        return true;
    }

    protected final boolean oxmwwwfdhm() {
        Object obj = this.f7496zdlpuopuiu;
        return (obj instanceof ppxfxbqfkf) && ((ppxfxbqfkf) obj).f7511iobyxmoadg;
    }

    protected void ppxfxbqfkf() {
    }

    protected boolean rgvfuqvkyq(Throwable th2) {
        if (!f7491esjtqupxsv.zoijcleaow(this, null, new wkgbmnqykc((Throwable) eablkybsjg(th2)))) {
            return false;
        }
        lqeggnwhkg(this);
        return true;
    }

    public String toString() {
        String strDraadjrbmk;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("[status=");
        if (isCancelled()) {
            sb3.append("CANCELLED");
        } else if (isDone()) {
            zoijcleaow(sb3);
        } else {
            try {
                strDraadjrbmk = draadjrbmk();
            } catch (RuntimeException e13) {
                strDraadjrbmk = "Exception thrown from implementation: " + e13.getClass();
            }
            if (strDraadjrbmk != null && !strDraadjrbmk.isEmpty()) {
                sb3.append("PENDING, info=[");
                sb3.append(strDraadjrbmk);
                sb3.append("]");
            } else if (isDone()) {
                zoijcleaow(sb3);
            } else {
                sb3.append("PENDING");
            }
        }
        sb3.append("]");
        return sb3.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7496zdlpuopuiu;
            if (obj2 != null) {
                return dxjokdxxww(obj2);
            }
            nufgyqmvbu nufgyqmvbuVar = this.f7494jyumaefscl;
            if (nufgyqmvbuVar != nufgyqmvbu.f7506ppxfxbqfkf) {
                nufgyqmvbu nufgyqmvbuVar2 = new nufgyqmvbu();
                do {
                    nufgyqmvbuVar2.iobyxmoadg(nufgyqmvbuVar);
                    if (f7491esjtqupxsv.ppxfxbqfkf(this, nufgyqmvbuVar, nufgyqmvbuVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7496zdlpuopuiu;
                            } else {
                                agtfadlqog(nufgyqmvbuVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return dxjokdxxww(obj);
                    }
                    nufgyqmvbuVar = this.f7494jyumaefscl;
                } while (nufgyqmvbuVar != nufgyqmvbu.f7506ppxfxbqfkf);
            }
            return dxjokdxxww(this.f7496zdlpuopuiu);
        }
        throw new InterruptedException();
    }
}
