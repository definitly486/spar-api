package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import istkbnxepw.vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements vipkmwdibw {
    private static boolean eablkybsjg() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    static boolean gxszxtbevo() {
        return eablkybsjg();
    }

    private Size[] wkgbmnqykc() {
        return new Size[]{new Size(1440, 1080), new Size(960, 720)};
    }

    public Size[] ppxfxbqfkf(int i13) {
        return (i13 == 34 && eablkybsjg()) ? wkgbmnqykc() : new Size[0];
    }
}
