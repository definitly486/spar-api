package ru.myspar.webview_screen.impl.myspar.presentation;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.compose.ui.platform.ComposeView;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.legacy.presentation.view.BaseWebView;
import ru.myspar.webview_screen.impl.myspar.domain.args.MySparWebViewTitle;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f104768jyumaefscl;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f104769iobyxmoadg;

        static {
            int[] iArr = new int[eb2.iobyxmoadg.values().length];
            try {
                iArr[eb2.iobyxmoadg.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eb2.iobyxmoadg.LEGAL_INFORMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eb2.iobyxmoadg.GAMES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f104769iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding, eb2.iobyxmoadg scenario) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(scenario, "scenario");
        BaseWebView baseWebView = ((cb2.ppxfxbqfkf) binding.invoke()).f19558ppxfxbqfkf;
        eb2.iobyxmoadg iobyxmoadgVar = eb2.iobyxmoadg.NONE;
        zdlpuopuiu.lqeggnwhkg(baseWebView);
        if (scenario == iobyxmoadgVar) {
            p30.zoijcleaow.zoijcleaow(baseWebView, null, 1, null);
        } else {
            draadjrbmk(baseWebView, scenario);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(wkgbmnqykc wkgbmnqykcVar, String str) {
        wkgbmnqykcVar.f104768jyumaefscl = false;
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final boolean btonecajqb(Uri uri) {
        NavigationPayload navigationPayloadZoijcleaow = g40.iobyxmoadg.f36185iobyxmoadg.zoijcleaow(uri);
        if (navigationPayloadZoijcleaow != null) {
            ppxfxbqfkf(new zoijcleaow.ppxfxbqfkf(navigationPayloadZoijcleaow));
        }
        return navigationPayloadZoijcleaow != null;
    }

    private final void draadjrbmk(WebView webView, final eb2.iobyxmoadg iobyxmoadgVar) {
        p30.zoijcleaow.iobyxmoadg(webView, new ru.myspar.core.domain.utils.webview.iobyxmoadg(new p30.iobyxmoadg(new draadjrbmk() { // from class: fb2.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ru.myspar.webview_screen.impl.myspar.presentation.wkgbmnqykc.wflxmlrfwp(iobyxmoadgVar, this, (WebResourceRequest) obj));
            }
        }, null, new draadjrbmk() { // from class: fb2.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.webview_screen.impl.myspar.presentation.wkgbmnqykc.agtfadlqog(this.f33399zdlpuopuiu, (String) obj);
            }
        }, null, 10, null)));
    }

    private final boolean gtknphoqwx(String str) {
        if (this.f104768jyumaefscl || !kcexrzcfyt.zynmafqrjb(str, ".pdf", false, 2, null)) {
            return false;
        }
        this.f104768jyumaefscl = true;
        ppxfxbqfkf(new zoijcleaow.C2538zoijcleaow(str));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f104770iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wflxmlrfwp(eb2.iobyxmoadg iobyxmoadgVar, wkgbmnqykc wkgbmnqykcVar, WebResourceRequest request) {
        zdlpuopuiu.btonecajqb(request, "request");
        int i13 = iobyxmoadg.f104769iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return false;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return wkgbmnqykcVar.btonecajqb(request.getUrl());
            }
            throw new NoWhenBranchMatchedException();
        }
        String string = request.getUrl().toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return wkgbmnqykcVar.gtknphoqwx(string);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(cb2.ppxfxbqfkf binding, fb2.iobyxmoadg model) {
        String string;
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView cvActionBar = binding.f19559zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        MySparWebViewTitle mySparWebViewTitleIobyxmoadg = model.iobyxmoadg();
        if (mySparWebViewTitleIobyxmoadg instanceof MySparWebViewTitle.StringValue) {
            string = ((MySparWebViewTitle.StringValue) model.iobyxmoadg()).getTitle();
        } else {
            if (!(mySparWebViewTitleIobyxmoadg instanceof MySparWebViewTitle.ResValue)) {
                throw new NoWhenBranchMatchedException();
            }
            string = wkgbmnqykc().getString(((MySparWebViewTitle.ResValue) model.iobyxmoadg()).getRes());
            zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        }
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: fb2.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.webview_screen.impl.myspar.presentation.wkgbmnqykc.rgvfuqvkyq(this.f33398zdlpuopuiu);
            }
        }, null, null, 109, null);
        BaseWebView baseWebView = binding.f19558ppxfxbqfkf;
        baseWebView.getSettings().setLoadWithOverviewMode(model.zoijcleaow());
        zdlpuopuiu.lqeggnwhkg(baseWebView);
        p30.zoijcleaow.ppxfxbqfkf(baseWebView, model.ppxfxbqfkf());
    }
}
