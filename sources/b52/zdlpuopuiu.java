package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.specialbanner.impl.presentation.views.ProductsBlockLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class zdlpuopuiu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ProductsBlockLayoutView f15349iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ProductsBlockLayoutView f15350zoijcleaow;

    private zdlpuopuiu(ProductsBlockLayoutView productsBlockLayoutView, ProductsBlockLayoutView productsBlockLayoutView2) {
        this.f15349iobyxmoadg = productsBlockLayoutView;
        this.f15350zoijcleaow = productsBlockLayoutView2;
    }

    public static zdlpuopuiu iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ProductsBlockLayoutView productsBlockLayoutView = (ProductsBlockLayoutView) view;
        return new zdlpuopuiu(productsBlockLayoutView, productsBlockLayoutView);
    }

    public static zdlpuopuiu ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_products_block, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ProductsBlockLayoutView getRoot() {
        return this.f15349iobyxmoadg;
    }
}
