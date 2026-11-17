package kcexrzcfyt;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* JADX INFO: loaded from: classes.dex */
public abstract class czzsidtyhn {
    public static CameraUnavailableException iobyxmoadg(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int iNufgyqmvbu = cameraAccessExceptionCompat.nufgyqmvbu();
        int i13 = 1;
        if (iNufgyqmvbu != 1) {
            i13 = 2;
            if (iNufgyqmvbu != 2) {
                i13 = 3;
                if (iNufgyqmvbu != 3) {
                    i13 = 4;
                    if (iNufgyqmvbu != 4) {
                        i13 = 5;
                        if (iNufgyqmvbu != 5) {
                            i13 = iNufgyqmvbu != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i13, cameraAccessExceptionCompat);
    }
}
