package wj;

import com.google.android.gms.location.DeviceOrientationRequest;
import gg.wwaezpbzkn;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.hkdspvbjdz;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.kegysxyocb;
import uj.cqumvgiudr;
import uj.istkbnxepw;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final wj.wkgbmnqykc f119944cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final wj.wkgbmnqykc f119945esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final String f119946iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final long f119947jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public final cqumvgiudr f119948lereixgezr;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final int f119949yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final int f119950zdlpuopuiu;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final C2997iobyxmoadg f119941pmvmpeiblj = new C2997iobyxmoadg(null);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f119943zynmafqrjb = AtomicLongFieldUpdater.newUpdater(iobyxmoadg.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f119940istkbnxepw = AtomicLongFieldUpdater.newUpdater(iobyxmoadg.class, "controlState$volatile");

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f119939cdpycssgdh = AtomicIntegerFieldUpdater.newUpdater(iobyxmoadg.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final istkbnxepw f119942yadqdtsiqt = new istkbnxepw("NOT_IN_STACK");

    /* JADX INFO: renamed from: wj.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2997iobyxmoadg {
        public /* synthetic */ C2997iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2997iobyxmoadg() {
        }
    }

    public enum wkgbmnqykc {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f119964lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f119967iobyxmoadg;

        static {
            int[] iArr = new int[wkgbmnqykc.values().length];
            try {
                iArr[wkgbmnqykc.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wkgbmnqykc.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wkgbmnqykc.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[wkgbmnqykc.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[wkgbmnqykc.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f119967iobyxmoadg = iArr;
        }
    }

    public iobyxmoadg(int i13, int i14, long j13, String str) {
        this.f119950zdlpuopuiu = i13;
        this.f119949yggfygwlhe = i14;
        this.f119947jyumaefscl = j13;
        this.f119946iwizpuwonk = str;
        if (i13 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i13 + " should be at least 1").toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(("Max pool size " + i14 + " should be greater than or equals to core pool size " + i13).toString());
        }
        if (i14 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i14 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j13 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j13 + " must be positive").toString());
        }
        this.f119944cqumvgiudr = new wj.wkgbmnqykc();
        this.f119945esjtqupxsv = new wj.wkgbmnqykc();
        this.f119948lereixgezr = new cqumvgiudr((i13 + 1) * 2);
        this.controlState$volatile = ((long) i13) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void agtfadlqog(iobyxmoadg iobyxmoadgVar, Runnable runnable, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        if ((i13 & 4) != 0) {
            z14 = false;
        }
        iobyxmoadgVar.draadjrbmk(runnable, z13, z14);
    }

    private final ppxfxbqfkf btonecajqb() {
        Thread threadCurrentThread = Thread.currentThread();
        ppxfxbqfkf ppxfxbqfkfVar = threadCurrentThread instanceof ppxfxbqfkf ? (ppxfxbqfkf) threadCurrentThread : null;
        if (ppxfxbqfkfVar == null || !zdlpuopuiu.eablkybsjg(iobyxmoadg.this, this)) {
            return null;
        }
        return ppxfxbqfkfVar;
    }

    private final ppxfxbqfkf cqumvgiudr() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f119943zynmafqrjb;
        while (true) {
            long j13 = atomicLongFieldUpdater.get(this);
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f119948lereixgezr.zoijcleaow((int) (2097151 & j13));
            if (ppxfxbqfkfVar == null) {
                return null;
            }
            long j14 = (2097152 + j13) & (-2097152);
            int iJyumaefscl = jyumaefscl(ppxfxbqfkfVar);
            if (iJyumaefscl >= 0 && f119943zynmafqrjb.compareAndSet(this, j13, ((long) iJyumaefscl) | j14)) {
                ppxfxbqfkfVar.ojitshcjhn(f119942yadqdtsiqt);
                return ppxfxbqfkfVar;
            }
        }
    }

    private final nufgyqmvbu dsvhmnatus(ppxfxbqfkf ppxfxbqfkfVar, nufgyqmvbu nufgyqmvbuVar, boolean z13) {
        wkgbmnqykc wkgbmnqykcVar;
        if (ppxfxbqfkfVar == null || (wkgbmnqykcVar = ppxfxbqfkfVar.f119955jyumaefscl) == wkgbmnqykc.TERMINATED) {
            return nufgyqmvbuVar;
        }
        if (!nufgyqmvbuVar.f119968yggfygwlhe && wkgbmnqykcVar == wkgbmnqykc.BLOCKING) {
            return nufgyqmvbuVar;
        }
        ppxfxbqfkfVar.f119956lereixgezr = true;
        return ppxfxbqfkfVar.f119959zdlpuopuiu.iobyxmoadg(nufgyqmvbuVar, z13);
    }

    private final int jyumaefscl(ppxfxbqfkf ppxfxbqfkfVar) {
        Object objLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg();
        while (objLqeggnwhkg != f119942yadqdtsiqt) {
            if (objLqeggnwhkg == null) {
                return 0;
            }
            ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) objLqeggnwhkg;
            int iGxszxtbevo = ppxfxbqfkfVar2.gxszxtbevo();
            if (iGxszxtbevo != 0) {
                return iGxszxtbevo;
            }
            objLqeggnwhkg = ppxfxbqfkfVar2.lqeggnwhkg();
        }
        return -1;
    }

    static /* synthetic */ boolean kegysxyocb(iobyxmoadg iobyxmoadgVar, long j13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j13 = f119940istkbnxepw.get(iobyxmoadgVar);
        }
        return iobyxmoadgVar.wypolnanlu(j13);
    }

    private final int lqeggnwhkg() {
        synchronized (this.f119948lereixgezr) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j13 = f119940istkbnxepw.get(this);
                int i13 = (int) (j13 & 2097151);
                int iGxszxtbevo = zg.gtknphoqwx.gxszxtbevo(i13 - ((int) ((j13 & 4398044413952L) >> 21)), 0);
                if (iGxszxtbevo >= this.f119950zdlpuopuiu) {
                    return 0;
                }
                if (i13 >= this.f119949yggfygwlhe) {
                    return 0;
                }
                int i14 = ((int) (ojitshcjhn().get(this) & 2097151)) + 1;
                if (i14 <= 0 || this.f119948lereixgezr.zoijcleaow(i14) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this, i14);
                this.f119948lereixgezr.ppxfxbqfkf(i14, ppxfxbqfkfVar);
                if (i14 != ((int) (2097151 & f119940istkbnxepw.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i15 = iGxszxtbevo + 1;
                ppxfxbqfkfVar.start();
                return i15;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean mbcevpiqjq() {
        ppxfxbqfkf ppxfxbqfkfVarCqumvgiudr;
        do {
            ppxfxbqfkfVarCqumvgiudr = cqumvgiudr();
            if (ppxfxbqfkfVarCqumvgiudr == null) {
                return false;
            }
        } while (!ppxfxbqfkf.f119951zynmafqrjb.compareAndSet(ppxfxbqfkfVarCqumvgiudr, -1, 0));
        LockSupport.unpark(ppxfxbqfkfVarCqumvgiudr);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater ojitshcjhn() {
        return f119940istkbnxepw;
    }

    private final boolean wkgbmnqykc(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f119968yggfygwlhe ? this.f119945esjtqupxsv.iobyxmoadg(nufgyqmvbuVar) : this.f119944cqumvgiudr.iobyxmoadg(nufgyqmvbuVar);
    }

    private final void wwaezpbzkn(long j13, boolean z13) {
        if (z13 || mbcevpiqjq() || wypolnanlu(j13)) {
            return;
        }
        mbcevpiqjq();
    }

    private final boolean wypolnanlu(long j13) {
        if (zg.gtknphoqwx.gxszxtbevo(((int) (2097151 & j13)) - ((int) ((j13 & 4398044413952L) >> 21)), 0) < this.f119950zdlpuopuiu) {
            int iLqeggnwhkg = lqeggnwhkg();
            if (iLqeggnwhkg == 1 && this.f119950zdlpuopuiu > 1) {
                lqeggnwhkg();
            }
            if (iLqeggnwhkg > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public final void cdpycssgdh(long j13) throws InterruptedException {
        int i13;
        nufgyqmvbu nufgyqmvbuVarEablkybsjg;
        if (f119939cdpycssgdh.compareAndSet(this, 0, 1)) {
            ppxfxbqfkf ppxfxbqfkfVarBtonecajqb = btonecajqb();
            synchronized (this.f119948lereixgezr) {
                i13 = (int) (ojitshcjhn().get(this) & 2097151);
            }
            if (1 <= i13) {
                int i14 = 1;
                while (true) {
                    Object objZoijcleaow = this.f119948lereixgezr.zoijcleaow(i14);
                    zdlpuopuiu.lqeggnwhkg(objZoijcleaow);
                    ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) objZoijcleaow;
                    if (ppxfxbqfkfVar != ppxfxbqfkfVarBtonecajqb) {
                        while (ppxfxbqfkfVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(ppxfxbqfkfVar);
                            ppxfxbqfkfVar.join(j13);
                        }
                        ppxfxbqfkfVar.f119959zdlpuopuiu.btonecajqb(this.f119945esjtqupxsv);
                    }
                    if (i14 == i13) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f119945esjtqupxsv.zoijcleaow();
            this.f119944cqumvgiudr.zoijcleaow();
            while (true) {
                if (ppxfxbqfkfVarBtonecajqb == null) {
                    nufgyqmvbuVarEablkybsjg = (nufgyqmvbu) this.f119944cqumvgiudr.eablkybsjg();
                    if (nufgyqmvbuVarEablkybsjg == null && (nufgyqmvbuVarEablkybsjg = (nufgyqmvbu) this.f119945esjtqupxsv.eablkybsjg()) == null) {
                        break;
                    }
                } else {
                    nufgyqmvbuVarEablkybsjg = ppxfxbqfkfVarBtonecajqb.eablkybsjg(true);
                    if (nufgyqmvbuVarEablkybsjg == null) {
                        nufgyqmvbuVarEablkybsjg = (nufgyqmvbu) this.f119944cqumvgiudr.eablkybsjg();
                        if (nufgyqmvbuVarEablkybsjg == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                istkbnxepw(nufgyqmvbuVarEablkybsjg);
            }
            if (ppxfxbqfkfVarBtonecajqb != null) {
                ppxfxbqfkfVarBtonecajqb.oxmwwwfdhm(wkgbmnqykc.TERMINATED);
            }
            f119943zynmafqrjb.set(this, 0L);
            f119940istkbnxepw.set(this, 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        cdpycssgdh(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
    }

    public final void draadjrbmk(Runnable runnable, boolean z13, boolean z14) {
        pj.ppxfxbqfkf.iobyxmoadg();
        nufgyqmvbu nufgyqmvbuVarNufgyqmvbu = nufgyqmvbu(runnable, z13);
        boolean z15 = nufgyqmvbuVarNufgyqmvbu.f119968yggfygwlhe;
        long jAddAndGet = z15 ? f119940istkbnxepw.addAndGet(this, 2097152L) : 0L;
        ppxfxbqfkf ppxfxbqfkfVarBtonecajqb = btonecajqb();
        nufgyqmvbu nufgyqmvbuVarDsvhmnatus = dsvhmnatus(ppxfxbqfkfVarBtonecajqb, nufgyqmvbuVarNufgyqmvbu, z14);
        if (nufgyqmvbuVarDsvhmnatus != null && !wkgbmnqykc(nufgyqmvbuVarDsvhmnatus)) {
            throw new RejectedExecutionException(this.f119946iwizpuwonk + " was terminated");
        }
        boolean z16 = z14 && ppxfxbqfkfVarBtonecajqb != null;
        if (z15) {
            wwaezpbzkn(jAddAndGet, z16);
        } else {
            if (z16) {
                return;
            }
            hkdspvbjdz();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        agtfadlqog(this, runnable, false, false, 6, null);
    }

    public final void hkdspvbjdz() {
        if (mbcevpiqjq() || kegysxyocb(this, 0L, 1, null)) {
            return;
        }
        mbcevpiqjq();
    }

    public final boolean isTerminated() {
        return f119939cdpycssgdh.get(this) != 0;
    }

    public final void istkbnxepw(nufgyqmvbu nufgyqmvbuVar) {
        try {
            nufgyqmvbuVar.run();
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            } finally {
                pj.ppxfxbqfkf.iobyxmoadg();
            }
        }
    }

    public final boolean lereixgezr(ppxfxbqfkf ppxfxbqfkfVar) {
        long j13;
        int iGxszxtbevo;
        if (ppxfxbqfkfVar.lqeggnwhkg() != f119942yadqdtsiqt) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f119943zynmafqrjb;
        do {
            j13 = atomicLongFieldUpdater.get(this);
            iGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo();
            ppxfxbqfkfVar.ojitshcjhn(this.f119948lereixgezr.zoijcleaow((int) (2097151 & j13)));
        } while (!f119943zynmafqrjb.compareAndSet(this, j13, ((2097152 + j13) & (-2097152)) | ((long) iGxszxtbevo)));
        return true;
    }

    public final nufgyqmvbu nufgyqmvbu(Runnable runnable, boolean z13) {
        long jIobyxmoadg = btonecajqb.f119921gxszxtbevo.iobyxmoadg();
        if (!(runnable instanceof nufgyqmvbu)) {
            return btonecajqb.zoijcleaow(runnable, jIobyxmoadg, z13);
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) runnable;
        nufgyqmvbuVar.f119969zdlpuopuiu = jIobyxmoadg;
        nufgyqmvbuVar.f119968yggfygwlhe = z13;
        return nufgyqmvbuVar;
    }

    public final void pmvmpeiblj(ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f119943zynmafqrjb;
        while (true) {
            long j13 = atomicLongFieldUpdater.get(this);
            int iJyumaefscl = (int) (2097151 & j13);
            long j14 = (2097152 + j13) & (-2097152);
            if (iJyumaefscl == i13) {
                iJyumaefscl = i14 == 0 ? jyumaefscl(ppxfxbqfkfVar) : i14;
            }
            if (iJyumaefscl >= 0 && f119943zynmafqrjb.compareAndSet(this, j13, j14 | ((long) iJyumaefscl))) {
                return;
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iIobyxmoadg = this.f119948lereixgezr.iobyxmoadg();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 1; i18 < iIobyxmoadg; i18++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f119948lereixgezr.zoijcleaow(i18);
            if (ppxfxbqfkfVar != null) {
                int iDxjokdxxww = ppxfxbqfkfVar.f119959zdlpuopuiu.dxjokdxxww();
                int i19 = zoijcleaow.f119967iobyxmoadg[ppxfxbqfkfVar.f119955jyumaefscl.ordinal()];
                if (i19 == 1) {
                    i15++;
                } else if (i19 == 2) {
                    i14++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(iDxjokdxxww);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (i19 == 3) {
                    i13++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(iDxjokdxxww);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                } else if (i19 == 4) {
                    i16++;
                    if (iDxjokdxxww > 0) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(iDxjokdxxww);
                        sb5.append('d');
                        arrayList.add(sb5.toString());
                    }
                } else {
                    if (i19 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i17++;
                }
            }
        }
        long j13 = f119940istkbnxepw.get(this);
        return this.f119946iwizpuwonk + '@' + kegysxyocb.zoijcleaow(this) + "[Pool Size {core = " + this.f119950zdlpuopuiu + ", max = " + this.f119949yggfygwlhe + "}, Worker States {CPU = " + i13 + ", blocking = " + i14 + ", parked = " + i15 + ", dormant = " + i16 + ", terminated = " + i17 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f119944cqumvgiudr.ppxfxbqfkf() + ", global blocking queue size = " + this.f119945esjtqupxsv.ppxfxbqfkf() + ", Control State {created workers= " + ((int) (2097151 & j13)) + ", blocking tasks = " + ((int) ((4398044413952L & j13) >> 21)) + ", CPUs acquired = " + (this.f119950zdlpuopuiu - ((int) ((9223367638808264704L & j13) >> 42))) + "}]";
    }

    public final class ppxfxbqfkf extends Thread {

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f119951zynmafqrjb = AtomicIntegerFieldUpdater.newUpdater(ppxfxbqfkf.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private long f119952cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private int f119953esjtqupxsv;
        private volatile int indexInArray;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private long f119954iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public wkgbmnqykc f119955jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        public boolean f119956lereixgezr;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final hkdspvbjdz f119958yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final draadjrbmk f119959zdlpuopuiu;

        private ppxfxbqfkf() {
            setDaemon(true);
            setContextClassLoader(iobyxmoadg.this.getClass().getClassLoader());
            this.f119959zdlpuopuiu = new draadjrbmk();
            this.f119958yggfygwlhe = new hkdspvbjdz();
            this.f119955jyumaefscl = wkgbmnqykc.DORMANT;
            this.nextParkedWorker = iobyxmoadg.f119942yadqdtsiqt;
            int iNanoTime = (int) System.nanoTime();
            this.f119953esjtqupxsv = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final nufgyqmvbu draadjrbmk() {
            if (btonecajqb(2) == 0) {
                nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) iobyxmoadg.this.f119944cqumvgiudr.eablkybsjg();
                return nufgyqmvbuVar != null ? nufgyqmvbuVar : (nufgyqmvbu) iobyxmoadg.this.f119945esjtqupxsv.eablkybsjg();
            }
            nufgyqmvbu nufgyqmvbuVar2 = (nufgyqmvbu) iobyxmoadg.this.f119945esjtqupxsv.eablkybsjg();
            return nufgyqmvbuVar2 != null ? nufgyqmvbuVar2 : (nufgyqmvbu) iobyxmoadg.this.f119944cqumvgiudr.eablkybsjg();
        }

        private final boolean dxjokdxxww() {
            return this.nextParkedWorker != iobyxmoadg.f119942yadqdtsiqt;
        }

        private final void gtknphoqwx() {
            if (this.f119954iwizpuwonk == 0) {
                this.f119954iwizpuwonk = System.nanoTime() + iobyxmoadg.this.f119947jyumaefscl;
            }
            LockSupport.parkNanos(iobyxmoadg.this.f119947jyumaefscl);
            if (System.nanoTime() - this.f119954iwizpuwonk >= 0) {
                this.f119954iwizpuwonk = 0L;
                zdlpuopuiu();
            }
        }

        private final nufgyqmvbu kcexrzcfyt(int i13) {
            int i14 = (int) (iobyxmoadg.ojitshcjhn().get(iobyxmoadg.this) & 2097151);
            if (i14 < 2) {
                return null;
            }
            int iBtonecajqb = btonecajqb(i14);
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            long jMin = Long.MAX_VALUE;
            for (int i15 = 0; i15 < i14; i15++) {
                iBtonecajqb++;
                if (iBtonecajqb > i14) {
                    iBtonecajqb = 1;
                }
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f119948lereixgezr.zoijcleaow(iBtonecajqb);
                if (ppxfxbqfkfVar != null && ppxfxbqfkfVar != this) {
                    long jOxmwwwfdhm = ppxfxbqfkfVar.f119959zdlpuopuiu.oxmwwwfdhm(i13, this.f119958yggfygwlhe);
                    if (jOxmwwwfdhm == -1) {
                        hkdspvbjdz hkdspvbjdzVar = this.f119958yggfygwlhe;
                        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) hkdspvbjdzVar.f60015zdlpuopuiu;
                        hkdspvbjdzVar.f60015zdlpuopuiu = null;
                        return nufgyqmvbuVar;
                    }
                    if (jOxmwwwfdhm > 0) {
                        jMin = Math.min(jMin, jOxmwwwfdhm);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f119952cqumvgiudr = jMin;
            return null;
        }

        private final nufgyqmvbu ppxfxbqfkf(boolean z13) {
            nufgyqmvbu nufgyqmvbuVarDraadjrbmk;
            nufgyqmvbu nufgyqmvbuVarDraadjrbmk2;
            if (z13) {
                boolean z14 = btonecajqb(iobyxmoadg.this.f119950zdlpuopuiu * 2) == 0;
                if (z14 && (nufgyqmvbuVarDraadjrbmk2 = draadjrbmk()) != null) {
                    return nufgyqmvbuVarDraadjrbmk2;
                }
                nufgyqmvbu nufgyqmvbuVarGtknphoqwx = this.f119959zdlpuopuiu.gtknphoqwx();
                if (nufgyqmvbuVarGtknphoqwx != null) {
                    return nufgyqmvbuVarGtknphoqwx;
                }
                if (!z14 && (nufgyqmvbuVarDraadjrbmk = draadjrbmk()) != null) {
                    return nufgyqmvbuVarDraadjrbmk;
                }
            } else {
                nufgyqmvbu nufgyqmvbuVarDraadjrbmk3 = draadjrbmk();
                if (nufgyqmvbuVarDraadjrbmk3 != null) {
                    return nufgyqmvbuVarDraadjrbmk3;
                }
            }
            return kcexrzcfyt(3);
        }

        private final boolean rgvfuqvkyq() {
            long j13;
            if (this.f119955jyumaefscl == wkgbmnqykc.CPU_ACQUIRED) {
                return true;
            }
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterOjitshcjhn = iobyxmoadg.ojitshcjhn();
            do {
                j13 = atomicLongFieldUpdaterOjitshcjhn.get(iobyxmoadgVar);
                if (((int) ((9223367638808264704L & j13) >> 42)) == 0) {
                    return false;
                }
            } while (!iobyxmoadg.ojitshcjhn().compareAndSet(iobyxmoadgVar, j13, j13 - 4398046511104L));
            this.f119955jyumaefscl = wkgbmnqykc.CPU_ACQUIRED;
            return true;
        }

        private final void vdvldrhtss() {
            if (!dxjokdxxww()) {
                iobyxmoadg.this.lereixgezr(this);
                return;
            }
            f119951zynmafqrjb.set(this, -1);
            while (dxjokdxxww() && f119951zynmafqrjb.get(this) == -1 && !iobyxmoadg.this.isTerminated() && this.f119955jyumaefscl != wkgbmnqykc.TERMINATED) {
                oxmwwwfdhm(wkgbmnqykc.PARKING);
                Thread.interrupted();
                gtknphoqwx();
            }
        }

        private final void wflxmlrfwp() {
            loop0: while (true) {
                boolean z13 = false;
                while (true) {
                    if (iobyxmoadg.this.isTerminated() || this.f119955jyumaefscl == wkgbmnqykc.TERMINATED) {
                        break loop0;
                    }
                    nufgyqmvbu nufgyqmvbuVarEablkybsjg = eablkybsjg(this.f119956lereixgezr);
                    if (nufgyqmvbuVarEablkybsjg != null) {
                        this.f119952cqumvgiudr = 0L;
                        zoijcleaow(nufgyqmvbuVarEablkybsjg);
                        break;
                    }
                    this.f119956lereixgezr = false;
                    if (this.f119952cqumvgiudr == 0) {
                        vdvldrhtss();
                    } else {
                        if (z13) {
                            oxmwwwfdhm(wkgbmnqykc.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f119952cqumvgiudr);
                            this.f119952cqumvgiudr = 0L;
                            break;
                        }
                        z13 = true;
                    }
                }
            }
            oxmwwwfdhm(wkgbmnqykc.TERMINATED);
        }

        private final nufgyqmvbu wkgbmnqykc() {
            nufgyqmvbu nufgyqmvbuVarDraadjrbmk = this.f119959zdlpuopuiu.draadjrbmk();
            if (nufgyqmvbuVarDraadjrbmk != null) {
                return nufgyqmvbuVarDraadjrbmk;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) iobyxmoadg.this.f119945esjtqupxsv.eablkybsjg();
            return nufgyqmvbuVar == null ? kcexrzcfyt(1) : nufgyqmvbuVar;
        }

        private final void zdlpuopuiu() {
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            synchronized (iobyxmoadgVar.f119948lereixgezr) {
                try {
                    if (iobyxmoadgVar.isTerminated()) {
                        return;
                    }
                    if (((int) (iobyxmoadg.ojitshcjhn().get(iobyxmoadgVar) & 2097151)) <= iobyxmoadgVar.f119950zdlpuopuiu) {
                        return;
                    }
                    if (f119951zynmafqrjb.compareAndSet(this, -1, 1)) {
                        int i13 = this.indexInArray;
                        agtfadlqog(0);
                        iobyxmoadgVar.pmvmpeiblj(this, i13, 0);
                        int andDecrement = (int) (iobyxmoadg.ojitshcjhn().getAndDecrement(iobyxmoadgVar) & 2097151);
                        if (andDecrement != i13) {
                            Object objZoijcleaow = iobyxmoadgVar.f119948lereixgezr.zoijcleaow(andDecrement);
                            zdlpuopuiu.lqeggnwhkg(objZoijcleaow);
                            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) objZoijcleaow;
                            iobyxmoadgVar.f119948lereixgezr.ppxfxbqfkf(i13, ppxfxbqfkfVar);
                            ppxfxbqfkfVar.agtfadlqog(i13);
                            iobyxmoadgVar.pmvmpeiblj(ppxfxbqfkfVar, andDecrement, i13);
                        }
                        iobyxmoadgVar.f119948lereixgezr.ppxfxbqfkf(andDecrement, null);
                        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                        this.f119955jyumaefscl = wkgbmnqykc.TERMINATED;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private final void zoijcleaow(nufgyqmvbu nufgyqmvbuVar) {
            this.f119954iwizpuwonk = 0L;
            if (this.f119955jyumaefscl == wkgbmnqykc.PARKING) {
                this.f119955jyumaefscl = wkgbmnqykc.BLOCKING;
            }
            if (!nufgyqmvbuVar.f119968yggfygwlhe) {
                iobyxmoadg.this.istkbnxepw(nufgyqmvbuVar);
                return;
            }
            if (oxmwwwfdhm(wkgbmnqykc.BLOCKING)) {
                iobyxmoadg.this.hkdspvbjdz();
            }
            iobyxmoadg.this.istkbnxepw(nufgyqmvbuVar);
            iobyxmoadg.ojitshcjhn().addAndGet(iobyxmoadg.this, -2097152L);
            if (this.f119955jyumaefscl != wkgbmnqykc.TERMINATED) {
                this.f119955jyumaefscl = wkgbmnqykc.DORMANT;
            }
        }

        public final void agtfadlqog(int i13) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(iobyxmoadg.this.f119946iwizpuwonk);
            sb3.append("-worker-");
            sb3.append(i13 == 0 ? "TERMINATED" : String.valueOf(i13));
            setName(sb3.toString());
            this.indexInArray = i13;
        }

        public final int btonecajqb(int i13) {
            int i14 = this.f119953esjtqupxsv;
            int i15 = i14 ^ (i14 << 13);
            int i16 = i15 ^ (i15 >> 17);
            int i17 = i16 ^ (i16 << 5);
            this.f119953esjtqupxsv = i17;
            int i18 = i13 - 1;
            return (i18 & i13) == 0 ? i17 & i18 : (i17 & Integer.MAX_VALUE) % i13;
        }

        public final nufgyqmvbu eablkybsjg(boolean z13) {
            return rgvfuqvkyq() ? ppxfxbqfkf(z13) : wkgbmnqykc();
        }

        public final int gxszxtbevo() {
            return this.indexInArray;
        }

        public final Object lqeggnwhkg() {
            return this.nextParkedWorker;
        }

        public final void ojitshcjhn(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean oxmwwwfdhm(wkgbmnqykc wkgbmnqykcVar) {
            wkgbmnqykc wkgbmnqykcVar2 = this.f119955jyumaefscl;
            boolean z13 = wkgbmnqykcVar2 == wkgbmnqykc.CPU_ACQUIRED;
            if (z13) {
                iobyxmoadg.ojitshcjhn().addAndGet(iobyxmoadg.this, 4398046511104L);
            }
            if (wkgbmnqykcVar2 != wkgbmnqykcVar) {
                this.f119955jyumaefscl = wkgbmnqykcVar;
            }
            return z13;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            wflxmlrfwp();
        }

        public ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, int i13) {
            this();
            agtfadlqog(i13);
        }
    }
}
