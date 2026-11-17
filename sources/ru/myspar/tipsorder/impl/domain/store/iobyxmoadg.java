package ru.myspar.tipsorder.impl.domain.store;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.core.error_handler.exceptions.DomainException;
import ru.myspar.tipsorder.impl.domain.model.TipsOrderParams;
import ru.myspar.tipsorder.impl.domain.model.TipsParamsState;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final u92.ppxfxbqfkf f104557eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final u92.iobyxmoadg f104558ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final u92.zoijcleaow f104559wkgbmnqykc;

    /* JADX INFO: renamed from: ru.myspar.tipsorder.impl.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2532iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f104560jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f104561yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f104562zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2532iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f104561yggfygwlhe = ppxfxbqfkfVar;
            this.f104560jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2532iobyxmoadg(this.f104561yggfygwlhe, this.f104560jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f104562zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104561yggfygwlhe, ppxfxbqfkf.iobyxmoadg.f104569iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar = this.f104560jyumaefscl;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    u92.iobyxmoadg.C2801iobyxmoadg c2801iobyxmoadg = new u92.iobyxmoadg.C2801iobyxmoadg(iobyxmoadg.metgxyhuhe(iobyxmoadgVar).getOrderId());
                    u92.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f104558ppxfxbqfkf;
                    this.f104562zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(c2801iobyxmoadg, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((TipsOrderParams) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = this.f104560jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.ulzqkzuiru(new gxszxtbevo.eablkybsjg((TipsOrderParams) objWkgbmnqykc));
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.uwvvkdfqfp(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2532iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f104563iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f104564jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f104565yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f104566zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f104564jyumaefscl = wkgbmnqykcVar;
            this.f104563iwizpuwonk = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f104564jyumaefscl, this.f104563iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            iobyxmoadg iobyxmoadgVar;
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f104565yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = this.f104564jyumaefscl;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.eablkybsjg.f104570iobyxmoadg)) {
                    this.f104563iwizpuwonk.crxdokpmqz(eablkybsjg.zoijcleaow.f104548iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.ppxfxbqfkf) {
                    this.f104563iwizpuwonk.ulzqkzuiru(new gxszxtbevo.lqeggnwhkg(true));
                    this.f104563iwizpuwonk.crxdokpmqz(new eablkybsjg.C2530eablkybsjg(((wkgbmnqykc.ppxfxbqfkf) this.f104564jyumaefscl).iobyxmoadg()));
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.iobyxmoadg) {
                    State stateMetgxyhuhe = iobyxmoadg.metgxyhuhe(this.f104563iwizpuwonk);
                    if (stateMetgxyhuhe.getTipsIsSending() || stateMetgxyhuhe.getMessage() != null || stateMetgxyhuhe.getVerifyFlag()) {
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = (wkgbmnqykc.iobyxmoadg) this.f104564jyumaefscl;
                    if (iobyxmoadgVar2 instanceof wkgbmnqykc.iobyxmoadg.C2533iobyxmoadg) {
                        this.f104563iwizpuwonk.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(((wkgbmnqykc.iobyxmoadg.C2533iobyxmoadg) this.f104564jyumaefscl).iobyxmoadg()));
                    } else {
                        if (!(iobyxmoadgVar2 instanceof wkgbmnqykc.iobyxmoadg.zoijcleaow)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f104563iwizpuwonk.ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(((wkgbmnqykc.iobyxmoadg.zoijcleaow) this.f104564jyumaefscl).iobyxmoadg(), ((wkgbmnqykc.iobyxmoadg.zoijcleaow) this.f104564jyumaefscl).zoijcleaow()));
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.gxszxtbevo.f104571iobyxmoadg)) {
                    State stateMetgxyhuhe2 = iobyxmoadg.metgxyhuhe(this.f104563iwizpuwonk);
                    iobyxmoadg iobyxmoadgVar3 = this.f104563iwizpuwonk;
                    if (stateMetgxyhuhe2.getTipsIsSending() || stateMetgxyhuhe2.getTipsOrderParams() == null) {
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    TipsParamsState tipsParamsState = (TipsParamsState) iobyxmoadgVar3.f104557eablkybsjg.zoijcleaow(new u92.ppxfxbqfkf.iobyxmoadg(stateMetgxyhuhe2.getTipsOrderParams()));
                    if (tipsParamsState instanceof TipsParamsState.ReadySend) {
                        iobyxmoadgVar3.ulzqkzuiru(new gxszxtbevo.C2531gxszxtbevo(true));
                        try {
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                            u92.zoijcleaow.iobyxmoadg iobyxmoadgVar5 = new u92.zoijcleaow.iobyxmoadg(stateMetgxyhuhe2.getOrderId(), ((TipsParamsState.ReadySend) tipsParamsState).getParams());
                            u92.zoijcleaow zoijcleaowVar = iobyxmoadgVar3.f104559wkgbmnqykc;
                            this.f104566zdlpuopuiu = iobyxmoadgVar3;
                            this.f104565yggfygwlhe = 1;
                            obj = zoijcleaowVar.zoijcleaow(iobyxmoadgVar5, this);
                            if (obj == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            iobyxmoadgVar = iobyxmoadgVar3;
                        } catch (Throwable th2) {
                            th = th2;
                            iobyxmoadgVar = iobyxmoadgVar3;
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                        }
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.C2534wkgbmnqykc.f104577iobyxmoadg)) {
                    TipsOrderStore$TipsMessage message = iobyxmoadg.metgxyhuhe(this.f104563iwizpuwonk).getMessage();
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(message, TipsOrderStore$TipsMessage.Success.f104541zdlpuopuiu) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(message, TipsOrderStore$TipsMessage.Verify.f104542zdlpuopuiu)) {
                        this.f104563iwizpuwonk.crxdokpmqz(eablkybsjg.ppxfxbqfkf.f104546iobyxmoadg);
                        this.f104563iwizpuwonk.ulzqkzuiru(gxszxtbevo.iobyxmoadg.f104551iobyxmoadg);
                    } else if (message instanceof TipsOrderStore$TipsMessage.Error) {
                        if (iobyxmoadg.metgxyhuhe(this.f104563iwizpuwonk).getTipsOrderParams() == null) {
                            this.f104563iwizpuwonk.crxdokpmqz(eablkybsjg.zoijcleaow.f104548iobyxmoadg);
                        }
                        this.f104563iwizpuwonk.ulzqkzuiru(new gxszxtbevo.zoijcleaow(null));
                    } else if (message != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.lqeggnwhkg.f104575iobyxmoadg)) {
                    this.f104563iwizpuwonk.ulzqkzuiru(new gxszxtbevo.zoijcleaow(TipsOrderStore$TipsMessage.Success.f104541zdlpuopuiu));
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.zoijcleaow.f104578iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (iobyxmoadg.metgxyhuhe(this.f104563iwizpuwonk).getVerifyFlag()) {
                        this.f104563iwizpuwonk.ulzqkzuiru(new gxszxtbevo.zoijcleaow(TipsOrderStore$TipsMessage.Verify.f104542zdlpuopuiu));
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) this.f104566zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((s92.zoijcleaow) obj);
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar.yfnezrywwk((s92.zoijcleaow) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.uwvvkdfqfp(thDxjokdxxww);
            }
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.C2531gxszxtbevo(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, u92.iobyxmoadg getTipsOrderInfoUseCase, u92.zoijcleaow sendTipsOrderUseCase, u92.ppxfxbqfkf validateTipsOrderParamsUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getTipsOrderInfoUseCase, "getTipsOrderInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sendTipsOrderUseCase, "sendTipsOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(validateTipsOrderParamsUseCase, "validateTipsOrderParamsUseCase");
        this.f104558ppxfxbqfkf = getTipsOrderInfoUseCase;
        this.f104559wkgbmnqykc = sendTipsOrderUseCase;
        this.f104557eablkybsjg = validateTipsOrderParamsUseCase;
    }

    public static final /* synthetic */ State metgxyhuhe(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uwvvkdfqfp(Throwable th2) {
        if (!(th2 instanceof DomainException)) {
            crxdokpmqz(new eablkybsjg.iobyxmoadg(th2));
            return;
        }
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(new TipsOrderStore$TipsMessage.Error(message)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yfnezrywwk(s92.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar instanceof s92.zoijcleaow.iobyxmoadg) {
            crxdokpmqz(new eablkybsjg.wkgbmnqykc(((s92.zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg()));
        } else {
            if (!(zoijcleaowVar instanceof s92.zoijcleaow.C2589zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new eablkybsjg.gxszxtbevo(((s92.zoijcleaow.C2589zoijcleaow) zoijcleaowVar).iobyxmoadg()));
        }
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2532iobyxmoadg(action, this, null), 3, null);
    }
}
