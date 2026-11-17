package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.specialbanner.impl.presentation.views.map.MapSpecialBannerLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class oxmwwwfdhm implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MapSpecialBannerLayoutView f15331iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MapSpecialBannerLayoutView f15332zoijcleaow;

    private oxmwwwfdhm(MapSpecialBannerLayoutView mapSpecialBannerLayoutView, MapSpecialBannerLayoutView mapSpecialBannerLayoutView2) {
        this.f15331iobyxmoadg = mapSpecialBannerLayoutView;
        this.f15332zoijcleaow = mapSpecialBannerLayoutView2;
    }

    public static oxmwwwfdhm iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MapSpecialBannerLayoutView mapSpecialBannerLayoutView = (MapSpecialBannerLayoutView) view;
        return new oxmwwwfdhm(mapSpecialBannerLayoutView, mapSpecialBannerLayoutView);
    }

    public static oxmwwwfdhm ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_map, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MapSpecialBannerLayoutView getRoot() {
        return this.f15331iobyxmoadg;
    }
}
