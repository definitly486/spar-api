package go1;

import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final iwizpuwonk f38026eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f38027iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final PreviewView f38028ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final jyumaefscl f38029wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f38030zoijcleaow;

    private eablkybsjg(ConstraintLayout constraintLayout, ComposeView composeView, PreviewView previewView, jyumaefscl jyumaefsclVar, iwizpuwonk iwizpuwonkVar) {
        this.f38027iobyxmoadg = constraintLayout;
        this.f38030zoijcleaow = composeView;
        this.f38028ppxfxbqfkf = previewView;
        this.f38029wkgbmnqykc = jyumaefsclVar;
        this.f38026eablkybsjg = iwizpuwonkVar;
    }

    public static eablkybsjg iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = on1.zoijcleaow.cvActionBar;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = on1.zoijcleaow.previewView;
            PreviewView previewView = (PreviewView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (previewView != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = on1.zoijcleaow.scanButtons))) != null) {
                jyumaefscl jyumaefsclVarIobyxmoadg = jyumaefscl.iobyxmoadg(viewIobyxmoadg);
                i13 = on1.zoijcleaow.scanWindow;
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
        return this.f38027iobyxmoadg;
    }
}
