package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.ProductPriceView;

/* JADX INFO: loaded from: classes4.dex */
public final class bfopjjpdmp implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final ProductPriceView f65363btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f65364dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ShapeableImageView f65365eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f65366gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f65367iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f65368lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f65369nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ConstraintLayout f65370ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialCardView f65371wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f65372zoijcleaow;

    private bfopjjpdmp(MaterialCardView materialCardView, MaterialButton materialButton, ConstraintLayout constraintLayout, MaterialCardView materialCardView2, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, ProductPriceView productPriceView) {
        this.f65367iobyxmoadg = materialCardView;
        this.f65372zoijcleaow = materialButton;
        this.f65370ppxfxbqfkf = constraintLayout;
        this.f65371wkgbmnqykc = materialCardView2;
        this.f65365eablkybsjg = shapeableImageView;
        this.f65366gxszxtbevo = materialTextView;
        this.f65368lqeggnwhkg = materialTextView2;
        this.f65369nufgyqmvbu = materialTextView3;
        this.f65364dxjokdxxww = materialTextView4;
        this.f65363btonecajqb = productPriceView;
    }

    public static bfopjjpdmp iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnAction;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.clBackground;
            ConstraintLayout constraintLayout = (ConstraintLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (constraintLayout != null) {
                MaterialCardView materialCardView = (MaterialCardView) view;
                i13 = pm.eablkybsjg.ivPhoto;
                ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (shapeableImageView != null) {
                    i13 = pm.eablkybsjg.tvCurrencyOldPrice;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = pm.eablkybsjg.tvDescription;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            i13 = pm.eablkybsjg.tvName;
                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView3 != null) {
                                i13 = pm.eablkybsjg.tvOldPrice;
                                MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView4 != null) {
                                    i13 = pm.eablkybsjg.tvPrice;
                                    ProductPriceView productPriceView = (ProductPriceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (productPriceView != null) {
                                        return new bfopjjpdmp(materialCardView, materialButton, constraintLayout, materialCardView, shapeableImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4, productPriceView);
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

    public static bfopjjpdmp ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_promo_slider_product_card, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f65367iobyxmoadg;
    }
}
