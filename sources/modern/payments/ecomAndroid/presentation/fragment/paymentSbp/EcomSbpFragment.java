package modern.payments.ecomAndroid.presentation.fragment.paymentSbp;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.textfield.TextInputEditText;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.adapter.decorator.VerticalSpacingItemDecorationLastExcluded;
import modern.payments.ecomAndroid.presentation.base.AbstractFragmentWithKeyboardListener;
import modern.payments.ecomAndroid.presentation.base.CompositeDelegateAdapter;
import modern.payments.ecomAndroid.presentation.view.EcomSbpSearchCompositeView;
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomSbpAnalytic;
import modern.payments.ecomAndroid.util.extension.ContextExtensionsKt;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;
import modern.payments.ecomAndroid.util.view.FragmentUtilsKt;
import modern.payments.p003ecomandroid.R;
import modern.payments.p003ecomandroid.databinding.EcomFragmentSbpBinding;
import sj.dxjokdxxww;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/EcomSbpFragment;", "Lmodern/payments/ecomAndroid/presentation/base/AbstractFragmentWithKeyboardListener;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/EcomSbpViewModel;", "Lmodern/payments/ecomandroid/databinding/EcomFragmentSbpBinding;", "<init>", "()V", "Lgg/wwaezpbzkn;", "setCorrectRVSize", "inject", "onStart", "setUpViews", "observeViewModel", "getViewBinding", "()Lmodern/payments/ecomandroid/databinding/EcomFragmentSbpBinding;", "Lmodern/payments/ecomAndroid/presentation/base/CompositeDelegateAdapter;", "bankListAdapter$delegate", "Lgg/gtknphoqwx;", "getBankListAdapter", "()Lmodern/payments/ecomAndroid/presentation/base/CompositeDelegateAdapter;", "bankListAdapter", "Ljava/lang/Class;", "getViewModelType", "()Ljava/lang/Class;", "viewModelType", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomSbpFragment extends AbstractFragmentWithKeyboardListener<SbpScreenEvent, EcomSbpViewModel, EcomFragmentSbpBinding> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "EcomSbpFragment";

    /* JADX INFO: renamed from: bankListAdapter$delegate, reason: from kotlin metadata */
    private final gtknphoqwx bankListAdapter = draadjrbmk.zoijcleaow(new EcomSbpFragment$bankListAdapter$2(this));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/EcomSbpFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/EcomSbpFragment;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EcomSbpFragment newInstance() {
            return new EcomSbpFragment();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ EcomSbpViewModel access$getViewModel(EcomSbpFragment ecomSbpFragment) {
        return (EcomSbpViewModel) ecomSbpFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CompositeDelegateAdapter getBankListAdapter() {
        return (CompositeDelegateAdapter) this.bankListAdapter.getValue();
    }

    private final void setCorrectRVSize() {
        Dialog dialog;
        Fragment parentFragment = ((Fragment) getParentFragmentManager().igdgnonuha().get(0)).getParentFragment();
        FragmentContainerView fragmentContainerView = null;
        BottomSheetDialogFragment bottomSheetDialogFragment = parentFragment instanceof BottomSheetDialogFragment ? (BottomSheetDialogFragment) parentFragment : null;
        if (bottomSheetDialogFragment != null) {
            FragmentUtilsKt.setupFullscreenWithTopPadding$default(bottomSheetDialogFragment, 0, 1, null);
        }
        if (bottomSheetDialogFragment != null && (dialog = bottomSheetDialogFragment.getDialog()) != null) {
            fragmentContainerView = (FragmentContainerView) dialog.findViewById(R.id.elbs_fcv_container);
        }
        if (fragmentContainerView != null) {
            ViewGroup.LayoutParams layoutParams = fragmentContainerView.getLayoutParams();
            zdlpuopuiu.nufgyqmvbu(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            Context contextRequireContext = requireContext();
            zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ContextExtensionsKt.getIntDimension(contextRequireContext, R.dimen.ecom_10dp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setUpViews$lambda$6$lambda$5$lambda$4$lambda$2(EcomSbpFragment this$0, View view, boolean z13) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((EcomSbpViewModel) this$0.getViewModel()).handleEvent((SbpScreenEvent) new SbpScreenEvent.SearchInputFocusChanged(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setUpViews$lambda$6$lambda$5$lambda$4$lambda$3(EcomSbpFragment this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((EcomSbpViewModel) this$0.getViewModel()).handleAnalyticalEvent(EcomSbpAnalytic.OnTouchSearchView.INSTANCE);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public Class<EcomSbpViewModel> getViewModelType() {
        return EcomSbpViewModel.class;
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
        EcomFragmentSbpBinding ecomFragmentSbpBinding = (EcomFragmentSbpBinding) getBinding();
        super.observeViewModel();
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        wypolnanlu screenState = ((EcomSbpViewModel) getViewModel()).getScreenState();
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeData$default$1(this, zoijcleaowVar, screenState, null, ecomFragmentSbpBinding, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeEvent$default$1(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((EcomSbpViewModel) getViewModel()).getViewAction()), null, contextRequireContext, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomSbpFragment$observeViewModel$lambda$10$$inlined$observeData$default$2(this, zoijcleaowVar, ((EcomSbpViewModel) getViewModel()).getIsKeyboardVisible(), null, this, ecomFragmentSbpBinding), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ((EcomSbpViewModel) getViewModel()).handleAnalyticalEvent(EcomSbpAnalytic.OnSbpViewShow.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // modern.payments.ecomAndroid.presentation.base.AbstractFragmentWithKeyboardListener, modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void setUpViews() {
        EcomFragmentSbpBinding ecomFragmentSbpBinding = (EcomFragmentSbpBinding) getBinding();
        super.setUpViews();
        Fragment parentFragment = ((Fragment) getParentFragmentManager().igdgnonuha().get(0)).getParentFragment();
        BottomSheetDialogFragment bottomSheetDialogFragment = parentFragment instanceof BottomSheetDialogFragment ? (BottomSheetDialogFragment) parentFragment : null;
        if (bottomSheetDialogFragment != null) {
            FragmentUtilsKt.setupFullscreenWithTopPadding$default(bottomSheetDialogFragment, 0, 1, null);
        }
        ecomFragmentSbpBinding.ecomEfsbpRvBankList.setAdapter(getBankListAdapter());
        RecyclerView recyclerView = ecomFragmentSbpBinding.ecomEfsbpRvBankList;
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        recyclerView.btonecajqb(new VerticalSpacingItemDecorationLastExcluded(ContextExtensionsKt.getPixelsFromDp(contextRequireContext, R.dimen.ecom_8dp), false));
        EcomSbpSearchCompositeView ecomSbpSearchCompositeView = ecomFragmentSbpBinding.ecomEsscvSbpSearchView;
        if (getUiPreferencesRepository().getUIColorPreferences() != null) {
            ecomSbpSearchCompositeView.applyUIPreferences(getUiPreferencesRepository());
        }
        TextInputEditText searchEditText = ecomSbpSearchCompositeView.getSearchEditText();
        searchEditText.addTextChangedListener(new TextWatcher() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$setUpViews$lambda$6$lambda$5$lambda$4$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s13) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                EcomSbpFragment.access$getViewModel(this.this$0).handleEvent((SbpScreenEvent) new SbpScreenEvent.SearchInputChangeEvent(String.valueOf(text)));
            }
        });
        searchEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.iobyxmoadg
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                EcomSbpFragment.setUpViews$lambda$6$lambda$5$lambda$4$lambda$2(this.f67695iobyxmoadg, view, z13);
            }
        });
        searchEditText.setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcomSbpFragment.setUpViews$lambda$6$lambda$5$lambda$4$lambda$3(this.f67696zdlpuopuiu, view);
            }
        });
        TextView ecomEfsbpTvTitle = ecomFragmentSbpBinding.ecomEfsbpTvTitle;
        zdlpuopuiu.dxjokdxxww(ecomEfsbpTvTitle, "ecomEfsbpTvTitle");
        UIPreferencesRepository.FontParams uIFontParams = getUiPreferencesRepository().getUIFontParams(UIPreferencesRepository.Font.BODY);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = getUiPreferencesRepository().getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomEfsbpTvTitle, uIFontParams, uIColorPreferences != null ? Integer.valueOf(uIColorPreferences.getTextPrimary()) : null);
        TextView ecomEfsbpTvSubtitle = ecomFragmentSbpBinding.ecomEfsbpTvSubtitle;
        zdlpuopuiu.dxjokdxxww(ecomEfsbpTvSubtitle, "ecomEfsbpTvSubtitle");
        UIPreferencesRepository.FontParams uIFontParams2 = getUiPreferencesRepository().getUIFontParams(UIPreferencesRepository.Font.FOOTNOTE);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences2 = getUiPreferencesRepository().getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomEfsbpTvSubtitle, uIFontParams2, uIColorPreferences2 != null ? Integer.valueOf(uIColorPreferences2.getTextSecondary()) : null);
        setCorrectRVSize();
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public EcomFragmentSbpBinding getViewBinding() {
        EcomFragmentSbpBinding ecomFragmentSbpBindingInflate = EcomFragmentSbpBinding.inflate(getLayoutInflater());
        zdlpuopuiu.dxjokdxxww(ecomFragmentSbpBindingInflate, "inflate(...)");
        return ecomFragmentSbpBindingInflate;
    }
}
