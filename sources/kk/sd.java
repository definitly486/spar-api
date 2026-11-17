package kk;

import spay.sdk.domain.model.DeprecatedPaymentMethod;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class sd extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ n80 f58545iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ boolean f58546jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ ListOfCardsResponseBody.PaymentToolInfo.Tool f58547yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ ve f58548zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd(ve veVar, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z13, n80 n80Var) {
        super(0);
        this.f58548zdlpuopuiu = veVar;
        this.f58547yggfygwlhe = tool;
        this.f58546jyumaefscl = z13;
        this.f58545iwizpuwonk = n80Var;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        ve veVar = this.f58548zdlpuopuiu;
        xf xfVar = veVar.f58997iobyxmoadg;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f58547yggfygwlhe;
        boolean z13 = this.f58546jyumaefscl;
        ((ij) xfVar).zoijcleaow(((PayStrategy) ((auzgnhcxok) veVar.f59000zoijcleaow).f55853iozdgvuglv.getValue()) instanceof DeprecatedPaymentMethod ? new ua0(tool, z13) : new q90(tool, z13, this.f58545iwizpuwonk));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
