package kk;

import kotlin.NoWhenBranchMatchedException;
import spay.seamlessAuth.core.data.network.dto.ExchangeTokenResponseDto;
import spay.seamlessAuth.core.data.network.request.ExchangeTokenRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class c70 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final b00 f56109iobyxmoadg;

    public c70(b00 appTokenApi) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appTokenApi, "appTokenApi");
        this.f56109iobyxmoadg = appTokenApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object iobyxmoadg(w40 w40Var, String str, String str2, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        z50 z50Var;
        if (wkgbmnqykcVar instanceof z50) {
            z50Var = (z50) wkgbmnqykcVar;
            int i13 = z50Var.f59525jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                z50Var.f59525jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                z50Var = new z50(this, wkgbmnqykcVar);
            }
        } else {
            z50Var = new z50(this, wkgbmnqykcVar);
        }
        Object objIobyxmoadg = z50Var.f59527zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = z50Var.f59525jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ExchangeTokenRequest exchangeTokenRequest = new ExchangeTokenRequest(w40Var.f59090iobyxmoadg, str, str2, null, null, null, 56, null);
            b00 b00Var = this.f56109iobyxmoadg;
            z50Var.f59525jyumaefscl = 1;
            objIobyxmoadg = ((t30) b00Var).iobyxmoadg(exchangeTokenRequest, z50Var);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        qg0 qg0Var = (qg0) objIobyxmoadg;
        if (qg0Var instanceof zynmafqrjb) {
            return ((ExchangeTokenResponseDto) ((zynmafqrjb) qg0Var).f59636iobyxmoadg).toModel();
        }
        if (qg0Var instanceof ff) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
