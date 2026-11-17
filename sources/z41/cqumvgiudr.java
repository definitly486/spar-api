package z41;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;

/* JADX INFO: loaded from: classes5.dex */
public final class cqumvgiudr implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final LinearLayout f127891eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ScrollView f127892gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f127893iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialDivider f127894lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f127895ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ComposeView f127896wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f127897zoijcleaow;

    private cqumvgiudr(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, ComposeView composeView2, LinearLayout linearLayout, ScrollView scrollView, MaterialDivider materialDivider) {
        this.f127893iobyxmoadg = constraintLayout;
        this.f127897zoijcleaow = materialButton;
        this.f127895ppxfxbqfkf = composeView;
        this.f127896wkgbmnqykc = composeView2;
        this.f127891eablkybsjg = linearLayout;
        this.f127892gxszxtbevo = scrollView;
        this.f127894lqeggnwhkg = materialDivider;
    }

    public static cqumvgiudr iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnApplyFilters;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.clLoading;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = vk0.wkgbmnqykc.cvActionBar;
                ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView2 != null) {
                    i13 = vk0.wkgbmnqykc.llFilters;
                    LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (linearLayout != null) {
                        i13 = vk0.wkgbmnqykc.scroll;
                        ScrollView scrollView = (ScrollView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (scrollView != null) {
                            i13 = vk0.wkgbmnqykc.vBottomLine;
                            MaterialDivider materialDivider = (MaterialDivider) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialDivider != null) {
                                return new cqumvgiudr((ConstraintLayout) view, materialButton, composeView, composeView2, linearLayout, scrollView, materialDivider);
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
        return this.f127893iobyxmoadg;
    }
}
