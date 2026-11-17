package kcexrzcfyt;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class xrmfcynszj {
    public static boolean iobyxmoadg(zdlpuopuiu.cllcsxoeiz cllcsxoeizVar, String str) throws InitializationException {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) cllcsxoeizVar.ppxfxbqfkf(str).iobyxmoadg(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i13 : iArr) {
                    if (i13 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e13) {
            throw new InitializationException(czzsidtyhn.iobyxmoadg(e13));
        }
    }
}
