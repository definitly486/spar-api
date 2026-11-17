package modern.payments.ecomAndroid.domain.repository;

import kotlin.Metadata;
import lg.gxszxtbevo;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.domain.model.response.EcomSbpConfig;
import modern.payments.ecomAndroid.domain.model.response.EcomSdkConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0005J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;", "", "Lmodern/payments/ecomAndroid/data/api/ContentResponse;", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "getConfig", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig;", "getSbpConfig", "", "serviceUrl", "getIpAddress", "(Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface UnsafeEcomApiRepository {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getIpAddress$default(UnsafeEcomApiRepository unsafeEcomApiRepository, String str, gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIpAddress");
            }
            if ((i13 & 1) != 0) {
                str = Constants.GET_IP_DEFAULT_URL;
            }
            return unsafeEcomApiRepository.getIpAddress(str, gxszxtbevoVar);
        }
    }

    Object getConfig(gxszxtbevo<? super ContentResponse<EcomSdkConfig>> gxszxtbevoVar);

    Object getIpAddress(String str, gxszxtbevo<? super ContentResponse<String>> gxszxtbevoVar);

    Object getSbpConfig(gxszxtbevo<? super ContentResponse<EcomSbpConfig>> gxszxtbevoVar);
}
