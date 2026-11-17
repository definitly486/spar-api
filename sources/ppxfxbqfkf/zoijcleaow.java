package ppxfxbqfkf;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.nufgyqmvbu;
import androidx.compose.runtime.cqumvgiudr;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.jhduphickx;
import androidx.lifecycle.vipkmwdibw;
import q5.wflxmlrfwp;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f77135iobyxmoadg = new ViewGroup.LayoutParams(-2, -2);

    public static final void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, cqumvgiudr cqumvgiudrVar, rgvfuqvkyq rgvfuqvkyqVar) {
        View childAt = ((ViewGroup) nufgyqmvbuVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(cqumvgiudrVar);
            composeView.setContent(rgvfuqvkyqVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(nufgyqmvbuVar, null, 0, 6, null);
        composeView2.setParentCompositionContext(cqumvgiudrVar);
        composeView2.setContent(rgvfuqvkyqVar);
        ppxfxbqfkf(nufgyqmvbuVar);
        nufgyqmvbuVar.setContentView(composeView2, f77135iobyxmoadg);
    }

    private static final void ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar) {
        View decorView = nufgyqmvbuVar.getWindow().getDecorView();
        if (vipkmwdibw.iobyxmoadg(decorView) == null) {
            vipkmwdibw.zoijcleaow(decorView, nufgyqmvbuVar);
        }
        if (jhduphickx.iobyxmoadg(decorView) == null) {
            jhduphickx.zoijcleaow(decorView, nufgyqmvbuVar);
        }
        if (wflxmlrfwp.iobyxmoadg(decorView) == null) {
            wflxmlrfwp.zoijcleaow(decorView, nufgyqmvbuVar);
        }
    }

    public static /* synthetic */ void zoijcleaow(nufgyqmvbu nufgyqmvbuVar, cqumvgiudr cqumvgiudrVar, rgvfuqvkyq rgvfuqvkyqVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            cqumvgiudrVar = null;
        }
        iobyxmoadg(nufgyqmvbuVar, cqumvgiudrVar, rgvfuqvkyqVar);
    }
}
