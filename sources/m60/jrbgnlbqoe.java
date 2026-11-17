package m60;

import android.view.View;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class jrbgnlbqoe implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final ShimmerFrameLayout f65661dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final View f65662eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final View f65663gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f65664iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final View f65665lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final View f65666nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final View f65667ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final View f65668wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final View f65669zoijcleaow;

    private jrbgnlbqoe(LinearLayout linearLayout, View view, View view2, View view3, View view4, View view5, View view6, View view7, ShimmerFrameLayout shimmerFrameLayout) {
        this.f65664iobyxmoadg = linearLayout;
        this.f65669zoijcleaow = view;
        this.f65667ppxfxbqfkf = view2;
        this.f65668wkgbmnqykc = view3;
        this.f65662eablkybsjg = view4;
        this.f65663gxszxtbevo = view5;
        this.f65665lqeggnwhkg = view6;
        this.f65666nufgyqmvbu = view7;
        this.f65661dxjokdxxww = shimmerFrameLayout;
    }

    public static jrbgnlbqoe iobyxmoadg(View view) {
        View viewIobyxmoadg;
        View viewIobyxmoadg2;
        View viewIobyxmoadg3;
        View viewIobyxmoadg4;
        View viewIobyxmoadg5;
        View viewIobyxmoadg6;
        int i13 = pm.eablkybsjg.combo_set_old_price;
        View viewIobyxmoadg7 = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg7 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.combo_set_price))) != null && (viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.product_first))) != null && (viewIobyxmoadg3 = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.product_first_price))) != null && (viewIobyxmoadg4 = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.product_second))) != null && (viewIobyxmoadg5 = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.product_second_price))) != null && (viewIobyxmoadg6 = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.sale_of_percent))) != null) {
            i13 = pm.eablkybsjg.shimmerTitle;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (shimmerFrameLayout != null) {
                return new jrbgnlbqoe((LinearLayout) view, viewIobyxmoadg7, viewIobyxmoadg, viewIobyxmoadg2, viewIobyxmoadg3, viewIobyxmoadg4, viewIobyxmoadg5, viewIobyxmoadg6, shimmerFrameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f65664iobyxmoadg;
    }
}
