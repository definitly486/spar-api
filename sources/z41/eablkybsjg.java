package z41;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final MaterialTextView f127944agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final AppCompatRatingBar f127945btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f127946draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final AppCompatImageView f127947dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f127948eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final ConstraintLayout f127949gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Guideline f127950gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f127951iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f127952lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final Guideline f127953nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f127954ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f127955wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final View f127956wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f127957zoijcleaow;

    private eablkybsjg(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, View view, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView, AppCompatRatingBar appCompatRatingBar, ConstraintLayout constraintLayout2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f127951iobyxmoadg = constraintLayout;
        this.f127957zoijcleaow = materialButton;
        this.f127954ppxfxbqfkf = materialButton2;
        this.f127956wkgbmnqykc = view;
        this.f127948eablkybsjg = guideline;
        this.f127950gxszxtbevo = guideline2;
        this.f127952lqeggnwhkg = guideline3;
        this.f127953nufgyqmvbu = guideline4;
        this.f127947dxjokdxxww = appCompatImageView;
        this.f127945btonecajqb = appCompatRatingBar;
        this.f127949gtknphoqwx = constraintLayout2;
        this.f127946draadjrbmk = materialTextView;
        this.f127955wflxmlrfwp = materialTextView2;
        this.f127944agtfadlqog = materialTextView3;
    }

    public static eablkybsjg iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = vk0.wkgbmnqykc.btnCancel;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.btnSubmit;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = vk0.wkgbmnqykc.curtain))) != null) {
                i13 = vk0.wkgbmnqykc.glBottom;
                Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline != null) {
                    i13 = vk0.wkgbmnqykc.glEnd;
                    Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (guideline2 != null) {
                        i13 = vk0.wkgbmnqykc.glStart;
                        Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (guideline3 != null) {
                            i13 = vk0.wkgbmnqykc.glTop;
                            Guideline guideline4 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (guideline4 != null) {
                                i13 = vk0.wkgbmnqykc.ivIconApp;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (appCompatImageView != null) {
                                    i13 = vk0.wkgbmnqykc.rbRatingApp;
                                    AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (appCompatRatingBar != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i13 = vk0.wkgbmnqykc.tvCompleteTitle;
                                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView != null) {
                                            i13 = vk0.wkgbmnqykc.tvDescriptionApp;
                                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView2 != null) {
                                                i13 = vk0.wkgbmnqykc.tvTitleApp;
                                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView3 != null) {
                                                    return new eablkybsjg(constraintLayout, materialButton, materialButton2, viewIobyxmoadg, guideline, guideline2, guideline3, guideline4, appCompatImageView, appCompatRatingBar, constraintLayout, materialTextView, materialTextView2, materialTextView3);
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
        return this.f127951iobyxmoadg;
    }
}
