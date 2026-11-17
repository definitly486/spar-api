package yj;

import gg.wwaezpbzkn;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.agtfadlqog;
import pj.j;
import pj.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import uj.lereixgezr;
import uj.pmvmpeiblj;

/* JADX INFO: loaded from: classes3.dex */
public class btonecajqb {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f125482iobyxmoadg;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final vdvldrhtss f125483zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f125480ppxfxbqfkf = AtomicReferenceFieldUpdater.newUpdater(btonecajqb.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f125481wkgbmnqykc = AtomicLongFieldUpdater.newUpdater(btonecajqb.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f125477eablkybsjg = AtomicReferenceFieldUpdater.newUpdater(btonecajqb.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f125478gxszxtbevo = AtomicLongFieldUpdater.newUpdater(btonecajqb.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f125479lqeggnwhkg = AtomicIntegerFieldUpdater.newUpdater(btonecajqb.class, "_availablePermits$volatile");

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f125484zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(2, draadjrbmk.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).longValue(), (wflxmlrfwp) obj2);
        }

        public final wflxmlrfwp iobyxmoadg(long j13, wflxmlrfwp wflxmlrfwpVar) {
            return draadjrbmk.btonecajqb(j13, wflxmlrfwpVar);
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f125485zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(2, draadjrbmk.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).longValue(), (wflxmlrfwp) obj2);
        }

        public final wflxmlrfwp iobyxmoadg(long j13, wflxmlrfwp wflxmlrfwpVar) {
            return draadjrbmk.btonecajqb(j13, wflxmlrfwpVar);
        }
    }

    public btonecajqb(int i13, int i14) {
        this.f125482iobyxmoadg = i13;
        if (i13 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i13).toString());
        }
        if (i14 < 0 || i14 > i13) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i13).toString());
        }
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(0L, null, 2);
        this.head$volatile = wflxmlrfwpVar;
        this.tail$volatile = wflxmlrfwpVar;
        this._availablePermits$volatile = i13 - i14;
        this.f125483zoijcleaow = new vdvldrhtss() { // from class: yj.dxjokdxxww
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return btonecajqb.kcexrzcfyt(this.f125492zdlpuopuiu, (Throwable) obj, (wwaezpbzkn) obj2, (lg.btonecajqb) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean btonecajqb(j jVar) {
        Object objPpxfxbqfkf;
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) f125477eablkybsjg.get(this);
        long andIncrement = f125478gxszxtbevo.getAndIncrement(this);
        iobyxmoadg iobyxmoadgVar = iobyxmoadg.f125484zdlpuopuiu;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f125477eablkybsjg;
        long j13 = andIncrement / ((long) draadjrbmk.f125487gxszxtbevo);
        loop0: while (true) {
            objPpxfxbqfkf = uj.iobyxmoadg.ppxfxbqfkf(wflxmlrfwpVar, j13, iobyxmoadgVar);
            if (!pmvmpeiblj.ppxfxbqfkf(objPpxfxbqfkf)) {
                lereixgezr lereixgezrVarZoijcleaow = pmvmpeiblj.zoijcleaow(objPpxfxbqfkf);
                while (true) {
                    lereixgezr lereixgezrVar = (lereixgezr) atomicReferenceFieldUpdater.get(this);
                    if (lereixgezrVar.f113652jyumaefscl >= lereixgezrVarZoijcleaow.f113652jyumaefscl) {
                        break loop0;
                    }
                    if (!lereixgezrVarZoijcleaow.yggfygwlhe()) {
                        break;
                    }
                    if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(atomicReferenceFieldUpdater, this, lereixgezrVar, lereixgezrVarZoijcleaow)) {
                        if (!lereixgezrVar.rgvfuqvkyq()) {
                            break loop0;
                        }
                        lereixgezrVar.agtfadlqog();
                        break loop0;
                    }
                    if (lereixgezrVarZoijcleaow.rgvfuqvkyq()) {
                        lereixgezrVarZoijcleaow.agtfadlqog();
                    }
                }
            } else {
                break;
            }
        }
        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) pmvmpeiblj.zoijcleaow(objPpxfxbqfkf);
        int i13 = (int) (andIncrement % ((long) draadjrbmk.f125487gxszxtbevo));
        if (rj.draadjrbmk.iobyxmoadg(wflxmlrfwpVar2.jyumaefscl(), i13, null, jVar)) {
            jVar.eablkybsjg(wflxmlrfwpVar2, i13);
            return true;
        }
        if (!rj.draadjrbmk.iobyxmoadg(wflxmlrfwpVar2.jyumaefscl(), i13, draadjrbmk.f125491zoijcleaow, draadjrbmk.f125489ppxfxbqfkf)) {
            return false;
        }
        if (jVar instanceof agtfadlqog) {
            zdlpuopuiu.nufgyqmvbu(jVar, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((agtfadlqog) jVar).dsvhmnatus(wwaezpbzkn.f37140iobyxmoadg, this.f125483zoijcleaow);
        } else {
            if (!(jVar instanceof xj.btonecajqb)) {
                throw new IllegalStateException(("unexpected: " + jVar).toString());
            }
            ((xj.btonecajqb) jVar).wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        }
        return true;
    }

    private final int draadjrbmk() {
        int andDecrement;
        do {
            andDecrement = f125479lqeggnwhkg.getAndDecrement(this);
        } while (andDecrement > this.f125482iobyxmoadg);
        return andDecrement;
    }

    private final Object dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = oxmwwwfdhm.zoijcleaow(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar));
        try {
            if (!btonecajqb(rgvfuqvkyqVarZoijcleaow)) {
                nufgyqmvbu(rgvfuqvkyqVarZoijcleaow);
            }
            Object objZdlpuopuiu = rgvfuqvkyqVarZoijcleaow.zdlpuopuiu();
            if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
            }
            return objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo() ? objZdlpuopuiu : wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th2) {
            rgvfuqvkyqVarZoijcleaow.hcddaimhww();
            throw th2;
        }
    }

    private final void gtknphoqwx() {
        int i13;
        do {
            i13 = f125479lqeggnwhkg.get(this);
            if (i13 <= this.f125482iobyxmoadg) {
                return;
            }
        } while (!f125479lqeggnwhkg.compareAndSet(this, i13, this.f125482iobyxmoadg));
    }

    private final boolean jyumaefscl() {
        Object objPpxfxbqfkf;
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) f125480ppxfxbqfkf.get(this);
        long andIncrement = f125481wkgbmnqykc.getAndIncrement(this);
        long j13 = andIncrement / ((long) draadjrbmk.f125487gxszxtbevo);
        zoijcleaow zoijcleaowVar = zoijcleaow.f125485zdlpuopuiu;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f125480ppxfxbqfkf;
        loop0: while (true) {
            objPpxfxbqfkf = uj.iobyxmoadg.ppxfxbqfkf(wflxmlrfwpVar, j13, zoijcleaowVar);
            if (pmvmpeiblj.ppxfxbqfkf(objPpxfxbqfkf)) {
                break;
            }
            lereixgezr lereixgezrVarZoijcleaow = pmvmpeiblj.zoijcleaow(objPpxfxbqfkf);
            while (true) {
                lereixgezr lereixgezrVar = (lereixgezr) atomicReferenceFieldUpdater.get(this);
                if (lereixgezrVar.f113652jyumaefscl >= lereixgezrVarZoijcleaow.f113652jyumaefscl) {
                    break loop0;
                }
                if (!lereixgezrVarZoijcleaow.yggfygwlhe()) {
                    break;
                }
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(atomicReferenceFieldUpdater, this, lereixgezrVar, lereixgezrVarZoijcleaow)) {
                    if (!lereixgezrVar.rgvfuqvkyq()) {
                        break loop0;
                    }
                    lereixgezrVar.agtfadlqog();
                    break loop0;
                }
                if (lereixgezrVarZoijcleaow.rgvfuqvkyq()) {
                    lereixgezrVarZoijcleaow.agtfadlqog();
                }
            }
        }
        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) pmvmpeiblj.zoijcleaow(objPpxfxbqfkf);
        wflxmlrfwpVar2.zoijcleaow();
        if (wflxmlrfwpVar2.f113652jyumaefscl > j13) {
            return false;
        }
        int i13 = (int) (andIncrement % ((long) draadjrbmk.f125487gxszxtbevo));
        Object andSet = wflxmlrfwpVar2.jyumaefscl().getAndSet(i13, draadjrbmk.f125491zoijcleaow);
        if (andSet != null) {
            if (andSet == draadjrbmk.f125486eablkybsjg) {
                return false;
            }
            return yggfygwlhe(andSet);
        }
        int i14 = draadjrbmk.f125488iobyxmoadg;
        for (int i15 = 0; i15 < i14; i15++) {
            if (wflxmlrfwpVar2.jyumaefscl().get(i13) == draadjrbmk.f125489ppxfxbqfkf) {
                return true;
            }
        }
        return !rj.draadjrbmk.iobyxmoadg(wflxmlrfwpVar2.jyumaefscl(), i13, draadjrbmk.f125491zoijcleaow, draadjrbmk.f125490wkgbmnqykc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(btonecajqb btonecajqbVar, Throwable th2, wwaezpbzkn wwaezpbzknVar, lg.btonecajqb btonecajqbVar2) {
        btonecajqbVar.release();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final boolean yggfygwlhe(Object obj) {
        if (!(obj instanceof agtfadlqog)) {
            if (obj instanceof xj.btonecajqb) {
                return ((xj.btonecajqb) obj).gxszxtbevo(this, wwaezpbzkn.f37140iobyxmoadg);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        Object objZynmafqrjb = agtfadlqogVar.zynmafqrjb(wwaezpbzkn.f37140iobyxmoadg, null, this.f125483zoijcleaow);
        if (objZynmafqrjb == null) {
            return false;
        }
        agtfadlqogVar.metgxyhuhe(objZynmafqrjb);
        return true;
    }

    protected final void nufgyqmvbu(agtfadlqog agtfadlqogVar) {
        while (draadjrbmk() <= 0) {
            zdlpuopuiu.nufgyqmvbu(agtfadlqogVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (btonecajqb((j) agtfadlqogVar)) {
                return;
            }
        }
        agtfadlqogVar.dsvhmnatus(wwaezpbzkn.f37140iobyxmoadg, this.f125483zoijcleaow);
    }

    public final void release() {
        do {
            int andIncrement = f125479lqeggnwhkg.getAndIncrement(this);
            if (andIncrement >= this.f125482iobyxmoadg) {
                gtknphoqwx();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f125482iobyxmoadg).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!jyumaefscl());
    }

    public final int wflxmlrfwp() {
        return Math.max(f125479lqeggnwhkg.get(this), 0);
    }

    public final boolean zdlpuopuiu() {
        while (true) {
            int i13 = f125479lqeggnwhkg.get(this);
            if (i13 > this.f125482iobyxmoadg) {
                gtknphoqwx();
            } else {
                if (i13 <= 0) {
                    return false;
                }
                if (f125479lqeggnwhkg.compareAndSet(this, i13, i13 - 1)) {
                    return true;
                }
            }
        }
    }

    public final Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        Object objDxjokdxxww;
        return (draadjrbmk() <= 0 && (objDxjokdxxww = dxjokdxxww(gxszxtbevoVar)) == mg.zoijcleaow.gxszxtbevo()) ? objDxjokdxxww : wwaezpbzkn.f37140iobyxmoadg;
    }
}
