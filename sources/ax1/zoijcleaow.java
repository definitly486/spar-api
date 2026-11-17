package ax1;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.legacy.presentation.view.BaseWebView;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f14725iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f14726ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final BaseWebView f14727wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f14728zoijcleaow;

    private zoijcleaow(LinearLayout linearLayout, ComposeView composeView, MaterialTextView materialTextView, BaseWebView baseWebView) {
        this.f14725iobyxmoadg = linearLayout;
        this.f14728zoijcleaow = composeView;
        this.f14726ppxfxbqfkf = materialTextView;
        this.f14727wkgbmnqykc = baseWebView;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = xw1.iobyxmoadg.cvActionBar;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = xw1.iobyxmoadg.tvInDevelopingMessage;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                i13 = xw1.iobyxmoadg.webView;
                BaseWebView baseWebView = (BaseWebView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (baseWebView != null) {
                    return new zoijcleaow((LinearLayout) view, composeView, materialTextView, baseWebView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f14725iobyxmoadg;
    }
}
