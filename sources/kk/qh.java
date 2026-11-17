package kk;

import retrofit2.HttpException;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.data.dto.response.SPayErrorDto;
import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final vx f58193iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final lw f58194zoijcleaow;

    public qh(vx networkErrorHandlerImpl, lw apiResponseErrorHandlerImpl) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkErrorHandlerImpl, "networkErrorHandlerImpl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiResponseErrorHandlerImpl, "apiResponseErrorHandlerImpl");
        this.f58193iobyxmoadg = networkErrorHandlerImpl;
        this.f58194zoijcleaow = apiResponseErrorHandlerImpl;
    }

    public static Object iobyxmoadg(lm.kcexrzcfyt kcexrzcfytVar, bt btVar, io successAction, io failAction, we0 view) {
        Object model;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kcexrzcfytVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(successAction, "successAction");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(failAction, "failAction");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        try {
            DataDtoInterface dataDtoInterface = (DataDtoInterface) kcexrzcfytVar.iobyxmoadg();
            if (dataDtoInterface == null || (model = dataDtoInterface.toModel()) == null) {
                lk.cdpycssgdh cdpycssgdhVarNufgyqmvbu = kcexrzcfytVar.nufgyqmvbu();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cdpycssgdhVarNufgyqmvbu, "this.raw()");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cdpycssgdhVarNufgyqmvbu, "<this>");
                throw new npi.spay.od((String) cdpycssgdhVarNufgyqmvbu.cdpycssgdh().gtknphoqwx().agtfadlqog().get(cdpycssgdhVarNufgyqmvbu.cdpycssgdh().gtknphoqwx().ojitshcjhn() - 1));
            }
            if (btVar == null) {
                return model;
            }
            btVar.iobyxmoadg(new ow(successAction, view, mp.RS_GOOD, null, null, null, null, 120));
            return model;
        } catch (npi.spay.pd e13) {
            if (btVar != null) {
                btVar.iobyxmoadg(new ow(failAction, view, mp.RS_FAIL, null, null, null, e13.f70582zdlpuopuiu, 56));
            }
            throw e13;
        }
    }

    public final ErrorEntity zoijcleaow(lm.kcexrzcfyt raw, SPayErrorDto sPayErrorDto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(raw, "raw");
        if (raw.iobyxmoadg() == null && sPayErrorDto == null) {
            vx vxVar = this.f58193iobyxmoadg;
            HttpException httpException = new HttpException(raw);
            vxVar.getClass();
            return vx.iobyxmoadg(httpException);
        }
        if (raw.iobyxmoadg() != null && sPayErrorDto != null) {
            return ErrorEntity.Unknown.INSTANCE;
        }
        if (raw.iobyxmoadg() != null || sPayErrorDto == null) {
            return (raw.iobyxmoadg() == null || sPayErrorDto != null) ? ErrorEntity.Unknown.INSTANCE : ErrorEntity.Unknown.INSTANCE;
        }
        this.f58194zoijcleaow.getClass();
        return lw.iobyxmoadg(sPayErrorDto);
    }
}
