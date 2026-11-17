package modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel;

import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.ntlheqmsrt;
import kotlin.Metadata;
import modern.payments.ecomAndroid.EcomActivityViewModel;
import modern.payments.ecomAndroid.di.scope.PaymentFlowScope;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel;
import modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomDefaultErrorFragmentViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomLoadingFragmentViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomLoggerViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomNoInternetFragmentViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomOperationStatusSuccessViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.EcomServerUnavailableFragmentViewModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u001aH'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u001dH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020 H'¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020#H'¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020&H'¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020)H'¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020,H'¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020/H'¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelModule;", "", "<init>", "()V", "Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;", "factory", "Landroidx/lifecycle/crxdokpmqz$ppxfxbqfkf;", "bindViewModelFactory", "(Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;)Landroidx/lifecycle/crxdokpmqz$ppxfxbqfkf;", "Lmodern/payments/ecomAndroid/EcomActivityViewModel;", "viewModel", "Landroidx/lifecycle/ntlheqmsrt;", "ecomActivityViewModel", "(Lmodern/payments/ecomAndroid/EcomActivityViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetViewModel;", "ecomBottomSheetViewModel", "(Lmodern/payments/ecomAndroid/presentation/viewModel/EcomBottomSheetViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomLoadingFragmentViewModel;", "ecomLoadingFragmentViewModel", "(Lmodern/payments/ecomAndroid/presentation/viewModel/EcomLoadingFragmentViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomAddNewCardViewModel;", "ecomAddNewCardViewModel", "(Lmodern/payments/ecomAndroid/presentation/viewModel/EcomAddNewCardViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/EcomSbpViewModel;", "ecomSbpViewModel", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/EcomSbpViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/EcomPaymentModeViewModel;", "ecomPaymentModeViewModel", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/EcomPaymentModeViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomDefaultErrorFragmentViewModel;", "ecomDefaultErrorFragmentViewModel", "(Lmodern/payments/ecomAndroid/presentation/viewModel/EcomDefaultErrorFragmentViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomNoInternetFragmentViewModel;", "ecomNoInternetFragmentViewModel", "(Lmodern/payments/ecomAndroid/presentation/viewModel/EcomNoInternetFragmentViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomServerUnavailableFragmentViewModel;", "ecomServerUnavailableFragmentViewModel", "(Lmodern/payments/ecomAndroid/presentation/viewModel/EcomServerUnavailableFragmentViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomOperationStatusSuccessViewModel;", "ecomOperationStatusSuccessViewModel", "(Lmodern/payments/ecomAndroid/presentation/viewModel/EcomOperationStatusSuccessViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomChallengeViewModel;", "ecomChallengeViewModel", "(Lmodern/payments/ecomAndroid/presentation/viewModel/EcomChallengeViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodViewModel;", "ecom3dsMethodViewModel", "(Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomLoggerViewModel;", "ecomLoggerViewModel", "(Lmodern/payments/ecomAndroid/presentation/viewModel/EcomLoggerViewModel;)Landroidx/lifecycle/ntlheqmsrt;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ViewModelModule {
    @PaymentFlowScope
    public abstract crxdokpmqz.ppxfxbqfkf bindViewModelFactory(ViewModelFactory<Object> factory);

    @ViewModelKey(Ecom3dsMethodViewModel.class)
    public abstract ntlheqmsrt ecom3dsMethodViewModel(Ecom3dsMethodViewModel viewModel);

    @ViewModelKey(EcomActivityViewModel.class)
    public abstract ntlheqmsrt ecomActivityViewModel(EcomActivityViewModel viewModel);

    @ViewModelKey(EcomAddNewCardViewModel.class)
    public abstract ntlheqmsrt ecomAddNewCardViewModel(EcomAddNewCardViewModel viewModel);

    @ViewModelKey(EcomBottomSheetViewModel.class)
    public abstract ntlheqmsrt ecomBottomSheetViewModel(EcomBottomSheetViewModel viewModel);

    @ViewModelKey(EcomChallengeViewModel.class)
    public abstract ntlheqmsrt ecomChallengeViewModel(EcomChallengeViewModel viewModel);

    @ViewModelKey(EcomDefaultErrorFragmentViewModel.class)
    public abstract ntlheqmsrt ecomDefaultErrorFragmentViewModel(EcomDefaultErrorFragmentViewModel viewModel);

    @ViewModelKey(EcomLoadingFragmentViewModel.class)
    public abstract ntlheqmsrt ecomLoadingFragmentViewModel(EcomLoadingFragmentViewModel viewModel);

    @ViewModelKey(EcomLoggerViewModel.class)
    public abstract ntlheqmsrt ecomLoggerViewModel(EcomLoggerViewModel viewModel);

    @ViewModelKey(EcomNoInternetFragmentViewModel.class)
    public abstract ntlheqmsrt ecomNoInternetFragmentViewModel(EcomNoInternetFragmentViewModel viewModel);

    @ViewModelKey(EcomOperationStatusSuccessViewModel.class)
    public abstract ntlheqmsrt ecomOperationStatusSuccessViewModel(EcomOperationStatusSuccessViewModel viewModel);

    @ViewModelKey(EcomPaymentModeViewModel.class)
    public abstract ntlheqmsrt ecomPaymentModeViewModel(EcomPaymentModeViewModel viewModel);

    @ViewModelKey(EcomSbpViewModel.class)
    public abstract ntlheqmsrt ecomSbpViewModel(EcomSbpViewModel viewModel);

    @ViewModelKey(EcomServerUnavailableFragmentViewModel.class)
    public abstract ntlheqmsrt ecomServerUnavailableFragmentViewModel(EcomServerUnavailableFragmentViewModel viewModel);
}
