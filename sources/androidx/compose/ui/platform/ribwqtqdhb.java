package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class ribwqtqdhb {
    private static final Activity eablkybsjg(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayCutout gxszxtbevo(Display display) throws Exception {
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
        } catch (Exception e13) {
            if ((e13 instanceof ClassNotFoundException) || (e13 instanceof NoSuchMethodException) || (e13 instanceof NoSuchFieldException) || (e13 instanceof IllegalAccessException) || (e13 instanceof InvocationTargetException) || (e13 instanceof InstantiationException)) {
                return null;
            }
            throw e13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int lqeggnwhkg(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    public static final long wkgbmnqykc(AndroidComposeView androidComposeView) {
        Context context = androidComposeView.getContext();
        Activity activityEablkybsjg = eablkybsjg(context);
        if (activityEablkybsjg != null) {
            Rect rectIobyxmoadg = xrmfcynszj.f7137iobyxmoadg.iobyxmoadg().iobyxmoadg(activityEablkybsjg);
            return w0.oxmwwwfdhm.ppxfxbqfkf((((long) rectIobyxmoadg.height()) & 4294967295L) | (((long) rectIobyxmoadg.width()) << 32));
        }
        Configuration configuration = context.getResources().getConfiguration();
        float f13 = context.getResources().getDisplayMetrics().density;
        return w0.oxmwwwfdhm.ppxfxbqfkf((((long) Math.round(configuration.screenHeightDp * f13)) & 4294967295L) | (((long) Math.round(configuration.screenWidthDp * f13)) << 32));
    }
}
