package modern.payments.ecomAndroid.util.analytics;

import android.util.Log;
import dc2.zoijcleaow;
import gg.vdvldrhtss;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;
import modern.payments.p003ecomandroid.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmodern/payments/ecomAndroid/util/analytics/EcomLoggingUtil;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;)V", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$MetricEvent;", "analyticMetric", "Lgg/wwaezpbzkn;", "report", "(Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$MetricEvent;)V", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomLoggingUtil implements EcomMetricUtil {
    private final AppDataRepository appDataRepository;
    private final EcomSdkOptionsRepository optionsRepository;

    public EcomLoggingUtil(EcomSdkOptionsRepository optionsRepository, AppDataRepository appDataRepository) {
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        this.optionsRepository = optionsRepository;
        this.appDataRepository = appDataRepository;
    }

    @Override // modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil
    public void initializeWithConfig(zoijcleaow zoijcleaowVar) {
        EcomMetricUtil.DefaultImpls.initializeWithConfig(this, zoijcleaowVar);
    }

    @Override // modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil
    public void report(EcomMetricUtil.MetricEvent analyticMetric) {
        zdlpuopuiu.btonecajqb(analyticMetric, "analyticMetric");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EcomMetricKey.ORDER_NUMBER, this.optionsRepository.getEcomSdkMerchantOptions().getOrderNumber());
        linkedHashMap.put(EcomMetricKey.MERCHANT_LOGIN, this.optionsRepository.getEcomSdkMerchantOptions().getMerchantLogin());
        linkedHashMap.put(EcomMetricKey.VIEW, analyticMetric.getView().getValue());
        linkedHashMap.put(EcomMetricKey.ACTION_TYPE, analyticMetric.getActionType().getValue());
        Integer httpCode = analyticMetric.getHttpCode();
        if (httpCode != null) {
            linkedHashMap.put(EcomMetricKey.HTTP_CODE, String.valueOf(httpCode.intValue()));
        }
        String errorCode = analyticMetric.getErrorCode();
        if (errorCode != null) {
            linkedHashMap.put(EcomMetricKey.ERROR_CODE, errorCode);
        }
        String parsingError = analyticMetric.getParsingError();
        if (parsingError != null) {
            linkedHashMap.put(EcomMetricKey.PARSING_ERROR, parsingError);
        }
        linkedHashMap.put(EcomMetricKey.SDK_VERSION, BuildConfig.VERSION_NAME);
        Map<String, String> actionParams = analyticMetric.getActionParams();
        String str = "";
        if (actionParams != null) {
            for (Map.Entry<String, String> entry : actionParams.entrySet()) {
                str = str + new vdvldrhtss(entry.getKey(), entry.getValue()) + "; ";
            }
        }
        String valueOrNull = StringExtensionsKt.getValueOrNull(str);
        if (valueOrNull != null) {
            linkedHashMap.put(EcomMetricKey.ACTION_PARAMS, valueOrNull);
        }
        String sessionId = this.appDataRepository.getSessionId();
        if (sessionId != null) {
            linkedHashMap.put(EcomMetricKey.SESSION_ID, sessionId);
        }
        String ifNotUnavailableOrNull = StringExtensionsKt.getIfNotUnavailableOrNull((String) this.appDataRepository.getLocalSessionId().getValue());
        if (ifNotUnavailableOrNull != null) {
            linkedHashMap.put(EcomMetricKey.LOCAL_SESSION_ID, ifNotUnavailableOrNull);
        }
        Log.i("METRIC SENT", "action : " + analyticMetric.getActionValueSmart() + ", " + linkedHashMap);
    }
}
