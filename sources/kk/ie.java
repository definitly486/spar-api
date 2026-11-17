package kk;

import npi.spay.Bn;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class ie implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ m60 f57032yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f57033zdlpuopuiu;

    public ie(sj.nufgyqmvbu nufgyqmvbuVar, m60 m60Var) {
        this.f57033zdlpuopuiu = nufgyqmvbuVar;
        this.f57032yggfygwlhe = m60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        gd gdVar;
        if (gxszxtbevoVar instanceof gd) {
            gdVar = (gd) gxszxtbevoVar;
            int i13 = gdVar.f56695yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gdVar.f56695yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                gdVar = new gd(this, gxszxtbevoVar);
            }
        } else {
            gdVar = new gd(this, gxszxtbevoVar);
        }
        Object obj2 = gdVar.f56696zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gdVar.f56695yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f57033zdlpuopuiu;
            SPaySdkConfig sPaySdkConfig = ((s80) this.f57032yggfygwlhe).f58531ppxfxbqfkf;
            if (sPaySdkConfig == null) {
                throw Bn.f70538zdlpuopuiu;
            }
            vb vbVar = new vb(sPaySdkConfig.getImages().getLogoIcon());
            gdVar.f56695yggfygwlhe = 1;
            if (nufgyqmvbuVar.emit(vbVar, gdVar) == objGxszxtbevo) {
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
