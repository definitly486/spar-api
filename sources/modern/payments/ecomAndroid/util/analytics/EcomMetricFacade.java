package modern.payments.ecomAndroid.util.analytics;

import android.content.Context;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.model.feature.EcomFeatureParam;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.AppNameUtil;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.tracker.ITracker;
import rb2.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lmodern/payments/ecomAndroid/util/analytics/EcomMetricFacade;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Landroid/content/Context;", "context", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "Lmodern/payments/ecomAndroid/util/AppNameUtil;", "appNameUtil", "Lmodern/payments/tracker/ITracker;", "tracker", "<init>", "(Landroid/content/Context;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;Lmodern/payments/ecomAndroid/util/AppNameUtil;Lmodern/payments/tracker/ITracker;)V", "Lgg/wwaezpbzkn;", "initializeLoggingUtil", "()V", "Ldc2/zoijcleaow;", "networkClientBuilder", "initializeClickStream", "(Ldc2/zoijcleaow;)V", "pushQueuedMetricEvents", "initializeWithConfig", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$MetricEvent;", "analyticMetric", "report", "(Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$MetricEvent;)V", "Landroid/content/Context;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "Lmodern/payments/ecomAndroid/util/AppNameUtil;", "Lmodern/payments/tracker/ITracker;", "Ljava/util/Deque;", "eventsQueue", "Ljava/util/Deque;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomMetricFacade implements EcomMetricUtil {

    @Deprecated
    public static final String TAG = "MetricFacade";
    private static zoijcleaow clickStreamLite;
    private static boolean isInitialized;
    private final AppDataRepository appDataRepository;
    private final AppNameUtil appNameUtil;
    private final Context context;
    private final Deque<EcomMetricUtil.MetricEvent> eventsQueue;
    private final EcomSdkOptionsRepository optionsRepository;
    private final ITracker tracker;
    private static final Companion Companion = new Companion(null);
    private static final Set<EcomMetricUtil> ecomMetricUtils = new LinkedHashSet();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmodern/payments/ecomAndroid/util/analytics/EcomMetricFacade$Companion;", "", "<init>", "()V", "", "isInitialized", "Z", "()Z", "setInitialized", "(Z)V", "Lrb2/zoijcleaow;", "clickStreamLite", "Lrb2/zoijcleaow;", "getClickStreamLite", "()Lrb2/zoijcleaow;", "setClickStreamLite", "(Lrb2/zoijcleaow;)V", "", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "ecomMetricUtils", "Ljava/util/Set;", "getEcomMetricUtils", "()Ljava/util/Set;", "", "TAG", "Ljava/lang/String;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final zoijcleaow getClickStreamLite() {
            return EcomMetricFacade.clickStreamLite;
        }

        public final Set<EcomMetricUtil> getEcomMetricUtils() {
            return EcomMetricFacade.ecomMetricUtils;
        }

        public final boolean isInitialized() {
            return EcomMetricFacade.isInitialized;
        }

        public final void setClickStreamLite(zoijcleaow zoijcleaowVar) {
            EcomMetricFacade.clickStreamLite = zoijcleaowVar;
        }

        public final void setInitialized(boolean z13) {
            EcomMetricFacade.isInitialized = z13;
        }

        private Companion() {
        }
    }

    public EcomMetricFacade(Context context, EcomSdkOptionsRepository optionsRepository, AppDataRepository appDataRepository, AppNameUtil appNameUtil, ITracker tracker) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        zdlpuopuiu.btonecajqb(appNameUtil, "appNameUtil");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        this.context = context;
        this.optionsRepository = optionsRepository;
        this.appDataRepository = appDataRepository;
        this.appNameUtil = appNameUtil;
        this.tracker = tracker;
        this.eventsQueue = new LinkedList();
    }

    private final void initializeClickStream(dc2.zoijcleaow networkClientBuilder) {
        if (this.optionsRepository.isFeatureEnabledBy(Constants.FeatureName.CLICKSTREAM_METRICS, EcomFeatureParam.ENABLED_BY_SYSTEM)) {
            EcomSdkOptionsRepository ecomSdkOptionsRepository = this.optionsRepository;
            Constants.EcomService ecomService = Constants.EcomService.SERVICE_CLICKSTREAM;
            zoijcleaow zoijcleaowVarIobyxmoadg = new zoijcleaow.iobyxmoadg(ecomSdkOptionsRepository.getEcomSdkCfgSchemaParam(ecomService, Constants.EcomServiceParam.APP_ID), this.optionsRepository.getEcomSdkCfgSchemaParam(ecomService, Constants.EcomServiceParam.URI), this.context).zoijcleaow(networkClientBuilder).iobyxmoadg();
            String appNameFromPackageName = this.appNameUtil.getAppNameFromPackageName(this.optionsRepository.getEcomSdkMerchantOptions().getAppPackageName());
            if (appNameFromPackageName == null) {
                appNameFromPackageName = "";
            }
            zoijcleaowVarIobyxmoadg.zoijcleaow(appNameFromPackageName);
            clickStreamLite = zoijcleaowVarIobyxmoadg;
            ecomMetricUtils.add(new EcomClickStreamUtil(zoijcleaowVarIobyxmoadg, this.optionsRepository, this.appDataRepository, this.tracker));
        }
    }

    private final void initializeLoggingUtil() {
    }

    private final void pushQueuedMetricEvents() {
        if (this.eventsQueue.isEmpty()) {
            return;
        }
        while (!this.eventsQueue.isEmpty()) {
            EcomMetricUtil.MetricEvent metricEventPop = this.eventsQueue.pop();
            for (EcomMetricUtil ecomMetricUtil : ecomMetricUtils) {
                zdlpuopuiu.lqeggnwhkg(metricEventPop);
                ecomMetricUtil.report(metricEventPop);
            }
        }
    }

    @Override // modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil
    public void initializeWithConfig(dc2.zoijcleaow networkClientBuilder) {
        Object objWkgbmnqykc;
        zdlpuopuiu.btonecajqb(networkClientBuilder, "networkClientBuilder");
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            initializeClickStream(networkClientBuilder);
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            FeatureExtensionsKt.track(this.tracker, this.optionsRepository, "Exception while sending inner analytics", thDxjokdxxww, ITracker.Priority.INFO, "METRIC SENT");
        }
        initializeLoggingUtil();
        isInitialized = !ecomMetricUtils.isEmpty();
        pushQueuedMetricEvents();
    }

    @Override // modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil
    public void report(EcomMetricUtil.MetricEvent analyticMetric) {
        zdlpuopuiu.btonecajqb(analyticMetric, "analyticMetric");
        if (!isInitialized) {
            this.eventsQueue.add(analyticMetric);
            return;
        }
        Iterator<T> it = ecomMetricUtils.iterator();
        while (it.hasNext()) {
            ((EcomMetricUtil) it.next()).report(analyticMetric);
        }
    }
}
