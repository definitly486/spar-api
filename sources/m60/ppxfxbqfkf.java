package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.ProductPriceView;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Space f65905eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Space f65906gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65907iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f65908lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ImageView f65909ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ProductPriceView f65910wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final g f65911zoijcleaow;

    private ppxfxbqfkf(ConstraintLayout constraintLayout, g gVar, ImageView imageView, ProductPriceView productPriceView, Space space, Space space2, MaterialTextView materialTextView) {
        this.f65907iobyxmoadg = constraintLayout;
        this.f65911zoijcleaow = gVar;
        this.f65909ppxfxbqfkf = imageView;
        this.f65910wkgbmnqykc = productPriceView;
        this.f65905eablkybsjg = space;
        this.f65906gxszxtbevo = space2;
        this.f65908lqeggnwhkg = materialTextView;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.containerProductImage;
        View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg != null) {
            g gVarIobyxmoadg = g.iobyxmoadg(viewIobyxmoadg);
            i13 = pm.eablkybsjg.ivChecked;
            ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (imageView != null) {
                i13 = pm.eablkybsjg.productPrice;
                ProductPriceView productPriceView = (ProductPriceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (productPriceView != null) {
                    i13 = pm.eablkybsjg.spaceAfterEndOfImage;
                    Space space = (Space) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (space != null) {
                        i13 = pm.eablkybsjg.spaceBeforeCheckBox;
                        Space space2 = (Space) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (space2 != null) {
                            i13 = pm.eablkybsjg.tvProductName;
                            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView != null) {
                                return new ppxfxbqfkf((ConstraintLayout) view, gVarIobyxmoadg, imageView, productPriceView, space, space2, materialTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static ppxfxbqfkf ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.dialog_build_your_combo_list_item, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65907iobyxmoadg;
    }
}
