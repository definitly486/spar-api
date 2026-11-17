package androidx.lifecycle;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class vipkmwdibw {
    public static final vdvldrhtss iobyxmoadg(View view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(s2.iobyxmoadg.view_tree_lifecycle_owner);
            vdvldrhtss vdvldrhtssVar = tag instanceof vdvldrhtss ? (vdvldrhtss) tag : null;
            if (vdvldrhtssVar != null) {
                return vdvldrhtssVar;
            }
            Object objIobyxmoadg = z1.zoijcleaow.iobyxmoadg(view);
            view = objIobyxmoadg instanceof View ? (View) objIobyxmoadg : null;
        }
        return null;
    }

    public static final void zoijcleaow(View view, vdvldrhtss vdvldrhtssVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "<this>");
        view.setTag(s2.iobyxmoadg.view_tree_lifecycle_owner, vdvldrhtssVar);
    }
}
