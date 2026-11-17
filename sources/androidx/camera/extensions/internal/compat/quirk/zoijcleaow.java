package androidx.camera.extensions.internal.compat.quirk;

import istkbnxepw.jhduphickx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    static List iobyxmoadg(jhduphickx jhduphickxVar) {
        ArrayList arrayList = new ArrayList();
        if (jhduphickxVar.iobyxmoadg(ExtensionDisabledQuirk.class, ExtensionDisabledQuirk.lqeggnwhkg())) {
            arrayList.add(new ExtensionDisabledQuirk());
        }
        if (jhduphickxVar.iobyxmoadg(CrashWhenOnDisableTooSoon.class, CrashWhenOnDisableTooSoon.ppxfxbqfkf())) {
            arrayList.add(new CrashWhenOnDisableTooSoon());
        }
        if (jhduphickxVar.iobyxmoadg(GetAvailableKeysNeedsOnInit.class, GetAvailableKeysNeedsOnInit.ppxfxbqfkf())) {
            arrayList.add(new GetAvailableKeysNeedsOnInit());
        }
        if (jhduphickxVar.iobyxmoadg(CaptureOutputSurfaceOccupiedQuirk.class, CaptureOutputSurfaceOccupiedQuirk.ppxfxbqfkf())) {
            arrayList.add(new CaptureOutputSurfaceOccupiedQuirk());
        }
        return arrayList;
    }
}
