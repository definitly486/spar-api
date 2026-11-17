package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {

    static class iobyxmoadg {
        static Object iobyxmoadg(Context context, Class cls) {
            return context.getSystemService(cls);
        }

        static String ppxfxbqfkf(String str) {
            return AppOpsManager.permissionToOp(str);
        }

        static int zoijcleaow(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }
    }

    static class zoijcleaow {
        static int iobyxmoadg(AppOpsManager appOpsManager, String str, int i13, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i13, str2);
        }

        static AppOpsManager ppxfxbqfkf(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }

        static String zoijcleaow(Context context) {
            return context.getOpPackageName();
        }
    }

    public static int iobyxmoadg(Context context, int i13, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return zoijcleaow(context, str, str2);
        }
        AppOpsManager appOpsManagerPpxfxbqfkf = zoijcleaow.ppxfxbqfkf(context);
        int iIobyxmoadg = zoijcleaow.iobyxmoadg(appOpsManagerPpxfxbqfkf, str, Binder.getCallingUid(), str2);
        return iIobyxmoadg != 0 ? iIobyxmoadg : zoijcleaow.iobyxmoadg(appOpsManagerPpxfxbqfkf, str, i13, zoijcleaow.zoijcleaow(context));
    }

    public static String ppxfxbqfkf(String str) {
        return iobyxmoadg.ppxfxbqfkf(str);
    }

    public static int zoijcleaow(Context context, String str, String str2) {
        return iobyxmoadg.zoijcleaow((AppOpsManager) iobyxmoadg.iobyxmoadg(context, AppOpsManager.class), str, str2);
    }
}
