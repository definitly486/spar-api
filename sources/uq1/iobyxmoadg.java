package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.map.ShopServicesView;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ShopServicesView f114168eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f114169iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f114170ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f114171wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f114172zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, ShopServicesView shopServicesView) {
        this.f114169iobyxmoadg = constraintLayout;
        this.f114172zoijcleaow = materialTextView;
        this.f114170ppxfxbqfkf = materialTextView2;
        this.f114171wkgbmnqykc = materialTextView3;
        this.f114168eablkybsjg = shopServicesView;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = mq1.iobyxmoadg.tvAddress;
        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialTextView != null) {
            i13 = mq1.iobyxmoadg.tvShopType;
            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView2 != null) {
                i13 = mq1.iobyxmoadg.tvWorkTime;
                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView3 != null) {
                    i13 = mq1.iobyxmoadg.vShopServices;
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
        View viewInflate = layoutInflater.inflate(mq1.zoijcleaow.item_nearest_shop_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f114169iobyxmoadg;
    }
}
