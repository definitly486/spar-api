package m60;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.ProductPriceView;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final MaterialTextView f65373agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f65374btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f65375draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final AppCompatImageView f65376dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Guideline f65377eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f65378gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Guideline f65379gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65380iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Guideline f65381lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final ShapeableImageView f65382nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final MaterialTextView f65383ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialCardView f65384ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final View f65385rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final ProductPriceView f65386wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Guideline f65387wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f65388zoijcleaow;

    private btonecajqb(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialCardView materialCardView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ShapeableImageView shapeableImageView, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, ProductPriceView productPriceView, MaterialTextView materialTextView4, MaterialTextView materialTextView5, View view) {
        this.f65380iobyxmoadg = constraintLayout;
        this.f65388zoijcleaow = materialButton;
        this.f65384ppxfxbqfkf = materialCardView;
        this.f65387wkgbmnqykc = guideline;
        this.f65377eablkybsjg = guideline2;
        this.f65379gxszxtbevo = guideline3;
        this.f65381lqeggnwhkg = guideline4;
        this.f65382nufgyqmvbu = shapeableImageView;
        this.f65376dxjokdxxww = appCompatImageView;
        this.f65374btonecajqb = materialTextView;
        this.f65378gtknphoqwx = materialTextView2;
        this.f65375draadjrbmk = materialTextView3;
        this.f65386wflxmlrfwp = productPriceView;
        this.f65373agtfadlqog = materialTextView4;
        this.f65383ojitshcjhn = materialTextView5;
        this.f65385rgvfuqvkyq = view;
    }

    public static btonecajqb iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = pm.eablkybsjg.btnOpenUserQrCode;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.cvDescription;
            MaterialCardView materialCardView = (MaterialCardView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialCardView != null) {
                i13 = pm.eablkybsjg.glBottom;
                Guideline guideline = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (guideline != null) {
                    i13 = pm.eablkybsjg.glEnd;
                    Guideline guideline2 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (guideline2 != null) {
                        i13 = pm.eablkybsjg.glStart;
                        Guideline guideline3 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (guideline3 != null) {
                            i13 = pm.eablkybsjg.glTop;
                            Guideline guideline4 = (Guideline) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (guideline4 != null) {
                                i13 = pm.eablkybsjg.ivProductPhoto;
                                ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (shapeableImageView != null) {
                                    i13 = pm.eablkybsjg.ivQrCode;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (appCompatImageView != null) {
                                        i13 = pm.eablkybsjg.tvCurrencyOldPrice;
                                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView != null) {
                                            i13 = pm.eablkybsjg.tvDescription;
                                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView2 != null) {
                                                i13 = pm.eablkybsjg.tvOldPrice;
                                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView3 != null) {
                                                    i13 = pm.eablkybsjg.tvProductPrice;
                                                    ProductPriceView productPriceView = (ProductPriceView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (productPriceView != null) {
                                                        i13 = pm.eablkybsjg.tvProductTitle;
                                                        MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                        if (materialTextView4 != null) {
                                                            i13 = pm.eablkybsjg.tvTitle;
                                                            MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                            if (materialTextView5 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.vCurtain))) != null) {
                                                                return new btonecajqb((ConstraintLayout) view, materialButton, materialCardView, guideline, guideline2, guideline3, guideline4, shapeableImageView, appCompatImageView, materialTextView, materialTextView2, materialTextView3, productPriceView, materialTextView4, materialTextView5, viewIobyxmoadg);
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
        return this.f65380iobyxmoadg;
    }
}
