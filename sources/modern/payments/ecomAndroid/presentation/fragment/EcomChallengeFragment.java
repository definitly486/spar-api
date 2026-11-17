package modern.payments.ecomAndroid.presentation.fragment;

import android.annotation.SuppressLint;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.lifecycle.oxmwwwfdhm;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.presentation.base.BaseFragment;
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomChallengeAnalytic;
import modern.payments.ecomAndroid.presentation.viewModel.ChallengeEvent;
import modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel;
import modern.payments.p003ecomandroid.R;
import modern.payments.p003ecomandroid.databinding.EcomFragmentChallengeBinding;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\"!B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomChallengeFragment;", "Lmodern/payments/ecomAndroid/presentation/base/BaseFragment;", "Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomChallengeViewModel;", "Lmodern/payments/ecomandroid/databinding/EcomFragmentChallengeBinding;", "<init>", "()V", "Lgg/wwaezpbzkn;", "initWebView", "inject", "observeViewModel", "setUpViews", "onStart", "getViewBinding", "()Lmodern/payments/ecomandroid/databinding/EcomFragmentChallengeBinding;", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/tracker/ITracker;", "getTracker", "()Lmodern/payments/tracker/ITracker;", "setTracker", "(Lmodern/payments/tracker/ITracker;)V", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "getOptionsRepository", "()Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "setOptionsRepository", "(Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "Ljava/lang/Class;", "getViewModelType", "()Ljava/lang/Class;", "viewModelType", "Companion", "AndroidListener", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomChallengeFragment extends BaseFragment<ChallengeEvent, EcomChallengeViewModel, EcomFragmentChallengeBinding> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "EcomChallengeFragment";
    public EcomSdkOptionsRepository optionsRepository;
    public ITracker tracker;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomChallengeFragment$AndroidListener;", "", "<init>", "(Lmodern/payments/ecomAndroid/presentation/fragment/EcomChallengeFragment;)V", "", "html", "Lgg/wwaezpbzkn;", "processHTML", "(Ljava/lang/String;)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class AndroidListener {
        public AndroidListener() {
        }

        @JavascriptInterface
        public final void processHTML(String html) {
            ITracker.DefaultImpls.track$default(EcomChallengeFragment.this.getTracker(), "processHTML: " + html, null, ITracker.Priority.INFO, "WebView EcomChallengeFragment", 2, null);
            EcomChallengeFragment.access$getViewModel(EcomChallengeFragment.this).handleEvent((ChallengeEvent) new ChallengeEvent.ProcessHTML(html));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/EcomChallengeFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lmodern/payments/ecomAndroid/presentation/fragment/EcomChallengeFragment;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EcomChallengeFragment newInstance() {
            return new EcomChallengeFragment();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ EcomChallengeViewModel access$getViewModel(EcomChallengeFragment ecomChallengeFragment) {
        return ecomChallengeFragment.getViewModel();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void initWebView() {
        WebView webView = getBinding().ecomEcfWvContent;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(2);
        getBinding().ecomEcfWvContent.addJavascriptInterface(new AndroidListener(), "AndroidListener");
        webView.setWebChromeClient(new WebChromeClient() { // from class: modern.payments.ecomAndroid.presentation.fragment.EcomChallengeFragment$initWebView$1$2
        });
        webView.setWebViewClient(new EcomChallengeFragment$initWebView$1$3(this, requireContext(), getTracker(), getOptionsRepository()));
    }

    public final EcomSdkOptionsRepository getOptionsRepository() {
        EcomSdkOptionsRepository ecomSdkOptionsRepository = this.optionsRepository;
        if (ecomSdkOptionsRepository != null) {
            return ecomSdkOptionsRepository;
        }
        zdlpuopuiu.pmvmpeiblj("optionsRepository");
        return null;
    }

    public final ITracker getTracker() {
        ITracker iTracker = this.tracker;
        if (iTracker != null) {
            return iTracker;
        }
        zdlpuopuiu.pmvmpeiblj("tracker");
        return null;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public Class<EcomChallengeViewModel> getViewModelType() {
        return EcomChallengeViewModel.class;
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
        sj.lqeggnwhkg lqeggnwhkgVarLereixgezr = sj.dxjokdxxww.lereixgezr(getViewModel().getHtmlData());
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new EcomChallengeFragment$observeViewModel$$inlined$observeData$default$1(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, lqeggnwhkgVarLereixgezr, null, this), 3, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getViewModel().handleAnalyticalEvent(EcomChallengeAnalytic.On3DsViewShow.INSTANCE);
    }

    public final void setOptionsRepository(EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "<set-?>");
        this.optionsRepository = ecomSdkOptionsRepository;
    }

    public final void setTracker(ITracker iTracker) {
        zdlpuopuiu.btonecajqb(iTracker, "<set-?>");
        this.tracker = iTracker;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void setUpViews() {
        super.setUpViews();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ecom_bottom_sheet_margin);
        getBinding().getRoot().getLayoutParams().height = requireContext().getResources().getDisplayMetrics().heightPixels - dimensionPixelSize;
        initWebView();
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public EcomFragmentChallengeBinding getViewBinding() {
        EcomFragmentChallengeBinding ecomFragmentChallengeBindingInflate = EcomFragmentChallengeBinding.inflate(getLayoutInflater());
        zdlpuopuiu.dxjokdxxww(ecomFragmentChallengeBindingInflate, "inflate(...)");
        return ecomFragmentChallengeBindingInflate;
    }
}
