package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.legacy.presentation.view.ProductPriceView;

/* JADX INFO: loaded from: classes5.dex */
public final class okpsazkaxt implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final ProductPriceView f128299btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f128300dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ShapeableImageView f128301eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f128302gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f128303iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f128304lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f128305nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ConstraintLayout f128306ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialCardView f128307wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f128308zoijcleaow;

    private okpsazkaxt(MaterialCardView materialCardView, MaterialButton materialButton, ConstraintLayout constraintLayout, MaterialCardView materialCardView2, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, ProductPriceView productPriceView) {
        this.f128303iobyxmoadg = materialCardView;
        this.f128308zoijcleaow = materialButton;
        this.f128306ppxfxbqfkf = constraintLayout;
        this.f128307wkgbmnqykc = materialCardView2;
        this.f128301eablkybsjg = shapeableImageView;
        this.f128302gxszxtbevo = materialTextView;
        this.f128304lqeggnwhkg = materialTextView2;
        this.f128305nufgyqmvbu = materialTextView3;
        this.f128300dxjokdxxww = materialTextView4;
        this.f128299btonecajqb = productPriceView;
    }

    public static okpsazkaxt iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnAction;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.clBackground;
            ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (constraintLayout != null) {
                MaterialCardView materialCardView = (MaterialCardView) view;
                i13 = vk0.wkgbmnqykc.ivPhoto;
                ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (shapeableImageView != null) {
                    i13 = vk0.wkgbmnqykc.tvCurrencyOldPrice;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = vk0.wkgbmnqykc.tvDescription;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            i13 = vk0.wkgbmnqykc.tvName;
                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView3 != null) {
                                i13 = vk0.wkgbmnqykc.tvOldPrice;
                                MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView4 != null) {
                                    i13 = vk0.wkgbmnqykc.tvPrice;
                                    ProductPriceView productPriceView = (ProductPriceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (productPriceView != null) {
                                        return new okpsazkaxt(materialCardView, materialButton, constraintLayout, materialCardView, shapeableImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4, productPriceView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static okpsazkaxt ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_promo_slider_product_card_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f128303iobyxmoadg;
    }
}
