package istkbnxepw;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class okpsazkaxt implements ojitshcjhn.iobyxmoadg {

    public static class iobyxmoadg extends Service {
    }

    private static Set eablkybsjg(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class clsWkgbmnqykc = wkgbmnqykc(str);
            if (clsWkgbmnqykc != null) {
                hashSet.add(clsWkgbmnqykc);
            }
        }
        return hashSet;
    }

    private static String[] ppxfxbqfkf(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i13 = bundle.getInt(str, -1);
        if (i13 == -1) {
            lereixgezr.sopmlzcsov.draadjrbmk("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i13);
        } catch (Resources.NotFoundException e13) {
            lereixgezr.sopmlzcsov.wflxmlrfwp("QuirkSettingsLoader", "Quirk class names resource not found: " + i13, e13);
            return new String[0];
        }
    }

    private static Class wkgbmnqykc(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (vipkmwdibw.class.isAssignableFrom(cls)) {
                return cls;
            }
            lereixgezr.sopmlzcsov.draadjrbmk("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e13) {
            lereixgezr.sopmlzcsov.wflxmlrfwp("QuirkSettingsLoader", "Class not found: " + str, e13);
            return null;
        }
    }

    private static jhduphickx zoijcleaow(Context context, Bundle bundle) {
        boolean z13 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrPpxfxbqfkf = ppxfxbqfkf(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrPpxfxbqfkf2 = ppxfxbqfkf(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        lereixgezr.sopmlzcsov.iobyxmoadg("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        lereixgezr.sopmlzcsov.iobyxmoadg("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z13);
        lereixgezr.sopmlzcsov.iobyxmoadg("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrPpxfxbqfkf));
        lereixgezr.sopmlzcsov.iobyxmoadg("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrPpxfxbqfkf2));
        return new jhduphickx.zoijcleaow().wkgbmnqykc(z13).ppxfxbqfkf(eablkybsjg(strArrPpxfxbqfkf)).zoijcleaow(eablkybsjg(strArrPpxfxbqfkf2)).iobyxmoadg();
    }

    @Override // ojitshcjhn.iobyxmoadg
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public jhduphickx apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) iobyxmoadg.class), 640).metaData;
            if (bundle != null) {
                return zoijcleaow(context, bundle);
            }
            lereixgezr.sopmlzcsov.draadjrbmk("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            lereixgezr.sopmlzcsov.iobyxmoadg("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
