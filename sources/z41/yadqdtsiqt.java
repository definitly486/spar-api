package z41;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import ru.myspar.proloyalty.legacy.presentation.view.ScanWindowView;

/* JADX INFO: loaded from: classes5.dex */
public final class yadqdtsiqt implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final PreviewView f128485eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ScanWindowView f128486gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128487iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f128488lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f128489ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ComposeView f128490wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f128491zoijcleaow;

    private yadqdtsiqt(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ComposeView composeView, PreviewView previewView, ScanWindowView scanWindowView, MaterialTextView materialTextView) {
        this.f128487iobyxmoadg = constraintLayout;
        this.f128491zoijcleaow = appCompatImageView;
        this.f128489ppxfxbqfkf = appCompatImageView2;
        this.f128490wkgbmnqykc = composeView;
        this.f128485eablkybsjg = previewView;
        this.f128486gxszxtbevo = scanWindowView;
        this.f128488lqeggnwhkg = materialTextView;
    }

    public static yadqdtsiqt iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnBack;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = vk0.wkgbmnqykc.btnToggleFlash;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView2 != null) {
                i13 = vk0.wkgbmnqykc.cvActionBar;
                ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (composeView != null) {
                    i13 = vk0.wkgbmnqykc.previewView;
                    PreviewView previewView = (PreviewView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (previewView != null) {
                        i13 = vk0.wkgbmnqykc.scanWindowView;
                        ScanWindowView scanWindowView = (ScanWindowView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (scanWindowView != null) {
                            i13 = vk0.wkgbmnqykc.tvTitle;
                            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView != null) {
                                return new yadqdtsiqt((ConstraintLayout) view, appCompatImageView, appCompatImageView2, composeView, previewView, scanWindowView, materialTextView);
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
        return this.f128487iobyxmoadg;
    }
}
