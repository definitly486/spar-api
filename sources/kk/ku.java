package kk;

import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ku extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.kcexrzcfyt {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ lrnfpwlwnk f57347cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final /* synthetic */ jlmebxxoox f57348esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f57349iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public /* synthetic */ boolean f57350jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ SpasiboBonusesResponseBody f57351yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody.PaymentToolInfo.Tool f57352zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(lrnfpwlwnk lrnfpwlwnkVar, jlmebxxoox jlmebxxooxVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(5, gxszxtbevoVar);
        this.f57347cqumvgiudr = lrnfpwlwnkVar;
        this.f57348esjtqupxsv = jlmebxxooxVar;
    }

    @Override // tg.kcexrzcfyt
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        ku kuVar = new ku(this.f57347cqumvgiudr, this.f57348esjtqupxsv, (lg.gxszxtbevo) obj5);
        kuVar.f57352zdlpuopuiu = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj;
        kuVar.f57351yggfygwlhe = (SpasiboBonusesResponseBody) obj2;
        kuVar.f57350jyumaefscl = zBooleanValue;
        kuVar.f57349iwizpuwonk = (ListOfCardsResponseBody) obj4;
        return kuVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        boolean z13;
        SpasiboBonusesResponseBody.PrecalculateBonusesInfo precalculateBonusesInfo;
        Integer bonusesIsDeducted;
        SpasiboBonusesResponseBody.PrecalculateBonusesInfo precalculateBonusesInfo2;
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f57352zdlpuopuiu;
        SpasiboBonusesResponseBody spasiboBonusesResponseBody = this.f57351yggfygwlhe;
        boolean z14 = this.f57350jyumaefscl;
        ListOfCardsResponseBody listOfCardsResponseBody = this.f57349iwizpuwonk;
        Integer num = null;
        Long lEablkybsjg = (listOfCardsResponseBody == null || (orderInfo = listOfCardsResponseBody.getOrderInfo()) == null || (orderAmount = orderInfo.getOrderAmount()) == null) ? null : kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(orderAmount.getAmount());
        int iIntValue = 0;
        boolean z15 = (lEablkybsjg != null ? lEablkybsjg.longValue() : 0L) == 0;
        lrnfpwlwnk lrnfpwlwnkVar = this.f57347cqumvgiudr;
        ah.gtknphoqwx[] gtknphoqwxVarArr = lrnfpwlwnk.f57499yadqdtsiqt;
        if (lrnfpwlwnkVar.vdvldrhtss()) {
            if (ir.eablkybsjg(tool != null ? tool.getPrecalculateBonuses() : null) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        boolean z16 = zd0.iobyxmoadg(this.f57347cqumvgiudr.f57523wkgbmnqykc, uc0.S_BONUSES, null) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) this.f57348esjtqupxsv).f55853iozdgvuglv.getValue(), PayStrategy.PayWithPaymentAccount.INSTANCE);
        if (z14) {
            if (spasiboBonusesResponseBody == null || (precalculateBonusesInfo = spasiboBonusesResponseBody.getPrecalculateBonusesInfo()) == null) {
                bonusesIsDeducted = null;
            } else {
                bonusesIsDeducted = precalculateBonusesInfo.getBonusesIsDeducted();
            }
        } else if (spasiboBonusesResponseBody == null || (precalculateBonusesInfo2 = spasiboBonusesResponseBody.getPrecalculateBonusesInfo()) == null) {
            bonusesIsDeducted = null;
        } else {
            bonusesIsDeducted = precalculateBonusesInfo2.getBonusesWithoutDeduction();
        }
        Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(bonusesIsDeducted != null ? bonusesIsDeducted.intValue() : 0);
        numWkgbmnqykc.getClass();
        if (!z13 || z15) {
            numWkgbmnqykc = null;
        }
        if (numWkgbmnqykc != null) {
            iIntValue = numWkgbmnqykc.intValue();
        } else {
            Integer numWkgbmnqykc2 = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(ir.eablkybsjg(tool != null ? tool.getPrecalculateBonuses() : null));
            numWkgbmnqykc2.getClass();
            if (z16 && !z15) {
                num = numWkgbmnqykc2;
            }
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iIntValue);
    }
}
