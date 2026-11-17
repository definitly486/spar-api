package kk;

import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;
import spay.sdk.domain.model.response.SessionIdResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class h50 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ b9 f56832yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56833zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(b9 b9Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f56832yggfygwlhe = b9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new h50(this.f56832yggfygwlhe, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new h50(this.f56832yggfygwlhe, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56833zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!(((auzgnhcxok) this.f56832yggfygwlhe.f55956zoijcleaow).btonecajqb() instanceof PayStrategy.PayWithBinding)) {
                b9 b9Var = this.f56832yggfygwlhe;
                this.f56833zdlpuopuiu = 1;
                MerchantData merchantDataJyumaefscl = b9Var.jyumaefscl();
                ListOfCardsRequestBody listOfCardsRequestBody = new ListOfCardsRequestBody(((SessionIdResponseBody) sj.dxjokdxxww.zoijcleaow(b9Var.f55921cdpycssgdh).getValue()).getSessionId(), merchantDataJyumaefscl.getMerchantLogin(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false), merchantDataJyumaefscl.getOrderId());
                PaymentBnplPlanRequestBody paymentBnplPlanRequestBody = new PaymentBnplPlanRequestBody(((SessionIdResponseBody) sj.dxjokdxxww.zoijcleaow(b9Var.f55921cdpycssgdh).getValue()).getSessionId(), merchantDataJyumaefscl.getMerchantLogin(), merchantDataJyumaefscl.getOrderId());
                if (!zd0.iobyxmoadg(b9Var.f55927gtknphoqwx, uc0.BNPL, b6.BY_SYSTEM)) {
                    paymentBnplPlanRequestBody = null;
                }
                Object objZoijcleaow = b9Var.f55920btonecajqb.zoijcleaow(new qf(listOfCardsRequestBody, paymentBnplPlanRequestBody, zd0.zoijcleaow(b9Var.f55927gtknphoqwx, vf0.ONE_OF) ? new SpasiboBonusesRequestBody(((SessionIdResponseBody) sj.dxjokdxxww.zoijcleaow(b9Var.f55921cdpycssgdh).getValue()).getSessionId()) : null, merchantDataJyumaefscl.getAuthorization()), pj.ikoacuggdj.zoijcleaow(), this);
                if (objZoijcleaow != mg.zoijcleaow.gxszxtbevo()) {
                    objZoijcleaow = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (objZoijcleaow == objGxszxtbevo) {
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
