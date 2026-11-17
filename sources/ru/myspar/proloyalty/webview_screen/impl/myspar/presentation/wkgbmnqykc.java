package ru.myspar.proloyalty.webview_screen.impl.myspar.presentation;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.compose.ui.platform.ComposeView;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.legacy.presentation.view.BaseWebView;
import ru.myspar.proloyalty.webview_screen.impl.myspar.domain.args.MySparWebViewTitle;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Uri f102127iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f102128jyumaefscl;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f102129iobyxmoadg;

        static {
            int[] iArr = new int[ww1.iobyxmoadg.values().length];
            try {
                iArr[ww1.iobyxmoadg.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ww1.iobyxmoadg.LEGAL_INFORMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ww1.iobyxmoadg.GAMES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ww1.iobyxmoadg.SURVEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f102129iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding, ww1.iobyxmoadg scenario, String mainUrl) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(scenario, "scenario");
        zdlpuopuiu.btonecajqb(mainUrl, "mainUrl");
        this.f102127iwizpuwonk = Uri.parse(mainUrl);
        BaseWebView baseWebView = ((ax1.ppxfxbqfkf) binding.invoke()).f14723ppxfxbqfkf;
        ww1.iobyxmoadg iobyxmoadgVar = ww1.iobyxmoadg.NONE;
        zdlpuopuiu.lqeggnwhkg(baseWebView);
        if (scenario == iobyxmoadgVar) {
            v11.zoijcleaow.zoijcleaow(baseWebView, null, 1, null);
        } else {
            draadjrbmk(baseWebView, scenario);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(wkgbmnqykc wkgbmnqykcVar, String str) {
        wkgbmnqykcVar.f102128jyumaefscl = false;
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final boolean btonecajqb(Uri uri) {
        NavigationPayload navigationPayloadZoijcleaow = l21.iobyxmoadg.f61374iobyxmoadg.zoijcleaow(uri);
        if (navigationPayloadZoijcleaow != null) {
            ppxfxbqfkf(new zoijcleaow.ppxfxbqfkf(navigationPayloadZoijcleaow));
        }
        return navigationPayloadZoijcleaow != null;
    }

    private final void draadjrbmk(WebView webView, final ww1.iobyxmoadg iobyxmoadgVar) {
        v11.zoijcleaow.iobyxmoadg(webView, new ru.myspar.proloyalty.core.domain.utils.webview.iobyxmoadg(new v11.iobyxmoadg(new draadjrbmk() { // from class: cx1.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.wkgbmnqykc.wflxmlrfwp(iobyxmoadgVar, this, (WebResourceRequest) obj));
            }
        }, null, new draadjrbmk() { // from class: cx1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.wkgbmnqykc.agtfadlqog(this.f26102zdlpuopuiu, (String) obj);
            }
        }, null, 10, null)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    private final boolean gtknphoqwx(Uri uri) {
        if (!this.f102128jyumaefscl) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            if (!kcexrzcfyt.zynmafqrjb(lastPathSegment, ".pdf", false, 2, null)) {
                return this.f102128jyumaefscl ? false : false;
            }
            this.f102128jyumaefscl = true;
            String string = uri.toString();
            zdlpuopuiu.dxjokdxxww(string, "toString(...)");
            ppxfxbqfkf(new zoijcleaow.C2460zoijcleaow(string));
        } else if (this.f102128jyumaefscl && !zdlpuopuiu.eablkybsjg(this.f102127iwizpuwonk.getHost(), uri.getHost())) {
            this.f102128jyumaefscl = true;
            String string2 = uri.toString();
            zdlpuopuiu.dxjokdxxww(string2, "toString(...)");
            ppxfxbqfkf(new zoijcleaow.C2460zoijcleaow(string2));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f102130iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wflxmlrfwp(ww1.iobyxmoadg iobyxmoadgVar, wkgbmnqykc wkgbmnqykcVar, WebResourceRequest request) {
        zdlpuopuiu.btonecajqb(request, "request");
        int i13 = iobyxmoadg.f102129iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return false;
        }
        if (i13 == 2) {
            Uri url = request.getUrl();
            zdlpuopuiu.dxjokdxxww(url, "getUrl(...)");
            return wkgbmnqykcVar.gtknphoqwx(url);
        }
        if (i13 == 3) {
            return wkgbmnqykcVar.btonecajqb(request.getUrl());
        }
        if (i13 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(ax1.ppxfxbqfkf binding, cx1.iobyxmoadg model) {
        String string;
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView cvActionBar = binding.f14724zoijcleaow;
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
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: cx1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.wkgbmnqykc.rgvfuqvkyq(this.f26105zdlpuopuiu);
            }
        }, null, null, 109, null);
        BaseWebView baseWebView = binding.f14723ppxfxbqfkf;
        baseWebView.getSettings().setLoadWithOverviewMode(model.zoijcleaow());
        zdlpuopuiu.lqeggnwhkg(baseWebView);
        String strPpxfxbqfkf = model.ppxfxbqfkf();
        String strWkgbmnqykc = model.wkgbmnqykc();
        if (kcexrzcfyt.zfvoamnweg(strWkgbmnqykc)) {
            strWkgbmnqykc = null;
        }
        v11.zoijcleaow.ppxfxbqfkf(baseWebView, strPpxfxbqfkf, mw1.iobyxmoadg.iobyxmoadg(strWkgbmnqykc));
    }
}
