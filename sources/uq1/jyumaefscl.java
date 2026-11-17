package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.HorizontalPromoBlockLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class jyumaefscl implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final HorizontalPromoBlockLayoutView f114177iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final HorizontalPromoBlockLayoutView f114178zoijcleaow;

    private jyumaefscl(HorizontalPromoBlockLayoutView horizontalPromoBlockLayoutView, HorizontalPromoBlockLayoutView horizontalPromoBlockLayoutView2) {
        this.f114177iobyxmoadg = horizontalPromoBlockLayoutView;
        this.f114178zoijcleaow = horizontalPromoBlockLayoutView2;
    }

    public static jyumaefscl iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        HorizontalPromoBlockLayoutView horizontalPromoBlockLayoutView = (HorizontalPromoBlockLayoutView) view;
        return new jyumaefscl(horizontalPromoBlockLayoutView, horizontalPromoBlockLayoutView);
    }

    public static jyumaefscl ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(mq1.zoijcleaow.item_special_banner_promo_slider_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public HorizontalPromoBlockLayoutView getRoot() {
        return this.f114177iobyxmoadg;
    }
}
