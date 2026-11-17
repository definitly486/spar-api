package u60;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.core.models.Warning;
import ru.myspar.delivery.api.model.DeliveryIntervalPayload;
import ru.myspar.delivery.api.model.OrderFlowType;
import ru.myspar.delivery.impl.interval.domain.models.IntervalDay;
import ru.myspar.delivery.impl.interval.domain.models.IntervalInfo;
import ru.myspar.delivery.impl.interval.domain.models.SelectedInterval;
import ru.myspar.delivery.impl.interval.domain.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final v60.iobyxmoadg f112759ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final v60.zoijcleaow f112760wkgbmnqykc;

    /* JADX INFO: renamed from: u60.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2788iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f112761cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f112763jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f112764yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112765zdlpuopuiu;

        C2788iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112763jyumaefscl = obj;
            this.f112761cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.jztzpxfvev(this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f112766jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ u60.wkgbmnqykc f112767yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f112768zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(u60.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f112767yggfygwlhe = wkgbmnqykcVar;
            this.f112766jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f112767yggfygwlhe, this.f112766jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f112768zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                u60.wkgbmnqykc wkgbmnqykcVar = this.f112767yggfygwlhe;
                if (wkgbmnqykcVar instanceof u60.wkgbmnqykc.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = this.f112766jyumaefscl;
                    this.f112768zdlpuopuiu = 1;
                    if (iobyxmoadgVar.jztzpxfvev(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof u60.wkgbmnqykc.ppxfxbqfkf) {
                    this.f112766jyumaefscl.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(((u60.wkgbmnqykc.ppxfxbqfkf) this.f112767yggfygwlhe).iobyxmoadg(), ((u60.wkgbmnqykc.ppxfxbqfkf) this.f112767yggfygwlhe).zoijcleaow()));
                } else {
                    if (!(wkgbmnqykcVar instanceof u60.wkgbmnqykc.iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f112766jyumaefscl.crxdokpmqz(eablkybsjg.zoijcleaow.f112753iobyxmoadg);
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
        int f112769iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112771yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112772zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112771yggfygwlhe = obj;
            this.f112769iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(null, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f112773jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ u60.ppxfxbqfkf f112774yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f112775zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(u60.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f112774yggfygwlhe = ppxfxbqfkfVar;
            this.f112773jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f112774yggfygwlhe, this.f112773jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f112775zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!(this.f112774yggfygwlhe instanceof u60.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f112773jyumaefscl;
                DeliveryIntervalPayload payload = iobyxmoadg.okpsazkaxt(iobyxmoadgVar).getPayload();
                this.f112775zdlpuopuiu = 1;
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
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, v60.iobyxmoadg confirmIntervalUseCase, v60.zoijcleaow getIntervalsUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(confirmIntervalUseCase, "confirmIntervalUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getIntervalsUseCase, "getIntervalsUseCase");
        this.f112759ppxfxbqfkf = confirmIntervalUseCase;
        this.f112760wkgbmnqykc = getIntervalsUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jztzpxfvev(lg.gxszxtbevo gxszxtbevoVar) {
        C2788iobyxmoadg c2788iobyxmoadg;
        List intervals;
        Object next;
        Object zoijcleaowVar;
        OrderFlowType orderFlowType;
        Throwable th2;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof C2788iobyxmoadg) {
            c2788iobyxmoadg = (C2788iobyxmoadg) gxszxtbevoVar;
            int i13 = c2788iobyxmoadg.f112761cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2788iobyxmoadg.f112761cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c2788iobyxmoadg = new C2788iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2788iobyxmoadg = new C2788iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2788iobyxmoadg.f112763jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2788iobyxmoadg.f112761cqumvgiudr;
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
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFlow, OrderFlowType.Cart.f87622zdlpuopuiu)) {
                        zoijcleaowVar = new v60.iobyxmoadg.InterfaceC2886iobyxmoadg.C2887iobyxmoadg(selectedInterval.getDate(), intervalInfo);
                    } else {
                        if (!(orderFlow instanceof OrderFlowType.EditOrder)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zoijcleaowVar = new v60.iobyxmoadg.InterfaceC2886iobyxmoadg.zoijcleaow(((OrderFlowType.EditOrder) orderFlow).getOrderId(), selectedInterval.getDate(), intervalInfo);
                    }
                    try {
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                        v60.iobyxmoadg iobyxmoadgVar3 = this.f112759ppxfxbqfkf;
                        c2788iobyxmoadg.f112765zdlpuopuiu = this;
                        c2788iobyxmoadg.f112764yggfygwlhe = orderFlow;
                        c2788iobyxmoadg.f112761cqumvgiudr = 1;
                        Object objZoijcleaow = iobyxmoadgVar3.zoijcleaow(zoijcleaowVar, c2788iobyxmoadg);
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
        orderFlowType = (OrderFlowType) c2788iobyxmoadg.f112764yggfygwlhe;
        iobyxmoadgVar = (iobyxmoadg) c2788iobyxmoadg.f112765zdlpuopuiu;
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
            if (!(orderFlowType instanceof OrderFlowType.EditOrder) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFlowType, OrderFlowType.Cart.f87622zdlpuopuiu)) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadgVar.crxdokpmqz(eablkybsjg.iobyxmoadg.f112750iobyxmoadg);
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
        Object c2889zoijcleaow;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f112769iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f112769iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f112771yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f112769iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(true));
            OrderFlowType orderFlow = deliveryIntervalPayload.getOrderFlow();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(orderFlow, OrderFlowType.Cart.f87622zdlpuopuiu)) {
                c2889zoijcleaow = v60.zoijcleaow.iobyxmoadg.C2888iobyxmoadg.f116194iobyxmoadg;
            } else {
                if (!(orderFlow instanceof OrderFlowType.EditOrder)) {
                    throw new NoWhenBranchMatchedException();
                }
                c2889zoijcleaow = new v60.zoijcleaow.iobyxmoadg.C2889zoijcleaow(((OrderFlowType.EditOrder) orderFlow).getOrderId());
            }
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                v60.zoijcleaow zoijcleaowVar = this.f112760wkgbmnqykc;
                wkgbmnqykcVar.f112772zdlpuopuiu = this;
                wkgbmnqykcVar.f112769iwizpuwonk = 1;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(c2889zoijcleaow, wkgbmnqykcVar);
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
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f112772zdlpuopuiu;
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
            new eablkybsjg.C2787eablkybsjg(warning.getMessage());
        }
    }

    public final void czzsidtyhn(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(false));
        crxdokpmqz(error instanceof ProductDailyLimitException ? new eablkybsjg.wkgbmnqykc(((ProductDailyLimitException) error).getMessage()) : new eablkybsjg.ppxfxbqfkf(error));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(u60.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(u60.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }
}
