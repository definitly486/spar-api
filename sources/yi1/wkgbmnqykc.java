package yi1;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.aitsuki.swipe.SwipeMenuRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.legacy.presentation.view.ProductPriceView;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final SwipeMenuRecyclerView f125453btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f125454draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final ConstraintLayout f125455dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ComposeView f125456eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f125457gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Group f125458gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f125459iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Group f125460lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final ProductPriceView f125461nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f125462ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f125463wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ComposeView f125464wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final View f125465zoijcleaow;

    private wkgbmnqykc(ConstraintLayout constraintLayout, View view, MaterialButton materialButton, ComposeView composeView, ComposeView composeView2, Group group, Group group2, ProductPriceView productPriceView, ConstraintLayout constraintLayout2, SwipeMenuRecyclerView swipeMenuRecyclerView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f125459iobyxmoadg = constraintLayout;
        this.f125465zoijcleaow = view;
        this.f125462ppxfxbqfkf = materialButton;
        this.f125464wkgbmnqykc = composeView;
        this.f125456eablkybsjg = composeView2;
        this.f125458gxszxtbevo = group;
        this.f125460lqeggnwhkg = group2;
        this.f125461nufgyqmvbu = productPriceView;
        this.f125455dxjokdxxww = constraintLayout2;
        this.f125453btonecajqb = swipeMenuRecyclerView;
        this.f125457gtknphoqwx = materialTextView;
        this.f125454draadjrbmk = materialTextView2;
        this.f125463wflxmlrfwp = materialTextView3;
    }

    public static wkgbmnqykc iobyxmoadg(View view) {
        int i13 = ti1.eablkybsjg.bottomDivider;
        View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg != null) {
            i13 = ti1.eablkybsjg.btnNavigateToCatalog;
            MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton != null) {
                i13 = ti1.eablkybsjg.clLoading;
                ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView != null) {
                    i13 = ti1.eablkybsjg.cvActionBar;
                    ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (composeView2 != null) {
                        i13 = ti1.eablkybsjg.groupEmptyView;
                        Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (group != null) {
                            i13 = ti1.eablkybsjg.groupTotalCounter;
                            Group group2 = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (group2 != null) {
                                i13 = ti1.eablkybsjg.productPrice;
                                ProductPriceView productPriceView = (ProductPriceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (productPriceView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i13 = ti1.eablkybsjg.rvProducts;
                                    SwipeMenuRecyclerView swipeMenuRecyclerView = (SwipeMenuRecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (swipeMenuRecyclerView != null) {
                                        i13 = ti1.eablkybsjg.tvEmptyDescription;
                                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView != null) {
                                            i13 = ti1.eablkybsjg.tvEmptyTitle;
                                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView2 != null) {
                                                i13 = ti1.eablkybsjg.tvProductsCount;
                                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView3 != null) {
                                                    return new wkgbmnqykc(constraintLayout, viewIobyxmoadg, materialButton, composeView, composeView2, group, group2, productPriceView, constraintLayout, swipeMenuRecyclerView, materialTextView, materialTextView2, materialTextView3);
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
    public ConstraintLayout getRoot() {
        return this.f125459iobyxmoadg;
    }
}
