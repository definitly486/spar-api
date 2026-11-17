package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.myspar.proloyalty.legacy.presentation.view.promotion.PromoView;

/* JADX INFO: loaded from: classes5.dex */
public final class ikoacuggdj implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f128097iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final PromoView f128098zoijcleaow;

    private ikoacuggdj(FrameLayout frameLayout, PromoView promoView) {
        this.f128097iobyxmoadg = frameLayout;
        this.f128098zoijcleaow = promoView;
    }

    public static ikoacuggdj iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.promoView;
        PromoView promoView = (PromoView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (promoView != null) {
            return new ikoacuggdj((FrameLayout) view, promoView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static ikoacuggdj ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_promo_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f128097iobyxmoadg;
    }
}
