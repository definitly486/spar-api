package kcexrzcfyt;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class sopmlzcsov {

    static class iobyxmoadg {
        static CaptureRequest.Builder iobyxmoadg(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    public static CaptureRequest eablkybsjg(androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar, CameraDevice cameraDevice, Map map, boolean z13, iwizpuwonk.cqumvgiudr cqumvgiudrVar) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List listLqeggnwhkg = lqeggnwhkg(dxjokdxxwwVar.dxjokdxxww(), map);
        if (listLqeggnwhkg.isEmpty()) {
            return null;
        }
        istkbnxepw.ojitshcjhn ojitshcjhnVarWkgbmnqykc = dxjokdxxwwVar.wkgbmnqykc();
        if (dxjokdxxwwVar.gtknphoqwx() == 5 && ojitshcjhnVarWkgbmnqykc != null && (ojitshcjhnVarWkgbmnqykc.wkgbmnqykc() instanceof TotalCaptureResult)) {
            lereixgezr.sopmlzcsov.iobyxmoadg("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = iobyxmoadg.iobyxmoadg(cameraDevice, (TotalCaptureResult) ojitshcjhnVarWkgbmnqykc.wkgbmnqykc());
        } else {
            lereixgezr.sopmlzcsov.iobyxmoadg("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (dxjokdxxwwVar.gtknphoqwx() == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z13 ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(dxjokdxxwwVar.gtknphoqwx());
            }
        }
        ppxfxbqfkf(builderCreateCaptureRequest, dxjokdxxwwVar.gtknphoqwx(), cqumvgiudrVar);
        iobyxmoadg(dxjokdxxwwVar, builderCreateCaptureRequest);
        wkgbmnqykc(dxjokdxxwwVar, builderCreateCaptureRequest);
        androidx.camera.core.impl.btonecajqb btonecajqbVarLqeggnwhkg = dxjokdxxwwVar.lqeggnwhkg();
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar = androidx.camera.core.impl.dxjokdxxww.f3755dxjokdxxww;
        if (btonecajqbVarLqeggnwhkg.zoijcleaow(iobyxmoadgVar)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) dxjokdxxwwVar.lqeggnwhkg().iobyxmoadg(iobyxmoadgVar));
        }
        androidx.camera.core.impl.btonecajqb btonecajqbVarLqeggnwhkg2 = dxjokdxxwwVar.lqeggnwhkg();
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar2 = androidx.camera.core.impl.dxjokdxxww.f3754btonecajqb;
        if (btonecajqbVarLqeggnwhkg2.zoijcleaow(iobyxmoadgVar2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) dxjokdxxwwVar.lqeggnwhkg().iobyxmoadg(iobyxmoadgVar2)).byteValue()));
        }
        zoijcleaow(builderCreateCaptureRequest, dxjokdxxwwVar.lqeggnwhkg());
        Iterator it = listLqeggnwhkg.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it.next());
        }
        builderCreateCaptureRequest.setTag(dxjokdxxwwVar.btonecajqb());
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest gxszxtbevo(androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar, CameraDevice cameraDevice, iwizpuwonk.cqumvgiudr cqumvgiudrVar) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        lereixgezr.sopmlzcsov.iobyxmoadg("Camera2CaptureRequestBuilder", "template type = " + dxjokdxxwwVar.gtknphoqwx());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(dxjokdxxwwVar.gtknphoqwx());
        ppxfxbqfkf(builderCreateCaptureRequest, dxjokdxxwwVar.gtknphoqwx(), cqumvgiudrVar);
        zoijcleaow(builderCreateCaptureRequest, dxjokdxxwwVar.lqeggnwhkg());
        return builderCreateCaptureRequest.build();
    }

    private static void iobyxmoadg(androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar, CaptureRequest.Builder builder) {
        if (dxjokdxxwwVar.eablkybsjg().equals(androidx.camera.core.impl.iwizpuwonk.f3803iobyxmoadg)) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, dxjokdxxwwVar.eablkybsjg());
    }

    private static List lqeggnwhkg(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((DeferrableSurface) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }

    private static void ppxfxbqfkf(CaptureRequest.Builder builder, int i13, iwizpuwonk.cqumvgiudr cqumvgiudrVar) {
        for (Map.Entry entry : cqumvgiudrVar.iobyxmoadg(i13).entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    static void wkgbmnqykc(androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar, CaptureRequest.Builder builder) {
        if (dxjokdxxwwVar.nufgyqmvbu() == 1 || dxjokdxxwwVar.draadjrbmk() == 1) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (dxjokdxxwwVar.nufgyqmvbu() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (dxjokdxxwwVar.draadjrbmk() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
    }

    private static void zoijcleaow(CaptureRequest.Builder builder, androidx.camera.core.impl.btonecajqb btonecajqbVar) {
        esjtqupxsv.btonecajqb btonecajqbVarPpxfxbqfkf = esjtqupxsv.btonecajqb.iobyxmoadg.eablkybsjg(btonecajqbVar).ppxfxbqfkf();
        for (androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar : btonecajqbVarPpxfxbqfkf.eablkybsjg()) {
            CaptureRequest.Key key = (CaptureRequest.Key) iobyxmoadgVar.wkgbmnqykc();
            try {
                builder.set(key, btonecajqbVarPpxfxbqfkf.iobyxmoadg(iobyxmoadgVar));
            } catch (IllegalArgumentException unused) {
                lereixgezr.sopmlzcsov.ppxfxbqfkf("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }
}
