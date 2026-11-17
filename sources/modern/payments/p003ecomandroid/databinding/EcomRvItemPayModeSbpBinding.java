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
public final class EcomRvItemPayModeSbpBinding implements iobyxmoadg {
    public final ConstraintLayout ecomEripmContainer;
    public final ImageView ecomEripmIvSbpModeIcon;
    public final TextView ecomEripmTvSbpModeDescription;
    public final TextView ecomEripmTvSbpModeName;
    private final CardView rootView;

    private EcomRvItemPayModeSbpBinding(CardView cardView, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = cardView;
        this.ecomEripmContainer = constraintLayout;
        this.ecomEripmIvSbpModeIcon = imageView;
        this.ecomEripmTvSbpModeDescription = textView;
        this.ecomEripmTvSbpModeName = textView2;
    }

    public static EcomRvItemPayModeSbpBinding bind(View view) {
        int i13 = R.id.ecomEripmContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) zoijcleaow.iobyxmoadg(view, i13);
        if (constraintLayout != null) {
            i13 = R.id.ecom_eripm_iv_sbp_mode_icon;
            ImageView imageView = (ImageView) zoijcleaow.iobyxmoadg(view, i13);
            if (imageView != null) {
                i13 = R.id.ecom_eripm_tv_sbp_mode_description;
                TextView textView = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                if (textView != null) {
                    i13 = R.id.ecom_eripm_tv_sbp_mode_name;
                    TextView textView2 = (TextView) zoijcleaow.iobyxmoadg(view, i13);
                    if (textView2 != null) {
                        return new EcomRvItemPayModeSbpBinding((CardView) view, constraintLayout, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomRvItemPayModeSbpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomRvItemPayModeSbpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_rv_item_pay_mode_sbp, viewGroup, false);
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
