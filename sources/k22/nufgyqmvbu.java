package k22;

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
import ru.myspar.legacy.presentation.view.ScanWindowView;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final ScanWindowView f53606btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f53607draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final PreviewView f53608dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatEditText f53609eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialTextView f53610gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final LinearLayout f53611gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53612iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final AppCompatImageView f53613lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final AppCompatImageView f53614nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f53615ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageButton f53616wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f53617zoijcleaow;

    private nufgyqmvbu(ConstraintLayout constraintLayout, Barrier barrier, MaterialButton materialButton, AppCompatImageButton appCompatImageButton, AppCompatEditText appCompatEditText, LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, PreviewView previewView, ScanWindowView scanWindowView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f53612iobyxmoadg = constraintLayout;
        this.f53617zoijcleaow = barrier;
        this.f53615ppxfxbqfkf = materialButton;
        this.f53616wkgbmnqykc = appCompatImageButton;
        this.f53609eablkybsjg = appCompatEditText;
        this.f53611gxszxtbevo = linearLayout;
        this.f53613lqeggnwhkg = appCompatImageView;
        this.f53614nufgyqmvbu = appCompatImageView2;
        this.f53608dxjokdxxww = previewView;
        this.f53606btonecajqb = scanWindowView;
        this.f53610gtknphoqwx = materialTextView;
        this.f53607draadjrbmk = materialTextView2;
    }

    public static nufgyqmvbu iobyxmoadg(View view) {
        int i13 = s12.zoijcleaow.barrierAppBar;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null) {
            i13 = s12.zoijcleaow.btnCancel;
            MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton != null) {
                i13 = s12.zoijcleaow.btnToggleFlash;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatImageButton != null) {
                    i13 = s12.zoijcleaow.etProductBarcode;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatEditText != null) {
                        i13 = s12.zoijcleaow.flBottomContainer;
                        LinearLayout linearLayout = (LinearLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (linearLayout != null) {
                            i13 = s12.zoijcleaow.ivClearField;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (appCompatImageView != null) {
                                i13 = s12.zoijcleaow.ivSearchIcon;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (appCompatImageView2 != null) {
                                    i13 = s12.zoijcleaow.previewView;
                                    PreviewView previewView = (PreviewView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (previewView != null) {
                                        i13 = s12.zoijcleaow.scanWindowView;
                                        ScanWindowView scanWindowView = (ScanWindowView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (scanWindowView != null) {
                                            i13 = s12.zoijcleaow.tvScanDescriptionTitle;
                                            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView != null) {
                                                i13 = s12.zoijcleaow.tvScanMatrixError;
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
        return this.f53612iobyxmoadg;
    }
}
