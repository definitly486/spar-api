package z41;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.legacy.presentation.view.ProductPriceView;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final MaterialTextView f128237agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f128238btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f128239draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final AppCompatImageView f128240dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f128241eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f128242gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Guideline f128243gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128244iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f128245lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final ShapeableImageView f128246nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final MaterialTextView f128247ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialCardView f128248ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final View f128249rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final ProductPriceView f128250wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f128251wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f128252zoijcleaow;

    private lqeggnwhkg(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialCardView materialCardView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ShapeableImageView shapeableImageView, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, ProductPriceView productPriceView, MaterialTextView materialTextView4, MaterialTextView materialTextView5, View view) {
        this.f128244iobyxmoadg = constraintLayout;
        this.f128252zoijcleaow = materialButton;
        this.f128248ppxfxbqfkf = materialCardView;
        this.f128251wkgbmnqykc = guideline;
        this.f128241eablkybsjg = guideline2;
        this.f128243gxszxtbevo = guideline3;
        this.f128245lqeggnwhkg = guideline4;
        this.f128246nufgyqmvbu = shapeableImageView;
        this.f128240dxjokdxxww = appCompatImageView;
        this.f128238btonecajqb = materialTextView;
        this.f128242gtknphoqwx = materialTextView2;
        this.f128239draadjrbmk = materialTextView3;
        this.f128250wflxmlrfwp = productPriceView;
        this.f128237agtfadlqog = materialTextView4;
        this.f128247ojitshcjhn = materialTextView5;
        this.f128249rgvfuqvkyq = view;
    }

    public static lqeggnwhkg iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = vk0.wkgbmnqykc.btnOpenUserQrCode;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = vk0.wkgbmnqykc.cvDescription;
            MaterialCardView materialCardView = (MaterialCardView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialCardView != null) {
                i13 = vk0.wkgbmnqykc.glBottom;
                Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline != null) {
                    i13 = vk0.wkgbmnqykc.glEnd;
                    Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (guideline2 != null) {
                        i13 = vk0.wkgbmnqykc.glStart;
                        Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (guideline3 != null) {
                            i13 = vk0.wkgbmnqykc.glTop;
                            Guideline guideline4 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (guideline4 != null) {
                                i13 = vk0.wkgbmnqykc.ivProductPhoto;
                                ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (shapeableImageView != null) {
                                    i13 = vk0.wkgbmnqykc.ivQrCode;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (appCompatImageView != null) {
                                        i13 = vk0.wkgbmnqykc.tvCurrencyOldPrice;
                                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView != null) {
                                            i13 = vk0.wkgbmnqykc.tvDescription;
                                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView2 != null) {
                                                i13 = vk0.wkgbmnqykc.tvOldPrice;
                                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView3 != null) {
                                                    i13 = vk0.wkgbmnqykc.tvProductPrice;
                                                    ProductPriceView productPriceView = (ProductPriceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (productPriceView != null) {
                                                        i13 = vk0.wkgbmnqykc.tvProductTitle;
                                                        MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                        if (materialTextView4 != null) {
                                                            i13 = vk0.wkgbmnqykc.tvTitle;
                                                            MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                            if (materialTextView5 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = vk0.wkgbmnqykc.vCurtain))) != null) {
                                                                return new lqeggnwhkg((ConstraintLayout) view, materialButton, materialCardView, guideline, guideline2, guideline3, guideline4, shapeableImageView, appCompatImageView, materialTextView, materialTextView2, materialTextView3, productPriceView, materialTextView4, materialTextView5, viewIobyxmoadg);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128244iobyxmoadg;
    }
}
