package modern.payments.ecomAndroid.di.component;

import kotlin.Metadata;
import modern.payments.ecomAndroid.EcomActivity;
import modern.payments.ecomAndroid.di.scope.PaymentFlowScope;
import modern.payments.ecomAndroid.presentation.fragment.Ecom3DsMethodFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomAddNewCardFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomBottomSheetDialogFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomChallengeFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomDefaultErrorFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomLoadingFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomLoggerFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomNoInternetFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomOperationStatusSuccessFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomOrderFragment;
import modern.payments.ecomAndroid.presentation.fragment.EcomServerUnavailableFragment;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeFragment;
import modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment;
import modern.payments.ecomAndroid.util.CoilImpl;
import modern.payments.ecomAndroid.util.shaker.ShakeDetector;

/* JADX INFO: loaded from: classes3.dex */
@PaymentFlowScope
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u00014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0005\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0005\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0005\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0005\u0010\u0018J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u0005\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u0005\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b\u0005\u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b\u0005\u0010$J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b\u0005\u0010'J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H&¢\u0006\u0004\b\u0005\u0010*J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b\u0005\u0010-J\u000f\u0010/\u001a\u00020.H&¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H&¢\u0006\u0004\b2\u00103¨\u00065"}, d2 = {"Lmodern/payments/ecomAndroid/di/component/PaymentFlowSubcomponent;", "", "Lmodern/payments/ecomAndroid/EcomActivity;", "ecomActivity", "Lgg/wwaezpbzkn;", "inject", "(Lmodern/payments/ecomAndroid/EcomActivity;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomBottomSheetDialogFragment;", "ecomBottomSheetDialogFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/EcomBottomSheetDialogFragment;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/Ecom3DsMethodFragment;", "ecom3DsMethodFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/Ecom3DsMethodFragment;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomAddNewCardFragment;", "ecomAddNewCardFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/EcomAddNewCardFragment;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomChallengeFragment;", "ecomChallengeFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/EcomChallengeFragment;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomDefaultErrorFragment;", "ecomDefaultErrorFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/EcomDefaultErrorFragment;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomLoadingFragment;", "ecomLoadingFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/EcomLoadingFragment;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomLoggerFragment;", "ecomLoggerFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/EcomLoggerFragment;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomNoInternetFragment;", "ecomNoInternetFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/EcomNoInternetFragment;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomOperationStatusSuccessFragment;", "ecomOperationStatusSuccessFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/EcomOperationStatusSuccessFragment;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomOrderFragment;", "ecomOrderFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/EcomOrderFragment;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/EcomPaymentModeFragment;", "ecomPaymentModeFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/EcomPaymentModeFragment;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/EcomSbpFragment;", "ecomSbpFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/EcomSbpFragment;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomServerUnavailableFragment;", "ecomServerUnavailableFragment", "(Lmodern/payments/ecomAndroid/presentation/fragment/EcomServerUnavailableFragment;)V", "Lmodern/payments/ecomAndroid/util/CoilImpl;", "getCoil", "()Lmodern/payments/ecomAndroid/util/CoilImpl;", "Lmodern/payments/ecomAndroid/util/shaker/ShakeDetector;", "getShakeDetector", "()Lmodern/payments/ecomAndroid/util/shaker/ShakeDetector;", "Builder", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PaymentFlowSubcomponent {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lmodern/payments/ecomAndroid/di/component/PaymentFlowSubcomponent$Builder;", "", "build", "Lmodern/payments/ecomAndroid/di/component/PaymentFlowSubcomponent;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Builder {
        PaymentFlowSubcomponent build();
    }

    CoilImpl getCoil();

    ShakeDetector getShakeDetector();

    void inject(EcomActivity ecomActivity);

    void inject(Ecom3DsMethodFragment ecom3DsMethodFragment);

    void inject(EcomAddNewCardFragment ecomAddNewCardFragment);

    void inject(EcomBottomSheetDialogFragment ecomBottomSheetDialogFragment);

    void inject(EcomChallengeFragment ecomChallengeFragment);

    void inject(EcomDefaultErrorFragment ecomDefaultErrorFragment);

    void inject(EcomLoadingFragment ecomLoadingFragment);

    void inject(EcomLoggerFragment ecomLoggerFragment);

    void inject(EcomNoInternetFragment ecomNoInternetFragment);

    void inject(EcomOperationStatusSuccessFragment ecomOperationStatusSuccessFragment);

    void inject(EcomOrderFragment ecomOrderFragment);

    void inject(EcomServerUnavailableFragment ecomServerUnavailableFragment);

    void inject(EcomPaymentModeFragment ecomPaymentModeFragment);

    void inject(EcomSbpFragment ecomSbpFragment);
}
