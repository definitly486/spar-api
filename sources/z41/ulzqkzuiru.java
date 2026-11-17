package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.proloyalty.legacy.presentation.view.BrandLayoutView;

/* JADX INFO: loaded from: classes5.dex */
public final class ulzqkzuiru implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final BrandLayoutView f128412iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final BrandLayoutView f128413zoijcleaow;

    private ulzqkzuiru(BrandLayoutView brandLayoutView, BrandLayoutView brandLayoutView2) {
        this.f128412iobyxmoadg = brandLayoutView;
        this.f128413zoijcleaow = brandLayoutView2;
    }

    public static ulzqkzuiru iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BrandLayoutView brandLayoutView = (BrandLayoutView) view;
        return new ulzqkzuiru(brandLayoutView, brandLayoutView);
    }

    public static ulzqkzuiru ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_myspar_brands_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public BrandLayoutView getRoot() {
        return this.f128412iobyxmoadg;
    }
}
