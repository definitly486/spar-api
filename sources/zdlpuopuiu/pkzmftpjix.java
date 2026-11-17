package zdlpuopuiu;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
abstract class pkzmftpjix implements zynmafqrjb.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final CameraDevice f129741iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final Object f129742zoijcleaow;

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Handler f129743iobyxmoadg;

        iobyxmoadg(Handler handler) {
            this.f129743iobyxmoadg = handler;
        }
    }

    pkzmftpjix(CameraDevice cameraDevice, Object obj) {
        this.f129741iobyxmoadg = (CameraDevice) u1.nufgyqmvbu.gxszxtbevo(cameraDevice);
        this.f129742zoijcleaow = obj;
    }

    static void ppxfxbqfkf(CameraDevice cameraDevice, yggfygwlhe.vdvldrhtss vdvldrhtssVar) {
        u1.nufgyqmvbu.gxszxtbevo(cameraDevice);
        u1.nufgyqmvbu.gxszxtbevo(vdvldrhtssVar);
        u1.nufgyqmvbu.gxszxtbevo(vdvldrhtssVar.eablkybsjg());
        List listPpxfxbqfkf = vdvldrhtssVar.ppxfxbqfkf();
        if (listPpxfxbqfkf == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (vdvldrhtssVar.iobyxmoadg() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        zoijcleaow(cameraDevice, listPpxfxbqfkf);
    }

    static List wkgbmnqykc(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((yggfygwlhe.gtknphoqwx) it.next()).wkgbmnqykc());
        }
        return arrayList;
    }

    private static void zoijcleaow(CameraDevice cameraDevice, List list) {
        String id2 = cameraDevice.getId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strPpxfxbqfkf = ((yggfygwlhe.gtknphoqwx) it.next()).ppxfxbqfkf();
            if (strPpxfxbqfkf != null && !strPpxfxbqfkf.isEmpty()) {
                sopmlzcsov.draadjrbmk("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + strPpxfxbqfkf + ". Ignoring.");
            }
        }
    }
}
