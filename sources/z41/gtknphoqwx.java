package z41;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class gtknphoqwx implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f128023btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f128024draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final AppCompatImageView f128025dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f128026eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f128027gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Guideline f128028gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128029iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f128030lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final Guideline f128031nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f128032ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f128033wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f128034zoijcleaow;

    private gtknphoqwx(ConstraintLayout constraintLayout, Barrier barrier, AppCompatImageView appCompatImageView, MaterialButton materialButton, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f128029iobyxmoadg = constraintLayout;
        this.f128034zoijcleaow = barrier;
        this.f128032ppxfxbqfkf = appCompatImageView;
        this.f128033wkgbmnqykc = materialButton;
        this.f128026eablkybsjg = guideline;
        this.f128028gxszxtbevo = guideline2;
        this.f128030lqeggnwhkg = guideline3;
        this.f128031nufgyqmvbu = guideline4;
        this.f128025dxjokdxxww = appCompatImageView2;
        this.f128023btonecajqb = materialTextView;
        this.f128027gtknphoqwx = materialTextView2;
        this.f128024draadjrbmk = materialTextView3;
    }

    public static gtknphoqwx iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.barrier;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = vk0.wkgbmnqykc.btnClose;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = vk0.wkgbmnqykc.btnConfirm;
                MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton != null) {
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
                                    i13 = vk0.wkgbmnqykc.ivIcon;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (appCompatImageView2 != null) {
                                        i13 = vk0.wkgbmnqykc.tvSubtitle;
                                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView != null) {
                                            i13 = vk0.wkgbmnqykc.tvText;
                                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView2 != null) {
                                                i13 = vk0.wkgbmnqykc.tvTitle;
                                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView3 != null) {
                                                    return new gtknphoqwx((ConstraintLayout) view, barrier, appCompatImageView, materialButton, guideline, guideline2, guideline3, guideline4, appCompatImageView2, materialTextView, materialTextView2, materialTextView3);
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
        return this.f128029iobyxmoadg;
    }
}
