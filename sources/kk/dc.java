package kk;

import spay.sdk.domain.model.response.OrderScreenDataResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class dc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f56256zdlpuopuiu;

    public dc(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        dc dcVar = new dc(gxszxtbevoVar);
        dcVar.f56256zdlpuopuiu = obj;
        return dcVar;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        dc dcVar = new dc((lg.gxszxtbevo) obj2);
        dcVar.f56256zdlpuopuiu = (OrderScreenDataResponse) obj;
        return dcVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f56256zdlpuopuiu;
        if (orderScreenDataResponse != null) {
            return orderScreenDataResponse.getListOfCardsResponseBody();
        }
        return null;
    }
}
