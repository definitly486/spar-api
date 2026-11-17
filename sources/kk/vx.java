package kk;

import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import retrofit2.HttpException;
import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class vx implements zc {
    public static ErrorEntity iobyxmoadg(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        if (error instanceof UnknownHostException ? true : error instanceof SocketException) {
            return ErrorEntity.NoInternet.INSTANCE;
        }
        if (error instanceof SocketTimeoutException) {
            return ErrorEntity.TimeOut.INSTANCE;
        }
        if (!(error instanceof HttpException)) {
            return ErrorEntity.Unknown.INSTANCE;
        }
        int iIobyxmoadg = ((HttpException) error).iobyxmoadg();
        if (iIobyxmoadg == 400) {
            return new ErrorEntity.BadRequest(null, null, null, 7, null);
        }
        if (iIobyxmoadg == 401) {
            return ErrorEntity.Unauthorized.INSTANCE;
        }
        if (iIobyxmoadg != 403) {
            if (iIobyxmoadg == 404) {
                return ErrorEntity.NotFound.INSTANCE;
            }
            if (iIobyxmoadg != 408 && iIobyxmoadg != 423 && iIobyxmoadg != 429 && iIobyxmoadg != 500) {
                return iIobyxmoadg != 503 ? ErrorEntity.Unknown.INSTANCE : ErrorEntity.ServiceUnavailable.INSTANCE;
            }
        }
        return ErrorEntity.UnknownApiResult.INSTANCE;
    }

    @Override // kk.zc
    public final /* bridge */ /* synthetic */ ErrorEntity a(Object obj) {
        return iobyxmoadg((Throwable) obj);
    }
}
