package iwizpuwonk;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import istkbnxepw.jztzpxfvev;

/* JADX INFO: loaded from: classes.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f49836iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f49837zoijcleaow;

    public zoijcleaow(jztzpxfvev jztzpxfvevVar) {
        this.f49836iobyxmoadg = jztzpxfvevVar.iobyxmoadg(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f49837zoijcleaow = androidx.camera.camera2.internal.compat.quirk.zoijcleaow.zoijcleaow(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    public int iobyxmoadg(int i13) {
        if ((this.f49836iobyxmoadg || this.f49837zoijcleaow) && i13 == 2) {
            return 1;
        }
        return i13;
    }
}
