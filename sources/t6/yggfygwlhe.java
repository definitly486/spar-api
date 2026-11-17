package t6;

import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yggfygwlhe {
    private static int eablkybsjg(Context context) {
        return ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4);
    }

    private static boolean gxszxtbevo() {
        return Build.MANUFACTURER.contains("Genymobile") && Build.HARDWARE.contains("vbox");
    }

    private static boolean iobyxmoadg() {
        return Build.getRadioVersion().isEmpty();
    }

    public static int ppxfxbqfkf(Context context) {
        int i13 = wkgbmnqykc() ? 2 : 0;
        if (gxszxtbevo()) {
            i13 |= 4;
        }
        return zoijcleaow(context) ? i13 | 1 : i13;
    }

    private static boolean wkgbmnqykc() {
        return Build.MANUFACTURER.contains("Google") && Build.HARDWARE.contains("ranchu") && Build.BOARD.contains("goldfish");
    }

    private static boolean zoijcleaow(Context context) {
        return iobyxmoadg() || eablkybsjg(context) <= 0;
    }
}
