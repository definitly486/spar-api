package go1;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class oxmwwwfdhm implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final LinearLayout f38087eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f38088gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f38089iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageButton f38090ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final wflxmlrfwp f38091wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f38092zoijcleaow;

    private oxmwwwfdhm(ConstraintLayout constraintLayout, MaterialButton materialButton, AppCompatImageButton appCompatImageButton, wflxmlrfwp wflxmlrfwpVar, LinearLayout linearLayout, MaterialTextView materialTextView) {
        this.f38089iobyxmoadg = constraintLayout;
        this.f38092zoijcleaow = materialButton;
        this.f38090ppxfxbqfkf = appCompatImageButton;
        this.f38091wkgbmnqykc = wflxmlrfwpVar;
        this.f38087eablkybsjg = linearLayout;
        this.f38088gxszxtbevo = materialTextView;
    }

    public static oxmwwwfdhm iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = on1.zoijcleaow.btnCart;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = on1.zoijcleaow.btnDeleteProduct;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageButton != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = on1.zoijcleaow.includeContentProduct))) != null) {
                wflxmlrfwp wflxmlrfwpVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(viewIobyxmoadg);
                i13 = on1.zoijcleaow.llAmountContainer;
                LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (linearLayout != null) {
                    i13 = on1.zoijcleaow.tvAmount;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        return new oxmwwwfdhm((ConstraintLayout) view, materialButton, appCompatImageButton, wflxmlrfwpVarIobyxmoadg, linearLayout, materialTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f38089iobyxmoadg;
    }
}
