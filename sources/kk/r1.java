package kk;

import spay.sdk.domain.model.response.OrderScreenDataResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f58258zdlpuopuiu;

    public r1(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        r1 r1Var = new r1(gxszxtbevoVar);
        r1Var.f58258zdlpuopuiu = obj;
        return r1Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        r1 r1Var = new r1((lg.gxszxtbevo) obj2);
        r1Var.f58258zdlpuopuiu = (OrderScreenDataResponse) obj;
        return r1Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f58258zdlpuopuiu;
        if (orderScreenDataResponse != null) {
            return orderScreenDataResponse.getPaymentPlanBnplResponseBody();
        }
        return null;
    }
}
