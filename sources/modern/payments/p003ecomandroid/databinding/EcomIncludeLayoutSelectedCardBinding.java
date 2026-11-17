package modern.payments.p003ecomandroid.databinding;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import modern.payments.ecomAndroid.util.view.CardLogoCompositeView;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomIncludeLayoutSelectedCardBinding implements iobyxmoadg {
    public final CardLogoCompositeView ecomEilscCardLogoCv;
    public final ConstraintLayout ecomEilscClSelectedCard;
    public final AppCompatImageView ecomEilscIvMoreCards;
    public final AppCompatTextView ecomEilscTvCardDescription;
    public final AppCompatTextView ecomEilscTvCardTitle;
    private final ConstraintLayout rootView;

    private EcomIncludeLayoutSelectedCardBinding(ConstraintLayout constraintLayout, CardLogoCompositeView cardLogoCompositeView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.ecomEilscCardLogoCv = cardLogoCompositeView;
        this.ecomEilscClSelectedCard = constraintLayout2;
        this.ecomEilscIvMoreCards = appCompatImageView;
        this.ecomEilscTvCardDescription = appCompatTextView;
        this.ecomEilscTvCardTitle = appCompatTextView2;
    }

    public static EcomIncludeLayoutSelectedCardBinding bind(View view) {
        int i13 = R.id.ecom_eilsc_card_logo_cv;
        CardLogoCompositeView cardLogoCompositeView = (CardLogoCompositeView) zoijcleaow.iobyxmoadg(view, i13);
        if (cardLogoCompositeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i13 = R.id.ecom_eilsc_iv_more_cards;
            AppCompatImageView appCompatImageView = (AppCompatImageView) zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = R.id.ecom_eilsc_tv_card_description;
                AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatTextView != null) {
                    i13 = R.id.ecom_eilsc_tv_card_title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatTextView2 != null) {
                        return new EcomIncludeLayoutSelectedCardBinding(constraintLayout, cardLogoCompositeView, constraintLayout, appCompatImageView, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static EcomIncludeLayoutSelectedCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EcomIncludeLayoutSelectedCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.ecom_include_layout_selected_card, viewGroup, false);
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
