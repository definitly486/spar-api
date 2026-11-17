package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.VerticalPromoBlockLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class yggfygwlhe implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final VerticalPromoBlockLayoutView f114208iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final VerticalPromoBlockLayoutView f114209zoijcleaow;

    private yggfygwlhe(VerticalPromoBlockLayoutView verticalPromoBlockLayoutView, VerticalPromoBlockLayoutView verticalPromoBlockLayoutView2) {
        this.f114208iobyxmoadg = verticalPromoBlockLayoutView;
        this.f114209zoijcleaow = verticalPromoBlockLayoutView2;
    }

    public static yggfygwlhe iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerticalPromoBlockLayoutView verticalPromoBlockLayoutView = (VerticalPromoBlockLayoutView) view;
        return new yggfygwlhe(verticalPromoBlockLayoutView, verticalPromoBlockLayoutView);
    }

    public static yggfygwlhe ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(mq1.zoijcleaow.item_special_banner_promo_products_block_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public VerticalPromoBlockLayoutView getRoot() {
        return this.f114208iobyxmoadg;
    }
}
