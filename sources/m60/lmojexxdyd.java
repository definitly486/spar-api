package m60;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class lmojexxdyd implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f65760dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final RecyclerView f65761eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final SwipeRefreshLayout f65762gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65763iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f65764lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f65765nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ComposeView f65766ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageView f65767wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ConstraintLayout f65768zoijcleaow;

    private lmojexxdyd(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ComposeView composeView, AppCompatImageView appCompatImageView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f65763iobyxmoadg = constraintLayout;
        this.f65768zoijcleaow = constraintLayout2;
        this.f65766ppxfxbqfkf = composeView;
        this.f65767wkgbmnqykc = appCompatImageView;
        this.f65761eablkybsjg = recyclerView;
        this.f65762gxszxtbevo = swipeRefreshLayout;
        this.f65764lqeggnwhkg = materialTextView;
        this.f65765nufgyqmvbu = materialTextView2;
        this.f65760dxjokdxxww = materialTextView3;
    }

    public static lmojexxdyd iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.clPromotionCatalogBalanceInfo;
        ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (constraintLayout != null) {
            i13 = pm.eablkybsjg.cvActionBar;
            ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (composeView != null) {
                i13 = pm.eablkybsjg.ivPromotionCatalogBalanceStickers;
                AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatImageView != null) {
                    i13 = pm.eablkybsjg.rvPromotionCatalogList;
                    RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (recyclerView != null) {
                        i13 = pm.eablkybsjg.swipeRefresh;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (swipeRefreshLayout != null) {
                            i13 = pm.eablkybsjg.tvPromotionCatalogBalanceCount;
                            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView != null) {
                                i13 = pm.eablkybsjg.tvPromotionCatalogBalanceLabel;
                                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView2 != null) {
                                    i13 = pm.eablkybsjg.tvPromotionCatalogHeader;
                                    MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView3 != null) {
                                        return new lmojexxdyd((ConstraintLayout) view, constraintLayout, composeView, appCompatImageView, recyclerView, swipeRefreshLayout, materialTextView, materialTextView2, materialTextView3);
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
        return this.f65763iobyxmoadg;
    }
}
