package kk;

import spay.sdk.data.dto.response.SPayErrorDto;
import spay.sdk.data.dto.response.SPayErrorDtoKt;
import spay.sdk.data.dto.response.paymentToken.FraudMonCheckResultResponseBodyDto;
import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class lw implements zc {
    public static ErrorEntity iobyxmoadg(SPayErrorDto error) {
        String description;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        String errorCode = error.getErrorCode();
        if ((errorCode == null || errorCode.length() == 0) && ((description = error.getDescription()) == null || description.length() == 0)) {
            return ErrorEntity.Unknown.INSTANCE;
        }
        String errorCode2 = error.getErrorCode();
        if (errorCode2 != null && errorCode2.length() != 0 && SPayErrorDtoKt.findOutCurrentVerdict(error) != null) {
            String errorCode3 = error.getErrorCode();
            String description2 = error.getDescription();
            FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDtoFindOutCurrentVerdict = SPayErrorDtoKt.findOutCurrentVerdict(error);
            return new ErrorEntity.BadRequest(errorCode3, description2, fraudMonCheckResultResponseBodyDtoFindOutCurrentVerdict != null ? fraudMonCheckResultResponseBodyDtoFindOutCurrentVerdict.toModel() : null);
        }
        String errorCode4 = error.getErrorCode();
        if (errorCode4 == null) {
            errorCode4 = "13";
        }
        String description3 = error.getDescription();
        if (description3 == null) {
            description3 = "";
        }
        return new ErrorEntity.ApiError(errorCode4, description3);
    }

    @Override // kk.zc
    public final /* bridge */ /* synthetic */ ErrorEntity a(Object obj) {
        return iobyxmoadg((SPayErrorDto) obj);
    }
}
