package kk;

import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class v20 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.oxmwwwfdhm {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ lrnfpwlwnk f58937iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f58938jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ boolean f58939yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ SpasiboBonusesResponseBody f58940zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(lrnfpwlwnk lrnfpwlwnkVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(4, gxszxtbevoVar);
        this.f58937iwizpuwonk = lrnfpwlwnkVar;
    }

    @Override // tg.oxmwwwfdhm
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        v20 v20Var = new v20(this.f58937iwizpuwonk, (lg.gxszxtbevo) obj4);
        v20Var.f58940zdlpuopuiu = (SpasiboBonusesResponseBody) obj;
        v20Var.f58939yggfygwlhe = zBooleanValue;
        v20Var.f58938jyumaefscl = (ListOfCardsResponseBody) obj3;
        return v20Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        SpasiboBonusesResponseBody spasiboBonusesResponseBody = this.f58940zdlpuopuiu;
        boolean z13 = this.f58939yggfygwlhe;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount = this.f58938jyumaefscl.getOrderInfo().getOrderAmount();
        Long lEablkybsjg = orderAmount != null ? kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(orderAmount.getAmount()) : null;
        boolean z14 = (lEablkybsjg != null ? lEablkybsjg.longValue() : 0L) == 0;
        xq xqVar = new xq(z14 ? spasiboBonusesResponseBody.getLoyaltyAppInfo().getPointsPaymentAmount() : spasiboBonusesResponseBody.getLoyaltyAppInfo().getMaxPointsAmount(), z13, z14);
        lrnfpwlwnk lrnfpwlwnkVar = this.f58937iwizpuwonk;
        ah.gtknphoqwx[] gtknphoqwxVarArr = lrnfpwlwnk.f57499yadqdtsiqt;
        if (lrnfpwlwnkVar.vdvldrhtss()) {
            return xqVar;
        }
        return null;
    }
}
