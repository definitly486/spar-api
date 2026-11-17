package ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.legacy.presentation.view.BaseWebView;
import tg.draadjrbmk;
import zw1.agtfadlqog;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ValueCallback f102077iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.iobyxmoadg f102078jyumaefscl;

    public static final class iobyxmoadg extends WebChromeClient {
        iobyxmoadg() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            zdlpuopuiu.btonecajqb(webView, "webView");
            zdlpuopuiu.btonecajqb(filePathCallback, "filePathCallback");
            zdlpuopuiu.btonecajqb(fileChooserParams, "fileChooserParams");
            gxszxtbevo.this.f102077iwizpuwonk = filePathCallback;
            gxszxtbevo.this.ppxfxbqfkf(wkgbmnqykc.ppxfxbqfkf.f102088iobyxmoadg);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(tg.iobyxmoadg binding, tg.iobyxmoadg onLoaded) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(onLoaded, "onLoaded");
        this.f102078jyumaefscl = onLoaded;
        ax1.zoijcleaow zoijcleaowVar = (ax1.zoijcleaow) binding.invoke();
        ComposeView cvActionBar = zoijcleaowVar.f14728zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(xw1.ppxfxbqfkf.proloyalty_chats_pager_title);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: zw1.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation.gxszxtbevo.ojitshcjhn(this.f131452zdlpuopuiu);
            }
        }, null, null, 109, null);
        BaseWebView baseWebView = zoijcleaowVar.f14727wkgbmnqykc;
        zdlpuopuiu.lqeggnwhkg(baseWebView);
        draadjrbmk(baseWebView);
        baseWebView.getSettings().setAllowFileAccess(true);
        baseWebView.getSettings().setLoadWithOverviewMode(true);
        agtfadlqog(baseWebView);
    }

    private final void agtfadlqog(WebView webView) {
        webView.setWebChromeClient(new iobyxmoadg());
    }

    private final void draadjrbmk(WebView webView) {
        v11.zoijcleaow.iobyxmoadg(webView, new ru.myspar.proloyalty.core.domain.utils.webview.iobyxmoadg(new v11.iobyxmoadg(null, null, new draadjrbmk() { // from class: zw1.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation.gxszxtbevo.wflxmlrfwp(this.f131454zdlpuopuiu, (String) obj);
            }
        }, null, 11, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.ppxfxbqfkf(wkgbmnqykc.zoijcleaow.f102089iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void vdvldrhtss(ax1.zoijcleaow zoijcleaowVar, agtfadlqog agtfadlqogVar) {
        if (!agtfadlqogVar.ppxfxbqfkf() || zdlpuopuiu.eablkybsjg(zoijcleaowVar.f14727wkgbmnqykc.getUrl(), agtfadlqogVar.zoijcleaow())) {
            return;
        }
        BaseWebView webView = zoijcleaowVar.f14727wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(webView, "webView");
        v11.zoijcleaow.ppxfxbqfkf(webView, agtfadlqogVar.zoijcleaow(), mw1.iobyxmoadg.iobyxmoadg(agtfadlqogVar.iobyxmoadg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(gxszxtbevo gxszxtbevoVar, String str) {
        gxszxtbevoVar.f102078jyumaefscl.invoke();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void btonecajqb(String fileUri) {
        zdlpuopuiu.btonecajqb(fileUri, "fileUri");
        ValueCallback valueCallback = this.f102077iwizpuwonk;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(new Uri[]{Uri.parse(fileUri)});
        }
        this.f102077iwizpuwonk = null;
    }

    public final void gtknphoqwx() {
        ValueCallback valueCallback = this.f102077iwizpuwonk;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.f102077iwizpuwonk = null;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(ax1.zoijcleaow binding, agtfadlqog model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        MaterialTextView tvInDevelopingMessage = binding.f14726ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvInDevelopingMessage, "tvInDevelopingMessage");
        tvInDevelopingMessage.setVisibility(!model.ppxfxbqfkf() ? 0 : 8);
        BaseWebView webView = binding.f14727wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(webView, "webView");
        webView.setVisibility(model.ppxfxbqfkf() ? 0 : 8);
        vdvldrhtss(binding, model);
    }
}
