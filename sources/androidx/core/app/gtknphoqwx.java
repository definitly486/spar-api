package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {
    public static void eablkybsjg(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    public static boolean gxszxtbevo(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    public static Intent iobyxmoadg(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strPpxfxbqfkf = ppxfxbqfkf(activity);
        if (strPpxfxbqfkf == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strPpxfxbqfkf);
        try {
            return wkgbmnqykc(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strPpxfxbqfkf + "' in manifest");
            return null;
        }
    }

    public static String ppxfxbqfkf(Activity activity) {
        try {
            return wkgbmnqykc(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public static String wkgbmnqykc(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static Intent zoijcleaow(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strWkgbmnqykc = wkgbmnqykc(context, componentName);
        if (strWkgbmnqykc == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strWkgbmnqykc);
        return wkgbmnqykc(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }
}
