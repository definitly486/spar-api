package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {
    public static boolean eablkybsjg() {
        return iobyxmoadg().equals("samsung");
    }

    private static String iobyxmoadg() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean ppxfxbqfkf() {
        return iobyxmoadg().equals("lge");
    }

    public static boolean wkgbmnqykc() {
        return iobyxmoadg().equals("meizu");
    }

    public static boolean zoijcleaow() {
        return ppxfxbqfkf() || eablkybsjg();
    }
}
