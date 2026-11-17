package kk;

import spay.sdk.R;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class sh implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ zj f58556yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f58557zdlpuopuiu;

    public sh(sj.nufgyqmvbu nufgyqmvbuVar, zj zjVar) {
        this.f58557zdlpuopuiu = nufgyqmvbuVar;
        this.f58556yggfygwlhe = zjVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        qg qgVar;
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        if (gxszxtbevoVar instanceof qg) {
            qgVar = (qg) gxszxtbevoVar;
            int i13 = qgVar.f58191yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                qgVar.f58191yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                qgVar = new qg(this, gxszxtbevoVar);
            }
        } else {
            qgVar = new qg(this, gxszxtbevoVar);
        }
        Object obj2 = qgVar.f58192zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = qgVar.f58191yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f58557zdlpuopuiu;
            ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) obj;
            int i15 = R.string.spay_currency_pattern;
            ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount2 = listOfCardsResponseBody.getOrderInfo().getOrderAmount();
            String strZoijcleaow = orderAmount2 != null ? qa0.zoijcleaow(orderAmount2.getAmount()) : null;
            if (strZoijcleaow == null) {
                strZoijcleaow = "";
            }
            ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) this.f58556yggfygwlhe.f59597nufgyqmvbu.getValue();
            String currency = (listOfCardsResponseBody2 == null || (orderInfo = listOfCardsResponseBody2.getOrderInfo()) == null || (orderAmount = orderInfo.getOrderAmount()) == null) ? null : orderAmount.getCurrency();
            if (currency == null) {
                currency = "";
            }
            Object[] args = {strZoijcleaow, currency};
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            ms msVar = new ms(i15, hg.agtfadlqog.i(args));
            ListOfCardsResponseBody.MerchantInfo merchantInfo = listOfCardsResponseBody.getMerchantInfo();
            String merchantName = merchantInfo != null ? merchantInfo.getMerchantName() : null;
            String str = merchantName != null ? merchantName : "";
            el elVar = new el(msVar, me.iobyxmoadg(str, "text", str));
            qgVar.f58191yggfygwlhe = 1;
            if (nufgyqmvbuVar.emit(elVar, qgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj2);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
