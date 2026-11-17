package modern.payments.ecomAndroid.util.analytics;

import io.appmetrica.analytics.impl.Vk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/util/analytics/EcomMetricKey;", "", "()V", "ACTION_PARAMS", "", "ACTION_TYPE", "ERROR_CODE", "HTTP_CODE", "LOCAL_SESSION_ID", "MERCHANT_LOGIN", "METRICS_SENT_LOG_TAG", "ORDER_NUMBER", "PARSING_ERROR", "SDK_VERSION", Vk.f46689f, "VIEW", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomMetricKey {
    public static final String ACTION_PARAMS = "ActionParams";
    public static final String ACTION_TYPE = "Event";
    public static final String ERROR_CODE = "ErrorCode";
    public static final String HTTP_CODE = "HttpCode";
    public static final EcomMetricKey INSTANCE = new EcomMetricKey();
    public static final String LOCAL_SESSION_ID = "LocalSessionId";
    public static final String MERCHANT_LOGIN = "MerchLogin";
    public static final String METRICS_SENT_LOG_TAG = "METRIC SENT";
    public static final String ORDER_NUMBER = "OrderNumber";
    public static final String PARSING_ERROR = "ParsingError";
    public static final String SDK_VERSION = "SDKVersion";
    public static final String SESSION_ID = "SessionId";
    public static final String VIEW = "View";

    private EcomMetricKey() {
    }
}
