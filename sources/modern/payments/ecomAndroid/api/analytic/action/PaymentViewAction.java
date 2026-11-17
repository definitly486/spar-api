package modern.payments.ecomAndroid.api.analytic.action;

import kotlin.Metadata;
import modern.payments.ecomAndroid.api.analytic.Action;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/api/analytic/action/PaymentViewAction;", "", "Lmodern/payments/ecomAndroid/api/analytic/Action;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getActionValue", "TOUCH_CANCEL", "TOUCH_PAY", "TOUCH_CARD_NUMBER", "TOUCH_CVC", "TOUCH_EXPIRE_DATE_FIELD", "PAYMENT_CURTAIN_SWIPE", "PAYMENT_STARTED", "PAYMENT_3DS_STARTED", "LIFECYCLE_PAYMENT_VIEW_APPEARED", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum PaymentViewAction implements Action {
    TOUCH_CANCEL("TouchCancel"),
    TOUCH_PAY("TouchPay"),
    TOUCH_CARD_NUMBER("TouchCardNumber"),
    TOUCH_CVC("TouchCVC"),
    TOUCH_EXPIRE_DATE_FIELD("TouchExpireDateField"),
    PAYMENT_CURTAIN_SWIPE("PaymentCurtainSwipe"),
    PAYMENT_STARTED("PaymentStarted"),
    PAYMENT_3DS_STARTED("Payment3DSStarted"),
    LIFECYCLE_PAYMENT_VIEW_APPEARED("LifeCyclePaymentViewAppeared");

    private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
    private final String value;

    PaymentViewAction(String str) {
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
