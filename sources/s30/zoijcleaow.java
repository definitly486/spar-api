package s30;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.SerializationException;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;
import retrofit2.HttpException;
import ru.myspar.core.error_handler.exceptions.AvailableOnlyForPickupException;
import ru.myspar.core.error_handler.exceptions.DeliveryIntervalNotValidException;
import ru.myspar.core.error_handler.exceptions.DomainException;
import ru.myspar.core.error_handler.exceptions.NoCityFoundException;
import ru.myspar.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.core.error_handler.exceptions.RequestException;
import ss.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static final wkgbmnqykc iobyxmoadg(Throwable th2, String errorId) {
        zdlpuopuiu.btonecajqb(th2, "<this>");
        zdlpuopuiu.btonecajqb(errorId, "errorId");
        if (th2 instanceof SSLHandshakeException) {
            return wkgbmnqykc.zoijcleaow.ppxfxbqfkf(wkgbmnqykc.f108487zoijcleaow, q30.zoijcleaow.error_certificate, null, null, wkgbmnqykc.gxszxtbevo.Fatal, 6, null);
        }
        if ((th2 instanceof SocketTimeoutException) || (th2 instanceof UnknownHostException) || (th2 instanceof ConnectException) || (th2 instanceof RequestException) || (th2 instanceof SerializationException)) {
            return wkgbmnqykc.zoijcleaow.ppxfxbqfkf(wkgbmnqykc.f108487zoijcleaow, q30.zoijcleaow.something_went_try_again, errorId, null, wkgbmnqykc.gxszxtbevo.NonFatal, 4, null);
        }
        if (th2 instanceof NoCityFoundException) {
            return wkgbmnqykc.zoijcleaow.ppxfxbqfkf(wkgbmnqykc.f108487zoijcleaow, q30.zoijcleaow.error_geolocation, errorId, null, wkgbmnqykc.gxszxtbevo.NonFatal, 4, null);
        }
        if (th2 instanceof HttpException) {
            return zoijcleaow((HttpException) th2, errorId);
        }
        if (!(th2 instanceof ProductDailyLimitException) && !(th2 instanceof DeliveryIntervalNotValidException) && !(th2 instanceof AvailableOnlyForPickupException) && !(th2 instanceof DomainException)) {
            return wkgbmnqykc.zoijcleaow.ppxfxbqfkf(wkgbmnqykc.f108487zoijcleaow, q30.zoijcleaow.error_unknown_client, errorId, null, wkgbmnqykc.gxszxtbevo.NonFatal, 4, null);
        }
        String message = th2.getMessage();
        return message != null ? wkgbmnqykc.zoijcleaow.wkgbmnqykc(wkgbmnqykc.f108487zoijcleaow, message, null, null, wkgbmnqykc.gxszxtbevo.NonFatal, 6, null) : wkgbmnqykc.zoijcleaow.ppxfxbqfkf(wkgbmnqykc.f108487zoijcleaow, q30.zoijcleaow.something_went_try_again, errorId, null, wkgbmnqykc.gxszxtbevo.NonFatal, 4, null);
    }

    private static final wkgbmnqykc zoijcleaow(HttpException httpException, String str) {
        int iIobyxmoadg = httpException.iobyxmoadg();
        if (iIobyxmoadg == 403) {
            return wkgbmnqykc.zoijcleaow.ppxfxbqfkf(wkgbmnqykc.f108487zoijcleaow, q30.zoijcleaow.need_disable_vpn, null, new wkgbmnqykc.nufgyqmvbu.iobyxmoadg(q30.zoijcleaow.is_vpn_enabled), wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
        }
        switch (iIobyxmoadg) {
            case 500:
            case 501:
            case 502:
            case OkHttpErrorHandlerImpl.HTTP_UNAVAILABLE /* 503 */:
            case 504:
                return wkgbmnqykc.f108487zoijcleaow.iobyxmoadg(q30.zoijcleaow.working_on_it, str, new wkgbmnqykc.nufgyqmvbu.iobyxmoadg(q30.zoijcleaow.server_not_available), wkgbmnqykc.gxszxtbevo.NonFatal);
            default:
                return wkgbmnqykc.zoijcleaow.ppxfxbqfkf(wkgbmnqykc.f108487zoijcleaow, q30.zoijcleaow.error_unknown_network, str, null, wkgbmnqykc.gxszxtbevo.NonFatal, 4, null);
        }
    }
}
