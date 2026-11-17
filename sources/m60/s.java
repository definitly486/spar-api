package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.BuyButtonNew;
import ru.myspar.legacy.presentation.view.MeasureTypeToggle;
import ru.myspar.legacy.presentation.view.PricePerUnitView;
import ru.myspar.legacy.presentation.view.ProductCounterNew;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final Group f65946agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final AppCompatImageView f65947btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final MaterialTextView f65948cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final PricePerUnitView f65949draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final ShapeableImageView f65950dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ComposeView f65951eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MeasureTypeToggle f65952gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialDivider f65953gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f65954iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final MaterialTextView f65955iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final MaterialTextView f65956jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public final MaterialTextView f65957kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Group f65958lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final AppCompatImageView f65959nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final TextView f65960ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public final MaterialButton f65961oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final BuyButtonNew f65962ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final MaterialTextView f65963rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public final MaterialTextView f65964vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final Group f65965wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ProductCounterNew f65966wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final MaterialTextView f65967yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final MaterialTextView f65968zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f65969zoijcleaow;

    private s(View view, AppCompatImageView appCompatImageView, BuyButtonNew buyButtonNew, ProductCounterNew productCounterNew, ComposeView composeView, MaterialDivider materialDivider, Group group, AppCompatImageView appCompatImageView2, ShapeableImageView shapeableImageView, AppCompatImageView appCompatImageView3, MeasureTypeToggle measureTypeToggle, PricePerUnitView pricePerUnitView, Group group2, Group group3, TextView textView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialButton materialButton, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8) {
        this.f65954iobyxmoadg = view;
        this.f65969zoijcleaow = appCompatImageView;
        this.f65962ppxfxbqfkf = buyButtonNew;
        this.f65966wkgbmnqykc = productCounterNew;
        this.f65951eablkybsjg = composeView;
        this.f65953gxszxtbevo = materialDivider;
        this.f65958lqeggnwhkg = group;
        this.f65959nufgyqmvbu = appCompatImageView2;
        this.f65950dxjokdxxww = shapeableImageView;
        this.f65947btonecajqb = appCompatImageView3;
        this.f65952gtknphoqwx = measureTypeToggle;
        this.f65949draadjrbmk = pricePerUnitView;
        this.f65965wflxmlrfwp = group2;
        this.f65946agtfadlqog = group3;
        this.f65960ojitshcjhn = textView;
        this.f65963rgvfuqvkyq = materialTextView;
        this.f65964vdvldrhtss = materialTextView2;
        this.f65961oxmwwwfdhm = materialButton;
        this.f65957kcexrzcfyt = materialTextView3;
        this.f65968zdlpuopuiu = materialTextView4;
        this.f65967yggfygwlhe = materialTextView5;
        this.f65956jyumaefscl = materialTextView6;
        this.f65955iwizpuwonk = materialTextView7;
        this.f65948cqumvgiudr = materialTextView8;
    }

    public static s iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnAddToPurchaseLists;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = pm.eablkybsjg.btnBuy;
            BuyButtonNew buyButtonNew = (BuyButtonNew) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (buyButtonNew != null) {
                i13 = pm.eablkybsjg.counter;
                ProductCounterNew productCounterNew = (ProductCounterNew) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (productCounterNew != null) {
                    i13 = pm.eablkybsjg.cvHint;
                    ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (composeView != null) {
                        i13 = pm.eablkybsjg.delimiter;
                        MaterialDivider materialDivider = (MaterialDivider) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialDivider != null) {
                            i13 = pm.eablkybsjg.groupPrice;
                            Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (group != null) {
                                i13 = pm.eablkybsjg.ivFavorite;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (appCompatImageView2 != null) {
                                    i13 = pm.eablkybsjg.ivPhoto;
                                    ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (shapeableImageView != null) {
                                        i13 = pm.eablkybsjg.ivRatingIcon;
                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (appCompatImageView3 != null) {
                                            i13 = pm.eablkybsjg.mttMeasure;
                                            MeasureTypeToggle measureTypeToggle = (MeasureTypeToggle) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (measureTypeToggle != null) {
                                                i13 = pm.eablkybsjg.pricePerUnit;
                                                PricePerUnitView pricePerUnitView = (PricePerUnitView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (pricePerUnitView != null) {
                                                    i13 = pm.eablkybsjg.ratingGroup;
                                                    Group group2 = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (group2 != null) {
                                                        i13 = pm.eablkybsjg.reviewsGroup;
                                                        Group group3 = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                        if (group3 != null) {
                                                            i13 = pm.eablkybsjg.tvDiscountAmount;
                                                            TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                            if (textView != null) {
                                                                i13 = pm.eablkybsjg.tvName;
                                                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                if (materialTextView != null) {
                                                                    i13 = pm.eablkybsjg.tvOldPrice;
                                                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                    if (materialTextView2 != null) {
                                                                        i13 = pm.eablkybsjg.tvProductNotAvailable;
                                                                        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                        if (materialButton != null) {
                                                                            i13 = pm.eablkybsjg.tvRating;
                                                                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                            if (materialTextView3 != null) {
                                                                                i13 = pm.eablkybsjg.tvReviewsCount;
                                                                                MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                if (materialTextView4 != null) {
                                                                                    i13 = pm.eablkybsjg.tvTotalPrice;
                                                                                    MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                    if (materialTextView5 != null) {
                                                                                        i13 = pm.eablkybsjg.tvTotalPriceCurrency;
                                                                                        MaterialTextView materialTextView6 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                        if (materialTextView6 != null) {
                                                                                            i13 = pm.eablkybsjg.tvTotalPriceDecimal;
                                                                                            MaterialTextView materialTextView7 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                            if (materialTextView7 != null) {
                                                                                                i13 = pm.eablkybsjg.tvWineCountryAndRegion;
                                                                                                MaterialTextView materialTextView8 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                                                                if (materialTextView8 != null) {
                                                                                                    return new s(view, appCompatImageView, buyButtonNew, productCounterNew, composeView, materialDivider, group, appCompatImageView2, shapeableImageView, appCompatImageView3, measureTypeToggle, pricePerUnitView, group2, group3, textView, materialTextView, materialTextView2, materialButton, materialTextView3, materialTextView4, materialTextView5, materialTextView6, materialTextView7, materialTextView8);
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

    public static s zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(pm.gxszxtbevo.view_product_new, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f65954iobyxmoadg;
    }
}
