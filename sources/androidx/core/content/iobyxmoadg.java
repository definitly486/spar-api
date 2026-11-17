package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.app.dxjokdxxww;
import androidx.core.app.rgvfuqvkyq;
import i1.nufgyqmvbu;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    static class eablkybsjg {
        static Executor iobyxmoadg(Context context) {
            return context.getMainExecutor();
        }
    }

    static class gxszxtbevo {
        static Context iobyxmoadg(Context context, String str) {
            return context.createAttributionContext(str);
        }

        static Display ppxfxbqfkf(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w(iobyxmoadg.TAG, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }

        static String zoijcleaow(Context context) {
            return context.getAttributionTag();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static class C0136iobyxmoadg {
        static File iobyxmoadg(Context context) {
            return context.getCodeCacheDir();
        }

        static File ppxfxbqfkf(Context context) {
            return context.getNoBackupFilesDir();
        }

        static Drawable zoijcleaow(Context context, int i13) {
            return context.getDrawable(i13);
        }
    }

    static class lqeggnwhkg {
        static Intent iobyxmoadg(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i13) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i13);
        }
    }

    static class ppxfxbqfkf {
        static Context iobyxmoadg(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static boolean ppxfxbqfkf(Context context) {
            return context.isDeviceProtectedStorage();
        }

        static File zoijcleaow(Context context) {
            return context.getDataDir();
        }
    }

    static class wkgbmnqykc {
        static Intent iobyxmoadg(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i13) {
            return ((i13 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i13 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, iobyxmoadg.obtainAndCheckReceiverPermission(context), handler);
        }

        static ComponentName zoijcleaow(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class zoijcleaow {
        static int iobyxmoadg(Context context, int i13) {
            return context.getColor(i13);
        }

        static String ppxfxbqfkf(Context context, Class cls) {
            return context.getSystemServiceName(cls);
        }

        static Object zoijcleaow(Context context, Class cls) {
            return context.getSystemService(cls);
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        u1.zoijcleaow.wkgbmnqykc(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return rgvfuqvkyq.wkgbmnqykc(context).iobyxmoadg() ? 0 : -1;
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? gxszxtbevo.iobyxmoadg(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return ppxfxbqfkf.iobyxmoadg(context);
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return gxszxtbevo.zoijcleaow(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return C0136iobyxmoadg.iobyxmoadg(context);
    }

    public static int getColor(Context context, int i13) {
        return zoijcleaow.iobyxmoadg(context, i13);
    }

    public static ColorStateList getColorStateList(Context context, int i13) {
        return nufgyqmvbu.eablkybsjg(context.getResources(), i13, context.getTheme());
    }

    public static Context getContextForLanguage(Context context) {
        q1.nufgyqmvbu nufgyqmvbuVarIobyxmoadg = dxjokdxxww.iobyxmoadg(context);
        if (Build.VERSION.SDK_INT > 32 || nufgyqmvbuVarIobyxmoadg.eablkybsjg()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        q1.eablkybsjg.zoijcleaow(configuration, nufgyqmvbuVarIobyxmoadg);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        return ppxfxbqfkf.zoijcleaow(context);
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? gxszxtbevo.ppxfxbqfkf(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i13) {
        return C0136iobyxmoadg.zoijcleaow(context, i13);
    }

    @Deprecated
    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? eablkybsjg.iobyxmoadg(context) : q1.gxszxtbevo.iobyxmoadg(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return C0136iobyxmoadg.ppxfxbqfkf(context);
    }

    @Deprecated
    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i13) {
        return getContextForLanguage(context).getString(i13);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) zoijcleaow.zoijcleaow(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return zoijcleaow.ppxfxbqfkf(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return ppxfxbqfkf.ppxfxbqfkf(context);
    }

    static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (androidx.core.content.wkgbmnqykc.zoijcleaow(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i13) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i13);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    @Deprecated
    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        wkgbmnqykc.zoijcleaow(context, intent);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i13) {
        int i14 = i13 & 1;
        if (i14 != 0 && (i13 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i14 != 0) {
            i13 |= 2;
        }
        int i15 = i13;
        int i16 = i15 & 2;
        if (i16 == 0 && (i15 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i16 == 0 || (i15 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? lqeggnwhkg.iobyxmoadg(context, broadcastReceiver, intentFilter, str, handler, i15) : wkgbmnqykc.iobyxmoadg(context, broadcastReceiver, intentFilter, str, handler, i15);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
