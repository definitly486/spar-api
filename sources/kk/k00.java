package kk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class k00 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ lrnfpwlwnk f57246zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k00(lrnfpwlwnk lrnfpwlwnkVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57246zdlpuopuiu = lrnfpwlwnkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new k00(this.f57246zdlpuopuiu, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new k00(this.f57246zdlpuopuiu, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        ListOfCardsResponseBody.PaymentToolInfo.Tool incomeSelectedCard;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2;
        Object next;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo3;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList3;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        lrnfpwlwnk lrnfpwlwnkVar = this.f57246zdlpuopuiu;
        if (lrnfpwlwnkVar.f57508gtknphoqwx) {
            ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) lrnfpwlwnkVar.f57522wflxmlrfwp.getValue();
            if (listOfCardsResponseBody == null || (paymentToolInfo3 = listOfCardsResponseBody.getPaymentToolInfo()) == null || (toolList3 = paymentToolInfo3.getToolList()) == null) {
                incomeSelectedCard = null;
            } else {
                incomeSelectedCard = toolList3.get(0);
            }
        } else {
            incomeSelectedCard = ((ij) lrnfpwlwnkVar.f57506eablkybsjg).iobyxmoadg().f57487zoijcleaow;
            if (incomeSelectedCard == null) {
                ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) this.f57246zdlpuopuiu.f57522wflxmlrfwp.getValue();
                if (listOfCardsResponseBody2 == null || (paymentToolInfo2 = listOfCardsResponseBody2.getPaymentToolInfo()) == null || (toolList2 = paymentToolInfo2.getToolList()) == null) {
                    incomeSelectedCard = null;
                } else {
                    Iterator<T> it = toolList2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((ListOfCardsResponseBody.PaymentToolInfo.Tool) next).getPriorityCard());
                    incomeSelectedCard = (ListOfCardsResponseBody.PaymentToolInfo.Tool) next;
                }
                if (incomeSelectedCard == null) {
                    ListOfCardsResponseBody listOfCardsResponseBody3 = (ListOfCardsResponseBody) this.f57246zdlpuopuiu.f57522wflxmlrfwp.getValue();
                    if (listOfCardsResponseBody3 == null || (paymentToolInfo = listOfCardsResponseBody3.getPaymentToolInfo()) == null || (toolList = paymentToolInfo.getToolList()) == null) {
                        incomeSelectedCard = null;
                    } else {
                        incomeSelectedCard = toolList.get(0);
                    }
                }
            }
        }
        if (incomeSelectedCard != null) {
            ij ijVar = (ij) this.f57246zdlpuopuiu.f57506eablkybsjg;
            ijVar.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(incomeSelectedCard, "incomeSelectedCard");
            sj.zynmafqrjb zynmafqrjbVar = ijVar.f57055iobyxmoadg;
            zynmafqrjbVar.setValue(ln.iobyxmoadg((ln) zynmafqrjbVar.getValue(), null, incomeSelectedCard, false, 5));
        }
        List<jo> listIobyxmoadg = this.f57246zdlpuopuiu.f57516nufgyqmvbu.iobyxmoadg();
        sj.zynmafqrjb zynmafqrjbVar2 = this.f57246zdlpuopuiu.f57510istkbnxepw;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        for (jo joVar : listIobyxmoadg) {
            arrayList.add(new np(joVar.f57212iobyxmoadg, joVar.f57213zoijcleaow));
        }
        zynmafqrjbVar2.setValue(hg.jyumaefscl.r(arrayList));
        return incomeSelectedCard;
    }
}
