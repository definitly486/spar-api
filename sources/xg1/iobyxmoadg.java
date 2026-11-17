package xg1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.core.domain.models.order.OrderDetail;
import ru.myspar.proloyalty.payment.impl.web.domain.store.State;
import ru.myspar.proloyalty.payment.impl.web.presentation.PaymentFlowParams;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final c11.eablkybsjg f122349ppxfxbqfkf;

    /* JADX INFO: renamed from: xg1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3081iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f122350jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f122351yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f122352zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3081iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f122351yggfygwlhe = ppxfxbqfkfVar;
            this.f122350jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C3081iobyxmoadg(this.f122351yggfygwlhe, this.f122350jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f122352zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f122351yggfygwlhe, ppxfxbqfkf.iobyxmoadg.f122361iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                PaymentFlowParams params = iobyxmoadg.ikoacuggdj(this.f122350jyumaefscl).getParams();
                if (params instanceof PaymentFlowParams.OrderPaymentParams) {
                    this.f122352zdlpuopuiu = 1;
                    if (this.f122350jyumaefscl.xrmfcynszj((PaymentFlowParams.OrderPaymentParams) params, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(params instanceof PaymentFlowParams.TipsPaymentParams)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f122350jyumaefscl.metgxyhuhe((PaymentFlowParams.TipsPaymentParams) params);
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
            return ((C3081iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f122353cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f122355jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f122356yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f122357zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f122355jyumaefscl = obj;
            this.f122353cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.xrmfcynszj(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, c11.eablkybsjg getOrderUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOrderUseCase, "getOrderUseCase");
        this.f122349ppxfxbqfkf = getOrderUseCase;
    }

    public static final /* synthetic */ State ikoacuggdj(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void metgxyhuhe(PaymentFlowParams.TipsPaymentParams tipsPaymentParams) {
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(tipsPaymentParams.getUrl(), 0.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object xrmfcynszj(PaymentFlowParams.OrderPaymentParams orderPaymentParams, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f122353cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f122353cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f122355jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f122353cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                c11.eablkybsjg eablkybsjgVar = this.f122349ppxfxbqfkf;
                c11.eablkybsjg.zoijcleaow zoijcleaowVar2 = new c11.eablkybsjg.zoijcleaow(orderPaymentParams.getArgs().getOrderId());
                zoijcleaowVar.f122357zdlpuopuiu = this;
                zoijcleaowVar.f122356yggfygwlhe = orderPaymentParams;
                zoijcleaowVar.f122353cqumvgiudr = 1;
                objZoijcleaow = eablkybsjgVar.zoijcleaow(zoijcleaowVar2, zoijcleaowVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            orderPaymentParams = (PaymentFlowParams.OrderPaymentParams) zoijcleaowVar.f122356yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f122357zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((OrderDetail) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(orderPaymentParams.getUrl(), ((OrderDetail) objWkgbmnqykc).getPrice()));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.rlfsiqarku(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f122362iobyxmoadg)) {
            PaymentFlowParams params = ((State) jlmebxxoox()).getParams();
            if (params instanceof PaymentFlowParams.OrderPaymentParams) {
                crxdokpmqz(eablkybsjg.ppxfxbqfkf.f122344iobyxmoadg);
                return;
            } else {
                if (!(params instanceof PaymentFlowParams.TipsPaymentParams)) {
                    throw new NoWhenBranchMatchedException();
                }
                crxdokpmqz(new eablkybsjg.iobyxmoadg(false, 1, null));
                return;
            }
        }
        if (intent instanceof wkgbmnqykc.C3082wkgbmnqykc) {
            crxdokpmqz(new eablkybsjg.wkgbmnqykc(((wkgbmnqykc.C3082wkgbmnqykc) intent).iobyxmoadg()));
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f122365iobyxmoadg)) {
            crxdokpmqz(new eablkybsjg.iobyxmoadg(false, 1, null));
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.ppxfxbqfkf.f122363iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new eablkybsjg.iobyxmoadg(true));
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C3081iobyxmoadg(action, this, null), 3, null);
    }

    public final void rlfsiqarku(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new eablkybsjg.zoijcleaow(error));
    }
}
