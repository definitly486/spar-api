package a6;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    public static View iobyxmoadg(View view, int i13) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View viewFindViewById = viewGroup.getChildAt(i14).findViewById(i13);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }
}
