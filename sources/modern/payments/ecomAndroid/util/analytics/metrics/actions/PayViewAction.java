package modern.payments.ecomAndroid.util.analytics.metrics.actions;

import kotlin.Metadata;
import modern.payments.ecomAndroid.util.analytics.metrics.Action;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006-"}, d2 = {"Lmodern/payments/ecomAndroid/util/analytics/metrics/actions/PayViewAction;", "", "Lmodern/payments/ecomAndroid/util/analytics/metrics/Action;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getActionValue", "NEW_CARD", "SPAY", "SBP", "BINDING", "FINISH_3DS_PAYMENT", "FINISH_3DS_METHOD", "PAYMENT_TOKEN", "PAYMENT_ORDER", "CANCEL", "PAY", "RQ_LIST_CARDS", "RQ_GOOD_LIST_CARDS", "RQ_FAIL_LIST_CARDS", "RS_GOOD_LIST_CARDS", "RS_FAIL_LIST_CARDS", "RQ_PAYMENT_TOKEN", "RQ_GOOD_PAYMENT_TOKEN", "RQ_FAIL_PAYMENT_TOKEN", "RS_GOOD_PAYMENT_TOKEN", "RS_FAIL_PAYMENT_TOKEN", "RQ_PAYMENT_ORDER", "RQ_GOOD_PAYMENT_ORDER", "RQ_FAIL_PAYMENT_ORDER", "RS_GOOD_PAYMENT_ORDER", "RS_FAIL_PAYMENT_ORDER", "LC_BIO_AUTH_START", "LC_GOOD_BIO_AUTH", "LC_FAIL_BIO_AUTH", "LC_BANK_APP_AUTH", "LC_BANK_APP_AUTH_GOOD", "LC_BANK_APP_AUTH_FAIL", "LC_PAY_VIEW_APPEARED", "LC_PAY_VIEW_DISAPPEARED", "LC_PAY_BNPL_AVAILABLE", "LC_PAY_BNPL_UNAVAILABLE", "LC_PAY_BNPL_START", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum PayViewAction implements Action {
    NEW_CARD("NewCard"),
    SPAY("SPay"),
    SBP("Sbp"),
    BINDING("Binding"),
    FINISH_3DS_PAYMENT("Finish3DSPayment"),
    FINISH_3DS_METHOD("Finish3DSMethod"),
    PAYMENT_TOKEN("PaymentToken"),
    PAYMENT_ORDER("PaymentOrder"),
    CANCEL("Cancel"),
    PAY("Pay"),
    RQ_LIST_CARDS("RQListCards"),
    RQ_GOOD_LIST_CARDS("RQGoodListCards"),
    RQ_FAIL_LIST_CARDS("RQFailListCards"),
    RS_GOOD_LIST_CARDS("RSGoodListCards"),
    RS_FAIL_LIST_CARDS("RSFailListCards"),
    RQ_PAYMENT_TOKEN("RQPaymentToken"),
    RQ_GOOD_PAYMENT_TOKEN("RQGoodPaymentToken"),
    RQ_FAIL_PAYMENT_TOKEN("RQFailPaymentToken"),
    RS_GOOD_PAYMENT_TOKEN("RSGoodPaymentToken"),
    RS_FAIL_PAYMENT_TOKEN("RSFailPaymentToken"),
    RQ_PAYMENT_ORDER("RQPaymentOrder"),
    RQ_GOOD_PAYMENT_ORDER("RQGoodPaymentOrder"),
    RQ_FAIL_PAYMENT_ORDER("RQFailPaymentOrder"),
    RS_GOOD_PAYMENT_ORDER("RSGoodPaymentOrder"),
    RS_FAIL_PAYMENT_ORDER("RSFailPaymentOrder"),
    LC_BIO_AUTH_START("LCBioAuthStart"),
    LC_GOOD_BIO_AUTH("LCGoodBioAuth"),
    LC_FAIL_BIO_AUTH("LCFailBioAuth"),
    LC_BANK_APP_AUTH("LCBankAppAuth"),
    LC_BANK_APP_AUTH_GOOD("LCBankAppAuthGood"),
    LC_BANK_APP_AUTH_FAIL("LCBankAppAuthFail"),
    LC_PAY_VIEW_APPEARED("LCPayViewAppeared"),
    LC_PAY_VIEW_DISAPPEARED("LCPayViewDisappeared"),
    LC_PAY_BNPL_AVAILABLE("LCPayBnplAvailable"),
    LC_PAY_BNPL_UNAVAILABLE("LCPayBnplUnavailable"),
    LC_PAY_BNPL_START("LCPayBnplStart");

    private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
    private final String value;

    PayViewAction(String str) {
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
