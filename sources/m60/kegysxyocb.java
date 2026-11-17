package m60;

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

/* JADX INFO: loaded from: classes4.dex */
public final class kegysxyocb implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final MaterialTextView f65695agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final RecyclerView f65696btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final Toolbar f65697draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final RecyclerView f65698dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ShapeableImageView f65699eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final SwipeRefreshLayout f65700gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ShapeableImageView f65701gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CoordinatorLayout f65702iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final AppCompatImageView f65703lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final LinearLayout f65704nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final MaterialTextView f65705ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f65706ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final MaterialTextView f65707rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f65708wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ConstraintLayout f65709wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppBarLayout f65710zoijcleaow;

    private kegysxyocb(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, AppCompatImageView appCompatImageView2, LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.f65702iobyxmoadg = coordinatorLayout;
        this.f65710zoijcleaow = appBarLayout;
        this.f65706ppxfxbqfkf = appCompatImageView;
        this.f65709wkgbmnqykc = constraintLayout;
        this.f65699eablkybsjg = shapeableImageView;
        this.f65701gxszxtbevo = shapeableImageView2;
        this.f65703lqeggnwhkg = appCompatImageView2;
        this.f65704nufgyqmvbu = linearLayout;
        this.f65698dxjokdxxww = recyclerView;
        this.f65696btonecajqb = recyclerView2;
        this.f65700gtknphoqwx = swipeRefreshLayout;
        this.f65697draadjrbmk = toolbar;
        this.f65708wflxmlrfwp = materialTextView;
        this.f65695agtfadlqog = materialTextView2;
        this.f65705ojitshcjhn = materialTextView3;
        this.f65707rgvfuqvkyq = materialTextView4;
    }

    public static kegysxyocb iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appBarLayout != null) {
            i13 = pm.eablkybsjg.btnBack;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = pm.eablkybsjg.defaultCatalogSearchContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (constraintLayout != null) {
                    i13 = pm.eablkybsjg.ivBackgroundImage;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (shapeableImageView != null) {
                        i13 = pm.eablkybsjg.ivIcon;
                        ShapeableImageView shapeableImageView2 = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (shapeableImageView2 != null) {
                            i13 = pm.eablkybsjg.ivInfo;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (appCompatImageView2 != null) {
                                i13 = pm.eablkybsjg.llHeaderContainer;
                                LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (linearLayout != null) {
                                    i13 = pm.eablkybsjg.rvRestaurantProducts;
                                    RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (recyclerView != null) {
                                        i13 = pm.eablkybsjg.rvSubCategory;
                                        RecyclerView recyclerView2 = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (recyclerView2 != null) {
                                            i13 = pm.eablkybsjg.swipeRefresh;
                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (swipeRefreshLayout != null) {
                                                i13 = pm.eablkybsjg.toolbar;
                                                Toolbar toolbar = (Toolbar) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (toolbar != null) {
                                                    i13 = pm.eablkybsjg.tvDeliveryTime;
                                                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (materialTextView != null) {
                                                        i13 = pm.eablkybsjg.tvDescription;
                                                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                        if (materialTextView2 != null) {
                                                            i13 = pm.eablkybsjg.tvMinOrderSum;
                                                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                            if (materialTextView3 != null) {
                                                                i13 = pm.eablkybsjg.tvName;
                                                                MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                if (materialTextView4 != null) {
                                                                    return new kegysxyocb((CoordinatorLayout) view, appBarLayout, appCompatImageView, constraintLayout, shapeableImageView, shapeableImageView2, appCompatImageView2, linearLayout, recyclerView, recyclerView2, swipeRefreshLayout, toolbar, materialTextView, materialTextView2, materialTextView3, materialTextView4);
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
        return this.f65702iobyxmoadg;
    }
}
