package km0;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import ru.myspar.proloyalty.ads.impl.presentation.view.PopupTitlesView;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final Guideline f59811btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialCardView f59812draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final Guideline f59813dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ConstraintLayout f59814eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final AppCompatImageView f59815gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final View f59816gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f59817iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f59818lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final Guideline f59819nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Barrier f59820ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final PopupTitlesView f59821wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f59822wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f59823zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, Barrier barrier, Barrier barrier2, MaterialButton materialButton, ConstraintLayout constraintLayout2, View view, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView, MaterialCardView materialCardView, PopupTitlesView popupTitlesView) {
        this.f59817iobyxmoadg = constraintLayout;
        this.f59823zoijcleaow = barrier;
        this.f59820ppxfxbqfkf = barrier2;
        this.f59822wkgbmnqykc = materialButton;
        this.f59814eablkybsjg = constraintLayout2;
        this.f59816gxszxtbevo = view;
        this.f59818lqeggnwhkg = guideline;
        this.f59819nufgyqmvbu = guideline2;
        this.f59813dxjokdxxww = guideline3;
        this.f59811btonecajqb = guideline4;
        this.f59815gtknphoqwx = appCompatImageView;
        this.f59812draadjrbmk = materialCardView;
        this.f59821wflxmlrfwp = popupTitlesView;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = jm0.zoijcleaow.barrierMainPopupInfoBottom;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = jm0.zoijcleaow.barrierMainPopupInfoTop;
            Barrier barrier2 = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (barrier2 != null) {
                i13 = jm0.zoijcleaow.btnGoTo;
                MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i13 = jm0.zoijcleaow.curtain;
                    View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (viewIobyxmoadg != null) {
                        i13 = jm0.zoijcleaow.glBottom;
                        Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (guideline != null) {
                            i13 = jm0.zoijcleaow.glEnd;
                            Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (guideline2 != null) {
                                i13 = jm0.zoijcleaow.glStart;
                                Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (guideline3 != null) {
                                    i13 = jm0.zoijcleaow.glTop;
                                    Guideline guideline4 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (guideline4 != null) {
                                        i13 = jm0.zoijcleaow.ivPhoto;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (appCompatImageView != null) {
                                            i13 = jm0.zoijcleaow.mcvPhoto;
                                            MaterialCardView materialCardView = (MaterialCardView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialCardView != null) {
                                                i13 = jm0.zoijcleaow.vTitles;
                                                PopupTitlesView popupTitlesView = (PopupTitlesView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (popupTitlesView != null) {
                                                    return new iobyxmoadg(constraintLayout, barrier, barrier2, materialButton, constraintLayout, viewIobyxmoadg, guideline, guideline2, guideline3, guideline4, appCompatImageView, materialCardView, popupTitlesView);
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
        return this.f59817iobyxmoadg;
    }
}
