package e61;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ow1.eablkybsjg f30605eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ow1.gxszxtbevo f30606ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dr0.iobyxmoadg f30607wkgbmnqykc;

    /* JADX INFO: renamed from: e61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0638iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f30608iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f30610yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f30611zdlpuopuiu;

        C0638iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f30610yggfygwlhe = obj;
            this.f30608iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ikoacuggdj(this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f30612jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f30613yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30614zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f30613yggfygwlhe = wkgbmnqykcVar;
            this.f30612jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f30613yggfygwlhe, this.f30612jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f30614zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = this.f30613yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.zoijcleaow.f30623iobyxmoadg)) {
                    this.f30612jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f30602iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.iobyxmoadg.f30621iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f30612jyumaefscl;
                    this.f30614zdlpuopuiu = 1;
                    if (iobyxmoadgVar.ikoacuggdj(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.ppxfxbqfkf.f30622iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f30612jyumaefscl.crxdokpmqz(eablkybsjg.ppxfxbqfkf.f30603iobyxmoadg);
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
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f30615jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ e61.ppxfxbqfkf f30616yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30617zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(e61.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f30616yggfygwlhe = ppxfxbqfkfVar;
            this.f30615jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f30616yggfygwlhe, this.f30615jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f30617zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f30616yggfygwlhe, e61.ppxfxbqfkf.iobyxmoadg.f30620iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                ow1.eablkybsjg eablkybsjgVar = this.f30615jyumaefscl.f30605eablkybsjg;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f30617zdlpuopuiu = 1;
                if (eablkybsjgVar.zoijcleaow(wwaezpbzknVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
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
    public iobyxmoadg(ow1.gxszxtbevo editIsAgreementAcceptedUseCase, dr0.iobyxmoadg dispatchersProvider, ow1.eablkybsjg editIsAgreementAcceptedDateUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(editIsAgreementAcceptedUseCase, "editIsAgreementAcceptedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(editIsAgreementAcceptedDateUseCase, "editIsAgreementAcceptedDateUseCase");
        this.f30606ppxfxbqfkf = editIsAgreementAcceptedUseCase;
        this.f30607wkgbmnqykc = dispatchersProvider;
        this.f30605eablkybsjg = editIsAgreementAcceptedDateUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ikoacuggdj(lg.gxszxtbevo gxszxtbevoVar) {
        C0638iobyxmoadg c0638iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C0638iobyxmoadg) {
            c0638iobyxmoadg = (C0638iobyxmoadg) gxszxtbevoVar;
            int i13 = c0638iobyxmoadg.f30608iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0638iobyxmoadg.f30608iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0638iobyxmoadg = new C0638iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0638iobyxmoadg = new C0638iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c0638iobyxmoadg.f30610yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0638iobyxmoadg.f30608iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                ow1.gxszxtbevo gxszxtbevoVar2 = this.f30606ppxfxbqfkf;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                c0638iobyxmoadg.f30611zdlpuopuiu = this;
                c0638iobyxmoadg.f30608iwizpuwonk = 1;
                if (gxszxtbevoVar2.zoijcleaow(wwaezpbzknVar, c0638iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c0638iobyxmoadg.f30611zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        iobyxmoadgVar.crxdokpmqz(eablkybsjg.zoijcleaow.f30604iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(e61.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }
}
