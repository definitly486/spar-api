package cb2;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.BaseWebView;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f19560iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f19561ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final BaseWebView f19562wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f19563zoijcleaow;

    private zoijcleaow(LinearLayout linearLayout, ComposeView composeView, MaterialTextView materialTextView, BaseWebView baseWebView) {
        this.f19560iobyxmoadg = linearLayout;
        this.f19563zoijcleaow = composeView;
        this.f19561ppxfxbqfkf = materialTextView;
        this.f19562wkgbmnqykc = baseWebView;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = za2.iobyxmoadg.cvActionBar;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = za2.iobyxmoadg.tvInDevelopingMessage;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                i13 = za2.iobyxmoadg.webView;
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
        return this.f19560iobyxmoadg;
    }
}
