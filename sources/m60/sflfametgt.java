package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.myspar.legacy.presentation.view.promotion.PromoView;

/* JADX INFO: loaded from: classes4.dex */
public final class sflfametgt implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f65970iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final PromoView f65971zoijcleaow;

    private sflfametgt(FrameLayout frameLayout, PromoView promoView) {
        this.f65970iobyxmoadg = frameLayout;
        this.f65971zoijcleaow = promoView;
    }

    public static sflfametgt iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.promoView;
        PromoView promoView = (PromoView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (promoView != null) {
            return new sflfametgt((FrameLayout) view, promoView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static sflfametgt ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_promo, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f65970iobyxmoadg;
    }
}
