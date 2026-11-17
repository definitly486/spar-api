package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.R;
import spay.sdk.view.CardLogoCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class zf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final CardLogoCompositeView f59573eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f59574iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f59575ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatTextView f59576wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f59577zoijcleaow;

    public zf(AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, CardLogoCompositeView cardLogoCompositeView) {
        this.f59574iobyxmoadg = constraintLayout;
        this.f59577zoijcleaow = appCompatImageView;
        this.f59575ppxfxbqfkf = appCompatTextView;
        this.f59576wkgbmnqykc = appCompatTextView2;
        this.f59573eablkybsjg = cardLogoCompositeView;
    }

    public static zf iobyxmoadg(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i13 = R.id.spay_silcw_compound_wallet_iv_more_cards;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = R.id.spay_silcw_tv_wallet_amount;
            AppCompatTextView appCompatTextView = (AppCompatTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatTextView != null) {
                i13 = R.id.spay_silcw_tv_wallet_card_info;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatTextView2 != null) {
                    i13 = R.id.spay_silcw_wallet_logo_cv;
                    CardLogoCompositeView cardLogoCompositeView = (CardLogoCompositeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (cardLogoCompositeView != null) {
                        return new zf(appCompatImageView, appCompatTextView, appCompatTextView2, constraintLayout, cardLogoCompositeView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f59574iobyxmoadg;
    }
}
