package z41;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class jpowsppfya implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final MaterialTextView f128161agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final RecyclerView f128162btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final Toolbar f128163draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final RecyclerView f128164dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ShapeableImageView f128165eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final SwipeRefreshLayout f128166gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ShapeableImageView f128167gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CoordinatorLayout f128168iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final AppCompatImageView f128169lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final LinearLayout f128170nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final MaterialTextView f128171ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f128172ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final MaterialTextView f128173rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f128174wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ConstraintLayout f128175wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppBarLayout f128176zoijcleaow;

    private jpowsppfya(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, AppCompatImageView appCompatImageView2, LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.f128168iobyxmoadg = coordinatorLayout;
        this.f128176zoijcleaow = appBarLayout;
        this.f128172ppxfxbqfkf = appCompatImageView;
        this.f128175wkgbmnqykc = constraintLayout;
        this.f128165eablkybsjg = shapeableImageView;
        this.f128167gxszxtbevo = shapeableImageView2;
        this.f128169lqeggnwhkg = appCompatImageView2;
        this.f128170nufgyqmvbu = linearLayout;
        this.f128164dxjokdxxww = recyclerView;
        this.f128162btonecajqb = recyclerView2;
        this.f128166gtknphoqwx = swipeRefreshLayout;
        this.f128163draadjrbmk = toolbar;
        this.f128174wflxmlrfwp = materialTextView;
        this.f128161agtfadlqog = materialTextView2;
        this.f128171ojitshcjhn = materialTextView3;
        this.f128173rgvfuqvkyq = materialTextView4;
    }

    public static jpowsppfya iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appBarLayout != null) {
            i13 = vk0.wkgbmnqykc.btnBack;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = vk0.wkgbmnqykc.defaultCatalogSearchContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (constraintLayout != null) {
                    i13 = vk0.wkgbmnqykc.ivBackgroundImage;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (shapeableImageView != null) {
                        i13 = vk0.wkgbmnqykc.ivIcon;
                        ShapeableImageView shapeableImageView2 = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (shapeableImageView2 != null) {
                            i13 = vk0.wkgbmnqykc.ivInfo;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (appCompatImageView2 != null) {
                                i13 = vk0.wkgbmnqykc.llHeaderContainer;
                                LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (linearLayout != null) {
                                    i13 = vk0.wkgbmnqykc.rvRestaurantProducts;
                                    RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (recyclerView != null) {
                                        i13 = vk0.wkgbmnqykc.rvSubCategory;
                                        RecyclerView recyclerView2 = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (recyclerView2 != null) {
                                            i13 = vk0.wkgbmnqykc.swipeRefresh;
                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (swipeRefreshLayout != null) {
                                                i13 = vk0.wkgbmnqykc.toolbar;
                                                Toolbar toolbar = (Toolbar) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (toolbar != null) {
                                                    i13 = vk0.wkgbmnqykc.tvDeliveryTime;
                                                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (materialTextView != null) {
                                                        i13 = vk0.wkgbmnqykc.tvDescription;
                                                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                        if (materialTextView2 != null) {
                                                            i13 = vk0.wkgbmnqykc.tvMinOrderSum;
                                                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                            if (materialTextView3 != null) {
                                                                i13 = vk0.wkgbmnqykc.tvName;
                                                                MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                if (materialTextView4 != null) {
                                                                    return new jpowsppfya((CoordinatorLayout) view, appBarLayout, appCompatImageView, constraintLayout, shapeableImageView, shapeableImageView2, appCompatImageView2, linearLayout, recyclerView, recyclerView2, swipeRefreshLayout, toolbar, materialTextView, materialTextView2, materialTextView3, materialTextView4);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f128168iobyxmoadg;
    }
}
