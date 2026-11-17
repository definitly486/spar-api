package k22;

import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final iwizpuwonk f53559eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f53560iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final PreviewView f53561ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final jyumaefscl f53562wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f53563zoijcleaow;

    private eablkybsjg(ConstraintLayout constraintLayout, ComposeView composeView, PreviewView previewView, jyumaefscl jyumaefsclVar, iwizpuwonk iwizpuwonkVar) {
        this.f53560iobyxmoadg = constraintLayout;
        this.f53563zoijcleaow = composeView;
        this.f53561ppxfxbqfkf = previewView;
        this.f53562wkgbmnqykc = jyumaefsclVar;
        this.f53559eablkybsjg = iwizpuwonkVar;
    }

    public static eablkybsjg iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = s12.zoijcleaow.cvActionBar;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = s12.zoijcleaow.previewView;
            PreviewView previewView = (PreviewView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (previewView != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = s12.zoijcleaow.scanButtons))) != null) {
                jyumaefscl jyumaefsclVarIobyxmoadg = jyumaefscl.iobyxmoadg(viewIobyxmoadg);
                i13 = s12.zoijcleaow.scanWindow;
                View viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, i13);
                if (viewIobyxmoadg2 != null) {
                    return new eablkybsjg((ConstraintLayout) view, composeView, previewView, jyumaefsclVarIobyxmoadg, iwizpuwonk.iobyxmoadg(viewIobyxmoadg2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f53560iobyxmoadg;
    }
}
