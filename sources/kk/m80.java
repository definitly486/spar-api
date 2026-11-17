package kk;

import spay.sdk.domain.model.response.OrderScreenDataResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class m80 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f57609zdlpuopuiu;

    public m80(sj.nufgyqmvbu nufgyqmvbuVar) {
        this.f57609zdlpuopuiu = nufgyqmvbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        i70 i70Var;
        if (gxszxtbevoVar instanceof i70) {
            i70Var = (i70) gxszxtbevoVar;
            int i13 = i70Var.f57009yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                i70Var.f57009yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                i70Var = new i70(this, gxszxtbevoVar);
            }
        } else {
            i70Var = new i70(this, gxszxtbevoVar);
        }
        Object obj2 = i70Var.f57010zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = i70Var.f57009yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f57609zdlpuopuiu;
            OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) obj;
            po poVar = (orderScreenDataResponse == null || !orderScreenDataResponse.getMoreThanOneCard()) ? po.ONE_CARD : po.SEVERAL_CARDS;
            i70Var.f57009yggfygwlhe = 1;
            if (nufgyqmvbuVar.emit(poVar, i70Var) == objGxszxtbevo) {
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
