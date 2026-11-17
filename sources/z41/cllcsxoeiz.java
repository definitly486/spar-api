package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.myspar.proloyalty.legacy.presentation.view.productrating.ProductRatingDetailsItemView;

/* JADX INFO: loaded from: classes5.dex */
public final class cllcsxoeiz implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f127889iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ProductRatingDetailsItemView f127890zoijcleaow;

    private cllcsxoeiz(FrameLayout frameLayout, ProductRatingDetailsItemView productRatingDetailsItemView) {
        this.f127889iobyxmoadg = frameLayout;
        this.f127890zoijcleaow = productRatingDetailsItemView;
    }

    public static cllcsxoeiz iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.productItem;
        ProductRatingDetailsItemView productRatingDetailsItemView = (ProductRatingDetailsItemView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (productRatingDetailsItemView != null) {
            return new cllcsxoeiz((FrameLayout) view, productRatingDetailsItemView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static cllcsxoeiz ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_all_product_review_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f127889iobyxmoadg;
    }
}
