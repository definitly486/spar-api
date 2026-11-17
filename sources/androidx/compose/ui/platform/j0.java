package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f6993iobyxmoadg = new ViewGroup.LayoutParams(-2, -2);

    public static final androidx.compose.runtime.iobyxmoadg iobyxmoadg(z.pkzmftpjix pkzmftpjixVar) {
        return new z.ipoelvxyzq(pkzmftpjixVar);
    }

    public static final androidx.compose.runtime.iwizpuwonk ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.cqumvgiudr cqumvgiudrVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        lxfrhoxuzk.f7005iobyxmoadg.zoijcleaow();
        AndroidComposeView androidComposeView = null;
        if (iobyxmoadgVar.getChildCount() > 0) {
            View childAt = iobyxmoadgVar.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            iobyxmoadgVar.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(iobyxmoadgVar.getContext(), cqumvgiudrVar.btonecajqb());
            iobyxmoadgVar.addView(androidComposeView.getView(), f6993iobyxmoadg);
        }
        return zoijcleaow(androidComposeView, cqumvgiudrVar, rgvfuqvkyqVar);
    }

    private static final androidx.compose.runtime.iwizpuwonk zoijcleaow(AndroidComposeView androidComposeView, androidx.compose.runtime.cqumvgiudr cqumvgiudrVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() && androidComposeView.getTag(a.gtknphoqwx.inspection_slot_table_set) == null) {
            androidComposeView.setTag(a.gtknphoqwx.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag = androidComposeView.getView().getTag(a.gtknphoqwx.wrapped_composition_tag);
        h0 h0Var = tag instanceof h0 ? (h0) tag : null;
        if (h0Var == null) {
            h0Var = new h0(androidComposeView, androidx.compose.runtime.zynmafqrjb.iobyxmoadg(new z.ipoelvxyzq(androidComposeView.getRoot()), cqumvgiudrVar));
            androidComposeView.getView().setTag(a.gtknphoqwx.wrapped_composition_tag, h0Var);
        }
        h0Var.vdvldrhtss(rgvfuqvkyqVar);
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(androidComposeView.getCoroutineContext(), cqumvgiudrVar.btonecajqb())) {
            androidComposeView.setCoroutineContext(cqumvgiudrVar.btonecajqb());
        }
        return h0Var;
    }
}
