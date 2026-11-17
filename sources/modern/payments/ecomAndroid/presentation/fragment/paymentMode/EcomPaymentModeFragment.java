package modern.payments.ecomAndroid.presentation.fragment.paymentMode;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.adapter.decorator.VerticalSpacingItemDecorationLastExcluded;
import modern.payments.ecomAndroid.presentation.base.BaseFragment;
import modern.payments.ecomAndroid.presentation.base.CompositeDelegateAdapter;
import modern.payments.ecomAndroid.presentation.view.EcomButtonView;
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomPaymentMethodAnalytic;
import modern.payments.ecomAndroid.util.extension.ContextExtensionsKt;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;
import modern.payments.ecomAndroid.util.view.FragmentUtilsKt;
import modern.payments.p003ecomandroid.R;
import modern.payments.p003ecomandroid.databinding.EcomFragmentPaymentModeBinding;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/EcomPaymentModeFragment;", "Lmodern/payments/ecomAndroid/presentation/base/BaseFragment;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/EcomPaymentModeViewModel;", "Lmodern/payments/ecomandroid/databinding/EcomFragmentPaymentModeBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lgg/wwaezpbzkn;", "onCreate", "(Landroid/os/Bundle;)V", "inject", "onStart", "setUpViews", "observeViewModel", "getViewBinding", "()Lmodern/payments/ecomandroid/databinding/EcomFragmentPaymentModeBinding;", "Lmodern/payments/ecomAndroid/presentation/base/CompositeDelegateAdapter;", "paymentModesAdapter$delegate", "Lgg/gtknphoqwx;", "getPaymentModesAdapter", "()Lmodern/payments/ecomAndroid/presentation/base/CompositeDelegateAdapter;", "paymentModesAdapter", "Ljava/lang/Class;", "getViewModelType", "()Ljava/lang/Class;", "viewModelType", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomPaymentModeFragment extends BaseFragment<PaymentModeEvent, EcomPaymentModeViewModel, EcomFragmentPaymentModeBinding> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEFAULT_BANK_APP_AUTH_URI = "c2JlcmJhbmtpZGxvZ2luOi8vc2JlcmJhbmtpZA==";
    public static final String TAG = "EcomPaymentModeFragment";

    /* JADX INFO: renamed from: paymentModesAdapter$delegate, reason: from kotlin metadata */
    private final gtknphoqwx paymentModesAdapter = draadjrbmk.zoijcleaow(new EcomPaymentModeFragment$paymentModesAdapter$2(this));

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/EcomPaymentModeFragment$Companion;", "", "()V", "DEFAULT_BANK_APP_AUTH_URI", "", "TAG", "newInstance", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/EcomPaymentModeFragment;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EcomPaymentModeFragment newInstance() {
            return new EcomPaymentModeFragment();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CompositeDelegateAdapter getPaymentModesAdapter() {
        return (CompositeDelegateAdapter) this.paymentModesAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpViews$lambda$2$lambda$1$lambda$0(EcomPaymentModeFragment this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        this$0.getViewModel().handleEvent((PaymentModeEvent) PaymentModeEvent.CloseEvent.INSTANCE);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public Class<EcomPaymentModeViewModel> getViewModelType() {
        return EcomPaymentModeViewModel.class;
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
        wypolnanlu state = getViewModel().getState();
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomPaymentModeFragment$observeViewModel$$inlined$observeData$default$1(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, state, null, this), 3, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getViewModel().handleAnalyticalEvent(EcomPaymentMethodAnalytic.OnPaymentMethodViewAppeared.INSTANCE);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void setUpViews() {
        EcomFragmentPaymentModeBinding binding = getBinding();
        super.setUpViews();
        Fragment parentFragment = ((Fragment) getParentFragmentManager().igdgnonuha().get(0)).getParentFragment();
        BottomSheetDialogFragment bottomSheetDialogFragment = parentFragment instanceof BottomSheetDialogFragment ? (BottomSheetDialogFragment) parentFragment : null;
        if (bottomSheetDialogFragment != null) {
            FragmentUtilsKt.setupTopPadding$default(bottomSheetDialogFragment, 0, 1, null);
        }
        binding.ecomEfpmRvModeList.setAdapter(getPaymentModesAdapter());
        RecyclerView recyclerView = binding.ecomEfpmRvModeList;
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        recyclerView.btonecajqb(new VerticalSpacingItemDecorationLastExcluded(ContextExtensionsKt.getPixelsFromDp(contextRequireContext, R.dimen.ecom_8dp), false, 2, null));
        EcomButtonView ecomButtonView = binding.ecomEfpmMbClose;
        ecomButtonView.setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentMode.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcomPaymentModeFragment.setUpViews$lambda$2$lambda$1$lambda$0(this.f67689zdlpuopuiu, view);
            }
        });
        ecomButtonView.applyUIPreferences(getUiPreferencesRepository(), UIPreferencesRepository.ButtonType.TRANSPARENT);
        TextView ecomEfpmTvAmount = binding.ecomEfpmTvAmount;
        zdlpuopuiu.dxjokdxxww(ecomEfpmTvAmount, "ecomEfpmTvAmount");
        UIPreferencesRepository.FontParams uIFontParams = getUiPreferencesRepository().getUIFontParams(UIPreferencesRepository.Font.TITLE_1);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = getUiPreferencesRepository().getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomEfpmTvAmount, uIFontParams, uIColorPreferences != null ? Integer.valueOf(uIColorPreferences.getTextPrimary()) : null);
        TextView ecomEfpmTvClientName = binding.ecomEfpmTvClientName;
        zdlpuopuiu.dxjokdxxww(ecomEfpmTvClientName, "ecomEfpmTvClientName");
        UIPreferencesRepository.FontParams uIFontParams2 = getUiPreferencesRepository().getUIFontParams(UIPreferencesRepository.Font.FOOTNOTE);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences2 = getUiPreferencesRepository().getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomEfpmTvClientName, uIFontParams2, uIColorPreferences2 != null ? Integer.valueOf(uIColorPreferences2.getTextSecondary()) : null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public EcomFragmentPaymentModeBinding getViewBinding() {
        EcomFragmentPaymentModeBinding ecomFragmentPaymentModeBindingInflate = EcomFragmentPaymentModeBinding.inflate(getLayoutInflater());
        zdlpuopuiu.dxjokdxxww(ecomFragmentPaymentModeBindingInflate, "inflate(...)");
        return ecomFragmentPaymentModeBindingInflate;
    }
}
