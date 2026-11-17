package kk;

import npi.spay.Bn;
import spay.sdk.R;
import spay.sdk.domain.model.response.SPaySdkConfig;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class bg0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.oxmwwwfdhm {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ m60 f56003cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final /* synthetic */ xf f56004esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ za f56005iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public /* synthetic */ hh0 f56006jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f56007yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Long f56008zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(za zaVar, m60 m60Var, xf xfVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(4, gxszxtbevoVar);
        this.f56005iwizpuwonk = zaVar;
        this.f56003cqumvgiudr = m60Var;
        this.f56004esjtqupxsv = xfVar;
    }

    @Override // tg.oxmwwwfdhm
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        bg0 bg0Var = new bg0(this.f56005iwizpuwonk, this.f56003cqumvgiudr, this.f56004esjtqupxsv, (lg.gxszxtbevo) obj4);
        bg0Var.f56008zdlpuopuiu = (Long) obj;
        bg0Var.f56007yggfygwlhe = (ListOfCardsResponseBody) obj2;
        bg0Var.f56006jyumaefscl = (hh0) obj3;
        return bg0Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        Long l13 = this.f56008zdlpuopuiu;
        ListOfCardsResponseBody listOfCardsResponseBody = this.f56007yggfygwlhe;
        hh0 hh0Var = this.f56006jyumaefscl;
        String currency = null;
        if (l13 == null) {
            return null;
        }
        za zaVar = this.f56005iwizpuwonk;
        m60 m60Var = this.f56003cqumvgiudr;
        xf xfVar = this.f56004esjtqupxsv;
        if (!zaVar.gxszxtbevo()) {
            long jLongValue = hh0Var.f56920zoijcleaow == null ? l13.longValue() : zg.gtknphoqwx.lqeggnwhkg(l13.longValue() - (((long) hh0Var.f56920zoijcleaow.intValue()) * 100), 0L);
            if (listOfCardsResponseBody != null && (orderInfo = listOfCardsResponseBody.getOrderInfo()) != null && (orderAmount = orderInfo.getOrderAmount()) != null) {
                currency = orderAmount.getCurrency();
            }
            return qa0.ppxfxbqfkf(jLongValue, currency != null ? currency : "");
        }
        int i13 = R.string.spay_card_number_pattern_success_payment;
        SPaySdkConfig sPaySdkConfig = ((s80) m60Var).f58531ppxfxbqfkf;
        if (sPaySdkConfig == null) {
            throw Bn.f70538zdlpuopuiu;
        }
        String successEnableSPay = sPaySdkConfig.getLocalization().getSuccessEnableSPay();
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = ((ij) xfVar).iobyxmoadg().f57487zoijcleaow;
        currency = tool != null ? tool.getCardNumber() : null;
        Object[] args = {successEnableSPay, currency != null ? currency : ""};
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        return new ms(i13, hg.agtfadlqog.i(args));
    }
}
