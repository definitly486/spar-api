package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomRvItemPayModeSpayBinding implements iobyxmoadg {
    public final ImageView ecomEripmAcivModeIcon;
    public final AppCompatTextView ecomEripmActvModeDescription;
    public final TextView ecomEripmActvModeName;
    public final ConstraintLayout ecomEripmContainer;
    private final CardView rootView;

    private EcomRvItemPayModeSpayBinding(CardView cardView, ImageView imageView, AppCompatTextView appCompatTextView, TextView textView, ConstraintLayout constraintLayout) {
        this.rootView = cardView;
        this.ecomEripmAcivModeIcon = imageView;
        this.ecomEripmActvModeDescription = appCompatTextView;
        this.ecomEripmActvModeName = textView;
        this.ecomEripmContainer = constraintLayout;
    }

    public static EcomRvItemPayModeSpayBinding bind(View view) {
        int i13 = R.id.ecomEripmAcivModeIcon;
        ImageView imageView = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            i13 = R.id.ecomEripmActvModeDescription;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatTextView != null) {
                i13 = R.id.ecomEripmActvModeName;
                TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                if (textView != null) {
                    i13 = R.id.ecomEripmContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) zoijcleaow.iobyxmoadg(view, i13);
                    if (constraintLayout != null) {
                        return new EcomRvItemPayModeSpayBinding((CardView) view, imageView, appCompatTextView, textView, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomRvItemPayModeSpayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomRvItemPayModeSpayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_rv_item_pay_mode_spay, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // a6.iobyxmoadg
    public CardView getRoot() {
        return this.rootView;
    }
}
