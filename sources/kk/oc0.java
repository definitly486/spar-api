package kk;

import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class oc0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.oxmwwwfdhm {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ wc0 f57924iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public /* synthetic */ PayStrategy f57925jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ int f57926yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ ln f57927zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc0(wc0 wc0Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(4, gxszxtbevoVar);
        this.f57924iwizpuwonk = wc0Var;
    }

    @Override // tg.oxmwwwfdhm
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        oc0 oc0Var = new oc0(this.f57924iwizpuwonk, (lg.gxszxtbevo) obj4);
        oc0Var.f57927zdlpuopuiu = (ln) obj;
        oc0Var.f57926yggfygwlhe = iIntValue;
        oc0Var.f57925jyumaefscl = (PayStrategy) obj3;
        return oc0Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        ln lnVar = this.f57927zdlpuopuiu;
        int iEablkybsjg = this.f57926yggfygwlhe;
        PayStrategy payStrategy = this.f57925jyumaefscl;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(payStrategy, PayStrategy.PayWithBonuses.INSTANCE) || !zd0.zoijcleaow(this.f57924iwizpuwonk, vf0.ONE_OF)) {
            if (payStrategy instanceof PayStrategy.PayWithPaymentAccount) {
                iEablkybsjg = 0;
            } else {
                if (zd0.iobyxmoadg(this.f57924iwizpuwonk, uc0.S_BONUSES, null)) {
                    ListOfCardsResponseBody.PaymentToolInfo.Tool tool = lnVar.f57487zoijcleaow;
                    iEablkybsjg = ir.eablkybsjg(tool != null ? tool.getPrecalculateBonuses() : null);
                } else {
                    iEablkybsjg = 0;
                }
            }
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iEablkybsjg);
    }
}
