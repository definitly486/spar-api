package yi1;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f125466btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f125467dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final lqeggnwhkg f125468eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final View f125469gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final LinearLayout f125470gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f125471iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f125472lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final Guideline f125473nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f125474ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ComposeView f125475wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f125476zoijcleaow;

    private zoijcleaow(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ComposeView composeView, lqeggnwhkg lqeggnwhkgVar, LinearLayout linearLayout, Guideline guideline, Guideline guideline2, MaterialTextView materialTextView, MaterialTextView materialTextView2, View view) {
        this.f125471iobyxmoadg = constraintLayout;
        this.f125476zoijcleaow = materialButton;
        this.f125474ppxfxbqfkf = materialButton2;
        this.f125475wkgbmnqykc = composeView;
        this.f125468eablkybsjg = lqeggnwhkgVar;
        this.f125470gxszxtbevo = linearLayout;
        this.f125472lqeggnwhkg = guideline;
        this.f125473nufgyqmvbu = guideline2;
        this.f125467dxjokdxxww = materialTextView;
        this.f125466btonecajqb = materialTextView2;
        this.f125469gtknphoqwx = view;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        View viewIobyxmoadg;
        View viewIobyxmoadg2;
        int i13 = ti1.eablkybsjg.btnClose;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = ti1.eablkybsjg.btnSavePurchaseList;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null) {
                i13 = ti1.eablkybsjg.clLoading;
                ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = ti1.eablkybsjg.containerPurchaseListItem))) != null) {
                    lqeggnwhkg lqeggnwhkgVarIobyxmoadg = lqeggnwhkg.iobyxmoadg(viewIobyxmoadg);
                    i13 = ti1.eablkybsjg.containerWarning;
                    LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (linearLayout != null) {
                        i13 = ti1.eablkybsjg.glEnd;
                        Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (guideline != null) {
                            i13 = ti1.eablkybsjg.glStart;
                            Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (guideline2 != null) {
                                i13 = ti1.eablkybsjg.tvDescription;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = ti1.eablkybsjg.tvTitle;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null && (viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, (i13 = ti1.eablkybsjg.vCurtain))) != null) {
                                        return new zoijcleaow((ConstraintLayout) view, materialButton, materialButton2, composeView, lqeggnwhkgVarIobyxmoadg, linearLayout, guideline, guideline2, materialTextView, materialTextView2, viewIobyxmoadg2);
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
        return this.f125471iobyxmoadg;
    }
}
