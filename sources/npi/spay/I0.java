package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import kk.c7;
import kk.ca0;
import kk.gi;
import kk.hb0;
import kk.q1;
import kk.qc0;
import kk.r80;
import kk.wizcaqwiak;
import kk.xe0;
import kk.y80;
import kk.ys;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.I0;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/I0;", "Lnpi/spay/S;", "Lkk/ys;", "Lkk/gi;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class I0 extends S<ys, gi> {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final /* synthetic */ int f70549cqumvgiudr = 0;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public c7 f70550iwizpuwonk;

    public static final void hcddaimhww(I0 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((ys) this$0.yadqdtsiqt()).draadjrbmk(ca0.f56117iobyxmoadg);
    }

    public static final void jpowsppfya(I0 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((ys) this$0.yadqdtsiqt()).draadjrbmk(y80.f59395iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_bnpl_agreement, (ViewGroup) null, false);
        int i13 = R.id.spay_slba_apiv_share_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatImageView != null) {
            i13 = R.id.spay_slba_fl_header_container;
            if (((FrameLayout) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i13 = R.id.spay_slba_tv_btn_return_label;
                if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                    i13 = R.id.spay_slba_tv_title;
                    TextView textView = (TextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (textView != null) {
                        i13 = R.id.f4spay_slba_v_btn_return;
                        CardView cardView = (CardView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (cardView != null) {
                            i13 = R.id.spay_slba_wv_content;
                            WebView webView = (WebView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                            if (webView != null) {
                                gi giVar = new gi(constraintLayout, appCompatImageView, constraintLayout, textView, cardView, webView);
                                zdlpuopuiu.dxjokdxxww(giVar, "inflate(layoutInflater)");
                                return giVar;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return ys.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        gi giVar = (gi) iobyxmoadgVar;
        giVar.f56712zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kk.v3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                I0.hcddaimhww(this.f58941zdlpuopuiu, view);
            }
        });
        giVar.f56707eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: kk.w3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                I0.jpowsppfya(this.f59086zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((ys) yadqdtsiqt()).draadjrbmk(hb0.f56891iobyxmoadg);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((ys) yadqdtsiqt()).draadjrbmk(qc0.f58174iobyxmoadg);
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        Object objYadqdtsiqt = yadqdtsiqt();
        c7 c7Var = objYadqdtsiqt instanceof c7 ? (c7) objYadqdtsiqt : null;
        if (c7Var == null) {
            throw new IllegalStateException("AgreementFragmentViewModel must implement UrlProcessInterface!");
        }
        this.f70550iwizpuwonk = c7Var;
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((gi) iobyxmoadgVar).f56710ppxfxbqfkf.getLayoutParams().height = requireContext().getResources().getDisplayMetrics().heightPixels - getResources().getDimensionPixelSize(R.dimen.spay_bnpl_return_btn_bottom_margin);
        lmojexxdyd();
        iobyxmoadg iobyxmoadgVar2 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        WebView webView = ((gi) iobyxmoadgVar2).f56708gxszxtbevo;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(false);
        settings.setAllowFileAccess(false);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new xe0(this));
    }

    @Override // npi.spay.S
    public final void wwaezpbzkn() {
        kk.rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f70569jyumaefscl = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
        }
    }

    @Override // npi.spay.S
    public final void ylkuphrtab() {
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((ys) yadqdtsiqt()).f59475eablkybsjg);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new kk.iobyxmoadg(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new wizcaqwiak(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((ys) yadqdtsiqt()).f59477lqeggnwhkg), null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new q1(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((ys) yadqdtsiqt()).f59478nufgyqmvbu), null, this), 3, null);
    }
}
