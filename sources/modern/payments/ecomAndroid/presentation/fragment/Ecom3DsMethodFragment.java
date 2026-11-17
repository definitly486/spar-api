package modern.payments.ecomAndroid.presentation.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.oxmwwwfdhm;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.BaseFragment;
import modern.payments.ecomAndroid.presentation.fragment.webview.CheckServerTrustedWebViewClient;
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.Ecom3DsMethodAnalytic;
import modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodEvent;
import modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;
import modern.payments.p003ecomandroid.databinding.EcomFragment3dsMethodBinding;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 !2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/Ecom3DsMethodFragment;", "Lmodern/payments/ecomAndroid/presentation/base/BaseFragment;", "Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodEvent;", "Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodViewModel;", "Lmodern/payments/ecomandroid/databinding/EcomFragment3dsMethodBinding;", "<init>", "()V", "Lgg/wwaezpbzkn;", "initWebView", "inject", "observeViewModel", "setUpViews", "onStart", "getViewBinding", "()Lmodern/payments/ecomandroid/databinding/EcomFragment3dsMethodBinding;", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/tracker/ITracker;", "getTracker", "()Lmodern/payments/tracker/ITracker;", "setTracker", "(Lmodern/payments/tracker/ITracker;)V", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "getOptionsRepository", "()Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "setOptionsRepository", "(Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "Ljava/lang/Class;", "getViewModelType", "()Ljava/lang/Class;", "viewModelType", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Ecom3DsMethodFragment extends BaseFragment<Ecom3dsMethodEvent, Ecom3dsMethodViewModel, EcomFragment3dsMethodBinding> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "Ecom3DsMethodFragment";
    public EcomSdkOptionsRepository optionsRepository;
    public ITracker tracker;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/Ecom3DsMethodFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lmodern/payments/ecomAndroid/presentation/fragment/Ecom3DsMethodFragment;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final Ecom3DsMethodFragment newInstance() {
            return new Ecom3DsMethodFragment();
        }

        private Companion() {
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void initWebView() {
        WebView webView = getBinding().ecomInvisibleWvContent;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(2);
        webView.setWebChromeClient(new WebChromeClient() { // from class: modern.payments.ecomAndroid.presentation.fragment.Ecom3DsMethodFragment$initWebView$1$2
        });
        final Context contextRequireContext = requireContext();
        final ITracker tracker = getTracker();
        final EcomSdkOptionsRepository optionsRepository = getOptionsRepository();
        webView.setWebViewClient(new CheckServerTrustedWebViewClient(contextRequireContext, tracker, optionsRepository) { // from class: modern.payments.ecomAndroid.presentation.fragment.Ecom3DsMethodFragment$initWebView$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(contextRequireContext, null, tracker, optionsRepository, 2, null);
                zdlpuopuiu.lqeggnwhkg(contextRequireContext);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                Uri url;
                this.this$0.getViewModel().handleEvent((Ecom3dsMethodEvent) new Ecom3dsMethodEvent.ProcessUrl((request == null || (url = request.getUrl()) == null) ? null : url.toString(), error));
                super.onReceivedError(view, request, error);
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                Uri url;
                Uri url2;
                ITracker tracker2 = this.this$0.getTracker();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("shouldInterceptRequest: ");
                sb3.append((request == null || (url2 = request.getUrl()) == null) ? null : url2.toString());
                ITracker.DefaultImpls.track$default(tracker2, sb3.toString(), null, ITracker.Priority.INFO, "WebView Ecom3DsMethodFragment", 2, null);
                this.this$0.getViewModel().handleEvent((Ecom3dsMethodEvent) new Ecom3dsMethodEvent.ProcessUrl((request == null || (url = request.getUrl()) == null) ? null : url.toString(), null, 2, null));
                return super.shouldInterceptRequest(view, request);
            }
        });
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
    public Class<Ecom3dsMethodViewModel> getViewModelType() {
        return Ecom3dsMethodViewModel.class;
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
        sj.lqeggnwhkg lqeggnwhkgVarLereixgezr = sj.dxjokdxxww.lereixgezr(getViewModel().getUrlData());
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new Ecom3DsMethodFragment$observeViewModel$$inlined$observeData$default$1(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, lqeggnwhkgVarLereixgezr, null, this), 3, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getViewModel().handleAnalyticalEvent(Ecom3DsMethodAnalytic.On3DsViewShow.INSTANCE);
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
        initWebView();
        EcomFragment3dsMethodBinding binding = getBinding();
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = getUiPreferencesRepository().getUIColorPreferences();
        if (uIColorPreferences != null) {
            binding.ecomInvisibleWvProgress.setDotColor(uIColorPreferences.getLoader());
        }
        AppCompatTextView ecomInvisibleWvLoadingText = binding.ecomInvisibleWvLoadingText;
        zdlpuopuiu.dxjokdxxww(ecomInvisibleWvLoadingText, "ecomInvisibleWvLoadingText");
        UIPreferencesRepository.FontParams uIFontParams = getUiPreferencesRepository().getUIFontParams(UIPreferencesRepository.Font.TITLE_3);
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences2 = getUiPreferencesRepository().getUIColorPreferences();
        ViewExtensionsKt.setFontParams(ecomInvisibleWvLoadingText, uIFontParams, uIColorPreferences2 != null ? Integer.valueOf(uIColorPreferences2.getTextPrimary()) : null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public EcomFragment3dsMethodBinding getViewBinding() {
        EcomFragment3dsMethodBinding ecomFragment3dsMethodBindingInflate = EcomFragment3dsMethodBinding.inflate(getLayoutInflater());
        zdlpuopuiu.dxjokdxxww(ecomFragment3dsMethodBindingInflate, "inflate(...)");
        return ecomFragment3dsMethodBindingInflate;
    }
}
