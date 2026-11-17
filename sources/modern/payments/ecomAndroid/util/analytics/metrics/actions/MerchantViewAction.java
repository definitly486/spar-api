package modern.payments.ecomAndroid.util.analytics.metrics.actions;

import kotlin.Metadata;
import modern.payments.ecomAndroid.util.analytics.EcomMetricKey;
import modern.payments.ecomAndroid.util.analytics.metrics.Action;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/util/analytics/metrics/actions/MerchantViewAction;", "", "Lmodern/payments/ecomAndroid/util/analytics/metrics/Action;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getActionValue", "SDK_VERSION", "REMOTE_CONFIG", "ST_GET_GOOD_REMOTE_CONFIG", "ST_GET_FAIL_REMOTE_CONFIG", "LC_BANK_APP_FOUND", "LC_NO_BANK_APP_FOUND", "LC_PAY_BUTTON_INITED", "SC_PERMISSIONS", "SC_GOOD_PERMISSIONS", "SC_FAIL_PERMISSIONS", "SC_BIZONE", "SC_GOOD_BIZONE", "SC_FAIL_BIZONE", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum MerchantViewAction implements Action {
    SDK_VERSION(EcomMetricKey.SDK_VERSION),
    REMOTE_CONFIG("EcomRemoteConfigAndroid"),
    ST_GET_GOOD_REMOTE_CONFIG("STGetGoodEcomRemoteConfigAndroid"),
    ST_GET_FAIL_REMOTE_CONFIG("STGetFailEcomRemoteConfigAndroid"),
    LC_BANK_APP_FOUND("LCBankAppFound"),
    LC_NO_BANK_APP_FOUND("LCNoBankAppFound"),
    LC_PAY_BUTTON_INITED("LCPayButtonInited"),
    SC_PERMISSIONS("SCPermissions"),
    SC_GOOD_PERMISSIONS("SCGoodPermissions"),
    SC_FAIL_PERMISSIONS("SCFailPermissions"),
    SC_BIZONE("SCBiZone"),
    SC_GOOD_BIZONE("SCGoodBiZone"),
    SC_FAIL_BIZONE("SCFailBiZone");

    private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
    private final String value;

    MerchantViewAction(String str) {
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
