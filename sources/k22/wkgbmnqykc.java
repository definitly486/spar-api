package k22;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final LinearLayout f53640eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f53641gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53642iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final View f53643ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final wflxmlrfwp f53644wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageButton f53645zoijcleaow;

    private wkgbmnqykc(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, View view, wflxmlrfwp wflxmlrfwpVar, LinearLayout linearLayout, MaterialTextView materialTextView) {
        this.f53642iobyxmoadg = constraintLayout;
        this.f53645zoijcleaow = appCompatImageButton;
        this.f53643ppxfxbqfkf = view;
        this.f53644wkgbmnqykc = wflxmlrfwpVar;
        this.f53640eablkybsjg = linearLayout;
        this.f53641gxszxtbevo = materialTextView;
    }

    public static wkgbmnqykc iobyxmoadg(View view) {
        View viewIobyxmoadg;
        View viewIobyxmoadg2;
        int i13 = s12.zoijcleaow.btnDeleteProduct;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageButton != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = s12.zoijcleaow.curtain))) != null && (viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, (i13 = s12.zoijcleaow.includeContentProduct))) != null) {
            wflxmlrfwp wflxmlrfwpVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(viewIobyxmoadg2);
            i13 = s12.zoijcleaow.llAmountContainer;
            LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (linearLayout != null) {
                i13 = s12.zoijcleaow.tvAmount;
                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    return new wkgbmnqykc((ConstraintLayout) view, appCompatImageButton, viewIobyxmoadg, wflxmlrfwpVarIobyxmoadg, linearLayout, materialTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f53642iobyxmoadg;
    }
}
