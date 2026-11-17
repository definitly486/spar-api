package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.ProductPriceView;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f65389btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final ProductPriceView f65390dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final g f65391eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f65392gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Guideline f65393gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f65394iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final ProductPriceView f65395lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final ProductPriceView f65396nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f65397ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final g f65398wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final FloatingActionButton f65399zoijcleaow;

    private c(MaterialCardView materialCardView, FloatingActionButton floatingActionButton, MaterialButton materialButton, g gVar, g gVar2, Guideline guideline, ProductPriceView productPriceView, ProductPriceView productPriceView2, ProductPriceView productPriceView3, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f65394iobyxmoadg = materialCardView;
        this.f65399zoijcleaow = floatingActionButton;
        this.f65397ppxfxbqfkf = materialButton;
        this.f65398wkgbmnqykc = gVar;
        this.f65391eablkybsjg = gVar2;
        this.f65393gxszxtbevo = guideline;
        this.f65395lqeggnwhkg = productPriceView;
        this.f65396nufgyqmvbu = productPriceView2;
        this.f65390dxjokdxxww = productPriceView3;
        this.f65389btonecajqb = materialTextView;
        this.f65392gtknphoqwx = materialTextView2;
    }

    public static c iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = pm.eablkybsjg.btnAddComboSetToBasket;
        FloatingActionButton floatingActionButton = (FloatingActionButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (floatingActionButton != null) {
            i13 = pm.eablkybsjg.btnShowAll;
            MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.cardProductFirst))) != null) {
                g gVarIobyxmoadg = g.iobyxmoadg(viewIobyxmoadg);
                i13 = pm.eablkybsjg.cardProductSecond;
                View viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, i13);
                if (viewIobyxmoadg2 != null) {
                    g gVarIobyxmoadg2 = g.iobyxmoadg(viewIobyxmoadg2);
                    i13 = pm.eablkybsjg.gl_products_end;
                    Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (guideline != null) {
                        i13 = pm.eablkybsjg.priceCombo;
                        ProductPriceView productPriceView = (ProductPriceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (productPriceView != null) {
                            i13 = pm.eablkybsjg.priceProductFirst;
                            ProductPriceView productPriceView2 = (ProductPriceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (productPriceView2 != null) {
                                i13 = pm.eablkybsjg.priceProductSecond;
                                ProductPriceView productPriceView3 = (ProductPriceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (productPriceView3 != null) {
                                    i13 = pm.eablkybsjg.tvDiscountAmount;
                                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView != null) {
                                        i13 = pm.eablkybsjg.tvOldPrice;
                                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView2 != null) {
                                            return new c((MaterialCardView) view, floatingActionButton, materialButton, gVarIobyxmoadg, gVarIobyxmoadg2, guideline, productPriceView, productPriceView2, productPriceView3, materialTextView, materialTextView2);
                                        }
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

    public static c ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.view_combo_set_card_item_layout, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f65394iobyxmoadg;
    }
}
