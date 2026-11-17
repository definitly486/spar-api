package kk;

import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class sz extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ bf0 f58591jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ Object f58592yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58593zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz(bf0 bf0Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58591jyumaefscl = bf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        sz szVar = new sz(this.f58591jyumaefscl, gxszxtbevoVar);
        szVar.f58592yggfygwlhe = obj;
        return szVar;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        sz szVar = new sz(this.f58591jyumaefscl, (lg.gxszxtbevo) obj2);
        szVar.f58592yggfygwlhe = (PaymentPlanBnplResponseBody) obj;
        return szVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        String offerText;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58593zdlpuopuiu;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ro roVar = (ro) this.f58592yggfygwlhe;
            gg.zdlpuopuiu.zoijcleaow(obj);
            return roVar;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) this.f58592yggfygwlhe;
        ro roVarGxszxtbevo = (paymentPlanBnplResponseBody == null || (offerText = paymentPlanBnplResponseBody.getOfferText()) == null) ? null : ir.gxszxtbevo(offerText);
        if (roVarGxszxtbevo != null) {
            fv fvVar = this.f58591jyumaefscl.f55989nufgyqmvbu;
            jw jwVar = new jw(roVarGxszxtbevo.f58460zoijcleaow);
            this.f58592yggfygwlhe = roVarGxszxtbevo;
            this.f58593zdlpuopuiu = 1;
            if (fvVar.iobyxmoadg(jwVar, pj.ikoacuggdj.zoijcleaow(), this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        return roVarGxszxtbevo;
    }
}
