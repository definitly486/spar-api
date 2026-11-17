package go1;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.scango.impl.screens.cart.presentation.view.ScanGoReturnDeletedProductView;
import ru.myspar.proloyalty.scango.impl.screens.cart.presentation.view.ScanGoTutorialOverlayView;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final ScanGoReturnDeletedProductView f38059agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final MaterialDivider f38060btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f38061draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f38062dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatImageButton f38063eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f38064gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final rgvfuqvkyq f38065gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f38066iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final RecyclerView f38067lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final ScanGoTutorialOverlayView f38068nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageButton f38069ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f38070wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f38071wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f38072zoijcleaow;

    private lqeggnwhkg(ConstraintLayout constraintLayout, MaterialButton materialButton, AppCompatImageButton appCompatImageButton, MaterialButton materialButton2, AppCompatImageButton appCompatImageButton2, rgvfuqvkyq rgvfuqvkyqVar, RecyclerView recyclerView, ScanGoTutorialOverlayView scanGoTutorialOverlayView, MaterialTextView materialTextView, MaterialDivider materialDivider, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, ScanGoReturnDeletedProductView scanGoReturnDeletedProductView) {
        this.f38066iobyxmoadg = constraintLayout;
        this.f38072zoijcleaow = materialButton;
        this.f38069ppxfxbqfkf = appCompatImageButton;
        this.f38071wkgbmnqykc = materialButton2;
        this.f38063eablkybsjg = appCompatImageButton2;
        this.f38065gxszxtbevo = rgvfuqvkyqVar;
        this.f38067lqeggnwhkg = recyclerView;
        this.f38068nufgyqmvbu = scanGoTutorialOverlayView;
        this.f38062dxjokdxxww = materialTextView;
        this.f38060btonecajqb = materialDivider;
        this.f38064gtknphoqwx = materialTextView2;
        this.f38061draadjrbmk = materialTextView3;
        this.f38070wflxmlrfwp = materialTextView4;
        this.f38059agtfadlqog = scanGoReturnDeletedProductView;
    }

    public static lqeggnwhkg iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = on1.zoijcleaow.btnCheckout;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = on1.zoijcleaow.btnHome;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageButton != null) {
                i13 = on1.zoijcleaow.btnScan;
                MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton2 != null) {
                    i13 = on1.zoijcleaow.btnTutorial;
                    AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatImageButton2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = on1.zoijcleaow.includeEmptyMessage))) != null) {
                        rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg = rgvfuqvkyq.iobyxmoadg(viewIobyxmoadg);
                        i13 = on1.zoijcleaow.rvCartContent;
                        RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (recyclerView != null) {
                            i13 = on1.zoijcleaow.tutorialOverlay;
                            ScanGoTutorialOverlayView scanGoTutorialOverlayView = (ScanGoTutorialOverlayView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (scanGoTutorialOverlayView != null) {
                                i13 = on1.zoijcleaow.tvCurrency;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null) {
                                    i13 = on1.zoijcleaow.tvFirstDivider;
                                    MaterialDivider materialDivider = (MaterialDivider) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialDivider != null) {
                                        i13 = on1.zoijcleaow.tvPriceFract;
                                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView2 != null) {
                                            i13 = on1.zoijcleaow.tvPriceInt;
                                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView3 != null) {
                                                i13 = on1.zoijcleaow.tvTotalPayment;
                                                MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView4 != null) {
                                                    i13 = on1.zoijcleaow.viewReturnDeletedProduct;
                                                    ScanGoReturnDeletedProductView scanGoReturnDeletedProductView = (ScanGoReturnDeletedProductView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (scanGoReturnDeletedProductView != null) {
                                                        return new lqeggnwhkg((ConstraintLayout) view, materialButton, appCompatImageButton, materialButton2, appCompatImageButton2, rgvfuqvkyqVarIobyxmoadg, recyclerView, scanGoTutorialOverlayView, materialTextView, materialDivider, materialTextView2, materialTextView3, materialTextView4, scanGoReturnDeletedProductView);
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
        return this.f38066iobyxmoadg;
    }
}
