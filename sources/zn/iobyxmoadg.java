package zn;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import ru.myspar.ads.impl.presentation.view.PopupTitlesView;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final Guideline f130444btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialCardView f130445draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final Guideline f130446dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ConstraintLayout f130447eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final AppCompatImageView f130448gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final View f130449gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f130450iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f130451lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final Guideline f130452nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Barrier f130453ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final PopupTitlesView f130454wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f130455wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f130456zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, Barrier barrier, Barrier barrier2, MaterialButton materialButton, ConstraintLayout constraintLayout2, View view, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView, MaterialCardView materialCardView, PopupTitlesView popupTitlesView) {
        this.f130450iobyxmoadg = constraintLayout;
        this.f130456zoijcleaow = barrier;
        this.f130453ppxfxbqfkf = barrier2;
        this.f130455wkgbmnqykc = materialButton;
        this.f130447eablkybsjg = constraintLayout2;
        this.f130449gxszxtbevo = view;
        this.f130451lqeggnwhkg = guideline;
        this.f130452nufgyqmvbu = guideline2;
        this.f130446dxjokdxxww = guideline3;
        this.f130444btonecajqb = guideline4;
        this.f130448gtknphoqwx = appCompatImageView;
        this.f130445draadjrbmk = materialCardView;
        this.f130454wflxmlrfwp = popupTitlesView;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = yn.zoijcleaow.barrierMainPopupInfoBottom;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = yn.zoijcleaow.barrierMainPopupInfoTop;
            Barrier barrier2 = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (barrier2 != null) {
                i13 = yn.zoijcleaow.btnGoTo;
                MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i13 = yn.zoijcleaow.curtain;
                    View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (viewIobyxmoadg != null) {
                        i13 = yn.zoijcleaow.glBottom;
                        Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (guideline != null) {
                            i13 = yn.zoijcleaow.glEnd;
                            Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (guideline2 != null) {
                                i13 = yn.zoijcleaow.glStart;
                                Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (guideline3 != null) {
                                    i13 = yn.zoijcleaow.glTop;
                                    Guideline guideline4 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (guideline4 != null) {
                                        i13 = yn.zoijcleaow.ivPhoto;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (appCompatImageView != null) {
                                            i13 = yn.zoijcleaow.mcvPhoto;
                                            MaterialCardView materialCardView = (MaterialCardView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialCardView != null) {
                                                i13 = yn.zoijcleaow.vTitles;
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
        return this.f130450iobyxmoadg;
    }
}
