package modern.payments.ecomAndroid.data.common;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import modern.payments.ecomAndroid.data.repository.ThreeDSecureRepositoryImpl;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/data/common/Constants;", "", "()V", "DEFAULT_APP_NAME", "", "EMPTY_STRING", "GET_IP_DEFAULT_URL", "OTP_CODE_LENGTH", "", "READ_EXCEPTION_BODY_TAG", "READ_TIMEOUT", "", "REQUEST_TAG", "REQUEST_TO", "RESPONSE_FROM", "RESPONSE_TAG", "STRING_UNAVAILABLE", "DeviceCategory", "EcomService", "EcomServiceParam", "FeatureName", "ThreeDSecureJsonParams", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Constants {
    public static final String DEFAULT_APP_NAME = "EcomSdkApp";
    public static final String EMPTY_STRING = "";
    public static final String GET_IP_DEFAULT_URL = "https://safepayonline.ru/sdk-api/getIp";
    public static final Constants INSTANCE = new Constants();
    public static final int OTP_CODE_LENGTH = 5;
    public static final String READ_EXCEPTION_BODY_TAG = "READ BODY EXCEPTION";
    public static final long READ_TIMEOUT = 20000;
    public static final String REQUEST_TAG = "REQUEST";
    public static final String REQUEST_TO = "REQUEST TO";
    public static final String RESPONSE_FROM = "RESPONSE FROM";
    public static final String RESPONSE_TAG = "RESPONSE";
    public static final String STRING_UNAVAILABLE = "-1";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lmodern/payments/ecomAndroid/data/common/Constants$DeviceCategory;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "BRW", "APP", "THREE_RI", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum DeviceCategory {
        BRW(CommonUrlParts.Values.FALSE_INTEGER),
        APP("1"),
        THREE_RI("2");

        private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
        private final String code;

        DeviceCategory(String str) {
            this.code = str;
        }

        public static iobyxmoadg getEntries() {
            return $ENTRIES;
        }

        public final String getCode() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/data/common/Constants$EcomService;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "SERVICE_CLICKSTREAM", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum EcomService {
        SERVICE_CLICKSTREAM("CLICKSTREAM");

        private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
        private final String key;

        EcomService(String str) {
            this.key = str;
        }

        public static iobyxmoadg getEntries() {
            return $ENTRIES;
        }

        public final String getKey() {
            return this.key;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lmodern/payments/ecomAndroid/data/common/Constants$EcomServiceParam;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "URI", "APP_ID", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum EcomServiceParam {
        URI("URI"),
        APP_ID("APP_ID");

        private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
        private final String key;

        EcomServiceParam(String str) {
            this.key = str;
        }

        public static iobyxmoadg getEntries() {
            return $ENTRIES;
        }

        public final String getKey() {
            return this.key;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/data/common/Constants$FeatureName;", "", "featureName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getFeatureName", "()Ljava/lang/String;", "SPAY", "RESULT_VIEW", "ENABLE_LOGGING", "REFRESH_TOKEN", "RETRIES", "SSL", "SHOW_SAVE_BINDING", "SBP", "BINDING", "NEW_CARD", "CLICKSTREAM_METRICS", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum FeatureName {
        SPAY("spay"),
        RESULT_VIEW("resultView"),
        ENABLE_LOGGING("enableLogging"),
        REFRESH_TOKEN("refreshToken"),
        RETRIES("retries"),
        SSL("ssl"),
        SHOW_SAVE_BINDING("showSaveBinding"),
        SBP("sbp"),
        BINDING("payWithBinding"),
        NEW_CARD("payByNewCard"),
        CLICKSTREAM_METRICS("clickStream");

        private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
        private final String featureName;

        FeatureName(String str) {
            this.featureName = str;
        }

        public static iobyxmoadg getEntries() {
            return $ENTRIES;
        }

        public final String getFeatureName() {
            return this.featureName;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/data/common/Constants$ThreeDSecureJsonParams;", "", "fieldName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "IP", "DEVICE_CATEGORY", ThreeDSecureRepositoryImpl.SDK_APP_ID, "SDK_REFERENCE_NUMBER", "SDK_TRANS_ID", "SDK_MAX_TIMEOUT", "SDK_ENC_DATA", "SDK_EPHEM_PUB_KEY", "DEVICE_RENDER_OPTIONS", "BROWSER_JAVA_ENABLED", "BROWSER_USER_AGENT", "BROWSER_IP", "CHALLENGE_WINDOW_SIZE", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum ThreeDSecureJsonParams {
        IP("ip"),
        DEVICE_CATEGORY("deviceCategory"),
        SDK_APP_ID("sdkAppID"),
        SDK_REFERENCE_NUMBER("sdkReferenceNumber"),
        SDK_TRANS_ID("sdkTransID"),
        SDK_MAX_TIMEOUT("sdkMaxTimeout"),
        SDK_ENC_DATA("sdkEncData"),
        SDK_EPHEM_PUB_KEY("sdkEphemPubKey"),
        DEVICE_RENDER_OPTIONS("deviceRenderOptions"),
        BROWSER_JAVA_ENABLED("browserJavaScriptEnabled"),
        BROWSER_USER_AGENT("browserUserAgent"),
        BROWSER_IP("browserIP"),
        CHALLENGE_WINDOW_SIZE("challengeWindowSize");

        private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
        private final String fieldName;

        ThreeDSecureJsonParams(String str) {
            this.fieldName = str;
        }

        public static iobyxmoadg getEntries() {
            return $ENTRIES;
        }

        public final String getFieldName() {
            return this.fieldName;
        }
    }

    private Constants() {
    }
}
