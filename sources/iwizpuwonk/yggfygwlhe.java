package iwizpuwonk;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f49834iobyxmoadg;

    public yggfygwlhe() {
        this.f49834iobyxmoadg = ((StillCaptureFlashStopRepeatingQuirk) androidx.camera.camera2.internal.compat.quirk.zoijcleaow.zoijcleaow(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    public boolean iobyxmoadg(List list, boolean z13) {
        if (this.f49834iobyxmoadg && z13) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
