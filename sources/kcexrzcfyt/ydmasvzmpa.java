package kcexrzcfyt;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class ydmasvzmpa {
    static CameraCaptureSession.CaptureCallback iobyxmoadg(istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        zoijcleaow(nufgyqmvbuVar, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : mbcevpiqjq.iobyxmoadg(arrayList);
    }

    static void zoijcleaow(istkbnxepw.nufgyqmvbu nufgyqmvbuVar, List list) {
        if (nufgyqmvbuVar instanceof istkbnxepw.dxjokdxxww.iobyxmoadg) {
            Iterator it = ((istkbnxepw.dxjokdxxww.iobyxmoadg) nufgyqmvbuVar).gxszxtbevo().iterator();
            while (it.hasNext()) {
                zoijcleaow((istkbnxepw.nufgyqmvbu) it.next(), list);
            }
        } else if (nufgyqmvbuVar instanceof yfnezrywwk) {
            list.add(((yfnezrywwk) nufgyqmvbuVar).lqeggnwhkg());
        } else {
            list.add(new uwvvkdfqfp(nufgyqmvbuVar));
        }
    }
}
