package kk;

import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class lh0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.oxmwwwfdhm {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public /* synthetic */ hh0 f57475jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f57476yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ long f57477zdlpuopuiu;

    public lh0(lg.gxszxtbevo gxszxtbevoVar) {
        super(4, gxszxtbevoVar);
    }

    @Override // tg.oxmwwwfdhm
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj).longValue();
        lh0 lh0Var = new lh0((lg.gxszxtbevo) obj4);
        lh0Var.f57477zdlpuopuiu = jLongValue;
        lh0Var.f57476yggfygwlhe = (ListOfCardsResponseBody) obj2;
        lh0Var.f57475jyumaefscl = (hh0) obj3;
        return lh0Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        long j13 = this.f57477zdlpuopuiu;
        ListOfCardsResponseBody listOfCardsResponseBody = this.f57476yggfygwlhe;
        hh0 hh0Var = this.f57475jyumaefscl;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount = listOfCardsResponseBody.getOrderInfo().getOrderAmount();
        Long lEablkybsjg = orderAmount != null ? kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(orderAmount.getAmount()) : null;
        boolean z13 = (lEablkybsjg != null ? lEablkybsjg.longValue() : 0L) == 0;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount2 = listOfCardsResponseBody.getOrderInfo().getOrderAmount();
        String currency = orderAmount2 != null ? orderAmount2.getCurrency() : null;
        if (currency == null) {
            currency = "";
        }
        Integer num = hh0Var.f56920zoijcleaow;
        return (num == null || z13) ? new vh(qa0.ppxfxbqfkf(j13, currency), null) : new vh(qa0.ppxfxbqfkf(zg.gtknphoqwx.lqeggnwhkg(j13 - (((long) num.intValue()) * 100), 0L), currency), qa0.ppxfxbqfkf(j13, currency));
    }
}
