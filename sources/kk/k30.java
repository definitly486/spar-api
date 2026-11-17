package kk;

import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class k30 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f57257zdlpuopuiu;

    public k30(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        k30 k30Var = new k30(gxszxtbevoVar);
        k30Var.f57257zdlpuopuiu = obj;
        return k30Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        k30 k30Var = new k30((lg.gxszxtbevo) obj2);
        k30Var.f57257zdlpuopuiu = (OrderScreenDataResponse) obj;
        return k30Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f57257zdlpuopuiu;
        if (orderScreenDataResponse == null || (listOfCardsResponseBody = orderScreenDataResponse.getListOfCardsResponseBody()) == null || (orderInfo = listOfCardsResponseBody.getOrderInfo()) == null || (orderAmount = orderInfo.getOrderAmount()) == null) {
            return null;
        }
        return orderAmount.getCurrency();
    }
}
