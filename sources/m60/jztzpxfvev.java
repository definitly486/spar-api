package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.legacy.presentation.view.BrandLayoutView;

/* JADX INFO: loaded from: classes4.dex */
public final class jztzpxfvev implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final BrandLayoutView f65682iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final BrandLayoutView f65683zoijcleaow;

    private jztzpxfvev(BrandLayoutView brandLayoutView, BrandLayoutView brandLayoutView2) {
        this.f65682iobyxmoadg = brandLayoutView;
        this.f65683zoijcleaow = brandLayoutView2;
    }

    public static jztzpxfvev iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BrandLayoutView brandLayoutView = (BrandLayoutView) view;
        return new jztzpxfvev(brandLayoutView, brandLayoutView);
    }

    public static jztzpxfvev ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_myspar_brands, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public BrandLayoutView getRoot() {
        return this.f65682iobyxmoadg;
    }
}
