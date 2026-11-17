package iwizpuwonk;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final RepeatingStreamConstraintForVideoRecordingQuirk f49818iobyxmoadg = (RepeatingStreamConstraintForVideoRecordingQuirk) androidx.camera.camera2.internal.compat.quirk.zoijcleaow.zoijcleaow(RepeatingStreamConstraintForVideoRecordingQuirk.class);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Size f49817zoijcleaow = new Size(320, 240);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Comparator f49816ppxfxbqfkf = new cdpycssgdh.wkgbmnqykc();

    public Size[] iobyxmoadg(Size[] sizeArr) {
        if (this.f49818iobyxmoadg == null || !RepeatingStreamConstraintForVideoRecordingQuirk.ppxfxbqfkf()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f49816ppxfxbqfkf.compare(size, f49817zoijcleaow) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
