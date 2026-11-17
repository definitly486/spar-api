package modern.payments.ecomAndroid.util.networkErrorHandler.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/util/networkErrorHandler/impl/ApiErrorHandlerImpl;", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "()V", "getError", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "error", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ApiErrorHandlerImpl implements NetworkErrorHandler<EcomApiError> {
    public static final String ERROR_CODE_UNAVAILABLE = "999";

    @Override // modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler
    public ErrorEntity getError(EcomApiError error) {
        ErrorEntity successfulError;
        String description;
        zdlpuopuiu.btonecajqb(error, "error");
        if (error.getErrorCode().length() == 0 && ((description = error.getDescription()) == null || description.length() == 0)) {
            String httpCode = error.getHttpCode();
            String errorCode = error.getErrorCode();
            String info = error.getInfo();
            if (info == null) {
                info = error.getDescription();
            }
            successfulError = new ErrorEntity.HttpError.Unknown(httpCode, errorCode, info);
        } else if (error.getErrorCode().length() <= 0) {
            String errorCode2 = error.getErrorCode();
            String info2 = error.getInfo();
            if (info2 == null && (info2 = error.getDescription()) == null) {
                info2 = "No Error Description";
            }
            successfulError = new ErrorEntity.EcomServiceApiError.SuccessfulError(errorCode2, info2);
        } else if (zdlpuopuiu.eablkybsjg(error.getErrorCode(), ERROR_CODE_UNAVAILABLE)) {
            String httpCode2 = error.getHttpCode();
            String errorCode3 = error.getErrorCode();
            String info3 = error.getInfo();
            if (info3 == null) {
                info3 = error.getDescription();
            }
            successfulError = new ErrorEntity.HttpError.ServiceUnavailable(httpCode2, errorCode3, info3);
        } else {
            String httpCode3 = error.getHttpCode();
            String errorCode4 = error.getErrorCode();
            String info4 = error.getInfo();
            if (info4 == null) {
                info4 = error.getDescription();
            }
            successfulError = new ErrorEntity.HttpError.Unknown(httpCode3, errorCode4, info4);
        }
        return successfulError;
    }
}
