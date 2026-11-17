package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {

    static class iobyxmoadg {
        static void iobyxmoadg(PopupWindow popupWindow, boolean z13) {
            popupWindow.setOverlapAnchor(z13);
        }

        static void zoijcleaow(PopupWindow popupWindow, int i13) {
            popupWindow.setWindowLayoutType(i13);
        }
    }

    public static void iobyxmoadg(PopupWindow popupWindow, boolean z13) {
        iobyxmoadg.iobyxmoadg(popupWindow, z13);
    }

    public static void ppxfxbqfkf(PopupWindow popupWindow, View view, int i13, int i14, int i15) {
        popupWindow.showAsDropDown(view, i13, i14, i15);
    }

    public static void zoijcleaow(PopupWindow popupWindow, int i13) {
        iobyxmoadg.zoijcleaow(popupWindow, i13);
    }
}
