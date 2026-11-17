package m60;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes4.dex */
public final class mbcevpiqjq implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final FrameLayout f65786eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ConstraintLayout f65787gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65788iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final RecyclerView f65789lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final SwipeRefreshLayout f65790nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f65791ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f65792wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f65793zoijcleaow;

    private mbcevpiqjq(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, MaterialButton materialButton, FrameLayout frameLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f65788iobyxmoadg = constraintLayout;
        this.f65793zoijcleaow = composeView;
        this.f65791ppxfxbqfkf = composeView2;
        this.f65792wkgbmnqykc = materialButton;
        this.f65786eablkybsjg = frameLayout;
        this.f65787gxszxtbevo = constraintLayout2;
        this.f65789lqeggnwhkg = recyclerView;
        this.f65790nufgyqmvbu = swipeRefreshLayout;
    }

    public static mbcevpiqjq iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.clLoading;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = pm.eablkybsjg.cvActionBar;
            ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView2 != null) {
                i13 = pm.eablkybsjg.mbtReturnToOrder;
                MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton != null) {
                    i13 = pm.eablkybsjg.returnToOrderContainer;
                    FrameLayout frameLayout = (FrameLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (frameLayout != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i13 = pm.eablkybsjg.rvSubCatalog;
                        RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (recyclerView != null) {
                            i13 = pm.eablkybsjg.swipeRefresh;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (swipeRefreshLayout != null) {
                                return new mbcevpiqjq(constraintLayout, composeView, composeView2, materialButton, frameLayout, constraintLayout, recyclerView, swipeRefreshLayout);
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
        return this.f65788iobyxmoadg;
    }
}
