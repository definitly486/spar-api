package modern.payments.ecomAndroid.util.analytics.metrics.actions;

import kotlin.Metadata;
import modern.payments.ecomAndroid.util.analytics.metrics.Action;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/util/analytics/metrics/actions/WebViewAction;", "", "Lmodern/payments/ecomAndroid/util/analytics/metrics/Action;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getActionValue", "WEB_VIEW_APPEARED", "REDIRECT_TO_TARGET_URL", "TIMER_TIMEOUT", "WEB_VIEW_DISAPPEARED", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum WebViewAction implements Action {
    WEB_VIEW_APPEARED("WebViewAppeared"),
    REDIRECT_TO_TARGET_URL("RedirectToTargetUrl"),
    TIMER_TIMEOUT("TimerTimeout"),
    WEB_VIEW_DISAPPEARED("WebViewDisappeared");

    private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
    private final String value;

    WebViewAction(String str) {
        this.value = str;
    }

    public static iobyxmoadg getEntries() {
        return $ENTRIES;
    }

    @Override // modern.payments.ecomAndroid.util.analytics.metrics.Action
    /* JADX INFO: renamed from: getActionValue, reason: from getter */
    public String getValue() {
        return this.value;
    }

    public final String getValue() {
        return this.value;
    }
}
