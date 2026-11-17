package m60;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class jyumaefscl implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f65670btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final View f65671draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f65672dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatImageView f65673eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f65674gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Space f65675gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65676iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Space f65677lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f65678nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Guideline f65679ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f65680wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f65681zoijcleaow;

    private jyumaefscl(ConstraintLayout constraintLayout, MaterialButton materialButton, Guideline guideline, Guideline guideline2, AppCompatImageView appCompatImageView, Space space, Space space2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, View view) {
        this.f65676iobyxmoadg = constraintLayout;
        this.f65681zoijcleaow = materialButton;
        this.f65679ppxfxbqfkf = guideline;
        this.f65680wkgbmnqykc = guideline2;
        this.f65673eablkybsjg = appCompatImageView;
        this.f65675gxszxtbevo = space;
        this.f65677lqeggnwhkg = space2;
        this.f65678nufgyqmvbu = materialTextView;
        this.f65672dxjokdxxww = materialTextView2;
        this.f65670btonecajqb = materialTextView3;
        this.f65674gtknphoqwx = materialTextView4;
        this.f65671draadjrbmk = view;
    }

    public static jyumaefscl iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = pm.eablkybsjg.btnConfirm;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.glEnd;
            Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (guideline != null) {
                i13 = pm.eablkybsjg.glStart;
                Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline2 != null) {
                    i13 = pm.eablkybsjg.ivShopOpeningHours;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatImageView != null) {
                        i13 = pm.eablkybsjg.spaceAfterDialogTitle;
                        Space space = (Space) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (space != null) {
                            i13 = pm.eablkybsjg.spaceBeforeBtn;
                            Space space2 = (Space) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (space2 != null) {
                                i13 = pm.eablkybsjg.tvAddress;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = pm.eablkybsjg.tvDialogTitle;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        i13 = pm.eablkybsjg.tvShopOpeningHours;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView3 != null) {
                                            i13 = pm.eablkybsjg.tvShopType;
                                            MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView4 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.vCurtain))) != null) {
                                                return new jyumaefscl((ConstraintLayout) view, materialButton, guideline, guideline2, appCompatImageView, space, space2, materialTextView, materialTextView2, materialTextView3, materialTextView4, viewIobyxmoadg);
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
        return this.f65676iobyxmoadg;
    }
}
