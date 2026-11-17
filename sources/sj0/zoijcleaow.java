package sj0;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import rj0.eablkybsjg;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f107147iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final LinearLayout f107148ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final WebView f107149wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f107150zoijcleaow;

    private zoijcleaow(LinearLayout linearLayout, ComposeView composeView, LinearLayout linearLayout2, WebView webView) {
        this.f107147iobyxmoadg = linearLayout;
        this.f107150zoijcleaow = composeView;
        this.f107148ppxfxbqfkf = linearLayout2;
        this.f107149wkgbmnqykc = webView;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = eablkybsjg.cvActionBar;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i14 = eablkybsjg.webView;
            WebView webView = (WebView) a6.zoijcleaow.iobyxmoadg(view, i14);
            if (webView != null) {
                return new zoijcleaow(linearLayout, composeView, linearLayout, webView);
            }
            i13 = i14;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f107147iobyxmoadg;
    }
}
