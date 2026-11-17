package x11;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.SerializationException;
import lr0.eablkybsjg;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;
import retrofit2.HttpException;
import ru.myspar.proloyalty.core.error_handler.exceptions.DeliveryIntervalNotValidException;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainWithButtonException;
import ru.myspar.proloyalty.core.error_handler.exceptions.NoCityFoundException;
import ru.myspar.proloyalty.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.proloyalty.core.error_handler.exceptions.RequestException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final eablkybsjg iobyxmoadg(Throwable th2, String errorId) {
        zdlpuopuiu.btonecajqb(th2, "<this>");
        zdlpuopuiu.btonecajqb(errorId, "errorId");
        if (th2 instanceof SSLHandshakeException) {
            return eablkybsjg.zoijcleaow.ppxfxbqfkf(eablkybsjg.f63889zoijcleaow, w11.zoijcleaow.proloyalty_error_certificate, null, null, eablkybsjg.gxszxtbevo.Fatal, 6, null);
        }
        if ((th2 instanceof SocketTimeoutException) || (th2 instanceof UnknownHostException) || (th2 instanceof ConnectException) || (th2 instanceof RequestException) || (th2 instanceof SerializationException)) {
            return eablkybsjg.zoijcleaow.ppxfxbqfkf(eablkybsjg.f63889zoijcleaow, w11.zoijcleaow.proloyalty_something_went_try_again, errorId, null, eablkybsjg.gxszxtbevo.NonFatal, 4, null);
        }
        if (th2 instanceof NoCityFoundException) {
            return eablkybsjg.zoijcleaow.ppxfxbqfkf(eablkybsjg.f63889zoijcleaow, w11.zoijcleaow.proloyalty_error_geolocation, errorId, null, eablkybsjg.gxszxtbevo.NonFatal, 4, null);
        }
        if (th2 instanceof HttpException) {
            return zoijcleaow((HttpException) th2, errorId);
        }
        if (th2 instanceof DomainWithButtonException) {
            DomainWithButtonException domainWithButtonException = (DomainWithButtonException) th2;
            return eablkybsjg.f63889zoijcleaow.btonecajqb(domainWithButtonException.getMessage(), domainWithButtonException.getButtonContent().iobyxmoadg(), domainWithButtonException.getButtonContent().wkgbmnqykc(), domainWithButtonException.getButtonContent().zoijcleaow(), domainWithButtonException.getButtonContent().ppxfxbqfkf());
        }
        if (!(th2 instanceof ProductDailyLimitException) && !(th2 instanceof DeliveryIntervalNotValidException) && !(th2 instanceof DomainException)) {
            return eablkybsjg.zoijcleaow.ppxfxbqfkf(eablkybsjg.f63889zoijcleaow, w11.zoijcleaow.proloyalty_error_unknown_client, errorId, null, eablkybsjg.gxszxtbevo.NonFatal, 4, null);
        }
        String message = th2.getMessage();
        return message != null ? eablkybsjg.zoijcleaow.wkgbmnqykc(eablkybsjg.f63889zoijcleaow, message, null, null, eablkybsjg.gxszxtbevo.NonFatal, 6, null) : eablkybsjg.zoijcleaow.ppxfxbqfkf(eablkybsjg.f63889zoijcleaow, w11.zoijcleaow.proloyalty_something_went_try_again, errorId, null, eablkybsjg.gxszxtbevo.NonFatal, 4, null);
    }

    private static final eablkybsjg zoijcleaow(HttpException httpException, String str) {
        int iIobyxmoadg = httpException.iobyxmoadg();
        if (iIobyxmoadg == 403) {
            return eablkybsjg.zoijcleaow.ppxfxbqfkf(eablkybsjg.f63889zoijcleaow, w11.zoijcleaow.proloyalty_need_disable_vpn, null, new eablkybsjg.nufgyqmvbu.iobyxmoadg(w11.zoijcleaow.proloyalty_is_vpn_enabled), eablkybsjg.gxszxtbevo.NonFatal, 2, null);
        }
        switch (iIobyxmoadg) {
            case 500:
            case 501:
            case 502:
            case OkHttpErrorHandlerImpl.HTTP_UNAVAILABLE /* 503 */:
            case 504:
                return eablkybsjg.f63889zoijcleaow.iobyxmoadg(w11.zoijcleaow.proloyalty_working_on_it, str, new eablkybsjg.nufgyqmvbu.iobyxmoadg(w11.zoijcleaow.proloyalty_server_not_available), eablkybsjg.gxszxtbevo.NonFatal);
            default:
                return eablkybsjg.zoijcleaow.ppxfxbqfkf(eablkybsjg.f63889zoijcleaow, w11.zoijcleaow.proloyalty_error_unknown_network, str, null, eablkybsjg.gxszxtbevo.NonFatal, 4, null);
        }
    }
}
