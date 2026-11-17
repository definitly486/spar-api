package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class ribwqtqdhb implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialTextView f65927btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f65928draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f65929dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatImageView f65930eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f65931gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ShapeableImageView f65932gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65933iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f65934lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f65935nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Barrier f65936ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f65937wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageView f65938wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f65939zoijcleaow;

    private ribwqtqdhb(ConstraintLayout constraintLayout, Barrier barrier, Barrier barrier2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7) {
        this.f65933iobyxmoadg = constraintLayout;
        this.f65939zoijcleaow = barrier;
        this.f65936ppxfxbqfkf = barrier2;
        this.f65938wkgbmnqykc = appCompatImageView;
        this.f65930eablkybsjg = appCompatImageView2;
        this.f65932gxszxtbevo = shapeableImageView;
        this.f65934lqeggnwhkg = materialTextView;
        this.f65935nufgyqmvbu = materialTextView2;
        this.f65929dxjokdxxww = materialTextView3;
        this.f65927btonecajqb = materialTextView4;
        this.f65931gtknphoqwx = materialTextView5;
        this.f65928draadjrbmk = materialTextView6;
        this.f65937wflxmlrfwp = materialTextView7;
    }

    public static ribwqtqdhb iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.barrierControls;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = pm.eablkybsjg.barrierImage;
            Barrier barrier2 = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (barrier2 != null) {
                i13 = pm.eablkybsjg.ivAddToCart;
                AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatImageView != null) {
                    i13 = pm.eablkybsjg.ivFavorite;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatImageView2 != null) {
                        i13 = pm.eablkybsjg.ivPhoto;
                        ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (shapeableImageView != null) {
                            i13 = pm.eablkybsjg.tvDelimiter;
                            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView != null) {
                                i13 = pm.eablkybsjg.tvMeasure;
                                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView2 != null) {
                                    i13 = pm.eablkybsjg.tvName;
                                    MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView3 != null) {
                                        i13 = pm.eablkybsjg.tvPrice;
                                        MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView4 != null) {
                                            i13 = pm.eablkybsjg.tvSum;
                                            MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView5 != null) {
                                                i13 = pm.eablkybsjg.tvSumCurrency;
                                                MaterialTextView materialTextView6 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView6 != null) {
                                                    i13 = pm.eablkybsjg.tvSumDecimal;
                                                    MaterialTextView materialTextView7 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (materialTextView7 != null) {
                                                        return new ribwqtqdhb((ConstraintLayout) view, barrier, barrier2, appCompatImageView, appCompatImageView2, shapeableImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6, materialTextView7);
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

    public static ribwqtqdhb ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_future_product, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65933iobyxmoadg;
    }
}
