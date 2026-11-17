package c81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import ru.myspar.proloyalty.legacy.presentation.view.ProductPriceView;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextView f19213eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ProductPriceView f19214gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f19215iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final TextView f19216lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f19217ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ShapeableImageView f19218wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ProgressBar f19219zoijcleaow;

    private eablkybsjg(ConstraintLayout constraintLayout, ProgressBar progressBar, MaterialButton materialButton, ShapeableImageView shapeableImageView, TextView textView, ProductPriceView productPriceView, TextView textView2) {
        this.f19215iobyxmoadg = constraintLayout;
        this.f19219zoijcleaow = progressBar;
        this.f19217ppxfxbqfkf = materialButton;
        this.f19218wkgbmnqykc = shapeableImageView;
        this.f19213eablkybsjg = textView;
        this.f19214gxszxtbevo = productPriceView;
        this.f19216lqeggnwhkg = textView2;
    }

    public static eablkybsjg iobyxmoadg(View view) {
        int i13 = u71.wkgbmnqykc.pbLoading;
        ProgressBar progressBar = (ProgressBar) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (progressBar != null) {
            i13 = u71.wkgbmnqykc.productButton;
            MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton != null) {
                i13 = u71.wkgbmnqykc.productImage;
                ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (shapeableImageView != null) {
                    i13 = u71.wkgbmnqykc.productName;
                    TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (textView != null) {
                        i13 = u71.wkgbmnqykc.productPrice;
                        ProductPriceView productPriceView = (ProductPriceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (productPriceView != null) {
                            i13 = u71.wkgbmnqykc.productPriceOld;
                            TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (textView2 != null) {
                                return new eablkybsjg((ConstraintLayout) view, progressBar, materialButton, shapeableImageView, textView, productPriceView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static eablkybsjg ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(u71.eablkybsjg.item_evropolis_dialog_product_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f19215iobyxmoadg;
    }
}
