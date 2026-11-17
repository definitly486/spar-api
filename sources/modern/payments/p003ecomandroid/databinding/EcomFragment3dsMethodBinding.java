package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import modern.payments.ecomAndroid.presentation.view.EcomDotsLoaderView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomFragment3dsMethodBinding implements iobyxmoadg {
    public final WebView ecomInvisibleWvContent;
    public final AppCompatTextView ecomInvisibleWvLoadingText;
    public final EcomDotsLoaderView ecomInvisibleWvProgress;
    private final ConstraintLayout rootView;

    private EcomFragment3dsMethodBinding(ConstraintLayout constraintLayout, WebView webView, AppCompatTextView appCompatTextView, EcomDotsLoaderView ecomDotsLoaderView) {
        this.rootView = constraintLayout;
        this.ecomInvisibleWvContent = webView;
        this.ecomInvisibleWvLoadingText = appCompatTextView;
        this.ecomInvisibleWvProgress = ecomDotsLoaderView;
    }

    public static EcomFragment3dsMethodBinding bind(View view) {
        int i13 = R.id.ecomInvisibleWvContent;
        WebView webView = (WebView) zoijcleaow.iobyxmoadg(view, i13);
        if (webView != null) {
            i13 = R.id.ecomInvisibleWvLoadingText;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatTextView != null) {
                i13 = R.id.ecomInvisibleWvProgress;
                EcomDotsLoaderView ecomDotsLoaderView = (EcomDotsLoaderView) zoijcleaow.iobyxmoadg(view, i13);
                if (ecomDotsLoaderView != null) {
                    return new EcomFragment3dsMethodBinding((ConstraintLayout) view, webView, appCompatTextView, ecomDotsLoaderView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomFragment3dsMethodBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomFragment3dsMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_fragment_3ds_method, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // a6.iobyxmoadg
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
