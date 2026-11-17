package sx1;

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
    public final MaterialTextView f108695btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f108696dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final lqeggnwhkg f108697eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final View f108698gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final LinearLayout f108699gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f108700iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f108701lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final Guideline f108702nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f108703ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ComposeView f108704wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f108705zoijcleaow;

    private zoijcleaow(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ComposeView composeView, lqeggnwhkg lqeggnwhkgVar, LinearLayout linearLayout, Guideline guideline, Guideline guideline2, MaterialTextView materialTextView, MaterialTextView materialTextView2, View view) {
        this.f108700iobyxmoadg = constraintLayout;
        this.f108705zoijcleaow = materialButton;
        this.f108703ppxfxbqfkf = materialButton2;
        this.f108704wkgbmnqykc = composeView;
        this.f108697eablkybsjg = lqeggnwhkgVar;
        this.f108699gxszxtbevo = linearLayout;
        this.f108701lqeggnwhkg = guideline;
        this.f108702nufgyqmvbu = guideline2;
        this.f108696dxjokdxxww = materialTextView;
        this.f108695btonecajqb = materialTextView2;
        this.f108698gtknphoqwx = view;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        View viewIobyxmoadg;
        View viewIobyxmoadg2;
        int i13 = nx1.eablkybsjg.btnClose;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = nx1.eablkybsjg.btnSavePurchaseList;
            MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton2 != null) {
                i13 = nx1.eablkybsjg.clLoading;
                ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = nx1.eablkybsjg.containerPurchaseListItem))) != null) {
                    lqeggnwhkg lqeggnwhkgVarIobyxmoadg = lqeggnwhkg.iobyxmoadg(viewIobyxmoadg);
                    i13 = nx1.eablkybsjg.containerWarning;
                    LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (linearLayout != null) {
                        i13 = nx1.eablkybsjg.glEnd;
                        Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (guideline != null) {
                            i13 = nx1.eablkybsjg.glStart;
                            Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (guideline2 != null) {
                                i13 = nx1.eablkybsjg.tvDescription;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = nx1.eablkybsjg.tvTitle;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null && (viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, (i13 = nx1.eablkybsjg.vCurtain))) != null) {
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
        return this.f108700iobyxmoadg;
    }
}
