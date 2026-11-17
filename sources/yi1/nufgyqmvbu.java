package yi1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f125436btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f125437draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f125438dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ImageView f125439eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f125440gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final AppCompatImageView f125441gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f125442iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final ShapeableImageView f125443lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f125444nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Barrier f125445ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ComposeView f125446wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f125447zoijcleaow;

    private nufgyqmvbu(ConstraintLayout constraintLayout, Barrier barrier, Barrier barrier2, ComposeView composeView, ImageView imageView, AppCompatImageView appCompatImageView, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        this.f125442iobyxmoadg = constraintLayout;
        this.f125447zoijcleaow = barrier;
        this.f125445ppxfxbqfkf = barrier2;
        this.f125446wkgbmnqykc = composeView;
        this.f125439eablkybsjg = imageView;
        this.f125441gxszxtbevo = appCompatImageView;
        this.f125443lqeggnwhkg = shapeableImageView;
        this.f125444nufgyqmvbu = materialTextView;
        this.f125438dxjokdxxww = materialTextView2;
        this.f125436btonecajqb = materialTextView3;
        this.f125440gtknphoqwx = materialTextView4;
        this.f125437draadjrbmk = materialTextView5;
    }

    public static nufgyqmvbu iobyxmoadg(View view) {
        int i13 = ti1.eablkybsjg.barrierControls;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = ti1.eablkybsjg.barrierImage;
            Barrier barrier2 = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (barrier2 != null) {
                i13 = ti1.eablkybsjg.cvRatingBar;
                ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView != null) {
                    i13 = ti1.eablkybsjg.ivAddToCart;
                    ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (imageView != null) {
                        i13 = ti1.eablkybsjg.ivFavorite;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (appCompatImageView != null) {
                            i13 = ti1.eablkybsjg.ivPhoto;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (shapeableImageView != null) {
                                i13 = ti1.eablkybsjg.tvName;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = ti1.eablkybsjg.tvPricePerUnit;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        i13 = ti1.eablkybsjg.tvSum;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView3 != null) {
                                            i13 = ti1.eablkybsjg.tvSumCurrency;
                                            MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView4 != null) {
                                                i13 = ti1.eablkybsjg.tvSumDecimal;
                                                MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView5 != null) {
                                                    return new nufgyqmvbu((ConstraintLayout) view, barrier, barrier2, composeView, imageView, appCompatImageView, shapeableImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5);
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

    public static nufgyqmvbu ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(ti1.gxszxtbevo.item_purchase_product_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f125442iobyxmoadg;
    }
}
