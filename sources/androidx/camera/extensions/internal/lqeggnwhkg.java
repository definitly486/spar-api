package androidx.camera.extensions.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import istkbnxepw.jyumaefscl;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {

    private static class iobyxmoadg {
        static Set iobyxmoadg(CameraCharacteristics cameraCharacteristics) {
            try {
                return cameraCharacteristics.getPhysicalCameraIds();
            } catch (Exception unused) {
                return Collections.emptySet();
            }
        }
    }

    public static Map iobyxmoadg(jyumaefscl jyumaefsclVar) {
        Set<String> setIobyxmoadg;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strZoijcleaow = jyumaefsclVar.zoijcleaow();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) jyumaefsclVar.eablkybsjg();
        linkedHashMap.put(strZoijcleaow, cameraCharacteristics);
        if (Build.VERSION.SDK_INT < 28 || (setIobyxmoadg = iobyxmoadg.iobyxmoadg(cameraCharacteristics)) == null) {
            return linkedHashMap;
        }
        for (String str : setIobyxmoadg) {
            if (!Objects.equals(str, strZoijcleaow)) {
                linkedHashMap.put(str, (CameraCharacteristics) jyumaefsclVar.ojitshcjhn(str));
            }
        }
        return linkedHashMap;
    }
}
