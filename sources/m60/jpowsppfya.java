package m60;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.myspar.legacy.presentation.view.ScanWindowView;

/* JADX INFO: loaded from: classes4.dex */
public final class jpowsppfya implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final PreviewView f65655eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ScanWindowView f65656gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65657iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f65658ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ComposeView f65659wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f65660zoijcleaow;

    private jpowsppfya(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ComposeView composeView, PreviewView previewView, ScanWindowView scanWindowView) {
        this.f65657iobyxmoadg = constraintLayout;
        this.f65660zoijcleaow = appCompatImageView;
        this.f65658ppxfxbqfkf = appCompatImageView2;
        this.f65659wkgbmnqykc = composeView;
        this.f65655eablkybsjg = previewView;
        this.f65656gxszxtbevo = scanWindowView;
    }

    public static jpowsppfya iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnBack;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = pm.eablkybsjg.btnToggleFlash;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView2 != null) {
                i13 = pm.eablkybsjg.cvActionBar;
                ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView != null) {
                    i13 = pm.eablkybsjg.previewView;
                    PreviewView previewView = (PreviewView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (previewView != null) {
                        i13 = pm.eablkybsjg.scanWindowView;
                        ScanWindowView scanWindowView = (ScanWindowView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (scanWindowView != null) {
                            return new jpowsppfya((ConstraintLayout) view, appCompatImageView, appCompatImageView2, composeView, previewView, scanWindowView);
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
        return this.f65657iobyxmoadg;
    }
}
