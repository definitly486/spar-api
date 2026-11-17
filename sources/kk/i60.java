package kk;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class i60 extends es {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final /* synthetic */ npi.spay.rj f57003wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(npi.spay.rj rjVar, Context context) {
        super(context);
        this.f57003wkgbmnqykc = rjVar;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "requireContext()");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence description;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError == null || (description = webResourceError.getDescription()) == null || !mj.kcexrzcfyt.sopmlzcsov(description, "ERR_INTERNET_DISCONNECTED", false, 2, null)) {
            return;
        }
        ((wa0) this.f57003wkgbmnqykc.yadqdtsiqt()).draadjrbmk(rv.f58473iobyxmoadg);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            npi.spay.rj rjVar = this.f57003wkgbmnqykc;
            String string = url.toString();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "url.toString()");
            if (mj.kcexrzcfyt.ntlheqmsrt(string, "spaysdk://payment", true)) {
                ((wa0) rjVar.yadqdtsiqt()).draadjrbmk(new vw(url));
                return true;
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
