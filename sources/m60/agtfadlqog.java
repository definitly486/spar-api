package m60;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class agtfadlqog implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f65337btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f65338draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final AppCompatImageView f65339dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f65340eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f65341gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Guideline f65342gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65343iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f65344lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final Guideline f65345nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f65346ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f65347wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f65348zoijcleaow;

    private agtfadlqog(ConstraintLayout constraintLayout, Barrier barrier, AppCompatImageView appCompatImageView, MaterialButton materialButton, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f65343iobyxmoadg = constraintLayout;
        this.f65348zoijcleaow = barrier;
        this.f65346ppxfxbqfkf = appCompatImageView;
        this.f65347wkgbmnqykc = materialButton;
        this.f65340eablkybsjg = guideline;
        this.f65342gxszxtbevo = guideline2;
        this.f65344lqeggnwhkg = guideline3;
        this.f65345nufgyqmvbu = guideline4;
        this.f65339dxjokdxxww = appCompatImageView2;
        this.f65337btonecajqb = materialTextView;
        this.f65341gtknphoqwx = materialTextView2;
        this.f65338draadjrbmk = materialTextView3;
    }

    public static agtfadlqog iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.barrier;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = pm.eablkybsjg.btnClose;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = pm.eablkybsjg.btnConfirm;
                MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton != null) {
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
                                    i13 = pm.eablkybsjg.ivIcon;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (appCompatImageView2 != null) {
                                        i13 = pm.eablkybsjg.tvSubtitle;
                                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView != null) {
                                            i13 = pm.eablkybsjg.tvText;
                                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView2 != null) {
                                                i13 = pm.eablkybsjg.tvTitle;
                                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView3 != null) {
                                                    return new agtfadlqog((ConstraintLayout) view, barrier, appCompatImageView, materialButton, guideline, guideline2, guideline3, guideline4, appCompatImageView2, materialTextView, materialTextView2, materialTextView3);
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
        return this.f65343iobyxmoadg;
    }
}
