package modern.payments.ecomAndroid.domain.repository;

import kotlin.Metadata;
import lg.gxszxtbevo;
import modern.payments.ecomAndroid.data.api.ContentResponse;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/domain/repository/ThreeDSecureRepository;", "", "", "getSdkAppId", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/api/ContentResponse;", "getIPAddress", "address", "Lgg/wwaezpbzkn;", "saveIpAddress", "(Ljava/lang/String;)V", "getSdkReferenceNumber", "()Ljava/lang/String;", "getTransId", "getMaxTimeout", "getEphemPubKey", "key", "saveEphemPubKey", "getBrowserUserAgent", "getBrowserIPAddress", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ThreeDSecureRepository {
    String getBrowserIPAddress();

    String getBrowserUserAgent();

    String getEphemPubKey();

    Object getIPAddress(gxszxtbevo<? super ContentResponse<String>> gxszxtbevoVar);

    String getMaxTimeout();

    Object getSdkAppId(gxszxtbevo<? super String> gxszxtbevoVar);

    String getSdkReferenceNumber();

    String getTransId();

    void saveEphemPubKey(String key);

    void saveIpAddress(String address);
}
