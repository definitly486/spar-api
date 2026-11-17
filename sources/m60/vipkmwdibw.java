package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.myspar.legacy.presentation.view.product.RestaurantProductView;

/* JADX INFO: loaded from: classes4.dex */
public final class vipkmwdibw implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f66045iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final FrameLayout f66046ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final RestaurantProductView f66047zoijcleaow;

    private vipkmwdibw(FrameLayout frameLayout, RestaurantProductView restaurantProductView, FrameLayout frameLayout2) {
        this.f66045iobyxmoadg = frameLayout;
        this.f66047zoijcleaow = restaurantProductView;
        this.f66046ppxfxbqfkf = frameLayout2;
    }

    public static vipkmwdibw iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.productView;
        RestaurantProductView restaurantProductView = (RestaurantProductView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (restaurantProductView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new vipkmwdibw(frameLayout, restaurantProductView, frameLayout);
    }

    public static vipkmwdibw ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_grid_restaurant_product, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f66045iobyxmoadg;
    }
}
