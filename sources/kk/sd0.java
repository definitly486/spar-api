package kk;

import spay.sdk.domain.model.response.OrderScreenDataResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class sd0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f58549zdlpuopuiu;

    public sd0(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        sd0 sd0Var = new sd0(gxszxtbevoVar);
        sd0Var.f58549zdlpuopuiu = obj;
        return sd0Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        sd0 sd0Var = new sd0((lg.gxszxtbevo) obj2);
        sd0Var.f58549zdlpuopuiu = (OrderScreenDataResponse) obj;
        return sd0Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f58549zdlpuopuiu;
        if (orderScreenDataResponse != null) {
            return orderScreenDataResponse.getListOfCardsResponseBody();
        }
        return null;
    }
}
