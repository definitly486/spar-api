package iwizpuwonk;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import istkbnxepw.jztzpxfvev;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Range f49815iobyxmoadg;

    public iobyxmoadg(jztzpxfvev jztzpxfvevVar) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) jztzpxfvevVar.zoijcleaow(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f49815iobyxmoadg = null;
        } else {
            this.f49815iobyxmoadg = aeFpsRangeLegacyQuirk.wkgbmnqykc();
        }
    }

    public void iobyxmoadg(oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg) {
        Range range = this.f49815iobyxmoadg;
        if (range != null) {
            c1637iobyxmoadg.lqeggnwhkg(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range, androidx.camera.core.impl.btonecajqb.ppxfxbqfkf.REQUIRED);
        }
    }
}
