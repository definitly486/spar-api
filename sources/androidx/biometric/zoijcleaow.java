package androidx.biometric;

import android.os.Build;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
abstract class zoijcleaow {
    static boolean eablkybsjg(int i13) {
        if (i13 == 15 || i13 == 255) {
            return true;
        }
        if (i13 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i13 != 32783) {
            return i13 == 33023 || i13 == 0;
        }
        int i14 = Build.VERSION.SDK_INT;
        return i14 < 28 || i14 > 29;
    }

    static boolean gxszxtbevo(int i13) {
        return (i13 & KotlinVersion.MAX_COMPONENT_VALUE) == 255;
    }

    static String iobyxmoadg(int i13) {
        if (i13 == 15) {
            return "BIOMETRIC_STRONG";
        }
        if (i13 == 255) {
            return "BIOMETRIC_WEAK";
        }
        if (i13 == 32768) {
            return "DEVICE_CREDENTIAL";
        }
        if (i13 != 32783) {
            return i13 != 33023 ? String.valueOf(i13) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
        }
        return "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
    }

    static boolean ppxfxbqfkf(int i13) {
        return (i13 & 32768) != 0;
    }

    static boolean wkgbmnqykc(int i13) {
        return (i13 & 32767) != 0;
    }

    static int zoijcleaow(eablkybsjg.wkgbmnqykc wkgbmnqykcVar, eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar) {
        if (wkgbmnqykcVar.iobyxmoadg() != 0) {
            return wkgbmnqykcVar.iobyxmoadg();
        }
        int i13 = ppxfxbqfkfVar != null ? 15 : KotlinVersion.MAX_COMPONENT_VALUE;
        return wkgbmnqykcVar.lqeggnwhkg() ? 32768 | i13 : i13;
    }
}
