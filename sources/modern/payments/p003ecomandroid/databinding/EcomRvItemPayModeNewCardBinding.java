package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomRvItemPayModeNewCardBinding implements iobyxmoadg {
    public final ImageView ecomEripmncAcivModeHint;
    public final ImageView ecomEripmncAcivModeIcon;
    public final TextView ecomEripmncActvModeTitle;
    public final ConstraintLayout ecomEripmncContainer;
    private final CardView rootView;

    private EcomRvItemPayModeNewCardBinding(CardView cardView, ImageView imageView, ImageView imageView2, TextView textView, ConstraintLayout constraintLayout) {
        this.rootView = cardView;
        this.ecomEripmncAcivModeHint = imageView;
        this.ecomEripmncAcivModeIcon = imageView2;
        this.ecomEripmncActvModeTitle = textView;
        this.ecomEripmncContainer = constraintLayout;
    }

    public static EcomRvItemPayModeNewCardBinding bind(View view) {
        int i13 = R.id.ecom_eripmnc_aciv_mode_hint;
        ImageView imageView = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            i13 = R.id.ecom_eripmnc_aciv_mode_icon;
            ImageView imageView2 = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
            if (imageView2 != null) {
                i13 = R.id.ecom_eripmnc_actv_mode_title;
                TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                if (textView != null) {
                    i13 = R.id.ecom_eripmnc_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) zoijcleaow.iobyxmoadg(view, i13);
                    if (constraintLayout != null) {
                        return new EcomRvItemPayModeNewCardBinding((CardView) view, imageView, imageView2, textView, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomRvItemPayModeNewCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomRvItemPayModeNewCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_rv_item_pay_mode_new_card, viewGroup, false);
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
