package kk;

import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class cdpycssgdh extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ c6 f56134jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ Object f56135yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56136zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdpycssgdh(c6 c6Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f56134jyumaefscl = c6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        cdpycssgdh cdpycssgdhVar = new cdpycssgdh(this.f56134jyumaefscl, gxszxtbevoVar);
        cdpycssgdhVar.f56135yggfygwlhe = obj;
        return cdpycssgdhVar;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        cdpycssgdh cdpycssgdhVar = new cdpycssgdh(this.f56134jyumaefscl, (lg.gxszxtbevo) obj2);
        cdpycssgdhVar.f56135yggfygwlhe = (PaymentPlanBnplResponseBody) obj;
        return cdpycssgdhVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        String offerText;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56136zdlpuopuiu;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ro roVar = (ro) this.f56135yggfygwlhe;
            gg.zdlpuopuiu.zoijcleaow(obj);
            return roVar;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) this.f56135yggfygwlhe;
        ro roVarGxszxtbevo = (paymentPlanBnplResponseBody == null || (offerText = paymentPlanBnplResponseBody.getOfferText()) == null) ? null : ir.gxszxtbevo(offerText);
        if (roVarGxszxtbevo != null) {
            fv fvVar = this.f56134jyumaefscl.f56102gxszxtbevo;
            jw jwVar = new jw(roVarGxszxtbevo.f58460zoijcleaow);
            this.f56135yggfygwlhe = roVarGxszxtbevo;
            this.f56136zdlpuopuiu = 1;
            if (fvVar.iobyxmoadg(jwVar, pj.ikoacuggdj.zoijcleaow(), this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        return roVarGxszxtbevo;
    }
}
