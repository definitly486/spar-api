package yi1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.aitsuki.swipe.SwipeLayout;
import ru.myspar.proloyalty.purchases.impl.specific.presentation.view.PurchaseProductView;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextView f125394eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final AppCompatImageView f125395gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SwipeLayout f125396iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final ConstraintLayout f125397lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final TextView f125398nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f125399ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ConstraintLayout f125400wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final PurchaseProductView f125401zoijcleaow;

    private draadjrbmk(SwipeLayout swipeLayout, PurchaseProductView purchaseProductView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, TextView textView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, TextView textView2) {
        this.f125396iobyxmoadg = swipeLayout;
        this.f125401zoijcleaow = purchaseProductView;
        this.f125399ppxfxbqfkf = appCompatImageView;
        this.f125400wkgbmnqykc = constraintLayout;
        this.f125394eablkybsjg = textView;
        this.f125395gxszxtbevo = appCompatImageView2;
        this.f125397lqeggnwhkg = constraintLayout2;
        this.f125398nufgyqmvbu = textView2;
    }

    public static draadjrbmk iobyxmoadg(View view) {
        int i13 = ti1.eablkybsjg.content;
        PurchaseProductView purchaseProductView = (PurchaseProductView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (purchaseProductView != null) {
            i13 = ti1.eablkybsjg.left_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                i13 = ti1.eablkybsjg.left_menu;
                ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (constraintLayout != null) {
                    i13 = ti1.eablkybsjg.left_text;
                    TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (textView != null) {
                        i13 = ti1.eablkybsjg.right_icon;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (appCompatImageView2 != null) {
                            i13 = ti1.eablkybsjg.right_menu;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (constraintLayout2 != null) {
                                i13 = ti1.eablkybsjg.right_text;
                                TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (textView2 != null) {
                                    return new draadjrbmk((SwipeLayout) view, purchaseProductView, appCompatImageView, constraintLayout, textView, appCompatImageView2, constraintLayout2, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static draadjrbmk ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(ti1.gxszxtbevo.purchase_product_item_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public SwipeLayout getRoot() {
        return this.f125396iobyxmoadg;
    }
}
