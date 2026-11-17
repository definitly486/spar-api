package kk;

import spay.sdk.domain.model.response.OrderScreenDataResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class zx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f59635zdlpuopuiu;

    public zx(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        zx zxVar = new zx(gxszxtbevoVar);
        zxVar.f59635zdlpuopuiu = obj;
        return zxVar;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        zx zxVar = new zx((lg.gxszxtbevo) obj2);
        zxVar.f59635zdlpuopuiu = (OrderScreenDataResponse) obj;
        return zxVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f59635zdlpuopuiu;
        if (orderScreenDataResponse != null) {
            return orderScreenDataResponse.getListOfCardsResponseBody();
        }
        return null;
    }
}
