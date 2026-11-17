package modern.payments.ecomAndroid.util.analytics;

import gg.kcexrzcfyt;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;
import modern.payments.p003ecomandroid.BuildConfig;
import modern.payments.tracker.ITracker;
import rb2.iobyxmoadg;
import rb2.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/util/analytics/EcomClickStreamUtil;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Lrb2/zoijcleaow;", "clickstreamLite", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "Lmodern/payments/tracker/ITracker;", "tracker", "<init>", "(Lrb2/zoijcleaow;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;Lmodern/payments/tracker/ITracker;)V", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$MetricEvent;", "analyticMetric", "Lgg/wwaezpbzkn;", "report", "(Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$MetricEvent;)V", "Lrb2/zoijcleaow;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "Lmodern/payments/tracker/ITracker;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomClickStreamUtil implements EcomMetricUtil {
    private final AppDataRepository appDataRepository;
    private final zoijcleaow clickstreamLite;
    private final EcomSdkOptionsRepository optionsRepository;
    private final ITracker tracker;

    public EcomClickStreamUtil(zoijcleaow clickstreamLite, EcomSdkOptionsRepository optionsRepository, AppDataRepository appDataRepository, ITracker tracker) {
        zdlpuopuiu.btonecajqb(clickstreamLite, "clickstreamLite");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        this.clickstreamLite = clickstreamLite;
        this.optionsRepository = optionsRepository;
        this.appDataRepository = appDataRepository;
        this.tracker = tracker;
    }

    @Override // modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil
    public void initializeWithConfig(dc2.zoijcleaow zoijcleaowVar) {
        EcomMetricUtil.DefaultImpls.initializeWithConfig(this, zoijcleaowVar);
    }

    @Override // modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil
    public void report(EcomMetricUtil.MetricEvent analyticMetric) {
        Object objWkgbmnqykc;
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
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            zoijcleaow zoijcleaowVar = this.clickstreamLite;
            iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(analyticMetric.getActionValueSmart(), iobyxmoadg.zoijcleaow.BUSINESS, null, null, 12, null);
            iobyxmoadgVar2.iobyxmoadg(linkedHashMap);
            zoijcleaowVar.iobyxmoadg(iobyxmoadgVar2);
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            FeatureExtensionsKt.track(this.tracker, this.optionsRepository, "Exception while sending inner analytics", thDxjokdxxww, ITracker.Priority.INFO, "METRIC SENT");
        }
    }
}
