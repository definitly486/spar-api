package kk;

import spay.sdk.R;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ve0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ za f59001yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f59002zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve0(za zaVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f59001yggfygwlhe = zaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        ve0 ve0Var = new ve0(this.f59001yggfygwlhe, gxszxtbevoVar);
        ve0Var.f59002zdlpuopuiu = obj;
        return ve0Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        ve0 ve0Var = new ve0(this.f59001yggfygwlhe, (lg.gxszxtbevo) obj2);
        ve0Var.f59002zdlpuopuiu = (ListOfCardsResponseBody) obj;
        return ve0Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) this.f59002zdlpuopuiu;
        if (this.f59001yggfygwlhe.gxszxtbevo()) {
            return zv.zoijcleaow(R.string.spay_empty_string);
        }
        ListOfCardsResponseBody.MerchantInfo merchantInfo = listOfCardsResponseBody.getMerchantInfo();
        String merchantName = merchantInfo != null ? merchantInfo.getMerchantName() : null;
        if (merchantName == null) {
            merchantName = "";
        }
        return me.iobyxmoadg(merchantName, "text", merchantName);
    }
}
