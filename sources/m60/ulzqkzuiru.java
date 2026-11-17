package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.myspar.legacy.presentation.view.productrating.ProductRatingDetailsItemView;

/* JADX INFO: loaded from: classes4.dex */
public final class ulzqkzuiru implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f66033iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ProductRatingDetailsItemView f66034zoijcleaow;

    private ulzqkzuiru(FrameLayout frameLayout, ProductRatingDetailsItemView productRatingDetailsItemView) {
        this.f66033iobyxmoadg = frameLayout;
        this.f66034zoijcleaow = productRatingDetailsItemView;
    }

    public static ulzqkzuiru iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.productItem;
        ProductRatingDetailsItemView productRatingDetailsItemView = (ProductRatingDetailsItemView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (productRatingDetailsItemView != null) {
            return new ulzqkzuiru((FrameLayout) view, productRatingDetailsItemView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static ulzqkzuiru ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_all_product_review, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f66033iobyxmoadg;
    }
}
