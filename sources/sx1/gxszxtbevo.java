package sx1;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f108651iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f108652ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f108653wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f108654zoijcleaow;

    private gxszxtbevo(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f108651iobyxmoadg = constraintLayout;
        this.f108654zoijcleaow = materialButton;
        this.f108652ppxfxbqfkf = materialTextView;
        this.f108653wkgbmnqykc = materialTextView2;
    }

    public static gxszxtbevo iobyxmoadg(View view) {
        int i13 = nx1.eablkybsjg.mbtReturnToCart;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = nx1.eablkybsjg.tvSuccessRetrySubtitle;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                i13 = nx1.eablkybsjg.tvSuccessRetryTitle;
                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView2 != null) {
                    return new gxszxtbevo((ConstraintLayout) view, materialButton, materialTextView, materialTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f108651iobyxmoadg;
    }
}
