package z41;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class iozdgvuglv implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f128101btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f128102draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f128103dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ComposeView f128104eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f128105gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final AppCompatImageView f128106gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f128107iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final SwipeRefreshLayout f128108lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f128109nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ConstraintLayout f128110ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ConstraintLayout f128111wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ConstraintLayout f128112zoijcleaow;

    private iozdgvuglv(LinearLayout linearLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ComposeView composeView, AppCompatImageView appCompatImageView, SwipeRefreshLayout swipeRefreshLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        this.f128107iobyxmoadg = linearLayout;
        this.f128112zoijcleaow = constraintLayout;
        this.f128110ppxfxbqfkf = constraintLayout2;
        this.f128111wkgbmnqykc = constraintLayout3;
        this.f128104eablkybsjg = composeView;
        this.f128106gxszxtbevo = appCompatImageView;
        this.f128108lqeggnwhkg = swipeRefreshLayout;
        this.f128109nufgyqmvbu = materialTextView;
        this.f128103dxjokdxxww = materialTextView2;
        this.f128101btonecajqb = materialTextView3;
        this.f128105gtknphoqwx = materialTextView4;
        this.f128102draadjrbmk = materialTextView5;
    }

    public static iozdgvuglv iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnShare;
        ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (constraintLayout != null) {
            i13 = vk0.wkgbmnqykc.clPromoCodeContainer;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (constraintLayout2 != null) {
                i13 = vk0.wkgbmnqykc.contentContainer;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (constraintLayout3 != null) {
                    i13 = vk0.wkgbmnqykc.cvActionBar;
                    ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (composeView != null) {
                        i13 = vk0.wkgbmnqykc.ivBanner;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (appCompatImageView != null) {
                            i13 = vk0.wkgbmnqykc.swipeRefresh;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (swipeRefreshLayout != null) {
                                i13 = vk0.wkgbmnqykc.tvCodeTitle;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = vk0.wkgbmnqykc.tvLearnMore;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        i13 = vk0.wkgbmnqykc.tvPromoCode;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView3 != null) {
                                            i13 = vk0.wkgbmnqykc.tvShare;
                                            MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView4 != null) {
                                                i13 = vk0.wkgbmnqykc.tvSharePromoTitle;
                                                MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView5 != null) {
                                                    return new iozdgvuglv((LinearLayout) view, constraintLayout, constraintLayout2, constraintLayout3, composeView, appCompatImageView, swipeRefreshLayout, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5);
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
        return this.f128107iobyxmoadg;
    }
}
