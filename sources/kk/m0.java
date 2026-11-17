package kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.R;
import spay.sdk.view.CardLogoCompositeView;
import spay.sdk.view.SpayBonusCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatImageView f57561eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final AppCompatTextView f57562gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final CardView f57563iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final AppCompatTextView f57564lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final SpayBonusCompositeView f57565nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ConstraintLayout f57566ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final CardView f57567wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final CardLogoCompositeView f57568zoijcleaow;

    public m0(CardView cardView, CardLogoCompositeView cardLogoCompositeView, ConstraintLayout constraintLayout, CardView cardView2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, SpayBonusCompositeView spayBonusCompositeView) {
        this.f57563iobyxmoadg = cardView;
        this.f57568zoijcleaow = cardLogoCompositeView;
        this.f57566ppxfxbqfkf = constraintLayout;
        this.f57567wkgbmnqykc = cardView2;
        this.f57561eablkybsjg = appCompatImageView;
        this.f57562gxszxtbevo = appCompatTextView;
        this.f57564lqeggnwhkg = appCompatTextView2;
        this.f57565nufgyqmvbu = spayBonusCompositeView;
    }

    public static m0 iobyxmoadg(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(R.layout.spay_rv_item_card_selection, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        int i13 = R.id.spay_rics_card_logo_cv;
        CardLogoCompositeView cardLogoCompositeView = (CardLogoCompositeView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (cardLogoCompositeView != null) {
            i13 = R.id.spay_rics_cl_content_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (constraintLayout != null) {
                CardView cardView = (CardView) viewInflate;
                i13 = R.id.spay_rics_iv_status;
                AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (appCompatImageView != null) {
                    i13 = R.id.spay_rics_tv_card_description;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (appCompatTextView != null) {
                        i13 = R.id.spay_rics_tv_card_title;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (appCompatTextView2 != null) {
                            i13 = R.id.spay_sbcv_bonus;
                            SpayBonusCompositeView spayBonusCompositeView = (SpayBonusCompositeView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
                            if (spayBonusCompositeView != null) {
                                return new m0(cardView, cardLogoCompositeView, constraintLayout, cardView, appCompatImageView, appCompatTextView, appCompatTextView2, spayBonusCompositeView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f57563iobyxmoadg;
    }
}
