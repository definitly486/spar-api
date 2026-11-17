package kk;

import java.util.ArrayList;
import java.util.List;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class bs extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.oxmwwwfdhm {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f56043jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ xq f56044yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ List f56045zdlpuopuiu;

    public bs(lg.gxszxtbevo gxszxtbevoVar) {
        super(4, gxszxtbevoVar);
    }

    @Override // tg.oxmwwwfdhm
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        bs bsVar = new bs((lg.gxszxtbevo) obj4);
        bsVar.f56045zdlpuopuiu = (List) obj;
        bsVar.f56044yggfygwlhe = (xq) obj2;
        bsVar.f56043jyumaefscl = (ListOfCardsResponseBody) obj3;
        return bsVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        ListOfCardsResponseBody.OrderInfo orderInfo2;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount2;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        List list = this.f56045zdlpuopuiu;
        xq xqVar = this.f56044yggfygwlhe;
        ListOfCardsResponseBody listOfCardsResponseBody = this.f56043jyumaefscl;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof qe) {
                arrayList.add(obj2);
            }
        }
        qe qeVar = (qe) hg.jyumaefscl.weqkydbzbr(arrayList);
        String currency = null;
        Long lEablkybsjg = (listOfCardsResponseBody == null || (orderInfo2 = listOfCardsResponseBody.getOrderInfo()) == null || (orderAmount2 = orderInfo2.getOrderAmount()) == null) ? null : kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(orderAmount2.getAmount());
        boolean z13 = (lEablkybsjg != null ? lEablkybsjg.longValue() : 0L) == 0;
        if (xqVar == null || !xqVar.f59323zoijcleaow || qeVar == null || z13) {
            return list;
        }
        long jLqeggnwhkg = zg.gtknphoqwx.lqeggnwhkg(qeVar.f58183zoijcleaow - (((long) xqVar.f59321iobyxmoadg) * 100), 0L);
        vu vuVar = qeVar.f58180iobyxmoadg;
        if (listOfCardsResponseBody != null && (orderInfo = listOfCardsResponseBody.getOrderInfo()) != null && (orderAmount = orderInfo.getOrderAmount()) != null) {
            currency = orderAmount.getCurrency();
        }
        if (currency == null) {
            currency = "";
        }
        ms amount = qa0.ppxfxbqfkf(jLqeggnwhkg, currency);
        long j13 = qeVar.f58183zoijcleaow;
        vu vuVar2 = qeVar.f58182wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(amount, "amount");
        return hg.jyumaefscl.eablkybsjg(new qe(amount, j13, vuVar, vuVar2));
    }
}
