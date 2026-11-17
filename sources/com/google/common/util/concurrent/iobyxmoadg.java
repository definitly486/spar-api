package com.google.common.util.concurrent;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;
import xa.draadjrbmk;
import xa.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg extends ab.iobyxmoadg implements com.google.common.util.concurrent.wkgbmnqykc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    static final com.google.common.util.concurrent.ppxfxbqfkf f23778cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final zoijcleaow f23779esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    static final boolean f23780iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final Object f23781lereixgezr;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile btonecajqb f23782jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private volatile eablkybsjg f23783yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private volatile Object f23784zdlpuopuiu;

    private static final class btonecajqb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        static final btonecajqb f23785ppxfxbqfkf = new btonecajqb(false);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        volatile Thread f23786iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        volatile btonecajqb f23787zoijcleaow;

        btonecajqb(boolean z13) {
        }

        void iobyxmoadg(btonecajqb btonecajqbVar) {
            iobyxmoadg.f23779esjtqupxsv.gxszxtbevo(this, btonecajqbVar);
        }

        void zoijcleaow() {
            Thread thread = this.f23786iobyxmoadg;
            if (thread != null) {
                this.f23786iobyxmoadg = null;
                LockSupport.unpark(thread);
            }
        }

        btonecajqb() {
            iobyxmoadg.f23779esjtqupxsv.lqeggnwhkg(this, Thread.currentThread());
        }
    }

    private static final class dxjokdxxww extends zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        static final long f23788eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        static final long f23789gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final Unsafe f23790iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        static final long f23791ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        static final long f23792wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final long f23793zoijcleaow;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.iobyxmoadg$dxjokdxxww$iobyxmoadg, reason: collision with other inner class name */
        class C0409iobyxmoadg implements PrivilegedExceptionAction {
            C0409iobyxmoadg() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e13) {
                    throw new RuntimeException("Could not initialize intrinsics", e13.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0409iobyxmoadg());
            }
            try {
                f23791ppxfxbqfkf = unsafe.objectFieldOffset(iobyxmoadg.class.getDeclaredField("jyumaefscl"));
                f23793zoijcleaow = unsafe.objectFieldOffset(iobyxmoadg.class.getDeclaredField("yggfygwlhe"));
                f23792wkgbmnqykc = unsafe.objectFieldOffset(iobyxmoadg.class.getDeclaredField("zdlpuopuiu"));
                f23788eablkybsjg = unsafe.objectFieldOffset(btonecajqb.class.getDeclaredField("iobyxmoadg"));
                f23789gxszxtbevo = unsafe.objectFieldOffset(btonecajqb.class.getDeclaredField("zoijcleaow"));
                f23790iobyxmoadg = unsafe;
            } catch (NoSuchFieldException e14) {
                throw new RuntimeException(e14);
            }
        }

        private dxjokdxxww() {
            super();
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        btonecajqb eablkybsjg(iobyxmoadg iobyxmoadgVar, btonecajqb btonecajqbVar) {
            btonecajqb btonecajqbVar2;
            do {
                btonecajqbVar2 = iobyxmoadgVar.f23782jyumaefscl;
                if (btonecajqbVar == btonecajqbVar2) {
                    return btonecajqbVar2;
                }
            } while (!ppxfxbqfkf(iobyxmoadgVar, btonecajqbVar2, btonecajqbVar));
            return btonecajqbVar2;
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        void gxszxtbevo(btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2) {
            f23790iobyxmoadg.putObject(btonecajqbVar, f23789gxszxtbevo, btonecajqbVar2);
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar, eablkybsjg eablkybsjgVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.iobyxmoadg.iobyxmoadg(f23790iobyxmoadg, iobyxmoadgVar, f23793zoijcleaow, eablkybsjgVar, eablkybsjgVar2);
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        void lqeggnwhkg(btonecajqb btonecajqbVar, Thread thread) {
            f23790iobyxmoadg.putObject(btonecajqbVar, f23788eablkybsjg, thread);
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        boolean ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.iobyxmoadg.iobyxmoadg(f23790iobyxmoadg, iobyxmoadgVar, f23791ppxfxbqfkf, btonecajqbVar, btonecajqbVar2);
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        eablkybsjg wkgbmnqykc(iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar) {
            eablkybsjg eablkybsjgVar2;
            do {
                eablkybsjgVar2 = iobyxmoadgVar.f23783yggfygwlhe;
                if (eablkybsjgVar == eablkybsjgVar2) {
                    return eablkybsjgVar2;
                }
            } while (!iobyxmoadg(iobyxmoadgVar, eablkybsjgVar2, eablkybsjgVar));
            return eablkybsjgVar2;
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        boolean zoijcleaow(iobyxmoadg iobyxmoadgVar, Object obj, Object obj2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.iobyxmoadg.iobyxmoadg(f23790iobyxmoadg, iobyxmoadgVar, f23792wkgbmnqykc, obj, obj2);
        }
    }

    private static final class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f23798eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f23799iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f23800ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f23801wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f23802zoijcleaow;

        gxszxtbevo(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f23799iobyxmoadg = atomicReferenceFieldUpdater;
            this.f23802zoijcleaow = atomicReferenceFieldUpdater2;
            this.f23800ppxfxbqfkf = atomicReferenceFieldUpdater3;
            this.f23801wkgbmnqykc = atomicReferenceFieldUpdater4;
            this.f23798eablkybsjg = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        btonecajqb eablkybsjg(iobyxmoadg iobyxmoadgVar, btonecajqb btonecajqbVar) {
            return (btonecajqb) this.f23800ppxfxbqfkf.getAndSet(iobyxmoadgVar, btonecajqbVar);
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        void gxszxtbevo(btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2) {
            this.f23802zoijcleaow.lazySet(btonecajqbVar, btonecajqbVar2);
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar, eablkybsjg eablkybsjgVar2) {
            return androidx.concurrent.futures.zoijcleaow.iobyxmoadg(this.f23801wkgbmnqykc, iobyxmoadgVar, eablkybsjgVar, eablkybsjgVar2);
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        void lqeggnwhkg(btonecajqb btonecajqbVar, Thread thread) {
            this.f23799iobyxmoadg.lazySet(btonecajqbVar, thread);
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        boolean ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2) {
            return androidx.concurrent.futures.zoijcleaow.iobyxmoadg(this.f23800ppxfxbqfkf, iobyxmoadgVar, btonecajqbVar, btonecajqbVar2);
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        eablkybsjg wkgbmnqykc(iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar) {
            return (eablkybsjg) this.f23801wkgbmnqykc.getAndSet(iobyxmoadgVar, eablkybsjgVar);
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        boolean zoijcleaow(iobyxmoadg iobyxmoadgVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.zoijcleaow.iobyxmoadg(this.f23798eablkybsjg, iobyxmoadgVar, obj, obj2);
        }
    }

    private static final class lqeggnwhkg extends zoijcleaow {
        private lqeggnwhkg() {
            super();
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        btonecajqb eablkybsjg(iobyxmoadg iobyxmoadgVar, btonecajqb btonecajqbVar) {
            btonecajqb btonecajqbVar2;
            synchronized (iobyxmoadgVar) {
                try {
                    btonecajqbVar2 = iobyxmoadgVar.f23782jyumaefscl;
                    if (btonecajqbVar2 != btonecajqbVar) {
                        iobyxmoadgVar.f23782jyumaefscl = btonecajqbVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return btonecajqbVar2;
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        void gxszxtbevo(btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2) {
            btonecajqbVar.f23787zoijcleaow = btonecajqbVar2;
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar, eablkybsjg eablkybsjgVar2) {
            synchronized (iobyxmoadgVar) {
                try {
                    if (iobyxmoadgVar.f23783yggfygwlhe != eablkybsjgVar) {
                        return false;
                    }
                    iobyxmoadgVar.f23783yggfygwlhe = eablkybsjgVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        void lqeggnwhkg(btonecajqb btonecajqbVar, Thread thread) {
            btonecajqbVar.f23786iobyxmoadg = thread;
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        boolean ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2) {
            synchronized (iobyxmoadgVar) {
                try {
                    if (iobyxmoadgVar.f23782jyumaefscl != btonecajqbVar) {
                        return false;
                    }
                    iobyxmoadgVar.f23782jyumaefscl = btonecajqbVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        eablkybsjg wkgbmnqykc(iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar) {
            eablkybsjg eablkybsjgVar2;
            synchronized (iobyxmoadgVar) {
                try {
                    eablkybsjgVar2 = iobyxmoadgVar.f23783yggfygwlhe;
                    if (eablkybsjgVar2 != eablkybsjgVar) {
                        iobyxmoadgVar.f23783yggfygwlhe = eablkybsjgVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eablkybsjgVar2;
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg.zoijcleaow
        boolean zoijcleaow(iobyxmoadg iobyxmoadgVar, Object obj, Object obj2) {
            synchronized (iobyxmoadgVar) {
                try {
                    if (iobyxmoadgVar.f23784zdlpuopuiu != obj) {
                        return false;
                    }
                    iobyxmoadgVar.f23784zdlpuopuiu = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static abstract class nufgyqmvbu extends iobyxmoadg implements com.google.common.util.concurrent.wkgbmnqykc {
        nufgyqmvbu() {
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg, java.util.concurrent.Future
        public final boolean cancel(boolean z13) {
            return super.cancel(z13);
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg, java.util.concurrent.Future
        public Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg, com.google.common.util.concurrent.wkgbmnqykc
        public final void iobyxmoadg(Runnable runnable, Executor executor) {
            super.iobyxmoadg(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.iobyxmoadg, java.util.concurrent.Future
        public final Object get(long j13, TimeUnit timeUnit) {
            return super.get(j13, timeUnit);
        }
    }

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        static final ppxfxbqfkf f23803ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        static final ppxfxbqfkf f23804wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final boolean f23805iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Throwable f23806zoijcleaow;

        static {
            if (iobyxmoadg.f23780iwizpuwonk) {
                f23804wkgbmnqykc = null;
                f23803ppxfxbqfkf = null;
            } else {
                f23804wkgbmnqykc = new ppxfxbqfkf(false, null);
                f23803ppxfxbqfkf = new ppxfxbqfkf(true, null);
            }
        }

        ppxfxbqfkf(boolean z13, Throwable th2) {
            this.f23805iobyxmoadg = z13;
            this.f23806zoijcleaow = th2;
        }
    }

    private static final class wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final wkgbmnqykc f23807zoijcleaow = new wkgbmnqykc(new C0411iobyxmoadg("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Throwable f23808iobyxmoadg;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.iobyxmoadg$wkgbmnqykc$iobyxmoadg, reason: collision with other inner class name */
        class C0411iobyxmoadg extends Throwable {
            C0411iobyxmoadg(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        wkgbmnqykc(Throwable th2) {
            this.f23808iobyxmoadg = (Throwable) draadjrbmk.btonecajqb(th2);
        }
    }

    private static abstract class zoijcleaow {
        private zoijcleaow() {
        }

        abstract btonecajqb eablkybsjg(iobyxmoadg iobyxmoadgVar, btonecajqb btonecajqbVar);

        abstract void gxszxtbevo(btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2);

        abstract boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar, eablkybsjg eablkybsjgVar2);

        abstract void lqeggnwhkg(btonecajqb btonecajqbVar, Thread thread);

        abstract boolean ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2);

        abstract eablkybsjg wkgbmnqykc(iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar);

        abstract boolean zoijcleaow(iobyxmoadg iobyxmoadgVar, Object obj, Object obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.common.util.concurrent.iobyxmoadg$iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    static {
        boolean z13;
        zoijcleaow lqeggnwhkgVar;
        try {
            z13 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z13 = false;
        }
        f23780iwizpuwonk = z13;
        f23778cqumvgiudr = new com.google.common.util.concurrent.ppxfxbqfkf(iobyxmoadg.class);
        ?? r13 = 0;
        r13 = 0;
        try {
            lqeggnwhkgVar = new dxjokdxxww();
            e = null;
        } catch (Error | Exception e13) {
            e = e13;
            try {
                lqeggnwhkgVar = new gxszxtbevo(AtomicReferenceFieldUpdater.newUpdater(btonecajqb.class, Thread.class, "iobyxmoadg"), AtomicReferenceFieldUpdater.newUpdater(btonecajqb.class, btonecajqb.class, "zoijcleaow"), AtomicReferenceFieldUpdater.newUpdater(iobyxmoadg.class, btonecajqb.class, "jyumaefscl"), AtomicReferenceFieldUpdater.newUpdater(iobyxmoadg.class, eablkybsjg.class, "yggfygwlhe"), AtomicReferenceFieldUpdater.newUpdater(iobyxmoadg.class, Object.class, "zdlpuopuiu"));
            } catch (Error | Exception e14) {
                lqeggnwhkgVar = new lqeggnwhkg();
                r13 = e14;
            }
        }
        f23779esjtqupxsv = lqeggnwhkgVar;
        if (r13 != 0) {
            com.google.common.util.concurrent.ppxfxbqfkf ppxfxbqfkfVar = f23778cqumvgiudr;
            Logger loggerIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
            Level level = Level.SEVERE;
            loggerIobyxmoadg.log(level, "UnsafeAtomicHelper is broken!", e);
            ppxfxbqfkfVar.iobyxmoadg().log(level, "SafeAtomicHelper is broken!", r13);
        }
        f23781lereixgezr = new Object();
    }

    protected iobyxmoadg() {
    }

    private eablkybsjg agtfadlqog(eablkybsjg eablkybsjgVar) {
        eablkybsjg eablkybsjgVar2 = eablkybsjgVar;
        eablkybsjg eablkybsjgVarWkgbmnqykc = f23779esjtqupxsv.wkgbmnqykc(this, eablkybsjg.f23794wkgbmnqykc);
        while (eablkybsjgVarWkgbmnqykc != null) {
            eablkybsjg eablkybsjgVar3 = eablkybsjgVarWkgbmnqykc.f23796ppxfxbqfkf;
            eablkybsjgVarWkgbmnqykc.f23796ppxfxbqfkf = eablkybsjgVar2;
            eablkybsjgVar2 = eablkybsjgVarWkgbmnqykc;
            eablkybsjgVarWkgbmnqykc = eablkybsjgVar3;
        }
        return eablkybsjgVar2;
    }

    private void btonecajqb(StringBuilder sb3) {
        String strIobyxmoadg;
        int length = sb3.length();
        sb3.append("PENDING");
        try {
            strIobyxmoadg = rgvfuqvkyq.iobyxmoadg(zdlpuopuiu());
        } catch (Exception | StackOverflowError e13) {
            strIobyxmoadg = "Exception thrown from implementation: " + e13.getClass();
        }
        if (strIobyxmoadg != null) {
            sb3.append(", info=[");
            sb3.append(strIobyxmoadg);
            sb3.append("]");
        }
        if (isDone()) {
            sb3.delete(length, sb3.length());
            dxjokdxxww(sb3);
        }
    }

    private void draadjrbmk(StringBuilder sb3, Object obj) {
        if (obj == null) {
            sb3.append("null");
        } else {
            if (obj == this) {
                sb3.append("this future");
                return;
            }
            sb3.append(obj.getClass().getName());
            sb3.append("@");
            sb3.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void dxjokdxxww(StringBuilder sb3) {
        try {
            Object objOxmwwwfdhm = oxmwwwfdhm(this);
            sb3.append("SUCCESS, result=[");
            draadjrbmk(sb3, objOxmwwwfdhm);
            sb3.append("]");
        } catch (CancellationException unused) {
            sb3.append("CANCELLED");
        } catch (ExecutionException e13) {
            sb3.append("FAILURE, cause=[");
            sb3.append(e13.getCause());
            sb3.append("]");
        } catch (Exception e14) {
            sb3.append("UNKNOWN, cause=[");
            sb3.append(e14.getClass());
            sb3.append(" thrown from get()]");
        }
    }

    private void jyumaefscl(btonecajqb btonecajqbVar) {
        btonecajqbVar.f23786iobyxmoadg = null;
        while (true) {
            btonecajqb btonecajqbVar2 = this.f23782jyumaefscl;
            if (btonecajqbVar2 == btonecajqb.f23785ppxfxbqfkf) {
                return;
            }
            btonecajqb btonecajqbVar3 = null;
            while (btonecajqbVar2 != null) {
                btonecajqb btonecajqbVar4 = btonecajqbVar2.f23787zoijcleaow;
                if (btonecajqbVar2.f23786iobyxmoadg != null) {
                    btonecajqbVar3 = btonecajqbVar2;
                } else if (btonecajqbVar3 != null) {
                    btonecajqbVar3.f23787zoijcleaow = btonecajqbVar4;
                    if (btonecajqbVar3.f23786iobyxmoadg == null) {
                    }
                } else if (!f23779esjtqupxsv.ppxfxbqfkf(this, btonecajqbVar2, btonecajqbVar4)) {
                }
                btonecajqbVar2 = btonecajqbVar4;
            }
            return;
        }
    }

    private static void ojitshcjhn(iobyxmoadg iobyxmoadgVar, boolean z13) {
        iobyxmoadgVar.yggfygwlhe();
        if (z13) {
            iobyxmoadgVar.kcexrzcfyt();
        }
        iobyxmoadgVar.gtknphoqwx();
        eablkybsjg eablkybsjgVarAgtfadlqog = iobyxmoadgVar.agtfadlqog(null);
        while (eablkybsjgVarAgtfadlqog != null) {
            eablkybsjg eablkybsjgVar = eablkybsjgVarAgtfadlqog.f23796ppxfxbqfkf;
            Runnable runnable = eablkybsjgVarAgtfadlqog.f23795iobyxmoadg;
            Objects.requireNonNull(runnable);
            Executor executor = eablkybsjgVarAgtfadlqog.f23797zoijcleaow;
            Objects.requireNonNull(executor);
            rgvfuqvkyq(runnable, executor);
            eablkybsjgVarAgtfadlqog = eablkybsjgVar;
        }
    }

    private static Object oxmwwwfdhm(Future future) {
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

    private static void rgvfuqvkyq(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e13) {
            f23778cqumvgiudr.iobyxmoadg().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e13);
        }
    }

    private Object vdvldrhtss(Object obj) throws ExecutionException {
        if (obj instanceof ppxfxbqfkf) {
            throw wflxmlrfwp("Task was cancelled.", ((ppxfxbqfkf) obj).f23806zoijcleaow);
        }
        if (obj instanceof wkgbmnqykc) {
            throw new ExecutionException(((wkgbmnqykc) obj).f23808iobyxmoadg);
        }
        return obj == f23781lereixgezr ? com.google.common.util.concurrent.gxszxtbevo.iobyxmoadg() : obj;
    }

    private static CancellationException wflxmlrfwp(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    private void yggfygwlhe() {
        for (btonecajqb btonecajqbVarEablkybsjg = f23779esjtqupxsv.eablkybsjg(this, btonecajqb.f23785ppxfxbqfkf); btonecajqbVarEablkybsjg != null; btonecajqbVarEablkybsjg = btonecajqbVarEablkybsjg.f23787zoijcleaow) {
            btonecajqbVarEablkybsjg.zoijcleaow();
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z13) {
        ppxfxbqfkf ppxfxbqfkfVar;
        Object obj = this.f23784zdlpuopuiu;
        if (obj == null) {
            if (f23780iwizpuwonk) {
                ppxfxbqfkfVar = new ppxfxbqfkf(z13, new CancellationException("Future.cancel() was called."));
            } else {
                ppxfxbqfkfVar = z13 ? ppxfxbqfkf.f23803ppxfxbqfkf : ppxfxbqfkf.f23804wkgbmnqykc;
                Objects.requireNonNull(ppxfxbqfkfVar);
            }
            if (f23779esjtqupxsv.zoijcleaow(this, obj, ppxfxbqfkfVar)) {
                ojitshcjhn(this, z13);
                return true;
            }
        }
        return false;
    }

    protected boolean cqumvgiudr(Throwable th2) {
        if (!f23779esjtqupxsv.zoijcleaow(this, null, new wkgbmnqykc((Throwable) draadjrbmk.btonecajqb(th2)))) {
            return false;
        }
        ojitshcjhn(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j13, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j13);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f23784zdlpuopuiu;
        if (obj != null) {
            return vdvldrhtss(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            btonecajqb btonecajqbVar = this.f23782jyumaefscl;
            if (btonecajqbVar != btonecajqb.f23785ppxfxbqfkf) {
                btonecajqb btonecajqbVar2 = new btonecajqb();
                while (true) {
                    btonecajqbVar2.iobyxmoadg(btonecajqbVar);
                    if (f23779esjtqupxsv.ppxfxbqfkf(this, btonecajqbVar, btonecajqbVar2)) {
                        do {
                            com.google.common.util.concurrent.lqeggnwhkg.iobyxmoadg(this, nanos);
                            if (Thread.interrupted()) {
                                jyumaefscl(btonecajqbVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f23784zdlpuopuiu;
                            if (obj2 != null) {
                                return vdvldrhtss(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        jyumaefscl(btonecajqbVar2);
                        break;
                    }
                    btonecajqbVar = this.f23782jyumaefscl;
                    if (btonecajqbVar == btonecajqb.f23785ppxfxbqfkf) {
                    }
                }
            }
            Object obj3 = this.f23784zdlpuopuiu;
            Objects.requireNonNull(obj3);
            return vdvldrhtss(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f23784zdlpuopuiu;
            if (obj4 != null) {
                return vdvldrhtss(obj4);
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
    public void iobyxmoadg(Runnable runnable, Executor executor) {
        eablkybsjg eablkybsjgVar;
        draadjrbmk.gtknphoqwx(runnable, "Runnable was null.");
        draadjrbmk.gtknphoqwx(executor, "Executor was null.");
        if (!isDone() && (eablkybsjgVar = this.f23783yggfygwlhe) != eablkybsjg.f23794wkgbmnqykc) {
            eablkybsjg eablkybsjgVar2 = new eablkybsjg(runnable, executor);
            do {
                eablkybsjgVar2.f23796ppxfxbqfkf = eablkybsjgVar;
                if (f23779esjtqupxsv.iobyxmoadg(this, eablkybsjgVar, eablkybsjgVar2)) {
                    return;
                } else {
                    eablkybsjgVar = this.f23783yggfygwlhe;
                }
            } while (eablkybsjgVar != eablkybsjg.f23794wkgbmnqykc);
        }
        rgvfuqvkyq(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f23784zdlpuopuiu instanceof ppxfxbqfkf;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f23784zdlpuopuiu != null;
    }

    protected boolean iwizpuwonk(Object obj) {
        if (obj == null) {
            obj = f23781lereixgezr;
        }
        if (!f23779esjtqupxsv.zoijcleaow(this, null, obj)) {
            return false;
        }
        ojitshcjhn(this, false);
        return true;
    }

    protected void kcexrzcfyt() {
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb3.append(getClass().getSimpleName());
        } else {
            sb3.append(getClass().getName());
        }
        sb3.append('@');
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("[status=");
        if (isCancelled()) {
            sb3.append("CANCELLED");
        } else if (isDone()) {
            dxjokdxxww(sb3);
        } else {
            btonecajqb(sb3);
        }
        sb3.append("]");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String zdlpuopuiu() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    private static final class eablkybsjg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        static final eablkybsjg f23794wkgbmnqykc = new eablkybsjg();

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Runnable f23795iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        eablkybsjg f23796ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Executor f23797zoijcleaow;

        eablkybsjg(Runnable runnable, Executor executor) {
            this.f23795iobyxmoadg = runnable;
            this.f23797zoijcleaow = executor;
        }

        eablkybsjg() {
            this.f23795iobyxmoadg = null;
            this.f23797zoijcleaow = null;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f23784zdlpuopuiu;
            if (obj2 != null) {
                return vdvldrhtss(obj2);
            }
            btonecajqb btonecajqbVar = this.f23782jyumaefscl;
            if (btonecajqbVar != btonecajqb.f23785ppxfxbqfkf) {
                btonecajqb btonecajqbVar2 = new btonecajqb();
                do {
                    btonecajqbVar2.iobyxmoadg(btonecajqbVar);
                    if (f23779esjtqupxsv.ppxfxbqfkf(this, btonecajqbVar, btonecajqbVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f23784zdlpuopuiu;
                            } else {
                                jyumaefscl(btonecajqbVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return vdvldrhtss(obj);
                    }
                    btonecajqbVar = this.f23782jyumaefscl;
                } while (btonecajqbVar != btonecajqb.f23785ppxfxbqfkf);
            }
            Object obj3 = this.f23784zdlpuopuiu;
            Objects.requireNonNull(obj3);
            return vdvldrhtss(obj3);
        }
        throw new InterruptedException();
    }
}
