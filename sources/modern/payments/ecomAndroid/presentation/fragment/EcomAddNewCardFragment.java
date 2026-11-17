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
import modern.payments.ecomAndroid.presentation.base.AbstractFragmentWithKeyboardListener;
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomAddNewCardAnalytic;
import modern.payments.ecomAndroid.presentation.viewModel.AddNewCardFragmentEvent;
import modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;
import modern.payments.p003ecomandroid.databinding.EcomFragmentAddNewCardBinding;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomAddNewCardFragment;", "Lmodern/payments/ecomAndroid/presentation/base/AbstractFragmentWithKeyboardListener;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomAddNewCardViewModel;", "Lmodern/payments/ecomandroid/databinding/EcomFragmentAddNewCardBinding;", "<init>", "()V", "Lgg/wwaezpbzkn;", "setupCardView", "inject", "setUpViews", "observeViewModel", "onStart", "initClickListeners", "getViewBinding", "()Lmodern/payments/ecomandroid/databinding/EcomFragmentAddNewCardBinding;", "Ljava/lang/Class;", "getViewModelType", "()Ljava/lang/Class;", "viewModelType", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomAddNewCardFragment extends AbstractFragmentWithKeyboardListener<AddNewCardFragmentEvent, EcomAddNewCardViewModel, EcomFragmentAddNewCardBinding> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "AddNewCardFragment";

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomAddNewCardFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomAddNewCardFragment;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EcomAddNewCardFragment newInstance() {
            return new EcomAddNewCardFragment();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ EcomAddNewCardViewModel access$getViewModel(EcomAddNewCardFragment ecomAddNewCardFragment) {
        return (EcomAddNewCardViewModel) ecomAddNewCardFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickListeners$lambda$13$lambda$11(EcomAddNewCardFragment this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((EcomAddNewCardViewModel) this$0.getViewModel()).handleAnalyticalEvent(EcomAddNewCardAnalytic.OnPayClick.INSTANCE);
        ((EcomAddNewCardViewModel) this$0.getViewModel()).handleEvent((AddNewCardFragmentEvent) AddNewCardFragmentEvent.OnNextBtnClickedEvent.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickListeners$lambda$13$lambda$12(EcomAddNewCardFragment this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((EcomAddNewCardViewModel) this$0.getViewModel()).handleAnalyticalEvent(EcomAddNewCardAnalytic.OnCancelClick.INSTANCE);
        ((EcomAddNewCardViewModel) this$0.getViewModel()).handleEvent((AddNewCardFragmentEvent) AddNewCardFragmentEvent.OnCancelBntClickedEvent.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupCardView() {
        ((EcomFragmentAddNewCardBinding) getBinding()).ecomEfancCvCardSelectionButton.setupViewTextWatchers(new EcomAddNewCardFragment$setupCardView$1$1(this), new EcomAddNewCardFragment$setupCardView$1$2(this), new EcomAddNewCardFragment$setupCardView$1$3(this), new EcomAddNewCardFragment$setupCardView$1$4(this));
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public Class<EcomAddNewCardViewModel> getViewModelType() {
        return EcomAddNewCardViewModel.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void initClickListeners() {
        EcomFragmentAddNewCardBinding ecomFragmentAddNewCardBinding = (EcomFragmentAddNewCardBinding) getBinding();
        ecomFragmentAddNewCardBinding.ecomEfancEbvPay.setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcomAddNewCardFragment.initClickListeners$lambda$13$lambda$11(this.f67676zdlpuopuiu, view);
            }
        });
        ecomFragmentAddNewCardBinding.ecomEfancEbvCancel.setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcomAddNewCardFragment.initClickListeners$lambda$13$lambda$12(this.f67701zdlpuopuiu, view);
            }
        });
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void inject() {
        PaymentFlowSubcomponent paymentFlowSubcomponent$ecomAndroid_release = EcomSdk.INSTANCE.getPaymentFlowSubcomponent$ecomAndroid_release();
        if (paymentFlowSubcomponent$ecomAndroid_release != null) {
            paymentFlowSubcomponent$ecomAndroid_release.inject(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void observeViewModel() {
        EcomFragmentAddNewCardBinding ecomFragmentAddNewCardBinding = (EcomFragmentAddNewCardBinding) getBinding();
        super.observeViewModel();
        wypolnanlu orderData = ((EcomAddNewCardViewModel) getViewModel()).getOrderData();
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomAddNewCardFragment$observeViewModel$lambda$9$$inlined$observeData$default$1(this, zoijcleaowVar, orderData, null, ecomFragmentAddNewCardBinding, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomAddNewCardFragment$observeViewModel$lambda$9$$inlined$observeData$default$2(this, zoijcleaowVar, ((EcomAddNewCardViewModel) getViewModel()).getIsEnterDataComplete(), null, ecomFragmentAddNewCardBinding), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomAddNewCardFragment$observeViewModel$lambda$9$$inlined$observeData$default$3(this, zoijcleaowVar, ((EcomAddNewCardViewModel) getViewModel()).getStep(), null, ecomFragmentAddNewCardBinding), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomAddNewCardFragment$observeViewModel$lambda$9$$inlined$observeData$default$4(this, zoijcleaowVar, ((EcomAddNewCardViewModel) getViewModel()).getInputError(), null, ecomFragmentAddNewCardBinding), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomAddNewCardFragment$observeViewModel$lambda$9$$inlined$observeData$default$5(this, zoijcleaowVar, sj.dxjokdxxww.vdvldrhtss(((EcomAddNewCardViewModel) getViewModel()).getCardIcon()), null, ecomFragmentAddNewCardBinding), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomAddNewCardFragment$observeViewModel$lambda$9$$inlined$observeData$default$6(this, zoijcleaowVar, sj.dxjokdxxww.vdvldrhtss(((EcomAddNewCardViewModel) getViewModel()).getShowCardIcon()), null, ecomFragmentAddNewCardBinding), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomAddNewCardFragment$observeViewModel$lambda$9$$inlined$observeData$default$7(this, zoijcleaowVar, ((EcomAddNewCardViewModel) getViewModel()).getIsKeyboardVisible(), null, ecomFragmentAddNewCardBinding, this), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ((EcomAddNewCardViewModel) getViewModel()).handleAnalyticalEvent(EcomAddNewCardAnalytic.OnPaymentViewShow.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // modern.payments.ecomAndroid.presentation.base.AbstractFragmentWithKeyboardListener, modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void setUpViews() {
        super.setUpViews();
        setupCardView();
        initClickListeners();
        EcomFragmentAddNewCardBinding ecomFragmentAddNewCardBinding = (EcomFragmentAddNewCardBinding) getBinding();
        TextView ecomEfancTvAmount = ecomFragmentAddNewCardBinding.ecomEfancTvAmount;
        zdlpuopuiu.dxjokdxxww(ecomEfancTvAmount, "ecomEfancTvAmount");
        UIPreferencesRepository.FontParams uIFontParams = getUiPreferencesRepository().getUIFontParams(UIPreferencesRepository.Font.TITLE_1);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = getUiPreferencesRepository().getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomEfancTvAmount, uIFontParams, uIColorPreferences != null ? Integer.valueOf(uIColorPreferences.getTextPrimary()) : null);
        TextView ecomEfancTvClientName = ecomFragmentAddNewCardBinding.ecomEfancTvClientName;
        zdlpuopuiu.dxjokdxxww(ecomEfancTvClientName, "ecomEfancTvClientName");
        UIPreferencesRepository uiPreferencesRepository = getUiPreferencesRepository();
        UIPreferencesRepository.Font font = UIPreferencesRepository.Font.FOOTNOTE;
        UIPreferencesRepository.FontParams uIFontParams2 = uiPreferencesRepository.getUIFontParams(font);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences2 = getUiPreferencesRepository().getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomEfancTvClientName, uIFontParams2, uIColorPreferences2 != null ? Integer.valueOf(uIColorPreferences2.getTextSecondary()) : null);
        TextView ecomEfancCardErrorMessageTextView = ecomFragmentAddNewCardBinding.ecomEfancCardErrorMessageTextView;
        zdlpuopuiu.dxjokdxxww(ecomEfancCardErrorMessageTextView, "ecomEfancCardErrorMessageTextView");
        UIPreferencesRepository.FontParams uIFontParams3 = getUiPreferencesRepository().getUIFontParams(font);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences3 = getUiPreferencesRepository().getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomEfancCardErrorMessageTextView, uIFontParams3, uIColorPreferences3 != null ? Integer.valueOf(uIColorPreferences3.getAccentError()) : null);
        ecomFragmentAddNewCardBinding.ecomEfancEbvPay.applyUIPreferences(getUiPreferencesRepository(), UIPreferencesRepository.ButtonType.PRIMARY);
        ecomFragmentAddNewCardBinding.ecomEfancEbvCancel.applyUIPreferences(getUiPreferencesRepository(), UIPreferencesRepository.ButtonType.TRANSPARENT);
        ecomFragmentAddNewCardBinding.ecomEfancCvCardSelectionButton.applyUIPreferences(getUiPreferencesRepository());
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public EcomFragmentAddNewCardBinding getViewBinding() {
        EcomFragmentAddNewCardBinding ecomFragmentAddNewCardBindingInflate = EcomFragmentAddNewCardBinding.inflate(getLayoutInflater());
        zdlpuopuiu.dxjokdxxww(ecomFragmentAddNewCardBindingInflate, "inflate(...)");
        return ecomFragmentAddNewCardBindingInflate;
    }
}
