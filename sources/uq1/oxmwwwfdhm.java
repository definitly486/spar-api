package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.map.MapSpecialBannerLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class oxmwwwfdhm implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MapSpecialBannerLayoutView f114193iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MapSpecialBannerLayoutView f114194zoijcleaow;

    private oxmwwwfdhm(MapSpecialBannerLayoutView mapSpecialBannerLayoutView, MapSpecialBannerLayoutView mapSpecialBannerLayoutView2) {
        this.f114193iobyxmoadg = mapSpecialBannerLayoutView;
        this.f114194zoijcleaow = mapSpecialBannerLayoutView2;
    }

    public static oxmwwwfdhm iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MapSpecialBannerLayoutView mapSpecialBannerLayoutView = (MapSpecialBannerLayoutView) view;
        return new oxmwwwfdhm(mapSpecialBannerLayoutView, mapSpecialBannerLayoutView);
    }

    public static oxmwwwfdhm ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(mq1.zoijcleaow.item_special_banner_map_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MapSpecialBannerLayoutView getRoot() {
        return this.f114193iobyxmoadg;
    }
}
