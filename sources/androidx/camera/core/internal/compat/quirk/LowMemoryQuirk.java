package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import istkbnxepw.vipkmwdibw;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class LowMemoryQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Set f3921iobyxmoadg = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    static boolean ppxfxbqfkf() {
        return f3921iobyxmoadg.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
