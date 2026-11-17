package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import f.btonecajqb;
import z.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {
    public static final androidx.compose.ui.wkgbmnqykc eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar) {
        return androidx.compose.ui.focus.lqeggnwhkg.iobyxmoadg(androidx.compose.ui.focus.lqeggnwhkg.iobyxmoadg(wkgbmnqykcVar.eablkybsjg(FocusGroupPropertiesElement.f7207zoijcleaow)).eablkybsjg(FocusTargetPropertiesElement.f7208zoijcleaow));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect gxszxtbevo(btonecajqb btonecajqbVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        g.lqeggnwhkg focusRect = btonecajqbVar.getFocusRect();
        if (focusRect == null) {
            return null;
        }
        return new Rect((((int) focusRect.nufgyqmvbu()) + iArr[0]) - iArr2[0], (((int) focusRect.gtknphoqwx()) + iArr[1]) - iArr2[1], (((int) focusRect.dxjokdxxww()) + iArr[0]) - iArr2[0], (((int) focusRect.eablkybsjg()) + iArr[1]) - iArr2[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        View viewRibwqtqdhb = gtknphoqwx.rgvfuqvkyq(ppxfxbqfkfVar.wflxmlrfwp()).ribwqtqdhb();
        if (viewRibwqtqdhb != null) {
            return viewRibwqtqdhb;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wkgbmnqykc(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }
}
