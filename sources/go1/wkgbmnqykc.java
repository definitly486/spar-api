package go1;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final LinearLayout f38107eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f38108gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f38109iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final View f38110ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final wflxmlrfwp f38111wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageButton f38112zoijcleaow;

    private wkgbmnqykc(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, View view, wflxmlrfwp wflxmlrfwpVar, LinearLayout linearLayout, MaterialTextView materialTextView) {
        this.f38109iobyxmoadg = constraintLayout;
        this.f38112zoijcleaow = appCompatImageButton;
        this.f38110ppxfxbqfkf = view;
        this.f38111wkgbmnqykc = wflxmlrfwpVar;
        this.f38107eablkybsjg = linearLayout;
        this.f38108gxszxtbevo = materialTextView;
    }

    public static wkgbmnqykc iobyxmoadg(View view) {
        View viewIobyxmoadg;
        View viewIobyxmoadg2;
        int i13 = on1.zoijcleaow.btnDeleteProduct;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageButton != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = on1.zoijcleaow.curtain))) != null && (viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, (i13 = on1.zoijcleaow.includeContentProduct))) != null) {
            wflxmlrfwp wflxmlrfwpVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(viewIobyxmoadg2);
            i13 = on1.zoijcleaow.llAmountContainer;
            LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (linearLayout != null) {
                i13 = on1.zoijcleaow.tvAmount;
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
        return this.f38109iobyxmoadg;
    }
}
