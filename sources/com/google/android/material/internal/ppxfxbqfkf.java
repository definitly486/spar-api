package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import v1.oipsdeybqn;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {
    public static void eablkybsjg(Window window, boolean z13) {
        oipsdeybqn.iobyxmoadg(window, window.getDecorView()).ppxfxbqfkf(z13);
    }

    public static void gxszxtbevo(Window window, boolean z13) {
        oipsdeybqn.iobyxmoadg(window, window.getDecorView()).wkgbmnqykc(z13);
    }

    public static void iobyxmoadg(Window window, boolean z13, Integer num, Integer num2) {
        boolean z14 = num == null || num.intValue() == 0;
        boolean z15 = num2 == null || num2.intValue() == 0;
        if (z14 || z15) {
            int iZoijcleaow = ia.iobyxmoadg.zoijcleaow(window.getContext(), R.attr.colorBackground, -16777216);
            if (z14) {
                num = Integer.valueOf(iZoijcleaow);
            }
            if (z15) {
                num2 = Integer.valueOf(iZoijcleaow);
            }
        }
        oipsdeybqn.zoijcleaow(window, !z13);
        int iPpxfxbqfkf = ppxfxbqfkf(window.getContext(), z13);
        int iZoijcleaow2 = zoijcleaow(window.getContext(), z13);
        window.setStatusBarColor(iPpxfxbqfkf);
        window.setNavigationBarColor(iZoijcleaow2);
        gxszxtbevo(window, wkgbmnqykc(iPpxfxbqfkf, ia.iobyxmoadg.nufgyqmvbu(num.intValue())));
        eablkybsjg(window, wkgbmnqykc(iZoijcleaow2, ia.iobyxmoadg.nufgyqmvbu(num2.intValue())));
    }

    private static int ppxfxbqfkf(Context context, boolean z13) {
        if (z13) {
            return 0;
        }
        return ia.iobyxmoadg.zoijcleaow(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean wkgbmnqykc(int i13, boolean z13) {
        return ia.iobyxmoadg.nufgyqmvbu(i13) || (i13 == 0 && z13);
    }

    private static int zoijcleaow(Context context, boolean z13) {
        if (z13 && Build.VERSION.SDK_INT < 27) {
            return j1.ppxfxbqfkf.gtknphoqwx(ia.iobyxmoadg.zoijcleaow(context, R.attr.navigationBarColor, -16777216), UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        if (z13) {
            return 0;
        }
        return ia.iobyxmoadg.zoijcleaow(context, R.attr.navigationBarColor, -16777216);
    }
}
