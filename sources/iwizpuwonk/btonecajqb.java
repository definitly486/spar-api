package iwizpuwonk;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* JADX INFO: loaded from: classes.dex */
public class btonecajqb {
    public void iobyxmoadg(int i13, oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg) {
        if (((ImageCapturePixelHDRPlusQuirk) androidx.camera.camera2.internal.compat.quirk.zoijcleaow.zoijcleaow(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i13 == 0) {
            c1637iobyxmoadg.gxszxtbevo(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i13 != 1) {
                return;
            }
            c1637iobyxmoadg.gxszxtbevo(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}
