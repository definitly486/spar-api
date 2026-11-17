package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class dvvnrvtcbc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialCardView f127919eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f127920gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f127921iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final RecyclerView f127922ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ShapeableImageView f127923wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f127924zoijcleaow;

    private dvvnrvtcbc(View view, ComposeView composeView, RecyclerView recyclerView, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, MaterialTextView materialTextView) {
        this.f127921iobyxmoadg = view;
        this.f127924zoijcleaow = composeView;
        this.f127922ppxfxbqfkf = recyclerView;
        this.f127923wkgbmnqykc = shapeableImageView;
        this.f127919eablkybsjg = materialCardView;
        this.f127920gxszxtbevo = materialTextView;
    }

    public static dvvnrvtcbc iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.cvAdPlate;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = vk0.wkgbmnqykc.rvBanners;
            RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (recyclerView != null) {
                i13 = vk0.wkgbmnqykc.singleBanner;
                ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (shapeableImageView != null) {
                    i13 = vk0.wkgbmnqykc.singleBannerRoot;
                    MaterialCardView materialCardView = (MaterialCardView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialCardView != null) {
                        i13 = vk0.wkgbmnqykc.tvBannersCaption;
                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView != null) {
                            return new dvvnrvtcbc(view, composeView, recyclerView, shapeableImageView, materialCardView, materialTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static dvvnrvtcbc zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(vk0.eablkybsjg.view_banners_layout_proloyalty, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f127921iobyxmoadg;
    }
}
