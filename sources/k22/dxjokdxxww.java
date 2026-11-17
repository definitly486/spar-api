package k22;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.legacy.presentation.view.ScanWindowView;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final PreviewView f53546btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f53547draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final AppCompatImageView f53548dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final vdvldrhtss f53549eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final ScanWindowView f53550gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final AppCompatEditText f53551gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53552iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final FragmentContainerView f53553lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final AppCompatImageView f53554nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ojitshcjhn f53555ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f53556wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageButton f53557wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Barrier f53558zoijcleaow;

    private dxjokdxxww(ConstraintLayout constraintLayout, Barrier barrier, ojitshcjhn ojitshcjhnVar, AppCompatImageButton appCompatImageButton, vdvldrhtss vdvldrhtssVar, AppCompatEditText appCompatEditText, FragmentContainerView fragmentContainerView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, PreviewView previewView, ScanWindowView scanWindowView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f53552iobyxmoadg = constraintLayout;
        this.f53558zoijcleaow = barrier;
        this.f53555ppxfxbqfkf = ojitshcjhnVar;
        this.f53557wkgbmnqykc = appCompatImageButton;
        this.f53549eablkybsjg = vdvldrhtssVar;
        this.f53551gxszxtbevo = appCompatEditText;
        this.f53553lqeggnwhkg = fragmentContainerView;
        this.f53554nufgyqmvbu = appCompatImageView;
        this.f53548dxjokdxxww = appCompatImageView2;
        this.f53546btonecajqb = previewView;
        this.f53550gtknphoqwx = scanWindowView;
        this.f53547draadjrbmk = materialTextView;
        this.f53556wflxmlrfwp = materialTextView2;
    }

    public static dxjokdxxww iobyxmoadg(View view) {
        View viewIobyxmoadg;
        View viewIobyxmoadg2;
        int i13 = s12.zoijcleaow.barrierAppBar;
        Barrier barrier = (Barrier) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (barrier != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = s12.zoijcleaow.btnGoCart))) != null) {
            ojitshcjhn ojitshcjhnVarIobyxmoadg = ojitshcjhn.iobyxmoadg(viewIobyxmoadg);
            i13 = s12.zoijcleaow.btnToggleFlash;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageButton != null && (viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, (i13 = s12.zoijcleaow.emptyCart))) != null) {
                vdvldrhtss vdvldrhtssVarIobyxmoadg = vdvldrhtss.iobyxmoadg(viewIobyxmoadg2);
                i13 = s12.zoijcleaow.etProductBarcode;
                AppCompatEditText appCompatEditText = (AppCompatEditText) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (appCompatEditText != null) {
                    i13 = s12.zoijcleaow.flBottomFragmentContainer;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (fragmentContainerView != null) {
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
                                        i13 = s12.zoijcleaow.tvQrErrorMessage;
                                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (materialTextView != null) {
                                            i13 = s12.zoijcleaow.tvScanDescriptionTitle;
                                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialTextView2 != null) {
                                                return new dxjokdxxww((ConstraintLayout) view, barrier, ojitshcjhnVarIobyxmoadg, appCompatImageButton, vdvldrhtssVarIobyxmoadg, appCompatEditText, fragmentContainerView, appCompatImageView, appCompatImageView2, previewView, scanWindowView, materialTextView, materialTextView2);
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
        return this.f53552iobyxmoadg;
    }
}
