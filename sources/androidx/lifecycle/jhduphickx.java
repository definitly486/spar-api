package androidx.lifecycle;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class jhduphickx {
    public static final ribwqtqdhb iobyxmoadg(View view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(t2.eablkybsjg.view_tree_view_model_store_owner);
            ribwqtqdhb ribwqtqdhbVar = tag instanceof ribwqtqdhb ? (ribwqtqdhb) tag : null;
            if (ribwqtqdhbVar != null) {
                return ribwqtqdhbVar;
            }
            Object objIobyxmoadg = z1.zoijcleaow.iobyxmoadg(view);
            view = objIobyxmoadg instanceof View ? (View) objIobyxmoadg : null;
        }
        return null;
    }

    public static final void zoijcleaow(View view, ribwqtqdhb ribwqtqdhbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "<this>");
        view.setTag(t2.eablkybsjg.view_tree_view_model_store_owner, ribwqtqdhbVar);
    }
}
