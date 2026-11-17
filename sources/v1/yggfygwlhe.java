package v1;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static boolean f115246iobyxmoadg = false;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static boolean f115247ppxfxbqfkf = false;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static Field f115248wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static Method f115249zoijcleaow;

    public interface iobyxmoadg {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean eablkybsjg(iobyxmoadg iobyxmoadgVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (iobyxmoadgVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return iobyxmoadgVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return zoijcleaow((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return ppxfxbqfkf((Dialog) callback, keyEvent);
        }
        return (view != null && jhduphickx.nufgyqmvbu(view, keyEvent)) || iobyxmoadgVar.superDispatchKeyEvent(keyEvent);
    }

    private static DialogInterface.OnKeyListener gxszxtbevo(Dialog dialog) {
        if (!f115247ppxfxbqfkf) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f115248wkgbmnqykc = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f115247ppxfxbqfkf = true;
        }
        Field field = f115248wkgbmnqykc;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    private static boolean iobyxmoadg(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f115246iobyxmoadg) {
            try {
                f115249zoijcleaow = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f115246iobyxmoadg = true;
        }
        Method method = f115249zoijcleaow;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean ppxfxbqfkf(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListenerGxszxtbevo = gxszxtbevo(dialog);
        if (onKeyListenerGxszxtbevo != null && onKeyListenerGxszxtbevo.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (jhduphickx.nufgyqmvbu(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    public static boolean wkgbmnqykc(View view, KeyEvent keyEvent) {
        return jhduphickx.dxjokdxxww(view, keyEvent);
    }

    private static boolean zoijcleaow(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && iobyxmoadg(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (jhduphickx.nufgyqmvbu(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }
}
