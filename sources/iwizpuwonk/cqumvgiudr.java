package iwizpuwonk;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import istkbnxepw.jztzpxfvev;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f49805iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f49806zoijcleaow;

    public cqumvgiudr(jztzpxfvev jztzpxfvevVar) {
        this.f49805iobyxmoadg = CaptureIntentPreviewQuirk.iobyxmoadg(jztzpxfvevVar);
        this.f49806zoijcleaow = jztzpxfvevVar.iobyxmoadg(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    public Map iobyxmoadg(int i13) {
        if (i13 == 3 && this.f49805iobyxmoadg) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return Collections.unmodifiableMap(map);
        }
        if (i13 != 4 || !this.f49806zoijcleaow) {
            return Collections.emptyMap();
        }
        HashMap map2 = new HashMap();
        map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return Collections.unmodifiableMap(map2);
    }
}
