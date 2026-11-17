package t70;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final t20.iobyxmoadg f110009ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final t20.ppxfxbqfkf f110010wkgbmnqykc;

    /* JADX INFO: renamed from: t70.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2699iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f110011iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f110013yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f110014zdlpuopuiu;

        C2699iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f110013yggfygwlhe = obj;
            this.f110011iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ikoacuggdj(this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f110015iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f110017yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f110018zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f110017yggfygwlhe = obj;
            this.f110015iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.jztzpxfvev(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f110019jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f110020yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f110021zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f110020yggfygwlhe = wkgbmnqykcVar;
            this.f110019jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f110020yggfygwlhe, this.f110019jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f110021zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = this.f110020yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.zoijcleaow.f110027iobyxmoadg)) {
                    this.f110019jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f110006iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.iobyxmoadg.f110025iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f110019jyumaefscl;
                    this.f110021zdlpuopuiu = 1;
                    if (iobyxmoadgVar.ikoacuggdj(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.ppxfxbqfkf.f110026iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f110019jyumaefscl.crxdokpmqz(eablkybsjg.ppxfxbqfkf.f110007iobyxmoadg);
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(t20.iobyxmoadg applyIqosAgreementsUseCase, t20.ppxfxbqfkf setIqosAgreementsStatusUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(applyIqosAgreementsUseCase, "applyIqosAgreementsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setIqosAgreementsStatusUseCase, "setIqosAgreementsStatusUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f110009ppxfxbqfkf = applyIqosAgreementsUseCase;
        this.f110010wkgbmnqykc = setIqosAgreementsStatusUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ikoacuggdj(lg.gxszxtbevo gxszxtbevoVar) {
        C2699iobyxmoadg c2699iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C2699iobyxmoadg) {
            c2699iobyxmoadg = (C2699iobyxmoadg) gxszxtbevoVar;
            int i13 = c2699iobyxmoadg.f110011iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2699iobyxmoadg.f110011iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2699iobyxmoadg = new C2699iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2699iobyxmoadg = new C2699iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2699iobyxmoadg.f110013yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2699iobyxmoadg.f110011iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) c2699iobyxmoadg.f110014zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(obj);
        t20.iobyxmoadg iobyxmoadgVar2 = this.f110009ppxfxbqfkf;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        c2699iobyxmoadg.f110014zdlpuopuiu = this;
        c2699iobyxmoadg.f110011iwizpuwonk = 1;
        if (iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, c2699iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        c2699iobyxmoadg.f110014zdlpuopuiu = null;
        c2699iobyxmoadg.f110011iwizpuwonk = 2;
        if (iobyxmoadgVar.jztzpxfvev(c2699iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jztzpxfvev(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f110015iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f110015iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f110017yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f110015iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            t20.ppxfxbqfkf ppxfxbqfkfVar2 = this.f110010wkgbmnqykc;
            t20.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = new t20.ppxfxbqfkf.iobyxmoadg(true);
            ppxfxbqfkfVar.f110018zdlpuopuiu = this;
            ppxfxbqfkfVar.f110015iwizpuwonk = 1;
            if (ppxfxbqfkfVar2.zoijcleaow(iobyxmoadgVar2, ppxfxbqfkfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f110018zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.crxdokpmqz(eablkybsjg.zoijcleaow.f110008iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }
}
