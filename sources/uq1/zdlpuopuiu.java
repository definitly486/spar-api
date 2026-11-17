package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.ProductsBlockLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class zdlpuopuiu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ProductsBlockLayoutView f114210iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ProductsBlockLayoutView f114211zoijcleaow;

    private zdlpuopuiu(ProductsBlockLayoutView productsBlockLayoutView, ProductsBlockLayoutView productsBlockLayoutView2) {
        this.f114210iobyxmoadg = productsBlockLayoutView;
        this.f114211zoijcleaow = productsBlockLayoutView2;
    }

    public static zdlpuopuiu iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ProductsBlockLayoutView productsBlockLayoutView = (ProductsBlockLayoutView) view;
        return new zdlpuopuiu(productsBlockLayoutView, productsBlockLayoutView);
    }

    public static zdlpuopuiu ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(mq1.zoijcleaow.item_special_banner_products_block_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ProductsBlockLayoutView getRoot() {
        return this.f114210iobyxmoadg;
    }
}
