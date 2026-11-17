package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import istkbnxepw.vipkmwdibw;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class StillCaptureFlashStopRepeatingQuirk implements vipkmwdibw {
    static boolean ppxfxbqfkf() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
