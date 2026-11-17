package pj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uwvvkdfqfp extends yfnezrywwk implements sopmlzcsov {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f76779cqumvgiudr = AtomicReferenceFieldUpdater.newUpdater(uwvvkdfqfp.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f76780esjtqupxsv = AtomicReferenceFieldUpdater.newUpdater(uwvvkdfqfp.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f76781lereixgezr = AtomicIntegerFieldUpdater.newUpdater(uwvvkdfqfp.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    private final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final agtfadlqog f76783jyumaefscl;

        public iobyxmoadg(long j13, agtfadlqog agtfadlqogVar) {
            super(j13);
            this.f76783jyumaefscl = agtfadlqogVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f76783jyumaefscl.cdpycssgdh(uwvvkdfqfp.this, gg.wwaezpbzkn.f37140iobyxmoadg);
        }

        @Override // pj.uwvvkdfqfp.ppxfxbqfkf
        public String toString() {
            return super.toString() + this.f76783jyumaefscl;
        }
    }

    public static abstract class ppxfxbqfkf implements Runnable, Comparable, jztzpxfvev, uj.dsvhmnatus {
        private volatile Object _heap;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f76784yggfygwlhe = -1;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public long f76785zdlpuopuiu;

        public ppxfxbqfkf(long j13) {
            this.f76785zdlpuopuiu = j13;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public int compareTo(ppxfxbqfkf ppxfxbqfkfVar) {
            long j13 = this.f76785zdlpuopuiu - ppxfxbqfkfVar.f76785zdlpuopuiu;
            if (j13 > 0) {
                return 1;
            }
            return j13 < 0 ? -1 : 0;
        }

        @Override // uj.dsvhmnatus
        public int getIndex() {
            return this.f76784yggfygwlhe;
        }

        public final int gxszxtbevo(long j13, wkgbmnqykc wkgbmnqykcVar, uwvvkdfqfp uwvvkdfqfpVar) {
            synchronized (this) {
                if (this._heap == sflfametgt.f76771iobyxmoadg) {
                    return 2;
                }
                synchronized (wkgbmnqykcVar) {
                    try {
                        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) wkgbmnqykcVar.zoijcleaow();
                        if (uwvvkdfqfpVar.agtfadlqog()) {
                            return 1;
                        }
                        if (ppxfxbqfkfVar == null) {
                            wkgbmnqykcVar.f76786ppxfxbqfkf = j13;
                        } else {
                            long j14 = ppxfxbqfkfVar.f76785zdlpuopuiu;
                            if (j14 - j13 < 0) {
                                j13 = j14;
                            }
                            if (j13 - wkgbmnqykcVar.f76786ppxfxbqfkf > 0) {
                                wkgbmnqykcVar.f76786ppxfxbqfkf = j13;
                            }
                        }
                        long j15 = this.f76785zdlpuopuiu;
                        long j16 = wkgbmnqykcVar.f76786ppxfxbqfkf;
                        if (j15 - j16 < 0) {
                            this.f76785zdlpuopuiu = j16;
                        }
                        wkgbmnqykcVar.iobyxmoadg(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // pj.jztzpxfvev
        public final void iobyxmoadg() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == sflfametgt.f76771iobyxmoadg) {
                        return;
                    }
                    wkgbmnqykc wkgbmnqykcVar = obj instanceof wkgbmnqykc ? (wkgbmnqykc) obj : null;
                    if (wkgbmnqykcVar != null) {
                        wkgbmnqykcVar.nufgyqmvbu(this);
                    }
                    this._heap = sflfametgt.f76771iobyxmoadg;
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final boolean lqeggnwhkg(long j13) {
            return j13 - this.f76785zdlpuopuiu >= 0;
        }

        @Override // uj.dsvhmnatus
        public uj.cllcsxoeiz ppxfxbqfkf() {
            Object obj = this._heap;
            if (obj instanceof uj.cllcsxoeiz) {
                return (uj.cllcsxoeiz) obj;
            }
            return null;
        }

        @Override // uj.dsvhmnatus
        public void setIndex(int i13) {
            this.f76784yggfygwlhe = i13;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f76785zdlpuopuiu + ']';
        }

        @Override // uj.dsvhmnatus
        public void wkgbmnqykc(uj.cllcsxoeiz cllcsxoeizVar) {
            if (this._heap == sflfametgt.f76771iobyxmoadg) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = cllcsxoeizVar;
        }
    }

    public static final class wkgbmnqykc extends uj.cllcsxoeiz {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public long f76786ppxfxbqfkf;

        public wkgbmnqykc(long j13) {
            this.f76786ppxfxbqfkf = j13;
        }
    }

    private static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final Runnable f76787jyumaefscl;

        public zoijcleaow(long j13, Runnable runnable) {
            super(j13);
            this.f76787jyumaefscl = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f76787jyumaefscl.run();
        }

        @Override // pj.uwvvkdfqfp.ppxfxbqfkf
        public String toString() {
            return super.toString() + this.f76787jyumaefscl;
        }
    }

    private final boolean A(ppxfxbqfkf ppxfxbqfkfVar) {
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) f76780esjtqupxsv.get(this);
        return (wkgbmnqykcVar != null ? (ppxfxbqfkf) wkgbmnqykcVar.gxszxtbevo() : null) == ppxfxbqfkfVar;
    }

    private final boolean a(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f76779cqumvgiudr;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (agtfadlqog()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76779cqumvgiudr, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof uj.rgvfuqvkyq) {
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                uj.rgvfuqvkyq rgvfuqvkyqVar = (uj.rgvfuqvkyq) obj;
                int iIobyxmoadg = rgvfuqvkyqVar.iobyxmoadg(runnable);
                if (iIobyxmoadg == 0) {
                    return true;
                }
                if (iIobyxmoadg == 1) {
                    androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76779cqumvgiudr, this, obj, rgvfuqvkyqVar.draadjrbmk());
                } else if (iIobyxmoadg == 2) {
                    return false;
                }
            } else {
                if (obj == sflfametgt.f76772zoijcleaow) {
                    return false;
                }
                uj.rgvfuqvkyq rgvfuqvkyqVar2 = new uj.rgvfuqvkyq(8, true);
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rgvfuqvkyqVar2.iobyxmoadg((Runnable) obj);
                rgvfuqvkyqVar2.iobyxmoadg(runnable);
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76779cqumvgiudr, this, obj, rgvfuqvkyqVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean agtfadlqog() {
        return f76781lereixgezr.get(this) != 0;
    }

    private final Runnable ezmngbhpjk() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f76779cqumvgiudr;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof uj.rgvfuqvkyq) {
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                uj.rgvfuqvkyq rgvfuqvkyqVar = (uj.rgvfuqvkyq) obj;
                Object objWflxmlrfwp = rgvfuqvkyqVar.wflxmlrfwp();
                if (objWflxmlrfwp != uj.rgvfuqvkyq.f113670nufgyqmvbu) {
                    return (Runnable) objWflxmlrfwp;
                }
                androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76779cqumvgiudr, this, obj, rgvfuqvkyqVar.draadjrbmk());
            } else {
                if (obj == sflfametgt.f76772zoijcleaow) {
                    return null;
                }
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76779cqumvgiudr, this, obj, null)) {
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void krqnebusok() {
        uj.dsvhmnatus dsvhmnatusVarDxjokdxxww;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) f76780esjtqupxsv.get(this);
        if (wkgbmnqykcVar == null || wkgbmnqykcVar.eablkybsjg()) {
            return;
        }
        pj.ppxfxbqfkf.iobyxmoadg();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (wkgbmnqykcVar) {
                try {
                    uj.dsvhmnatus dsvhmnatusVarZoijcleaow = wkgbmnqykcVar.zoijcleaow();
                    dsvhmnatusVarDxjokdxxww = null;
                    if (dsvhmnatusVarZoijcleaow != null) {
                        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) dsvhmnatusVarZoijcleaow;
                        dsvhmnatusVarDxjokdxxww = ppxfxbqfkfVar.lqeggnwhkg(jNanoTime) ? a(ppxfxbqfkfVar) : false ? wkgbmnqykcVar.dxjokdxxww(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (((ppxfxbqfkf) dsvhmnatusVarDxjokdxxww) != null);
    }

    private final void m() {
        ppxfxbqfkf ppxfxbqfkfVar;
        pj.ppxfxbqfkf.iobyxmoadg();
        long jNanoTime = System.nanoTime();
        while (true) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) f76780esjtqupxsv.get(this);
            if (wkgbmnqykcVar == null || (ppxfxbqfkfVar = (ppxfxbqfkf) wkgbmnqykcVar.btonecajqb()) == null) {
                return;
            } else {
                hszhottldk(jNanoTime, ppxfxbqfkfVar);
            }
        }
    }

    private final void mhtqkkgtqm() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f76779cqumvgiudr;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76779cqumvgiudr, this, null, sflfametgt.f76772zoijcleaow)) {
                    return;
                }
            } else if (obj instanceof uj.rgvfuqvkyq) {
                ((uj.rgvfuqvkyq) obj).wkgbmnqykc();
                return;
            } else {
                if (obj == sflfametgt.f76772zoijcleaow) {
                    return;
                }
                uj.rgvfuqvkyq rgvfuqvkyqVar = new uj.rgvfuqvkyq(8, true);
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rgvfuqvkyqVar.iobyxmoadg((Runnable) obj);
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76779cqumvgiudr, this, obj, rgvfuqvkyqVar)) {
                    return;
                }
            }
        }
    }

    private final int v(long j13, ppxfxbqfkf ppxfxbqfkfVar) {
        if (agtfadlqog()) {
            return 1;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) f76780esjtqupxsv.get(this);
        if (wkgbmnqykcVar == null) {
            androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76780esjtqupxsv, this, null, new wkgbmnqykc(j13));
            Object obj = f76780esjtqupxsv.get(this);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj);
            wkgbmnqykcVar = (wkgbmnqykc) obj;
        }
        return ppxfxbqfkfVar.gxszxtbevo(j13, wkgbmnqykcVar, this);
    }

    private final void z(boolean z13) {
        f76781lereixgezr.set(this, z13 ? 1 : 0);
    }

    @Override // pj.sopmlzcsov
    public void cdpycssgdh(long j13, agtfadlqog agtfadlqogVar) {
        long jPpxfxbqfkf = sflfametgt.ppxfxbqfkf(j13);
        if (jPpxfxbqfkf < 4611686018427387903L) {
            pj.ppxfxbqfkf.iobyxmoadg();
            long jNanoTime = System.nanoTime();
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(jPpxfxbqfkf + jNanoTime, agtfadlqogVar);
            r(jNanoTime, iobyxmoadgVar);
            oxmwwwfdhm.iobyxmoadg(agtfadlqogVar, iobyxmoadgVar);
        }
    }

    @Override // pj.pkzmftpjix
    public final void dsvhmnatus(lg.btonecajqb btonecajqbVar, Runnable runnable) {
        rhgxfdycjh(runnable);
    }

    public jztzpxfvev hkdspvbjdz(long j13, Runnable runnable, lg.btonecajqb btonecajqbVar) {
        return sopmlzcsov.iobyxmoadg.iobyxmoadg(this, j13, runnable, btonecajqbVar);
    }

    protected boolean i() {
        if (!nuxfzjnpeb()) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) f76780esjtqupxsv.get(this);
        if (wkgbmnqykcVar != null && !wkgbmnqykcVar.eablkybsjg()) {
            return false;
        }
        Object obj = f76779cqumvgiudr.get(this);
        if (obj != null) {
            if (obj instanceof uj.rgvfuqvkyq) {
                return ((uj.rgvfuqvkyq) obj).btonecajqb();
            }
            if (obj != sflfametgt.f76772zoijcleaow) {
                return false;
            }
        }
        return true;
    }

    protected final void q() {
        f76779cqumvgiudr.set(this, null);
        f76780esjtqupxsv.set(this, null);
    }

    public final void r(long j13, ppxfxbqfkf ppxfxbqfkfVar) {
        int iV = v(j13, ppxfxbqfkfVar);
        if (iV == 0) {
            if (A(ppxfxbqfkfVar)) {
                ageimvtcrz();
            }
        } else if (iV == 1) {
            hszhottldk(j13, ppxfxbqfkfVar);
        } else if (iV != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    public void rhgxfdycjh(Runnable runnable) {
        krqnebusok();
        if (a(runnable)) {
            ageimvtcrz();
        } else {
            tzroggbefp.f76776pmvmpeiblj.rhgxfdycjh(runnable);
        }
    }

    @Override // pj.czzsidtyhn
    public void shutdown() {
        c.f76674iobyxmoadg.ppxfxbqfkf();
        z(true);
        mhtqkkgtqm();
        while (tbqsvytpvh() <= 0) {
        }
        m();
    }

    @Override // pj.czzsidtyhn
    public long tbqsvytpvh() {
        if (uawqvzlxes()) {
            return 0L;
        }
        krqnebusok();
        Runnable runnableEzmngbhpjk = ezmngbhpjk();
        if (runnableEzmngbhpjk == null) {
            return zfvoamnweg();
        }
        runnableEzmngbhpjk.run();
        return 0L;
    }

    protected final jztzpxfvev w(long j13, Runnable runnable) {
        long jPpxfxbqfkf = sflfametgt.ppxfxbqfkf(j13);
        if (jPpxfxbqfkf >= 4611686018427387903L) {
            return grlcpdaxtj.f76704zdlpuopuiu;
        }
        pj.ppxfxbqfkf.iobyxmoadg();
        long jNanoTime = System.nanoTime();
        zoijcleaow zoijcleaowVar = new zoijcleaow(jPpxfxbqfkf + jNanoTime, runnable);
        r(jNanoTime, zoijcleaowVar);
        return zoijcleaowVar;
    }

    @Override // pj.czzsidtyhn
    protected long zfvoamnweg() {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (super.zfvoamnweg() == 0) {
            return 0L;
        }
        Object obj = f76779cqumvgiudr.get(this);
        if (obj != null) {
            if (!(obj instanceof uj.rgvfuqvkyq)) {
                return obj == sflfametgt.f76772zoijcleaow ? Long.MAX_VALUE : 0L;
            }
            if (!((uj.rgvfuqvkyq) obj).btonecajqb()) {
                return 0L;
            }
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) f76780esjtqupxsv.get(this);
        if (wkgbmnqykcVar == null || (ppxfxbqfkfVar = (ppxfxbqfkf) wkgbmnqykcVar.gxszxtbevo()) == null) {
            return Long.MAX_VALUE;
        }
        long j13 = ppxfxbqfkfVar.f76785zdlpuopuiu;
        pj.ppxfxbqfkf.iobyxmoadg();
        return zg.gtknphoqwx.lqeggnwhkg(j13 - System.nanoTime(), 0L);
    }
}
