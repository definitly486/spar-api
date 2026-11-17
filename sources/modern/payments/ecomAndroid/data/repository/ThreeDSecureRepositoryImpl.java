package modern.payments.ecomAndroid.data.repository;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lm.kcexrzcfyt;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.api.UnsafeCallEcomApi;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.domain.repository.BaseNetworkRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository;
import modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.ecomAndroid.util.extension.ResponseExtensionKt;
import modern.payments.ecomAndroid.util.networkErrorHandler.NetworkErrorHandler;
import modern.payments.tracker.ITracker;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010 J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010\u001eJ\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010 J\u000f\u0010'\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/¨\u00064"}, d2 = {"Lmodern/payments/ecomAndroid/data/repository/ThreeDSecureRepositoryImpl;", "Lmodern/payments/ecomAndroid/domain/repository/BaseNetworkRepository;", "Lmodern/payments/ecomAndroid/domain/repository/ThreeDSecureRepository;", "Lmodern/payments/ecomAndroid/domain/storage/CustomSharedPreferences;", "storage", "Lmodern/payments/ecomAndroid/data/api/UnsafeCallEcomApi;", "unsafeCallEcomApi", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "", "okHttpErrorHandlerImpl", "Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "apiErrorHandlerImpl", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "Landroid/content/Context;", "context", "<init>", "(Lmodern/payments/ecomAndroid/domain/storage/CustomSharedPreferences;Lmodern/payments/ecomAndroid/data/api/UnsafeCallEcomApi;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Landroid/content/Context;)V", "", "getSdkAppId", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/api/ContentResponse;", "getIPAddress", "address", "Lgg/wwaezpbzkn;", "saveIpAddress", "(Ljava/lang/String;)V", "getSdkReferenceNumber", "()Ljava/lang/String;", "getTransId", "getMaxTimeout", "getEphemPubKey", "key", "saveEphemPubKey", "getBrowserUserAgent", "getBrowserIPAddress", "Lmodern/payments/ecomAndroid/domain/storage/CustomSharedPreferences;", "Lmodern/payments/ecomAndroid/data/api/UnsafeCallEcomApi;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Landroid/content/Context;", "sdkAppId", "Ljava/lang/String;", "ipAddress", "maxTimeout", "ephemPubKey", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ThreeDSecureRepositoryImpl extends BaseNetworkRepository implements ThreeDSecureRepository {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String DEF_MAX_TIMEOUT = "5";

    @Deprecated
    public static final String SDK_APP_ID = "SDK_APP_ID";
    private final Context context;
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private String ephemPubKey;
    private String ipAddress;
    private String maxTimeout;
    private final NetworkErrorHandler<Throwable> okHttpErrorHandlerImpl;
    private String sdkAppId;
    private final CustomSharedPreferences storage;
    private final ITracker tracker;
    private final UnsafeCallEcomApi unsafeCallEcomApi;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lmodern/payments/ecomAndroid/data/repository/ThreeDSecureRepositoryImpl$Companion;", "", "()V", "DEF_MAX_TIMEOUT", "", ThreeDSecureRepositoryImpl.SDK_APP_ID, "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.ThreeDSecureRepositoryImpl$getIPAddress$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.ThreeDSecureRepositoryImpl", f = "ThreeDSecureRepositoryImpl.kt", l = {63}, m = "getIPAddress")
    static final class AnonymousClass1 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThreeDSecureRepositoryImpl.this.getIPAddress(this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.ThreeDSecureRepositoryImpl$getSdkAppId$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2 extends jyumaefscl implements iobyxmoadg {
        AnonymousClass2() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final String invoke() {
            SharedPreferences sharedPreferences = ThreeDSecureRepositoryImpl.this.storage.getSharedPreferences();
            String string = sharedPreferences != null ? sharedPreferences.getString(ThreeDSecureRepositoryImpl.SDK_APP_ID, null) : null;
            if (string != null) {
                return string;
            }
            ThreeDSecureRepositoryImpl.this.sdkAppId = UUID.randomUUID().toString();
            ThreeDSecureRepositoryImpl.this.storage.putData(ThreeDSecureRepositoryImpl.SDK_APP_ID, ThreeDSecureRepositoryImpl.this.sdkAppId);
            return ThreeDSecureRepositoryImpl.this.sdkAppId;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDSecureRepositoryImpl(CustomSharedPreferences storage, UnsafeCallEcomApi unsafeCallEcomApi, ITracker tracker, NetworkErrorHandler<Throwable> okHttpErrorHandlerImpl, NetworkErrorHandler<EcomApiError> apiErrorHandlerImpl, EcomMetricUtil ecomMetricUtil, EcomSdkOptionsRepository ecomSdkOptionsRepository, Context context) {
        super(okHttpErrorHandlerImpl, apiErrorHandlerImpl, tracker, ecomMetricUtil, ecomSdkOptionsRepository);
        zdlpuopuiu.btonecajqb(storage, "storage");
        zdlpuopuiu.btonecajqb(unsafeCallEcomApi, "unsafeCallEcomApi");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(okHttpErrorHandlerImpl, "okHttpErrorHandlerImpl");
        zdlpuopuiu.btonecajqb(apiErrorHandlerImpl, "apiErrorHandlerImpl");
        zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        zdlpuopuiu.btonecajqb(context, "context");
        this.storage = storage;
        this.unsafeCallEcomApi = unsafeCallEcomApi;
        this.tracker = tracker;
        this.okHttpErrorHandlerImpl = okHttpErrorHandlerImpl;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
        this.context = context;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository
    public String getBrowserIPAddress() {
        Object systemService = this.context.getSystemService("wifi");
        zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        try {
            WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
            String ipAddress = connectionInfo != null ? Formatter.formatIpAddress(connectionInfo.getIpAddress()) : null;
            return ipAddress == null ? "null" : ipAddress;
        } catch (Exception e13) {
            FeatureExtensionsKt.track$default(this.tracker, this.ecomSdkOptionsRepository, null, e13, ITracker.Priority.ERROR, null, 16, null);
            return "";
        }
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository
    public String getBrowserUserAgent() {
        String property = System.getProperty("http.agent");
        return property == null ? "" : property;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository
    public String getEphemPubKey() {
        String str = this.ephemPubKey;
        if (str != null) {
            return str;
        }
        throw new UninitializedPropertyAccessException("The public key has not yet been initialized");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:29:0x0061, B:31:0x0069, B:32:0x007b), top: B:38:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007b A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:29:0x0061, B:31:0x0069, B:32:0x007b), top: B:38:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository
    public Object getIPAddress(lg.gxszxtbevo<? super ContentResponse<String>> gxszxtbevoVar) {
        AnonymousClass1 anonymousClass1;
        ThreeDSecureRepositoryImpl threeDSecureRepositoryImpl;
        ThreeDSecureRepositoryImpl threeDSecureRepositoryImpl2;
        kcexrzcfyt kcexrzcfytVar;
        if (gxszxtbevoVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) gxszxtbevoVar;
            int i13 = anonymousClass1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i13 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
        }
        Object ip2 = anonymousClass1.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = anonymousClass1.label;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            threeDSecureRepositoryImpl2 = (ThreeDSecureRepositoryImpl) anonymousClass1.L$0;
            try {
                gg.zdlpuopuiu.zoijcleaow(ip2);
                kcexrzcfytVar = (kcexrzcfyt) ip2;
                if (ResponseExtensionKt.isContentSuccessful(kcexrzcfytVar)) {
                    return new ContentResponse.Failure(threeDSecureRepositoryImpl2.processErrorBody(kcexrzcfytVar, ResponseExtensionKt.readErrorBody(kcexrzcfytVar.eablkybsjg(), String.valueOf(kcexrzcfytVar.zoijcleaow()))));
                }
                String str = (String) kcexrzcfytVar.iobyxmoadg();
                threeDSecureRepositoryImpl2.ipAddress = str;
                return new ContentResponse.Success(String.valueOf(str));
            } catch (Exception e13) {
                e = e13;
                threeDSecureRepositoryImpl = threeDSecureRepositoryImpl2;
                FeatureExtensionsKt.track$default(threeDSecureRepositoryImpl.tracker, threeDSecureRepositoryImpl.ecomSdkOptionsRepository, null, e, ITracker.Priority.ERROR, null, 16, null);
                return new ContentResponse.Failure(threeDSecureRepositoryImpl.okHttpErrorHandlerImpl.getError(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(ip2);
        String str2 = this.ipAddress;
        if (str2 != null && str2.length() != 0) {
            String str3 = this.ipAddress;
            zdlpuopuiu.lqeggnwhkg(str3);
            return new ContentResponse.Success(str3);
        }
        try {
            UnsafeCallEcomApi unsafeCallEcomApi = this.unsafeCallEcomApi;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            ip2 = unsafeCallEcomApi.getIp(Constants.GET_IP_DEFAULT_URL, anonymousClass1);
            if (ip2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            threeDSecureRepositoryImpl2 = this;
            kcexrzcfytVar = (kcexrzcfyt) ip2;
            if (ResponseExtensionKt.isContentSuccessful(kcexrzcfytVar)) {
                return new ContentResponse.Failure(threeDSecureRepositoryImpl2.processErrorBody(kcexrzcfytVar, ResponseExtensionKt.readErrorBody(kcexrzcfytVar.eablkybsjg(), String.valueOf(kcexrzcfytVar.zoijcleaow()))));
            }
            String str4 = (String) kcexrzcfytVar.iobyxmoadg();
            threeDSecureRepositoryImpl2.ipAddress = str4;
            return new ContentResponse.Success(String.valueOf(str4));
        } catch (Exception e14) {
            e = e14;
            threeDSecureRepositoryImpl = this;
            FeatureExtensionsKt.track$default(threeDSecureRepositoryImpl.tracker, threeDSecureRepositoryImpl.ecomSdkOptionsRepository, null, e, ITracker.Priority.ERROR, null, 16, null);
            return new ContentResponse.Failure(threeDSecureRepositoryImpl.okHttpErrorHandlerImpl.getError(e));
        }
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository
    public String getMaxTimeout() {
        String str = this.maxTimeout;
        return str == null ? DEF_MAX_TIMEOUT : str;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository
    public Object getSdkAppId(lg.gxszxtbevo<? super String> gxszxtbevoVar) {
        String str = this.sdkAppId;
        return str == null ? new AnonymousClass2().toString() : str;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository
    public String getSdkReferenceNumber() {
        return "1.0";
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository
    public String getTransId() {
        String string = UUID.randomUUID().toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository
    public void saveEphemPubKey(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        this.ephemPubKey = key;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository
    public void saveIpAddress(String address) {
        this.ipAddress = address;
    }
}
