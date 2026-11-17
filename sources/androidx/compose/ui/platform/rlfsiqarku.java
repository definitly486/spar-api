package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
final class rlfsiqarku implements xrmfcynszj {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final rlfsiqarku f7042zoijcleaow = new rlfsiqarku();

    private rlfsiqarku() {
    }

    @Override // androidx.compose.ui.platform.xrmfcynszj
    public Rect iobyxmoadg(Activity activity) throws Exception {
        DisplayCutout displayCutoutGxszxtbevo;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e13) {
            if (!(e13 instanceof NoSuchFieldException) && !(e13 instanceof NoSuchMethodException) && !(e13 instanceof IllegalAccessException) && !(e13 instanceof InvocationTargetException)) {
                throw e13;
            }
            ribwqtqdhb.nufgyqmvbu(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            int iLqeggnwhkg = ribwqtqdhb.lqeggnwhkg(activity);
            int i13 = rect.bottom;
            if (i13 + iLqeggnwhkg == point.y) {
                rect.bottom = i13 + iLqeggnwhkg;
            } else {
                int i14 = rect.right;
                if (i14 + iLqeggnwhkg == point.x) {
                    rect.right = i14 + iLqeggnwhkg;
                } else if (rect.left == iLqeggnwhkg) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode() && (displayCutoutGxszxtbevo = ribwqtqdhb.gxszxtbevo(defaultDisplay)) != null) {
            if (rect.left == displayCutoutGxszxtbevo.getSafeInsetLeft()) {
                rect.left = 0;
            }
            if (point.x - rect.right == displayCutoutGxszxtbevo.getSafeInsetRight()) {
                rect.right += displayCutoutGxszxtbevo.getSafeInsetRight();
            }
            if (rect.top == displayCutoutGxszxtbevo.getSafeInsetTop()) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == displayCutoutGxszxtbevo.getSafeInsetBottom()) {
                rect.bottom += displayCutoutGxszxtbevo.getSafeInsetBottom();
            }
        }
        return rect;
    }
}
