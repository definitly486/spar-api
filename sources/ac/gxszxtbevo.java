package ac;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Float f1356iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f1357zoijcleaow;

    private gxszxtbevo(Float f13, boolean z13) {
        this.f1357zoijcleaow = z13;
        this.f1356iobyxmoadg = f13;
    }

    private static boolean eablkybsjg(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public static gxszxtbevo iobyxmoadg(Context context) {
        boolean zEablkybsjg = false;
        Float fWkgbmnqykc = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zEablkybsjg = eablkybsjg(intentRegisterReceiver);
                fWkgbmnqykc = wkgbmnqykc(intentRegisterReceiver);
            }
        } catch (IllegalStateException e13) {
            xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("An error occurred getting battery state.", e13);
        }
        return new gxszxtbevo(fWkgbmnqykc, zEablkybsjg);
    }

    private static Float wkgbmnqykc(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    public int ppxfxbqfkf() {
        Float f13;
        if (!this.f1357zoijcleaow || (f13 = this.f1356iobyxmoadg) == null) {
            return 1;
        }
        return ((double) f13.floatValue()) < 0.99d ? 2 : 3;
    }

    public Float zoijcleaow() {
        return this.f1356iobyxmoadg;
    }
}
