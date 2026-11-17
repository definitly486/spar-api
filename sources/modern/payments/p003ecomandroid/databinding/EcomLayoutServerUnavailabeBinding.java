package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import modern.payments.ecomAndroid.presentation.view.EcomButtonView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomLayoutServerUnavailabeBinding implements iobyxmoadg {
    public final EcomButtonView ecomElniEbvClose;
    public final AppCompatTextView ecomElsuActvSubtitle;
    public final AppCompatTextView ecomElsuActvTitle;
    public final ImageView ecomElsuIvErrorIcon;
    public final ConstraintLayout ecomElsuRoot;
    private final ConstraintLayout rootView;

    private EcomLayoutServerUnavailabeBinding(ConstraintLayout constraintLayout, EcomButtonView ecomButtonView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ImageView imageView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.ecomElniEbvClose = ecomButtonView;
        this.ecomElsuActvSubtitle = appCompatTextView;
        this.ecomElsuActvTitle = appCompatTextView2;
        this.ecomElsuIvErrorIcon = imageView;
        this.ecomElsuRoot = constraintLayout2;
    }

    public static EcomLayoutServerUnavailabeBinding bind(View view) {
        int i13 = R.id.ecomElniEbvClose;
        EcomButtonView ecomButtonView = (EcomButtonView) zoijcleaow.iobyxmoadg(view, i13);
        if (ecomButtonView != null) {
            i13 = R.id.ecomElsuActvSubtitle;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatTextView != null) {
                i13 = R.id.ecomElsuActvTitle;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatTextView2 != null) {
                    i13 = R.id.ecomElsuIvErrorIcon;
                    ImageView imageView = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
                    if (imageView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new EcomLayoutServerUnavailabeBinding(constraintLayout, ecomButtonView, appCompatTextView, appCompatTextView2, imageView, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomLayoutServerUnavailabeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomLayoutServerUnavailabeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_layout_server_unavailabe, viewGroup, false);
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
