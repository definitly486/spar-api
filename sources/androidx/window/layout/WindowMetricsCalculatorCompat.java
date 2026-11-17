package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.compose.ui.platform.crxdokpmqz;
import androidx.compose.ui.platform.jlmebxxoox;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b \u0010\u001aJ\u0017\u0010%\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/esjtqupxsv;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "bounds", "Lgg/wwaezpbzkn;", "getRectSizeFromDisplay", "(Landroid/app/Activity;Landroid/graphics/Rect;)V", "Landroid/content/Context;", "context", "", "getNavigationBarHeight", "(Landroid/content/Context;)I", "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", "getCutoutForDisplay", "(Landroid/view/Display;)Landroid/view/DisplayCutout;", "Landroidx/window/layout/cqumvgiudr;", "computeCurrentWindowMetrics", "(Landroid/app/Activity;)Landroidx/window/layout/cqumvgiudr;", "computeMaximumWindowMetrics", "computeWindowBoundsQ$window_release", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "computeWindowBoundsQ", "computeWindowBoundsP$window_release", "computeWindowBoundsP", "computeWindowBoundsN$window_release", "computeWindowBoundsN", "computeWindowBoundsIceCreamSandwich$window_release", "computeWindowBoundsIceCreamSandwich", "Landroid/graphics/Point;", "getRealSizeForDisplay$window_release", "(Landroid/view/Display;)Landroid/graphics/Point;", "getRealSizeForDisplay", "", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WindowMetricsCalculatorCompat implements esjtqupxsv {
    public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();
    private static final String TAG;

    static {
        String simpleName = WindowMetricsCalculatorCompat.class.getSimpleName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        TAG = simpleName;
    }

    private WindowMetricsCalculatorCompat() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final DisplayCutout getCutoutForDisplay(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (crxdokpmqz.iobyxmoadg(obj)) {
                return jlmebxxoox.iobyxmoadg(obj);
            }
            return null;
        } catch (ClassNotFoundException e13) {
            Log.w(TAG, e13);
            return null;
        } catch (IllegalAccessException e14) {
            Log.w(TAG, e14);
            return null;
        } catch (InstantiationException e15) {
            Log.w(TAG, e15);
            return null;
        } catch (NoSuchFieldException e16) {
            Log.w(TAG, e16);
            return null;
        } catch (NoSuchMethodException e17) {
            Log.w(TAG, e17);
            return null;
        } catch (InvocationTargetException e18) {
            Log.w(TAG, e18);
            return null;
        }
    }

    private final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void getRectSizeFromDisplay(Activity activity, Rect bounds) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(bounds);
    }

    public cqumvgiudr computeCurrentWindowMetrics(Activity activity) {
        Rect rectComputeWindowBoundsP$window_release;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            rectComputeWindowBoundsP$window_release = eablkybsjg.f13820iobyxmoadg.iobyxmoadg(activity);
        } else if (i13 >= 29) {
            rectComputeWindowBoundsP$window_release = computeWindowBoundsQ$window_release(activity);
        } else {
            rectComputeWindowBoundsP$window_release = i13 >= 28 ? computeWindowBoundsP$window_release(activity) : computeWindowBoundsN$window_release(activity);
        }
        return new cqumvgiudr(rectComputeWindowBoundsP$window_release);
    }

    public cqumvgiudr computeMaximumWindowMetrics(Activity activity) {
        Rect rect;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = eablkybsjg.f13820iobyxmoadg.zoijcleaow(activity);
        } else {
            Display display = activity.getWindowManager().getDefaultDisplay();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(display, "display");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(display);
            rect = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        return new cqumvgiudr(rect);
    }

    public final Rect computeWindowBoundsIceCreamSandwich$window_release(Activity activity) {
        int i13;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(defaultDisplay, "defaultDisplay");
        Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        Rect rect = new Rect();
        int i14 = realSizeForDisplay$window_release.x;
        if (i14 == 0 || (i13 = realSizeForDisplay$window_release.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i14;
            rect.bottom = i13;
        }
        return rect;
    }

    public final Rect computeWindowBoundsN$window_release(Activity activity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!iobyxmoadg.f13823iobyxmoadg.iobyxmoadg(activity)) {
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(defaultDisplay, "defaultDisplay");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i13 = rect.bottom;
            if (i13 + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom = i13 + navigationBarHeight;
            } else {
                int i14 = rect.right;
                if (i14 + navigationBarHeight == realSizeForDisplay$window_release.x) {
                    rect.right = i14 + navigationBarHeight;
                }
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect computeWindowBoundsP$window_release(Activity activity) {
        DisplayCutout cutoutForDisplay;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (iobyxmoadg.f13823iobyxmoadg.iobyxmoadg(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e13) {
            Log.w(TAG, e13);
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchFieldException e14) {
            Log.w(TAG, e14);
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchMethodException e15) {
            Log.w(TAG, e15);
            getRectSizeFromDisplay(activity, rect);
        } catch (InvocationTargetException e16) {
            Log.w(TAG, e16);
            getRectSizeFromDisplay(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        gxszxtbevo gxszxtbevoVar = gxszxtbevo.f13822iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(currentDisplay, "currentDisplay");
        gxszxtbevoVar.iobyxmoadg(currentDisplay, point);
        iobyxmoadg iobyxmoadgVar = iobyxmoadg.f13823iobyxmoadg;
        if (!iobyxmoadgVar.iobyxmoadg(activity)) {
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i13 = rect.bottom;
            if (i13 + navigationBarHeight == point.y) {
                rect.bottom = i13 + navigationBarHeight;
            } else {
                int i14 = rect.right;
                if (i14 + navigationBarHeight == point.x) {
                    rect.right = i14 + navigationBarHeight;
                } else if (rect.left == navigationBarHeight) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !iobyxmoadgVar.iobyxmoadg(activity) && (cutoutForDisplay = getCutoutForDisplay(currentDisplay)) != null) {
            int i15 = rect.left;
            gtknphoqwx gtknphoqwxVar = gtknphoqwx.f13821iobyxmoadg;
            if (i15 == gtknphoqwxVar.zoijcleaow(cutoutForDisplay)) {
                rect.left = 0;
            }
            if (point.x - rect.right == gtknphoqwxVar.ppxfxbqfkf(cutoutForDisplay)) {
                rect.right += gtknphoqwxVar.ppxfxbqfkf(cutoutForDisplay);
            }
            if (rect.top == gtknphoqwxVar.wkgbmnqykc(cutoutForDisplay)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == gtknphoqwxVar.iobyxmoadg(cutoutForDisplay)) {
                rect.bottom += gtknphoqwxVar.iobyxmoadg(cutoutForDisplay);
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect computeWindowBoundsQ$window_release(Activity activity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            if (objInvoke != null) {
                return new Rect((Rect) objInvoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e13) {
            Log.w(TAG, e13);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchFieldException e14) {
            Log.w(TAG, e14);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchMethodException e15) {
            Log.w(TAG, e15);
            return computeWindowBoundsP$window_release(activity);
        } catch (InvocationTargetException e16) {
            Log.w(TAG, e16);
            return computeWindowBoundsP$window_release(activity);
        }
    }

    public final Point getRealSizeForDisplay$window_release(Display display) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(display, "display");
        Point point = new Point();
        gxszxtbevo.f13822iobyxmoadg.iobyxmoadg(display, point);
        return point;
    }
}
