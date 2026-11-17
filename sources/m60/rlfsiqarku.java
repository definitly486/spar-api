package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.legacy.presentation.view.banners.BannerVideoLayoutView;

/* JADX INFO: loaded from: classes4.dex */
public final class rlfsiqarku implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final BannerVideoLayoutView f65940iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final BannerVideoLayoutView f65941zoijcleaow;

    private rlfsiqarku(BannerVideoLayoutView bannerVideoLayoutView, BannerVideoLayoutView bannerVideoLayoutView2) {
        this.f65940iobyxmoadg = bannerVideoLayoutView;
        this.f65941zoijcleaow = bannerVideoLayoutView2;
    }

    public static rlfsiqarku iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BannerVideoLayoutView bannerVideoLayoutView = (BannerVideoLayoutView) view;
        return new rlfsiqarku(bannerVideoLayoutView, bannerVideoLayoutView);
    }

    public static rlfsiqarku ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_myspar_video_banner, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public BannerVideoLayoutView getRoot() {
        return this.f65940iobyxmoadg;
    }
}
