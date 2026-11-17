package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow extends androidx.core.content.iobyxmoadg {

    public interface eablkybsjg {
        void validateRequestPermissionsRequestCode(int i13);
    }

    static class iobyxmoadg {
        static void eablkybsjg(Activity activity) {
            activity.startPostponedEnterTransition();
        }

        static void iobyxmoadg(Activity activity) {
            activity.finishAfterTransition();
        }

        static void ppxfxbqfkf(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void wkgbmnqykc(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void zoijcleaow(Activity activity) {
            activity.postponeEnterTransition();
        }
    }

    static class ppxfxbqfkf {
        static boolean iobyxmoadg(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    static class wkgbmnqykc {
        static boolean iobyxmoadg(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static class C0135zoijcleaow {
        static void iobyxmoadg(Activity activity, String[] strArr, int i13) {
            activity.requestPermissions(strArr, i13);
        }

        static boolean zoijcleaow(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static boolean btonecajqb(Activity activity, String str) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i13 >= 32) {
            return wkgbmnqykc.iobyxmoadg(activity, str);
        }
        return i13 == 31 ? ppxfxbqfkf.iobyxmoadg(activity, str) : C0135zoijcleaow.zoijcleaow(activity, str);
    }

    public static void draadjrbmk(Activity activity, IntentSender intentSender, int i13, Intent intent, int i14, int i15, int i16, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i13, intent, i14, i15, i16, bundle);
    }

    public static void dxjokdxxww(Activity activity, yggfygwlhe yggfygwlheVar) {
        iobyxmoadg.wkgbmnqykc(activity, null);
    }

    public static void eablkybsjg(Activity activity) {
        iobyxmoadg.zoijcleaow(activity);
    }

    public static void gtknphoqwx(Activity activity, Intent intent, int i13, Bundle bundle) {
        activity.startActivityForResult(intent, i13, bundle);
    }

    public static void gxszxtbevo(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.iobyxmoadg
                @Override // java.lang.Runnable
                public final void run() {
                    zoijcleaow.wkgbmnqykc(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void lqeggnwhkg(Activity activity, String[] strArr, int i13) {
        HashSet hashSet = new HashSet();
        for (int i14 = 0; i14 < strArr.length; i14++) {
            if (TextUtils.isEmpty(strArr[i14])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i14], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i14));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i15 = 0;
            for (int i16 = 0; i16 < strArr.length; i16++) {
                if (!hashSet.contains(Integer.valueOf(i16))) {
                    strArr2[i15] = strArr[i16];
                    i15++;
                }
            }
        }
        if (activity instanceof eablkybsjg) {
            ((eablkybsjg) activity).validateRequestPermissionsRequestCode(i13);
        }
        C0135zoijcleaow.iobyxmoadg(activity, strArr, i13);
    }

    public static void nufgyqmvbu(Activity activity, yggfygwlhe yggfygwlheVar) {
        iobyxmoadg.ppxfxbqfkf(activity, null);
    }

    public static void ppxfxbqfkf(Activity activity) {
        iobyxmoadg.iobyxmoadg(activity);
    }

    public static void wflxmlrfwp(Activity activity) {
        iobyxmoadg.eablkybsjg(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void wkgbmnqykc(Activity activity) {
        if (activity.isFinishing() || androidx.core.app.wkgbmnqykc.dxjokdxxww(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void zoijcleaow(Activity activity) {
        activity.finishAffinity();
    }
}
