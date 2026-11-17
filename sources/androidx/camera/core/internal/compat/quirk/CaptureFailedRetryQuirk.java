package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import istkbnxepw.vipkmwdibw;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class CaptureFailedRetryQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Set f3917iobyxmoadg = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    static boolean ppxfxbqfkf() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f3917iobyxmoadg.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }
}
