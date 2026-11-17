package k22;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class oxmwwwfdhm implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final LinearLayout f53620eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f53621gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53622iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageButton f53623ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final wflxmlrfwp f53624wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f53625zoijcleaow;

    private oxmwwwfdhm(ConstraintLayout constraintLayout, MaterialButton materialButton, AppCompatImageButton appCompatImageButton, wflxmlrfwp wflxmlrfwpVar, LinearLayout linearLayout, MaterialTextView materialTextView) {
        this.f53622iobyxmoadg = constraintLayout;
        this.f53625zoijcleaow = materialButton;
        this.f53623ppxfxbqfkf = appCompatImageButton;
        this.f53624wkgbmnqykc = wflxmlrfwpVar;
        this.f53620eablkybsjg = linearLayout;
        this.f53621gxszxtbevo = materialTextView;
    }

    public static oxmwwwfdhm iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = s12.zoijcleaow.btnCart;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = s12.zoijcleaow.btnDeleteProduct;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageButton != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = s12.zoijcleaow.includeContentProduct))) != null) {
                wflxmlrfwp wflxmlrfwpVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(viewIobyxmoadg);
                i13 = s12.zoijcleaow.llAmountContainer;
                LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (linearLayout != null) {
                    i13 = s12.zoijcleaow.tvAmount;
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
        return this.f53622iobyxmoadg;
    }
}
