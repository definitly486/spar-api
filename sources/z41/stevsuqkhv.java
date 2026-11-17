package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class stevsuqkhv implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f128388btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f128389draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f128390dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatImageView f128391eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f128392gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ShapeableImageView f128393gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128394iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f128395lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f128396nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Barrier f128397ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f128398wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageView f128399wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f128400zoijcleaow;

    private stevsuqkhv(ConstraintLayout constraintLayout, Barrier barrier, Barrier barrier2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7) {
        this.f128394iobyxmoadg = constraintLayout;
        this.f128400zoijcleaow = barrier;
        this.f128397ppxfxbqfkf = barrier2;
        this.f128399wkgbmnqykc = appCompatImageView;
        this.f128391eablkybsjg = appCompatImageView2;
        this.f128393gxszxtbevo = shapeableImageView;
        this.f128395lqeggnwhkg = materialTextView;
        this.f128396nufgyqmvbu = materialTextView2;
        this.f128390dxjokdxxww = materialTextView3;
        this.f128388btonecajqb = materialTextView4;
        this.f128392gtknphoqwx = materialTextView5;
        this.f128389draadjrbmk = materialTextView6;
        this.f128398wflxmlrfwp = materialTextView7;
    }

    public static stevsuqkhv iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.barrierControls;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = vk0.wkgbmnqykc.barrierImage;
            Barrier barrier2 = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (barrier2 != null) {
                i13 = vk0.wkgbmnqykc.ivAddToCart;
                AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatImageView != null) {
                    i13 = vk0.wkgbmnqykc.ivFavorite;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatImageView2 != null) {
                        i13 = vk0.wkgbmnqykc.ivPhoto;
                        ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (shapeableImageView != null) {
                            i13 = vk0.wkgbmnqykc.tvDelimiter;
                            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView != null) {
                                i13 = vk0.wkgbmnqykc.tvMeasure;
                                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView2 != null) {
                                    i13 = vk0.wkgbmnqykc.tvName;
                                    MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView3 != null) {
                                        i13 = vk0.wkgbmnqykc.tvPrice;
                                        MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView4 != null) {
                                            i13 = vk0.wkgbmnqykc.tvSum;
                                            MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView5 != null) {
                                                i13 = vk0.wkgbmnqykc.tvSumCurrency;
                                                MaterialTextView materialTextView6 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView6 != null) {
                                                    i13 = vk0.wkgbmnqykc.tvSumDecimal;
                                                    MaterialTextView materialTextView7 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (materialTextView7 != null) {
                                                        return new stevsuqkhv((ConstraintLayout) view, barrier, barrier2, appCompatImageView, appCompatImageView2, shapeableImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6, materialTextView7);
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

    public static stevsuqkhv ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_future_product_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f128394iobyxmoadg;
    }
}
