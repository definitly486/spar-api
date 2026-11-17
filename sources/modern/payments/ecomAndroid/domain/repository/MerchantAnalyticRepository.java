package modern.payments.ecomAndroid.domain.repository;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b*\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0015\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0016\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0004J,\u0010\u0018\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001a\u0010\u0004J\u0010\u0010\u001b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001b\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001c\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001d\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001e\u0010\u0004J\u0010\u0010\u001f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001f\u0010\u0004J\u0010\u0010 \u001a\u00020\u0002H¦@¢\u0006\u0004\b \u0010\u0004J\u0010\u0010!\u001a\u00020\u0002H¦@¢\u0006\u0004\b!\u0010\u0004J\u0010\u0010\"\u001a\u00020\u0002H¦@¢\u0006\u0004\b\"\u0010\u0004J\u0010\u0010#\u001a\u00020\u0002H¦@¢\u0006\u0004\b#\u0010\u0004J\u0010\u0010$\u001a\u00020\u0002H¦@¢\u0006\u0004\b$\u0010\u0004J\u0010\u0010%\u001a\u00020\u0002H¦@¢\u0006\u0004\b%\u0010\u0004J\u0010\u0010&\u001a\u00020\u0002H¦@¢\u0006\u0004\b&\u0010\u0004J\u0010\u0010'\u001a\u00020\u0002H¦@¢\u0006\u0004\b'\u0010\u0004J\u0010\u0010(\u001a\u00020\u0002H¦@¢\u0006\u0004\b(\u0010\u0004J\u0010\u0010)\u001a\u00020\u0002H¦@¢\u0006\u0004\b)\u0010\u0004J\u0010\u0010*\u001a\u00020\u0002H¦@¢\u0006\u0004\b*\u0010\u0004J\u0010\u0010+\u001a\u00020\u0002H¦@¢\u0006\u0004\b+\u0010\u0004J\u0010\u0010,\u001a\u00020\u0002H¦@¢\u0006\u0004\b,\u0010\u0004J\u0018\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0005H¦@¢\u0006\u0004\b.\u0010\bJ\u0010\u0010/\u001a\u00020\u0002H¦@¢\u0006\u0004\b/\u0010\u0004J\u0010\u00100\u001a\u00020\u0002H¦@¢\u0006\u0004\b0\u0010\u0004J\u0010\u00101\u001a\u00020\u0002H¦@¢\u0006\u0004\b1\u0010\u0004J\u0010\u00102\u001a\u00020\u0002H¦@¢\u0006\u0004\b2\u0010\u0004¨\u00063"}, d2 = {"Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "", "Lgg/wwaezpbzkn;", "onAuthViewSwipe", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "", "result", "onSdkInitializationResult", "(Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "", "httpCode", "errorCode", "description", "onCreateSessionResult", "(ILjava/lang/String;Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "onAuthViewShow", "onSPayResult", "onTouchNewCard", "onTouchSPay", "onTouchSBP", "onTouchBinding", "onTouchDeleteBinding", "onPaymentMethodTouchClose", "onPaymentMethodViewSwipe", "onDeactivateBindingResult", "onPaymentMethodViewShow", "onPaymentTouchCancel", "onTouchPay", "onTouchCardNumber", "onTouchCvc", "onTouchExpireDateField", "onPaymentViewSwipe", "onPaymentStarted", "onPayment3DsStarted", "onPaymentViewShow", "onTouchBankApp", "onTouchSearchView", "onSbpViewSwipe", "onGoodRedirectToBankApp", "onFailRedirectToBankApp", "onGoodRedirectToBankWebApp", "onFailRedirectToBankWebApp", "onSbpViewShow", "onSbpViewReady", "onSbpInProgressEnd", "status", "onStatusViewResult", "on3dsViewSwipe", "on3dsViewShow", "on3dsViewReady", "on3dsViewTimeout", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MerchantAnalyticRepository {
    Object on3dsViewReady(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object on3dsViewShow(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object on3dsViewSwipe(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object on3dsViewTimeout(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onAuthViewShow(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onAuthViewSwipe(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onCreateSessionResult(int i13, String str, String str2, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onDeactivateBindingResult(int i13, String str, String str2, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onFailRedirectToBankApp(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onFailRedirectToBankWebApp(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onGoodRedirectToBankApp(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onGoodRedirectToBankWebApp(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onPayment3DsStarted(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onPaymentMethodTouchClose(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onPaymentMethodViewShow(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onPaymentMethodViewSwipe(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onPaymentStarted(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onPaymentTouchCancel(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onPaymentViewShow(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onPaymentViewSwipe(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onSPayResult(String str, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onSbpInProgressEnd(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onSbpViewReady(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onSbpViewShow(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onSbpViewSwipe(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onSdkInitializationResult(String str, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onStatusViewResult(String str, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onTouchBankApp(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onTouchBinding(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onTouchCardNumber(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onTouchCvc(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onTouchDeleteBinding(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onTouchExpireDateField(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onTouchNewCard(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onTouchPay(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onTouchSBP(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onTouchSPay(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object onTouchSearchView(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);
}
