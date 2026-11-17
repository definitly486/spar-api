package kcexrzcfyt;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class metgxyhuhe {
    private static String iobyxmoadg(zdlpuopuiu.cllcsxoeiz cllcsxoeizVar, Integer num, List list) {
        if (num == null || !list.contains(CommonUrlParts.Values.FALSE_INTEGER) || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) cllcsxoeizVar.ppxfxbqfkf(CommonUrlParts.Values.FALSE_INTEGER).iobyxmoadg(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) cllcsxoeizVar.ppxfxbqfkf("1").iobyxmoadg(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
        return null;
    }

    static List zoijcleaow(jyumaefscl jyumaefsclVar, lereixgezr.rgvfuqvkyq rgvfuqvkyqVar) throws InitializationException {
        String strIobyxmoadg;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> listAsList = Arrays.asList(jyumaefsclVar.ppxfxbqfkf().wkgbmnqykc());
            if (rgvfuqvkyqVar == null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return arrayList;
            }
            try {
                strIobyxmoadg = iobyxmoadg(jyumaefsclVar.ppxfxbqfkf(), rgvfuqvkyqVar.wkgbmnqykc(), listAsList);
            } catch (IllegalStateException unused) {
                strIobyxmoadg = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : listAsList) {
                if (!str.equals(strIobyxmoadg)) {
                    arrayList2.add(jyumaefsclVar.gxszxtbevo(str));
                }
            }
            Iterator it2 = rgvfuqvkyqVar.zoijcleaow(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList.add(((istkbnxepw.jyumaefscl) ((lereixgezr.agtfadlqog) it2.next())).zoijcleaow());
            }
            return arrayList;
        } catch (CameraAccessExceptionCompat e13) {
            throw new InitializationException(czzsidtyhn.iobyxmoadg(e13));
        } catch (CameraUnavailableException e14) {
            throw new InitializationException(e14);
        }
    }
}
