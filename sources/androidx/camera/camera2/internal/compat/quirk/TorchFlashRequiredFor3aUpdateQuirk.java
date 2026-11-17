package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import istkbnxepw.vipkmwdibw;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import zdlpuopuiu.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final List f3649zoijcleaow = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pmvmpeiblj f3650iobyxmoadg;

    public TorchFlashRequiredFor3aUpdateQuirk(pmvmpeiblj pmvmpeibljVar) {
        this.f3650iobyxmoadg = pmvmpeibljVar;
    }

    private static boolean eablkybsjg(pmvmpeiblj pmvmpeibljVar) {
        return ((Integer) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    static boolean gxszxtbevo(pmvmpeiblj pmvmpeibljVar) {
        return ppxfxbqfkf(pmvmpeibljVar);
    }

    private static boolean ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        return wkgbmnqykc() && eablkybsjg(pmvmpeibljVar);
    }

    private static boolean wkgbmnqykc() {
        Iterator it = f3649zoijcleaow.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
