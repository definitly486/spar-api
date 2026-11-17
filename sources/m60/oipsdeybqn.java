package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.ProductPriceView;

/* JADX INFO: loaded from: classes4.dex */
public final class oipsdeybqn implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f65836eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ProductPriceView f65837gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65838iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f65839lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ShapeableImageView f65840ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f65841wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f65842zoijcleaow;

    private oipsdeybqn(ConstraintLayout constraintLayout, MaterialButton materialButton, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, ProductPriceView productPriceView, MaterialTextView materialTextView3) {
        this.f65838iobyxmoadg = constraintLayout;
        this.f65842zoijcleaow = materialButton;
        this.f65840ppxfxbqfkf = shapeableImageView;
        this.f65841wkgbmnqykc = materialTextView;
        this.f65836eablkybsjg = materialTextView2;
        this.f65837gxszxtbevo = productPriceView;
        this.f65839lqeggnwhkg = materialTextView3;
    }

    public static oipsdeybqn iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnAction;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.ivProductPhoto;
            ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (shapeableImageView != null) {
                i13 = pm.eablkybsjg.tvCurrencyOldPrice;
                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    i13 = pm.eablkybsjg.tvOldPrice;
                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView2 != null) {
                        i13 = pm.eablkybsjg.tvProductPrice;
                        ProductPriceView productPriceView = (ProductPriceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (productPriceView != null) {
                            i13 = pm.eablkybsjg.tvProductTitle;
                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView3 != null) {
                                return new oipsdeybqn((ConstraintLayout) view, materialButton, shapeableImageView, materialTextView, materialTextView2, productPriceView, materialTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static oipsdeybqn ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_promo_product, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65838iobyxmoadg;
    }
}
