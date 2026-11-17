package ru.myspar.proloyalty.rate.rate_order.impl.presentation.success;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.orders.api.model.OrdersArgs;
import ru.myspar.proloyalty.rate.rate_order.api.models.RateOrderPayload;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends sw0.eablkybsjg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final RateOrderPayload f100212dxjokdxxww;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final i01.wkgbmnqykc f100213lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final wf1.iobyxmoadg f100214nufgyqmvbu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f100215iobyxmoadg;

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
            f100215iobyxmoadg = iArr;
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100217zdlpuopuiu;

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
            int i13 = this.f100217zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                i01.wkgbmnqykc wkgbmnqykcVar = gxszxtbevo.this.f100213lqeggnwhkg;
                this.f100217zdlpuopuiu = 1;
                if (wkgbmnqykcVar.btonecajqb(this) == objGxszxtbevo) {
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
    public gxszxtbevo(i01.wkgbmnqykc changeOrdersObserver, zl1.wkgbmnqykc rateOrderTypeToSuccessMapper, wf1.iobyxmoadg ordersFeatureApi, RateOrderPayload payload) {
        super(rateOrderTypeToSuccessMapper.invoke(payload.getRateType()));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeOrdersObserver, "changeOrdersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rateOrderTypeToSuccessMapper, "rateOrderTypeToSuccessMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ordersFeatureApi, "ordersFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        this.f100213lqeggnwhkg = changeOrdersObserver;
        this.f100214nufgyqmvbu = ordersFeatureApi;
        this.f100212dxjokdxxww = payload;
    }

    private final void esjtqupxsv() {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new zoijcleaow(null), 3, null);
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().eablkybsjg(this.f100212dxjokdxxww.getRateType() == RateOrderPayload.ppxfxbqfkf.CANCEL ? this.f100214nufgyqmvbu.zoijcleaow(new OrdersArgs(sz0.eablkybsjg.CURRENT)) : this.f100214nufgyqmvbu.zoijcleaow(new OrdersArgs(sz0.eablkybsjg.COMPLETED)));
    }

    private final void lereixgezr() {
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
    }

    public final void cqumvgiudr() {
        int i13 = iobyxmoadg.f100215iobyxmoadg[this.f100212dxjokdxxww.getFlow().ordinal()];
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
