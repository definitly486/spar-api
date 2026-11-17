package rj;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.mbcevpiqjq;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import pj.j;
import uj.lereixgezr;
import uj.pmvmpeiblj;
import uj.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
public class eablkybsjg implements rj.lqeggnwhkg {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.vdvldrhtss f82861jyumaefscl;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final tg.draadjrbmk f82862yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f82863zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f82856iwizpuwonk = AtomicLongFieldUpdater.newUpdater(eablkybsjg.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f82853cqumvgiudr = AtomicLongFieldUpdater.newUpdater(eablkybsjg.class, "receivers$volatile");

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f82854esjtqupxsv = AtomicLongFieldUpdater.newUpdater(eablkybsjg.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f82857lereixgezr = AtomicLongFieldUpdater.newUpdater(eablkybsjg.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f82858pmvmpeiblj = AtomicReferenceFieldUpdater.newUpdater(eablkybsjg.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f82860zynmafqrjb = AtomicReferenceFieldUpdater.newUpdater(eablkybsjg.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f82855istkbnxepw = AtomicReferenceFieldUpdater.newUpdater(eablkybsjg.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f82852cdpycssgdh = AtomicReferenceFieldUpdater.newUpdater(eablkybsjg.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f82859yadqdtsiqt = AtomicReferenceFieldUpdater.newUpdater(eablkybsjg.class, Object.class, "closeHandler$volatile");

    /* JADX INFO: renamed from: rj.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    /* synthetic */ class C1858eablkybsjg extends kotlin.jvm.internal.vdvldrhtss implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final C1858eablkybsjg f82864zdlpuopuiu = new C1858eablkybsjg();

        C1858eablkybsjg() {
            super(3, eablkybsjg.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eablkybsjg eablkybsjgVar, Object obj, Object obj2) {
            return eablkybsjgVar.a(obj, obj2);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f82865jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f82867zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82867zdlpuopuiu = obj;
            this.f82865jyumaefscl |= Integer.MIN_VALUE;
            Object objC = eablkybsjg.c(eablkybsjg.this, this);
            return objC == mg.zoijcleaow.gxszxtbevo() ? objC : gtknphoqwx.zoijcleaow(objC);
        }
    }

    private final class iobyxmoadg implements dxjokdxxww, j {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private pj.rgvfuqvkyq f82869yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private Object f82870zdlpuopuiu = rj.gxszxtbevo.f82897rgvfuqvkyq;

        public iobyxmoadg() {
        }

        private final Object gxszxtbevo(wflxmlrfwp wflxmlrfwpVar, int i13, long j13, lg.gxszxtbevo gxszxtbevoVar) {
            Boolean boolIobyxmoadg;
            eablkybsjg eablkybsjgVar = eablkybsjg.this;
            pj.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = pj.oxmwwwfdhm.zoijcleaow(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar));
            try {
                this.f82869yggfygwlhe = rgvfuqvkyqVarZoijcleaow;
                Object objS = eablkybsjgVar.s(wflxmlrfwpVar, i13, j13, this);
                if (objS != rj.gxszxtbevo.f82899wflxmlrfwp) {
                    tg.vdvldrhtss vdvldrhtssVarHkdspvbjdz = null;
                    if (objS == rj.gxszxtbevo.f82894ojitshcjhn) {
                        if (j13 < eablkybsjgVar.bfopjjpdmp()) {
                            wflxmlrfwpVar.zoijcleaow();
                        }
                        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) eablkybsjg.uwvvkdfqfp().get(eablkybsjgVar);
                        while (true) {
                            if (eablkybsjgVar.roivzttewh()) {
                                nufgyqmvbu();
                                break;
                            }
                            long andIncrement = eablkybsjg.yfnezrywwk().getAndIncrement(eablkybsjgVar);
                            int i14 = rj.gxszxtbevo.f82901zoijcleaow;
                            long j14 = andIncrement / ((long) i14);
                            int i15 = (int) (andIncrement % ((long) i14));
                            if (wflxmlrfwpVar2.f113652jyumaefscl != j14) {
                                wflxmlrfwp wflxmlrfwpVarVipkmwdibw = eablkybsjgVar.vipkmwdibw(j14, wflxmlrfwpVar2);
                                if (wflxmlrfwpVarVipkmwdibw != null) {
                                    wflxmlrfwpVar2 = wflxmlrfwpVarVipkmwdibw;
                                }
                            }
                            Object objS2 = eablkybsjgVar.s(wflxmlrfwpVar2, i15, andIncrement, this);
                            if (objS2 == rj.gxszxtbevo.f82899wflxmlrfwp) {
                                eablkybsjgVar.eslsurpljm(this, wflxmlrfwpVar2, i15);
                                break;
                            }
                            if (objS2 == rj.gxszxtbevo.f82894ojitshcjhn) {
                                if (andIncrement < eablkybsjgVar.bfopjjpdmp()) {
                                    wflxmlrfwpVar2.zoijcleaow();
                                }
                            } else {
                                if (objS2 == rj.gxszxtbevo.f82883agtfadlqog) {
                                    throw new IllegalStateException("unexpected");
                                }
                                wflxmlrfwpVar2.zoijcleaow();
                                this.f82870zdlpuopuiu = objS2;
                                this.f82869yggfygwlhe = null;
                                boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true);
                                tg.draadjrbmk draadjrbmkVar = eablkybsjgVar.f82862yggfygwlhe;
                                if (draadjrbmkVar != null) {
                                    vdvldrhtssVarHkdspvbjdz = eablkybsjgVar.hkdspvbjdz(draadjrbmkVar, objS2);
                                }
                            }
                        }
                    } else {
                        wflxmlrfwpVar.zoijcleaow();
                        this.f82870zdlpuopuiu = objS;
                        this.f82869yggfygwlhe = null;
                        boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true);
                        tg.draadjrbmk draadjrbmkVar2 = eablkybsjgVar.f82862yggfygwlhe;
                        if (draadjrbmkVar2 != null) {
                            vdvldrhtssVarHkdspvbjdz = eablkybsjgVar.hkdspvbjdz(draadjrbmkVar2, objS);
                        }
                    }
                    rgvfuqvkyqVarZoijcleaow.dsvhmnatus(boolIobyxmoadg, vdvldrhtssVarHkdspvbjdz);
                    break;
                }
                eablkybsjgVar.eslsurpljm(this, wflxmlrfwpVar, i13);
                Object objZdlpuopuiu = rgvfuqvkyqVarZoijcleaow.zdlpuopuiu();
                if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                    kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
                }
                return objZdlpuopuiu;
            } catch (Throwable th2) {
                rgvfuqvkyqVarZoijcleaow.hcddaimhww();
                throw th2;
            }
        }

        private final boolean lqeggnwhkg() throws Throwable {
            this.f82870zdlpuopuiu = rj.gxszxtbevo.lereixgezr();
            Throwable thXrmfcynszj = eablkybsjg.this.xrmfcynszj();
            if (thXrmfcynszj == null) {
                return false;
            }
            throw zynmafqrjb.iobyxmoadg(thXrmfcynszj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nufgyqmvbu() {
            pj.rgvfuqvkyq rgvfuqvkyqVar = this.f82869yggfygwlhe;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rgvfuqvkyqVar);
            this.f82869yggfygwlhe = null;
            this.f82870zdlpuopuiu = rj.gxszxtbevo.lereixgezr();
            Throwable thXrmfcynszj = eablkybsjg.this.xrmfcynszj();
            if (thXrmfcynszj == null) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                rgvfuqvkyqVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(Boolean.FALSE));
            } else {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                rgvfuqvkyqVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(thXrmfcynszj)));
            }
        }

        public final void btonecajqb() {
            pj.rgvfuqvkyq rgvfuqvkyqVar = this.f82869yggfygwlhe;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rgvfuqvkyqVar);
            this.f82869yggfygwlhe = null;
            this.f82870zdlpuopuiu = rj.gxszxtbevo.lereixgezr();
            Throwable thXrmfcynszj = eablkybsjg.this.xrmfcynszj();
            if (thXrmfcynszj == null) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                rgvfuqvkyqVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(Boolean.FALSE));
            } else {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                rgvfuqvkyqVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(thXrmfcynszj)));
            }
        }

        public final boolean dxjokdxxww(Object obj) {
            pj.rgvfuqvkyq rgvfuqvkyqVar = this.f82869yggfygwlhe;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rgvfuqvkyqVar);
            this.f82869yggfygwlhe = null;
            this.f82870zdlpuopuiu = obj;
            Boolean bool = Boolean.TRUE;
            eablkybsjg eablkybsjgVar = eablkybsjg.this;
            tg.draadjrbmk draadjrbmkVar = eablkybsjgVar.f82862yggfygwlhe;
            return rj.gxszxtbevo.zynmafqrjb(rgvfuqvkyqVar, bool, draadjrbmkVar != null ? eablkybsjgVar.hkdspvbjdz(draadjrbmkVar, obj) : null);
        }

        @Override // pj.j
        public void eablkybsjg(lereixgezr lereixgezrVar, int i13) {
            pj.rgvfuqvkyq rgvfuqvkyqVar = this.f82869yggfygwlhe;
            if (rgvfuqvkyqVar != null) {
                rgvfuqvkyqVar.eablkybsjg(lereixgezrVar, i13);
            }
        }

        @Override // rj.dxjokdxxww
        public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
            boolean zLqeggnwhkg = true;
            if (this.f82870zdlpuopuiu == rj.gxszxtbevo.f82897rgvfuqvkyq || this.f82870zdlpuopuiu == rj.gxszxtbevo.lereixgezr()) {
                eablkybsjg eablkybsjgVar = eablkybsjg.this;
                wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) eablkybsjg.uwvvkdfqfp().get(eablkybsjgVar);
                while (!eablkybsjgVar.roivzttewh()) {
                    long andIncrement = eablkybsjg.yfnezrywwk().getAndIncrement(eablkybsjgVar);
                    int i13 = rj.gxszxtbevo.f82901zoijcleaow;
                    long j13 = andIncrement / ((long) i13);
                    int i14 = (int) (andIncrement % ((long) i13));
                    if (wflxmlrfwpVar.f113652jyumaefscl != j13) {
                        wflxmlrfwp wflxmlrfwpVarVipkmwdibw = eablkybsjgVar.vipkmwdibw(j13, wflxmlrfwpVar);
                        if (wflxmlrfwpVarVipkmwdibw == null) {
                            continue;
                        } else {
                            wflxmlrfwpVar = wflxmlrfwpVarVipkmwdibw;
                        }
                    }
                    Object objS = eablkybsjgVar.s(wflxmlrfwpVar, i14, andIncrement, null);
                    if (objS == rj.gxszxtbevo.f82899wflxmlrfwp) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objS == rj.gxszxtbevo.f82894ojitshcjhn) {
                        if (andIncrement < eablkybsjgVar.bfopjjpdmp()) {
                            wflxmlrfwpVar.zoijcleaow();
                        }
                    } else {
                        if (objS == rj.gxszxtbevo.f82883agtfadlqog) {
                            return gxszxtbevo(wflxmlrfwpVar, i14, andIncrement, gxszxtbevoVar);
                        }
                        wflxmlrfwpVar.zoijcleaow();
                        this.f82870zdlpuopuiu = objS;
                    }
                }
                zLqeggnwhkg = lqeggnwhkg();
            }
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zLqeggnwhkg);
        }

        @Override // rj.dxjokdxxww
        public Object next() throws Throwable {
            Object obj = this.f82870zdlpuopuiu;
            if (obj == rj.gxszxtbevo.f82897rgvfuqvkyq) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f82870zdlpuopuiu = rj.gxszxtbevo.f82897rgvfuqvkyq;
            if (obj != rj.gxszxtbevo.lereixgezr()) {
                return obj;
            }
            throw zynmafqrjb.iobyxmoadg(eablkybsjg.this.czzsidtyhn());
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f82871cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        long f82873iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f82874jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f82875lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f82876yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f82877zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82871cqumvgiudr = obj;
            this.f82875lereixgezr |= Integer.MIN_VALUE;
            Object objD = eablkybsjg.this.d(null, 0, 0L, this);
            return objD == mg.zoijcleaow.gxszxtbevo() ? objD : gtknphoqwx.zoijcleaow(objD);
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.vdvldrhtss {
        ppxfxbqfkf(Object obj) {
            super(3, obj, eablkybsjg.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((Throwable) obj, ((gtknphoqwx) obj2).gtknphoqwx(), (lg.btonecajqb) obj3);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2, Object obj, lg.btonecajqb btonecajqbVar) {
            ((eablkybsjg) this.receiver).fiwbwshyhd(th2, obj, btonecajqbVar);
        }
    }

    /* synthetic */ class wkgbmnqykc extends kotlin.jvm.internal.vdvldrhtss implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final wkgbmnqykc f82878zdlpuopuiu = new wkgbmnqykc();

        wkgbmnqykc() {
            super(3, eablkybsjg.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((eablkybsjg) obj, (xj.btonecajqb) obj2, obj3);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(eablkybsjg eablkybsjgVar, xj.btonecajqb btonecajqbVar, Object obj) {
            eablkybsjgVar.f(btonecajqbVar, obj);
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.vdvldrhtss {
        zoijcleaow(Object obj) {
            super(3, obj, eablkybsjg.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((Throwable) obj, obj2, (lg.btonecajqb) obj3);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2, Object obj, lg.btonecajqb btonecajqbVar) {
            ((eablkybsjg) this.receiver).ageimvtcrz(th2, obj, btonecajqbVar);
        }
    }

    public eablkybsjg(int i13, tg.draadjrbmk draadjrbmkVar) {
        this.f82863zdlpuopuiu = i13;
        this.f82862yggfygwlhe = draadjrbmkVar;
        if (i13 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i13 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = rj.gxszxtbevo.pmvmpeiblj(i13);
        this.completedExpandBuffersAndPauseFlag$volatile = okpsazkaxt();
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(0L, null, this, 3);
        this.sendSegment$volatile = wflxmlrfwpVar;
        this.receiveSegment$volatile = wflxmlrfwpVar;
        if (dvvnrvtcbc()) {
            wflxmlrfwpVar = rj.gxszxtbevo.f82890iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = wflxmlrfwpVar;
        this.f82861jyumaefscl = draadjrbmkVar != null ? new tg.vdvldrhtss() { // from class: rj.zoijcleaow
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return eablkybsjg.rhgxfdycjh(this.f82931zdlpuopuiu, (xj.btonecajqb) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = rj.gxszxtbevo.f82891kcexrzcfyt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Object obj, Object obj2) {
        return gtknphoqwx.zoijcleaow(obj2 == rj.gxszxtbevo.lereixgezr() ? gtknphoqwx.f82880zoijcleaow.iobyxmoadg(xrmfcynszj()) : gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ageimvtcrz(Throwable th2, Object obj, lg.btonecajqb btonecajqbVar) {
        tg.draadjrbmk draadjrbmkVar = this.f82862yggfygwlhe;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(draadjrbmkVar);
        uj.jyumaefscl.iobyxmoadg(draadjrbmkVar, obj, btonecajqbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean auzgnhcxok(long j13) {
        return tbqsvytpvh(j13, false);
    }

    static /* synthetic */ Object b(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) uwvvkdfqfp().get(eablkybsjgVar);
        while (!eablkybsjgVar.roivzttewh()) {
            long andIncrement = yfnezrywwk().getAndIncrement(eablkybsjgVar);
            int i13 = rj.gxszxtbevo.f82901zoijcleaow;
            long j13 = andIncrement / ((long) i13);
            int i14 = (int) (andIncrement % ((long) i13));
            if (wflxmlrfwpVar.f113652jyumaefscl != j13) {
                wflxmlrfwp wflxmlrfwpVarVipkmwdibw = eablkybsjgVar.vipkmwdibw(j13, wflxmlrfwpVar);
                if (wflxmlrfwpVarVipkmwdibw == null) {
                    continue;
                } else {
                    wflxmlrfwpVar = wflxmlrfwpVarVipkmwdibw;
                }
            }
            Object objS = eablkybsjgVar.s(wflxmlrfwpVar, i14, andIncrement, null);
            if (objS == rj.gxszxtbevo.f82899wflxmlrfwp) {
                throw new IllegalStateException("unexpected");
            }
            if (objS != rj.gxszxtbevo.f82894ojitshcjhn) {
                if (objS == rj.gxszxtbevo.f82883agtfadlqog) {
                    return eablkybsjgVar.e(wflxmlrfwpVar, i14, andIncrement, gxszxtbevoVar);
                }
                wflxmlrfwpVar.zoijcleaow();
                return objS;
            }
            if (andIncrement < eablkybsjgVar.bfopjjpdmp()) {
                wflxmlrfwpVar.zoijcleaow();
            }
        }
        throw zynmafqrjb.iobyxmoadg(eablkybsjgVar.czzsidtyhn());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    static /* synthetic */ Object c(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f82865jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f82865jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = eablkybsjgVar.new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = eablkybsjgVar.new gxszxtbevo(gxszxtbevoVar);
        }
        gxszxtbevo gxszxtbevoVar3 = gxszxtbevoVar2;
        Object obj = gxszxtbevoVar3.f82867zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar3.f82865jyumaefscl;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return ((gtknphoqwx) obj).gtknphoqwx();
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) uwvvkdfqfp().get(eablkybsjgVar);
        while (!eablkybsjgVar.roivzttewh()) {
            long andIncrement = yfnezrywwk().getAndIncrement(eablkybsjgVar);
            int i15 = rj.gxszxtbevo.f82901zoijcleaow;
            long j13 = andIncrement / ((long) i15);
            int i16 = (int) (andIncrement % ((long) i15));
            if (wflxmlrfwpVar.f113652jyumaefscl != j13) {
                wflxmlrfwp wflxmlrfwpVarVipkmwdibw = eablkybsjgVar.vipkmwdibw(j13, wflxmlrfwpVar);
                if (wflxmlrfwpVarVipkmwdibw == null) {
                    continue;
                } else {
                    wflxmlrfwpVar = wflxmlrfwpVarVipkmwdibw;
                }
            }
            Object objS = eablkybsjgVar.s(wflxmlrfwpVar, i16, andIncrement, null);
            if (objS == rj.gxszxtbevo.f82899wflxmlrfwp) {
                throw new IllegalStateException("unexpected");
            }
            if (objS != rj.gxszxtbevo.f82894ojitshcjhn) {
                if (objS != rj.gxszxtbevo.f82883agtfadlqog) {
                    wflxmlrfwpVar.zoijcleaow();
                    return gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(objS);
                }
                gxszxtbevoVar3.f82865jyumaefscl = 1;
                Object objD = eablkybsjgVar.d(wflxmlrfwpVar, i16, andIncrement, gxszxtbevoVar3);
                return objD == objGxszxtbevo ? objGxszxtbevo : objD;
            }
            if (andIncrement < eablkybsjgVar.bfopjjpdmp()) {
                wflxmlrfwpVar.zoijcleaow();
            }
        }
        return gtknphoqwx.f82880zoijcleaow.iobyxmoadg(eablkybsjgVar.xrmfcynszj());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cllcsxoeiz(tg.draadjrbmk draadjrbmkVar, Object obj, Throwable th2, Object obj2, lg.btonecajqb btonecajqbVar) {
        uj.jyumaefscl.iobyxmoadg(draadjrbmkVar, obj, btonecajqbVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable czzsidtyhn() {
        Throwable thXrmfcynszj = xrmfcynszj();
        return thXrmfcynszj == null ? new ClosedReceiveChannelException("Channel was closed") : thXrmfcynszj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(wflxmlrfwp wflxmlrfwpVar, int i13, long j13, lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        gtknphoqwx gtknphoqwxVarZoijcleaow;
        tg.vdvldrhtss vdvldrhtssVar;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i14 = lqeggnwhkgVar.f82875lereixgezr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f82875lereixgezr = i14 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objZdlpuopuiu = lqeggnwhkgVar.f82871cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = lqeggnwhkgVar.f82875lereixgezr;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZdlpuopuiu);
            lqeggnwhkgVar.f82877zdlpuopuiu = this;
            lqeggnwhkgVar.f82876yggfygwlhe = wflxmlrfwpVar;
            lqeggnwhkgVar.f82874jyumaefscl = i13;
            lqeggnwhkgVar.f82873iwizpuwonk = j13;
            lqeggnwhkgVar.f82875lereixgezr = 1;
            pj.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = pj.oxmwwwfdhm.zoijcleaow(mg.zoijcleaow.ppxfxbqfkf(lqeggnwhkgVar));
            try {
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(rgvfuqvkyqVarZoijcleaow, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>");
                yggfygwlhe yggfygwlheVar = new yggfygwlhe(rgvfuqvkyqVarZoijcleaow);
                Object objS = s(wflxmlrfwpVar, i13, j13, yggfygwlheVar);
                if (objS != rj.gxszxtbevo.f82899wflxmlrfwp) {
                    if (objS == rj.gxszxtbevo.f82894ojitshcjhn) {
                        if (j13 < bfopjjpdmp()) {
                            wflxmlrfwpVar.zoijcleaow();
                        }
                        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) uwvvkdfqfp().get(this);
                        while (true) {
                            if (roivzttewh()) {
                                ipoelvxyzq(rgvfuqvkyqVarZoijcleaow);
                                break;
                            }
                            long andIncrement = yfnezrywwk().getAndIncrement(this);
                            int i16 = rj.gxszxtbevo.f82901zoijcleaow;
                            long j14 = andIncrement / ((long) i16);
                            int i17 = (int) (andIncrement % ((long) i16));
                            if (wflxmlrfwpVar2.f113652jyumaefscl != j14) {
                                wflxmlrfwp wflxmlrfwpVarVipkmwdibw = vipkmwdibw(j14, wflxmlrfwpVar2);
                                if (wflxmlrfwpVarVipkmwdibw != null) {
                                    wflxmlrfwpVar2 = wflxmlrfwpVarVipkmwdibw;
                                }
                            }
                            Object objS2 = s(wflxmlrfwpVar2, i17, andIncrement, yggfygwlheVar);
                            if (objS2 == rj.gxszxtbevo.f82899wflxmlrfwp) {
                                eslsurpljm(yggfygwlheVar, wflxmlrfwpVar2, i17);
                                break;
                            }
                            if (objS2 == rj.gxszxtbevo.f82894ojitshcjhn) {
                                if (andIncrement < bfopjjpdmp()) {
                                    wflxmlrfwpVar2.zoijcleaow();
                                }
                            } else {
                                if (objS2 == rj.gxszxtbevo.f82883agtfadlqog) {
                                    throw new IllegalStateException("unexpected");
                                }
                                wflxmlrfwpVar2.zoijcleaow();
                                gtknphoqwxVarZoijcleaow = gtknphoqwx.zoijcleaow(gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(objS2));
                                tg.draadjrbmk draadjrbmkVar = this.f82862yggfygwlhe;
                                vdvldrhtssVar = (tg.vdvldrhtss) (draadjrbmkVar != null ? dsvhmnatus(draadjrbmkVar) : null);
                            }
                        }
                    } else {
                        wflxmlrfwpVar.zoijcleaow();
                        gtknphoqwxVarZoijcleaow = gtknphoqwx.zoijcleaow(gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(objS));
                        tg.draadjrbmk draadjrbmkVar2 = this.f82862yggfygwlhe;
                        vdvldrhtssVar = (tg.vdvldrhtss) (draadjrbmkVar2 != null ? dsvhmnatus(draadjrbmkVar2) : null);
                    }
                    rgvfuqvkyqVarZoijcleaow.dsvhmnatus(gtknphoqwxVarZoijcleaow, vdvldrhtssVar);
                    break;
                }
                eslsurpljm(yggfygwlheVar, wflxmlrfwpVar, i13);
                objZdlpuopuiu = rgvfuqvkyqVarZoijcleaow.zdlpuopuiu();
                if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                    kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(lqeggnwhkgVar);
                }
                if (objZdlpuopuiu == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } catch (Throwable th2) {
                rgvfuqvkyqVarZoijcleaow.hcddaimhww();
                throw th2;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZdlpuopuiu);
        }
        return ((gtknphoqwx) objZdlpuopuiu).gtknphoqwx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ah.lqeggnwhkg dsvhmnatus(tg.draadjrbmk draadjrbmkVar) {
        return new ppxfxbqfkf(this);
    }

    private final boolean dvvnrvtcbc() {
        long jOkpsazkaxt = okpsazkaxt();
        return jOkpsazkaxt == 0 || jOkpsazkaxt == Long.MAX_VALUE;
    }

    private final Object e(wflxmlrfwp wflxmlrfwpVar, int i13, long j13, lg.gxszxtbevo gxszxtbevoVar) {
        tg.vdvldrhtss vdvldrhtssVar;
        pj.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = pj.oxmwwwfdhm.zoijcleaow(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar));
        try {
            Object objS = s(wflxmlrfwpVar, i13, j13, rgvfuqvkyqVarZoijcleaow);
            if (objS != rj.gxszxtbevo.f82899wflxmlrfwp) {
                if (objS == rj.gxszxtbevo.f82894ojitshcjhn) {
                    if (j13 < bfopjjpdmp()) {
                        wflxmlrfwpVar.zoijcleaow();
                    }
                    wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) uwvvkdfqfp().get(this);
                    while (true) {
                        if (roivzttewh()) {
                            grlcpdaxtj(rgvfuqvkyqVarZoijcleaow);
                            break;
                        }
                        long andIncrement = yfnezrywwk().getAndIncrement(this);
                        int i14 = rj.gxszxtbevo.f82901zoijcleaow;
                        long j14 = andIncrement / ((long) i14);
                        int i15 = (int) (andIncrement % ((long) i14));
                        if (wflxmlrfwpVar2.f113652jyumaefscl != j14) {
                            wflxmlrfwp wflxmlrfwpVarVipkmwdibw = vipkmwdibw(j14, wflxmlrfwpVar2);
                            if (wflxmlrfwpVarVipkmwdibw != null) {
                                wflxmlrfwpVar2 = wflxmlrfwpVarVipkmwdibw;
                            }
                        }
                        objS = s(wflxmlrfwpVar2, i15, andIncrement, rgvfuqvkyqVarZoijcleaow);
                        if (objS == rj.gxszxtbevo.f82899wflxmlrfwp) {
                            pj.rgvfuqvkyq rgvfuqvkyqVar = rgvfuqvkyqVarZoijcleaow != null ? rgvfuqvkyqVarZoijcleaow : null;
                            if (rgvfuqvkyqVar == null) {
                                break;
                            }
                            eslsurpljm(rgvfuqvkyqVar, wflxmlrfwpVar2, i15);
                            break;
                        }
                        if (objS == rj.gxszxtbevo.f82894ojitshcjhn) {
                            if (andIncrement < bfopjjpdmp()) {
                                wflxmlrfwpVar2.zoijcleaow();
                            }
                        } else {
                            if (objS == rj.gxszxtbevo.f82883agtfadlqog) {
                                throw new IllegalStateException("unexpected");
                            }
                            wflxmlrfwpVar2.zoijcleaow();
                            tg.draadjrbmk draadjrbmkVar = this.f82862yggfygwlhe;
                            vdvldrhtssVar = (tg.vdvldrhtss) (draadjrbmkVar != null ? jpowsppfya(draadjrbmkVar) : null);
                        }
                    }
                } else {
                    wflxmlrfwpVar.zoijcleaow();
                    tg.draadjrbmk draadjrbmkVar2 = this.f82862yggfygwlhe;
                    vdvldrhtssVar = (tg.vdvldrhtss) (draadjrbmkVar2 != null ? jpowsppfya(draadjrbmkVar2) : null);
                }
                rgvfuqvkyqVarZoijcleaow.dsvhmnatus(objS, vdvldrhtssVar);
                break;
            }
            eslsurpljm(rgvfuqvkyqVarZoijcleaow, wflxmlrfwpVar, i13);
            Object objZdlpuopuiu = rgvfuqvkyqVarZoijcleaow.zdlpuopuiu();
            if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
            }
            return objZdlpuopuiu;
        } catch (Throwable th2) {
            rgvfuqvkyqVarZoijcleaow.hcddaimhww();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eslsurpljm(j jVar, wflxmlrfwp wflxmlrfwpVar, int i13) {
        ezmngbhpjk();
        jVar.eablkybsjg(wflxmlrfwpVar, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(xj.btonecajqb btonecajqbVar, Object obj) {
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) uwvvkdfqfp().get(this);
        while (!roivzttewh()) {
            long andIncrement = yfnezrywwk().getAndIncrement(this);
            int i13 = rj.gxszxtbevo.f82901zoijcleaow;
            long j13 = andIncrement / ((long) i13);
            int i14 = (int) (andIncrement % ((long) i13));
            if (wflxmlrfwpVar.f113652jyumaefscl != j13) {
                wflxmlrfwp wflxmlrfwpVarVipkmwdibw = vipkmwdibw(j13, wflxmlrfwpVar);
                if (wflxmlrfwpVarVipkmwdibw == null) {
                    continue;
                } else {
                    wflxmlrfwpVar = wflxmlrfwpVarVipkmwdibw;
                }
            }
            Object objS = s(wflxmlrfwpVar, i14, andIncrement, btonecajqbVar);
            if (objS == rj.gxszxtbevo.f82899wflxmlrfwp) {
                j jVar = btonecajqbVar instanceof j ? (j) btonecajqbVar : null;
                if (jVar != null) {
                    eslsurpljm(jVar, wflxmlrfwpVar, i14);
                    return;
                }
                return;
            }
            if (objS != rj.gxszxtbevo.f82894ojitshcjhn) {
                if (objS == rj.gxszxtbevo.f82883agtfadlqog) {
                    throw new IllegalStateException("unexpected");
                }
                wflxmlrfwpVar.zoijcleaow();
                btonecajqbVar.wkgbmnqykc(objS);
                return;
            }
            if (andIncrement < bfopjjpdmp()) {
                wflxmlrfwpVar.zoijcleaow();
            }
        }
        mhtqkkgtqm(btonecajqbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fiwbwshyhd(Throwable th2, Object obj, lg.btonecajqb btonecajqbVar) {
        tg.draadjrbmk draadjrbmkVar = this.f82862yggfygwlhe;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(draadjrbmkVar);
        Object objGxszxtbevo = gtknphoqwx.gxszxtbevo(obj);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objGxszxtbevo);
        uj.jyumaefscl.iobyxmoadg(draadjrbmkVar, objGxszxtbevo, btonecajqbVar);
    }

    private final void g(wflxmlrfwp wflxmlrfwpVar) {
        tg.draadjrbmk draadjrbmkVar = this.f82862yggfygwlhe;
        UndeliveredElementException undeliveredElementExceptionZoijcleaow = null;
        Object objZoijcleaow = uj.dxjokdxxww.zoijcleaow(null, 1, null);
        loop0: do {
            for (int i13 = rj.gxszxtbevo.f82901zoijcleaow - 1; -1 < i13; i13--) {
                long j13 = (wflxmlrfwpVar.f113652jyumaefscl * ((long) rj.gxszxtbevo.f82901zoijcleaow)) + ((long) i13);
                while (true) {
                    Object objZynmafqrjb = wflxmlrfwpVar.zynmafqrjb(i13);
                    if (objZynmafqrjb == rj.gxszxtbevo.f82886dxjokdxxww) {
                        break loop0;
                    }
                    if (objZynmafqrjb != rj.gxszxtbevo.f82900wkgbmnqykc) {
                        if (objZynmafqrjb != rj.gxszxtbevo.f82887eablkybsjg && objZynmafqrjb != null) {
                            if (!(objZynmafqrjb instanceof j) && !(objZynmafqrjb instanceof cqumvgiudr)) {
                                if (objZynmafqrjb != rj.gxszxtbevo.f82892lqeggnwhkg && objZynmafqrjb != rj.gxszxtbevo.f82889gxszxtbevo) {
                                    if (objZynmafqrjb != rj.gxszxtbevo.f82892lqeggnwhkg) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j13 < ydmasvzmpa()) {
                                    break loop0;
                                }
                                j jVar = objZynmafqrjb instanceof cqumvgiudr ? ((cqumvgiudr) objZynmafqrjb).f82851iobyxmoadg : (j) objZynmafqrjb;
                                if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.lereixgezr())) {
                                    if (draadjrbmkVar != null) {
                                        undeliveredElementExceptionZoijcleaow = uj.jyumaefscl.zoijcleaow(draadjrbmkVar, wflxmlrfwpVar.pmvmpeiblj(i13), undeliveredElementExceptionZoijcleaow);
                                    }
                                    objZoijcleaow = uj.dxjokdxxww.ppxfxbqfkf(objZoijcleaow, jVar);
                                    wflxmlrfwpVar.iwizpuwonk(i13);
                                    wflxmlrfwpVar.zdlpuopuiu();
                                    break;
                                }
                            }
                        } else {
                            if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.lereixgezr())) {
                                wflxmlrfwpVar.zdlpuopuiu();
                                break;
                            }
                        }
                    } else {
                        if (j13 < ydmasvzmpa()) {
                            break loop0;
                        }
                        if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.lereixgezr())) {
                            if (draadjrbmkVar != null) {
                                undeliveredElementExceptionZoijcleaow = uj.jyumaefscl.zoijcleaow(draadjrbmkVar, wflxmlrfwpVar.pmvmpeiblj(i13), undeliveredElementExceptionZoijcleaow);
                            }
                            wflxmlrfwpVar.iwizpuwonk(i13);
                            wflxmlrfwpVar.zdlpuopuiu();
                            break;
                        }
                    }
                }
            }
            wflxmlrfwpVar = (wflxmlrfwp) wflxmlrfwpVar.nufgyqmvbu();
        } while (wflxmlrfwpVar != null);
        if (objZoijcleaow != null) {
            if (objZoijcleaow instanceof ArrayList) {
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objZoijcleaow, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objZoijcleaow;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    i((j) arrayList.get(size));
                }
            } else {
                i((j) objZoijcleaow);
            }
        }
        if (undeliveredElementExceptionZoijcleaow != null) {
            throw undeliveredElementExceptionZoijcleaow;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void grlcpdaxtj(pj.agtfadlqog agtfadlqogVar) {
        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
        agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(czzsidtyhn())));
    }

    private final void h(j jVar) {
        j(jVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tg.vdvldrhtss hkdspvbjdz(final tg.draadjrbmk draadjrbmkVar, final Object obj) {
        return new tg.vdvldrhtss() { // from class: rj.ppxfxbqfkf
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return eablkybsjg.cllcsxoeiz(draadjrbmkVar, obj, (Throwable) obj2, obj3, (lg.btonecajqb) obj4);
            }
        };
    }

    private final void hszhottldk(long j13, wflxmlrfwp wflxmlrfwpVar) {
        wflxmlrfwp wflxmlrfwpVar2;
        wflxmlrfwp wflxmlrfwpVar3;
        while (wflxmlrfwpVar.f113652jyumaefscl < j13 && (wflxmlrfwpVar3 = (wflxmlrfwp) wflxmlrfwpVar.gxszxtbevo()) != null) {
            wflxmlrfwpVar = wflxmlrfwpVar3;
        }
        while (true) {
            if (!wflxmlrfwpVar.gtknphoqwx() || (wflxmlrfwpVar2 = (wflxmlrfwp) wflxmlrfwpVar.gxszxtbevo()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f82855istkbnxepw;
                while (true) {
                    lereixgezr lereixgezrVar = (lereixgezr) atomicReferenceFieldUpdater.get(this);
                    if (lereixgezrVar.f113652jyumaefscl >= wflxmlrfwpVar.f113652jyumaefscl) {
                        return;
                    }
                    if (!wflxmlrfwpVar.yggfygwlhe()) {
                        break;
                    }
                    if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(atomicReferenceFieldUpdater, this, lereixgezrVar, wflxmlrfwpVar)) {
                        if (lereixgezrVar.rgvfuqvkyq()) {
                            lereixgezrVar.agtfadlqog();
                            return;
                        }
                        return;
                    } else if (wflxmlrfwpVar.rgvfuqvkyq()) {
                        wflxmlrfwpVar.agtfadlqog();
                    }
                }
            } else {
                wflxmlrfwpVar = wflxmlrfwpVar2;
            }
        }
    }

    private final void i(j jVar) {
        j(jVar, false);
    }

    private final void igdgnonuha() {
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f82856iwizpuwonk;
        do {
            j13 = atomicLongFieldUpdater.get(this);
            if (((int) (j13 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j13, rj.gxszxtbevo.iwizpuwonk(1152921504606846975L & j13, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ipoelvxyzq(pj.agtfadlqog agtfadlqogVar) {
        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
        agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gtknphoqwx.zoijcleaow(gtknphoqwx.f82880zoijcleaow.iobyxmoadg(xrmfcynszj()))));
    }

    private final Object ixidwrxhsl(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        UndeliveredElementException undeliveredElementExceptionPpxfxbqfkf;
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        tg.draadjrbmk draadjrbmkVar = this.f82862yggfygwlhe;
        if (draadjrbmkVar == null || (undeliveredElementExceptionPpxfxbqfkf = uj.jyumaefscl.ppxfxbqfkf(draadjrbmkVar, obj, null, 2, null)) == null) {
            Throwable thSflfametgt = sflfametgt();
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            rgvfuqvkyqVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(thSflfametgt)));
        } else {
            gg.lqeggnwhkg.iobyxmoadg(undeliveredElementExceptionPpxfxbqfkf, sflfametgt());
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            rgvfuqvkyqVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(undeliveredElementExceptionPpxfxbqfkf)));
        }
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo() ? objZdlpuopuiu : wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void j(j jVar, boolean z13) {
        if (jVar instanceof pj.agtfadlqog) {
            lg.gxszxtbevo gxszxtbevoVar = (lg.gxszxtbevo) jVar;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            gxszxtbevoVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(z13 ? czzsidtyhn() : sflfametgt())));
        } else if (jVar instanceof yggfygwlhe) {
            pj.rgvfuqvkyq rgvfuqvkyqVar = ((yggfygwlhe) jVar).f82930zdlpuopuiu;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            rgvfuqvkyqVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gtknphoqwx.zoijcleaow(gtknphoqwx.f82880zoijcleaow.iobyxmoadg(xrmfcynszj()))));
        } else if (jVar instanceof iobyxmoadg) {
            ((iobyxmoadg) jVar).btonecajqb();
        } else {
            if (jVar instanceof xj.btonecajqb) {
                ((xj.btonecajqb) jVar).gxszxtbevo(this, rj.gxszxtbevo.lereixgezr());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + jVar).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wflxmlrfwp jhduphickx(long j13, wflxmlrfwp wflxmlrfwpVar) {
        Object objPpxfxbqfkf;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f82858pmvmpeiblj;
        tg.rgvfuqvkyq rgvfuqvkyqVar = (tg.rgvfuqvkyq) rj.gxszxtbevo.esjtqupxsv();
        loop0: while (true) {
            objPpxfxbqfkf = uj.iobyxmoadg.ppxfxbqfkf(wflxmlrfwpVar, j13, rgvfuqvkyqVar);
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
        if (pmvmpeiblj.ppxfxbqfkf(objPpxfxbqfkf)) {
            sopmlzcsov();
            if (wflxmlrfwpVar.f113652jyumaefscl * ((long) rj.gxszxtbevo.f82901zoijcleaow) >= ydmasvzmpa()) {
                return null;
            }
            wflxmlrfwpVar.zoijcleaow();
            return null;
        }
        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) pmvmpeiblj.zoijcleaow(objPpxfxbqfkf);
        long j14 = wflxmlrfwpVar2.f113652jyumaefscl;
        if (j14 <= j13) {
            return wflxmlrfwpVar2;
        }
        int i13 = rj.gxszxtbevo.f82901zoijcleaow;
        x(j14 * ((long) i13));
        if (wflxmlrfwpVar2.f113652jyumaefscl * ((long) i13) >= ydmasvzmpa()) {
            return null;
        }
        wflxmlrfwpVar2.zoijcleaow();
        return null;
    }

    private final void jlmebxxoox() {
        if (dvvnrvtcbc()) {
            return;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) f82855istkbnxepw.get(this);
        while (true) {
            long andIncrement = f82854esjtqupxsv.getAndIncrement(this);
            int i13 = rj.gxszxtbevo.f82901zoijcleaow;
            long j13 = andIncrement / ((long) i13);
            if (bfopjjpdmp() <= andIncrement) {
                if (wflxmlrfwpVar.f113652jyumaefscl < j13 && wflxmlrfwpVar.gxszxtbevo() != null) {
                    hszhottldk(j13, wflxmlrfwpVar);
                }
                lrnfpwlwnk(this, 0L, 1, null);
                return;
            }
            if (wflxmlrfwpVar.f113652jyumaefscl != j13) {
                wflxmlrfwp wflxmlrfwpVarRibwqtqdhb = ribwqtqdhb(j13, wflxmlrfwpVar, andIncrement);
                if (wflxmlrfwpVarRibwqtqdhb == null) {
                    continue;
                } else {
                    wflxmlrfwpVar = wflxmlrfwpVarRibwqtqdhb;
                }
            }
            if (q(wflxmlrfwpVar, (int) (andIncrement % ((long) i13)), andIncrement)) {
                lrnfpwlwnk(this, 0L, 1, null);
                return;
            }
            lrnfpwlwnk(this, 0L, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ah.lqeggnwhkg jpowsppfya(tg.draadjrbmk draadjrbmkVar) {
        return new zoijcleaow(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jrbgnlbqoe(Object obj, pj.agtfadlqog agtfadlqogVar) {
        tg.draadjrbmk draadjrbmkVar = this.f82862yggfygwlhe;
        if (draadjrbmkVar != null) {
            uj.jyumaefscl.iobyxmoadg(draadjrbmkVar, obj, agtfadlqogVar.getContext());
        }
        Throwable thSflfametgt = sflfametgt();
        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
        agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(thSflfametgt)));
    }

    static /* synthetic */ Object k(eablkybsjg eablkybsjgVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) f82858pmvmpeiblj.get(eablkybsjgVar);
        while (true) {
            long andIncrement = f82856iwizpuwonk.getAndIncrement(eablkybsjgVar);
            long j13 = 1152921504606846975L & andIncrement;
            boolean zAuzgnhcxok = eablkybsjgVar.auzgnhcxok(andIncrement);
            int i13 = rj.gxszxtbevo.f82901zoijcleaow;
            long j14 = j13 / ((long) i13);
            int i14 = (int) (j13 % ((long) i13));
            if (wflxmlrfwpVar.f113652jyumaefscl != j14) {
                wflxmlrfwp wflxmlrfwpVarJhduphickx = eablkybsjgVar.jhduphickx(j14, wflxmlrfwpVar);
                if (wflxmlrfwpVarJhduphickx != null) {
                    wflxmlrfwpVar = wflxmlrfwpVarJhduphickx;
                } else if (zAuzgnhcxok) {
                    Object objIxidwrxhsl = eablkybsjgVar.ixidwrxhsl(obj, gxszxtbevoVar);
                    if (objIxidwrxhsl != mg.zoijcleaow.gxszxtbevo()) {
                        break;
                    }
                    return objIxidwrxhsl;
                }
            }
            int iU = eablkybsjgVar.u(wflxmlrfwpVar, i14, obj, j13, null, zAuzgnhcxok);
            if (iU == 0) {
                wflxmlrfwpVar.zoijcleaow();
                break;
            }
            if (iU != 1) {
                if (iU == 2) {
                    if (!zAuzgnhcxok) {
                        break;
                    }
                    wflxmlrfwpVar.zdlpuopuiu();
                    Object objIxidwrxhsl2 = eablkybsjgVar.ixidwrxhsl(obj, gxszxtbevoVar);
                    if (objIxidwrxhsl2 != mg.zoijcleaow.gxszxtbevo()) {
                        break;
                    }
                    return objIxidwrxhsl2;
                }
                if (iU == 3) {
                    Object objL = eablkybsjgVar.l(wflxmlrfwpVar, i14, obj, j13, gxszxtbevoVar);
                    if (objL != mg.zoijcleaow.gxszxtbevo()) {
                        break;
                    }
                    return objL;
                }
                if (iU == 4) {
                    if (j13 < eablkybsjgVar.ydmasvzmpa()) {
                        wflxmlrfwpVar.zoijcleaow();
                    }
                    Object objIxidwrxhsl3 = eablkybsjgVar.ixidwrxhsl(obj, gxszxtbevoVar);
                    if (objIxidwrxhsl3 != mg.zoijcleaow.gxszxtbevo()) {
                        break;
                    }
                    return objIxidwrxhsl3;
                }
                if (iU == 5) {
                    wflxmlrfwpVar.zoijcleaow();
                }
            } else {
                break;
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void kegysxyocb(wflxmlrfwp wflxmlrfwpVar, long j13) {
        Object objZoijcleaow = uj.dxjokdxxww.zoijcleaow(null, 1, null);
        loop0: while (wflxmlrfwpVar != null) {
            for (int i13 = rj.gxszxtbevo.f82901zoijcleaow - 1; -1 < i13; i13--) {
                if ((wflxmlrfwpVar.f113652jyumaefscl * ((long) rj.gxszxtbevo.f82901zoijcleaow)) + ((long) i13) < j13) {
                    break loop0;
                }
                while (true) {
                    Object objZynmafqrjb = wflxmlrfwpVar.zynmafqrjb(i13);
                    if (objZynmafqrjb != null && objZynmafqrjb != rj.gxszxtbevo.f82887eablkybsjg) {
                        if (!(objZynmafqrjb instanceof cqumvgiudr)) {
                            if (!(objZynmafqrjb instanceof j)) {
                                break;
                            }
                            if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.lereixgezr())) {
                                objZoijcleaow = uj.dxjokdxxww.ppxfxbqfkf(objZoijcleaow, objZynmafqrjb);
                                wflxmlrfwpVar.istkbnxepw(i13, true);
                                break;
                            }
                        } else {
                            if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.lereixgezr())) {
                                objZoijcleaow = uj.dxjokdxxww.ppxfxbqfkf(objZoijcleaow, ((cqumvgiudr) objZynmafqrjb).f82851iobyxmoadg);
                                wflxmlrfwpVar.istkbnxepw(i13, true);
                                break;
                            }
                        }
                    } else {
                        if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.lereixgezr())) {
                            wflxmlrfwpVar.zdlpuopuiu();
                            break;
                        }
                    }
                }
            }
            wflxmlrfwpVar = (wflxmlrfwp) wflxmlrfwpVar.nufgyqmvbu();
        }
        if (objZoijcleaow != null) {
            if (!(objZoijcleaow instanceof ArrayList)) {
                h((j) objZoijcleaow);
                return;
            }
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objZoijcleaow, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objZoijcleaow;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                h((j) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void krqnebusok(j jVar, wflxmlrfwp wflxmlrfwpVar, int i13) {
        jVar.eablkybsjg(wflxmlrfwpVar, i13 + rj.gxszxtbevo.f82901zoijcleaow);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Code duplicated, block: B:64:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    private final Object l(wflxmlrfwp wflxmlrfwpVar, int i13, Object obj, long j13, lg.gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc;
        Object objZdlpuopuiu;
        wflxmlrfwp wflxmlrfwpVar2;
        pj.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = pj.oxmwwwfdhm.zoijcleaow(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar));
        try {
            int iU = u(wflxmlrfwpVar, i13, obj, j13, rgvfuqvkyqVarZoijcleaow, false);
            if (iU == 0) {
                wflxmlrfwpVar.zoijcleaow();
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } else {
                if (iU != 1) {
                    if (iU != 2) {
                        if (iU != 4) {
                            if (iU != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            wflxmlrfwpVar.zoijcleaow();
                            wflxmlrfwp wflxmlrfwpVar3 = (wflxmlrfwp) f82858pmvmpeiblj.get(this);
                            while (true) {
                                long andIncrement = f82856iwizpuwonk.getAndIncrement(this);
                                long j14 = andIncrement & 1152921504606846975L;
                                boolean zAuzgnhcxok = auzgnhcxok(andIncrement);
                                int i14 = rj.gxszxtbevo.f82901zoijcleaow;
                                long j15 = j14 / ((long) i14);
                                int i15 = (int) (j14 % ((long) i14));
                                if (wflxmlrfwpVar3.f113652jyumaefscl != j15) {
                                    wflxmlrfwp wflxmlrfwpVarJhduphickx = jhduphickx(j15, wflxmlrfwpVar3);
                                    if (wflxmlrfwpVarJhduphickx != null) {
                                        wflxmlrfwpVar2 = wflxmlrfwpVarJhduphickx;
                                    } else if (zAuzgnhcxok) {
                                    }
                                } else {
                                    wflxmlrfwpVar2 = wflxmlrfwpVar3;
                                }
                                wflxmlrfwp wflxmlrfwpVar4 = wflxmlrfwpVar2;
                                int iU2 = u(wflxmlrfwpVar2, i15, obj, j14, rgvfuqvkyqVarZoijcleaow, zAuzgnhcxok);
                                if (iU2 == 0) {
                                    wflxmlrfwpVar4.zoijcleaow();
                                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                                } else if (iU2 == 1) {
                                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                                } else if (iU2 == 2) {
                                    if (!zAuzgnhcxok) {
                                        pj.rgvfuqvkyq rgvfuqvkyqVar = rgvfuqvkyqVarZoijcleaow != null ? rgvfuqvkyqVarZoijcleaow : null;
                                        if (rgvfuqvkyqVar == null) {
                                            break;
                                        }
                                        krqnebusok(rgvfuqvkyqVar, wflxmlrfwpVar4, i15);
                                        break;
                                    }
                                    wflxmlrfwpVar4.zdlpuopuiu();
                                } else {
                                    if (iU2 == 3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    if (iU2 != 4) {
                                        if (iU2 == 5) {
                                            wflxmlrfwpVar4.zoijcleaow();
                                        }
                                        wflxmlrfwpVar3 = wflxmlrfwpVar4;
                                    } else if (j14 < ydmasvzmpa()) {
                                        wflxmlrfwpVar4.zoijcleaow();
                                    }
                                }
                            }
                        } else if (j13 < ydmasvzmpa()) {
                            wflxmlrfwpVar.zoijcleaow();
                        }
                        jrbgnlbqoe(obj, rgvfuqvkyqVarZoijcleaow);
                        break;
                    } else {
                        krqnebusok(rgvfuqvkyqVarZoijcleaow, wflxmlrfwpVar, i13);
                    }
                    objZdlpuopuiu = rgvfuqvkyqVarZoijcleaow.zdlpuopuiu();
                    if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                        kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
                    }
                    if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                        return objZdlpuopuiu;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            }
            rgvfuqvkyqVarZoijcleaow.resumeWith(objWkgbmnqykc);
            objZdlpuopuiu = rgvfuqvkyqVarZoijcleaow.zdlpuopuiu();
            if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
            }
            if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                return objZdlpuopuiu;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th2) {
            rgvfuqvkyqVarZoijcleaow.hcddaimhww();
            throw th2;
        }
    }

    static /* synthetic */ void lrnfpwlwnk(eablkybsjg eablkybsjgVar, long j13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i13 & 1) != 0) {
            j13 = 1;
        }
        eablkybsjgVar.weqkydbzbr(j13);
    }

    private final void lxfrhoxuzk() {
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f82856iwizpuwonk;
        do {
            j13 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j13, rj.gxszxtbevo.iwizpuwonk(1152921504606846975L & j13, 3)));
    }

    private final boolean m(long j13) {
        if (auzgnhcxok(j13)) {
            return false;
        }
        return !wypolnanlu(j13 & 1152921504606846975L);
    }

    private final void mhtqkkgtqm(xj.btonecajqb btonecajqbVar) {
        btonecajqbVar.wkgbmnqykc(rj.gxszxtbevo.lereixgezr());
    }

    private final boolean n(Object obj, Object obj2) {
        if (obj instanceof xj.btonecajqb) {
            return ((xj.btonecajqb) obj).gxszxtbevo(this, obj2);
        }
        if (obj instanceof yggfygwlhe) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            pj.rgvfuqvkyq rgvfuqvkyqVar = ((yggfygwlhe) obj).f82930zdlpuopuiu;
            gtknphoqwx gtknphoqwxVarZoijcleaow = gtknphoqwx.zoijcleaow(gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(obj2));
            tg.draadjrbmk draadjrbmkVar = this.f82862yggfygwlhe;
            return rj.gxszxtbevo.zynmafqrjb(rgvfuqvkyqVar, gtknphoqwxVarZoijcleaow, (tg.vdvldrhtss) (draadjrbmkVar != null ? dsvhmnatus(draadjrbmkVar) : null));
        }
        if (obj instanceof iobyxmoadg) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((iobyxmoadg) obj).dxjokdxxww(obj2);
        }
        if (obj instanceof pj.agtfadlqog) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            pj.agtfadlqog agtfadlqogVar = (pj.agtfadlqog) obj;
            tg.draadjrbmk draadjrbmkVar2 = this.f82862yggfygwlhe;
            return rj.gxszxtbevo.zynmafqrjb(agtfadlqogVar, obj2, (tg.vdvldrhtss) (draadjrbmkVar2 != null ? jpowsppfya(draadjrbmkVar2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final void ntlheqmsrt(long j13) {
        g(ulzqkzuiru(j13));
    }

    private final boolean nuxfzjnpeb(wflxmlrfwp wflxmlrfwpVar, int i13, long j13) {
        Object objZynmafqrjb;
        do {
            objZynmafqrjb = wflxmlrfwpVar.zynmafqrjb(i13);
            if (objZynmafqrjb != null && objZynmafqrjb != rj.gxszxtbevo.f82887eablkybsjg) {
                if (objZynmafqrjb == rj.gxszxtbevo.f82900wkgbmnqykc) {
                    return true;
                }
                if (objZynmafqrjb == rj.gxszxtbevo.f82884btonecajqb || objZynmafqrjb == rj.gxszxtbevo.lereixgezr() || objZynmafqrjb == rj.gxszxtbevo.f82886dxjokdxxww || objZynmafqrjb == rj.gxszxtbevo.f82893nufgyqmvbu) {
                    return false;
                }
                if (objZynmafqrjb == rj.gxszxtbevo.f82892lqeggnwhkg) {
                    return true;
                }
                return objZynmafqrjb != rj.gxszxtbevo.f82889gxszxtbevo && j13 == ydmasvzmpa();
            }
        } while (!wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.f82893nufgyqmvbu));
        jlmebxxoox();
        return false;
    }

    private final boolean o(Object obj, wflxmlrfwp wflxmlrfwpVar, int i13) {
        if (obj instanceof pj.agtfadlqog) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return rj.gxszxtbevo.istkbnxepw((pj.agtfadlqog) obj, wwaezpbzkn.f37140iobyxmoadg, null, 2, null);
        }
        if (!(obj instanceof xj.btonecajqb)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        xj.draadjrbmk draadjrbmkVarCqumvgiudr = ((xj.dxjokdxxww) obj).cqumvgiudr(this, wwaezpbzkn.f37140iobyxmoadg);
        if (draadjrbmkVarCqumvgiudr == xj.draadjrbmk.REREGISTER) {
            wflxmlrfwpVar.iwizpuwonk(i13);
        }
        return draadjrbmkVarCqumvgiudr == xj.draadjrbmk.SUCCESSFUL;
    }

    private final long okpsazkaxt() {
        return f82854esjtqupxsv.get(this);
    }

    private final boolean q(wflxmlrfwp wflxmlrfwpVar, int i13, long j13) {
        Object objZynmafqrjb = wflxmlrfwpVar.zynmafqrjb(i13);
        if (!(objZynmafqrjb instanceof j) || j13 < f82853cqumvgiudr.get(this) || !wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.f82892lqeggnwhkg)) {
            return r(wflxmlrfwpVar, i13, j13);
        }
        if (o(objZynmafqrjb, wflxmlrfwpVar, i13)) {
            wflxmlrfwpVar.iozdgvuglv(i13, rj.gxszxtbevo.f82900wkgbmnqykc);
            return true;
        }
        wflxmlrfwpVar.iozdgvuglv(i13, rj.gxszxtbevo.f82884btonecajqb);
        wflxmlrfwpVar.istkbnxepw(i13, false);
        return false;
    }

    private final boolean r(wflxmlrfwp wflxmlrfwpVar, int i13, long j13) {
        while (true) {
            Object objZynmafqrjb = wflxmlrfwpVar.zynmafqrjb(i13);
            if (objZynmafqrjb instanceof j) {
                if (j13 < f82853cqumvgiudr.get(this)) {
                    if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, new cqumvgiudr((j) objZynmafqrjb))) {
                        return true;
                    }
                } else if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.f82892lqeggnwhkg)) {
                    if (o(objZynmafqrjb, wflxmlrfwpVar, i13)) {
                        wflxmlrfwpVar.iozdgvuglv(i13, rj.gxszxtbevo.f82900wkgbmnqykc);
                        return true;
                    }
                    wflxmlrfwpVar.iozdgvuglv(i13, rj.gxszxtbevo.f82884btonecajqb);
                    wflxmlrfwpVar.istkbnxepw(i13, false);
                    return false;
                }
            } else {
                if (objZynmafqrjb == rj.gxszxtbevo.f82884btonecajqb) {
                    return false;
                }
                if (objZynmafqrjb == null) {
                    if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.f82887eablkybsjg)) {
                        return true;
                    }
                } else {
                    if (objZynmafqrjb == rj.gxszxtbevo.f82900wkgbmnqykc || objZynmafqrjb == rj.gxszxtbevo.f82893nufgyqmvbu || objZynmafqrjb == rj.gxszxtbevo.f82886dxjokdxxww || objZynmafqrjb == rj.gxszxtbevo.f82888gtknphoqwx || objZynmafqrjb == rj.gxszxtbevo.lereixgezr()) {
                        return true;
                    }
                    if (objZynmafqrjb != rj.gxszxtbevo.f82889gxszxtbevo) {
                        throw new IllegalStateException(("Unexpected cell state: " + objZynmafqrjb).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tg.vdvldrhtss rhgxfdycjh(final eablkybsjg eablkybsjgVar, final xj.btonecajqb btonecajqbVar, Object obj, final Object obj2) {
        return new tg.vdvldrhtss() { // from class: rj.wkgbmnqykc
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return eablkybsjg.yzdjzghtvl(obj2, eablkybsjgVar, btonecajqbVar, (Throwable) obj3, obj4, (lg.btonecajqb) obj5);
            }
        };
    }

    private final wflxmlrfwp ribwqtqdhb(long j13, wflxmlrfwp wflxmlrfwpVar, long j14) {
        Object objPpxfxbqfkf;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f82855istkbnxepw;
        tg.rgvfuqvkyq rgvfuqvkyqVar = (tg.rgvfuqvkyq) rj.gxszxtbevo.esjtqupxsv();
        loop0: while (true) {
            objPpxfxbqfkf = uj.iobyxmoadg.ppxfxbqfkf(wflxmlrfwpVar, j13, rgvfuqvkyqVar);
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
        if (pmvmpeiblj.ppxfxbqfkf(objPpxfxbqfkf)) {
            sopmlzcsov();
            hszhottldk(j13, wflxmlrfwpVar);
            lrnfpwlwnk(this, 0L, 1, null);
            return null;
        }
        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) pmvmpeiblj.zoijcleaow(objPpxfxbqfkf);
        if (wflxmlrfwpVar2.f113652jyumaefscl <= j13) {
            return wflxmlrfwpVar2;
        }
        long j15 = wflxmlrfwpVar2.f113652jyumaefscl;
        int i13 = rj.gxszxtbevo.f82901zoijcleaow;
        if (f82854esjtqupxsv.compareAndSet(this, j14 + 1, j15 * ((long) i13))) {
            weqkydbzbr((wflxmlrfwpVar2.f113652jyumaefscl * ((long) i13)) - j14);
            return null;
        }
        lrnfpwlwnk(this, 0L, 1, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(wflxmlrfwp wflxmlrfwpVar, int i13, long j13, Object obj) {
        Object objZynmafqrjb = wflxmlrfwpVar.zynmafqrjb(i13);
        if (objZynmafqrjb == null) {
            if (j13 >= (f82856iwizpuwonk.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return rj.gxszxtbevo.f82883agtfadlqog;
                }
                if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, obj)) {
                    jlmebxxoox();
                    return rj.gxszxtbevo.f82899wflxmlrfwp;
                }
            }
        } else if (objZynmafqrjb == rj.gxszxtbevo.f82900wkgbmnqykc && wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.f82886dxjokdxxww)) {
            jlmebxxoox();
            return wflxmlrfwpVar.cdpycssgdh(i13);
        }
        return t(wflxmlrfwpVar, i13, j13, obj);
    }

    private final long skhdrjzrfn(wflxmlrfwp wflxmlrfwpVar) {
        do {
            int i13 = rj.gxszxtbevo.f82901zoijcleaow;
            while (true) {
                i13--;
                if (-1 < i13) {
                    long j13 = (wflxmlrfwpVar.f113652jyumaefscl * ((long) rj.gxszxtbevo.f82901zoijcleaow)) + ((long) i13);
                    if (j13 >= ydmasvzmpa()) {
                        while (true) {
                            Object objZynmafqrjb = wflxmlrfwpVar.zynmafqrjb(i13);
                            if (objZynmafqrjb != null && objZynmafqrjb != rj.gxszxtbevo.f82887eablkybsjg) {
                                if (objZynmafqrjb != rj.gxszxtbevo.f82900wkgbmnqykc) {
                                    break;
                                }
                                return j13;
                            }
                            if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.lereixgezr())) {
                                wflxmlrfwpVar.zdlpuopuiu();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            wflxmlrfwpVar = (wflxmlrfwp) wflxmlrfwpVar.nufgyqmvbu();
        } while (wflxmlrfwpVar != null);
        return -1L;
    }

    private final void sopmlzcsov() {
        zdlpuopuiu();
    }

    private final Object t(wflxmlrfwp wflxmlrfwpVar, int i13, long j13, Object obj) {
        while (true) {
            Object objZynmafqrjb = wflxmlrfwpVar.zynmafqrjb(i13);
            if (objZynmafqrjb == null || objZynmafqrjb == rj.gxszxtbevo.f82887eablkybsjg) {
                if (j13 < (f82856iwizpuwonk.get(this) & 1152921504606846975L)) {
                    if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.f82893nufgyqmvbu)) {
                        jlmebxxoox();
                        return rj.gxszxtbevo.f82894ojitshcjhn;
                    }
                } else {
                    if (obj == null) {
                        return rj.gxszxtbevo.f82883agtfadlqog;
                    }
                    if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, obj)) {
                        jlmebxxoox();
                        return rj.gxszxtbevo.f82899wflxmlrfwp;
                    }
                }
            } else {
                if (objZynmafqrjb != rj.gxszxtbevo.f82900wkgbmnqykc) {
                    if (objZynmafqrjb != rj.gxszxtbevo.f82884btonecajqb && objZynmafqrjb != rj.gxszxtbevo.f82893nufgyqmvbu) {
                        if (objZynmafqrjb == rj.gxszxtbevo.lereixgezr()) {
                            jlmebxxoox();
                            return rj.gxszxtbevo.f82894ojitshcjhn;
                        }
                        if (objZynmafqrjb != rj.gxszxtbevo.f82892lqeggnwhkg && wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.f82889gxszxtbevo)) {
                            boolean z13 = objZynmafqrjb instanceof cqumvgiudr;
                            if (z13) {
                                objZynmafqrjb = ((cqumvgiudr) objZynmafqrjb).f82851iobyxmoadg;
                            }
                            if (o(objZynmafqrjb, wflxmlrfwpVar, i13)) {
                                wflxmlrfwpVar.iozdgvuglv(i13, rj.gxszxtbevo.f82886dxjokdxxww);
                                jlmebxxoox();
                                return wflxmlrfwpVar.cdpycssgdh(i13);
                            }
                            wflxmlrfwpVar.iozdgvuglv(i13, rj.gxszxtbevo.f82884btonecajqb);
                            wflxmlrfwpVar.istkbnxepw(i13, false);
                            if (z13) {
                                jlmebxxoox();
                            }
                            return rj.gxszxtbevo.f82894ojitshcjhn;
                        }
                    }
                    return rj.gxszxtbevo.f82894ojitshcjhn;
                }
                if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.f82886dxjokdxxww)) {
                    jlmebxxoox();
                    return wflxmlrfwpVar.cdpycssgdh(i13);
                }
            }
        }
    }

    private final boolean tbqsvytpvh(long j13, boolean z13) {
        int i13 = (int) (j13 >> 60);
        if (i13 == 0 || i13 == 1) {
            return false;
        }
        if (i13 == 2) {
            ulzqkzuiru(j13 & 1152921504606846975L);
            if (z13 && iyctptxqzt()) {
                return false;
            }
        } else {
            if (i13 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i13).toString());
            }
            ntlheqmsrt(j13 & 1152921504606846975L);
        }
        return true;
    }

    private final wflxmlrfwp tzroggbefp() {
        Object obj = f82855istkbnxepw.get(this);
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) f82858pmvmpeiblj.get(this);
        if (wflxmlrfwpVar.f113652jyumaefscl > ((wflxmlrfwp) obj).f113652jyumaefscl) {
            obj = wflxmlrfwpVar;
        }
        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) f82860zynmafqrjb.get(this);
        if (wflxmlrfwpVar2.f113652jyumaefscl > ((wflxmlrfwp) obj).f113652jyumaefscl) {
            obj = wflxmlrfwpVar2;
        }
        return (wflxmlrfwp) uj.iobyxmoadg.zoijcleaow((uj.zoijcleaow) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int u(wflxmlrfwp wflxmlrfwpVar, int i13, Object obj, long j13, Object obj2, boolean z13) {
        wflxmlrfwpVar.lmojexxdyd(i13, obj);
        if (z13) {
            return v(wflxmlrfwpVar, i13, obj, j13, obj2, z13);
        }
        Object objZynmafqrjb = wflxmlrfwpVar.zynmafqrjb(i13);
        if (objZynmafqrjb == null) {
            if (wypolnanlu(j13)) {
                if (wflxmlrfwpVar.jyumaefscl(i13, null, rj.gxszxtbevo.f82900wkgbmnqykc)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (wflxmlrfwpVar.jyumaefscl(i13, null, obj2)) {
                    return 2;
                }
            }
        } else if (objZynmafqrjb instanceof j) {
            wflxmlrfwpVar.iwizpuwonk(i13);
            if (n(objZynmafqrjb, obj)) {
                wflxmlrfwpVar.iozdgvuglv(i13, rj.gxszxtbevo.f82886dxjokdxxww);
                fmlbqenlif();
                return 0;
            }
            if (wflxmlrfwpVar.cqumvgiudr(i13, rj.gxszxtbevo.f82888gtknphoqwx) != rj.gxszxtbevo.f82888gtknphoqwx) {
                wflxmlrfwpVar.istkbnxepw(i13, true);
            }
            return 5;
        }
        return v(wflxmlrfwpVar, i13, obj, j13, obj2, z13);
    }

    private final boolean uawqvzlxes(long j13) {
        return tbqsvytpvh(j13, true);
    }

    private final wflxmlrfwp ulzqkzuiru(long j13) {
        wflxmlrfwp wflxmlrfwpVarTzroggbefp = tzroggbefp();
        if (iwxlajgraz()) {
            long jSkhdrjzrfn = skhdrjzrfn(wflxmlrfwpVarTzroggbefp);
            if (jSkhdrjzrfn != -1) {
                crxdokpmqz(jSkhdrjzrfn);
            }
        }
        kegysxyocb(wflxmlrfwpVarTzroggbefp, j13);
        return wflxmlrfwpVarTzroggbefp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater uwvvkdfqfp() {
        return f82860zynmafqrjb;
    }

    private final int v(wflxmlrfwp wflxmlrfwpVar, int i13, Object obj, long j13, Object obj2, boolean z13) {
        while (true) {
            Object objZynmafqrjb = wflxmlrfwpVar.zynmafqrjb(i13);
            if (objZynmafqrjb == null) {
                if (!wypolnanlu(j13) || z13) {
                    if (z13) {
                        if (wflxmlrfwpVar.jyumaefscl(i13, null, rj.gxszxtbevo.f82884btonecajqb)) {
                            wflxmlrfwpVar.istkbnxepw(i13, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (wflxmlrfwpVar.jyumaefscl(i13, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (wflxmlrfwpVar.jyumaefscl(i13, null, rj.gxszxtbevo.f82900wkgbmnqykc)) {
                    return 1;
                }
            } else {
                if (objZynmafqrjb != rj.gxszxtbevo.f82887eablkybsjg) {
                    if (objZynmafqrjb == rj.gxszxtbevo.f82888gtknphoqwx) {
                        wflxmlrfwpVar.iwizpuwonk(i13);
                        return 5;
                    }
                    if (objZynmafqrjb == rj.gxszxtbevo.f82893nufgyqmvbu) {
                        wflxmlrfwpVar.iwizpuwonk(i13);
                        return 5;
                    }
                    if (objZynmafqrjb == rj.gxszxtbevo.lereixgezr()) {
                        wflxmlrfwpVar.iwizpuwonk(i13);
                        sopmlzcsov();
                        return 4;
                    }
                    wflxmlrfwpVar.iwizpuwonk(i13);
                    if (objZynmafqrjb instanceof cqumvgiudr) {
                        objZynmafqrjb = ((cqumvgiudr) objZynmafqrjb).f82851iobyxmoadg;
                    }
                    if (n(objZynmafqrjb, obj)) {
                        wflxmlrfwpVar.iozdgvuglv(i13, rj.gxszxtbevo.f82886dxjokdxxww);
                        fmlbqenlif();
                        return 0;
                    }
                    if (wflxmlrfwpVar.cqumvgiudr(i13, rj.gxszxtbevo.f82888gtknphoqwx) != rj.gxszxtbevo.f82888gtknphoqwx) {
                        wflxmlrfwpVar.istkbnxepw(i13, true);
                    }
                    return 5;
                }
                if (wflxmlrfwpVar.jyumaefscl(i13, objZynmafqrjb, rj.gxszxtbevo.f82900wkgbmnqykc)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wflxmlrfwp vipkmwdibw(long j13, wflxmlrfwp wflxmlrfwpVar) {
        Object objPpxfxbqfkf;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f82860zynmafqrjb;
        tg.rgvfuqvkyq rgvfuqvkyqVar = (tg.rgvfuqvkyq) rj.gxszxtbevo.esjtqupxsv();
        loop0: while (true) {
            objPpxfxbqfkf = uj.iobyxmoadg.ppxfxbqfkf(wflxmlrfwpVar, j13, rgvfuqvkyqVar);
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
        if (pmvmpeiblj.ppxfxbqfkf(objPpxfxbqfkf)) {
            sopmlzcsov();
            if (wflxmlrfwpVar.f113652jyumaefscl * ((long) rj.gxszxtbevo.f82901zoijcleaow) >= bfopjjpdmp()) {
                return null;
            }
            wflxmlrfwpVar.zoijcleaow();
            return null;
        }
        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) pmvmpeiblj.zoijcleaow(objPpxfxbqfkf);
        if (!dvvnrvtcbc() && j13 <= okpsazkaxt() / ((long) rj.gxszxtbevo.f82901zoijcleaow)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f82855istkbnxepw;
            while (true) {
                lereixgezr lereixgezrVar2 = (lereixgezr) atomicReferenceFieldUpdater2.get(this);
                if (lereixgezrVar2.f113652jyumaefscl >= wflxmlrfwpVar2.f113652jyumaefscl || !wflxmlrfwpVar2.yggfygwlhe()) {
                    break;
                }
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(atomicReferenceFieldUpdater2, this, lereixgezrVar2, wflxmlrfwpVar2)) {
                    if (!lereixgezrVar2.rgvfuqvkyq()) {
                        break;
                    }
                    lereixgezrVar2.agtfadlqog();
                    break;
                }
                if (wflxmlrfwpVar2.rgvfuqvkyq()) {
                    wflxmlrfwpVar2.agtfadlqog();
                }
            }
        }
        long j14 = wflxmlrfwpVar2.f113652jyumaefscl;
        if (j14 <= j13) {
            return wflxmlrfwpVar2;
        }
        int i13 = rj.gxszxtbevo.f82901zoijcleaow;
        w(j14 * ((long) i13));
        if (wflxmlrfwpVar2.f113652jyumaefscl * ((long) i13) >= bfopjjpdmp()) {
            return null;
        }
        wflxmlrfwpVar2.zoijcleaow();
        return null;
    }

    private final void w(long j13) {
        long j14;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f82853cqumvgiudr;
        do {
            j14 = atomicLongFieldUpdater.get(this);
            if (j14 >= j13) {
                return;
            }
        } while (!f82853cqumvgiudr.compareAndSet(this, j14, j13));
    }

    private final void weqkydbzbr(long j13) {
        if ((f82857lereixgezr.addAndGet(this, j13) & 4611686018427387904L) != 0) {
            while ((f82857lereixgezr.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    private final void wizcaqwiak() {
        long j13;
        long jIwizpuwonk;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f82856iwizpuwonk;
        do {
            j13 = atomicLongFieldUpdater.get(this);
            int i13 = (int) (j13 >> 60);
            if (i13 == 0) {
                jIwizpuwonk = rj.gxszxtbevo.iwizpuwonk(j13 & 1152921504606846975L, 2);
            } else if (i13 != 1) {
                return;
            } else {
                jIwizpuwonk = rj.gxszxtbevo.iwizpuwonk(j13 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j13, jIwizpuwonk));
    }

    private final boolean wypolnanlu(long j13) {
        return j13 < okpsazkaxt() || j13 < ydmasvzmpa() + ((long) this.f82863zdlpuopuiu);
    }

    private final void x(long j13) {
        long j14;
        long j15;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f82856iwizpuwonk;
        do {
            j14 = atomicLongFieldUpdater.get(this);
            j15 = 1152921504606846975L & j14;
            if (j15 >= j13) {
                return;
            }
        } while (!f82856iwizpuwonk.compareAndSet(this, j14, rj.gxszxtbevo.iwizpuwonk(j15, (int) (j14 >> 60))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater yfnezrywwk() {
        return f82853cqumvgiudr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yzdjzghtvl(Object obj, eablkybsjg eablkybsjgVar, xj.btonecajqb btonecajqbVar, Throwable th2, Object obj2, lg.btonecajqb btonecajqbVar2) {
        if (obj != rj.gxszxtbevo.lereixgezr()) {
            uj.jyumaefscl.iobyxmoadg(eablkybsjgVar.f82862yggfygwlhe, obj, btonecajqbVar.getContext());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void zeieaojujs() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f82859yadqdtsiqt;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(atomicReferenceFieldUpdater, this, obj, obj == null ? rj.gxszxtbevo.f82898vdvldrhtss : rj.gxszxtbevo.f82895oxmwwwfdhm));
        if (obj == null) {
            return;
        }
        ((tg.draadjrbmk) obj).invoke(xrmfcynszj());
    }

    public final long bfopjjpdmp() {
        return f82856iwizpuwonk.get(this) & 1152921504606846975L;
    }

    protected final void crxdokpmqz(long j13) {
        UndeliveredElementException undeliveredElementExceptionPpxfxbqfkf;
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) f82860zynmafqrjb.get(this);
        while (true) {
            long j14 = f82853cqumvgiudr.get(this);
            if (j13 < Math.max(((long) this.f82863zdlpuopuiu) + j14, okpsazkaxt())) {
                return;
            }
            if (f82853cqumvgiudr.compareAndSet(this, j14, j14 + 1)) {
                int i13 = rj.gxszxtbevo.f82901zoijcleaow;
                long j15 = j14 / ((long) i13);
                int i14 = (int) (j14 % ((long) i13));
                if (wflxmlrfwpVar.f113652jyumaefscl != j15) {
                    wflxmlrfwp wflxmlrfwpVarVipkmwdibw = vipkmwdibw(j15, wflxmlrfwpVar);
                    if (wflxmlrfwpVarVipkmwdibw == null) {
                        continue;
                    } else {
                        wflxmlrfwpVar = wflxmlrfwpVarVipkmwdibw;
                    }
                }
                Object objS = s(wflxmlrfwpVar, i14, j14, null);
                if (objS != rj.gxszxtbevo.f82894ojitshcjhn) {
                    wflxmlrfwpVar.zoijcleaow();
                    tg.draadjrbmk draadjrbmkVar = this.f82862yggfygwlhe;
                    if (draadjrbmkVar != null && (undeliveredElementExceptionPpxfxbqfkf = uj.jyumaefscl.ppxfxbqfkf(draadjrbmkVar, objS, null, 2, null)) != null) {
                        throw undeliveredElementExceptionPpxfxbqfkf;
                    }
                } else if (j14 < bfopjjpdmp()) {
                    wflxmlrfwpVar.zoijcleaow();
                }
            }
        }
    }

    @Override // rj.jyumaefscl
    public xj.gxszxtbevo dxjokdxxww() {
        wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.f82878zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        tg.vdvldrhtss vdvldrhtssVar = (tg.vdvldrhtss) mbcevpiqjq.eablkybsjg(wkgbmnqykcVar, 3);
        C1858eablkybsjg c1858eablkybsjg = C1858eablkybsjg.f82864zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(c1858eablkybsjg, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new xj.lqeggnwhkg(this, vdvldrhtssVar, (tg.vdvldrhtss) mbcevpiqjq.eablkybsjg(c1858eablkybsjg, 3), this.f82861jyumaefscl);
    }

    @Override // rj.iwizpuwonk
    public Object eablkybsjg(Object obj) {
        wflxmlrfwp wflxmlrfwpVar;
        if (m(f82856iwizpuwonk.get(this))) {
            return gtknphoqwx.f82880zoijcleaow.zoijcleaow();
        }
        Object obj2 = rj.gxszxtbevo.f82884btonecajqb;
        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) f82858pmvmpeiblj.get(this);
        while (true) {
            long andIncrement = f82856iwizpuwonk.getAndIncrement(this);
            long j13 = andIncrement & 1152921504606846975L;
            boolean zAuzgnhcxok = auzgnhcxok(andIncrement);
            int i13 = rj.gxszxtbevo.f82901zoijcleaow;
            long j14 = j13 / ((long) i13);
            int i14 = (int) (j13 % ((long) i13));
            if (wflxmlrfwpVar2.f113652jyumaefscl != j14) {
                wflxmlrfwp wflxmlrfwpVarJhduphickx = jhduphickx(j14, wflxmlrfwpVar2);
                if (wflxmlrfwpVarJhduphickx != null) {
                    wflxmlrfwpVar = wflxmlrfwpVarJhduphickx;
                } else if (zAuzgnhcxok) {
                    break;
                }
            } else {
                wflxmlrfwpVar = wflxmlrfwpVar2;
            }
            int iU = u(wflxmlrfwpVar, i14, obj, j13, obj2, zAuzgnhcxok);
            if (iU == 0) {
                wflxmlrfwpVar.zoijcleaow();
            } else if (iU != 1) {
                if (iU == 2) {
                    if (zAuzgnhcxok) {
                        wflxmlrfwpVar.zdlpuopuiu();
                        break;
                    }
                    j jVar = obj2 instanceof j ? (j) obj2 : null;
                    if (jVar != null) {
                        krqnebusok(jVar, wflxmlrfwpVar, i14);
                    }
                    wflxmlrfwpVar.zdlpuopuiu();
                    return gtknphoqwx.f82880zoijcleaow.zoijcleaow();
                }
                if (iU == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iU == 4) {
                    if (j13 >= ydmasvzmpa()) {
                        break;
                    }
                    wflxmlrfwpVar.zoijcleaow();
                    break;
                }
                if (iU == 5) {
                    wflxmlrfwpVar.zoijcleaow();
                }
                wflxmlrfwpVar2 = wflxmlrfwpVar;
            }
            return gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(wwaezpbzkn.f37140iobyxmoadg);
        }
        return gtknphoqwx.f82880zoijcleaow.iobyxmoadg(sflfametgt());
    }

    protected void ezmngbhpjk() {
    }

    protected void fmlbqenlif() {
    }

    protected void fyldjkxazc() {
    }

    @Override // rj.jyumaefscl
    public Object gtknphoqwx() {
        wflxmlrfwp wflxmlrfwpVar;
        long j13 = f82853cqumvgiudr.get(this);
        long j14 = f82856iwizpuwonk.get(this);
        if (uawqvzlxes(j14)) {
            return gtknphoqwx.f82880zoijcleaow.iobyxmoadg(xrmfcynszj());
        }
        if (j13 >= (j14 & 1152921504606846975L)) {
            return gtknphoqwx.f82880zoijcleaow.zoijcleaow();
        }
        Object obj = rj.gxszxtbevo.f82888gtknphoqwx;
        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) uwvvkdfqfp().get(this);
        while (!roivzttewh()) {
            long andIncrement = yfnezrywwk().getAndIncrement(this);
            int i13 = rj.gxszxtbevo.f82901zoijcleaow;
            long j15 = andIncrement / ((long) i13);
            int i14 = (int) (andIncrement % ((long) i13));
            if (wflxmlrfwpVar2.f113652jyumaefscl != j15) {
                wflxmlrfwp wflxmlrfwpVarVipkmwdibw = vipkmwdibw(j15, wflxmlrfwpVar2);
                if (wflxmlrfwpVarVipkmwdibw == null) {
                    continue;
                } else {
                    wflxmlrfwpVar = wflxmlrfwpVarVipkmwdibw;
                }
            } else {
                wflxmlrfwpVar = wflxmlrfwpVar2;
            }
            Object objS = s(wflxmlrfwpVar, i14, andIncrement, obj);
            if (objS == rj.gxszxtbevo.f82899wflxmlrfwp) {
                j jVar = obj instanceof j ? (j) obj : null;
                if (jVar != null) {
                    eslsurpljm(jVar, wflxmlrfwpVar, i14);
                }
                y(andIncrement);
                wflxmlrfwpVar.zdlpuopuiu();
                return gtknphoqwx.f82880zoijcleaow.zoijcleaow();
            }
            if (objS != rj.gxszxtbevo.f82894ojitshcjhn) {
                if (objS == rj.gxszxtbevo.f82883agtfadlqog) {
                    throw new IllegalStateException("unexpected");
                }
                wflxmlrfwpVar.zoijcleaow();
                return gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(objS);
            }
            if (andIncrement < bfopjjpdmp()) {
                wflxmlrfwpVar.zoijcleaow();
            }
            wflxmlrfwpVar2 = wflxmlrfwpVar;
        }
        return gtknphoqwx.f82880zoijcleaow.iobyxmoadg(xrmfcynszj());
    }

    @Override // rj.iwizpuwonk
    public Object gxszxtbevo(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return k(this, obj, gxszxtbevoVar);
    }

    @Override // rj.jyumaefscl
    public dxjokdxxww iterator() {
        return new iobyxmoadg();
    }

    protected boolean iwxlajgraz() {
        return false;
    }

    public final boolean iyctptxqzt() {
        while (true) {
            wflxmlrfwp wflxmlrfwpVarVipkmwdibw = (wflxmlrfwp) f82860zynmafqrjb.get(this);
            long jYdmasvzmpa = ydmasvzmpa();
            if (bfopjjpdmp() <= jYdmasvzmpa) {
                return false;
            }
            int i13 = rj.gxszxtbevo.f82901zoijcleaow;
            long j13 = jYdmasvzmpa / ((long) i13);
            if (wflxmlrfwpVarVipkmwdibw.f113652jyumaefscl == j13 || (wflxmlrfwpVarVipkmwdibw = vipkmwdibw(j13, wflxmlrfwpVarVipkmwdibw)) != null) {
                wflxmlrfwpVarVipkmwdibw.zoijcleaow();
                if (nuxfzjnpeb(wflxmlrfwpVarVipkmwdibw, (int) (jYdmasvzmpa % ((long) i13)), jYdmasvzmpa)) {
                    return true;
                }
                f82853cqumvgiudr.compareAndSet(this, jYdmasvzmpa, 1 + jYdmasvzmpa);
            } else if (((wflxmlrfwp) f82860zynmafqrjb.get(this)).f113652jyumaefscl < j13) {
                return false;
            }
        }
    }

    protected boolean mbcevpiqjq(Throwable th2, boolean z13) {
        if (z13) {
            igdgnonuha();
        }
        boolean zIobyxmoadg = androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f82852cdpycssgdh, this, rj.gxszxtbevo.f82891kcexrzcfyt, th2);
        if (z13) {
            lxfrhoxuzk();
        } else {
            wizcaqwiak();
        }
        sopmlzcsov();
        fyldjkxazc();
        if (zIobyxmoadg) {
            zeieaojujs();
        }
        return zIobyxmoadg;
    }

    @Override // rj.jyumaefscl
    public final void nufgyqmvbu(CancellationException cancellationException) {
        stevsuqkhv(cancellationException);
    }

    @Override // rj.iwizpuwonk
    public boolean oxmwwwfdhm(Throwable th2) {
        return mbcevpiqjq(th2, false);
    }

    protected final Object p(Object obj) {
        wflxmlrfwp wflxmlrfwpVar;
        Object obj2 = rj.gxszxtbevo.f82900wkgbmnqykc;
        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) f82858pmvmpeiblj.get(this);
        while (true) {
            long andIncrement = f82856iwizpuwonk.getAndIncrement(this);
            long j13 = andIncrement & 1152921504606846975L;
            boolean zAuzgnhcxok = auzgnhcxok(andIncrement);
            int i13 = rj.gxszxtbevo.f82901zoijcleaow;
            long j14 = j13 / ((long) i13);
            int i14 = (int) (j13 % ((long) i13));
            if (wflxmlrfwpVar2.f113652jyumaefscl != j14) {
                wflxmlrfwp wflxmlrfwpVarJhduphickx = jhduphickx(j14, wflxmlrfwpVar2);
                if (wflxmlrfwpVarJhduphickx != null) {
                    wflxmlrfwpVar = wflxmlrfwpVarJhduphickx;
                } else if (zAuzgnhcxok) {
                    return gtknphoqwx.f82880zoijcleaow.iobyxmoadg(sflfametgt());
                }
            } else {
                wflxmlrfwpVar = wflxmlrfwpVar2;
            }
            int iU = u(wflxmlrfwpVar, i14, obj, j13, obj2, zAuzgnhcxok);
            if (iU == 0) {
                wflxmlrfwpVar.zoijcleaow();
                return gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(wwaezpbzkn.f37140iobyxmoadg);
            }
            if (iU == 1) {
                return gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(wwaezpbzkn.f37140iobyxmoadg);
            }
            if (iU == 2) {
                if (zAuzgnhcxok) {
                    wflxmlrfwpVar.zdlpuopuiu();
                    return gtknphoqwx.f82880zoijcleaow.iobyxmoadg(sflfametgt());
                }
                j jVar = obj2 instanceof j ? (j) obj2 : null;
                if (jVar != null) {
                    krqnebusok(jVar, wflxmlrfwpVar, i14);
                }
                crxdokpmqz((wflxmlrfwpVar.f113652jyumaefscl * ((long) i13)) + ((long) i14));
                return gtknphoqwx.f82880zoijcleaow.ppxfxbqfkf(wwaezpbzkn.f37140iobyxmoadg);
            }
            if (iU == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iU == 4) {
                if (j13 < ydmasvzmpa()) {
                    wflxmlrfwpVar.zoijcleaow();
                }
                return gtknphoqwx.f82880zoijcleaow.iobyxmoadg(sflfametgt());
            }
            if (iU == 5) {
                wflxmlrfwpVar.zoijcleaow();
            }
            wflxmlrfwpVar2 = wflxmlrfwpVar;
        }
    }

    @Override // rj.jyumaefscl
    public Object ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
        return b(this, gxszxtbevoVar);
    }

    public boolean roivzttewh() {
        return uawqvzlxes(f82856iwizpuwonk.get(this));
    }

    protected final Throwable sflfametgt() {
        Throwable thXrmfcynszj = xrmfcynszj();
        return thXrmfcynszj == null ? new ClosedSendChannelException("Channel was closed") : thXrmfcynszj;
    }

    public boolean stevsuqkhv(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return mbcevpiqjq(th2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb3 = new StringBuilder();
        int i13 = (int) (f82856iwizpuwonk.get(this) >> 60);
        if (i13 == 2) {
            sb3.append("closed,");
        } else if (i13 == 3) {
            sb3.append("cancelled,");
        }
        sb3.append("capacity=" + this.f82863zdlpuopuiu + ',');
        sb3.append("data=[");
        int i14 = 0;
        List listRgvfuqvkyq = hg.jyumaefscl.rgvfuqvkyq(f82860zynmafqrjb.get(this), f82858pmvmpeiblj.get(this), f82855istkbnxepw.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listRgvfuqvkyq) {
            if (((wflxmlrfwp) obj) != rj.gxszxtbevo.f82890iobyxmoadg) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j13 = ((wflxmlrfwp) next).f113652jyumaefscl;
            do {
                Object next2 = it.next();
                long j14 = ((wflxmlrfwp) next2).f113652jyumaefscl;
                if (j13 > j14) {
                    next = next2;
                    j13 = j14;
                }
            } while (it.hasNext());
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) next;
        long jYdmasvzmpa = ydmasvzmpa();
        long jBfopjjpdmp = bfopjjpdmp();
        loop2: while (true) {
            int i15 = rj.gxszxtbevo.f82901zoijcleaow;
            for (int i16 = i14; i16 < i15; i16++) {
                long j15 = (wflxmlrfwpVar.f113652jyumaefscl * ((long) rj.gxszxtbevo.f82901zoijcleaow)) + ((long) i16);
                if (j15 >= jBfopjjpdmp && j15 >= jYdmasvzmpa) {
                    break loop2;
                }
                Object objZynmafqrjb = wflxmlrfwpVar.zynmafqrjb(i16);
                Object objPmvmpeiblj = wflxmlrfwpVar.pmvmpeiblj(i16);
                if (objZynmafqrjb instanceof pj.agtfadlqog) {
                    string = (j15 >= jYdmasvzmpa || j15 < jBfopjjpdmp) ? (j15 >= jBfopjjpdmp || j15 < jYdmasvzmpa) ? "cont" : "send" : "receive";
                } else if (objZynmafqrjb instanceof xj.btonecajqb) {
                    string = (j15 >= jYdmasvzmpa || j15 < jBfopjjpdmp) ? (j15 >= jBfopjjpdmp || j15 < jYdmasvzmpa) ? "select" : "onSend" : "onReceive";
                } else if (objZynmafqrjb instanceof yggfygwlhe) {
                    string = "receiveCatching";
                } else if (objZynmafqrjb instanceof cqumvgiudr) {
                    string = "EB(" + objZynmafqrjb + ')';
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objZynmafqrjb, rj.gxszxtbevo.f82889gxszxtbevo) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objZynmafqrjb, rj.gxszxtbevo.f82892lqeggnwhkg)) {
                    string = "resuming_sender";
                } else {
                    if (objZynmafqrjb != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objZynmafqrjb, rj.gxszxtbevo.f82887eablkybsjg) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objZynmafqrjb, rj.gxszxtbevo.f82886dxjokdxxww) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objZynmafqrjb, rj.gxszxtbevo.f82893nufgyqmvbu) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objZynmafqrjb, rj.gxszxtbevo.f82888gtknphoqwx) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objZynmafqrjb, rj.gxszxtbevo.f82884btonecajqb) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objZynmafqrjb, rj.gxszxtbevo.lereixgezr())) {
                        string = objZynmafqrjb.toString();
                    }
                }
                if (objPmvmpeiblj != null) {
                    sb3.append('(' + string + ',' + objPmvmpeiblj + "),");
                } else {
                    sb3.append(string + ',');
                }
            }
            wflxmlrfwpVar = (wflxmlrfwp) wflxmlrfwpVar.gxszxtbevo();
            if (wflxmlrfwpVar == null) {
                break;
            }
            i14 = 0;
        }
        if (mj.kcexrzcfyt.v(sb3) == ',') {
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3.deleteCharAt(sb3.length() - 1), "deleteCharAt(...)");
        }
        sb3.append("]");
        return sb3.toString();
    }

    @Override // rj.jyumaefscl
    public Object wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
        return c(this, gxszxtbevoVar);
    }

    protected final Throwable xrmfcynszj() {
        return (Throwable) f82852cdpycssgdh.get(this);
    }

    public final void y(long j13) {
        long j14;
        long j15;
        if (dvvnrvtcbc()) {
            return;
        }
        while (okpsazkaxt() <= j13) {
        }
        int i13 = rj.gxszxtbevo.f82896ppxfxbqfkf;
        for (int i14 = 0; i14 < i13; i14++) {
            long jOkpsazkaxt = okpsazkaxt();
            if (jOkpsazkaxt == (f82857lereixgezr.get(this) & 4611686018427387903L) && jOkpsazkaxt == okpsazkaxt()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f82857lereixgezr;
        do {
            j14 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j14, rj.gxszxtbevo.jyumaefscl(j14 & 4611686018427387903L, true)));
        while (true) {
            long jOkpsazkaxt2 = okpsazkaxt();
            long j16 = f82857lereixgezr.get(this);
            long j17 = j16 & 4611686018427387903L;
            boolean z13 = (4611686018427387904L & j16) != 0;
            if (jOkpsazkaxt2 == j17 && jOkpsazkaxt2 == okpsazkaxt()) {
                break;
            } else if (!z13) {
                f82857lereixgezr.compareAndSet(this, j16, rj.gxszxtbevo.jyumaefscl(j17, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f82857lereixgezr;
        do {
            j15 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j15, rj.gxszxtbevo.jyumaefscl(j15 & 4611686018427387903L, false)));
    }

    public final long ydmasvzmpa() {
        return f82853cqumvgiudr.get(this);
    }

    @Override // rj.iwizpuwonk
    public boolean zdlpuopuiu() {
        return auzgnhcxok(f82856iwizpuwonk.get(this));
    }

    @Override // rj.iwizpuwonk
    public void zoijcleaow(tg.draadjrbmk draadjrbmkVar) {
        if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f82859yadqdtsiqt, this, null, draadjrbmkVar)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f82859yadqdtsiqt;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != rj.gxszxtbevo.f82898vdvldrhtss) {
                if (obj == rj.gxszxtbevo.f82895oxmwwwfdhm) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f82859yadqdtsiqt, this, rj.gxszxtbevo.f82898vdvldrhtss, rj.gxszxtbevo.f82895oxmwwwfdhm));
        draadjrbmkVar.invoke(xrmfcynszj());
    }
}
