package modern.payments.ecomAndroid.api.analytic.action;

import kotlin.Metadata;
import modern.payments.ecomAndroid.api.analytic.Action;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/api/analytic/action/WebViewAction;", "", "Lmodern/payments/ecomAndroid/api/analytic/Action;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getActionValue", "_3DS_VIEW_CURTAIN_SWIPE", "LIFECYCLE_3DS_VIEW_APPEARED", "LIFECYCLE_3DS_VIEW_READY", "LIFECYCLE_3DS_VIEW_TIMEOUT", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum WebViewAction implements Action {
    _3DS_VIEW_CURTAIN_SWIPE("3DSViewCurtainSwipe"),
    LIFECYCLE_3DS_VIEW_APPEARED("LifeCycle3DSViewAppeared"),
    LIFECYCLE_3DS_VIEW_READY("LifeCycle3DSViewReady"),
    LIFECYCLE_3DS_VIEW_TIMEOUT("LifeCycle3DSViewTimeout");

    private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
    private final String value;

    WebViewAction(String str) {
        this.value = str;
    }

    public static iobyxmoadg getEntries() {
        return $ENTRIES;
    }

    @Override // modern.payments.ecomAndroid.api.analytic.Action
    /* JADX INFO: renamed from: getActionValue, reason: from getter */
    public String getValue() {
        return this.value;
    }

    public final String getValue() {
        return this.value;
    }
}
