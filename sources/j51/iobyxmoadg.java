package j51;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.delivery.api.model.DeliveryIntervalPayload;
import ru.myspar.proloyalty.delivery.api.model.OrderFlowType;
import ru.myspar.proloyalty.delivery.impl.interval.domain.models.IntervalDay;
import ru.myspar.proloyalty.delivery.impl.interval.domain.models.IntervalInfo;
import ru.myspar.proloyalty.delivery.impl.interval.domain.models.SelectedInterval;
import ru.myspar.proloyalty.delivery.impl.interval.domain.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k51.iobyxmoadg f50764ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final k51.zoijcleaow f50765wkgbmnqykc;

    /* JADX INFO: renamed from: j51.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1092iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f50766cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f50768jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f50769yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f50770zdlpuopuiu;

        C1092iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50768jyumaefscl = obj;
            this.f50766cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.jztzpxfvev(this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f50771jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ j51.wkgbmnqykc f50772yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f50773zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(j51.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f50772yggfygwlhe = wkgbmnqykcVar;
            this.f50771jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f50772yggfygwlhe, this.f50771jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f50773zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                j51.wkgbmnqykc wkgbmnqykcVar = this.f50772yggfygwlhe;
                if (wkgbmnqykcVar instanceof j51.wkgbmnqykc.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = this.f50771jyumaefscl;
                    this.f50773zdlpuopuiu = 1;
                    if (iobyxmoadgVar.jztzpxfvev(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof j51.wkgbmnqykc.ppxfxbqfkf) {
                    this.f50771jyumaefscl.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(((j51.wkgbmnqykc.ppxfxbqfkf) this.f50772yggfygwlhe).iobyxmoadg(), ((j51.wkgbmnqykc.ppxfxbqfkf) this.f50772yggfygwlhe).zoijcleaow()));
                } else {
                    if (!(wkgbmnqykcVar instanceof j51.wkgbmnqykc.iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f50771jyumaefscl.crxdokpmqz(eablkybsjg.zoijcleaow.f50758iobyxmoadg);
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

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f50774iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f50776yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f50777zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50776yggfygwlhe = obj;
            this.f50774iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(null, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f50778jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ j51.ppxfxbqfkf f50779yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f50780zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(j51.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f50779yggfygwlhe = ppxfxbqfkfVar;
            this.f50778jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f50779yggfygwlhe, this.f50778jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f50780zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!(this.f50779yggfygwlhe instanceof j51.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f50778jyumaefscl;
                DeliveryIntervalPayload payload = iobyxmoadg.okpsazkaxt(iobyxmoadgVar).getPayload();
                this.f50780zdlpuopuiu = 1;
                if (iobyxmoadgVar.rlfsiqarku(payload, this) == objGxszxtbevo) {
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
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, k51.iobyxmoadg confirmIntervalUseCase, k51.zoijcleaow getIntervalsUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(confirmIntervalUseCase, "confirmIntervalUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getIntervalsUseCase, "getIntervalsUseCase");
        this.f50764ppxfxbqfkf = confirmIntervalUseCase;
        this.f50765wkgbmnqykc = getIntervalsUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jztzpxfvev(lg.gxszxtbevo gxszxtbevoVar) {
        C1092iobyxmoadg c1092iobyxmoadg;
        List intervals;
        Object next;
        Object zoijcleaowVar;
        OrderFlowType orderFlowType;
        Throwable th2;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof C1092iobyxmoadg) {
            c1092iobyxmoadg = (C1092iobyxmoadg) gxszxtbevoVar;
            int i13 = c1092iobyxmoadg.f50766cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1092iobyxmoadg.f50766cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c1092iobyxmoadg = new C1092iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1092iobyxmoadg = new C1092iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c1092iobyxmoadg.f50768jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1092iobyxmoadg.f50766cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            State state = (State) jlmebxxoox();
            SelectedInterval selectedInterval = state.getSelectedInterval();
            if (selectedInterval == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            IntervalDay intervalDay = (IntervalDay) state.getIntervals().get(selectedInterval.getDate());
            if (intervalDay != null && (intervals = intervalDay.getIntervals()) != null) {
                Iterator it = intervals.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((IntervalInfo) next).getValue(), selectedInterval.getIntervalValue()));
                IntervalInfo intervalInfo = (IntervalInfo) next;
                if (intervalInfo != null) {
                    ulzqkzuiru(new gxszxtbevo.zoijcleaow(true));
                    OrderFlowType orderFlow = state.getPayload().getOrderFlow();
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFlow, OrderFlowType.Cart.f95404zdlpuopuiu)) {
                        zoijcleaowVar = new k51.iobyxmoadg.InterfaceC1153iobyxmoadg.C1154iobyxmoadg(selectedInterval.getDate(), intervalInfo);
                    } else {
                        if (!(orderFlow instanceof OrderFlowType.EditOrder)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zoijcleaowVar = new k51.iobyxmoadg.InterfaceC1153iobyxmoadg.zoijcleaow(((OrderFlowType.EditOrder) orderFlow).getOrderId(), selectedInterval.getDate(), intervalInfo);
                    }
                    try {
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                        k51.iobyxmoadg iobyxmoadgVar3 = this.f50764ppxfxbqfkf;
                        c1092iobyxmoadg.f50770zdlpuopuiu = this;
                        c1092iobyxmoadg.f50769yggfygwlhe = orderFlow;
                        c1092iobyxmoadg.f50766cqumvgiudr = 1;
                        Object objZoijcleaow = iobyxmoadgVar3.zoijcleaow(zoijcleaowVar, c1092iobyxmoadg);
                        if (objZoijcleaow == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        orderFlowType = orderFlow;
                        obj = objZoijcleaow;
                        iobyxmoadgVar = this;
                    } catch (Throwable th3) {
                        orderFlowType = orderFlow;
                        th2 = th3;
                        iobyxmoadgVar = this;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                    }
                }
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        orderFlowType = (OrderFlowType) c1092iobyxmoadg.f50769yggfygwlhe;
        iobyxmoadgVar = (iobyxmoadg) c1092iobyxmoadg.f50770zdlpuopuiu;
        try {
            zdlpuopuiu.zoijcleaow(obj);
        } catch (Throwable th4) {
            th2 = th4;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Warning) obj);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.uwvvkdfqfp((Warning) objWkgbmnqykc);
            if (!(orderFlowType instanceof OrderFlowType.EditOrder) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFlowType, OrderFlowType.Cart.f95404zdlpuopuiu)) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadgVar.crxdokpmqz(eablkybsjg.iobyxmoadg.f50755iobyxmoadg);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.czzsidtyhn(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.zoijcleaow(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final /* synthetic */ State okpsazkaxt(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object rlfsiqarku(DeliveryIntervalPayload deliveryIntervalPayload, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        Object c1156zoijcleaow;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f50774iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f50774iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f50776yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f50774iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(true));
            OrderFlowType orderFlow = deliveryIntervalPayload.getOrderFlow();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFlow, OrderFlowType.Cart.f95404zdlpuopuiu)) {
                c1156zoijcleaow = k51.zoijcleaow.iobyxmoadg.C1155iobyxmoadg.f53877iobyxmoadg;
            } else {
                if (!(orderFlow instanceof OrderFlowType.EditOrder)) {
                    throw new NoWhenBranchMatchedException();
                }
                c1156zoijcleaow = new k51.zoijcleaow.iobyxmoadg.C1156zoijcleaow(((OrderFlowType.EditOrder) orderFlow).getOrderId());
            }
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                k51.zoijcleaow zoijcleaowVar = this.f50765wkgbmnqykc;
                wkgbmnqykcVar.f50777zdlpuopuiu = this;
                wkgbmnqykcVar.f50774iwizpuwonk = 1;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(c1156zoijcleaow, wkgbmnqykcVar);
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
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f50777zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf((List) objWkgbmnqykc));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.czzsidtyhn(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void uwvvkdfqfp(Warning warning) {
        if (new ah.wkgbmnqykc[]{kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class)}[0].zdlpuopuiu(warning)) {
            return;
        }
        if (warning instanceof Warning.DailyLimit) {
            new eablkybsjg.wkgbmnqykc(((Warning.DailyLimit) warning).getMessage());
        } else {
            new eablkybsjg.C1091eablkybsjg(warning.getMessage());
        }
    }

    public final void czzsidtyhn(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(false));
        crxdokpmqz(error instanceof ProductDailyLimitException ? new eablkybsjg.wkgbmnqykc(((ProductDailyLimitException) error).getMessage()) : new eablkybsjg.ppxfxbqfkf(error));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(j51.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(j51.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }
}
