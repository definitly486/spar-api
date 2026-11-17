package sx1;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.aitsuki.swipe.SwipeMenuRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.ProductPriceView;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final SwipeMenuRecyclerView f108682btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f108683draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final ConstraintLayout f108684dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ComposeView f108685eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f108686gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Group f108687gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f108688iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Group f108689lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final ProductPriceView f108690nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f108691ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f108692wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ComposeView f108693wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final View f108694zoijcleaow;

    private wkgbmnqykc(ConstraintLayout constraintLayout, View view, MaterialButton materialButton, ComposeView composeView, ComposeView composeView2, Group group, Group group2, ProductPriceView productPriceView, ConstraintLayout constraintLayout2, SwipeMenuRecyclerView swipeMenuRecyclerView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f108688iobyxmoadg = constraintLayout;
        this.f108694zoijcleaow = view;
        this.f108691ppxfxbqfkf = materialButton;
        this.f108693wkgbmnqykc = composeView;
        this.f108685eablkybsjg = composeView2;
        this.f108687gxszxtbevo = group;
        this.f108689lqeggnwhkg = group2;
        this.f108690nufgyqmvbu = productPriceView;
        this.f108684dxjokdxxww = constraintLayout2;
        this.f108682btonecajqb = swipeMenuRecyclerView;
        this.f108686gtknphoqwx = materialTextView;
        this.f108683draadjrbmk = materialTextView2;
        this.f108692wflxmlrfwp = materialTextView3;
    }

    public static wkgbmnqykc iobyxmoadg(View view) {
        int i13 = nx1.eablkybsjg.bottomDivider;
        View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg != null) {
            i13 = nx1.eablkybsjg.btnNavigateToCatalog;
            MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton != null) {
                i13 = nx1.eablkybsjg.clLoading;
                ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView != null) {
                    i13 = nx1.eablkybsjg.cvActionBar;
                    ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (composeView2 != null) {
                        i13 = nx1.eablkybsjg.groupEmptyView;
                        Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (group != null) {
                            i13 = nx1.eablkybsjg.groupTotalCounter;
                            Group group2 = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (group2 != null) {
                                i13 = nx1.eablkybsjg.productPrice;
                                ProductPriceView productPriceView = (ProductPriceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (productPriceView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i13 = nx1.eablkybsjg.rvProducts;
                                    SwipeMenuRecyclerView swipeMenuRecyclerView = (SwipeMenuRecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (swipeMenuRecyclerView != null) {
                                        i13 = nx1.eablkybsjg.tvEmptyDescription;
                                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView != null) {
                                            i13 = nx1.eablkybsjg.tvEmptyTitle;
                                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView2 != null) {
                                                i13 = nx1.eablkybsjg.tvProductsCount;
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
        return this.f108688iobyxmoadg;
    }
}
