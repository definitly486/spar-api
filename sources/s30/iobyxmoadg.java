package s30;

import hg.jyumaefscl;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.SerializationException;
import retrofit2.HttpException;
import ru.myspar.core.error_handler.exceptions.AvailableOnlyForPickupException;
import ru.myspar.core.error_handler.exceptions.CreateSbpUrlException;
import ru.myspar.core.error_handler.exceptions.DeliveryIntervalNotValidException;
import ru.myspar.core.error_handler.exceptions.DomainException;
import ru.myspar.core.error_handler.exceptions.ExistingUserException;
import ru.myspar.core.error_handler.exceptions.FileSizeException;
import ru.myspar.core.error_handler.exceptions.IncorrectBitrixVersionException;
import ru.myspar.core.error_handler.exceptions.LocationDisabledException;
import ru.myspar.core.error_handler.exceptions.LocationException;
import ru.myspar.core.error_handler.exceptions.NoCityFoundException;
import ru.myspar.core.error_handler.exceptions.NoDeliveryAddressException;
import ru.myspar.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.core.error_handler.exceptions.RegPromoNotValidException;
import ru.myspar.core.error_handler.exceptions.RequestException;
import ru.myspar.core.error_handler.exceptions.SharePromoNotValidException;
import ru.myspar.core.error_handler.exceptions.SubscriptionNotFoundedException;
import ru.myspar.core.error_handler.exceptions.TechnicalWorkException;
import ru.myspar.core.error_handler.exceptions.UserAuthorizationException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final List iobyxmoadg(Throwable th2, String errorId) {
        zdlpuopuiu.btonecajqb(th2, "<this>");
        zdlpuopuiu.btonecajqb(errorId, "errorId");
        if (th2 instanceof TechnicalWorkException) {
            return jyumaefscl.eablkybsjg(new t30.iobyxmoadg.eablkybsjg(((TechnicalWorkException) th2).getMessage()));
        }
        if ((th2 instanceof SSLHandshakeException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof UnknownHostException) || (th2 instanceof ConnectException) || (th2 instanceof RequestException) || (th2 instanceof HttpException) || (th2 instanceof ExistingUserException) || (th2 instanceof FileSizeException) || (th2 instanceof NoDeliveryAddressException) || (th2 instanceof ProductDailyLimitException) || (th2 instanceof DeliveryIntervalNotValidException) || (th2 instanceof AvailableOnlyForPickupException)) {
            return jyumaefscl.eablkybsjg(new t30.iobyxmoadg.wkgbmnqykc(zoijcleaow.iobyxmoadg(th2, errorId)));
        }
        if ((th2 instanceof NoCityFoundException) || (th2 instanceof RegPromoNotValidException) || (th2 instanceof SharePromoNotValidException) || (th2 instanceof LocationDisabledException)) {
            return jyumaefscl.wflxmlrfwp();
        }
        if (th2 instanceof UserAuthorizationException) {
            return jyumaefscl.eablkybsjg(t30.iobyxmoadg.ppxfxbqfkf.f109590iobyxmoadg);
        }
        if ((th2 instanceof LocationException) || (th2 instanceof SubscriptionNotFoundedException) || (th2 instanceof r30.iobyxmoadg)) {
            return jyumaefscl.eablkybsjg(new t30.iobyxmoadg.zoijcleaow(th2));
        }
        if ((th2 instanceof CreateSbpUrlException) || (th2 instanceof SerializationException) || (th2 instanceof DomainException)) {
            return jyumaefscl.rgvfuqvkyq(new t30.iobyxmoadg.wkgbmnqykc(zoijcleaow.iobyxmoadg(th2, errorId)), new t30.iobyxmoadg.zoijcleaow(th2));
        }
        return th2 instanceof IncorrectBitrixVersionException ? jyumaefscl.eablkybsjg(t30.iobyxmoadg.C2691iobyxmoadg.f109589iobyxmoadg) : jyumaefscl.rgvfuqvkyq(new t30.iobyxmoadg.wkgbmnqykc(zoijcleaow.iobyxmoadg(th2, errorId)), new t30.iobyxmoadg.zoijcleaow(th2));
    }
}
