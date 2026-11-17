package tg1;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import sg1.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f110479iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final LinearLayout f110480ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final WebView f110481wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f110482zoijcleaow;

    private zoijcleaow(LinearLayout linearLayout, ComposeView composeView, LinearLayout linearLayout2, WebView webView) {
        this.f110479iobyxmoadg = linearLayout;
        this.f110482zoijcleaow = composeView;
        this.f110480ppxfxbqfkf = linearLayout2;
        this.f110481wkgbmnqykc = webView;
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
        return this.f110479iobyxmoadg;
    }
}
