package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class ribwqtqdhb implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f128368iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ShapeableImageView f128369ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f128370zoijcleaow;

    private ribwqtqdhb(MaterialCardView materialCardView, ComposeView composeView, ShapeableImageView shapeableImageView) {
        this.f128368iobyxmoadg = materialCardView;
        this.f128370zoijcleaow = composeView;
        this.f128369ppxfxbqfkf = shapeableImageView;
    }

    public static ribwqtqdhb iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.cvAdPlate;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = vk0.wkgbmnqykc.ivBanner;
            ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (shapeableImageView != null) {
                return new ribwqtqdhb((MaterialCardView) view, composeView, shapeableImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static ribwqtqdhb ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_promo_banner_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f128368iobyxmoadg;
    }
}
