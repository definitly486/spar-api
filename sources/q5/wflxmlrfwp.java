package q5;

import android.view.View;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wflxmlrfwp {
    public static final dxjokdxxww iobyxmoadg(View view) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(iobyxmoadg.view_tree_saved_state_registry_owner);
            dxjokdxxww dxjokdxxwwVar = tag instanceof dxjokdxxww ? (dxjokdxxww) tag : null;
            if (dxjokdxxwwVar != null) {
                return dxjokdxxwwVar;
            }
            Object objIobyxmoadg = z1.zoijcleaow.iobyxmoadg(view);
            view = objIobyxmoadg instanceof View ? (View) objIobyxmoadg : null;
        }
        return null;
    }

    public static final void zoijcleaow(View view, dxjokdxxww dxjokdxxwwVar) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        view.setTag(iobyxmoadg.view_tree_saved_state_registry_owner, dxjokdxxwwVar);
    }
}
