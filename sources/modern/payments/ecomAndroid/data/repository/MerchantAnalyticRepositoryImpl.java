package modern.payments.ecomAndroid.data.repository;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManager;
import modern.payments.ecomAndroid.api.analytic.action.AuthViewAction;
import modern.payments.ecomAndroid.api.analytic.action.MerchantViewAction;
import modern.payments.ecomAndroid.api.analytic.action.PaymentMethodViewAction;
import modern.payments.ecomAndroid.api.analytic.action.PaymentViewAction;
import modern.payments.ecomAndroid.api.analytic.action.SbpViewAction;
import modern.payments.ecomAndroid.api.analytic.action.StatusViewAction;
import modern.payments.ecomAndroid.api.analytic.action.WebViewAction;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b+\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0015\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0016\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0017\u0010\bJ\u0010\u0010\u0018\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0018\u0010\bJ\u0010\u0010\u0019\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0019\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001a\u0010\bJ\u0010\u0010\u001b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001b\u0010\bJ,\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001d\u0010\bJ\u0010\u0010\u001e\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001e\u0010\bJ\u0010\u0010\u001f\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001f\u0010\bJ\u0010\u0010 \u001a\u00020\u0006H\u0096@¢\u0006\u0004\b \u0010\bJ\u0010\u0010!\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b!\u0010\bJ\u0010\u0010\"\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\"\u0010\bJ\u0010\u0010#\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b#\u0010\bJ\u0010\u0010$\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b$\u0010\bJ\u0010\u0010%\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b%\u0010\bJ\u0010\u0010&\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b&\u0010\bJ\u0010\u0010'\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b'\u0010\bJ\u0010\u0010(\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b(\u0010\bJ\u0010\u0010)\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b)\u0010\bJ\u0010\u0010*\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b*\u0010\bJ\u0010\u0010+\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b+\u0010\bJ\u0010\u0010,\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b,\u0010\bJ\u0010\u0010-\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b-\u0010\bJ\u0010\u0010.\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b.\u0010\bJ\u0010\u0010/\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b/\u0010\bJ\u0010\u00100\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b0\u0010\bJ\u0018\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\tH\u0096@¢\u0006\u0004\b2\u0010\fJ\u0010\u00103\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b3\u0010\bJ\u0010\u00104\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b4\u0010\bJ\u0010\u00105\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b5\u0010\bJ\u0010\u00106\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b6\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107¨\u00068"}, d2 = {"Lmodern/payments/ecomAndroid/data/repository/MerchantAnalyticRepositoryImpl;", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "Lmodern/payments/ecomAndroid/api/analytic/MerchantAnalyticManager;", "merchantAnalyticManager", "<init>", "(Lmodern/payments/ecomAndroid/api/analytic/MerchantAnalyticManager;)V", "Lgg/wwaezpbzkn;", "onAuthViewSwipe", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "", "result", "onSdkInitializationResult", "(Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "", "httpCode", "errorCode", "description", "onCreateSessionResult", "(ILjava/lang/String;Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "onAuthViewShow", "onSPayResult", "onTouchNewCard", "onTouchSPay", "onTouchSBP", "onTouchBinding", "onTouchDeleteBinding", "onPaymentMethodTouchClose", "onPaymentMethodViewSwipe", "onDeactivateBindingResult", "onPaymentMethodViewShow", "onPaymentTouchCancel", "onTouchPay", "onTouchCardNumber", "onTouchCvc", "onTouchExpireDateField", "onPaymentViewSwipe", "onPaymentStarted", "onPayment3DsStarted", "onPaymentViewShow", "onTouchBankApp", "onTouchSearchView", "onSbpViewSwipe", "onGoodRedirectToBankApp", "onFailRedirectToBankApp", "onGoodRedirectToBankWebApp", "onFailRedirectToBankWebApp", "onSbpViewShow", "onSbpViewReady", "onSbpInProgressEnd", "status", "onStatusViewResult", "on3dsViewSwipe", "on3dsViewShow", "on3dsViewReady", "on3dsViewTimeout", "Lmodern/payments/ecomAndroid/api/analytic/MerchantAnalyticManager;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MerchantAnalyticRepositoryImpl implements MerchantAnalyticRepository {
    private final MerchantAnalyticManager merchantAnalyticManager;

    public MerchantAnalyticRepositoryImpl(MerchantAnalyticManager merchantAnalyticManager) {
        zdlpuopuiu.btonecajqb(merchantAnalyticManager, "merchantAnalyticManager");
        this.merchantAnalyticManager = merchantAnalyticManager;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object on3dsViewReady(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, WebViewAction.LIFECYCLE_3DS_VIEW_READY, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object on3dsViewShow(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, WebViewAction.LIFECYCLE_3DS_VIEW_APPEARED, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object on3dsViewSwipe(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, WebViewAction._3DS_VIEW_CURTAIN_SWIPE, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object on3dsViewTimeout(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, WebViewAction.LIFECYCLE_3DS_VIEW_TIMEOUT, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onAuthViewShow(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, AuthViewAction.LIFECYCLE_LOADING_VIEW_APPEARED, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onAuthViewSwipe(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, AuthViewAction.INITIALIZATION_CURTAIN_SWIPE, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onCreateSessionResult(int i13, String str, String str2, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric = this.merchantAnalyticManager.sendMetric(AuthViewAction.CREATE_SESSION, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13), str, str2, gxszxtbevoVar);
        return objSendMetric == zoijcleaow.gxszxtbevo() ? objSendMetric : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onDeactivateBindingResult(int i13, String str, String str2, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric = this.merchantAnalyticManager.sendMetric(PaymentMethodViewAction.DEACTIVATE_BINDING, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13), str, str2, gxszxtbevoVar);
        return objSendMetric == zoijcleaow.gxszxtbevo() ? objSendMetric : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onFailRedirectToBankApp(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, SbpViewAction.LIFECYCLE_FAIL_REDIRECT_TO_BANK_APP, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onFailRedirectToBankWebApp(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, SbpViewAction.LIFECYCLE_FAIL_REDIRECT_TO_BANK_WEB_APP, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onGoodRedirectToBankApp(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, SbpViewAction.LIFECYCLE_GOOD_REDIRECT_TO_BANK_APP, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onGoodRedirectToBankWebApp(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, SbpViewAction.LIFECYCLE_GOOD_REDIRECT_TO_BANK_WEB_APP, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onPayment3DsStarted(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentViewAction.PAYMENT_3DS_STARTED, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onPaymentMethodTouchClose(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentMethodViewAction.TOUCH_CLOSE, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onPaymentMethodViewShow(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentMethodViewAction.LIFECYCLE_PAYMENT_METHOD_VIEW_APPEARED, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onPaymentMethodViewSwipe(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentMethodViewAction.PAYMENT_METHOD_CURTAIN_SWIPE, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onPaymentStarted(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentViewAction.PAYMENT_STARTED, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onPaymentTouchCancel(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentViewAction.TOUCH_CANCEL, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onPaymentViewShow(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentViewAction.LIFECYCLE_PAYMENT_VIEW_APPEARED, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onPaymentViewSwipe(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentViewAction.PAYMENT_CURTAIN_SWIPE, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onSPayResult(String str, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, MerchantViewAction.SPAY_RESULT, null, null, str, gxszxtbevoVar, 6, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onSbpInProgressEnd(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, SbpViewAction.LIFECYCLE_SBP_IN_PROGRESS_END, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onSbpViewReady(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, SbpViewAction.LIFECYCLE_SBP_READY, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onSbpViewShow(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, SbpViewAction.LIFECYCLE_SBP_APPEARED, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onSbpViewSwipe(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, SbpViewAction.SBP_CURTAIN_SWIPE, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onSdkInitializationResult(String str, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, AuthViewAction.INITIALIZATION, null, null, str, gxszxtbevoVar, 6, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onStatusViewResult(String str, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, StatusViewAction.LIFECYCLE_STATUS, null, null, str, gxszxtbevoVar, 6, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onTouchBankApp(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, SbpViewAction.TOUCH_BANK_APP, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onTouchBinding(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentMethodViewAction.TOUCH_BINDING, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onTouchCardNumber(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentViewAction.TOUCH_CARD_NUMBER, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onTouchCvc(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentViewAction.TOUCH_CVC, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onTouchDeleteBinding(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentMethodViewAction.TOUCH_DELETE_BINDING, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onTouchExpireDateField(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentViewAction.TOUCH_EXPIRE_DATE_FIELD, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onTouchNewCard(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentMethodViewAction.TOUCH_NEW_CARD, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onTouchPay(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentViewAction.TOUCH_PAY, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onTouchSBP(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentMethodViewAction.TOUCH_SBP, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onTouchSPay(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, PaymentMethodViewAction.TOUCH_SPAY, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository
    public Object onTouchSearchView(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objSendMetric$default = MerchantAnalyticManager.DefaultImpls.sendMetric$default(this.merchantAnalyticManager, SbpViewAction.TOUCH_SEARCH_VIEW, null, null, null, gxszxtbevoVar, 14, null);
        return objSendMetric$default == zoijcleaow.gxszxtbevo() ? objSendMetric$default : wwaezpbzkn.f37140iobyxmoadg;
    }
}
