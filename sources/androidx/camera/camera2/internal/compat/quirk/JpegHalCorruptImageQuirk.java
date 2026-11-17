package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import zdlpuopuiu.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public final class JpegHalCorruptImageQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Set f3645iobyxmoadg = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo", "k61v1_basic_ref"));

    static boolean ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        return f3645iobyxmoadg.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
