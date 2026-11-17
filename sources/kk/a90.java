package kk;

import java.util.Iterator;
import java.util.List;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class a90 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ jlmebxxoox f55792yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ bf0 f55793zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a90(bf0 bf0Var, jlmebxxoox jlmebxxooxVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f55793zdlpuopuiu = bf0Var;
        this.f55792yggfygwlhe = jlmebxxooxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new a90(this.f55793zdlpuopuiu, this.f55792yggfygwlhe, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new a90(this.f55793zdlpuopuiu, this.f55792yggfygwlhe, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2;
        Object next;
        Long lEablkybsjg;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo3;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList3;
        Object next2;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ListOfCardsResponseBody.PaymentToolInfo.Tool incomeSelectedCard = ((ij) this.f55793zdlpuopuiu.f55995wkgbmnqykc).iobyxmoadg().f57487zoijcleaow;
        if (incomeSelectedCard == null) {
            ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) this.f55793zdlpuopuiu.f55983draadjrbmk.getValue();
            if (listOfCardsResponseBody == null || (paymentToolInfo3 = listOfCardsResponseBody.getPaymentToolInfo()) == null || (toolList3 = paymentToolInfo3.getToolList()) == null) {
                incomeSelectedCard = null;
            } else {
                jlmebxxoox jlmebxxooxVar = this.f55792yggfygwlhe;
                Iterator<T> it = toolList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    ListOfCardsResponseBody.PaymentToolInfo.Tool tool = (ListOfCardsResponseBody.PaymentToolInfo.Tool) next2;
                    if (tool.getPriorityCard()) {
                        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = tool.getAmountData();
                        Long lEablkybsjg2 = amountData != null ? kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(amountData.getAmount()) : null;
                        if ((lEablkybsjg2 != null ? lEablkybsjg2.longValue() : 0L) >= ((auzgnhcxok) jlmebxxooxVar).iobyxmoadg()) {
                            break;
                        }
                    }
                }
                incomeSelectedCard = (ListOfCardsResponseBody.PaymentToolInfo.Tool) next2;
            }
            if (incomeSelectedCard == null) {
                ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) this.f55793zdlpuopuiu.f55983draadjrbmk.getValue();
                if (listOfCardsResponseBody2 == null || (paymentToolInfo2 = listOfCardsResponseBody2.getPaymentToolInfo()) == null || (toolList2 = paymentToolInfo2.getToolList()) == null) {
                    incomeSelectedCard = null;
                } else {
                    jlmebxxoox jlmebxxooxVar2 = this.f55792yggfygwlhe;
                    Iterator<T> it2 = toolList2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) next).getAmountData();
                        lEablkybsjg = amountData2 != null ? kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(amountData2.getAmount()) : null;
                    } while ((lEablkybsjg != null ? lEablkybsjg.longValue() : 0L) < ((auzgnhcxok) jlmebxxooxVar2).iobyxmoadg());
                    incomeSelectedCard = (ListOfCardsResponseBody.PaymentToolInfo.Tool) next;
                }
                if (incomeSelectedCard == null) {
                    ListOfCardsResponseBody listOfCardsResponseBody3 = (ListOfCardsResponseBody) this.f55793zdlpuopuiu.f55983draadjrbmk.getValue();
                    incomeSelectedCard = (listOfCardsResponseBody3 == null || (paymentToolInfo = listOfCardsResponseBody3.getPaymentToolInfo()) == null || (toolList = paymentToolInfo.getToolList()) == null) ? null : toolList.get(0);
                }
            }
        }
        if (incomeSelectedCard != null) {
            ij ijVar = (ij) this.f55793zdlpuopuiu.f55995wkgbmnqykc;
            ijVar.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(incomeSelectedCard, "incomeSelectedCard");
            sj.zynmafqrjb zynmafqrjbVar = ijVar.f57055iobyxmoadg;
            zynmafqrjbVar.setValue(ln.iobyxmoadg((ln) zynmafqrjbVar.getValue(), null, incomeSelectedCard, false, 5));
        }
        return incomeSelectedCard;
    }
}
