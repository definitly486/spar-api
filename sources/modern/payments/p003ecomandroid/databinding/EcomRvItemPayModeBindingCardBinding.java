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
public final class EcomRvItemPayModeBindingCardBinding implements iobyxmoadg {
    public final ImageView ecomEripmbcAcivDeleteIcon;
    public final ImageView ecomEripmbcAcivModeHint;
    public final ImageView ecomEripmbcAcivModeIcon;
    public final TextView ecomEripmbcActvModeTitle;
    public final ConstraintLayout ecomEripmbcContainer;
    private final CardView rootView;

    private EcomRvItemPayModeBindingCardBinding(CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, ConstraintLayout constraintLayout) {
        this.rootView = cardView;
        this.ecomEripmbcAcivDeleteIcon = imageView;
        this.ecomEripmbcAcivModeHint = imageView2;
        this.ecomEripmbcAcivModeIcon = imageView3;
        this.ecomEripmbcActvModeTitle = textView;
        this.ecomEripmbcContainer = constraintLayout;
    }

    public static EcomRvItemPayModeBindingCardBinding bind(View view) {
        int i13 = R.id.ecom_eripmbc_aciv_delete_icon;
        ImageView imageView = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            i13 = R.id.ecom_eripmbc_aciv_mode_hint;
            ImageView imageView2 = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
            if (imageView2 != null) {
                i13 = R.id.ecom_eripmbc_aciv_mode_icon;
                ImageView imageView3 = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
                if (imageView3 != null) {
                    i13 = R.id.ecom_eripmbc_actv_mode_title;
                    TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                    if (textView != null) {
                        i13 = R.id.ecom_eripmbc_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) zoijcleaow.iobyxmoadg(view, i13);
                        if (constraintLayout != null) {
                            return new EcomRvItemPayModeBindingCardBinding((CardView) view, imageView, imageView2, imageView3, textView, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomRvItemPayModeBindingCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomRvItemPayModeBindingCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_rv_item_pay_mode_binding_card, viewGroup, false);
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
