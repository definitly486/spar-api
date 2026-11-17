package ru.myspar.proloyalty.tipsorder.impl.domain.store;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.TipsOrderParams;
import ru.myspar.proloyalty.tipsorder.impl.domain.model.TipsParamsState;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ov1.ppxfxbqfkf f101920eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ov1.iobyxmoadg f101921ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ov1.zoijcleaow f101922wkgbmnqykc;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.tipsorder.impl.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2454iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f101923jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f101924yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101925zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2454iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101924yggfygwlhe = ppxfxbqfkfVar;
            this.f101923jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2454iobyxmoadg(this.f101924yggfygwlhe, this.f101923jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101925zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101924yggfygwlhe, ppxfxbqfkf.iobyxmoadg.f101932iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar = this.f101923jyumaefscl;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    ov1.iobyxmoadg.C1628iobyxmoadg c1628iobyxmoadg = new ov1.iobyxmoadg.C1628iobyxmoadg(iobyxmoadg.metgxyhuhe(iobyxmoadgVar).getOrderId());
                    ov1.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f101921ppxfxbqfkf;
                    this.f101925zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(c1628iobyxmoadg, this);
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
            iobyxmoadg iobyxmoadgVar5 = this.f101923jyumaefscl;
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
            return ((C2454iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f101926iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f101927jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f101928yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f101929zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f101927jyumaefscl = wkgbmnqykcVar;
            this.f101926iwizpuwonk = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f101927jyumaefscl, this.f101926iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            iobyxmoadg iobyxmoadgVar;
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101928yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = this.f101927jyumaefscl;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.eablkybsjg.f101933iobyxmoadg)) {
                    this.f101926iwizpuwonk.crxdokpmqz(eablkybsjg.zoijcleaow.f101911iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.ppxfxbqfkf) {
                    this.f101926iwizpuwonk.ulzqkzuiru(new gxszxtbevo.lqeggnwhkg(true));
                    this.f101926iwizpuwonk.crxdokpmqz(new eablkybsjg.C2452eablkybsjg(((wkgbmnqykc.ppxfxbqfkf) this.f101927jyumaefscl).iobyxmoadg()));
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.iobyxmoadg) {
                    State stateMetgxyhuhe = iobyxmoadg.metgxyhuhe(this.f101926iwizpuwonk);
                    if (stateMetgxyhuhe.getTipsIsSending() || stateMetgxyhuhe.getMessage() != null || stateMetgxyhuhe.getVerifyFlag()) {
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = (wkgbmnqykc.iobyxmoadg) this.f101927jyumaefscl;
                    if (iobyxmoadgVar2 instanceof wkgbmnqykc.iobyxmoadg.C2455iobyxmoadg) {
                        this.f101926iwizpuwonk.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(((wkgbmnqykc.iobyxmoadg.C2455iobyxmoadg) this.f101927jyumaefscl).iobyxmoadg()));
                    } else {
                        if (!(iobyxmoadgVar2 instanceof wkgbmnqykc.iobyxmoadg.zoijcleaow)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f101926iwizpuwonk.ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(((wkgbmnqykc.iobyxmoadg.zoijcleaow) this.f101927jyumaefscl).iobyxmoadg(), ((wkgbmnqykc.iobyxmoadg.zoijcleaow) this.f101927jyumaefscl).zoijcleaow()));
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.gxszxtbevo.f101934iobyxmoadg)) {
                    State stateMetgxyhuhe2 = iobyxmoadg.metgxyhuhe(this.f101926iwizpuwonk);
                    iobyxmoadg iobyxmoadgVar3 = this.f101926iwizpuwonk;
                    if (stateMetgxyhuhe2.getTipsIsSending() || stateMetgxyhuhe2.getTipsOrderParams() == null) {
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    TipsParamsState tipsParamsState = (TipsParamsState) iobyxmoadgVar3.f101920eablkybsjg.zoijcleaow(new ov1.ppxfxbqfkf.iobyxmoadg(stateMetgxyhuhe2.getTipsOrderParams()));
                    if (tipsParamsState instanceof TipsParamsState.ReadySend) {
                        iobyxmoadgVar3.ulzqkzuiru(new gxszxtbevo.C2453gxszxtbevo(true));
                        try {
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                            ov1.zoijcleaow.iobyxmoadg iobyxmoadgVar5 = new ov1.zoijcleaow.iobyxmoadg(stateMetgxyhuhe2.getOrderId(), ((TipsParamsState.ReadySend) tipsParamsState).getParams());
                            ov1.zoijcleaow zoijcleaowVar = iobyxmoadgVar3.f101922wkgbmnqykc;
                            this.f101929zdlpuopuiu = iobyxmoadgVar3;
                            this.f101928yggfygwlhe = 1;
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
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.C2456wkgbmnqykc.f101940iobyxmoadg)) {
                    TipsOrderStore$TipsMessage message = iobyxmoadg.metgxyhuhe(this.f101926iwizpuwonk).getMessage();
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(message, TipsOrderStore$TipsMessage.Success.f101904zdlpuopuiu) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(message, TipsOrderStore$TipsMessage.Verify.f101905zdlpuopuiu)) {
                        this.f101926iwizpuwonk.crxdokpmqz(eablkybsjg.ppxfxbqfkf.f101909iobyxmoadg);
                        this.f101926iwizpuwonk.ulzqkzuiru(gxszxtbevo.iobyxmoadg.f101914iobyxmoadg);
                    } else if (message instanceof TipsOrderStore$TipsMessage.Error) {
                        if (iobyxmoadg.metgxyhuhe(this.f101926iwizpuwonk).getTipsOrderParams() == null) {
                            this.f101926iwizpuwonk.crxdokpmqz(eablkybsjg.zoijcleaow.f101911iobyxmoadg);
                        }
                        this.f101926iwizpuwonk.ulzqkzuiru(new gxszxtbevo.zoijcleaow(null));
                    } else if (message != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.lqeggnwhkg.f101938iobyxmoadg)) {
                    this.f101926iwizpuwonk.ulzqkzuiru(new gxszxtbevo.zoijcleaow(TipsOrderStore$TipsMessage.Success.f101904zdlpuopuiu));
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.zoijcleaow.f101941iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (iobyxmoadg.metgxyhuhe(this.f101926iwizpuwonk).getVerifyFlag()) {
                        this.f101926iwizpuwonk.ulzqkzuiru(new gxszxtbevo.zoijcleaow(TipsOrderStore$TipsMessage.Verify.f101905zdlpuopuiu));
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) this.f101929zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((mv1.zoijcleaow) obj);
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar.yfnezrywwk((mv1.zoijcleaow) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.uwvvkdfqfp(thDxjokdxxww);
            }
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.C2453gxszxtbevo(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, ov1.iobyxmoadg getTipsOrderInfoUseCase, ov1.zoijcleaow sendTipsOrderUseCase, ov1.ppxfxbqfkf validateTipsOrderParamsUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getTipsOrderInfoUseCase, "getTipsOrderInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sendTipsOrderUseCase, "sendTipsOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(validateTipsOrderParamsUseCase, "validateTipsOrderParamsUseCase");
        this.f101921ppxfxbqfkf = getTipsOrderInfoUseCase;
        this.f101922wkgbmnqykc = sendTipsOrderUseCase;
        this.f101920eablkybsjg = validateTipsOrderParamsUseCase;
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
    public final void yfnezrywwk(mv1.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar instanceof mv1.zoijcleaow.iobyxmoadg) {
            crxdokpmqz(new eablkybsjg.wkgbmnqykc(((mv1.zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg()));
        } else {
            if (!(zoijcleaowVar instanceof mv1.zoijcleaow.C1455zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new eablkybsjg.gxszxtbevo(((mv1.zoijcleaow.C1455zoijcleaow) zoijcleaowVar).iobyxmoadg()));
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
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2454iobyxmoadg(action, this, null), 3, null);
    }
}
