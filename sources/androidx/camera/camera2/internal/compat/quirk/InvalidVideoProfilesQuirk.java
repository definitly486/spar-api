package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import istkbnxepw.vipkmwdibw;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class InvalidVideoProfilesQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final List f3641iobyxmoadg = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final List f3643zoijcleaow = Arrays.asList("cph2417", "cph2451");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final List f3642ppxfxbqfkf = Arrays.asList("cph2437", "cph2525", "pht110");

    private static boolean agtfadlqog() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tkq1");
    }

    private static boolean btonecajqb() {
        return f3641iobyxmoadg.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean draadjrbmk() {
        String str = Build.BRAND;
        return ("redmi".equalsIgnoreCase(str) || "xiaomi".equalsIgnoreCase(str)) && (agtfadlqog() || ojitshcjhn());
    }

    private static boolean dxjokdxxww() {
        return btonecajqb() && nufgyqmvbu();
    }

    private static boolean eablkybsjg() {
        return f3643zoijcleaow.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean gtknphoqwx() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && ojitshcjhn();
    }

    private static boolean gxszxtbevo() {
        return lqeggnwhkg() && ppxfxbqfkf();
    }

    private static boolean lqeggnwhkg() {
        return f3642ppxfxbqfkf.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean nufgyqmvbu() {
        return ojitshcjhn() || wflxmlrfwp();
    }

    private static boolean ojitshcjhn() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    private static boolean ppxfxbqfkf() {
        return Build.VERSION.SDK_INT == 33;
    }

    static boolean rgvfuqvkyq() {
        return gtknphoqwx() || dxjokdxxww() || draadjrbmk() || wkgbmnqykc() || gxszxtbevo();
    }

    private static boolean wflxmlrfwp() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    private static boolean wkgbmnqykc() {
        return eablkybsjg() && ppxfxbqfkf();
    }
}
