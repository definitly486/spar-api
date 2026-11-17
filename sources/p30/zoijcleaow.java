package p30;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import d6.ppxfxbqfkf;
import gg.wwaezpbzkn;
import i10.wkgbmnqykc;
import k30.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    private static final void eablkybsjg(WebView webView) {
        if (ppxfxbqfkf.iobyxmoadg("FORCE_DARK")) {
            d6.iobyxmoadg.ppxfxbqfkf(webView.getSettings(), 2);
        }
    }

    private static final void gxszxtbevo(WebView webView) {
        webView.setBackgroundColor(0);
        Context context = webView.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        if (c60.zoijcleaow.eablkybsjg(context)) {
            if (wkgbmnqykc.iobyxmoadg() == i10.ppxfxbqfkf.HUAWEI) {
                eablkybsjg(webView);
            } else {
                wkgbmnqykc(webView);
            }
        }
    }

    public static final void iobyxmoadg(WebView webView, WebViewClient client) {
        zdlpuopuiu.btonecajqb(webView, "<this>");
        zdlpuopuiu.btonecajqb(client, "client");
        gxszxtbevo(webView);
        webView.getSettings().setUserAgentString(xx.iobyxmoadg.f123319iobyxmoadg.iwxlajgraz());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setWebViewClient(client);
    }

    public static final wwaezpbzkn ppxfxbqfkf(WebView webView, String url) {
        zdlpuopuiu.btonecajqb(webView, "<this>");
        zdlpuopuiu.btonecajqb(url, "url");
        String strWkgbmnqykc = draadjrbmk.wkgbmnqykc(url);
        if (strWkgbmnqykc == null) {
            return null;
        }
        webView.loadUrl(strWkgbmnqykc);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void wkgbmnqykc(WebView webView) {
        if (ppxfxbqfkf.iobyxmoadg("ALGORITHMIC_DARKENING")) {
            d6.iobyxmoadg.zoijcleaow(webView.getSettings(), true);
        }
    }

    public static /* synthetic */ void zoijcleaow(WebView webView, WebViewClient webViewClient, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            webViewClient = new ru.myspar.core.domain.utils.webview.iobyxmoadg(null, 1, null);
        }
        iobyxmoadg(webView, webViewClient);
    }
}
