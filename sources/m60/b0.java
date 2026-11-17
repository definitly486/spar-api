package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.BuyButtonNew;
import ru.myspar.legacy.presentation.view.ProductCounterNew;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f65354dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f65355eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f65356gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65357iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f65358lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f65359nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ProductCounterNew f65360ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ShapeableImageView f65361wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final BuyButtonNew f65362zoijcleaow;

    private b0(ConstraintLayout constraintLayout, BuyButtonNew buyButtonNew, ProductCounterNew productCounterNew, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        this.f65357iobyxmoadg = constraintLayout;
        this.f65362zoijcleaow = buyButtonNew;
        this.f65360ppxfxbqfkf = productCounterNew;
        this.f65361wkgbmnqykc = shapeableImageView;
        this.f65355eablkybsjg = materialTextView;
        this.f65356gxszxtbevo = materialTextView2;
        this.f65358lqeggnwhkg = materialTextView3;
        this.f65359nufgyqmvbu = materialTextView4;
        this.f65354dxjokdxxww = materialTextView5;
    }

    public static b0 iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnBuy;
        BuyButtonNew buyButtonNew = (BuyButtonNew) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (buyButtonNew != null) {
            i13 = pm.eablkybsjg.counter;
            ProductCounterNew productCounterNew = (ProductCounterNew) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (productCounterNew != null) {
                i13 = pm.eablkybsjg.ivProductPhoto;
                ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (shapeableImageView != null) {
                    i13 = pm.eablkybsjg.tvName;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = pm.eablkybsjg.tvTotalPrice;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            i13 = pm.eablkybsjg.tvTotalPriceCurrency;
                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView3 != null) {
                                i13 = pm.eablkybsjg.tvTotalPriceDecimal;
                                MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView4 != null) {
                                    i13 = pm.eablkybsjg.tvWeightPerUnit;
                                    MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView5 != null) {
                                        return new b0((ConstraintLayout) view, buyButtonNew, productCounterNew, shapeableImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5);
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

    public static b0 ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.view_restaurant_product, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65357iobyxmoadg;
    }
}
