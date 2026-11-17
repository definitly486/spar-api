package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import istkbnxepw.vipkmwdibw;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class LargeJpegImageQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Set f3919iobyxmoadg = new HashSet(Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Set f3920zoijcleaow = new HashSet(Arrays.asList("V2244A", "V2045", "V2046"));

    private static boolean eablkybsjg() {
        return "Vivo".equalsIgnoreCase(Build.BRAND) && f3920zoijcleaow.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    static boolean gxszxtbevo() {
        return ppxfxbqfkf() || eablkybsjg();
    }

    private static boolean ppxfxbqfkf() {
        return "Samsung".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean wkgbmnqykc() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f3919iobyxmoadg.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public boolean lqeggnwhkg(byte[] bArr) {
        return wkgbmnqykc() || eablkybsjg() || bArr.length > 10000000;
    }
}
