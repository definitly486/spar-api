package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import istkbnxepw.oipsdeybqn;
import istkbnxepw.vipkmwdibw;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ExtraCroppingQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Map f3626iobyxmoadg;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f3627iobyxmoadg;

        static {
            int[] iArr = new int[oipsdeybqn.zoijcleaow.values().length];
            f3627iobyxmoadg = iArr;
            try {
                iArr[oipsdeybqn.zoijcleaow.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3627iobyxmoadg[oipsdeybqn.zoijcleaow.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3627iobyxmoadg[oipsdeybqn.zoijcleaow.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f3626iobyxmoadg = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    static boolean eablkybsjg() {
        return wkgbmnqykc();
    }

    private static boolean wkgbmnqykc() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        Map map = f3626iobyxmoadg;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!map.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }

    public Size ppxfxbqfkf(oipsdeybqn.zoijcleaow zoijcleaowVar) {
        if (!wkgbmnqykc()) {
            return null;
        }
        int i13 = iobyxmoadg.f3627iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return new Size(1920, 1080);
        }
        if (i13 == 2) {
            return new Size(1280, 720);
        }
        if (i13 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
