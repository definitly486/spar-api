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
public final class EcomLayoutNoInternetBinding implements iobyxmoadg {
    public final AppCompatTextView ecomElniActvSubtitle;
    public final AppCompatTextView ecomElniActvTitle;
    public final EcomButtonView ecomElniEbvToPaymentMethodsButton;
    public final EcomButtonView ecomElniEbvTryAgainButton;
    public final ConstraintLayout ecomElniRoot;
    public final ImageView ecomLeIvErrorIcon;
    public final ImageView ecomLeIvErrorIconBg;
    private final ConstraintLayout rootView;

    private EcomLayoutNoInternetBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, EcomButtonView ecomButtonView, EcomButtonView ecomButtonView2, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2) {
        this.rootView = constraintLayout;
        this.ecomElniActvSubtitle = appCompatTextView;
        this.ecomElniActvTitle = appCompatTextView2;
        this.ecomElniEbvToPaymentMethodsButton = ecomButtonView;
        this.ecomElniEbvTryAgainButton = ecomButtonView2;
        this.ecomElniRoot = constraintLayout2;
        this.ecomLeIvErrorIcon = imageView;
        this.ecomLeIvErrorIconBg = imageView2;
    }

    public static EcomLayoutNoInternetBinding bind(View view) {
        int i13 = R.id.ecomElniActvSubtitle;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatTextView != null) {
            i13 = R.id.ecomElniActvTitle;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatTextView2 != null) {
                i13 = R.id.ecomElniEbvToPaymentMethodsButton;
                EcomButtonView ecomButtonView = (EcomButtonView) zoijcleaow.iobyxmoadg(view, i13);
                if (ecomButtonView != null) {
                    i13 = R.id.ecomElniEbvTryAgainButton;
                    EcomButtonView ecomButtonView2 = (EcomButtonView) zoijcleaow.iobyxmoadg(view, i13);
                    if (ecomButtonView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i13 = R.id.ecomLeIvErrorIcon;
                        ImageView imageView = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
                        if (imageView != null) {
                            i13 = R.id.ecomLeIvErrorIconBg;
                            ImageView imageView2 = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
                            if (imageView2 != null) {
                                return new EcomLayoutNoInternetBinding(constraintLayout, appCompatTextView, appCompatTextView2, ecomButtonView, ecomButtonView2, constraintLayout, imageView, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomLayoutNoInternetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomLayoutNoInternetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_layout_no_internet, viewGroup, false);
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
