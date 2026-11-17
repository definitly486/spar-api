package m60;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class hkdspvbjdz implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f65551btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f65552draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f65553dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ComposeView f65554eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f65555gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final AppCompatImageView f65556gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f65557iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final SwipeRefreshLayout f65558lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f65559nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ConstraintLayout f65560ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ConstraintLayout f65561wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ConstraintLayout f65562zoijcleaow;

    private hkdspvbjdz(LinearLayout linearLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ComposeView composeView, AppCompatImageView appCompatImageView, SwipeRefreshLayout swipeRefreshLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        this.f65557iobyxmoadg = linearLayout;
        this.f65562zoijcleaow = constraintLayout;
        this.f65560ppxfxbqfkf = constraintLayout2;
        this.f65561wkgbmnqykc = constraintLayout3;
        this.f65554eablkybsjg = composeView;
        this.f65556gxszxtbevo = appCompatImageView;
        this.f65558lqeggnwhkg = swipeRefreshLayout;
        this.f65559nufgyqmvbu = materialTextView;
        this.f65553dxjokdxxww = materialTextView2;
        this.f65551btonecajqb = materialTextView3;
        this.f65555gtknphoqwx = materialTextView4;
        this.f65552draadjrbmk = materialTextView5;
    }

    public static hkdspvbjdz iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnShare;
        ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (constraintLayout != null) {
            i13 = pm.eablkybsjg.clPromoCodeContainer;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (constraintLayout2 != null) {
                i13 = pm.eablkybsjg.contentContainer;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (constraintLayout3 != null) {
                    i13 = pm.eablkybsjg.cvActionBar;
                    ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (composeView != null) {
                        i13 = pm.eablkybsjg.ivBanner;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (appCompatImageView != null) {
                            i13 = pm.eablkybsjg.swipeRefresh;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (swipeRefreshLayout != null) {
                                i13 = pm.eablkybsjg.tvCodeTitle;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = pm.eablkybsjg.tvLearnMore;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        i13 = pm.eablkybsjg.tvPromoCode;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView3 != null) {
                                            i13 = pm.eablkybsjg.tvShare;
                                            MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView4 != null) {
                                                i13 = pm.eablkybsjg.tvSharePromoTitle;
                                                MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView5 != null) {
                                                    return new hkdspvbjdz((LinearLayout) view, constraintLayout, constraintLayout2, constraintLayout3, composeView, appCompatImageView, swipeRefreshLayout, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5);
                                                }
                                            }
                                        }
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
    public LinearLayout getRoot() {
        return this.f65557iobyxmoadg;
    }
}
