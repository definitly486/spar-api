package kk;

import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class m70 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ boolean f57600iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ ListOfCardsResponseBody.PaymentToolInfo.Tool f57601jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ b9 f57602yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57603zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m70(b9 b9Var, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57602yggfygwlhe = b9Var;
        this.f57601jyumaefscl = tool;
        this.f57600iwizpuwonk = z13;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new m70(this.f57602yggfygwlhe, this.f57601jyumaefscl, this.f57600iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((m70) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57603zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!(((auzgnhcxok) this.f57602yggfygwlhe.f55956zoijcleaow).btonecajqb() instanceof PayStrategy.PayWithBinding)) {
                b9 b9Var = this.f57602yggfygwlhe;
                ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f57601jyumaefscl;
                boolean z13 = this.f57600iwizpuwonk;
                this.f57603zdlpuopuiu = 1;
                if (b9.draadjrbmk(b9Var, tool, z13, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
