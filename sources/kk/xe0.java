package kk;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import npi.spay.I0;

/* JADX INFO: loaded from: classes3.dex */
public final class xe0 extends WebViewClient {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final /* synthetic */ I0 f59299iobyxmoadg;

    public xe0(I0 i13) {
        this.f59299iobyxmoadg = i13;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        c7 c7Var = this.f59299iobyxmoadg.f70550iwizpuwonk;
        if (c7Var == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("urlProcessor");
            c7Var = null;
        }
        String str2 = (String) ((ys) c7Var).f59475eablkybsjg.getValue();
        if (str2 != null) {
            return mj.kcexrzcfyt.sopmlzcsov(String.valueOf(str), str2, false, 2, null);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        c7 c7Var = this.f59299iobyxmoadg.f70550iwizpuwonk;
        if (c7Var == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("urlProcessor");
            c7Var = null;
        }
        String string = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
        String str = (String) ((ys) c7Var).f59475eablkybsjg.getValue();
        if (str != null) {
            return mj.kcexrzcfyt.sopmlzcsov(String.valueOf(string), str, false, 2, null);
        }
        return false;
    }
}
