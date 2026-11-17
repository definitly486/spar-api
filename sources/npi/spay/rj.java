package npi.spay;

import a6.zoijcleaow;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.iobyxmoadg;
import androidx.lifecycle.oxmwwwfdhm;
import kk.c40;
import kk.l70;
import kk.n00;
import kk.s70;
import kk.wa0;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.gtknphoqwx;
import sj.zynmafqrjb;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/rj;", "Lnpi/spay/S;", "Lkk/wa0;", "Lkk/s70;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class rj extends S<wa0, s70> {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final /* synthetic */ int f70583cqumvgiudr = 0;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final n00 f70584iwizpuwonk = new n00(this);

    public static final void hcddaimhww(rj rjVar) {
        rjVar.getClass();
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).addTransportType(2).build();
        Object systemService = iobyxmoadg.getSystemService(rjVar.requireContext(), ConnectivityManager.class);
        zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).requestNetwork(networkRequestBuild, rjVar.f70584iwizpuwonk);
    }

    @Override // npi.spay.S
    public final a6.iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_phone_number_auth_via_web_view, (ViewGroup) null, false);
        int i13 = R.id.spay_slpnavwv_actv_mock_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_slpnavwv_wv;
            WebView webView = (WebView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (webView != null) {
                return new s70((FrameLayout) viewInflate, appCompatTextView, webView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    public final Class iozdgvuglv() {
        return wa0.class;
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new l70(this, null), 3, null);
        a6.iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        WebView webView = ((s70) iobyxmoadgVar).f58528ppxfxbqfkf;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(true);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
    }

    @Override // npi.spay.S
    public final void wwaezpbzkn() {
    }

    @Override // npi.spay.S
    public final void ylkuphrtab() {
        zynmafqrjb zynmafqrjbVar = ((wa0) yadqdtsiqt()).f59119eablkybsjg;
        gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new c40(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, zynmafqrjbVar, null, this), 3, null);
    }
}
