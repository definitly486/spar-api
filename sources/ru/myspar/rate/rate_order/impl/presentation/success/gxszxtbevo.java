package ru.myspar.rate.rate_order.impl.presentation.success;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.orders.api.model.OrdersArgs;
import ru.myspar.rate.rate_order.api.models.RateOrderPayload;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends vx.eablkybsjg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final RateOrderPayload f102924dxjokdxxww;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final u10.wkgbmnqykc f102925lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final wi0.iobyxmoadg f102926nufgyqmvbu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f102927iobyxmoadg;

        static {
            int[] iArr = new int[RateOrderPayload.zoijcleaow.values().length];
            try {
                iArr[RateOrderPayload.zoijcleaow.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RateOrderPayload.zoijcleaow.SCAN_GO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102927iobyxmoadg = iArr;
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f102929zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return gxszxtbevo.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f102929zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                u10.wkgbmnqykc wkgbmnqykcVar = gxszxtbevo.this.f102925lqeggnwhkg;
                this.f102929zdlpuopuiu = 1;
                if (wkgbmnqykcVar.gtknphoqwx(this) == objGxszxtbevo) {
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
    public gxszxtbevo(u10.wkgbmnqykc changeOrdersObserver, i02.wkgbmnqykc rateOrderTypeToSuccessMapper, wi0.iobyxmoadg ordersFeatureApi, RateOrderPayload payload) {
        super(rateOrderTypeToSuccessMapper.invoke(payload.getRateType()));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeOrdersObserver, "changeOrdersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rateOrderTypeToSuccessMapper, "rateOrderTypeToSuccessMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ordersFeatureApi, "ordersFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        this.f102925lqeggnwhkg = changeOrdersObserver;
        this.f102926nufgyqmvbu = ordersFeatureApi;
        this.f102924dxjokdxxww = payload;
    }

    private final void esjtqupxsv() {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new zoijcleaow(null), 3, null);
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().eablkybsjg(this.f102924dxjokdxxww.getRateType() == RateOrderPayload.ppxfxbqfkf.CANCEL ? this.f102926nufgyqmvbu.iobyxmoadg(new OrdersArgs(c10.gxszxtbevo.CURRENT)) : this.f102926nufgyqmvbu.iobyxmoadg(new OrdersArgs(c10.gxszxtbevo.COMPLETED)));
    }

    private final void lereixgezr() {
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
    }

    public final void cqumvgiudr() {
        int i13 = iobyxmoadg.f102927iobyxmoadg[this.f102924dxjokdxxww.getFlow().ordinal()];
        if (i13 == 1) {
            esjtqupxsv();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lereixgezr();
        }
    }
}
