package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.specialbanner.impl.presentation.views.map.ShopServicesView;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ShopServicesView f15306eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f15307iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f15308ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f15309wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f15310zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, ShopServicesView shopServicesView) {
        this.f15307iobyxmoadg = constraintLayout;
        this.f15310zoijcleaow = materialTextView;
        this.f15308ppxfxbqfkf = materialTextView2;
        this.f15309wkgbmnqykc = materialTextView3;
        this.f15306eablkybsjg = shopServicesView;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = t42.iobyxmoadg.tvAddress;
        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialTextView != null) {
            i13 = t42.iobyxmoadg.tvShopType;
            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView2 != null) {
                i13 = t42.iobyxmoadg.tvWorkTime;
                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView3 != null) {
                    i13 = t42.iobyxmoadg.vShopServices;
                    ShopServicesView shopServicesView = (ShopServicesView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (shopServicesView != null) {
                        return new iobyxmoadg((ConstraintLayout) view, materialTextView, materialTextView2, materialTextView3, shopServicesView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static iobyxmoadg ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_nearest_shop, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f15307iobyxmoadg;
    }
}
