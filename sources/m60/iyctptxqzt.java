package m60;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.ratingbar.RatingBarView;

/* JADX INFO: loaded from: classes4.dex */
public final class iyctptxqzt implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final MaterialTextView f65629agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final RatingBarView f65630btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final RatingBarView f65631draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final RatingBarView f65632dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ProgressBar f65633eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final RatingBarView f65634gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ProgressBar f65635gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65636iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final ProgressBar f65637lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final ProgressBar f65638nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final MaterialTextView f65639ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Guideline f65640ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final RatingBarView f65641wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ProgressBar f65642wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f65643zoijcleaow;

    private iyctptxqzt(ConstraintLayout constraintLayout, Barrier barrier, Guideline guideline, ProgressBar progressBar, ProgressBar progressBar2, ProgressBar progressBar3, ProgressBar progressBar4, ProgressBar progressBar5, RatingBarView ratingBarView, RatingBarView ratingBarView2, RatingBarView ratingBarView3, RatingBarView ratingBarView4, RatingBarView ratingBarView5, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f65636iobyxmoadg = constraintLayout;
        this.f65643zoijcleaow = barrier;
        this.f65640ppxfxbqfkf = guideline;
        this.f65642wkgbmnqykc = progressBar;
        this.f65633eablkybsjg = progressBar2;
        this.f65635gxszxtbevo = progressBar3;
        this.f65637lqeggnwhkg = progressBar4;
        this.f65638nufgyqmvbu = progressBar5;
        this.f65632dxjokdxxww = ratingBarView;
        this.f65630btonecajqb = ratingBarView2;
        this.f65634gtknphoqwx = ratingBarView3;
        this.f65631draadjrbmk = ratingBarView4;
        this.f65641wflxmlrfwp = ratingBarView5;
        this.f65629agtfadlqog = materialTextView;
        this.f65639ojitshcjhn = materialTextView2;
    }

    public static iyctptxqzt iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.barrierRating;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = pm.eablkybsjg.guidelineCenter;
            Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (guideline != null) {
                i13 = pm.eablkybsjg.progressBarFive;
                ProgressBar progressBar = (ProgressBar) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (progressBar != null) {
                    i13 = pm.eablkybsjg.progressBarFour;
                    ProgressBar progressBar2 = (ProgressBar) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (progressBar2 != null) {
                        i13 = pm.eablkybsjg.progressBarOne;
                        ProgressBar progressBar3 = (ProgressBar) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (progressBar3 != null) {
                            i13 = pm.eablkybsjg.progressBarThree;
                            ProgressBar progressBar4 = (ProgressBar) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (progressBar4 != null) {
                                i13 = pm.eablkybsjg.progressBarTwo;
                                ProgressBar progressBar5 = (ProgressBar) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (progressBar5 != null) {
                                    i13 = pm.eablkybsjg.ratingBarFive;
                                    RatingBarView ratingBarView = (RatingBarView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (ratingBarView != null) {
                                        i13 = pm.eablkybsjg.ratingBarFour;
                                        RatingBarView ratingBarView2 = (RatingBarView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (ratingBarView2 != null) {
                                            i13 = pm.eablkybsjg.ratingBarOne;
                                            RatingBarView ratingBarView3 = (RatingBarView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (ratingBarView3 != null) {
                                                i13 = pm.eablkybsjg.ratingBarThree;
                                                RatingBarView ratingBarView4 = (RatingBarView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (ratingBarView4 != null) {
                                                    i13 = pm.eablkybsjg.ratingBarTwo;
                                                    RatingBarView ratingBarView5 = (RatingBarView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (ratingBarView5 != null) {
                                                        i13 = pm.eablkybsjg.tvReviewCount;
                                                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                        if (materialTextView != null) {
                                                            i13 = pm.eablkybsjg.tvTotalRating;
                                                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                            if (materialTextView2 != null) {
                                                                return new iyctptxqzt((ConstraintLayout) view, barrier, guideline, progressBar, progressBar2, progressBar3, progressBar4, progressBar5, ratingBarView, ratingBarView2, ratingBarView3, ratingBarView4, ratingBarView5, materialTextView, materialTextView2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65636iobyxmoadg;
    }
}
