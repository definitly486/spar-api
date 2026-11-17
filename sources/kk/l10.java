package kk;

import java.util.Iterator;
import java.util.List;
import npi.spay.Dn;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class l10 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ s20 f57371zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l10(s20 s20Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57371zdlpuopuiu = s20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new l10(this.f57371zdlpuopuiu, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new l10(this.f57371zdlpuopuiu, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a A[PHI: r2
      0x009a: PHI (r2v6 java.lang.Long) = (r2v5 java.lang.Long), (r2v13 java.lang.Long) binds: [B:20:0x004e, B:41:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2;
        Object next;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData3;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo3;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) ((auzgnhcxok) this.f57371zdlpuopuiu.f58495iobyxmoadg).f55863oxmwwwfdhm.getValue();
        Long lValueOf = null;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList3 = (listOfCardsResponseBody == null || (paymentToolInfo3 = listOfCardsResponseBody.getPaymentToolInfo()) == null) ? null : paymentToolInfo3.getToolList();
        boolean z13 = false;
        if (toolList3 != null && !toolList3.isEmpty()) {
            s20 s20Var = this.f57371zdlpuopuiu;
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = ((ij) s20Var.f58497zoijcleaow).iobyxmoadg().f57487zoijcleaow;
            Long lValueOf2 = (tool2 == null || (amountData3 = tool2.getAmountData()) == null) ? null : Long.valueOf(amountData3.getAmount());
            if (lValueOf2 == null) {
                ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) ((auzgnhcxok) s20Var.f58495iobyxmoadg).f55863oxmwwwfdhm.getValue();
                if (listOfCardsResponseBody2 == null || (paymentToolInfo2 = listOfCardsResponseBody2.getPaymentToolInfo()) == null || (toolList2 = paymentToolInfo2.getToolList()) == null) {
                    lValueOf2 = null;
                } else {
                    Iterator<T> it = toolList2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((ListOfCardsResponseBody.PaymentToolInfo.Tool) next).getPriorityCard());
                    ListOfCardsResponseBody.PaymentToolInfo.Tool tool3 = (ListOfCardsResponseBody.PaymentToolInfo.Tool) next;
                    if (tool3 == null || (amountData2 = tool3.getAmountData()) == null) {
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(amountData2.getAmount());
                    }
                }
                if (lValueOf2 != null) {
                    jLongValue = lValueOf2.longValue();
                } else {
                    ListOfCardsResponseBody listOfCardsResponseBody3 = (ListOfCardsResponseBody) ((auzgnhcxok) s20Var.f58495iobyxmoadg).f55863oxmwwwfdhm.getValue();
                    Long lValueOf3 = (listOfCardsResponseBody3 == null || (paymentToolInfo = listOfCardsResponseBody3.getPaymentToolInfo()) == null || (toolList = paymentToolInfo.getToolList()) == null || (tool = toolList.get(0)) == null || (amountData = tool.getAmountData()) == null) ? null : Long.valueOf(amountData.getAmount());
                    jLongValue = lValueOf3 != null ? lValueOf3.longValue() : 0L;
                }
            } else {
                jLongValue = lValueOf2.longValue();
            }
            ListOfCardsResponseBody listOfCardsResponseBody4 = (ListOfCardsResponseBody) ((auzgnhcxok) this.f57371zdlpuopuiu.f58495iobyxmoadg).f55863oxmwwwfdhm.getValue();
            if (listOfCardsResponseBody4 != null && (orderInfo = listOfCardsResponseBody4.getOrderInfo()) != null && (orderAmount = orderInfo.getOrderAmount()) != null) {
                lValueOf = Long.valueOf(orderAmount.getAmount());
            }
            if (jLongValue <= (lValueOf != null ? lValueOf.longValue() : 0L)) {
                SPaySdkInitConfig sPaySdkInitConfig = ((nb) this.f57371zdlpuopuiu.f58496ppxfxbqfkf).f57752iobyxmoadg;
                if (sPaySdkInitConfig == null) {
                    throw Dn.f70543zdlpuopuiu;
                }
                if (!sPaySdkInitConfig.getHelperConfig().isHelperEnabled()) {
                    z13 = true;
                }
            }
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }
}
