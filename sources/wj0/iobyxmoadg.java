package wj0;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.core.domain.models.order.Order;
import ru.myspar.payment.impl.web.domain.store.State;
import ru.myspar.payment.impl.web.presentation.PaymentFlowParams;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final x20.eablkybsjg f119979ppxfxbqfkf;

    /* JADX INFO: renamed from: wj0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2998iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f119980jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f119981yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f119982zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2998iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f119981yggfygwlhe = ppxfxbqfkfVar;
            this.f119980jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2998iobyxmoadg(this.f119981yggfygwlhe, this.f119980jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f119982zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f119981yggfygwlhe, ppxfxbqfkf.iobyxmoadg.f119990iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                PaymentFlowParams params = iobyxmoadg.ikoacuggdj(this.f119980jyumaefscl).getParams();
                if (params instanceof PaymentFlowParams.OrderPaymentParams) {
                    this.f119982zdlpuopuiu = 1;
                    if (this.f119980jyumaefscl.xrmfcynszj((PaymentFlowParams.OrderPaymentParams) params, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(params instanceof PaymentFlowParams.TipsPaymentParams)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f119980jyumaefscl.metgxyhuhe((PaymentFlowParams.TipsPaymentParams) params);
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
            return ((C2998iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f119983cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f119985jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f119986yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f119987zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f119985jyumaefscl = obj;
            this.f119983cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.xrmfcynszj(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, x20.eablkybsjg getOrderUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOrderUseCase, "getOrderUseCase");
        this.f119979ppxfxbqfkf = getOrderUseCase;
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
            int i13 = zoijcleaowVar.f119983cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f119983cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f119985jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f119983cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                x20.eablkybsjg eablkybsjgVar = this.f119979ppxfxbqfkf;
                x20.eablkybsjg.zoijcleaow zoijcleaowVar2 = new x20.eablkybsjg.zoijcleaow(orderPaymentParams.getArgs().getOrderId());
                zoijcleaowVar.f119987zdlpuopuiu = this;
                zoijcleaowVar.f119986yggfygwlhe = orderPaymentParams;
                zoijcleaowVar.f119983cqumvgiudr = 1;
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
            orderPaymentParams = (PaymentFlowParams.OrderPaymentParams) zoijcleaowVar.f119986yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f119987zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Order) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(orderPaymentParams.getUrl(), ((Order) objWkgbmnqykc).getPrice()));
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
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f119991iobyxmoadg)) {
            PaymentFlowParams params = ((State) jlmebxxoox()).getParams();
            if (params instanceof PaymentFlowParams.OrderPaymentParams) {
                crxdokpmqz(eablkybsjg.ppxfxbqfkf.f119974iobyxmoadg);
                return;
            } else {
                if (!(params instanceof PaymentFlowParams.TipsPaymentParams)) {
                    throw new NoWhenBranchMatchedException();
                }
                crxdokpmqz(new eablkybsjg.iobyxmoadg(false, 1, null));
                return;
            }
        }
        if (intent instanceof wkgbmnqykc.C2999wkgbmnqykc) {
            crxdokpmqz(new eablkybsjg.wkgbmnqykc(((wkgbmnqykc.C2999wkgbmnqykc) intent).iobyxmoadg()));
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f119994iobyxmoadg)) {
            crxdokpmqz(new eablkybsjg.iobyxmoadg(false, 1, null));
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.ppxfxbqfkf.f119992iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new eablkybsjg.iobyxmoadg(true));
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2998iobyxmoadg(action, this, null), 3, null);
    }

    public final void rlfsiqarku(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new eablkybsjg.zoijcleaow(error));
    }
}
