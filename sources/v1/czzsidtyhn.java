package v1;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class czzsidtyhn {

    static class iobyxmoadg {
        static void eablkybsjg(ViewParent viewParent, View view, View view2, int i13) {
            viewParent.onNestedScrollAccepted(view, view2, i13);
        }

        static boolean gxszxtbevo(ViewParent viewParent, View view, View view2, int i13) {
            return viewParent.onStartNestedScroll(view, view2, i13);
        }

        static boolean iobyxmoadg(ViewParent viewParent, View view, float f13, float f14, boolean z13) {
            return viewParent.onNestedFling(view, f13, f14, z13);
        }

        static void lqeggnwhkg(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }

        static void ppxfxbqfkf(ViewParent viewParent, View view, int i13, int i14, int[] iArr) {
            viewParent.onNestedPreScroll(view, i13, i14, iArr);
        }

        static void wkgbmnqykc(ViewParent viewParent, View view, int i13, int i14, int i15, int i16) {
            viewParent.onNestedScroll(view, i13, i14, i15, i16);
        }

        static boolean zoijcleaow(ViewParent viewParent, View view, float f13, float f14) {
            return viewParent.onNestedPreFling(view, f13, f14);
        }
    }

    public static void eablkybsjg(ViewParent viewParent, View view, View view2, int i13, int i14) {
        if (viewParent instanceof lmojexxdyd) {
            ((lmojexxdyd) viewParent).dxjokdxxww(view, view2, i13, i14);
            return;
        }
        if (i14 == 0) {
            try {
                iobyxmoadg.eablkybsjg(viewParent, view, view2, i13);
            } catch (AbstractMethodError e13) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e13);
            }
        }
    }

    public static boolean gxszxtbevo(ViewParent viewParent, View view, View view2, int i13, int i14) {
        if (viewParent instanceof lmojexxdyd) {
            return ((lmojexxdyd) viewParent).rgvfuqvkyq(view, view2, i13, i14);
        }
        if (i14 != 0) {
            return false;
        }
        try {
            return iobyxmoadg.gxszxtbevo(viewParent, view, view2, i13);
        } catch (AbstractMethodError e13) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e13);
            return false;
        }
    }

    public static boolean iobyxmoadg(ViewParent viewParent, View view, float f13, float f14, boolean z13) {
        try {
            return iobyxmoadg.iobyxmoadg(viewParent, view, f13, f14, z13);
        } catch (AbstractMethodError e13) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e13);
            return false;
        }
    }

    public static void lqeggnwhkg(ViewParent viewParent, View view, int i13) {
        if (viewParent instanceof lmojexxdyd) {
            ((lmojexxdyd) viewParent).btonecajqb(view, i13);
            return;
        }
        if (i13 == 0) {
            try {
                iobyxmoadg.lqeggnwhkg(viewParent, view);
            } catch (AbstractMethodError e13) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e13);
            }
        }
    }

    public static void ppxfxbqfkf(ViewParent viewParent, View view, int i13, int i14, int[] iArr, int i15) {
        if (viewParent instanceof lmojexxdyd) {
            ((lmojexxdyd) viewParent).gtknphoqwx(view, i13, i14, iArr, i15);
            return;
        }
        if (i15 == 0) {
            try {
                iobyxmoadg.ppxfxbqfkf(viewParent, view, i13, i14, iArr);
            } catch (AbstractMethodError e13) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e13);
            }
        }
    }

    public static void wkgbmnqykc(ViewParent viewParent, View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        if (viewParent instanceof wwaezpbzkn) {
            ((wwaezpbzkn) viewParent).wflxmlrfwp(view, i13, i14, i15, i16, i17, iArr);
            return;
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (viewParent instanceof lmojexxdyd) {
            ((lmojexxdyd) viewParent).agtfadlqog(view, i13, i14, i15, i16, i17);
            return;
        }
        if (i17 == 0) {
            try {
                iobyxmoadg.wkgbmnqykc(viewParent, view, i13, i14, i15, i16);
            } catch (AbstractMethodError e13) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e13);
            }
        }
    }

    public static boolean zoijcleaow(ViewParent viewParent, View view, float f13, float f14) {
        try {
            return iobyxmoadg.zoijcleaow(viewParent, view, f13, f14);
        } catch (AbstractMethodError e13) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e13);
            return false;
        }
    }
}
