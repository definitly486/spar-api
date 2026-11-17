package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.proloyalty.legacy.presentation.view.banners.BannerPromoLayoutView;

/* JADX INFO: loaded from: classes5.dex */
public final class crxdokpmqz implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final BannerPromoLayoutView f127898iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final BannerPromoLayoutView f127899zoijcleaow;

    private crxdokpmqz(BannerPromoLayoutView bannerPromoLayoutView, BannerPromoLayoutView bannerPromoLayoutView2) {
        this.f127898iobyxmoadg = bannerPromoLayoutView;
        this.f127899zoijcleaow = bannerPromoLayoutView2;
    }

    public static crxdokpmqz iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BannerPromoLayoutView bannerPromoLayoutView = (BannerPromoLayoutView) view;
        return new crxdokpmqz(bannerPromoLayoutView, bannerPromoLayoutView);
    }

    public static crxdokpmqz ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_myspar_promo_banner_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public BannerPromoLayoutView getRoot() {
        return this.f127898iobyxmoadg;
    }
}
