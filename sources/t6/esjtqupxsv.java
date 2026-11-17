package t6;

import android.os.Build;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class esjtqupxsv {
    private static int iobyxmoadg(TelephonyManager telephonyManager) {
        return Build.VERSION.SDK_INT >= 30 ? telephonyManager.getSupportedModemCount() : telephonyManager.getPhoneCount();
    }

    public static int ppxfxbqfkf(TelephonyManager telephonyManager) {
        return zoijcleaow(telephonyManager);
    }

    private static boolean wkgbmnqykc(int i13) {
        return i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5;
    }

    private static int zoijcleaow(TelephonyManager telephonyManager) {
        int iIobyxmoadg = iobyxmoadg(telephonyManager);
        int i13 = 0;
        for (int i14 = 0; i14 < iIobyxmoadg; i14++) {
            if (wkgbmnqykc(telephonyManager.getSimState(i14))) {
                i13++;
            }
        }
        return i13;
    }
}
