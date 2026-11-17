package modern.payments.ecomAndroid.presentation.fragment;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.presentation.fragment.webview.CheckServerTrustedWebViewClient;
import modern.payments.ecomAndroid.presentation.viewModel.ChallengeEvent;
import modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"modern/payments/ecomAndroid/presentation/fragment/EcomChallengeFragment$initWebView$1$3", "Lmodern/payments/ecomAndroid/presentation/fragment/webview/CheckServerTrustedWebViewClient;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Landroid/webkit/WebResourceError;", "error", "Lgg/wwaezpbzkn;", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomChallengeFragment$initWebView$1$3 extends CheckServerTrustedWebViewClient {
    final /* synthetic */ EcomChallengeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcomChallengeFragment$initWebView$1$3(EcomChallengeFragment ecomChallengeFragment, Context context, ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        super(context, null, iTracker, ecomSdkOptionsRepository, 2, null);
        this.this$0 = ecomChallengeFragment;
        zdlpuopuiu.lqeggnwhkg(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shouldInterceptRequest$lambda$0(EcomChallengeFragment this$0) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        this$0.getBinding().ecomEcfWvContent.evaluateJavascript(EcomChallengeFragmentKt.script, null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        EcomChallengeFragment.access$getViewModel(this.this$0).handleEvent((ChallengeEvent) new ChallengeEvent.ProcessError(error));
        super.onReceivedError(view, request, error);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Uri url;
        ITracker tracker = this.this$0.getTracker();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("shouldInterceptRequest: ");
        sb3.append((request == null || (url = request.getUrl()) == null) ? null : url.toString());
        ITracker.DefaultImpls.track$default(tracker, sb3.toString(), null, ITracker.Priority.INFO, "WebView EcomChallengeFragment", 2, null);
        if (kcexrzcfyt.sopmlzcsov(String.valueOf(request != null ? request.getUrl() : null), StringExtensionsKt.decodeBase64(EcomChallengeFragmentKt.POSTBACK_URL), false, 2, null)) {
            WebView webView = this.this$0.getBinding().ecomEcfWvContent;
            final EcomChallengeFragment ecomChallengeFragment = this.this$0;
            webView.post(new Runnable() { // from class: modern.payments.ecomAndroid.presentation.fragment.eablkybsjg
                @Override // java.lang.Runnable
                public final void run() {
                    EcomChallengeFragment$initWebView$1$3.shouldInterceptRequest$lambda$0(ecomChallengeFragment);
                }
            });
        } else {
            if (kcexrzcfyt.sopmlzcsov(String.valueOf(request != null ? request.getUrl() : null), StringExtensionsKt.decodeBase64(EcomChallengeViewModel.PAYMENT_URL), false, 2, null)) {
                EcomChallengeFragment.access$getViewModel(this.this$0).handleEvent((ChallengeEvent) ChallengeEvent.RedirectToTargetUrl.INSTANCE);
            } else {
                EcomChallengeFragment.access$getViewModel(this.this$0).handleEvent((ChallengeEvent) ChallengeEvent.LoadingUrl.INSTANCE);
            }
        }
        return super.shouldInterceptRequest(view, request);
    }
}
