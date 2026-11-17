package v1;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class jztzpxfvev {

    static class iobyxmoadg {
        static float iobyxmoadg(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float zoijcleaow(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    static class ppxfxbqfkf {
        static int iobyxmoadg(ViewConfiguration viewConfiguration, int i13, int i14, int i15) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i13, i14, i15);
        }

        static int zoijcleaow(ViewConfiguration viewConfiguration, int i13, int i14, int i15) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i13, i14, i15);
        }
    }

    static class zoijcleaow {
        static boolean iobyxmoadg(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    public static boolean btonecajqb(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return zoijcleaow.iobyxmoadg(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iZoijcleaow = zoijcleaow(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iZoijcleaow != 0 && resources.getBoolean(iZoijcleaow);
    }

    private static boolean dxjokdxxww(int i13, int i14, int i15) {
        InputDevice device = InputDevice.getDevice(i13);
        return (device == null || device.getMotionRange(i14, i15) == null) ? false : true;
    }

    public static float eablkybsjg(ViewConfiguration viewConfiguration, Context context) {
        return iobyxmoadg.iobyxmoadg(viewConfiguration);
    }

    public static int gxszxtbevo(Context context, final ViewConfiguration viewConfiguration, int i13, int i14, int i15) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ppxfxbqfkf.iobyxmoadg(viewConfiguration, i13, i14, i15);
        }
        if (!dxjokdxxww(i13, i14, i15)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iPpxfxbqfkf = ppxfxbqfkf(resources, i15, i14);
        Objects.requireNonNull(viewConfiguration);
        return iobyxmoadg(resources, iPpxfxbqfkf, new u1.dxjokdxxww() { // from class: v1.ikoacuggdj
            @Override // u1.dxjokdxxww
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    private static int iobyxmoadg(Resources resources, int i13, u1.dxjokdxxww dxjokdxxwwVar, int i14) {
        int dimensionPixelSize;
        if (i13 != -1) {
            return (i13 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i13)) < 0) ? i14 : dimensionPixelSize;
        }
        return ((Integer) dxjokdxxwwVar.get()).intValue();
    }

    public static int lqeggnwhkg(Context context, final ViewConfiguration viewConfiguration, int i13, int i14, int i15) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ppxfxbqfkf.zoijcleaow(viewConfiguration, i13, i14, i15);
        }
        if (!dxjokdxxww(i13, i14, i15)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iWkgbmnqykc = wkgbmnqykc(resources, i15, i14);
        Objects.requireNonNull(viewConfiguration);
        return iobyxmoadg(resources, iWkgbmnqykc, new u1.dxjokdxxww() { // from class: v1.okpsazkaxt
            @Override // u1.dxjokdxxww
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float nufgyqmvbu(ViewConfiguration viewConfiguration, Context context) {
        return iobyxmoadg.zoijcleaow(viewConfiguration);
    }

    private static int ppxfxbqfkf(Resources resources, int i13, int i14) {
        if (i13 == 4194304 && i14 == 26) {
            return zoijcleaow(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int wkgbmnqykc(Resources resources, int i13, int i14) {
        if (i13 == 4194304 && i14 == 26) {
            return zoijcleaow(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int zoijcleaow(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, ConstantDeviceInfo.APP_PLATFORM);
    }
}
