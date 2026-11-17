package modern.payments.ecomAndroid.presentation.fragment;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.oxmwwwfdhm;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.BaseFragment;
import modern.payments.ecomAndroid.presentation.view.EcomButtonView;
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomStatusAnalytic;
import modern.payments.ecomAndroid.presentation.viewModel.EcomOperationStatusSuccessViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.OperationStatusEvent;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;
import modern.payments.p003ecomandroid.databinding.EcomFragmentStatusSuccessBinding;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomOperationStatusSuccessFragment;", "Lmodern/payments/ecomAndroid/presentation/base/BaseFragment;", "Lmodern/payments/ecomAndroid/presentation/viewModel/OperationStatusEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomOperationStatusSuccessViewModel;", "Lmodern/payments/ecomandroid/databinding/EcomFragmentStatusSuccessBinding;", "<init>", "()V", "Lgg/wwaezpbzkn;", "inject", "observeViewModel", "setUpViews", "onStart", "getViewBinding", "()Lmodern/payments/ecomandroid/databinding/EcomFragmentStatusSuccessBinding;", "Ljava/lang/Class;", "getViewModelType", "()Ljava/lang/Class;", "viewModelType", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomOperationStatusSuccessFragment extends BaseFragment<OperationStatusEvent, EcomOperationStatusSuccessViewModel, EcomFragmentStatusSuccessBinding> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "EcomOperationStatusSuccessFragment";

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomOperationStatusSuccessFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomOperationStatusSuccessFragment;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EcomOperationStatusSuccessFragment newInstance() {
            return new EcomOperationStatusSuccessFragment();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpViews$lambda$6$lambda$5$lambda$4(EcomOperationStatusSuccessFragment this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        this$0.getViewModel().handleEvent((OperationStatusEvent) OperationStatusEvent.OnCloseBtnClicked.INSTANCE);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public Class<EcomOperationStatusSuccessViewModel> getViewModelType() {
        return EcomOperationStatusSuccessViewModel.class;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void inject() {
        PaymentFlowSubcomponent paymentFlowSubcomponent$ecomAndroid_release = EcomSdk.INSTANCE.getPaymentFlowSubcomponent$ecomAndroid_release();
        if (paymentFlowSubcomponent$ecomAndroid_release != null) {
            paymentFlowSubcomponent$ecomAndroid_release.inject(this);
        }
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void observeViewModel() {
        super.observeViewModel();
        sj.lqeggnwhkg lqeggnwhkgVarLereixgezr = sj.dxjokdxxww.lereixgezr(getViewModel().getOrderInfo());
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomOperationStatusSuccessFragment$observeViewModel$$inlined$observeData$default$1(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomOperationStatusSuccessFragment$observeViewModel$$inlined$observeData$default$2(this, zoijcleaowVar, sj.dxjokdxxww.lereixgezr(getViewModel().getLocalSessionId()), null, this), 3, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getViewModel().handleAnalyticalEvent(EcomStatusAnalytic.OnStatusViewResult.INSTANCE);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void setUpViews() {
        EcomFragmentStatusSuccessBinding binding = getBinding();
        super.setUpViews();
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = getUiPreferencesRepository().getUIColorPreferences();
        if (uIColorPreferences != null) {
            binding.efssAcivStatusIcon.setImageTintList(ColorStateList.valueOf(uIColorPreferences.getAccentSuccess()));
        }
        AppCompatTextView efssActvAmount = binding.efssActvAmount;
        zdlpuopuiu.dxjokdxxww(efssActvAmount, "efssActvAmount");
        UIPreferencesRepository.FontParams uIFontParams = getUiPreferencesRepository().getUIFontParams(UIPreferencesRepository.Font.TITLE_2);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences2 = getUiPreferencesRepository().getUIColorPreferences();
        ViewExtensionsKt.setFontParams(efssActvAmount, uIFontParams, uIColorPreferences2 != null ? Integer.valueOf(uIColorPreferences2.getTextPrimary()) : null);
        AppCompatTextView efssActvMerchantName = binding.efssActvMerchantName;
        zdlpuopuiu.dxjokdxxww(efssActvMerchantName, "efssActvMerchantName");
        UIPreferencesRepository.FontParams uIFontParams2 = getUiPreferencesRepository().getUIFontParams(UIPreferencesRepository.Font.BODY);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences3 = getUiPreferencesRepository().getUIColorPreferences();
        ViewExtensionsKt.setFontParams(efssActvMerchantName, uIFontParams2, uIColorPreferences3 != null ? Integer.valueOf(uIColorPreferences3.getTextSecondary()) : null);
        EcomButtonView ecomButtonView = binding.efssFdbMbToPaymentMethods;
        ecomButtonView.applyUIPreferences(getUiPreferencesRepository(), UIPreferencesRepository.ButtonType.PRIMARY);
        ecomButtonView.setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcomOperationStatusSuccessFragment.setUpViews$lambda$6$lambda$5$lambda$4(this.f67670zdlpuopuiu, view);
            }
        });
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public EcomFragmentStatusSuccessBinding getViewBinding() {
        EcomFragmentStatusSuccessBinding ecomFragmentStatusSuccessBindingInflate = EcomFragmentStatusSuccessBinding.inflate(getLayoutInflater());
        zdlpuopuiu.dxjokdxxww(ecomFragmentStatusSuccessBindingInflate, "inflate(...)");
        return ecomFragmentStatusSuccessBindingInflate;
    }
}
