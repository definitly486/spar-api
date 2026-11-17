package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.legacy.presentation.view.banners.BannerPromoLayoutView;

/* JADX INFO: loaded from: classes4.dex */
public final class metgxyhuhe implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final BannerPromoLayoutView f65794iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final BannerPromoLayoutView f65795zoijcleaow;

    private metgxyhuhe(BannerPromoLayoutView bannerPromoLayoutView, BannerPromoLayoutView bannerPromoLayoutView2) {
        this.f65794iobyxmoadg = bannerPromoLayoutView;
        this.f65795zoijcleaow = bannerPromoLayoutView2;
    }

    public static metgxyhuhe iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BannerPromoLayoutView bannerPromoLayoutView = (BannerPromoLayoutView) view;
        return new metgxyhuhe(bannerPromoLayoutView, bannerPromoLayoutView);
    }

    public static metgxyhuhe ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_myspar_promo_banner, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public BannerPromoLayoutView getRoot() {
        return this.f65794iobyxmoadg;
    }
}
