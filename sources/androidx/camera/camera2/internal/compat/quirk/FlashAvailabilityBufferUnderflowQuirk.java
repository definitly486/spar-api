package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import istkbnxepw.vipkmwdibw;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Set f3632iobyxmoadg = new HashSet();

    static {
        ppxfxbqfkf("sprd", "lemp");
        ppxfxbqfkf("sprd", "DM20C");
    }

    private static void ppxfxbqfkf(String str, String str2) {
        Set set = f3632iobyxmoadg;
        Locale locale = Locale.US;
        set.add(new Pair(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    static boolean wkgbmnqykc() {
        Set set = f3632iobyxmoadg;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
