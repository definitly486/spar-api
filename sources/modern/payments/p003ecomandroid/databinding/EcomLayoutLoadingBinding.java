package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import modern.payments.ecomAndroid.presentation.view.EcomDotsLoaderView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomLayoutLoadingBinding implements iobyxmoadg {
    public final AppCompatTextView ecomSllActvLocalSessionId;
    public final ConstraintLayout ecomSllRoot;
    public final EcomDotsLoaderView ecomSllSdlvProgress;
    public final AppCompatTextView ecomSllTvLoadingText;
    private final ConstraintLayout rootView;

    private EcomLayoutLoadingBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, EcomDotsLoaderView ecomDotsLoaderView, AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.ecomSllActvLocalSessionId = appCompatTextView;
        this.ecomSllRoot = constraintLayout2;
        this.ecomSllSdlvProgress = ecomDotsLoaderView;
        this.ecomSllTvLoadingText = appCompatTextView2;
    }

    public static EcomLayoutLoadingBinding bind(View view) {
        int i13 = R.id.ecomSllActvLocalSessionId;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatTextView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i13 = R.id.ecomSllSdlvProgress;
            EcomDotsLoaderView ecomDotsLoaderView = (EcomDotsLoaderView) zoijcleaow.iobyxmoadg(view, i13);
            if (ecomDotsLoaderView != null) {
                i13 = R.id.ecomSllTvLoadingText;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatTextView2 != null) {
                    return new EcomLayoutLoadingBinding(constraintLayout, appCompatTextView, constraintLayout, ecomDotsLoaderView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomLayoutLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomLayoutLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_layout_loading, viewGroup, false);
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
