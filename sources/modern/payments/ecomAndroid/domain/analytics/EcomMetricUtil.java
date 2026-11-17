package modern.payments.ecomAndroid.domain.analytics;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dc2.zoijcleaow;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.analytics.metrics.Action;
import modern.payments.ecomAndroid.util.analytics.metrics.ActionType;
import modern.payments.ecomAndroid.util.analytics.metrics.StatusType;
import modern.payments.ecomAndroid.util.analytics.metrics.Views;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "", "Ldc2/zoijcleaow;", "networkClientBuilder", "Lgg/wwaezpbzkn;", "initializeWithConfig", "(Ldc2/zoijcleaow;)V", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$MetricEvent;", "analyticMetric", "report", "(Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$MetricEvent;)V", "Companion", "MetricEvent", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface EcomMetricUtil {
    public static final String CHALLENGE_STATE = "challengeState";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String DESCRIPTION = "Description";
    public static final String INFO = "Info";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$Companion;", "", "()V", "CHALLENGE_STATE", "", "DESCRIPTION", "INFO", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String CHALLENGE_STATE = "challengeState";
        public static final String DESCRIPTION = "Description";
        public static final String INFO = "Info";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void initializeWithConfig(EcomMetricUtil ecomMetricUtil, zoijcleaow networkClientBuilder) {
            zdlpuopuiu.btonecajqb(networkClientBuilder, "networkClientBuilder");
        }
    }

    void initializeWithConfig(zoijcleaow networkClientBuilder);

    void report(MetricEvent analyticMetric);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003Jt\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010/\u001a\u00020\fJ\t\u00100\u001a\u00020\u000eHÖ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$MetricEvent;", "", "action", "Lmodern/payments/ecomAndroid/util/analytics/metrics/Action;", "view", "Lmodern/payments/ecomAndroid/util/analytics/metrics/Views;", "actionType", "Lmodern/payments/ecomAndroid/util/analytics/metrics/ActionType;", "actionStatus", "Lmodern/payments/ecomAndroid/util/analytics/metrics/StatusType;", "actionParams", "", "", "httpCode", "", "errorCode", "parsingError", "(Lmodern/payments/ecomAndroid/util/analytics/metrics/Action;Lmodern/payments/ecomAndroid/util/analytics/metrics/Views;Lmodern/payments/ecomAndroid/util/analytics/metrics/ActionType;Lmodern/payments/ecomAndroid/util/analytics/metrics/StatusType;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Lmodern/payments/ecomAndroid/util/analytics/metrics/Action;", "getActionParams", "()Ljava/util/Map;", "getActionStatus", "()Lmodern/payments/ecomAndroid/util/analytics/metrics/StatusType;", "getActionType", "()Lmodern/payments/ecomAndroid/util/analytics/metrics/ActionType;", "getErrorCode", "()Ljava/lang/String;", "getHttpCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getParsingError", "getView", "()Lmodern/payments/ecomAndroid/util/analytics/metrics/Views;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lmodern/payments/ecomAndroid/util/analytics/metrics/Action;Lmodern/payments/ecomAndroid/util/analytics/metrics/Views;Lmodern/payments/ecomAndroid/util/analytics/metrics/ActionType;Lmodern/payments/ecomAndroid/util/analytics/metrics/StatusType;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$MetricEvent;", "equals", "", "other", "getActionValueSmart", "hashCode", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MetricEvent {
        private final Action action;
        private final Map<String, String> actionParams;
        private final StatusType actionStatus;
        private final ActionType actionType;
        private final String errorCode;
        private final Integer httpCode;
        private final String parsingError;
        private final Views view;

        public MetricEvent(Action action, Views view, ActionType actionType, StatusType statusType, Map<String, String> map, Integer num, String str, String str2) {
            zdlpuopuiu.btonecajqb(action, "action");
            zdlpuopuiu.btonecajqb(view, "view");
            zdlpuopuiu.btonecajqb(actionType, "actionType");
            this.action = action;
            this.view = view;
            this.actionType = actionType;
            this.actionStatus = statusType;
            this.actionParams = map;
            this.httpCode = num;
            this.errorCode = str;
            this.parsingError = str2;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Views getView() {
            return this.view;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ActionType getActionType() {
            return this.actionType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StatusType getActionStatus() {
            return this.actionStatus;
        }

        public final Map<String, String> component5() {
            return this.actionParams;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Integer getHttpCode() {
            return this.httpCode;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getParsingError() {
            return this.parsingError;
        }

        public final MetricEvent copy(Action action, Views view, ActionType actionType, StatusType actionStatus, Map<String, String> actionParams, Integer httpCode, String errorCode, String parsingError) {
            zdlpuopuiu.btonecajqb(action, "action");
            zdlpuopuiu.btonecajqb(view, "view");
            zdlpuopuiu.btonecajqb(actionType, "actionType");
            return new MetricEvent(action, view, actionType, actionStatus, actionParams, httpCode, errorCode, parsingError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MetricEvent)) {
                return false;
            }
            MetricEvent metricEvent = (MetricEvent) other;
            return zdlpuopuiu.eablkybsjg(this.action, metricEvent.action) && this.view == metricEvent.view && this.actionType == metricEvent.actionType && this.actionStatus == metricEvent.actionStatus && zdlpuopuiu.eablkybsjg(this.actionParams, metricEvent.actionParams) && zdlpuopuiu.eablkybsjg(this.httpCode, metricEvent.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, metricEvent.errorCode) && zdlpuopuiu.eablkybsjg(this.parsingError, metricEvent.parsingError);
        }

        public final Action getAction() {
            return this.action;
        }

        public final Map<String, String> getActionParams() {
            return this.actionParams;
        }

        public final StatusType getActionStatus() {
            return this.actionStatus;
        }

        public final ActionType getActionType() {
            return this.actionType;
        }

        public final String getActionValueSmart() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.actionType.getValue());
            StatusType statusType = this.actionStatus;
            String value = statusType != null ? statusType.getValue() : null;
            if (value == null) {
                value = "";
            }
            sb3.append(value);
            sb3.append(this.action.getValue());
            return sb3.toString();
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final Integer getHttpCode() {
            return this.httpCode;
        }

        public final String getParsingError() {
            return this.parsingError;
        }

        public final Views getView() {
            return this.view;
        }

        public int hashCode() {
            int iHashCode = ((((this.action.hashCode() * 31) + this.view.hashCode()) * 31) + this.actionType.hashCode()) * 31;
            StatusType statusType = this.actionStatus;
            int iHashCode2 = (iHashCode + (statusType == null ? 0 : statusType.hashCode())) * 31;
            Map<String, String> map = this.actionParams;
            int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Integer num = this.httpCode;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.errorCode;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.parsingError;
            return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "MetricEvent(action=" + this.action + ", view=" + this.view + ", actionType=" + this.actionType + ", actionStatus=" + this.actionStatus + ", actionParams=" + this.actionParams + ", httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", parsingError=" + this.parsingError + ')';
        }

        public /* synthetic */ MetricEvent(Action action, Views views, ActionType actionType, StatusType statusType, Map map, Integer num, String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
            this(action, (i13 & 2) != 0 ? Views.NONE : views, actionType, (i13 & 8) != 0 ? null : statusType, (i13 & 16) != 0 ? null : map, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : str, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str2);
        }
    }
}
