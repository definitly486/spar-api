package go1;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.legacy.presentation.view.ScanWindowView;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final ScanWindowView f38073btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f38074draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final PreviewView f38075dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatEditText f38076eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f38077gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final LinearLayout f38078gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f38079iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final AppCompatImageView f38080lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final AppCompatImageView f38081nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f38082ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageButton f38083wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f38084zoijcleaow;

    private nufgyqmvbu(ConstraintLayout constraintLayout, Barrier barrier, MaterialButton materialButton, AppCompatImageButton appCompatImageButton, AppCompatEditText appCompatEditText, LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, PreviewView previewView, ScanWindowView scanWindowView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f38079iobyxmoadg = constraintLayout;
        this.f38084zoijcleaow = barrier;
        this.f38082ppxfxbqfkf = materialButton;
        this.f38083wkgbmnqykc = appCompatImageButton;
        this.f38076eablkybsjg = appCompatEditText;
        this.f38078gxszxtbevo = linearLayout;
        this.f38080lqeggnwhkg = appCompatImageView;
        this.f38081nufgyqmvbu = appCompatImageView2;
        this.f38075dxjokdxxww = previewView;
        this.f38073btonecajqb = scanWindowView;
        this.f38077gtknphoqwx = materialTextView;
        this.f38074draadjrbmk = materialTextView2;
    }

    public static nufgyqmvbu iobyxmoadg(View view) {
        int i13 = on1.zoijcleaow.barrierAppBar;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = on1.zoijcleaow.btnCancel;
            MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton != null) {
                i13 = on1.zoijcleaow.btnToggleFlash;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatImageButton != null) {
                    i13 = on1.zoijcleaow.etProductBarcode;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatEditText != null) {
                        i13 = on1.zoijcleaow.flBottomContainer;
                        LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (linearLayout != null) {
                            i13 = on1.zoijcleaow.ivClearField;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (appCompatImageView != null) {
                                i13 = on1.zoijcleaow.ivSearchIcon;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (appCompatImageView2 != null) {
                                    i13 = on1.zoijcleaow.previewView;
                                    PreviewView previewView = (PreviewView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (previewView != null) {
                                        i13 = on1.zoijcleaow.scanWindowView;
                                        ScanWindowView scanWindowView = (ScanWindowView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (scanWindowView != null) {
                                            i13 = on1.zoijcleaow.tvScanDescriptionTitle;
                                            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView != null) {
                                                i13 = on1.zoijcleaow.tvScanMatrixError;
                                                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView2 != null) {
                                                    return new nufgyqmvbu((ConstraintLayout) view, barrier, materialButton, appCompatImageButton, appCompatEditText, linearLayout, appCompatImageView, appCompatImageView2, previewView, scanWindowView, materialTextView, materialTextView2);
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
        return this.f38079iobyxmoadg;
    }
}
