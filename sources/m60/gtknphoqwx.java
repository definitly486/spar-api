package m60;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.DateAndPlaceView;
import ru.myspar.legacy.presentation.view.ratingbar.RatingBarView;

/* JADX INFO: loaded from: classes4.dex */
public final class gtknphoqwx implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f65524btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final DateAndPlaceView f65525draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f65526dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f65527eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final View f65528gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f65529gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65530iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f65531lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f65532nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f65533ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final RatingBarView f65534wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f65535wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f65536zoijcleaow;

    private gtknphoqwx(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, Guideline guideline, Guideline guideline2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, View view, DateAndPlaceView dateAndPlaceView, RatingBarView ratingBarView) {
        this.f65530iobyxmoadg = constraintLayout;
        this.f65536zoijcleaow = materialButton;
        this.f65533ppxfxbqfkf = composeView;
        this.f65535wkgbmnqykc = guideline;
        this.f65527eablkybsjg = guideline2;
        this.f65529gxszxtbevo = materialTextView;
        this.f65531lqeggnwhkg = materialTextView2;
        this.f65532nufgyqmvbu = materialTextView3;
        this.f65526dxjokdxxww = materialTextView4;
        this.f65524btonecajqb = materialTextView5;
        this.f65528gtknphoqwx = view;
        this.f65525draadjrbmk = dateAndPlaceView;
        this.f65534wflxmlrfwp = ratingBarView;
    }

    public static gtknphoqwx iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = pm.eablkybsjg.btnRateOrder;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.clLoading;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = pm.eablkybsjg.glEnd;
                Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline != null) {
                    i13 = pm.eablkybsjg.glStart;
                    Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (guideline2 != null) {
                        i13 = pm.eablkybsjg.tvCurrency;
                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView != null) {
                            i13 = pm.eablkybsjg.tvPriceFract;
                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView2 != null) {
                                i13 = pm.eablkybsjg.tvPriceInt;
                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView3 != null) {
                                    i13 = pm.eablkybsjg.tvTitle;
                                    MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView4 != null) {
                                        i13 = pm.eablkybsjg.tvTotalPayment;
                                        MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView5 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.vCurtain))) != null) {
                                            i13 = pm.eablkybsjg.vDatePlace;
                                            DateAndPlaceView dateAndPlaceView = (DateAndPlaceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (dateAndPlaceView != null) {
                                                i13 = pm.eablkybsjg.vRatingBar;
                                                RatingBarView ratingBarView = (RatingBarView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (ratingBarView != null) {
                                                    return new gtknphoqwx((ConstraintLayout) view, materialButton, composeView, guideline, guideline2, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, viewIobyxmoadg, dateAndPlaceView, ratingBarView);
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
        return this.f65530iobyxmoadg;
    }
}
