package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import modern.payments.ecomAndroid.presentation.view.EcomButtonView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomLayoutDefaultErrorBinding implements iobyxmoadg {
    public final AppCompatTextView ecomLeActvLocalSessionId;
    public final EcomButtonView ecomLeEbvClose;
    public final ImageView ecomLeIvErrorIcon;
    public final ConstraintLayout ecomLeRoot;
    public final TextView ecomLeTvErrorDescr;
    public final TextView ecomLeTvErrorText;
    private final ConstraintLayout rootView;

    private EcomLayoutDefaultErrorBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, EcomButtonView ecomButtonView, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.ecomLeActvLocalSessionId = appCompatTextView;
        this.ecomLeEbvClose = ecomButtonView;
        this.ecomLeIvErrorIcon = imageView;
        this.ecomLeRoot = constraintLayout2;
        this.ecomLeTvErrorDescr = textView;
        this.ecomLeTvErrorText = textView2;
    }

    public static EcomLayoutDefaultErrorBinding bind(View view) {
        int i13 = R.id.ecomLeActvLocalSessionId;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatTextView != null) {
            i13 = R.id.ecomLeEbvClose;
            EcomButtonView ecomButtonView = (EcomButtonView) zoijcleaow.iobyxmoadg(view, i13);
            if (ecomButtonView != null) {
                i13 = R.id.ecomLeIvErrorIcon;
                ImageView imageView = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i13 = R.id.ecomLeTvErrorDescr;
                    TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                    if (textView != null) {
                        i13 = R.id.ecomLeTvErrorText;
                        TextView textView2 = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                        if (textView2 != null) {
                            return new EcomLayoutDefaultErrorBinding(constraintLayout, appCompatTextView, ecomButtonView, imageView, constraintLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomLayoutDefaultErrorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomLayoutDefaultErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_layout_default_error, viewGroup, false);
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
