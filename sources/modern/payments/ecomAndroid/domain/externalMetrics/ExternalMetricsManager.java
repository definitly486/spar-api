package modern.payments.ecomAndroid.domain.externalMetrics;

import java.util.Map;
import kotlin.Metadata;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/domain/externalMetrics/ExternalMetricsManager;", "", "Lgg/wwaezpbzkn;", "startCollectingMetrics", "()V", "", "actionName", "", ExternalMetricsManagerImpl.VALUES, "writeDownMetric", "(Ljava/lang/String;Ljava/util/Map;)V", "getJsonMetricsResult", "()Ljava/lang/String;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ExternalMetricsManager {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void writeDownMetric$default(ExternalMetricsManager externalMetricsManager, String str, Map map, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeDownMetric");
            }
            if ((i13 & 2) != 0) {
                map = null;
            }
            externalMetricsManager.writeDownMetric(str, map);
        }
    }

    String getJsonMetricsResult();

    void startCollectingMetrics();

    void writeDownMetric(String actionName, Map<String, String> values);
}
