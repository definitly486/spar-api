package modern.payments.ecomAndroid.util.externalMetrics.action;

import kotlin.Metadata;
import modern.payments.ecomAndroid.domain.externalMetrics.action.Action;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lmodern/payments/ecomAndroid/util/externalMetrics/action/StatusViewAction;", "", "Lmodern/payments/ecomAndroid/domain/externalMetrics/action/Action;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LC_STATUS_VIEW_APPEARED", "LC_STATUS_VIEW_DISAPPEARED", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum StatusViewAction implements Action {
    LC_STATUS_VIEW_APPEARED("LCStatusViewAppeared"),
    LC_STATUS_VIEW_DISAPPEARED("LCStatusViewDisappeared");

    private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
    private final String value;

    StatusViewAction(String str) {
        this.value = str;
    }

    public static iobyxmoadg getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
