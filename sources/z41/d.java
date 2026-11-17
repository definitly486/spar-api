package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.legacy.presentation.view.BuyButtonNew;
import ru.myspar.proloyalty.legacy.presentation.view.ProductCounterNew;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f127901dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f127902eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f127903gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f127904iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f127905lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f127906nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ProductCounterNew f127907ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ShapeableImageView f127908wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final BuyButtonNew f127909zoijcleaow;

    private d(ConstraintLayout constraintLayout, BuyButtonNew buyButtonNew, ProductCounterNew productCounterNew, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        this.f127904iobyxmoadg = constraintLayout;
        this.f127909zoijcleaow = buyButtonNew;
        this.f127907ppxfxbqfkf = productCounterNew;
        this.f127908wkgbmnqykc = shapeableImageView;
        this.f127902eablkybsjg = materialTextView;
        this.f127903gxszxtbevo = materialTextView2;
        this.f127905lqeggnwhkg = materialTextView3;
        this.f127906nufgyqmvbu = materialTextView4;
        this.f127901dxjokdxxww = materialTextView5;
    }

    public static d iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnBuy;
        BuyButtonNew buyButtonNew = (BuyButtonNew) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (buyButtonNew != null) {
            i13 = vk0.wkgbmnqykc.counter;
            ProductCounterNew productCounterNew = (ProductCounterNew) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (productCounterNew != null) {
                i13 = vk0.wkgbmnqykc.ivProductPhoto;
                ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (shapeableImageView != null) {
                    i13 = vk0.wkgbmnqykc.tvName;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = vk0.wkgbmnqykc.tvTotalPrice;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            i13 = vk0.wkgbmnqykc.tvTotalPriceCurrency;
                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView3 != null) {
                                i13 = vk0.wkgbmnqykc.tvTotalPriceDecimal;
                                MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView4 != null) {
                                    i13 = vk0.wkgbmnqykc.tvWeightPerUnit;
                                    MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView5 != null) {
                                        return new d((ConstraintLayout) view, buyButtonNew, productCounterNew, shapeableImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5);
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

    public static d ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.view_restaurant_product_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f127904iobyxmoadg;
    }
}
