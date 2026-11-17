package modern.payments.ecomAndroid.api.analytic.action;

import kotlin.Metadata;
import modern.payments.ecomAndroid.api.analytic.Action;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/api/analytic/action/PaymentMethodViewAction;", "", "Lmodern/payments/ecomAndroid/api/analytic/Action;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getActionValue", "TOUCH_NEW_CARD", "TOUCH_SPAY", "TOUCH_SBP", "TOUCH_BINDING", "TOUCH_DELETE_BINDING", "TOUCH_CLOSE", "PAYMENT_METHOD_CURTAIN_SWIPE", "DEACTIVATE_BINDING", "LIFECYCLE_PAYMENT_METHOD_VIEW_APPEARED", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum PaymentMethodViewAction implements Action {
    TOUCH_NEW_CARD("TouchNewCard"),
    TOUCH_SPAY("TouchSPay"),
    TOUCH_SBP("TouchSbp"),
    TOUCH_BINDING("TouchBinding"),
    TOUCH_DELETE_BINDING("TouchDeleteBinding"),
    TOUCH_CLOSE("TouchClose"),
    PAYMENT_METHOD_CURTAIN_SWIPE("PaymentMethodCurtainSwipe"),
    DEACTIVATE_BINDING("DeactivateBinding"),
    LIFECYCLE_PAYMENT_METHOD_VIEW_APPEARED("LifeCyclePaymentMethodViewAppeared");

    private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
    private final String value;

    PaymentMethodViewAction(String str) {
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
