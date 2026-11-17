package modern.payments.ecomAndroid.util.headersHandler;

import kotlin.Metadata;
import lk.cdpycssgdh;
import lk.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lmodern/payments/ecomAndroid/util/headersHandler/HttpHeadersHandler;", "", "Llk/zynmafqrjb;", "request", "addHeaders", "(Llk/zynmafqrjb;)Llk/zynmafqrjb;", "Llk/cdpycssgdh;", "response", "Lgg/wwaezpbzkn;", "processHeadersData", "(Llk/cdpycssgdh;)V", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface HttpHeadersHandler {
    public static final String ACCEPT_LANGUAGE = "Accept-Language";
    public static final String APP_NAME = "appName";
    public static final String AUTHORIZATION = "Authorization";
    public static final String B3_SPAN_ID = "x-b3-spanid";
    public static final String B3_TRACE_ID = "x-b3-traceid";
    public static final String COOKIE = "Cookie";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String DEVICE_NAME = "deviceName";
    public static final String IP_ADDRESS = "X-Net-Add-Sour";
    public static final String LOCAL_SESSION_ID = "localSessionId";
    public static final String ORDER_NUMBER = "orderNumber";
    public static final String OS = "OS";
    public static final String RQ_UID = "RqUID";
    public static final String SDK_VERSION = "sdkVersion";
    public static final String USER_TM = "UserTm";
    public static final String X_SYSTEM_ID = "X-System-Id";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/util/headersHandler/HttpHeadersHandler$Companion;", "", "()V", "ACCEPT_LANGUAGE", "", "APP_NAME", "AUTHORIZATION", "B3_SPAN_ID", "B3_TRACE_ID", "COOKIE", "DEVICE_NAME", "IP_ADDRESS", "LOCAL_SESSION_ID", "ORDER_NUMBER", "OS", "RQ_UID", "SDK_VERSION", "USER_TM", "X_SYSTEM_ID", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ACCEPT_LANGUAGE = "Accept-Language";
        public static final String APP_NAME = "appName";
        public static final String AUTHORIZATION = "Authorization";
        public static final String B3_SPAN_ID = "x-b3-spanid";
        public static final String B3_TRACE_ID = "x-b3-traceid";
        public static final String COOKIE = "Cookie";
        public static final String DEVICE_NAME = "deviceName";
        public static final String IP_ADDRESS = "X-Net-Add-Sour";
        public static final String LOCAL_SESSION_ID = "localSessionId";
        public static final String ORDER_NUMBER = "orderNumber";
        public static final String OS = "OS";
        public static final String RQ_UID = "RqUID";
        public static final String SDK_VERSION = "sdkVersion";
        public static final String USER_TM = "UserTm";
        public static final String X_SYSTEM_ID = "X-System-Id";

        private Companion() {
        }
    }

    zynmafqrjb addHeaders(zynmafqrjb request);

    void processHeadersData(cdpycssgdh response);
}
