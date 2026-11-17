package kk;

import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class c50 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f56096zdlpuopuiu;

    public c50(sj.nufgyqmvbu nufgyqmvbuVar) {
        this.f56096zdlpuopuiu = nufgyqmvbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        z30 z30Var;
        if (gxszxtbevoVar instanceof z30) {
            z30Var = (z30) gxszxtbevoVar;
            int i13 = z30Var.f59519yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                z30Var.f59519yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                z30Var = new z30(this, gxszxtbevoVar);
            }
        } else {
            z30Var = new z30(this, gxszxtbevoVar);
        }
        Object obj2 = z30Var.f59520zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = z30Var.f59519yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f56096zdlpuopuiu;
            ListOfCardsResponseBody.MerchantInfo merchantInfo = ((ListOfCardsResponseBody) obj).getMerchantInfo();
            vb vbVar = new vb(merchantInfo != null ? merchantInfo.getMerchantLogoUrl() : null);
            z30Var.f59519yggfygwlhe = 1;
            if (nufgyqmvbuVar.emit(vbVar, z30Var) == objGxszxtbevo) {
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
