package ru.myspar.core.domain.utils.webview;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.jvm.internal.gtknphoqwx;
import rs.wkgbmnqykc;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends WebViewClient {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final p30.iobyxmoadg f87463iobyxmoadg;

    public /* synthetic */ iobyxmoadg(p30.iobyxmoadg iobyxmoadgVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new p30.iobyxmoadg(null, null, null, null, 15, null) : iobyxmoadgVar);
    }

    private final Object eablkybsjg(draadjrbmk draadjrbmkVar, Object obj) {
        Object objWkgbmnqykc;
        wwaezpbzkn wwaezpbzknVar;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            if (draadjrbmkVar != null) {
                draadjrbmkVar.invoke(obj);
                wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } else {
                wwaezpbzknVar = null;
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzknVar);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
        wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.f83693iobyxmoadg;
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
        }
        return objWkgbmnqykc;
    }

    private final void iobyxmoadg(String str, String str2, String str3) {
        wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.f83693iobyxmoadg;
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykcVar, "[WebView]", "[Error] Reason: " + str2 + " Code: " + str3 + " url: " + str, false, 4, null);
        wkgbmnqykcVar.gxszxtbevo(new WebViewException.CommonError(str, str2, str3), new CrashlyticsKey[0]);
    }

    private final void ppxfxbqfkf(String str, String str2) {
        wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.f83693iobyxmoadg;
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykcVar, "[WebView]", "[HttpError] Status Code: " + str2 + " url: " + str, false, 4, null);
        wkgbmnqykcVar.gxszxtbevo(new WebViewException.HttpError(str, str2), new CrashlyticsKey[0]);
    }

    private final boolean wkgbmnqykc(WebResourceRequest webResourceRequest, draadjrbmk draadjrbmkVar) {
        Object objWkgbmnqykc;
        Boolean bool;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            if (draadjrbmkVar != null) {
                try {
                    bool = (Boolean) draadjrbmkVar.invoke(webResourceRequest);
                } catch (Throwable th2) {
                    th = th2;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                bool = null;
            }
            wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "[WebView]", "[OnOverrideLoading] url: " + webResourceRequest.getUrl(), false, 4, null);
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        } catch (Throwable th3) {
            th = th3;
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.f83693iobyxmoadg;
            wkgbmnqykc.wkgbmnqykc(wkgbmnqykcVar, "[WebView]", "[Error] Reason: " + thDxjokdxxww.getMessage() + " url: " + webResourceRequest.getUrl(), false, 4, null);
            wkgbmnqykcVar.gxszxtbevo(new WebViewException.CommonError(webResourceRequest.getUrl().toString(), thDxjokdxxww.getMessage(), null, 4, null), new CrashlyticsKey[0]);
            objWkgbmnqykc = Boolean.FALSE;
        }
        return ((Boolean) objWkgbmnqykc).booleanValue();
    }

    static /* synthetic */ void zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        iobyxmoadgVar.iobyxmoadg(str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "[WebView]", "[Page Finished]: " + str, false, 4, null);
        draadjrbmk draadjrbmkVarPpxfxbqfkf = this.f87463iobyxmoadg.ppxfxbqfkf();
        if (draadjrbmkVarPpxfxbqfkf != null) {
            kcexrzcfyt.iobyxmoadg(eablkybsjg(draadjrbmkVarPpxfxbqfkf, str));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        wkgbmnqykc.wkgbmnqykc(wkgbmnqykc.f83693iobyxmoadg, "[WebView]", "[Page Started]: " + str, false, 4, null);
        draadjrbmk draadjrbmkVarWkgbmnqykc = this.f87463iobyxmoadg.wkgbmnqykc();
        if (draadjrbmkVarWkgbmnqykc != null) {
            kcexrzcfyt.iobyxmoadg(eablkybsjg(draadjrbmkVarWkgbmnqykc, str));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence description;
        String string = null;
        if (webResourceError != null && webResourceError.getErrorCode() != -6) {
            zoijcleaow(this, String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), null, String.valueOf(webResourceError.getErrorCode()), 2, null);
        }
        draadjrbmk draadjrbmkVarIobyxmoadg = this.f87463iobyxmoadg.iobyxmoadg();
        if (draadjrbmkVarIobyxmoadg != null) {
            if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
                string = description.toString();
            }
            if (string == null) {
                string = "";
            }
            draadjrbmkVarIobyxmoadg.invoke(string);
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceResponse != null) {
            ppxfxbqfkf(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), String.valueOf(webResourceResponse.getStatusCode()));
        }
        draadjrbmk draadjrbmkVarIobyxmoadg = this.f87463iobyxmoadg.iobyxmoadg();
        if (draadjrbmkVarIobyxmoadg != null) {
            String reasonPhrase = webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null;
            if (reasonPhrase == null) {
                reasonPhrase = "";
            }
            draadjrbmkVarIobyxmoadg.invoke(reasonPhrase);
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            return wkgbmnqykc(webResourceRequest, this.f87463iobyxmoadg.zoijcleaow());
        }
        return false;
    }

    public iobyxmoadg(p30.iobyxmoadg callback) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callback, "callback");
        this.f87463iobyxmoadg = callback;
    }
}
