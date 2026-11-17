package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.specialbanner.impl.presentation.views.IconsTwoSpecialBannerLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class ojitshcjhn implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final IconsTwoSpecialBannerLayoutView f15329iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final IconsTwoSpecialBannerLayoutView f15330zoijcleaow;

    private ojitshcjhn(IconsTwoSpecialBannerLayoutView iconsTwoSpecialBannerLayoutView, IconsTwoSpecialBannerLayoutView iconsTwoSpecialBannerLayoutView2) {
        this.f15329iobyxmoadg = iconsTwoSpecialBannerLayoutView;
        this.f15330zoijcleaow = iconsTwoSpecialBannerLayoutView2;
    }

    public static ojitshcjhn iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        IconsTwoSpecialBannerLayoutView iconsTwoSpecialBannerLayoutView = (IconsTwoSpecialBannerLayoutView) view;
        return new ojitshcjhn(iconsTwoSpecialBannerLayoutView, iconsTwoSpecialBannerLayoutView);
    }

    public static ojitshcjhn ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_icons_two, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public IconsTwoSpecialBannerLayoutView getRoot() {
        return this.f15329iobyxmoadg;
    }
}
