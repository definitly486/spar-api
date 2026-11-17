package yi0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import xi0.eablkybsjg;
import xi0.wkgbmnqykc;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextView f125381eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextView f125382gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f125383iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final TextView f125384lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ShapeableImageView f125385ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialRadioButton f125386wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f125387zoijcleaow;

    private ppxfxbqfkf(ConstraintLayout constraintLayout, ComposeView composeView, ShapeableImageView shapeableImageView, MaterialRadioButton materialRadioButton, TextView textView, TextView textView2, TextView textView3) {
        this.f125383iobyxmoadg = constraintLayout;
        this.f125387zoijcleaow = composeView;
        this.f125385ppxfxbqfkf = shapeableImageView;
        this.f125386wkgbmnqykc = materialRadioButton;
        this.f125381eablkybsjg = textView;
        this.f125382gxszxtbevo = textView2;
        this.f125384lqeggnwhkg = textView3;
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
        View viewInflate = layoutInflater.inflate(eablkybsjg.item_replacement_product, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f125383iobyxmoadg;
    }
}
