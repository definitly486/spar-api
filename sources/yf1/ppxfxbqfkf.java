package yf1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import xf1.eablkybsjg;
import xf1.wkgbmnqykc;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextView f124730eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextView f124731gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f124732iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final TextView f124733lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ShapeableImageView f124734ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialRadioButton f124735wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f124736zoijcleaow;

    private ppxfxbqfkf(ConstraintLayout constraintLayout, ComposeView composeView, ShapeableImageView shapeableImageView, MaterialRadioButton materialRadioButton, TextView textView, TextView textView2, TextView textView3) {
        this.f124732iobyxmoadg = constraintLayout;
        this.f124736zoijcleaow = composeView;
        this.f124734ppxfxbqfkf = shapeableImageView;
        this.f124735wkgbmnqykc = materialRadioButton;
        this.f124730eablkybsjg = textView;
        this.f124731gxszxtbevo = textView2;
        this.f124733lqeggnwhkg = textView3;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        int i13 = wkgbmnqykc.cvCounter;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = wkgbmnqykc.ivImage;
            ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (shapeableImageView != null) {
                i13 = wkgbmnqykc.rbProduct;
                MaterialRadioButton materialRadioButton = (MaterialRadioButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialRadioButton != null) {
                    i13 = wkgbmnqykc.tvCountry;
                    TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (textView != null) {
                        i13 = wkgbmnqykc.tvName;
                        TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (textView2 != null) {
                            i13 = wkgbmnqykc.tvWeight;
                            TextView textView3 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (textView3 != null) {
                                return new ppxfxbqfkf((ConstraintLayout) view, composeView, shapeableImageView, materialRadioButton, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static ppxfxbqfkf ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(eablkybsjg.item_replacement_product_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f124732iobyxmoadg;
    }
}
