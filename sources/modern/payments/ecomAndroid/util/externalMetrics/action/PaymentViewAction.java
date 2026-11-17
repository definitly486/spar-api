package modern.payments.ecomAndroid.util.externalMetrics.action;

import kotlin.Metadata;
import modern.payments.ecomAndroid.domain.externalMetrics.action.Action;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lmodern/payments/ecomAndroid/util/externalMetrics/action/PaymentViewAction;", "", "Lmodern/payments/ecomAndroid/domain/externalMetrics/action/Action;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INPUT_START_CARD_NUMBER", "INPUT_END_CARD_NUMBER", "INPUT_START_DATE_NUMBER", "INPUT_END_CARD_DATE", "INPUT_START_CVC_NUMBER", "INPUT_END_CVC_NUMBER", "TOUCH_NEXT", "TOUCH_PAY", "TOUCH_CANCEL", "RQ_ORDER_INFO", "RS_ORDER_INFO", "RQ_PAYMENT_TOKEN", "RS_PAYMENT_TOKEN", "RQ_PAYMENT_ORDER", "RS_PAYMENT_ORDER", "B_FAIL_CARD_NUMBER", "B_FAIL_CARD_DATE", "B_FAIL_CVC_NUMBER", "LC_PAYMENT_VIEW_APPEARED", "LC_PAYMENT_VIEW_DISAPPEARED", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum PaymentViewAction implements Action {
    INPUT_START_CARD_NUMBER("InputStartCardNumber"),
    INPUT_END_CARD_NUMBER("InputEndCardNumber"),
    INPUT_START_DATE_NUMBER("InputStartDateNumber"),
    INPUT_END_CARD_DATE("InputEndCardDate"),
    INPUT_START_CVC_NUMBER("InputStartCVCNumber"),
    INPUT_END_CVC_NUMBER("InputEndCVCNumber"),
    TOUCH_NEXT("TouchNext"),
    TOUCH_PAY("TouchPay"),
    TOUCH_CANCEL("TouchCancel"),
    RQ_ORDER_INFO("RQOrderInfo"),
    RS_ORDER_INFO("RSOrderInfo"),
    RQ_PAYMENT_TOKEN("RQPaymentToken"),
    RS_PAYMENT_TOKEN("RSPaymentToken"),
    RQ_PAYMENT_ORDER("RQPaymentOrder"),
    RS_PAYMENT_ORDER("RSPaymentOrder"),
    B_FAIL_CARD_NUMBER("BFailCardNumber"),
    B_FAIL_CARD_DATE("BFailCardDate"),
    B_FAIL_CVC_NUMBER("BFailCVCNumber"),
    LC_PAYMENT_VIEW_APPEARED("LCPaymentViewAppeared"),
    LC_PAYMENT_VIEW_DISAPPEARED("LCPaymentViewDisappeared");

    private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
    private final String value;

    PaymentViewAction(String str) {
        this.value = str;
    }

    public static iobyxmoadg getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
