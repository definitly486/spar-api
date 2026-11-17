package iwizpuwonk;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f49812iobyxmoadg;

    public esjtqupxsv() {
        this.f49812iobyxmoadg = androidx.camera.camera2.internal.compat.quirk.zoijcleaow.zoijcleaow(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public androidx.camera.core.impl.dxjokdxxww iobyxmoadg(androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar) {
        androidx.camera.core.impl.dxjokdxxww.iobyxmoadg iobyxmoadgVar = new androidx.camera.core.impl.dxjokdxxww.iobyxmoadg();
        iobyxmoadgVar.kcexrzcfyt(dxjokdxxwwVar.gtknphoqwx());
        Iterator it = dxjokdxxwwVar.dxjokdxxww().iterator();
        while (it.hasNext()) {
            iobyxmoadgVar.gxszxtbevo((DeferrableSurface) it.next());
        }
        iobyxmoadgVar.eablkybsjg(dxjokdxxwwVar.lqeggnwhkg());
        oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg = new oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg();
        c1637iobyxmoadg.gxszxtbevo(CaptureRequest.FLASH_MODE, 0);
        iobyxmoadgVar.eablkybsjg(c1637iobyxmoadg.zoijcleaow());
        return iobyxmoadgVar.nufgyqmvbu();
    }

    public boolean zoijcleaow(List list, boolean z13) {
        if (!this.f49812iobyxmoadg || !z13) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
