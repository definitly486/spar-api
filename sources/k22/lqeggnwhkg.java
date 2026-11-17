package k22;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.scango.impl.screens.cart.presentation.view.ScanGoReturnDeletedProductView;
import ru.myspar.scango.impl.screens.cart.presentation.view.ScanGoTutorialOverlayView;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final ScanGoReturnDeletedProductView f53592agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final View f53593btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f53594draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f53595dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatImageButton f53596eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f53597gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final rgvfuqvkyq f53598gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53599iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final RecyclerView f53600lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final ScanGoTutorialOverlayView f53601nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageButton f53602ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f53603wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f53604wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f53605zoijcleaow;

    private lqeggnwhkg(ConstraintLayout constraintLayout, MaterialButton materialButton, AppCompatImageButton appCompatImageButton, MaterialButton materialButton2, AppCompatImageButton appCompatImageButton2, rgvfuqvkyq rgvfuqvkyqVar, RecyclerView recyclerView, ScanGoTutorialOverlayView scanGoTutorialOverlayView, MaterialTextView materialTextView, View view, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, ScanGoReturnDeletedProductView scanGoReturnDeletedProductView) {
        this.f53599iobyxmoadg = constraintLayout;
        this.f53605zoijcleaow = materialButton;
        this.f53602ppxfxbqfkf = appCompatImageButton;
        this.f53604wkgbmnqykc = materialButton2;
        this.f53596eablkybsjg = appCompatImageButton2;
        this.f53598gxszxtbevo = rgvfuqvkyqVar;
        this.f53600lqeggnwhkg = recyclerView;
        this.f53601nufgyqmvbu = scanGoTutorialOverlayView;
        this.f53595dxjokdxxww = materialTextView;
        this.f53593btonecajqb = view;
        this.f53597gtknphoqwx = materialTextView2;
        this.f53594draadjrbmk = materialTextView3;
        this.f53603wflxmlrfwp = materialTextView4;
        this.f53592agtfadlqog = scanGoReturnDeletedProductView;
    }

    public static lqeggnwhkg iobyxmoadg(View view) {
        View viewIobyxmoadg;
        View viewIobyxmoadg2;
        int i13 = s12.zoijcleaow.btnCheckout;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = s12.zoijcleaow.btnHome;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageButton != null) {
                i13 = s12.zoijcleaow.btnScan;
                MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton2 != null) {
                    i13 = s12.zoijcleaow.btnTutorial;
                    AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatImageButton2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = s12.zoijcleaow.includeEmptyMessage))) != null) {
                        rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg = rgvfuqvkyq.iobyxmoadg(viewIobyxmoadg);
                        i13 = s12.zoijcleaow.rvCartContent;
                        RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (recyclerView != null) {
                            i13 = s12.zoijcleaow.tutorialOverlay;
                            ScanGoTutorialOverlayView scanGoTutorialOverlayView = (ScanGoTutorialOverlayView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (scanGoTutorialOverlayView != null) {
                                i13 = s12.zoijcleaow.tvCurrency;
                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView != null && (viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, (i13 = s12.zoijcleaow.tvFirstDivider))) != null) {
                                    i13 = s12.zoijcleaow.tvPriceFract;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView2 != null) {
                                        i13 = s12.zoijcleaow.tvPriceInt;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView3 != null) {
                                            i13 = s12.zoijcleaow.tvTotalPayment;
                                            MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView4 != null) {
                                                i13 = s12.zoijcleaow.viewReturnDeletedProduct;
                                                ScanGoReturnDeletedProductView scanGoReturnDeletedProductView = (ScanGoReturnDeletedProductView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (scanGoReturnDeletedProductView != null) {
                                                    return new lqeggnwhkg((ConstraintLayout) view, materialButton, appCompatImageButton, materialButton2, appCompatImageButton2, rgvfuqvkyqVarIobyxmoadg, recyclerView, scanGoTutorialOverlayView, materialTextView, viewIobyxmoadg2, materialTextView2, materialTextView3, materialTextView4, scanGoReturnDeletedProductView);
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
        return this.f53599iobyxmoadg;
    }
}
