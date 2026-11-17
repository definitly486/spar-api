package ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.compose.ui.platform.ComposeView;
import ex1.nufgyqmvbu;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.legacy.presentation.view.BaseWebView;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ax1.ppxfxbqfkf ppxfxbqfkfVar = (ax1.ppxfxbqfkf) binding.invoke();
        ComposeView cvActionBar = ppxfxbqfkfVar.f14724zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(xw1.ppxfxbqfkf.proloyalty_tracking_title);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: ex1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation.eablkybsjg.wflxmlrfwp(this.f32297zdlpuopuiu);
            }
        }, null, null, 109, null);
        BaseWebView webView = ppxfxbqfkfVar.f14723ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(webView, "webView");
        btonecajqb(webView);
    }

    private final void btonecajqb(WebView webView) {
        v11.zoijcleaow.iobyxmoadg(webView, new ru.myspar.proloyalty.core.domain.utils.webview.iobyxmoadg(new v11.iobyxmoadg(new draadjrbmk() { // from class: ex1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation.eablkybsjg.gtknphoqwx(this.f32296zdlpuopuiu, (WebResourceRequest) obj));
            }
        }, null, null, new draadjrbmk() { // from class: ex1.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation.eablkybsjg.draadjrbmk(this.f32298zdlpuopuiu, (String) obj);
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
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2461ppxfxbqfkf(string));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f102159iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(ax1.ppxfxbqfkf binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        BaseWebView webView = binding.f14723ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(webView, "webView");
        v11.zoijcleaow.ppxfxbqfkf(webView, model.zoijcleaow(), mw1.iobyxmoadg.iobyxmoadg(model.iobyxmoadg()));
    }
}
