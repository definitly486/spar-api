package kk;

import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.request.PayOnlineRequestBody;
import spay.sdk.domain.model.response.SessionIdResponseBody;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class j60 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ boolean f57161cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ n80 f57162iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ ListOfCardsResponseBody.PaymentToolInfo.Tool f57163jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ b9 f57164yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57165zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j60(b9 b9Var, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, n80 n80Var, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57164yggfygwlhe = b9Var;
        this.f57163jyumaefscl = tool;
        this.f57162iwizpuwonk = n80Var;
        this.f57161cqumvgiudr = z13;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new j60(this.f57164yggfygwlhe, this.f57163jyumaefscl, this.f57162iwizpuwonk, this.f57161cqumvgiudr, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((j60) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57165zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            MerchantData merchantDataJyumaefscl = this.f57164yggfygwlhe.jyumaefscl();
            b9 b9Var = this.f57164yggfygwlhe;
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f57163jyumaefscl;
            n80 n80Var = this.f57162iwizpuwonk;
            boolean z13 = this.f57161cqumvgiudr;
            o8 o8Var = b9Var.f55928gxszxtbevo;
            r9 r9Var = new r9(merchantDataJyumaefscl.getAuthorization(), new PayOnlineRequestBody(null, ((SessionIdResponseBody) sj.dxjokdxxww.zoijcleaow(b9Var.f55921cdpycssgdh).getValue()).getSessionId(), merchantDataJyumaefscl.getMerchantLogin(), ((auzgnhcxok) b9Var.f55956zoijcleaow).f55870wwaezpbzkn, tool.getPaymentId(), null, merchantDataJyumaefscl.getOrderId(), z13, ((auzgnhcxok) b9Var.f55956zoijcleaow).f55866rgvfuqvkyq, n80Var != null ? kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(n80Var.f57744iobyxmoadg) : null, n80Var != null ? n80Var.f57745zoijcleaow : null, 33, null));
            this.f57165zdlpuopuiu = 1;
            if (o8Var.iobyxmoadg(r9Var, pj.ikoacuggdj.zoijcleaow(), this) == objGxszxtbevo) {
                return objGxszxtbevo;
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
