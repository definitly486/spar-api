package kk;

import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class gg0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f56702zdlpuopuiu;

    public gg0(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        gg0 gg0Var = new gg0(gxszxtbevoVar);
        gg0Var.f56702zdlpuopuiu = obj;
        return gg0Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        gg0 gg0Var = new gg0((lg.gxszxtbevo) obj2);
        gg0Var.f56702zdlpuopuiu = (ListOfCardsResponseBody) obj;
        return gg0Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) this.f56702zdlpuopuiu;
        if (listOfCardsResponseBody == null || (paymentToolInfo = listOfCardsResponseBody.getPaymentToolInfo()) == null) {
            return null;
        }
        return paymentToolInfo.getToolList();
    }
}
