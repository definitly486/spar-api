package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static boolean f3401iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final boolean f3402ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static Method f3403zoijcleaow;

    static class iobyxmoadg {
        static void iobyxmoadg(View view, Rect rect, Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    static {
        f3402ppxfxbqfkf = Build.VERSION.SDK_INT >= 27;
    }

    public static void iobyxmoadg(View view, Rect rect, Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            iobyxmoadg.iobyxmoadg(view, rect, rect2);
            return;
        }
        if (!f3401iobyxmoadg) {
            f3401iobyxmoadg = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f3403zoijcleaow = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f3403zoijcleaow.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        Method method = f3403zoijcleaow;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e13) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e13);
            }
        }
    }

    public static void ppxfxbqfkf(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (IllegalAccessException e13) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e13);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e14) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e14);
        }
    }

    public static boolean zoijcleaow(View view) {
        return view.getLayoutDirection() == 1;
    }
}
