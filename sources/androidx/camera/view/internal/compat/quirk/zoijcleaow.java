package androidx.camera.view.internal.compat.quirk;

import istkbnxepw.jhduphickx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    static List iobyxmoadg(jhduphickx jhduphickxVar) {
        ArrayList arrayList = new ArrayList();
        if (jhduphickxVar.iobyxmoadg(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.gxszxtbevo())) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (jhduphickxVar.iobyxmoadg(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.ppxfxbqfkf())) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
