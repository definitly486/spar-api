package androidx.camera.core.internal.compat.quirk;

import istkbnxepw.jhduphickx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    static List iobyxmoadg(jhduphickx jhduphickxVar) {
        ArrayList arrayList = new ArrayList();
        if (jhduphickxVar.iobyxmoadg(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.nufgyqmvbu())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (jhduphickxVar.iobyxmoadg(SurfaceOrderQuirk.class, SurfaceOrderQuirk.ppxfxbqfkf())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (jhduphickxVar.iobyxmoadg(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.ppxfxbqfkf())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (jhduphickxVar.iobyxmoadg(LowMemoryQuirk.class, LowMemoryQuirk.ppxfxbqfkf())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (jhduphickxVar.iobyxmoadg(LargeJpegImageQuirk.class, LargeJpegImageQuirk.gxszxtbevo())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (jhduphickxVar.iobyxmoadg(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.lqeggnwhkg())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        return arrayList;
    }
}
