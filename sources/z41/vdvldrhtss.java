package z41;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class vdvldrhtss implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f128416btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final View f128417draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f128418dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatImageView f128419eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f128420gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Space f128421gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128422iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Space f128423lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f128424nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Guideline f128425ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f128426wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f128427zoijcleaow;

    private vdvldrhtss(ConstraintLayout constraintLayout, MaterialButton materialButton, Guideline guideline, Guideline guideline2, AppCompatImageView appCompatImageView, Space space, Space space2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, View view) {
        this.f128422iobyxmoadg = constraintLayout;
        this.f128427zoijcleaow = materialButton;
        this.f128425ppxfxbqfkf = guideline;
        this.f128426wkgbmnqykc = guideline2;
        this.f128419eablkybsjg = appCompatImageView;
        this.f128421gxszxtbevo = space;
        this.f128423lqeggnwhkg = space2;
        this.f128424nufgyqmvbu = materialTextView;
        this.f128418dxjokdxxww = materialTextView2;
        this.f128416btonecajqb = materialTextView3;
        this.f128420gtknphoqwx = materialTextView4;
        this.f128417draadjrbmk = view;
    }

    public static vdvldrhtss iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = vk0.wkgbmnqykc.btnConfirm;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.glEnd;
            Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (guideline != null) {
                i13 = vk0.wkgbmnqykc.glStart;
                Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline2 != null) {
                    i13 = vk0.wkgbmnqykc.ivShopOpeningHours;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatImageView != null) {
                        i13 = vk0.wkgbmnqykc.spaceAfterDialogTitle;
                        Space space = (Space) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (space != null) {
                            i13 = vk0.wkgbmnqykc.spaceBeforeBtn;
                            Space space2 = (Space) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (space2 != null) {
                                i13 = vk0.wkgbmnqykc.tvAddress;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = vk0.wkgbmnqykc.tvDialogTitle;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        i13 = vk0.wkgbmnqykc.tvShopOpeningHours;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView3 != null) {
                                            i13 = vk0.wkgbmnqykc.tvShopType;
                                            MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView4 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = vk0.wkgbmnqykc.vCurtain))) != null) {
                                                return new vdvldrhtss((ConstraintLayout) view, materialButton, guideline, guideline2, appCompatImageView, space, space2, materialTextView, materialTextView2, materialTextView3, materialTextView4, viewIobyxmoadg);
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
        return this.f128422iobyxmoadg;
    }
}
