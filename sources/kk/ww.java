package kk;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class ww extends z3 {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final /* synthetic */ nr f59202ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f59203zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(RedirectActivity redirectActivity, nr nrVar) {
        super(redirectActivity);
        this.f59203zoijcleaow = redirectActivity;
        this.f59202ppxfxbqfkf = nrVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            RedirectActivity redirectActivity = this.f59203zoijcleaow;
            nr nrVar = this.f59202ppxfxbqfkf;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(new ou(url, nrVar, redirectActivity), "block");
            sv block = new sv(url, nrVar, redirectActivity);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
            block.invoke();
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
