package m60;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final MaterialTextView f65818agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final AppCompatRatingBar f65819btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f65820draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final AppCompatImageView f65821dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f65822eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final ConstraintLayout f65823gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Guideline f65824gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65825iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f65826lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final Guideline f65827nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f65828ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f65829wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final View f65830wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f65831zoijcleaow;

    private nufgyqmvbu(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, View view, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView, AppCompatRatingBar appCompatRatingBar, ConstraintLayout constraintLayout2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f65825iobyxmoadg = constraintLayout;
        this.f65831zoijcleaow = materialButton;
        this.f65828ppxfxbqfkf = materialButton2;
        this.f65830wkgbmnqykc = view;
        this.f65822eablkybsjg = guideline;
        this.f65824gxszxtbevo = guideline2;
        this.f65826lqeggnwhkg = guideline3;
        this.f65827nufgyqmvbu = guideline4;
        this.f65821dxjokdxxww = appCompatImageView;
        this.f65819btonecajqb = appCompatRatingBar;
        this.f65823gtknphoqwx = constraintLayout2;
        this.f65820draadjrbmk = materialTextView;
        this.f65829wflxmlrfwp = materialTextView2;
        this.f65818agtfadlqog = materialTextView3;
    }

    public static nufgyqmvbu iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = pm.eablkybsjg.btnCancel;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.btnSubmit;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.curtain))) != null) {
                i13 = pm.eablkybsjg.glBottom;
                Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline != null) {
                    i13 = pm.eablkybsjg.glEnd;
                    Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (guideline2 != null) {
                        i13 = pm.eablkybsjg.glStart;
                        Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (guideline3 != null) {
                            i13 = pm.eablkybsjg.glTop;
                            Guideline guideline4 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (guideline4 != null) {
                                i13 = pm.eablkybsjg.ivIconApp;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (appCompatImageView != null) {
                                    i13 = pm.eablkybsjg.rbRatingApp;
                                    AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (appCompatRatingBar != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i13 = pm.eablkybsjg.tvCompleteTitle;
                                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView != null) {
                                            i13 = pm.eablkybsjg.tvDescriptionApp;
                                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView2 != null) {
                                                i13 = pm.eablkybsjg.tvTitleApp;
                                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView3 != null) {
                                                    return new nufgyqmvbu(constraintLayout, materialButton, materialButton2, viewIobyxmoadg, guideline, guideline2, guideline3, guideline4, appCompatImageView, appCompatRatingBar, constraintLayout, materialTextView, materialTextView2, materialTextView3);
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
        return this.f65825iobyxmoadg;
    }
}
