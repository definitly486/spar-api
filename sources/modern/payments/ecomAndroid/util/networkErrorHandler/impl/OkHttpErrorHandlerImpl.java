package modern.payments.ecomAndroid.util.networkErrorHandler.impl;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/util/networkErrorHandler/impl/OkHttpErrorHandlerImpl;", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "", "()V", "getError", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "error", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OkHttpErrorHandlerImpl implements NetworkErrorHandler<Throwable> {
    public static final int HTTP_ACCESS_DENIED = 403;
    public static final int HTTP_BAD_REQUEST = 400;
    public static final int HTTP_NOT_FOUND = 404;
    public static final int HTTP_ORDER_IN_PROCESS = 423;
    public static final int HTTP_REQUEST_TIMEOUT_ERROR = 408;
    public static final int HTTP_SYSTEM_ERROR = 500;
    public static final int HTTP_TOO_MANY_REQUESTS = 429;
    public static final int HTTP_UNAUTHORIZED = 401;
    public static final int HTTP_UNAVAILABLE = 503;

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    @Override // modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler
    public ErrorEntity getError(Throwable error) {
        ErrorEntity badRequest;
        zdlpuopuiu.btonecajqb(error, "error");
        if (error instanceof UnknownHostException) {
            return new ErrorEntity.HttpError.NoInternet(error.getMessage());
        }
        if (error instanceof SocketTimeoutException) {
            return new ErrorEntity.HttpError.Timeout(error.getMessage());
        }
        if (!(error instanceof HttpException)) {
            return new ErrorEntity.HttpError.Unknown(null, null, error.getMessage(), 3, null);
        }
        HttpException httpException = (HttpException) error;
        int iIobyxmoadg = httpException.iobyxmoadg();
        if (iIobyxmoadg == 400) {
            badRequest = new ErrorEntity.HttpError.BadRequest(String.valueOf(httpException.iobyxmoadg()), error.getMessage());
        } else if (iIobyxmoadg == 401) {
            badRequest = new ErrorEntity.HttpError.ServiceUnavailable(String.valueOf(httpException.iobyxmoadg()), null, error.getMessage(), 2, null);
        } else if (iIobyxmoadg == 403) {
            badRequest = new ErrorEntity.HttpError.UnknownApiResult(String.valueOf(httpException.iobyxmoadg()), error.getMessage());
        } else if (iIobyxmoadg == 404) {
            badRequest = new ErrorEntity.HttpError.ServiceUnavailable(String.valueOf(httpException.iobyxmoadg()), null, error.getMessage(), 2, null);
        } else if (iIobyxmoadg == 408 || iIobyxmoadg == 423 || iIobyxmoadg == 429 || iIobyxmoadg == 500) {
            badRequest = new ErrorEntity.HttpError.UnknownApiResult(String.valueOf(httpException.iobyxmoadg()), error.getMessage());
        } else if (iIobyxmoadg != 503) {
            badRequest = new ErrorEntity.HttpError.Unknown(String.valueOf(httpException.iobyxmoadg()), null, error.getMessage(), 2, null);
        } else {
            badRequest = new ErrorEntity.HttpError.ServiceUnavailable(String.valueOf(httpException.iobyxmoadg()), null, error.getMessage(), 2, null);
        }
        return badRequest;
    }
}
