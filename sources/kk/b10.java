package kk;

import kotlin.NoWhenBranchMatchedException;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class b10 implements qy {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final sk f55890iobyxmoadg;

    public b10(fj resourceManager, sk commonRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourceManager, "resourceManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(commonRepository, "commonRepository");
        this.f55890iobyxmoadg = commonRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iobyxmoadg(kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        vz vzVar;
        if (wkgbmnqykcVar instanceof vz) {
            vzVar = (vz) wkgbmnqykcVar;
            int i13 = vzVar.f59068jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                vzVar.f59068jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                vzVar = new vz(this, wkgbmnqykcVar);
            }
        } else {
            vzVar = new vz(this, wkgbmnqykcVar);
        }
        Object objWkgbmnqykc = vzVar.f59070zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = vzVar.f59068jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            sk skVar = this.f55890iobyxmoadg;
            vzVar.f59068jyumaefscl = 1;
            objWkgbmnqykc = ((bo) skVar).wkgbmnqykc(vzVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        ContentResponse contentResponse = (ContentResponse) objWkgbmnqykc;
        if (contentResponse instanceof ContentResponse.Success) {
            return (SPaySdkConfig) ((ContentResponse.Success) contentResponse).getData();
        }
        if (contentResponse instanceof ContentResponse.Failure) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
