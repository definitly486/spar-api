package modern.payments.ecomAndroid.presentation.fragment;

import android.view.View;
import android.widget.TextView;
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
import modern.payments.ecomAndroid.presentation.viewModel.EcomDefaultErrorFragmentViewModel;
import modern.payments.ecomAndroid.presentation.viewModel.ErrorFragmentEvent;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;
import modern.payments.p003ecomandroid.databinding.EcomLayoutDefaultErrorBinding;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0006R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomDefaultErrorFragment;", "Lmodern/payments/ecomAndroid/presentation/base/BaseFragment;", "Lmodern/payments/ecomAndroid/presentation/viewModel/ErrorFragmentEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomDefaultErrorFragmentViewModel;", "Lmodern/payments/ecomandroid/databinding/EcomLayoutDefaultErrorBinding;", "<init>", "()V", "Lgg/wwaezpbzkn;", "inject", "getViewBinding", "()Lmodern/payments/ecomandroid/databinding/EcomLayoutDefaultErrorBinding;", "observeViewModel", "onStart", "setUpViews", "Ljava/lang/Class;", "getViewModelType", "()Ljava/lang/Class;", "viewModelType", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomDefaultErrorFragment extends BaseFragment<ErrorFragmentEvent, EcomDefaultErrorFragmentViewModel, EcomLayoutDefaultErrorBinding> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "ErrorFragment";

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomDefaultErrorFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomDefaultErrorFragment;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EcomDefaultErrorFragment newInstance() {
            return new EcomDefaultErrorFragment();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpViews$lambda$6$lambda$5$lambda$4(EcomDefaultErrorFragment this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        this$0.getViewModel().handleEvent((ErrorFragmentEvent) ErrorFragmentEvent.OnCloseBtnClicked.INSTANCE);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public Class<EcomDefaultErrorFragmentViewModel> getViewModelType() {
        return EcomDefaultErrorFragmentViewModel.class;
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
        sj.lqeggnwhkg lqeggnwhkgVarLereixgezr = sj.dxjokdxxww.lereixgezr(getViewModel().getErrorState());
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomDefaultErrorFragment$observeViewModel$$inlined$observeData$default$1(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomDefaultErrorFragment$observeViewModel$$inlined$observeData$default$2(this, zoijcleaowVar, getViewModel().getLocalSessionId(), null, this), 3, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getViewModel().handleAnalyticalEvent(EcomStatusAnalytic.OnStatusViewResult.INSTANCE);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void setUpViews() {
        EcomLayoutDefaultErrorBinding binding = getBinding();
        super.setUpViews();
        TextView ecomLeTvErrorText = binding.ecomLeTvErrorText;
        zdlpuopuiu.dxjokdxxww(ecomLeTvErrorText, "ecomLeTvErrorText");
        UIPreferencesRepository.FontParams uIFontParams = getUiPreferencesRepository().getUIFontParams(UIPreferencesRepository.Font.TITLE_3);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = getUiPreferencesRepository().getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomLeTvErrorText, uIFontParams, uIColorPreferences != null ? Integer.valueOf(uIColorPreferences.getTextPrimary()) : null);
        TextView ecomLeTvErrorDescr = binding.ecomLeTvErrorDescr;
        zdlpuopuiu.dxjokdxxww(ecomLeTvErrorDescr, "ecomLeTvErrorDescr");
        UIPreferencesRepository.FontParams uIFontParams2 = getUiPreferencesRepository().getUIFontParams(UIPreferencesRepository.Font.FOOTNOTE);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences2 = getUiPreferencesRepository().getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomLeTvErrorDescr, uIFontParams2, uIColorPreferences2 != null ? Integer.valueOf(uIColorPreferences2.getTextSecondary()) : null);
        EcomButtonView ecomButtonView = binding.ecomLeEbvClose;
        ecomButtonView.applyUIPreferences(getUiPreferencesRepository(), UIPreferencesRepository.ButtonType.SECONDARY);
        ecomButtonView.setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcomDefaultErrorFragment.setUpViews$lambda$6$lambda$5$lambda$4(this.f67675zdlpuopuiu, view);
            }
        });
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public EcomLayoutDefaultErrorBinding getViewBinding() {
        EcomLayoutDefaultErrorBinding ecomLayoutDefaultErrorBindingInflate = EcomLayoutDefaultErrorBinding.inflate(getLayoutInflater());
        zdlpuopuiu.dxjokdxxww(ecomLayoutDefaultErrorBindingInflate, "inflate(...)");
        return ecomLayoutDefaultErrorBindingInflate;
    }
}
