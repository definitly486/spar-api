package v11;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import d6.ppxfxbqfkf;
import gg.wwaezpbzkn;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import q11.dxjokdxxww;
import yz0.wkgbmnqykc;

/* JADX INFO: loaded from: classes5.dex */
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
        if (p41.ppxfxbqfkf.eablkybsjg(context)) {
            if (wkgbmnqykc.iobyxmoadg() == yz0.ppxfxbqfkf.HUAWEI) {
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
        webView.getSettings().setUserAgentString(uw0.ppxfxbqfkf.f114521iobyxmoadg.kegysxyocb());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setWebViewClient(client);
    }

    public static final wwaezpbzkn ppxfxbqfkf(WebView webView, String url, Map headers) {
        zdlpuopuiu.btonecajqb(webView, "<this>");
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(headers, "headers");
        String strWkgbmnqykc = dxjokdxxww.wkgbmnqykc(url);
        if (strWkgbmnqykc == null) {
            return null;
        }
        webView.loadUrl(strWkgbmnqykc, headers);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void wkgbmnqykc(WebView webView) {
        if (ppxfxbqfkf.iobyxmoadg("ALGORITHMIC_DARKENING")) {
            d6.iobyxmoadg.zoijcleaow(webView.getSettings(), true);
        }
    }

    public static /* synthetic */ void zoijcleaow(WebView webView, WebViewClient webViewClient, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            webViewClient = new ru.myspar.proloyalty.core.domain.utils.webview.iobyxmoadg(null, 1, null);
        }
        iobyxmoadg(webView, webViewClient);
    }
}
