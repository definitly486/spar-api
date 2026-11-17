package kk;

import spay.sdk.domain.model.response.OrderScreenDataResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class jb0 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f57176zdlpuopuiu;

    public jb0(sj.nufgyqmvbu nufgyqmvbuVar) {
        this.f57176zdlpuopuiu = nufgyqmvbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        ea0 ea0Var;
        if (gxszxtbevoVar instanceof ea0) {
            ea0Var = (ea0) gxszxtbevoVar;
            int i13 = ea0Var.f56395yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ea0Var.f56395yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                ea0Var = new ea0(this, gxszxtbevoVar);
            }
        } else {
            ea0Var = new ea0(this, gxszxtbevoVar);
        }
        Object obj2 = ea0Var.f56396zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ea0Var.f56395yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f57176zdlpuopuiu;
            OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) obj;
            po poVar = (orderScreenDataResponse == null || !orderScreenDataResponse.getMoreThanOneCard()) ? po.ONE_CARD : po.SEVERAL_CARDS;
            ea0Var.f56395yggfygwlhe = 1;
            if (nufgyqmvbuVar.emit(poVar, ea0Var) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj2);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
