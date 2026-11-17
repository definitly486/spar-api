package cb2;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import ru.myspar.legacy.presentation.view.BaseWebView;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f19557iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final BaseWebView f19558ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f19559zoijcleaow;

    private ppxfxbqfkf(LinearLayout linearLayout, ComposeView composeView, BaseWebView baseWebView) {
        this.f19557iobyxmoadg = linearLayout;
        this.f19559zoijcleaow = composeView;
        this.f19558ppxfxbqfkf = baseWebView;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        int i13 = za2.iobyxmoadg.cvActionBar;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = za2.iobyxmoadg.webView;
            BaseWebView baseWebView = (BaseWebView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (baseWebView != null) {
                return new ppxfxbqfkf((LinearLayout) view, composeView, baseWebView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f19557iobyxmoadg;
    }
}
