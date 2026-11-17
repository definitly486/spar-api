package z1;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    public static final ViewParent iobyxmoadg(View view) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(iobyxmoadg.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }
}
