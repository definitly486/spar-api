package kk;

import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class qf0 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f58189zdlpuopuiu;

    public qf0(sj.nufgyqmvbu nufgyqmvbuVar) {
        this.f58189zdlpuopuiu = nufgyqmvbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        ke0 ke0Var;
        if (gxszxtbevoVar instanceof ke0) {
            ke0Var = (ke0) gxszxtbevoVar;
            int i13 = ke0Var.f57295yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ke0Var.f57295yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                ke0Var = new ke0(this, gxszxtbevoVar);
            }
        } else {
            ke0Var = new ke0(this, gxszxtbevoVar);
        }
        Object obj2 = ke0Var.f57296zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ke0Var.f57295yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f58189zdlpuopuiu;
            ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) obj;
            ListOfCardsResponseBody.MerchantInfo merchantInfo = listOfCardsResponseBody.getMerchantInfo();
            String merchantName = merchantInfo != null ? merchantInfo.getMerchantName() : null;
            if (merchantName == null) {
                merchantName = "";
            }
            rt rtVarIobyxmoadg = me.iobyxmoadg(merchantName, "text", merchantName);
            ListOfCardsResponseBody.MerchantInfo merchantInfo2 = listOfCardsResponseBody.getMerchantInfo();
            tp tpVar = new tp(rtVarIobyxmoadg, merchantInfo2 != null ? merchantInfo2.getMerchantLogoUrl() : null);
            ke0Var.f57295yggfygwlhe = 1;
            if (nufgyqmvbuVar.emit(tpVar, ke0Var) == objGxszxtbevo) {
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
