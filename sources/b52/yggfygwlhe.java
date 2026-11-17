package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.specialbanner.impl.presentation.views.VerticalPromoBlockLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class yggfygwlhe implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final VerticalPromoBlockLayoutView f15347iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final VerticalPromoBlockLayoutView f15348zoijcleaow;

    private yggfygwlhe(VerticalPromoBlockLayoutView verticalPromoBlockLayoutView, VerticalPromoBlockLayoutView verticalPromoBlockLayoutView2) {
        this.f15347iobyxmoadg = verticalPromoBlockLayoutView;
        this.f15348zoijcleaow = verticalPromoBlockLayoutView2;
    }

    public static yggfygwlhe iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerticalPromoBlockLayoutView verticalPromoBlockLayoutView = (VerticalPromoBlockLayoutView) view;
        return new yggfygwlhe(verticalPromoBlockLayoutView, verticalPromoBlockLayoutView);
    }

    public static yggfygwlhe ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_promo_products_block, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public VerticalPromoBlockLayoutView getRoot() {
        return this.f15347iobyxmoadg;
    }
}
