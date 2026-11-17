package ru.myspar.webview_screen.impl.trackingorder.presentation;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.compose.ui.platform.ComposeView;
import gg.wwaezpbzkn;
import hb2.nufgyqmvbu;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.legacy.presentation.view.BaseWebView;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        cb2.ppxfxbqfkf ppxfxbqfkfVar = (cb2.ppxfxbqfkf) binding.invoke();
        ComposeView cvActionBar = ppxfxbqfkfVar.f19559zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(za2.ppxfxbqfkf.tracking_title);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: hb2.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.webview_screen.impl.trackingorder.presentation.eablkybsjg.wflxmlrfwp(this.f40013zdlpuopuiu);
            }
        }, null, null, 109, null);
        BaseWebView webView = ppxfxbqfkfVar.f19558ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(webView, "webView");
        btonecajqb(webView);
    }

    private final void btonecajqb(WebView webView) {
        p30.zoijcleaow.iobyxmoadg(webView, new ru.myspar.core.domain.utils.webview.iobyxmoadg(new p30.iobyxmoadg(new draadjrbmk() { // from class: hb2.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ru.myspar.webview_screen.impl.trackingorder.presentation.eablkybsjg.gtknphoqwx(this.f40012zdlpuopuiu, (WebResourceRequest) obj));
            }
        }, null, null, new draadjrbmk() { // from class: hb2.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.webview_screen.impl.trackingorder.presentation.eablkybsjg.draadjrbmk(this.f40014zdlpuopuiu, (String) obj);
            }
        }, 6, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(eablkybsjg eablkybsjgVar, String message) {
        zdlpuopuiu.btonecajqb(message, "message");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.zoijcleaow(message));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gtknphoqwx(eablkybsjg eablkybsjgVar, WebResourceRequest request) {
        zdlpuopuiu.btonecajqb(request, "request");
        String string = request.getUrl().toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2539ppxfxbqfkf(string));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f104798iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(cb2.ppxfxbqfkf binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        BaseWebView webView = binding.f19558ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(webView, "webView");
        p30.zoijcleaow.ppxfxbqfkf(webView, model.iobyxmoadg());
    }
}
