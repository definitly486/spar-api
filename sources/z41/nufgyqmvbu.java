package z41;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.legacy.presentation.view.DateAndPlaceView;
import ru.myspar.proloyalty.legacy.presentation.view.ratingbar.RatingBarView;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f128271btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final DateAndPlaceView f128272draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f128273dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f128274eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final View f128275gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f128276gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128277iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f128278lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f128279nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f128280ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final RatingBarView f128281wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f128282wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f128283zoijcleaow;

    private nufgyqmvbu(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, Guideline guideline, Guideline guideline2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, View view, DateAndPlaceView dateAndPlaceView, RatingBarView ratingBarView) {
        this.f128277iobyxmoadg = constraintLayout;
        this.f128283zoijcleaow = materialButton;
        this.f128280ppxfxbqfkf = composeView;
        this.f128282wkgbmnqykc = guideline;
        this.f128274eablkybsjg = guideline2;
        this.f128276gxszxtbevo = materialTextView;
        this.f128278lqeggnwhkg = materialTextView2;
        this.f128279nufgyqmvbu = materialTextView3;
        this.f128273dxjokdxxww = materialTextView4;
        this.f128271btonecajqb = materialTextView5;
        this.f128275gtknphoqwx = view;
        this.f128272draadjrbmk = dateAndPlaceView;
        this.f128281wflxmlrfwp = ratingBarView;
    }

    public static nufgyqmvbu iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = vk0.wkgbmnqykc.btnRateOrder;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.clLoading;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = vk0.wkgbmnqykc.glEnd;
                Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline != null) {
                    i13 = vk0.wkgbmnqykc.glStart;
                    Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (guideline2 != null) {
                        i13 = vk0.wkgbmnqykc.tvCurrency;
                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView != null) {
                            i13 = vk0.wkgbmnqykc.tvPriceFract;
                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView2 != null) {
                                i13 = vk0.wkgbmnqykc.tvPriceInt;
                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView3 != null) {
                                    i13 = vk0.wkgbmnqykc.tvTitle;
                                    MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView4 != null) {
                                        i13 = vk0.wkgbmnqykc.tvTotalPayment;
                                        MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView5 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = vk0.wkgbmnqykc.vCurtain))) != null) {
                                            i13 = vk0.wkgbmnqykc.vDatePlace;
                                            DateAndPlaceView dateAndPlaceView = (DateAndPlaceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (dateAndPlaceView != null) {
                                                i13 = vk0.wkgbmnqykc.vRatingBar;
                                                RatingBarView ratingBarView = (RatingBarView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (ratingBarView != null) {
                                                    return new nufgyqmvbu((ConstraintLayout) view, materialButton, composeView, guideline, guideline2, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, viewIobyxmoadg, dateAndPlaceView, ratingBarView);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128277iobyxmoadg;
    }
}
