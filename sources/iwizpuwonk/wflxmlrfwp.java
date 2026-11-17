package iwizpuwonk;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f49830iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eablkybsjg f49831ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ExtraSupportedOutputSizeQuirk f49832zoijcleaow = (ExtraSupportedOutputSizeQuirk) androidx.camera.camera2.internal.compat.quirk.zoijcleaow.zoijcleaow(ExtraSupportedOutputSizeQuirk.class);

    public wflxmlrfwp(String str) {
        this.f49830iobyxmoadg = str;
        this.f49831ppxfxbqfkf = new eablkybsjg(str);
    }

    private void iobyxmoadg(List list, int i13) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f49832zoijcleaow;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] sizeArrPpxfxbqfkf = extraSupportedOutputSizeQuirk.ppxfxbqfkf(i13);
        if (sizeArrPpxfxbqfkf.length > 0) {
            list.addAll(Arrays.asList(sizeArrPpxfxbqfkf));
        }
    }

    private void ppxfxbqfkf(List list, int i13) {
        List listIobyxmoadg = this.f49831ppxfxbqfkf.iobyxmoadg(i13);
        if (listIobyxmoadg.isEmpty()) {
            return;
        }
        list.removeAll(listIobyxmoadg);
    }

    public Size[] zoijcleaow(Size[] sizeArr, int i13) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        iobyxmoadg(arrayList, i13);
        ppxfxbqfkf(arrayList, i13);
        if (arrayList.isEmpty()) {
            sopmlzcsov.draadjrbmk("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
