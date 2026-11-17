package ru.myspar.webview_screen.impl.chatorder.presentation;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.ui.platform.ComposeView;
import bb2.agtfadlqog;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.legacy.presentation.view.BaseWebView;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ValueCallback f104720iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.iobyxmoadg f104721jyumaefscl;

    public static final class iobyxmoadg extends WebChromeClient {
        iobyxmoadg() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            zdlpuopuiu.btonecajqb(webView, "webView");
            zdlpuopuiu.btonecajqb(filePathCallback, "filePathCallback");
            zdlpuopuiu.btonecajqb(fileChooserParams, "fileChooserParams");
            gxszxtbevo.this.f104720iwizpuwonk = filePathCallback;
            gxszxtbevo.this.ppxfxbqfkf(wkgbmnqykc.ppxfxbqfkf.f104731iobyxmoadg);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(tg.iobyxmoadg binding, tg.iobyxmoadg onLoaded) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(onLoaded, "onLoaded");
        this.f104721jyumaefscl = onLoaded;
        cb2.zoijcleaow zoijcleaowVar = (cb2.zoijcleaow) binding.invoke();
        ComposeView cvActionBar = zoijcleaowVar.f19563zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(za2.ppxfxbqfkf.chats_pager_title);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: bb2.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.webview_screen.impl.chatorder.presentation.gxszxtbevo.ojitshcjhn(this.f15686zdlpuopuiu);
            }
        }, null, null, 109, null);
        BaseWebView baseWebView = zoijcleaowVar.f19562wkgbmnqykc;
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
        p30.zoijcleaow.iobyxmoadg(webView, new ru.myspar.core.domain.utils.webview.iobyxmoadg(new p30.iobyxmoadg(null, null, new draadjrbmk() { // from class: bb2.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.webview_screen.impl.chatorder.presentation.gxszxtbevo.wflxmlrfwp(this.f15688zdlpuopuiu, (String) obj);
            }
        }, null, 11, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.ppxfxbqfkf(wkgbmnqykc.zoijcleaow.f104732iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void vdvldrhtss(cb2.zoijcleaow zoijcleaowVar, agtfadlqog agtfadlqogVar) {
        if (!agtfadlqogVar.zoijcleaow() || zdlpuopuiu.eablkybsjg(zoijcleaowVar.f19562wkgbmnqykc.getUrl(), agtfadlqogVar.iobyxmoadg())) {
            return;
        }
        BaseWebView webView = zoijcleaowVar.f19562wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(webView, "webView");
        p30.zoijcleaow.ppxfxbqfkf(webView, agtfadlqogVar.iobyxmoadg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(gxszxtbevo gxszxtbevoVar, String str) {
        gxszxtbevoVar.f104721jyumaefscl.invoke();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void btonecajqb(String fileUri) {
        zdlpuopuiu.btonecajqb(fileUri, "fileUri");
        ValueCallback valueCallback = this.f104720iwizpuwonk;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(new Uri[]{Uri.parse(fileUri)});
        }
        this.f104720iwizpuwonk = null;
    }

    public final void gtknphoqwx() {
        ValueCallback valueCallback = this.f104720iwizpuwonk;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.f104720iwizpuwonk = null;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(cb2.zoijcleaow binding, agtfadlqog model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        MaterialTextView tvInDevelopingMessage = binding.f19561ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvInDevelopingMessage, "tvInDevelopingMessage");
        tvInDevelopingMessage.setVisibility(!model.zoijcleaow() ? 0 : 8);
        BaseWebView webView = binding.f19562wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(webView, "webView");
        webView.setVisibility(model.zoijcleaow() ? 0 : 8);
        vdvldrhtss(binding, model);
    }
}
