package m60;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes4.dex */
public final class istkbnxepw implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final LinearLayout f65607eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ScrollView f65608gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65609iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final View f65610lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f65611ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ComposeView f65612wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f65613zoijcleaow;

    private istkbnxepw(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, ComposeView composeView2, LinearLayout linearLayout, ScrollView scrollView, View view) {
        this.f65609iobyxmoadg = constraintLayout;
        this.f65613zoijcleaow = materialButton;
        this.f65611ppxfxbqfkf = composeView;
        this.f65612wkgbmnqykc = composeView2;
        this.f65607eablkybsjg = linearLayout;
        this.f65608gxszxtbevo = scrollView;
        this.f65610lqeggnwhkg = view;
    }

    public static istkbnxepw iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = pm.eablkybsjg.btnApplyFilters;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.clLoading;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = pm.eablkybsjg.cvActionBar;
                ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView2 != null) {
                    i13 = pm.eablkybsjg.llFilters;
                    LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (linearLayout != null) {
                        i13 = pm.eablkybsjg.scroll;
                        ScrollView scrollView = (ScrollView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (scrollView != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.vBottomLine))) != null) {
                            return new istkbnxepw((ConstraintLayout) view, materialButton, composeView, composeView2, linearLayout, scrollView, viewIobyxmoadg);
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
        return this.f65609iobyxmoadg;
    }
}
