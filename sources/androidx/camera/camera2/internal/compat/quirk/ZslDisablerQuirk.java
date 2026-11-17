package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import istkbnxepw.vipkmwdibw;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ZslDisablerQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final List f3652iobyxmoadg = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final List f3653zoijcleaow = Arrays.asList("MI 8");

    private static boolean eablkybsjg() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && ppxfxbqfkf(f3653zoijcleaow);
    }

    static boolean gxszxtbevo() {
        return wkgbmnqykc() || eablkybsjg();
    }

    private static boolean ppxfxbqfkf(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean wkgbmnqykc() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && ppxfxbqfkf(f3652iobyxmoadg);
    }
}
