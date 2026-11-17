package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.core.widget.NestedScrollView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomFragmentChallengeBinding implements iobyxmoadg {
    public final WebView ecomEcfWvContent;
    private final NestedScrollView rootView;

    private EcomFragmentChallengeBinding(NestedScrollView nestedScrollView, WebView webView) {
        this.rootView = nestedScrollView;
        this.ecomEcfWvContent = webView;
    }

    public static EcomFragmentChallengeBinding bind(View view) {
        int i13 = R.id.ecomEcfWvContent;
        WebView webView = (WebView) zoijcleaow.iobyxmoadg(view, i13);
        if (webView != null) {
            return new EcomFragmentChallengeBinding((NestedScrollView) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomFragmentChallengeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomFragmentChallengeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_fragment_challenge, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // a6.iobyxmoadg
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
