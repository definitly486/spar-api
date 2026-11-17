package kk;

import java.util.Iterator;
import java.util.List;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ov extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ jlmebxxoox f57996iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ lrnfpwlwnk f57997jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody.PaymentToolInfo.Tool f57998yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f57999zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(lrnfpwlwnk lrnfpwlwnkVar, jlmebxxoox jlmebxxooxVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
        this.f57997jyumaefscl = lrnfpwlwnkVar;
        this.f57996iwizpuwonk = jlmebxxooxVar;
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ov ovVar = new ov(this.f57997jyumaefscl, this.f57996iwizpuwonk, (lg.gxszxtbevo) obj3);
        ovVar.f57999zdlpuopuiu = (ListOfCardsResponseBody) obj;
        ovVar.f57998yggfygwlhe = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2;
        return ovVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool;
        boolean z13;
        Object next;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ListOfCardsResponseBody listOfCardsResponseBody = this.f57999zdlpuopuiu;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = this.f57998yggfygwlhe;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2 = listOfCardsResponseBody.getPaymentToolInfo().getToolList();
        if (toolList2 != null) {
            Iterator<T> it = toolList2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ListOfCardsResponseBody.PaymentToolInfo.Tool) next).getCardNumber(), tool2.getCardNumber()));
            tool = (ListOfCardsResponseBody.PaymentToolInfo.Tool) next;
            if (tool == null) {
                toolList = listOfCardsResponseBody.getPaymentToolInfo().getToolList();
                if (toolList != null) {
                    tool = (ListOfCardsResponseBody.PaymentToolInfo.Tool) hg.jyumaefscl.opjhrmiecq(toolList);
                } else {
                    tool = null;
                }
            }
        } else {
            toolList = listOfCardsResponseBody.getPaymentToolInfo().getToolList();
            if (toolList != null) {
                tool = (ListOfCardsResponseBody.PaymentToolInfo.Tool) hg.jyumaefscl.opjhrmiecq(toolList);
            } else {
                tool = null;
            }
        }
        boolean zIobyxmoadg = zd0.iobyxmoadg(this.f57997jyumaefscl.f57523wkgbmnqykc, uc0.CARD_BALANCE, null);
        if (zd0.iobyxmoadg(this.f57997jyumaefscl.f57523wkgbmnqykc, uc0.COMPOUND_WALLET, null)) {
            Integer countAdditionalCards = tool != null ? tool.getCountAdditionalCards() : null;
            if (countAdditionalCards == null || countAdditionalCards.intValue() <= 0) {
                z13 = false;
            } else {
                z13 = true;
            }
        } else {
            z13 = false;
        }
        return ew.iobyxmoadg(zIobyxmoadg, z13, ((auzgnhcxok) this.f57996iwizpuwonk).f55853iozdgvuglv.getValue() instanceof PayStrategy.PayWithPaymentAccount, tool);
    }
}
