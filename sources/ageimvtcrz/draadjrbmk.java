package ageimvtcrz;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup eablkybsjg(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eablkybsjg ppxfxbqfkf(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt instanceof eablkybsjg) {
                return (eablkybsjg) childAt;
            }
        }
        eablkybsjg eablkybsjgVar = new eablkybsjg(viewGroup.getContext());
        viewGroup.addView(eablkybsjgVar);
        return eablkybsjgVar;
    }

    public static final z.btonecajqb wkgbmnqykc(metgxyhuhe.btonecajqb btonecajqbVar, boolean z13, float f13, opjhrmiecq opjhrmiecqVar, tg.iobyxmoadg iobyxmoadgVar) {
        return new zoijcleaow(btonecajqbVar, z13, f13, opjhrmiecqVar, iobyxmoadgVar, null);
    }
}
