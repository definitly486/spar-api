package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.R;
import spay.sdk.view.CardLogoCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class dh implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatTextView f56285eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f56286iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f56287ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatTextView f56288wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final CardLogoCompositeView f56289zoijcleaow;

    public dh(AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, CardLogoCompositeView cardLogoCompositeView) {
        this.f56286iobyxmoadg = constraintLayout;
        this.f56289zoijcleaow = cardLogoCompositeView;
        this.f56287ppxfxbqfkf = appCompatImageView;
        this.f56288wkgbmnqykc = appCompatTextView;
        this.f56285eablkybsjg = appCompatTextView2;
    }

    public static dh iobyxmoadg(View view) {
        int i13 = R.id.spay_silsc_card_logo_cv;
        CardLogoCompositeView cardLogoCompositeView = (CardLogoCompositeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (cardLogoCompositeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i13 = R.id.spay_silsc_iv_more_cards;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = R.id.spay_silsc_tv_card_description;
                AppCompatTextView appCompatTextView = (AppCompatTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatTextView != null) {
                    i13 = R.id.spay_silsc_tv_card_title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatTextView2 != null) {
                        return new dh(appCompatImageView, appCompatTextView, appCompatTextView2, constraintLayout, cardLogoCompositeView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f56286iobyxmoadg;
    }
}
