package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class yzdjzghtvl implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialCardView f66170eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f66171gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f66172iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final RecyclerView f66173ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ShapeableImageView f66174wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f66175zoijcleaow;

    private yzdjzghtvl(View view, ComposeView composeView, RecyclerView recyclerView, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, MaterialTextView materialTextView) {
        this.f66172iobyxmoadg = view;
        this.f66175zoijcleaow = composeView;
        this.f66173ppxfxbqfkf = recyclerView;
        this.f66174wkgbmnqykc = shapeableImageView;
        this.f66170eablkybsjg = materialCardView;
        this.f66171gxszxtbevo = materialTextView;
    }

    public static yzdjzghtvl iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.cvAdPlate;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = pm.eablkybsjg.rvBanners;
            RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (recyclerView != null) {
                i13 = pm.eablkybsjg.singleBanner;
                ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (shapeableImageView != null) {
                    i13 = pm.eablkybsjg.singleBannerRoot;
                    MaterialCardView materialCardView = (MaterialCardView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialCardView != null) {
                        i13 = pm.eablkybsjg.tvBannersCaption;
                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView != null) {
                            return new yzdjzghtvl(view, composeView, recyclerView, shapeableImageView, materialCardView, materialTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static yzdjzghtvl zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(pm.gxszxtbevo.view_banners_layout, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f66172iobyxmoadg;
    }
}
